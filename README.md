
Stock Portfolio Management Application


Table of Contents:
1. [Description]
2. [Technologies Used]
3. [Requirements]
4. [Installation and Usage]
Description:
note: ignore finance.db file for now

The application targets stock investments and basically helps users register, log in and manage their stock portfolios by adding or removing stocks. Their data is thereon stored in an SQLite database and features an appealing GUI for operations. The project even contains examples for such well-known stock names as Google (GOOGL), Microsoft (MSFT) and Amazon (AMZN) etc..

Technologies Used:
- Programming Language: Java
- Database: SQLite
- GUI Framework: Java Swing
- Library: SQLite JDBC Driver (`sqlite-jdbc-3.47.1.0.jar`)
Requirements:
To run this project, ensure you have the following installed:
- Java Development Kit (JDK): Version 8 or later
- SQLite Database Driver: Included in the project (`sqlite-jdbc-3.47.1.0.jar`)
- A text editor, Java IDE (e.g., IntelliJ IDEA, Eclipse), or terminal for running Java programs.

Installation and Usage:

Installation
1. Clone or Download the Project:
   - Extract the provided `.zip` file to your working directory, or download all .java files. (to extract PaperStockApp3.zip click on it and then click show raw)

2. Compile the Code:
   - Open a terminal and navigate to the `src` directory containing the `.java` files.
   - Compile the source files using the following command:
     ```bash
     javac -cp sqlite-jdbc-3.47.1.0.jar *.java
     ```
     or use "javac *.java " and after compiling use "java MainApp".

3. Database Setup:

Additionally, this application has been designed to use a preconfigured ‘finance.db’ database file which is provided with the project folders and therefore no additional installation or configuration is necessary.
Usage:
1. Run the Application:
   - Execute the main class using the following command:
     ```bash
     java -cp .:sqlite-jdbc-3.47.1.0.jar MainApp
     ```
2. Application Walkthrough:
Welcome Page: In its most basic form, the application contains a welcome page that allows users to log in or creates an account.
Login: Selectable via the button in an application, users can provide their credentials and sign in to their account.
Register: To create an account just click the register button, available to new users.
Portfolio Management: Post a successful login you can add, remove and view a variety of stocks that you hold in your portfolio.
3. Supported Stocks:
   - The following stocks are available for management:
- Amazon: AMZN
- Apple: AAPL
- Google: GOOGL
- Microsoft: MSFT
- Meta Platforms: META
- Tesla: TSLA
- Netflix: NFLX
- NVIDIA: NVDA
- Intel: INTC
- Advanced Micro Devices: AMD
- Spotify: SPOT
- PayPal: PYPL
- Alibaba: BABA
- Block: SQ
- Salesforce: CRM
- Walt Disney: DIS
- Oracle: ORCL
- Adobe: ADBE
- IBM: IBM
- Twitter: TWTR
- Visa: V
- Mastercard: MA

--------------------------------------------
