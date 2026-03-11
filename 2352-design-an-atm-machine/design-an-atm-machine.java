class ATM {
long arr[];
    public ATM() {
        arr=new long[5];
    }
    
    public void deposit(int[] banknotesCount) {
        for(int i=0;i<5;i++){
            arr[i]+=banknotesCount[i];
        }
    }
    
    public int[] withdraw(int amount) {
        
        int ans[]=new int[5];
        for(int i=4;i>=0;i--){
            
            if(arr[i]>0 && amount>0){
                if(i==0 && amount>=20){
                    if((amount/20)<=arr[0]){
                        ans[0]+=(amount/20);
                        amount=(amount%20);
                    }
                    else{
                        amount-=arr[0]*20;
                        ans[0]=(int)arr[0];
                    }
                    
                }else if(i==1 && amount>=50){
                    if((amount/50)<=arr[1]){
                        ans[1]+=(amount/50);
                        amount=(amount%50);
                    }
                    else{
                        amount-=arr[1]*50;
                        ans[1]=(int)arr[1];
                    }
                    
                }else if(i==2 && amount>=100){
                    if((amount/100)<=arr[2]){
                        ans[2]+=(amount/100);
                        amount=(amount%100);
                    }
                    else{
                        amount-=arr[2]*100;
                        ans[2]=(int)arr[2];
                    }
                    
                }else if(i==3 && amount>=200){
                    if((amount/200)<=arr[3]){
                        ans[3]+=(amount/200);
                        amount=(amount%200);
                    }
                    else{
                        amount-=arr[3]*200;
                        ans[3]=(int)arr[3];
                    }
                }else if(i==4 && amount>=500){
                    if((amount/500)<=arr[4]){
                        ans[4]+=(amount/500);
                        amount=(amount%500);
                    }
                    else{
                        amount-=arr[4]*500;
                        ans[4]=(int)arr[4];
                    }
                    
                }
            }
            
        }
        
        if(amount>0){
            return new int[]{-1};
        }
        for(int i=0;i<5;i++){
            arr[i]-=ans[i];
        }
        return ans;
        
    }

}

/**
 * Your ATM object will be instantiated and called as such:
 * ATM obj = new ATM();
 * obj.deposit(banknotesCount);
 * int[] param_2 = obj.withdraw(amount);
 */