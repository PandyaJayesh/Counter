# Counter App

A simple Android counter app using **Kotlin** and **Fragments** to demonstrate UI updates, state persistence, and fragment-based architecture.

## Features
- Increment, decrement, and reset counter
- Saves counter value using **SharedPreferences**
- Uses **fragments** for better modularity

## Screenshots
![Counter App Screenshot](https://via.placeholder.com/400)

## Installation

Download *.apk* file from  ***app->build->outputs->apk->debug->app-debug.apk*** 
1. Open in **Android Studio**
2. Build and run on an **Android device/emulator**

## File Structure
```plaintext
app/
│── MainActivity.kt
│── fragments/
│   ├── CounterFragment.kt
│   ├── HistoryFragment.kt (Optional)
│── res/layout/
│   ├── activity_main.xml
│   ├── fragment_counter.xml
│   ├── fragment_history.xml (Optional)
```

## Dependencies
- **AndroidX Fragment**
- **Kotlin**

## License
This project is open-source under the [MIT License](LICENSE).

