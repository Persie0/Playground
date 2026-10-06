package p000;

import android.app.Notification;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class abe {
    /* JADX INFO: renamed from: a */
    public static Notification.Builder m86a(Notification.Builder builder, boolean z) {
        return builder.setShowWhen(z);
    }

    /* JADX INFO: renamed from: b */
    public static void m87b(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }
}
