package com.edgedevelop.string;

public class Lexograph {

    public static <currSub> void main(String[] args) {

        String s = "ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs\n".trim();
        String largest = "";
        String smallest = "";

        int k = 30;


        if (k == s.length()) {
            largest = s;
            smallest = s;
        }

        for (int i = 0; i < s.length() - (k - 1) ; i++) {


            String currSub = s.substring(i, i+k);
            if (currSub.compareTo(largest) > 0) {

                largest = currSub;
//                System.out.println(largest);

            } else {

                if (smallest.equals("")) {
                    smallest = currSub;
                } else if (currSub.compareTo(smallest) <= 0){
                    smallest = currSub;
                }
            }


        }


        System.out.println(smallest + "\n" + largest);
        System.out.println(s.length());

        String d = "DFHDSFHsdlfhsdlfLDFHSDLFHsdlfh";
        String a = "ASDFHDSFHsdlfhsdlfLDFHSDLFHsdl"; // 18 upper case


//        System.out.println("ASDFHDSFHsdlfhsdlfLDFHSDLFHsdl".compareTo("SDFHDSFHsdlfhsdlfLDFHSDLFHsdlf"));

    }
}
