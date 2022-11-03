/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package in.co.sanchay;

import java.io.File;
import in.co.sanchay.util.UtilityFunctions;

/**
 *
 * @author anil
 */
public class SanchayLauncher {
    public static void main(String[] args) {
//        String srcDir = "/home/anil/tmp/feature_based_code/featurengramscode";
        String srcDir = "/home/anil/tmp";
        String tgtDir = "/home/anil/sanchay/Sanchay";

        String routePath = UtilityFunctions.getRoutePath(new File(srcDir), new File(tgtDir));

        System.out.println(routePath);
    }

}
