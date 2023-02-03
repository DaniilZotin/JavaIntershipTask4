package my.pack;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Accounts {

    public Table<String, String, String> accountTable()
    {
        Table<String, String, String> table = HashBasedTable.create();
        table.put("Danz","Daniil","123");
        table.put("Alexamn","Alex","453");
        return table;
    }

    protected String login;
    private String name;

    protected String password;

    public Accounts(String login, String name, String password)
    {
        this.login = login;
        this.name = name;
        this.password = password;
    }

    public Accounts()
    {
        //Це я для себе роблю щоб було зрозуміло як по нішому зробити
    }


    public String getName()
    {
        return name;
    }

    public String getLogin()
    {
        return login;
    }

    public String getPassword()
    {
        return password;
    }



}
