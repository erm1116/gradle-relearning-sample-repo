# 「Gradleまなびなおし」サンプルリポジトリ

2024/07/08 After Kotlin Fest 2024 LT Night で発表したLTのサンプルリポジトリです

- Speaker Deck: [Gradleまなびなおし](https://speakerdeck.com/sansantech/sansan-20240708-4)
- Connpass: [After Kotlin Fest 2024 LT Night](https://sansan.connpass.com/event/320810/)


```shell
.
├── app
│  ├── build.gradle.kts
│  └── src
│     └── main
│        ├── kotlin
│        │  └── com
│        │     └── example
│        │        ├── Application.kt
│        │        └── plugins
│        │           └── Routing.kt
│        └── resources
│           └── logback.xml
├── build.gradle.kts
├── gradle
│  ├── libs.versions.toml
│  └── wrapper
│     ├── gradle-wrapper.jar
│     └── gradle-wrapper.properties
├── gradle.properties
├── gradlew
├── gradlew.bat
├── lib
│  ├── build.gradle.kts
│  └── src
│     └── main
│        └── kotlin
│           └── com
│              └── example
│                 └── Greet.kt
├── README.md
└── settings.gradle.kts
```

# Usage
- `./gradlew run`: Run Application Server
- `./gradlew build`: Build Application
