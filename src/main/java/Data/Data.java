package Data;

import Objects.Accounts;
import Utils.Constants;
import Utils.Utility;
import java.util.ArrayList;

public class Data {
    public static Accounts defaultAccount () {
        return new Accounts(Constants.USERNAME, Constants.PASSWORD);
    }

    public static ArrayList<Accounts> getAccountsCSV(String file, String delimiter) {
        ArrayList<String> arrayList = Utility.readCSV(file);
        ArrayList<Accounts> list_accounts = new ArrayList<>();

        for (Object string : arrayList) {
            String [] array = string.toString().split(delimiter);
            list_accounts.add(new Accounts(array[0], array[1]));
        }
        return list_accounts;
    }
}
