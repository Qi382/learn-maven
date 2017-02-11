# learn-maven
学习maven的进阶使用


## release plugin

如下配置了release插件

```xml
   <scm>
            <connection>scm:git:git@github.com:davidATJ/learn-maven.git</connection>
            <tag>HEAD</tag>
   </scm>

   <build>
        <plugins>
            <plugin>
                <artifactId>maven-release-plugin</artifactId>
                <configuration>
                    <goals>install</goals> <!-- release:perform 时执行的goal 空格分割 -->
                    <releaseProfiles>pro</releaseProfiles> <!-- release:perform 时执行的profile 逗号分割-->
                    <scmCommentPrefix>自动release</scmCommentPrefix>
                </configuration>
            </plugin>
        </plugins>
    </build>
```

release有以下goal

*  release:clean Clean up after a release preparation.
*  release:prepare Prepare for a release in SCM.
*  release:prepare-with-pom Prepare for a release in SCM, and generate release POMs that record the fully resolved projects used.
*  release:rollback Rollback a previous release.
*  release:perform Perform a release from SCM.
*  release:stage Perform a release from SCM into a staging folder/repository.
*  release:branch Create a branch of the current project with all versions updated.
*  release:update-versions Update the versions in the POM(s).

prepare 会执行一个版本号的替换工作,打tag等工作 , 下面的代码会指定version


```shell
 mvn release:clean release:prepare -Dtag=david -DdevelopmentVersion=1.1-SNAPSHOT -DreleaseVersion=1.0
```

perform 会执行goals