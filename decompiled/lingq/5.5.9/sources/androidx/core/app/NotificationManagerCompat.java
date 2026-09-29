package androidx.core.app;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class NotificationManagerCompat {

    /* JADX INFO: renamed from: a */
    public final NotificationManager f5568a;

    static {
        new HashSet();
    }

    public NotificationManagerCompat(Context context) {
        this.f5568a = (NotificationManager) context.getSystemService("notification");
    }

    public static NotificationManagerCompat from(Context context) {
        return new NotificationManagerCompat(context);
    }

    public boolean areNotificationsEnabled() {
        return this.f5568a.areNotificationsEnabled();
    }
}
