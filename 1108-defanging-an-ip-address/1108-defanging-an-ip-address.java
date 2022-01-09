class Solution {
    public String defangIPaddr(String address) {
        StringBuilder builder = new StringBuilder("");
        String[] add = address.split("\\.");

        for (int i = 0; i < add.length-1; i++){
            builder.append(add[i]+"[.]");
        }
        builder.append(add[add.length-1]);
        return builder.toString();
    }
}