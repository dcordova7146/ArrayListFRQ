import java.util.ArrayList;

public class Digits {
    private ArrayList<Integer> digitList;

    public Digits(int num){
        digitList = new ArrayList<Integer>();
        String snum = Integer.toString(num);
        for(int i = 0;i<snum.length();i++){
            int temp = Integer.parseInt(snum.substring(0+i,1+i));
            Integer out = new Integer(temp);
            digitList.add(out);
        }
    }
    public boolean isStrictlyIncreasing(){
        for(int i = 0;i<digitList.size()-1;i++){
            if(digitList.get(i)>digitList.get(i+1) || digitList.get(i).equals(digitList.get(i+1))){
                return false;
            }
        }
        return true;
    }
    public String getDigitList(){
        for(int i = 0;i<digitList.size();i++){
            System.out.println(digitList.get(i));
        }
        return "";
    }
}
