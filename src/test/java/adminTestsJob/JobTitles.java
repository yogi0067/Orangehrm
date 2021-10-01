package adminTestsJob;

public class JobTitles {
	public static void main(String[] args) {
		
	}

	//Validate the URL -https://opensource-demo.orangehrmlive.com/index.php/admin/viewJobTitleList
	//Validate the text in first row with Grey Background - Job Titles
	//Validate that 2 buttons are available Add&Delete, by default Add is clickable or delete is not
	//Validate there should be a check box,JobTitle & JobDeription
	//Validate that after selecting main Select all check box should select all the available job titles
	//Validate the sorting behavior of Job titles, by default it is in ascending order
	//Validate that all available job titles are clickable
	//Validate that after user selects any check box SelectAll/or the specific one , delete button is clickable
	//Validate the delete button functionality,After selecting any check box, user should be able to delete it
	//Validate that after clicking on delete button , there should be a confirmation box open with text Delete records?
	//Validate that there are two options available in that box OK /cancel, both are clickable
	//Validate that the main title of the box is OrangeHRM - Confirmation Required and there is a cross(x) button available and clickable to close that box
	//Validate that user should be able to perform the add/Delete operations even after selecting multiple Job titles check boxes
	//Validate that after deleting the particular record , refresh the page and validate that deleted record does not exist
	//Validate that after selecting the particular Job title a new page should be opened and url must contain Job title id -https://opensource-demo.orangehrmlive.com/index.php/admin/saveJobTitle?jobTitleId=22
	//Validate that after selecting the particular job title , click on it and a new page should contain below features
	  // 1.Edit Job Title text
	  // 2.Job Title * - as a mandatory field and Non Editable field
	  // 3.Job Description - Field, user should be able to enter text,if edit button is not selected this option is non editable
	  // 4.Job Specification -Field, Choose File button / No file Chosen Text is there, if edit button is not selected this option is non clickable 
      // 5.Validate the maximum length of the description and types of files we can upload in job specification field
	  // 6.Validate the size of uploaded file should not exceed 1MB 
	  // 7.Note - Field,user should be able to enter text,if edit button is not selected this option is non editable
	  // 8.There should be a text with * sign as the indicator of Required field
	  // 9.2 buttons Edit and Cancel , Cancel takes back to the job title page and Edit allows user to edit the selected information
	// Validate the total number of job titles available , store them in excel for reference and its complete information
	

}
