package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.google.firebase.messaging.z */
/* JADX INFO: loaded from: classes.dex */
public final class C3263z {

    /* JADX INFO: renamed from: b */
    public static WeakReference<C3263z> f16460b;

    /* JADX INFO: renamed from: a */
    public C3259v f16461a;

    public C3263z(SharedPreferences sharedPreferences, ScheduledExecutorService scheduledExecutorService) {
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final synchronized C3262y m9299a() {
        String strPeek;
        C3262y c3262y;
        try {
            C3259v c3259v = this.f16461a;
            synchronized (c3259v.f16445d) {
                try {
                    strPeek = c3259v.f16445d.peek();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Pattern pattern = C3262y.f16456d;
            if (!TextUtils.isEmpty(strPeek)) {
                String[] strArrSplit = strPeek.split("!", -1);
                if (strArrSplit.length == 2) {
                    c3262y = new C3262y(strArrSplit[0], strArrSplit[1]);
                }
            }
            c3262y = null;
        } catch (Throwable th3) {
            throw th3;
        }
        return c3262y;
    }
}
