# DCompose Navigator Library

DCompose Navigator is a lightweight Android library designed to simplify navigation in Jetpack Compose applications. It provides a convenient way to handle navigation without or with arguments carrying data. The library is built on top of the Jetpack Compose Navigation library, offering a clean and concise API for navigation operations.

## Features

- **NavigationProvider Composable:** A Composable function that initializes a `NavController` and provides it to the content Composable for handling navigation.

- **navigateTo Function:** A function for navigating to a specified route with optional data. It allows you to pass data to the destination route.

## Usage

### Gradle Integration

To integrate the DCompose Navigator library into your project using Gradle, follow these steps:

**Step 1:** Add the JitPack repository to your project's build file. Add the following code at the end of the repositories block in the root `build.gradle` file:

```gradle
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}
```
**Step 2:** Add the library dependency. Add the following code to the dependencies block in your app module's build.gradle file:

```gradle
dependencies {
    implementation 'com.github.deonwaju:dcompose-navigator:1.0.0-alpha'
}
```

## Kotlin DSL Integration
To integrate the DCompose Navigator library into your project using Kotlin DSL, follow these steps:

**Step 1:** Add the JitPack repository to your project's build file. Add the following code at the end of the repositories block in the root build.gradle.kts file:

Kotlin DSL:
```
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven("https://jitpack.io")
    }
}
```
**Step 2:** Add the library dependency. Add the following code to the dependencies block in your app module's build.gradle.kts file:

``` gradle
dependencies {
    implementation("com.github.deonwaju:dcompose-navigator:1.0.0-alpha")
}
```

## Usage
1. NavigationProvider Composable
Use the NavigationProvider Composable to initialize a NavController:

```kotlin
@Composable
fun MyComposable() {
    NavigationProvider { navController ->
        // Your Composable content with access to the NavController
    }
}
```

2. navigateTo Function
Use the navigateTo function to navigate to a specified route with optional data:

```kotlin
fun navigateToExample(navController: NavController) {
    val data = // Your optional data
    navigateTo(navController, "key", "destinationRoute", data)
}
```

## Contribution
Contributions are welcome! If you have any ideas, improvements, or bug fixes, feel free to open an issue or submit a pull request.

## Contact

If you have any questions, concerns, or just want to say hi, you can reach out via email at [deonolarewaju@gmail.com](deonolarewaju@gmail.com) or through [GitHub Issues](https://github.com/deonwaju/dcompose-navigator/issues).

Your feedback is highly appreciated!

## License

This library is distributed under the **MIT License**. See the [LICENSE](./LICENSE) file for more information.
