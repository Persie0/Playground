package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import p176ib.C6288q;

/* JADX INFO: loaded from: classes.dex */
public final class GooglePlayServicesUtil extends C2550e {
    public static final String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";

    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";

    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = C2550e.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";

    private GooglePlayServicesUtil() {
    }

    @Deprecated
    public static Dialog getErrorDialog(int i10, Activity activity, int i11) {
        return getErrorDialog(i10, activity, i11, null);
    }

    @Deprecated
    public static Dialog getErrorDialog(int i10, Activity activity, int i11, DialogInterface.OnCancelListener onCancelListener) {
        if (true == C2550e.isPlayServicesPossiblyUpdating(activity, i10)) {
            i10 = 18;
        }
        return C2548c.f13920d.m7587d(i10, activity, i11, onCancelListener);
    }

    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i10, Context context, int i11) {
        return C2550e.getErrorPendingIntent(i10, context, i11);
    }

    @Deprecated
    public static String getErrorString(int i10) {
        return C2550e.getErrorString(i10);
    }

    public static Context getRemoteContext(Context context) {
        return C2550e.getRemoteContext(context);
    }

    public static Resources getRemoteResource(Context context) {
        return C2550e.getRemoteResource(context);
    }

    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context) {
        return C2550e.isGooglePlayServicesAvailable(context);
    }

    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context, int i10) {
        return C2550e.isGooglePlayServicesAvailable(context, i10);
    }

    @Deprecated
    public static boolean isUserRecoverableError(int i10) {
        return C2550e.isUserRecoverableError(i10);
    }

    @Deprecated
    public static boolean showErrorDialogFragment(int i10, Activity activity, int i11) {
        return showErrorDialogFragment(i10, activity, i11, null);
    }

    @Deprecated
    public static boolean showErrorDialogFragment(int i10, Activity activity, int i11, DialogInterface.OnCancelListener onCancelListener) {
        return showErrorDialogFragment(i10, activity, null, i11, onCancelListener);
    }

    public static boolean showErrorDialogFragment(int i10, Activity activity, Fragment fragment, int i11, DialogInterface.OnCancelListener onCancelListener) {
        if (true == C2550e.isPlayServicesPossiblyUpdating(activity, i10)) {
            i10 = 18;
        }
        C2548c c2548c = C2548c.f13920d;
        if (fragment == null) {
            AlertDialog alertDialogM7587d = c2548c.m7587d(i10, activity, i11, onCancelListener);
            if (alertDialogM7587d == null) {
                return false;
            }
            C2548c.m7584h(activity, alertDialogM7587d, "GooglePlayServicesErrorDialog", onCancelListener);
            return true;
        }
        AlertDialog alertDialogM7582f = C2548c.m7582f(activity, i10, new C6288q(i11, c2548c.mo7585a(activity, i10, "d"), fragment), onCancelListener);
        if (alertDialogM7582f == null) {
            return false;
        }
        C2548c.m7584h(activity, alertDialogM7582f, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    @Deprecated
    public static void showErrorNotification(int i10, Context context) {
        C2548c c2548c = C2548c.f13920d;
        if (C2550e.isPlayServicesPossiblyUpdating(context, i10) || C2550e.isPlayStorePossiblyUpdating(context, i10)) {
            new HandlerC2553h(c2548c, context).sendEmptyMessageDelayed(1, 120000L);
        } else {
            c2548c.m7589i(context, i10, c2548c.m7591b(i10, 0, context, "n"));
        }
    }
}
