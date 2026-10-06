package p000;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jcy extends jcz {

    /* JADX INFO: renamed from: e */
    private static final Object f33768e = new Object();

    /* JADX INFO: renamed from: a */
    public static final jcy f33766a = new jcy();

    /* JADX INFO: renamed from: b */
    public static final int f33767b = jcz.f33769c;

    /* JADX INFO: renamed from: a */
    public final void m12897a(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof ActivityC0080bz) {
                C0111cq c0111cqM3206bA = ((ActivityC0080bz) activity).m3206bA();
                jdo jdoVar = new jdo();
                jib.m13206k(dialog, "Cannot display null dialog");
                dialog.setOnCancelListener(null);
                dialog.setOnDismissListener(null);
                jdoVar.f33809ad = dialog;
                if (onCancelListener != null) {
                    jdoVar.f33810ae = onCancelListener;
                }
                jdoVar.m2699c(c0111cqM3206bA, str);
                return;
            }
        } catch (NoClassDefFoundError e) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        jcv jcvVar = new jcv();
        jib.m13206k(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        jcvVar.f33758a = dialog;
        if (onCancelListener != null) {
            jcvVar.f33759b = onCancelListener;
        }
        jcvVar.show(fragmentManager, str);
    }

    /* JADX INFO: renamed from: b */
    public final Dialog m12898b(Context context, int i, jhf jhfVar, DialogInterface.OnCancelListener onCancelListener) {
        String string;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(jha.m13177b(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                string = resources.getString(C0100R.string.common_google_play_services_install_button);
                break;
            case 2:
                string = resources.getString(C0100R.string.common_google_play_services_update_button);
                break;
            case 3:
                string = resources.getString(C0100R.string.common_google_play_services_enable_button);
                break;
            default:
                string = resources.getString(R.string.ok);
                break;
        }
        if (string != null) {
            builder.setPositiveButton(string, jhfVar);
        }
        String strM13178c = jha.m13178c(context, i);
        if (strM13178c != null) {
            builder.setTitle(strM13178c);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i)), new IllegalArgumentException());
        return builder.create();
    }

    /* JADX INFO: renamed from: c */
    public final void m12899c(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogM12898b = m12898b(activity, i, new jhd(m12903g(activity, i, "d"), activity, i2), onCancelListener);
        if (dialogM12898b == null) {
            return;
        }
        m12897a(activity, dialogM12898b, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final void m12900d(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        Bundle bundle;
        Context context2 = null;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i), null), new IllegalArgumentException());
        if (i == 18) {
            new jcx(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strM13180e = i == 6 ? jha.m13180e(context, "common_google_play_services_resolution_required_title") : jha.m13178c(context, i);
        if (strM13180e == null) {
            strM13180e = context.getResources().getString(C0100R.string.common_google_play_services_notification_ticker);
        }
        String strM13179d = (i == 6 || i == 19) ? jha.m13179d(context, "common_google_play_services_resolution_required_text", jha.m13176a(context)) : jha.m13177b(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        jib.m13205j(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        abb abbVar = new abb(context);
        abbVar.f56j = true;
        abbVar.f59m.flags |= 16;
        abbVar.f51e = abb.m77b(strM13180e);
        aba abaVar = new aba();
        abaVar.f46a = abb.m77b(strM13179d);
        abbVar.m80d(abaVar);
        if (jit.m13233a(context)) {
            jib.m13201f(true);
            abbVar.m79c(context.getApplicationInfo().icon);
            abbVar.f54h = 2;
            if (jit.m13235c(context)) {
                abbVar.f48b.add(new aay(resources.getString(C0100R.string.common_open_on_phone), pendingIntent));
            } else {
                abbVar.f53g = pendingIntent;
            }
        } else {
            abbVar.m79c(R.drawable.stat_sys_warning);
            abbVar.f59m.tickerText = abb.m77b(resources.getString(C0100R.string.common_google_play_services_notification_ticker));
            abbVar.f59m.when = System.currentTimeMillis();
            abbVar.f53g = pendingIntent;
            abbVar.f52f = abb.m77b(strM13179d);
        }
        jib.m13201f(true);
        synchronized (f33768e) {
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        String string = context.getResources().getString(C0100R.string.common_google_play_services_notification_channel_name);
        if (notificationChannel == null) {
            notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
        } else if (!string.contentEquals(notificationChannel.getName())) {
            notificationChannel.setName(string);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        abbVar.f58l = "com.google.android.gms.availability";
        new ArrayList();
        Bundle bundle2 = new Bundle();
        Notification.Builder builderM118a = abk.m118a(abbVar.f47a, abbVar.f58l);
        Notification notification = abbVar.f59m;
        builderM118a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((2 & notification.flags) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(abbVar.f51e).setContentText(abbVar.f52f).setContentInfo(null).setContentIntent(abbVar.f53g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setLargeIcon((Bitmap) null).setNumber(0).setProgress(0, 0, false);
        abd.m81a(abd.m83c(abd.m82b(builderM118a, null), false), abbVar.f54h);
        ArrayList arrayList = abbVar.f48b;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            aay aayVar = (aay) arrayList.get(i3);
            IconCompat iconCompatM71a = aayVar.m71a();
            Notification.Action.Builder builderM109a = abi.m109a(iconCompatM71a != null ? acx.m248b(iconCompatM71a, context2) : context2, aayVar.f43e, aayVar.f44f);
            Bundle bundle3 = new Bundle(aayVar.f39a);
            boolean z = aayVar.f40b;
            bundle3.putBoolean("android.support.allowGeneratedReplies", true);
            boolean z2 = aayVar.f40b;
            abj.m112a(builderM109a, true);
            bundle3.putInt("android.support.action.semanticAction", 0);
            abl.m132a(builderM109a, 0);
            abm.m134a(builderM109a, false);
            abn.m141a(builderM109a, false);
            bundle3.putBoolean("android.support.action.showsUserInterface", aayVar.f41c);
            abg.m92a(builderM109a, bundle3);
            abg.m96e(builderM118a, abg.m95d(builderM109a));
            i3++;
            context2 = null;
        }
        Bundle bundle4 = abbVar.f57k;
        if (bundle4 != null) {
            bundle2.putAll(bundle4);
        }
        abe.m86a(builderM118a, true);
        abg.m99h(builderM118a, abbVar.f56j);
        abg.m97f(builderM118a, null);
        abg.m100i(builderM118a, null);
        abg.m98g(builderM118a, false);
        abh.m104b(builderM118a, null);
        abh.m105c(builderM118a, 0);
        abh.m108f(builderM118a, 0);
        abh.m106d(builderM118a, null);
        abh.m107e(builderM118a, notification.sound, notification.audioAttributes);
        ArrayList arrayList2 = abbVar.f60n;
        if (!arrayList2.isEmpty()) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                abh.m103a(builderM118a, (String) it.next());
            }
        }
        if (abbVar.f50d.size() > 0) {
            Bundle bundle5 = abbVar.m78a().getBundle("android.car.EXTENSIONS");
            if (bundle5 == null) {
                bundle5 = new Bundle();
            }
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            for (int i4 = 0; i4 < abbVar.f50d.size(); i4++) {
                String string2 = Integer.toString(i4);
                aay aayVar2 = (aay) abbVar.f50d.get(i4);
                Bundle bundle8 = new Bundle();
                IconCompat iconCompatM71a2 = aayVar2.m71a();
                bundle8.putInt("icon", iconCompatM71a2 != null ? iconCompatM71a2.m1431a() : 0);
                bundle8.putCharSequence("title", aayVar2.f43e);
                bundle8.putParcelable("actionIntent", aayVar2.f44f);
                Bundle bundle9 = new Bundle(aayVar2.f39a);
                boolean z3 = aayVar2.f40b;
                bundle9.putBoolean("android.support.allowGeneratedReplies", true);
                bundle8.putBundle("extras", bundle9);
                bundle8.putParcelableArray("remoteInputs", null);
                bundle8.putBoolean("showsUserInterface", aayVar2.f41c);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(string2, bundle8);
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            abbVar.m78a().putBundle("android.car.EXTENSIONS", bundle5);
            bundle2.putBundle("android.car.EXTENSIONS", bundle6);
        }
        abf.m88a(builderM118a, abbVar.f57k);
        abj.m116e(builderM118a, null);
        abk.m119b(builderM118a, 0);
        abk.m122e(builderM118a, null);
        abk.m123f(builderM118a, null);
        abk.m124g(builderM118a, 0L);
        abk.m121d(builderM118a, 0);
        if (!TextUtils.isEmpty(abbVar.f58l)) {
            builderM118a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        ArrayList arrayList3 = abbVar.f49c;
        if (arrayList3.size() > 0) {
            throw null;
        }
        abm.m135b(builderM118a, true);
        abm.m136c(builderM118a, null);
        abc abcVar = abbVar.f55i;
        if (abcVar != null) {
            aaz.m72a(aaz.m74c(aaz.m73b(builderM118a), null), ((aba) abcVar).f46a);
        }
        Notification notificationM84d = abd.m84d(builderM118a);
        if (abcVar != null && (bundle = notificationM84d.extras) != null) {
            bundle.putString("android.support.v4.app.extra.COMPAT_TEMPLATE", "androidx.core.app.NotificationCompat$BigTextStyle");
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
                jdm.f33801b.set(false);
                i2 = 10436;
                break;
            default:
                i2 = 39789;
                break;
        }
        notificationManager.notify(i2, notificationM84d);
    }
}
