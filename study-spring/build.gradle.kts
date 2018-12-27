plugins {
    java
}

group = "cn.lovelyy"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    testCompile("junit", "junit", "4.12")
    compile("org.springframework","spring-context", "5.1.3.RELEASE")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}