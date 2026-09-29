package p000;

import android.app.Notification;
import android.app.PendingIntent;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rm6 {
    /* JADX INFO: renamed from: a */
    public static Notification.MediaStyle m20713a(Notification.MediaStyle mediaStyle, CharSequence charSequence, int i, PendingIntent pendingIntent, Boolean bool) {
        if (bool.booleanValue()) {
            mediaStyle.setRemotePlaybackInfo(charSequence, i, pendingIntent);
        }
        return mediaStyle;
    }
}
