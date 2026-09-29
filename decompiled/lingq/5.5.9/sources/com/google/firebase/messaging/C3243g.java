package com.google.firebase.messaging;

import android.R;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.tasks.Tasks;
import com.kochava.tracker.BuildConfig;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import p128g2.RunnableC5682t;
import p136gc.C5752h;
import p136gc.C5761q;
import p176ib.C6272i;
import p232l2.C7234m;
import p232l2.C7235n;
import p232l2.C7236o;
import p254m2.C7472a;

/* JADX INFO: renamed from: com.google.firebase.messaging.g */
/* JADX INFO: loaded from: classes.dex */
public final class C3243g {

    /* JADX INFO: renamed from: a */
    public final ExecutorService f16382a;

    /* JADX INFO: renamed from: b */
    public final Context f16383b;

    /* JADX INFO: renamed from: c */
    public final C3253p f16384c;

    public C3243g(Context context, C3253p c3253p, ExecutorService executorService) {
        this.f16382a = executorService;
        this.f16383b = context;
        this.f16384c = c3253p;
    }

    /* JADX WARN: Code duplicated, block: B:158:0x0393  */
    /* JADX WARN: Code duplicated, block: B:18:0x0051 A[EDGE_INSN: B:18:0x0051->B:19:0x0052 BREAK  A[LOOP:0: B:11:0x0037->B:257:?]] */
    /* JADX WARN: Code duplicated, block: B:245:0x0383 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:0x01f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0123  */
    /* JADX WARN: Code duplicated, block: B:55:0x012a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0130  */
    /* JADX WARN: Code duplicated, block: B:59:0x013d  */
    /* JADX WARN: Code duplicated, block: B:61:0x014f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0157  */
    /* JADX WARN: Code duplicated, block: B:96:0x0215  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v58 */
    /* JADX WARN: Type inference failed for: r2v59, types: [int] */
    /* JADX WARN: Type inference failed for: r2v96 */
    /* JADX WARN: Type inference failed for: r2v97 */
    /* JADX WARN: Type inference failed for: r2v98 */
    /* JADX WARN: Type inference failed for: r2v99 */
    /* JADX INFO: renamed from: a */
    public final boolean m9256a() {
        boolean z10;
        C3250m c3250m;
        Bundle bundle;
        int i10;
        int identifier;
        Uri defaultUri;
        Intent launchIntentForPackage;
        PendingIntent activity;
        Integer numValueOf;
        IconCompat iconCompat;
        int i11;
        int identifier2;
        String string;
        if (this.f16384c.m9277a("gcm.n.noui")) {
            return true;
        }
        Context context = this.f16383b;
        if (!((KeyguardManager) context.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int iMyPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses == null) {
                z10 = false;
                break;
            }
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (it.hasNext()) {
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == iMyPid) {
                        if (next.importance == 100) {
                            z10 = true;
                            break;
                        }
                    }
                }
                z10 = false;
                break;
            }
        }
        z10 = false;
        break;
        if (z10) {
            return false;
        }
        String strM9286j = this.f16384c.m9286j("gcm.n.image");
        if (TextUtils.isEmpty(strM9286j)) {
            c3250m = null;
        } else {
            try {
                c3250m = new C3250m(new URL(strM9286j));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + strM9286j);
                c3250m = null;
            }
        }
        if (c3250m != null) {
            ExecutorService executorService = this.f16382a;
            C5752h c5752h = new C5752h();
            c3250m.f16407b = executorService.submit(new RunnableC5682t(c3250m, 17, c5752h));
            c3250m.f16408c = c5752h.f34812a;
        }
        Context context2 = this.f16383b;
        C3253p c3253p = this.f16384c;
        AtomicInteger atomicInteger = C3239e.f16378a;
        try {
            ApplicationInfo applicationInfo = context2.getPackageManager().getApplicationInfo(context2.getPackageName(), BuildConfig.SDK_TRUNCATE_LENGTH);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                bundle = Bundle.EMPTY;
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e10);
        }
        Bundle bundle2 = bundle;
        String strM9286j2 = c3253p.m9286j("gcm.n.android_channel_id");
        try {
            if (context2.getPackageManager().getApplicationInfo(context2.getPackageName(), 0).targetSdkVersion < 26) {
                strM9286j2 = null;
            } else {
                NotificationManager notificationManager = (NotificationManager) context2.getSystemService(NotificationManager.class);
                if (TextUtils.isEmpty(strM9286j2)) {
                    strM9286j2 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                    if (!TextUtils.isEmpty(strM9286j2)) {
                        Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                    } else if (notificationManager.getNotificationChannel(strM9286j2) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                    }
                    strM9286j2 = "fcm_fallback_notification_channel";
                    if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                        identifier2 = context2.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context2.getPackageName());
                        if (identifier2 == 0) {
                            Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                            string = "Misc";
                        } else {
                            string = context2.getString(identifier2);
                        }
                        notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
                    }
                } else if (notificationManager.getNotificationChannel(strM9286j2) == null) {
                    Log.w("FirebaseMessaging", "Notification Channel requested (" + strM9286j2 + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                    strM9286j2 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                    if (!TextUtils.isEmpty(strM9286j2)) {
                        Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                    } else if (notificationManager.getNotificationChannel(strM9286j2) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                    }
                    strM9286j2 = "fcm_fallback_notification_channel";
                    if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                        identifier2 = context2.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context2.getPackageName());
                        if (identifier2 == 0) {
                            Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                            string = "Misc";
                        } else {
                            string = context2.getString(identifier2);
                        }
                        notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        C7236o c7236o = new C7236o(context2, strM9286j2);
        String strM9285i = c3253p.m9285i(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(strM9285i)) {
            c7236o.m14579d(strM9285i);
        }
        String strM9285i2 = c3253p.m9285i(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(strM9285i2)) {
            c7236o.f40646f = C7236o.m14576c(strM9285i2);
            C7235n c7235n = new C7235n();
            c7235n.f40640d = C7236o.m14576c(strM9285i2);
            c7236o.m14583h(c7235n);
        }
        String strM9286j3 = c3253p.m9286j("gcm.n.icon");
        if (TextUtils.isEmpty(strM9286j3)) {
            i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
            if (i10 == 0 && C3239e.m9254a(resources, i10)) {
                identifier = i10;
            } else {
                try {
                } catch (PackageManager.NameNotFoundException e11) {
                    Log.w("FirebaseMessaging", "Couldn't get own application info: " + e11);
                    identifier = i10;
                }
            }
            if (identifier != 0 || !C3239e.m9254a(resources, identifier)) {
                identifier = R.drawable.sym_def_app_icon;
            }
        } else {
            identifier = resources.getIdentifier(strM9286j3, "drawable", packageName);
            if ((identifier == 0 || !C3239e.m9254a(resources, identifier)) && ((identifier = resources.getIdentifier(strM9286j3, "mipmap", packageName)) == 0 || !C3239e.m9254a(resources, identifier))) {
                Log.w("FirebaseMessaging", "Icon resource " + strM9286j3 + " not found. Notification will use default icon.");
                i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                identifier = i10 == 0 ? packageManager.getApplicationInfo(packageName, 0).icon : packageManager.getApplicationInfo(packageName, 0).icon;
                if (identifier != 0) {
                    identifier = R.drawable.sym_def_app_icon;
                } else {
                    identifier = R.drawable.sym_def_app_icon;
                }
            }
        }
        Notification notification = c7236o.f40664x;
        notification.icon = identifier;
        String strM9286j4 = c3253p.m9286j("gcm.n.sound2");
        if (TextUtils.isEmpty(strM9286j4)) {
            strM9286j4 = c3253p.m9286j("gcm.n.sound");
        }
        if (TextUtils.isEmpty(strM9286j4)) {
            defaultUri = null;
        } else if ("default".equals(strM9286j4) || resources.getIdentifier(strM9286j4, "raw", packageName) == 0) {
            defaultUri = RingtoneManager.getDefaultUri(2);
        } else {
            defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + strM9286j4);
        }
        if (defaultUri != null) {
            c7236o.m14582g(defaultUri);
        }
        String strM9286j5 = c3253p.m9286j("gcm.n.click_action");
        if (TextUtils.isEmpty(strM9286j5)) {
            Uri uriM9281e = c3253p.m9281e();
            if (uriM9281e != null) {
                launchIntentForPackage = new Intent("android.intent.action.VIEW");
                launchIntentForPackage.setPackage(packageName);
                launchIntentForPackage.setData(uriM9281e);
            } else {
                launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                if (launchIntentForPackage == null) {
                    Log.w("FirebaseMessaging", "No activity found to launch app");
                }
            }
        } else {
            launchIntentForPackage = new Intent(strM9286j5);
            launchIntentForPackage.setPackage(packageName);
            launchIntentForPackage.setFlags(268435456);
        }
        if (launchIntentForPackage == null) {
            activity = null;
        } else {
            launchIntentForPackage.addFlags(67108864);
            Bundle bundle3 = c3253p.f16414a;
            Bundle bundle4 = new Bundle(bundle3);
            for (String str : bundle3.keySet()) {
                if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                    bundle4.remove(str);
                }
            }
            launchIntentForPackage.putExtras(bundle4);
            if (c3253p.m9277a("google.c.a.e")) {
                launchIntentForPackage.putExtra("gcm.n.analytics_data", c3253p.m9288m());
            }
            activity = PendingIntent.getActivity(context2, C3239e.f16378a.incrementAndGet(), launchIntentForPackage, 1140850688);
        }
        c7236o.f40647g = activity;
        PendingIntent broadcast = !c3253p.m9277a("google.c.a.e") ? null : PendingIntent.getBroadcast(context2, C3239e.f16378a.incrementAndGet(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context2, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(c3253p.m9288m())), 1140850688);
        if (broadcast != null) {
            notification.deleteIntent = broadcast;
        }
        String strM9286j6 = c3253p.m9286j("gcm.n.color");
        if (TextUtils.isEmpty(strM9286j6)) {
            i11 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i11 != 0) {
                Object obj = C7472a.f41322a;
                numValueOf = Integer.valueOf(C7472a.d.m14851a(context2, i11));
            } else {
                numValueOf = null;
            }
        } else {
            try {
                numValueOf = Integer.valueOf(Color.parseColor(strM9286j6));
            } catch (IllegalArgumentException unused3) {
                Log.w("FirebaseMessaging", "Color is invalid: " + strM9286j6 + ". Notification will use default color.");
                i11 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i11 != 0) {
                    try {
                        Object obj2 = C7472a.f41322a;
                        numValueOf = Integer.valueOf(C7472a.d.m14851a(context2, i11));
                    } catch (Resources.NotFoundException unused4) {
                        Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                        numValueOf = null;
                    }
                } else {
                    numValueOf = null;
                }
            }
        }
        if (numValueOf != null) {
            c7236o.f40658r = numValueOf.intValue();
        }
        c7236o.m14580e(16, !c3253p.m9277a("gcm.n.sticky"));
        c7236o.f40654n = c3253p.m9277a("gcm.n.local_only");
        String strM9286j7 = c3253p.m9286j("gcm.n.ticker");
        if (strM9286j7 != null) {
            c7236o.f40664x.tickerText = C7236o.m14576c(strM9286j7);
        }
        Integer numM9278b = c3253p.m9278b("gcm.n.notification_priority");
        if (numM9278b == null) {
            numM9278b = null;
        } else if (numM9278b.intValue() < -2 || numM9278b.intValue() > 2) {
            Log.w("FirebaseMessaging", "notificationPriority is invalid " + numM9278b + ". Skipping setting notificationPriority.");
            numM9278b = null;
        }
        if (numM9278b != null) {
            c7236o.f40650j = numM9278b.intValue();
        }
        Integer numM9278b2 = c3253p.m9278b("gcm.n.visibility");
        if (numM9278b2 == null) {
            numM9278b2 = null;
        } else if (numM9278b2.intValue() < -1 || numM9278b2.intValue() > 1) {
            Log.w("NotificationParams", "visibility is invalid: " + numM9278b2 + ". Skipping setting visibility.");
            numM9278b2 = null;
        }
        if (numM9278b2 != null) {
            c7236o.f40659s = numM9278b2.intValue();
        }
        Integer numM9278b3 = c3253p.m9278b("gcm.n.notification_count");
        if (numM9278b3 == null) {
            numM9278b3 = null;
        } else if (numM9278b3.intValue() < 0) {
            Log.w("FirebaseMessaging", "notificationCount is invalid: " + numM9278b3 + ". Skipping setting notificationCount.");
            numM9278b3 = null;
        }
        if (numM9278b3 != null) {
            c7236o.f40649i = numM9278b3.intValue();
        }
        Long lM9284h = c3253p.m9284h();
        if (lM9284h != null) {
            c7236o.f40651k = true;
            notification.when = lM9284h.longValue();
        }
        long[] jArrM9287k = c3253p.m9287k();
        if (jArrM9287k != null) {
            notification.vibrate = jArrM9287k;
        }
        int[] iArrM9280d = c3253p.m9280d();
        if (iArrM9280d != null) {
            int i12 = iArrM9280d[0];
            int i13 = iArrM9280d[1];
            int i14 = iArrM9280d[2];
            notification.ledARGB = i12;
            notification.ledOnMS = i13;
            notification.ledOffMS = i14;
            notification.flags = ((i13 == 0 || i14 == 0) ? 0 : 1) | ((-2) & notification.flags);
        }
        boolean zM9277a = c3253p.m9277a("gcm.n.default_sound");
        ?? r10 = zM9277a;
        if (c3253p.m9277a("gcm.n.default_vibrate_timings")) {
            r10 = (zM9277a ? 1 : 0) | 2;
        }
        ?? r11 = r10;
        if (c3253p.m9277a("gcm.n.default_light_settings")) {
            r11 = (r10 == true ? 1 : 0) | 4;
        }
        notification.defaults = r11;
        if ((r11 & 4) != 0) {
            notification.flags |= 1;
        }
        String strM9286j8 = c3253p.m9286j("gcm.n.tag");
        if (TextUtils.isEmpty(strM9286j8)) {
            strM9286j8 = "FCM-Notification:" + SystemClock.uptimeMillis();
        }
        String str2 = strM9286j8;
        if (c3250m != null) {
            try {
                C5761q c5761q = c3250m.f16408c;
                C6272i.m12915i(c5761q);
                Bitmap bitmap = (Bitmap) Tasks.await(c5761q, 5L, TimeUnit.SECONDS);
                c7236o.m14581f(bitmap);
                C7234m c7234m = new C7234m();
                if (bitmap == null) {
                    iconCompat = null;
                } else {
                    iconCompat = new IconCompat(1);
                    iconCompat.f5583b = bitmap;
                }
                c7234m.f40637d = iconCompat;
                c7234m.f40638e = null;
                c7234m.f40639f = true;
                c7236o.m14583h(c7234m);
            } catch (InterruptedException unused5) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                c3250m.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e12) {
                Log.w("FirebaseMessaging", "Failed to download image: " + e12.getCause());
            } catch (TimeoutException unused6) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                c3250m.close();
            }
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f16383b.getSystemService("notification")).notify(str2, 0, c7236o.m14578b());
        return true;
    }
}
