package be.vives.ti;

public class StringProcessor {



    public String appendIfMissing(String str, String suffix)
    {
        if(!str.endsWith(suffix)){
            return str + suffix;
        }
        return str;
        //return String.CS.appendIfMissing(str,suffix);
    }
}
