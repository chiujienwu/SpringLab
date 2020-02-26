package spring.services;

import java.util.Date;

public interface IValid {

    void isComplete (boolean taskComplete);

    void pastDue (Date taskDueDate);

}
