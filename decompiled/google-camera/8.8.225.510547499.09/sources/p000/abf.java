package p000;

import android.app.Notification;
import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class abf {
    /* JADX INFO: renamed from: a */
    public static Notification.Builder m88a(Notification.Builder builder, Bundle bundle) {
        return builder.setExtras(bundle);
    }

    /* JADX INFO: renamed from: b */
    public static void m89b(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m90c(Object obj) {
        if (obj == null) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m91d(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException((String) obj2);
        }
    }
}
