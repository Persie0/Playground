package p000;

import android.app.Notification;
import android.media.AudioAttributes;
import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class abh {
    /* JADX INFO: renamed from: a */
    public static Notification.Builder m103a(Notification.Builder builder, String str) {
        return builder.addPerson(str);
    }

    /* JADX INFO: renamed from: b */
    public static Notification.Builder m104b(Notification.Builder builder, String str) {
        return builder.setCategory(str);
    }

    /* JADX INFO: renamed from: c */
    public static Notification.Builder m105c(Notification.Builder builder, int i) {
        return builder.setColor(i);
    }

    /* JADX INFO: renamed from: d */
    public static Notification.Builder m106d(Notification.Builder builder, Notification notification) {
        return builder.setPublicVersion(notification);
    }

    /* JADX INFO: renamed from: e */
    public static Notification.Builder m107e(Notification.Builder builder, Uri uri, Object obj) {
        return builder.setSound(uri, (AudioAttributes) obj);
    }

    /* JADX INFO: renamed from: f */
    public static Notification.Builder m108f(Notification.Builder builder, int i) {
        return builder.setVisibility(i);
    }
}
