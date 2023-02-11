package Programmers.Level0;

// 가위바위보

class Solution44 {
    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rsp.length(); i++) {
            sb.append(rsp.split("")[i].equals("2") ? "0"
                    : rsp.split("")[i].equals("0") ? "5" : "2");
        }
        return sb.toString();
    }
}
