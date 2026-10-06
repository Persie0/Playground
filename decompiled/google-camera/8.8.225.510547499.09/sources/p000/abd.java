package p000;

import android.app.Notification;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class abd {
    /* JADX INFO: renamed from: a */
    public static Notification.Builder m81a(Notification.Builder builder, int i) {
        return builder.setPriority(i);
    }

    /* JADX INFO: renamed from: b */
    public static Notification.Builder m82b(Notification.Builder builder, CharSequence charSequence) {
        return builder.setSubText(charSequence);
    }

    /* JADX INFO: renamed from: c */
    public static Notification.Builder m83c(Notification.Builder builder, boolean z) {
        return builder.setUsesChronometer(z);
    }

    /* JADX INFO: renamed from: d */
    public static Notification m84d(Notification.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: renamed from: e */
    public static String m85e(Locale locale) {
        return ady.m314c(ady.m312a(ady.m313b(locale)));
    }
}
