package p000;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.libraries.lens.lenslite.dynamicloading.QSK.hIAHJKEnGsNbz;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class oev {

    /* JADX INFO: renamed from: a */
    public static final String f45813a = oev.class.getSimpleName();

    private oev() {
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00c8  */
    /* JADX INFO: renamed from: a */
    public static boolean m18443a(Activity activity, boolean z) {
        byte b;
        if (!activity.getPackageManager().hasSystemFeature("android.software.vr.mode")) {
            return false;
        }
        try {
            activity.setVrModeEnabled(z, new ComponentName("com.google.vr.vrcore", "com.google.vr.vrcore.common.VrCoreListenerService"));
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            Log.w(f45813a, "No VR service component: ".concat(e.toString()));
            if (activity.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
                Iterator<ApplicationInfo> it = activity.getPackageManager().getInstalledApplications(0).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        b = -1;
                        break;
                    }
                    if (it.next().packageName.equals("com.google.vr.vrcore")) {
                        String string = Settings.Secure.getString(activity.getContentResolver(), "enabled_vr_listeners");
                        ComponentName componentName = new ComponentName("com.google.vr.vrcore", "com.google.vr.vrcore.common.VrCoreListenerService");
                        if (string != null && string.contains(componentName.flattenToString())) {
                            b = 0;
                            break;
                        }
                        b = -2;
                        break;
                    }
                }
                if ("goldfish".equals(Build.HARDWARE) || "ranchu".equals(Build.HARDWARE)) {
                    Log.w(f45813a, hIAHJKEnGsNbz.isveXCwnWvJNLKt);
                } else if (b == -1) {
                    m18444b(activity, C0100R.string.dialog_vr_core_not_installed, C0100R.string.go_to_playstore_button, new cdo(activity, 19));
                } else if (b == -2) {
                    m18444b(activity, C0100R.string.dialog_vr_core_not_enabled, C0100R.string.go_to_vr_listeners_settings_button, new cdo(activity, 20));
                } else {
                    Log.w(f45813a, hIAHJKEnGsNbz.isveXCwnWvJNLKt);
                }
            }
            return false;
        } catch (UnsupportedOperationException e2) {
            Log.w(f45813a, "Failed to set VR mode: ".concat(e2.toString()));
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m18444b(Context context, int i, int i2, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context, C0100R.style.GvrDialogTheme);
        builder.setMessage(i).setTitle(C0100R.string.dialog_title_warning).setPositiveButton(i2, onClickListener).setNegativeButton(C0100R.string.cancel_button, new fns(3));
        builder.create().show();
    }
}
