package com.google.android.apps.camera.legacy.app.activity;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.apps.camera.legacy.app.activity.main.CameraActivity;
import com.google.android.gms.common.annotation.HJo.JrxsYuVZZqnFC;
import p000.cds;
import p000.nbe;
import p000.nbh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class CaptureActivity extends CameraActivity {

    /* JADX INFO: renamed from: z */
    private static final nbh f6767z = nbh.m17259h("com/google/android/apps/camera/legacy/app/activity/CaptureActivity");

    @Override // com.google.android.apps.camera.legacy.app.activity.main.CameraActivity, p000.ero, p000.fbs, p000.ActivityC0080bz, p000.ActivityC0907pl, p000.ActivityC0136do, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        cds.m3507f(getIntent());
        String callingPackage = getCallingPackage();
        Intent intent = getIntent();
        String str = JrxsYuVZZqnFC.iRSypNWtMMXEX;
        int i = 0;
        intent.putExtra(str, false);
        PackageInfo packageInfo = null;
        try {
            if (callingPackage != null) {
                packageInfo = getPackageManager().getPackageInfo(callingPackage, 4096);
            } else {
                ((nbe) ((nbe) f6767z.m17252c()).mo17276G(1863)).mo17290o("getCallingPackage() returned null.");
            }
        } catch (PackageManager.NameNotFoundException e) {
            ((nbe) ((nbe) f6767z.m17252c()).mo17276G((char) 1868)).mo17293r("Unable to get PackageInfo for %s", callingPackage);
        }
        if (packageInfo == null || packageInfo.requestedPermissions == null) {
            z = false;
        } else {
            int i2 = 0;
            z = false;
            while (i < packageInfo.requestedPermissions.length) {
                if (packageInfo.requestedPermissions[i].equals("android.permission.ACCESS_COARSE_LOCATION") && (packageInfo.requestedPermissionsFlags[i] & 2) != 0) {
                    ((nbe) ((nbe) f6767z.m17252c()).mo17276G((char) 1867)).mo17293r("Coarse location is granted to %s", callingPackage);
                    i2 = 1;
                }
                if (packageInfo.requestedPermissions[i].equals("android.permission.ACCESS_FINE_LOCATION") && (packageInfo.requestedPermissionsFlags[i] & 2) != 0) {
                    ((nbe) ((nbe) f6767z.m17252c()).mo17276G((char) 1866)).mo17293r("Fine location is granted to %s", callingPackage);
                    z = true;
                }
                i++;
            }
            i = i2;
        }
        if (i == 0 && !z) {
            ((nbe) ((nbe) f6767z.m17252c()).mo17276G((char) 1865)).mo17293r("Package %s doesn't have location permissions, location info won't be included in EXIF", callingPackage);
        } else {
            ((nbe) ((nbe) f6767z.m17252c()).mo17276G((char) 1864)).mo17290o("Allowing location in intent");
            getIntent().putExtra(str, true);
        }
    }
}
