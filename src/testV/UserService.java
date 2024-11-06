package testV;

public class UserService {


    public String addUser (String s) throws InvalidUserNameException{


        if(){

            //throw exception
        }

        return "added";
    }
}


class UserServiceTest{


    UserService userService;

    public void addUserWhenInvalid(){

        when(userService.addUser("string")). (new InvalidUserNameException());


    }


}