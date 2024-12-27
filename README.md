# SpaceX explorer

This project is designed for learning modern technologies using Kotlin Multiplatform. It leverages the SpaceX open API to display information about rockets, missions, and launches. The project incorporates Ktor, Compose Multiplatform, GraphQL, Koin, CocoaPods, and a modular architecture.

---

## Tech Stack 🛠

- **Kotlin Multiplatform**: Shared business logic and data handling across platforms.
- **Compose Multiplatform**: Declarative UI framework for Android and iOS apps.
- **Ktor**: Asynchronous HTTP client for networking.
- **GraphQL**: Integration with the SpaceX API for data retrieval.
- **Koin**: Dependency injection for managing components.
- **CocoaPods**: Integration with iOS for seamless native support.
- **Modular Architecture**: Logical project structure for scalability and maintainability.

---

## Project Structure 📂

The project is organized into modules for better separation of concerns:

```
spacexexplorer/
│
├── core/                   
│   ├── di/                 
│   ├── graphql/            
│   └── utils/              
│
├── feature/
│   ├── rockets/            
│   │   ├── data/           
│   │   ├── domain/         
│   │   └── presenter/      
│   │
│   ├── launches/           
│   │   ├── data/           
│   │   ├── domain/         
│   │   └── presenter/      
│   │
│   └── ...               
│
└── spacexexplorer/        
```

---

## Contribution 🤝

This project is open for experimentation. Feel free to fork the repository, make changes, and submit pull requests. Contributions and ideas are always welcome!


