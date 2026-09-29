package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p254m2.C7472a;

/* JADX INFO: renamed from: com.google.firebase.messaging.w */
/* JADX INFO: loaded from: classes.dex */
public final class C3260w {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f16447a;

    /* JADX INFO: renamed from: com.google.firebase.messaging.w$a */
    public static class a {

        /* JADX INFO: renamed from: d */
        public static final long f16448d = TimeUnit.DAYS.toMillis(7);

        /* JADX INFO: renamed from: a */
        public final String f16449a;

        /* JADX INFO: renamed from: b */
        public final String f16450b;

        /* JADX INFO: renamed from: c */
        public final long f16451c;

        public a(long j10, String str, String str2) {
            this.f16449a = str;
            this.f16450b = str2;
            this.f16451c = j10;
        }

        /* JADX INFO: renamed from: a */
        public static String m9294a(long j10, String str, String str2) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j10);
                return jSONObject.toString();
            } catch (JSONException e10) {
                Log.w("FirebaseMessaging", "Failed to encode token: " + e10);
                return null;
            }
        }

        /* JADX INFO: renamed from: b */
        public static a m9295b(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new a(0L, str, null);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new a(jSONObject.getLong("timestamp"), jSONObject.getString("token"), jSONObject.getString("appVersion"));
            } catch (JSONException e10) {
                Log.w("FirebaseMessaging", "Failed to parse token: " + e10);
                return null;
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C3260w(Context context) {
        boolean zIsEmpty;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f16447a = sharedPreferences;
        Object obj = C7472a.f41322a;
        File file = new File(C7472a.c.m14850c(context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    try {
                        zIsEmpty = sharedPreferences.getAll().isEmpty();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (zIsEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                synchronized (this) {
                    try {
                        sharedPreferences.edit().clear().commit();
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        } catch (IOException e10) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e10.getMessage());
            }
        }
    }
}
