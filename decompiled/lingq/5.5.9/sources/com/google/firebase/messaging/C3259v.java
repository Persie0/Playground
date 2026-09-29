package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.firebase.messaging.v */
/* JADX INFO: loaded from: classes.dex */
public final class C3259v {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f16442a;

    /* JADX INFO: renamed from: e */
    public final Executor f16446e;

    /* JADX INFO: renamed from: d */
    public final ArrayDeque<String> f16445d = new ArrayDeque<>();

    /* JADX INFO: renamed from: b */
    public final String f16443b = "topic_operation_queue";

    /* JADX INFO: renamed from: c */
    public final String f16444c = ",";

    public C3259v(SharedPreferences sharedPreferences, Executor executor) {
        this.f16442a = sharedPreferences;
        this.f16446e = executor;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static C3259v m9293a(SharedPreferences sharedPreferences, Executor executor) {
        C3259v c3259v = new C3259v(sharedPreferences, executor);
        synchronized (c3259v.f16445d) {
            c3259v.f16445d.clear();
            String string = c3259v.f16442a.getString(c3259v.f16443b, "");
            if (!TextUtils.isEmpty(string) && string.contains(c3259v.f16444c)) {
                String[] strArrSplit = string.split(c3259v.f16444c, -1);
                if (strArrSplit.length == 0) {
                    Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for (String str : strArrSplit) {
                    if (!TextUtils.isEmpty(str)) {
                        c3259v.f16445d.add(str);
                    }
                }
            }
        }
        return c3259v;
    }
}
