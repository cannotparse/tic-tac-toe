package ca.uocsclub.bot;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Bot {

    private final String name;

    public static void main(String[] args){
        Bot b = new Bot("bot");
        System.out.println("Hello world from client :"+b.getName());
    }
}
