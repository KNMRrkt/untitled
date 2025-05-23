package reviews.reviews3.Review28;

import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("宛先を入力>");
        String to = br.readLine();
        System.out.print("件名を入力>");
        String subject = br.readLine();
        System.out.print("本文を入力>");
        String body = br.readLine();
        reviews.reviews3.Review28.Email em = new Email();
        if (subject.isEmpty()) {
            em.send(to,body);
        } else {
            em.send(to,subject,body);
        }
    }
}