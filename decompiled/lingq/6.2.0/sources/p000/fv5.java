package p000;

import android.media.session.MediaSession;
import android.os.Handler;
import android.os.RemoteCallbackList;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.BinderC0028b;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;
import com.lingq.core.player.service.PlayerService;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class fv5 implements ev5 {

    /* JADX INFO: renamed from: a */
    public final MediaSession f39749a;

    /* JADX INFO: renamed from: b */
    public final MediaSessionCompat$Token f39750b;

    /* JADX INFO: renamed from: c */
    public final Object f39751c = new Object();

    /* JADX INFO: renamed from: d */
    public final RemoteCallbackList f39752d = new RemoteCallbackList();

    /* JADX INFO: renamed from: e */
    public PlaybackStateCompat f39753e;

    /* JADX INFO: renamed from: f */
    public MediaMetadataCompat f39754f;

    /* JADX INFO: renamed from: g */
    public dv5 f39755g;

    public fv5(PlayerService playerService, String str) {
        MediaSession mediaSession = new MediaSession(playerService, str, null);
        this.f39749a = mediaSession;
        this.f39750b = new MediaSessionCompat$Token(mediaSession.getSessionToken(), new BinderC0028b(this));
        mediaSession.setFlags(3);
    }

    /* JADX INFO: renamed from: a */
    public final void m12212a(dv5 dv5Var, Handler handler) {
        synchronized (this.f39751c) {
            this.f39755g = dv5Var;
            HandlerC3718wd handlerC3718wd = null;
            this.f39749a.setCallback(dv5Var == null ? null : dv5Var.f36268b, handler);
            if (dv5Var != null) {
                synchronized (dv5Var.f36267a) {
                    try {
                        dv5Var.f36269c = new WeakReference(this);
                        HandlerC3718wd handlerC3718wd2 = dv5Var.f36270d;
                        if (handlerC3718wd2 != null) {
                            handlerC3718wd2.removeCallbacksAndMessages(null);
                        }
                        if (handler != null) {
                            handlerC3718wd = new HandlerC3718wd(dv5Var, handler.getLooper(), 2);
                        }
                        dv5Var.f36270d = handlerC3718wd;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }
}
