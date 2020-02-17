export class User {
	id: number;
	fName: string;
	lName: string;
	dob: string;
	address: string;
	city: string;
	state: string;
	phone: string;

	constructor(id: number, fName: string, lName: string, dob: string, address: string, city: string, state: string, phone: string){
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.dob = dob;
		this.address = address;
		this.city = city;
		this.state = state;
		this.phone = phone;
}