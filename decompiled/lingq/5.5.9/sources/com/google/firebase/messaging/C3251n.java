package com.google.firebase.messaging;

import ae.C0065e;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import p047ce.InterfaceC1999a;

/* JADX INFO: renamed from: com.google.firebase.messaging.n */
/* JADX INFO: loaded from: classes.dex */
public final class C3251n {
    /* JADX INFO: renamed from: a */
    public static void m9269a(Bundle bundle, String str) {
        Bundle bundle2 = bundle;
        try {
            C0065e.m434b();
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = new Bundle();
            String string = bundle2.getString("google.c.a.c_id");
            if (string != null) {
                bundle3.putString("_nmid", string);
            }
            String string2 = bundle2.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle3.putString("_nmn", string2);
            }
            String string3 = bundle2.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle3.putString("label", string3);
            }
            String string4 = bundle2.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle3.putString("message_channel", string4);
            }
            String string5 = bundle2.getString("from");
            String string6 = null;
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle3.putString("_nt", string5);
            }
            String string7 = bundle2.getString("google.c.a.ts");
            if (string7 != null) {
                try {
                    bundle3.putInt("_nmt", Integer.parseInt(string7));
                } catch (NumberFormatException e10) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e10);
                }
            }
            if (bundle2.containsKey("google.c.a.udt")) {
                string6 = bundle2.getString("google.c.a.udt");
            }
            if (string6 != null) {
                try {
                    bundle3.putInt("_ndt", Integer.parseInt(string6));
                } catch (NumberFormatException e11) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e11);
                }
            }
            String str2 = C3253p.m9275l(bundle2) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle3.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle3);
            }
            C0065e c0065eM434b = C0065e.m434b();
            c0065eM434b.m437a();
            InterfaceC1999a interfaceC1999a = (InterfaceC1999a) c0065eM434b.f174d.mo11748a(InterfaceC1999a.class);
            if (interfaceC1999a != null) {
                interfaceC1999a.mo5934b("fcm", str, bundle3);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m9270b(Intent intent) {
        Bundle extras;
        if (intent != null && !FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction()) && (extras = intent.getExtras()) != null) {
            return "1".equals(extras.getString("google.c.a.e"));
        }
        return false;
    }
}
