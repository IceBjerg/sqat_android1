package hu.mark.dobo.sqat_project;

import java.util.HashMap;
import java.util.Map;

public class StringTransform {
    private String neptunId = null;

    public StringTransform(String neptunId) {
        if (neptunId != null) {
            this.neptunId = neptunId;
        } else {
            neptunId = "";
        }
    }

    public String charTranslate(String input) {
        for (int i = neptunId.length() - 1; i > 0; i--) {
            input = input.replace(Character.toLowerCase(neptunId.charAt(i-1)), Character.toLowerCase(neptunId.charAt(i)));
            input = input.replace(Character.toUpperCase(neptunId.charAt(i-1)), Character.toUpperCase(neptunId.charAt(i)));
        }
        return input;
    }

    public String sumASCII(String input) {
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            sum += (int) input.charAt(i);
        }
        return Integer.toString(sum);
    }
}
