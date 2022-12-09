// real time example for Method Overloading
class TrainStatusSearchTextField
{
	void searchByTrain(String trainName)
	{
		System.out.println("Enter train Name");
	}
}

class TrainStatusSearchTextFieldv2 extends TrainStatusSearchTextField
{
	void searchByTrain(int trainNumber)
	{
		System.out.println("Enter train Code");
	}
}

class TrainAvailablity
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Indian Railway");
		TrainStatusSearchTextFieldv2 searchTrain = new TrainStatusSearchTextFieldv2();
		searchTrain.searchByTrain(" YESVANTPUR - HAZRAT NIZAMUDDIN Karnataka Sampark Kranti Exp");
		searchTrain.searchByTrain(12649);
	}
}
