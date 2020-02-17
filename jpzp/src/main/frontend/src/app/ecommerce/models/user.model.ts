export class User {
	id: number;
	fName: string;
	lName: string;
	passwrd: string;
	phone: string;

	constructor(id: number, fName: string, lName: string, passwrd: string, phone: string){
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.passwrd = passwrd;
		this.phone = phone;
}