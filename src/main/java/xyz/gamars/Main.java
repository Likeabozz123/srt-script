package xyz.gamars;

import xyz.gamars.objects.base.MMOItem;
import xyz.gamars.parser.MMOItemParser;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        MMOItemParser MMOItemParser = new MMOItemParser("gem_stone.yml");
        HashMap<String, MMOItem> items = MMOItemParser.parseItems();
        items.forEach((id, item) -> {
            System.out.println(id + " : " + item.getName());
        });




    }
}