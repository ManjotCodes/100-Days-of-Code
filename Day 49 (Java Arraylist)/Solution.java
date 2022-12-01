public class Solution {
    static ArrayList<ArrayList<Integer>>number=new ArrayList<ArrayList<Integer>>(); 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i=0;i<t;i++){
            int line=scan.nextInt();
            ArrayList<Integer>List = new ArrayList<Integer>();
            for (int k=0;k<line;k++){
                List.add(scan.nextInt());
            }
            number.add(List);
        }   
        int pos=scan.nextInt();
        for(int i=0; i<pos; i++){
             int row = scan.nextInt();
             int col = scan.nextInt();
             try{
                 System.out.println(number.get(row-1).get(col-1));
             }catch(IndexOutOfBoundsException e){
                 System.out.println("ERROR!");
             }
             
        
        } 
}
}
