public class lab4_Q5 {
    public static void main(String[] args) {
        String[] items = {"Apples", "Bananas", "Oranges"};

     
        StringBuilder sb = new StringBuilder();

        sb.append("<ul>");
        for (String item : items) {
            sb.append("<li>").append(item).append("</li>");
        }
        sb.append("</ul>");

        
        System.out.println(sb.toString());
    }
}
