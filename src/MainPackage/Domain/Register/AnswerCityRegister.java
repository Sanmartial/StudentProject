package MainPackage.Domain.Register;

import java.util.ArrayList;
import java.util.List;

public class AnswerCityRegister {
    private List<AnswerCityRegisterItem> items;
    public void addItem (AnswerCityRegisterItem item){
        if(items == null){
            items = new ArrayList<>();
        }
        items.add(item);
    }

}
