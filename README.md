Steps to run -
1. Download and install Android Studio
2. Click on "Code" which you will see on the top of this project and download the zip file for this project.
3. Extract the zip file into relevant directory.
4. Open Android Studio and click on "Open" button at the top right corner.
5. Go to the specific directory where you have extracted the zip file before.
6. Click on "Okay" to open it. Let the Gradle script finish it's execution.
7. You are all Ready to Go!

About the Product:

Data collection platform designed for Android devices to collect various types of data from users and can be used by customers in 50+ countries in over 250 organizations and has powered data collection for over 11 million responses.

Purpose:

Customers use this platform to power their most critical activities — from governments collecting census data to small business owners managing their daily inventory, to storing and maintaining customer details. These data can then be used for research, analysis, marketing, or any other purpose that requires gathering and storing data.

Use Cases:

1. Governments recording census data that provides basic statistics on state of human resources, demography, culture and economic structure at local, regional and national level. Through our data collection platform, all data will be stored electronically and the government will save up on substantial amount of physical storage space along with reducing the environmental burden by saving the trees required for paper manufacturing industries.
2. Business owners can manage customer data that helps them brand narrow-in on their ideal target audience with their marketing and sales tactics. With customer data on-hand, they can build more impactful marketing campaigns and create opportunities for upselling and cross-selling.
3. A very common need for organizations is wanting all their data onto Google Sheets, wherein they could connect their CRM, and also generate graphs and charts offered by Sheets out of the box. In such cases, each response to the form becomes a row in the sheet, and questions in the form become columns.

Design and Implementation:

Different modules of our project -
1. User Registration – Authorisation and Authentication are an important aspect of any platform for maintaining security for all its user-base. It indicates the trust of our users in our platform. I have used Firebase Authentication to sign in a user using their email addresses and passwords to manage their accounts safely and securely. Also taken user’s phone number to send and SMS to the customer whose details are collected in the response as soon as the ingestion was complete reliably. The content of the SMS consists of details of the customer, which were a part of the answers in the response. This customer is supposed to use this as a “receipt” for them having participated in the exercise.
2. Select the type of activity for which the user wants to fill up the form. It may range from collecting government data to managers managing daily inventory.
3. Users/Customers filling out their details as responses to predefined sets of questions in a form. It can involve governments asking personal details to maintain census records for the country, businesses taking customer feedbacks and reviews, zoo monitoring rare wildlife species, research agency collecting income and saving information etc.
4. Storing all the responses of user onto Google Sheet, wherein organizations can connect their CRM and generate graphs and charts to measure data according their needs and use cases. Data is transferred from user device to Google Sheet with the help of Apps Script which is a rapid application development platform that makes it fast and easy to create business applications that integrate with Google Workspace. I have created the API in modern JavaScript that allows us to programmatically create and modify data inside Google Sheet and integrate it with android device.
5. After the form is successfully submitted and data is collected, user is notified with a SMS message indicating the ingestion is completed reliably. It acts as a “receipt” for them having participated in the exercise.

Optimizations for Android App:

To improve the performance of our app, several factors need to be taken under consideration -
1. Latency and Benchmarking: - Benchmarking is a way to easily measure, inspect and monitor the performance of our app. We can regularly run benchmarks to analyse and debug performance problems and help ensure that we don’t introduce regressions in recent changes. Android offers two benchmarking libraries and approaches for analysing and testing different kinds of situations in our app: Macrobenchmark and Microbenchmark. We can also use Baseline Profiles to make all user interactions —such as app startup, navigating between screens, or scrolling through content—smoother from the first time they run. By increasing the speed and responsiveness of an app, Baseline Profiles can lead to more daily active users and a higher average return visit rate.
2. Setting up Logs:- The Logcat window in Android Studio helps us debug our app by displaying logs from our device in real time—for example, messages that we added to our app with the Log class, messages from services that run on Android, or system messages, such as when a garbage collection occurs. When an app throws an exception, Logcat shows a message followed by the associated stack trace containing links to the line of code.
3. Troubleshooting Performance issues:- App performance issues can be difficult to track down. System Trace is a powerful tool in Android Studio that can help us understand how our app’s code interacts with system resources.
4. Scalability:- To make android app scalable, we use 2 libraries namely – i. SDP - An android lib that provides a new size unit - sdp (scalable dp). This size unit scales with the screen size. It can help Android developers with supporting multiple screens. ii. SSP - An android lib that provides a new size unit - ssp (scalable sp). This size unit scales with the screen size based on the sp size unit (for texts). It can help Android developers with supporting multiple screens.
Github Link for SDP Libraray - https://github.com/intuit/sdp
Github Link for SSP Libraray - https://github.com/intuit/ssp

Limitations on third party like Google sheets: 

Google Spreadsheets are extremely powerful, but they do have some limitations:-  Up to 10 million cells for spreadsheets that are created in or converted to Google Sheets  40,000 new rows at a time  Maximum number of columns of 18,278 columns  Number of Tabs: 200 sheets per workbook  GoogleFinance formulas: 1,000 GoogleFinance formulas  ImportRange formulas: 50 cross-workbook reference formulas  ImportData, ImportHtml, ImportFeed, or ImportXml formulas: 50 functions for external data  Maximum string length is 50,000 characters  Sheets API has per-minute quotas, and they're refilled every minute. For example, there's a read request limit of 300 per minute per project.
