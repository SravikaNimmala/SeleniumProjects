9/14/2016 - Day 5
#################

**SDLC**
	- Software/System Development Life Cycle
	- 6 phases of SDLC
		1. Initial
		2. Analysis
		3. Design
		4. Code
		5. Testing
		6. Delivery and Maintenance 
	- All these phases come with four different parts
		1. Responsibility
		2. Roles
		3. Process
		4. Outcome

**INITIAL**
	- Responsibility: Gathering requirements for the project.
	- Roles: BA: Business Analyst
			 EM: Engagement Manager
	- Process: A BA must be able to guide both customers and end users.
		- BA: 
			- To gather complete requirements
			- To study existing business model
			- Gap analysis(area where budget, time and effort is misused)
			- Highlight these gaps as new requirement
			- Documentation
		- EM:
			- New requirements to conversions
			- Money related talk
			- Price tag for the new requirement
	- Outcome: Everything is documented in a document called **BDD** [Business design document]. BDD is also called BRD, BRS, FRS. There is template to write this documentation. The document contains high level requirements which come from the customer.

**ANALYSIS**
	- Responsibility: Analysis is done by using BRD as input. We test to check the system requirements.
		- System Requirements: It is the combination of hardware and software requirements and functional and non functional requirements.
			- Hardware: Computer requirements.
			- Functional: Functionality of an application.
			- Non functional: 
	- Roles: System Analyst(SA)
	- Process:
		- Study the requirements
		- Existing requirements
		- Feasibility study
		- To select the technology
		- To help PM in preparation of project plan
		- Collect all system requirements
		- Will be documented
	- Outcome: SA will keep a System Requirement Specification(SRS) document that documents the process.

**DESIGN**
	- Responsibility: SRS is used as the input. The main responsibility is to create the "blue print" for the project development. It is the plan for the construction of the project.
	- Roles:
		- CA: Chief Architect
		- TL: Technical Lead
	- Process: Design process is implemented in 2 levels.
		1. High Level Design(HLD): Process in which a single project is divided into number of modules(subset).  This is always done by CA.
		2. Low Level Design (LLD): Process in which a module are divided into sub modules. This is always done by TL under QL(Quality Lead).
	- Outcome: Technical Design Document(TDD)
		- The TDD contains the following:
			- High Level Design information
			- Low Level Design information
			- Pictorial representation: A UML is used to design the diagrams.
			- Class Diagram: What classes will be used
			- Object Diagram: Instance of class 

**CODING**
	- Responsibility: To develop the programs/  source code. TDD is used as input.
	- Roles: Programmer/ Developer.
	- Process:	
		-Consistency: If it is missing in the codde then the client won't accept the code. Format must be the same in every developer's code.
		- Dependency: Code written by one programmer must be able to be understandable by other programmers. If the understand ability is lost then the maintainability is lost. Maintainability can be related to addition of a feature or a modification.
		- Set of guidelines must be provided to the developer to ensure consistency, understand ability and maintainability of code. This is called as coding standards.
	- Outcome: Source Code Document (SCD)

**TESTING**
	- Responsibility: 
		- SCD is not used as input. Validating the functionality by doing positive and negative testing. 
		- So SCD must be converted into different format which is called executable format. If it is window based apps then it will be converted into .exe format. If it is a web based application the SCD will be converted into deploy able format known as build. A build can be sent direactly and the build conversion is done by the developers.
		- So the ultimate responsibility is to validate the functionality of an application.
	- Roles: Test Engineer(TE). We need to remember that QAs and QCs are different. The usage is different.
	- Process: 
		- First, a TE must have knowledge about the application. It is the basic qualification. The BRD gives the TE the knowledge about the application. A BRD review is done. It is the studying of the BRD to understand teh application.
		- Second, any queries or doubts that occur to a TE about the BRD or the application it is to be documented in a Review Report(RR). This process is called the review report preparation.
		- Then the RR is sent to the BA so the queries and the doubts can be answered.
		- The TE needs "instruments" to test even though he has the knowledge. This instrument is called a Test Case Document (TCD). They contain test cases.
			- What is a test case: When there is a product, the TE must be seeing the product from a different angle. A product must have a perception. This perception can be both positive and negative. A TE must concentrate on the negative perception. These perceptions or angles must be tested with different test cases. A functionality is perfect only when there are no defects. So basically a TC is an angle, perception or a case that is used to prove the functionality is defect free and achieves functional perfection.
		- Each and every test case is implemented on the application. This is the TCD execution. This is called testing.
		- Defects are identified and reported in Defect Profile Document(DPD). These defects are reported to the developer for rectification. This process is called as bug reporting.
		- The management of the vendor company must know about few things too a Test Reporting Document(TRD) is prepared. This is done after testing. The TRD reports the following:
			- Non-technical part of the defects of a functionality
			- Productivity of the testers
			- Stability of application
			- Status of testing.
	- Outcome: A defect free application.

**DELIVERY**
	- Responsibility: The product ready to shipment must reach the client/customer.

	- Roles: 
		- PM: Project Manager
		- SQM: Software Quality Manager
		- DM: Delivery/ Deployment Manager

	- Process: 
		- If in remote location: We can get access to remote location. DM deploys it to the customer using customer's business server.
		- Deployment Document: Sometimes the customer may request DM to keep the dump of software along with the deployment document.
		- For local customers: DM sends it to the customers place, and the app is deployed.
		- After delivery: There will be a team that is known as on-site team who go to customer's environment. Team of testers and developers check certain things. The checklist is as follows:
			- Deployment is successful
			- All functionalities must be working
			- I/O devices and secondary devices are compatible with the application
			- Check for browser compatibility
			- Check if help document is provided.
			- User friendliness
			- Disk space: Is the software taking enough disk space as expected.
			- Check if the application is uninstallable.
			- End user training.

	- Outcome:
		- User manual
		- Certification document
		- Deployment document
		- SDN (Software Delivery Note):
			- Known issues (issues that might happen/occur)
			- Info regarding application.

**MAINTENANCE**
	- Responsibility: Correction or rectification.
	
	- Roles: Developers, TEs, Defect Tracking Team, Change Control Board(CCB)

	- Process: 
		- Defects raised by the customer are sent to DTT using a Change Request(CR). These defects are rectified for future enhancement.

	- Outcome:
		- Either rectified product or enhanced product.



