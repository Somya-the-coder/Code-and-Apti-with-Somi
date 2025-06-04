Class Main
  {
  public void reverse_string(char[] st)
    {
    int n=st.length;
    for(int i=0;i<n/2;i++)
      {
        chartemp=s[i];
        s[i]=s[n-i-1];
        s[n-i-1]=temp;
      }
  }
}
  //space complexity taking dev sir reversal technique
    //     String s1="";
    //     for(char i:s)
    //     {
    //         s1=i+s1;
    //     }
    //     System.out.println(s1);
    }
