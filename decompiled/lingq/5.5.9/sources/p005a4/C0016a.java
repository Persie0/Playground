package p005a4;

import android.app.Notification;
import android.media.session.MediaSession;
import android.support.v4.media.session.MediaSessionCompat;

/* JADX INFO: renamed from: a4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0016a {
    /* JADX INFO: renamed from: a */
    public static Notification.MediaStyle m55a() {
        return new Notification.MediaStyle();
    }

    /* JADX INFO: renamed from: b */
    public static Notification.MediaStyle m56b(Notification.MediaStyle mediaStyle, int[] iArr, MediaSessionCompat.Token token) {
        if (iArr != null) {
            m59e(mediaStyle, iArr);
        }
        if (token != null) {
            m57c(mediaStyle, (MediaSession.Token) token.f375b);
        }
        return mediaStyle;
    }

    /* JADX INFO: renamed from: c */
    public static void m57c(Notification.MediaStyle mediaStyle, MediaSession.Token token) {
        mediaStyle.setMediaSession(token);
    }

    /* JADX INFO: renamed from: d */
    public static void m58d(Notification.Builder builder, Notification.MediaStyle mediaStyle) {
        builder.setStyle(mediaStyle);
    }

    /* JADX INFO: renamed from: e */
    public static void m59e(Notification.MediaStyle mediaStyle, int... iArr) {
        mediaStyle.setShowActionsInCompactView(iArr);
    }
}
