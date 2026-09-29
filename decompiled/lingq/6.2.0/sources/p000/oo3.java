package p000;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.base.R$drawable;
import com.google.android.gms.base.R$string;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: loaded from: classes.dex */
public final class oo3 extends po3 {

    /* JADX INFO: renamed from: d */
    public static final Object f54648d = new Object();

    /* JADX INFO: renamed from: e */
    public static final oo3 f54649e = new oo3();

    /* JADX INFO: renamed from: c */
    public xdb f54650c;

    /* JADX INFO: renamed from: e */
    public static AlertDialog m18184e(Activity activity, int i, sdb sdbVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(jdb.m14405c(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String strM14407e = jdb.m14407e(activity, i);
        if (strM14407e != null) {
            builder.setPositiveButton(strM14407e, sdbVar);
        }
        String strM14403a = jdb.m14403a(activity, i);
        if (strM14403a != null) {
            builder.setTitle(strM14403a);
        }
        Log.w("GoogleApiAvailability", ux5.m22988k(i, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    /* JADX INFO: renamed from: h */
    public static void m18185h(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof id3) {
                rn9.m20719l0(alertDialog, onCancelListener).m3665k0(((id3) activity).m13792j(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        ht2.m13454a(alertDialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    /* JADX INFO: renamed from: d */
    public final void m18186d(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogM18184e = m18184e(googleApiActivity, i, sdb.m21272b(super.m19431b(i, googleApiActivity, "d"), googleApiActivity), googleApiActivity2);
        if (alertDialogM18184e == null) {
            return;
        }
        m18185h(googleApiActivity, alertDialogM18184e, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    /* JADX INFO: renamed from: f */
    public final void m18187f(Activity activity, sb5 sb5Var, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogM18184e = m18184e(activity, i, sdb.m21273c(sb5Var, super.m19431b(i, activity, "d")), onCancelListener);
        if (alertDialogM18184e == null) {
            return;
        }
        m18185h(activity, alertDialogM18184e, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    /* JADX INFO: renamed from: g */
    public final void m18188g(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        Log.w("GoogleApiAvailability", ux5.m22989l("GMS core API Availability. ConnectionResult=", i, ", tag=null"), new IllegalArgumentException());
        if (i == 18) {
            new fdb(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strM14404b = jdb.m14404b(context, i);
        String strM14406d = jdb.m14406d(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        lda.m16130p(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        vm6 vm6Var = new vm6(context);
        vm6Var.m23419k();
        vm6Var.m23413e(true);
        vm6Var.m23417i(strM14404b);
        um6 um6Var = new um6();
        um6Var.m22793c(strM14406d);
        vm6Var.m23423o(um6Var);
        PackageManager packageManager = context.getPackageManager();
        if (b34.f7855p == null) {
            b34.f7855p = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        boolean zBooleanValue = b34.f7855p.booleanValue();
        int i3 = R.drawable.stat_sys_warning;
        if (zBooleanValue) {
            int i4 = context.getApplicationInfo().icon;
            if (i4 != 0) {
                i3 = i4;
            }
            vm6Var.m23421m(i3);
            vm6Var.m23420l();
            if (b34.m3258z(context)) {
                vm6Var.m23411a(R$drawable.common_full_open_on_phone, pendingIntent, resources.getString(R$string.common_open_on_phone));
            } else {
                vm6Var.m23415g(pendingIntent);
            }
        } else {
            vm6Var.m23421m(R.drawable.stat_sys_warning);
            vm6Var.m23424p(resources.getString(R$string.common_google_play_services_notification_ticker));
            vm6Var.m23425q(System.currentTimeMillis());
            vm6Var.m23415g(pendingIntent);
            vm6Var.m23416h(strM14406d);
        }
        synchronized (f54648d) {
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        String string = context.getResources().getString(R$string.common_google_play_services_notification_channel_name);
        if (notificationChannel == null) {
            notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
        } else if (!string.contentEquals(notificationChannel.getName())) {
            notificationChannel.setName(string);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        vm6Var.m23414f();
        Notification notificationMo15108c = vm6Var.mo15108c();
        if (i == 1 || i == 2 || i == 3) {
            to3.f62634a.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, notificationMo15108c);
    }
}
