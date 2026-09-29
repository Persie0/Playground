package td;

import android.content.ComponentName;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* JADX INFO: renamed from: td.k */
/* JADX INFO: loaded from: classes.dex */
public final class C9263k {
    /* JADX INFO: renamed from: a */
    public static void m17623a(PackageManager packageManager, ComponentName componentName) {
        ComponentInfo componentInfo;
        int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
        if (componentEnabledSetting != 1) {
            if (componentEnabledSetting != 2) {
                String packageName = componentName.getPackageName();
                String className = componentName.getClassName();
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 516);
                    ComponentInfo[][] componentInfoArr = {packageInfo.activities, packageInfo.services, packageInfo.providers};
                    int i10 = 0;
                    loop0: while (true) {
                        if (i10 >= 3) {
                            componentInfo = null;
                            break;
                        }
                        ComponentInfo[] componentInfoArr2 = componentInfoArr[i10];
                        if (componentInfoArr2 != null) {
                            int length = componentInfoArr2.length;
                            for (int i11 = 0; i11 < length; i11++) {
                                componentInfo = componentInfoArr2[i11];
                                if (componentInfo.name.equals(className)) {
                                    break loop0;
                                }
                            }
                        }
                        i10++;
                    }
                    if (componentInfo != null && componentInfo.isEnabled()) {
                        return;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            packageManager.setComponentEnabledSetting(componentName, 1, 1);
        }
    }
}
