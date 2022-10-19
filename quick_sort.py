def qs(a,s,e):
     if s>=e:
         return;
     pivot_index=partion(a,s,e);
     qs(a,s,pivot_index-1);
     qs(a,pivot_index+1,e);        

 a=[5,2,4,3,9,1,10];
 qs(a,0,len(a)-1);
 print(a);
