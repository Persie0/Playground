package com.google.android.gms.common;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.support.v4.media.AbstractC0140a;
import android.util.Log;
import android.util.TypedValue;
import androidx.fragment.app.ActivityC0979t;
import androidx.fragment.app.C0949e0;
import p152hb.AbstractDialogInterfaceOnCancelListenerC6018v1;
import p152hb.C6023x0;
import p152hb.InterfaceC5968f;
import p176ib.AbstractDialogInterfaceOnClickListenerC6292s;
import p176ib.C6272i;
import p176ib.C6284o;
import p176ib.C6286p;
import p176ib.C6290r;
import p232l2.C7233l;
import p232l2.C7235n;
import p232l2.C7236o;
import p262mb.C7529b;

/* JADX INFO: renamed from: com.google.android.gms.common.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2548c extends C2549d {

    /* JADX INFO: renamed from: c */
    public static final Object f13919c = new Object();

    /* JADX INFO: renamed from: d */
    public static final C2548c f13920d = new C2548c();

    /* JADX INFO: renamed from: f */
    public static AlertDialog m7582f(Context context, int i10, AbstractDialogInterfaceOnClickListenerC6292s abstractDialogInterfaceOnClickListenerC6292s, DialogInterface.OnCancelListener onCancelListener) {
        String string;
        AlertDialog.Builder builder = null;
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(C6284o.m12924b(i10, context));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = context.getResources();
        if (i10 == 1) {
            string = resources.getString(com.linguist.R.string.common_google_play_services_install_button);
        } else if (i10 != 2) {
            string = i10 != 3 ? resources.getString(R.string.ok) : resources.getString(com.linguist.R.string.common_google_play_services_enable_button);
        } else {
            string = resources.getString(com.linguist.R.string.common_google_play_services_update_button);
        }
        if (string != null) {
            builder.setPositiveButton(string, abstractDialogInterfaceOnClickListenerC6292s);
        }
        String strM12925c = C6284o.m12925c(i10, context);
        if (strM12925c != null) {
            builder.setTitle(strM12925c);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i10)), new IllegalArgumentException());
        return builder.create();
    }

    /* JADX INFO: renamed from: g */
    public static C6023x0 m7583g(Context context, AbstractC0140a abstractC0140a) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        C6023x0 c6023x0 = new C6023x0(abstractC0140a);
        context.registerReceiver(c6023x0, intentFilter);
        c6023x0.f35622a = context;
        if (C2550e.zza(context, "com.google.android.gms")) {
            return c6023x0;
        }
        abstractC0140a.mo601j0();
        synchronized (c6023x0) {
            try {
                Context context2 = c6023x0.f35622a;
                if (context2 != null) {
                    context2.unregisterReceiver(c6023x0);
                }
                c6023x0.f35622a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: h */
    public static void m7584h(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof ActivityC0979t) {
                C0949e0 c0949e0M3805K = ((ActivityC0979t) activity).m3805K();
                C2552g c2552g = new C2552g();
                if (alertDialog == null) {
                    throw new NullPointerException("Cannot display null dialog");
                }
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                c2552g.f13926L0 = alertDialog;
                if (onCancelListener != null) {
                    c2552g.f13927M0 = onCancelListener;
                }
                c2552g.mo3772s0(c0949e0M3805K, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        DialogFragmentC2547b dialogFragmentC2547b = new DialogFragmentC2547b();
        if (alertDialog == null) {
            throw new NullPointerException("Cannot display null dialog");
        }
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        dialogFragmentC2547b.f13916a = alertDialog;
        if (onCancelListener != null) {
            dialogFragmentC2547b.f13917b = onCancelListener;
        }
        dialogFragmentC2547b.show(fragmentManager, str);
    }

    @Override // com.google.android.gms.common.C2549d
    /* JADX INFO: renamed from: a */
    public final Intent mo7585a(Context context, int i10, String str) {
        return super.mo7585a(context, i10, str);
    }

    @Override // com.google.android.gms.common.C2549d
    /* JADX INFO: renamed from: c */
    public final int mo7586c(Context context, int i10) {
        return super.mo7586c(context, i10);
    }

    /* JADX INFO: renamed from: d */
    public final AlertDialog m7587d(int i10, Activity activity, int i11, DialogInterface.OnCancelListener onCancelListener) {
        return m7582f(activity, i10, new C6286p(i11, activity, super.mo7585a(activity, i10, "d")), onCancelListener);
    }

    /* JADX INFO: renamed from: e */
    public final int m7588e(Context context) {
        return mo7586c(context, C2549d.f13921a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @TargetApi(20)
    /* JADX INFO: renamed from: i */
    public final void m7589i(Context context, int i10, PendingIntent pendingIntent) {
        int i11;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i10), null), new IllegalArgumentException());
        if (i10 == 18) {
            new HandlerC2553h(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i10 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strM12927e = i10 == 6 ? C6284o.m12927e(context, "common_google_play_services_resolution_required_title") : C6284o.m12925c(i10, context);
        if (strM12927e == null) {
            strM12927e = context.getResources().getString(com.linguist.R.string.common_google_play_services_notification_ticker);
        }
        String strM12926d = (i10 == 6 || i10 == 19) ? C6284o.m12926d(context, "common_google_play_services_resolution_required_text", C6284o.m12923a(context)) : C6284o.m12924b(i10, context);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        C6272i.m12915i(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        C7236o c7236o = new C7236o(context, null);
        c7236o.f40654n = true;
        c7236o.m14580e(16, true);
        c7236o.m14579d(strM12927e);
        C7235n c7235n = new C7235n();
        c7235n.f40640d = C7236o.m14576c(strM12926d);
        c7236o.m14583h(c7235n);
        if (C7529b.m15040a(context)) {
            c7236o.f40664x.icon = context.getApplicationInfo().icon;
            c7236o.f40650j = 2;
            if (C7529b.m15041b(context)) {
                c7236o.f40642b.add(new C7233l(com.linguist.R.drawable.common_full_open_on_phone, resources.getString(com.linguist.R.string.common_open_on_phone), pendingIntent));
            } else {
                c7236o.f40647g = pendingIntent;
            }
        } else {
            c7236o.f40664x.icon = R.drawable.stat_sys_warning;
            c7236o.f40664x.tickerText = C7236o.m14576c(resources.getString(com.linguist.R.string.common_google_play_services_notification_ticker));
            c7236o.f40664x.when = System.currentTimeMillis();
            c7236o.f40647g = pendingIntent;
            c7236o.f40646f = C7236o.m14576c(strM12926d);
        }
        synchronized (f13919c) {
            try {
            } catch (Throwable th2) {
                throw th2;
            }
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        String string = context.getResources().getString(com.linguist.R.string.common_google_play_services_notification_channel_name);
        if (notificationChannel == null) {
            notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
        } else if (!string.contentEquals(notificationChannel.getName())) {
            notificationChannel.setName(string);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        c7236o.f40660t = "com.google.android.gms.availability";
        Notification notificationM14578b = c7236o.m14578b();
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            C2550e.sCanceledAvailabilityNotification.set(false);
            i11 = 10436;
        } else {
            i11 = 39789;
        }
        notificationManager.notify(i11, notificationM14578b);
    }

    /* JADX INFO: renamed from: j */
    public final void m7590j(Activity activity, InterfaceC5968f interfaceC5968f, int i10, AbstractDialogInterfaceOnCancelListenerC6018v1 abstractDialogInterfaceOnCancelListenerC6018v1) {
        AlertDialog alertDialogM7582f = m7582f(activity, i10, new C6290r(super.mo7585a(activity, i10, "d"), interfaceC5968f), abstractDialogInterfaceOnCancelListenerC6018v1);
        if (alertDialogM7582f == null) {
            return;
        }
        m7584h(activity, alertDialogM7582f, "GooglePlayServicesErrorDialog", abstractDialogInterfaceOnCancelListenerC6018v1);
    }
}
