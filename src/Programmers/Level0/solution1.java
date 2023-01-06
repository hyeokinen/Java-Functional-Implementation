//package Programmers;
//
//class Solution {
//
//    // 버블정렬을 통한 오름차순 정렬
//    // 정렬된 배열끼리 차를 구하고 음수일 경우, 0일경우, 양수일 경우를 비교후 값 저장
//
//    public static int[] solution1(int[] preferences) {
//        int[] answer = preferences;
//        for(int i = 0; i < preferences.length; i++){
//
//            for(int j = 0; j < preferences.length; j++){
//                if(preferences[j] > preferences[j+1]){
//                    int temp = preferences[j+1];
//                    preferences[j+1] = preferences[j];
//                    preferences[j] = temp;
//
//                }
//            }
//        }
//        return answer;
//    }
//
//    public static int[] solution2(int[] coffees){
//        int[] answer2 = coffees;
//        for(int i = 0; i < coffees.length; i++){
//
//            for(int j = 0; j < coffees.length; j++){
//                if(coffees[j] > coffees[j+1]){
//                    int temp = coffees[j+1];
//                    coffees[j+1] = coffees[j];
//                    coffees[j] = temp;
//
//                }
//            }
//        }
//        return answer2;
//    }
//
//
//    public static void main(String[] args){
//        int result = 0;
//        int[] preferences = new int[];
//        int[] coffees = new int[];
//
//        preferences = solution1(preferences);
//        coffees = solution2(coffees);
//
//
//        for(int i = 0; i <= 2000; i++){
//            if(coffees[i] - preferences[i] <= 0){
//                result += 0;
//            }
//
//            if(coffees[i] - preferences[i] > 0){
//                result += coffees[i] - preferences[i];
//            }
//        }
//    }
//
//}
