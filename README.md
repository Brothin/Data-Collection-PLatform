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

Google Spreadsheets are extremely powerful, but they do have some limitations:- 
1. Up to 10 million cells for spreadsheets that are created in or converted to Google Sheets
2. 40,000 new rows at a time
3. Maximum number of columns of 18,278 columns
4. Number of Tabs: 200 sheets per workbook
5. GoogleFinance formulas: 1,000 GoogleFinance formulas
6. ImportRange formulas: 50 cross-workbook reference formulas
7. ImportData, ImportHtml, ImportFeed, or ImportXml formulas: 50 functions for external data
8. Maximum string length is 50,000 characters
9. Sheets API has per-minute quotas, and they're refilled every minute. For example, there's a read request limit of 300 per minute per project.

Various approaches to solve the problem and a pro/con analysis:

Collecting data is an integral part of a business’s success; it can enable the data’s accuracy, completeness, and relevance to your organization and the issue at hand. There are various Data Collection methods used in business analytics such as – 
1. Surveys – Surveys are physical or digital questionnaires that gather both qualitative and quantitative data from subjects. One situation in which we might conduct a survey is gathering attendee feedback after an event. This can provide a sense of what attendees enjoyed, what they wish was different, and areas in which we can improve or save money during our next event for a similar audience.
Pro-
While physical copies of surveys can be sent out to participants, online surveys present the opportunity for distribution at scale. They can also be inexpensive; running a survey can cost less if we create our own Data collection platform and record everyone’s response in it. If we wish to target a specific group of people, partnering with a market research firm to get the survey in front of that demographic may be worth the money.
Con-
To store such a huge amount of data, we need sufficient amount of space in a database and there can be various issues related to scaling big data systems, processing of useful information from raw information, security and data quality issues. Although these can be handled through trending technologies like Hadoop Ecosystem, Apache Spark, NoSQL Databases, Predictive Analysis and Prescriptive Analysis.
2. Transactional Tracking – Each time customers make a purchase, tracking that data allow us to make decisions about targeted marketing efforts and understand our customer base better. Often, e-commerce and point-of-sale platforms allow us to store data as soon as it’s generated, making this a seamless data collection method that can pay off in the form of customer insights.
Pro-
One distinct importance of a Transaction Processing System (TPS) is its ability to simultaneously process several transactions. It keeps a stable database and reduces risk of loss of user information in the occurrence of terminal or network failure. The TPS is also able to effectively recover from operating system failure and also handle system failures depending on what stage the transaction was in when the system failure occurred and it can also process large amount of data in real time or batches.
Con-
TPS must be designed to exclusively fit the business/Organization needs. So it may be difficult to solve our problem in such a way that each new use case can just be “plugged in” and does not need to overhaul on the backend. It requires a lot of staff working in groups to keep up inventory and also Requests may
overload system that may lead to crashing of websites and loss of information in real time.
3. Forms - A very common need for organizations is wanting all their data onto Google Sheets, wherein they could connect their CRM, and also generate graphs and charts offered by Sheets out of the box. In such cases, each response to the form becomes a row in the sheet, and questions in the form become columns.
Pro-
The success of our project does not end at getting massive form submissions back but actually at how we handle and make use of that data. Precious data entry forms can turn into a valued business asset only if we can easily organize it, analyze it, share it, and act upon it. And if time is of the essence, then we want a software that speeds up the process. At that time Google Spreadsheet comes into picture which offers a multitude of benefits such as accurate data, saving time and avoiding manual error, data integrity and easy to use.
Con-
Along with the great benefits Google Spreadsheets offer, there are also few limitations to it. Up to 10 million cells for spreadsheets can only be created in or converted to Google Sheets including 40,000 new rows at a time and 18,278 maximum number of columns and 200 sheets per workbook number of tabs. Also the Sheets API that we have used in our project has per-minute quotas.

Conclusion -
As we now have various techniques to create and take user data in the form of information, our focus narrows down to finding the most efficient tool to conduct these. We have made use of Mobile Surveys that take advantage of the increasing proliferation of mobile technology. Mobile collection surveys rely on mobile devices like tablets or smartphones to conduct surveys via SMS or mobile apps. To store the data, we have used Google Sheets and its API which offers a wide range of benefits from storing data efficiently and reliably to making it scalable taking millions of responses across hundreds of forms for an organisation.
