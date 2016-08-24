public String lp(String[] str) {
    if(str.length==0) return "";
    String minStr=str[0];

    for(int i=1;i<str.length;i++){
        if(strs[i].length()<minStr.length())
            minStr=str[i];
    }
    int end=minStr.length();
    for(int i=0;i<str.length;i++){
        int j;
        for( j=0;j<end;j++){
            if(minStr.charAt(j)!=str[i].charAt(j))
                break;
        }
        if(j<end)
            end=j;
    }
    return minStr.substring(0,end);
}
