package yurimontero.pruebagithub.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/**
 * Created by rpvde on 24/02/2016.
 * F functions
 */
public class F {

    public static String getAppVersion(Context context) {
        PackageInfo pInfo;
        String version = "";
        try {
            pInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), Context.MODE_PRIVATE);
            version = pInfo.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return version;
    }
}
