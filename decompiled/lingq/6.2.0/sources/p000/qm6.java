package p000;

import android.app.Notification;
import android.media.session.MediaSession;
import android.support.v4.media.session.MediaSessionCompat$Token;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qm6 {
    /* JADX INFO: renamed from: a */
    public static Notification.MediaStyle m20027a() {
        return new Notification.MediaStyle();
    }

    /* JADX INFO: renamed from: b */
    public static Notification.MediaStyle m20028b(Notification.MediaStyle mediaStyle, int[] iArr, MediaSessionCompat$Token mediaSessionCompat$Token) {
        if (iArr != null) {
            m20031e(mediaStyle, iArr);
        }
        if (mediaSessionCompat$Token != null) {
            m20029c(mediaStyle, (MediaSession.Token) mediaSessionCompat$Token.f959b);
        }
        return mediaStyle;
    }

    /* JADX INFO: renamed from: c */
    public static void m20029c(Notification.MediaStyle mediaStyle, MediaSession.Token token) {
        mediaStyle.setMediaSession(token);
    }

    /* JADX INFO: renamed from: d */
    public static void m20030d(Notification.Builder builder, Notification.MediaStyle mediaStyle) {
        builder.setStyle(mediaStyle);
    }

    /* JADX INFO: renamed from: e */
    public static void m20031e(Notification.MediaStyle mediaStyle, int... iArr) {
        mediaStyle.setShowActionsInCompactView(iArr);
    }
}
