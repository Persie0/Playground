package android.support.v4.media.session;

import android.media.session.MediaController;
import android.media.session.MediaSession;
import com.lingq.core.player.service.PlayerService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p000.gu5;
import p000.ho2;
import p000.xx3;

/* JADX INFO: renamed from: android.support.v4.media.session.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C0027a {

    /* JADX INFO: renamed from: a */
    public final MediaController f983a;

    /* JADX INFO: renamed from: b */
    public final Object f984b = new Object();

    /* JADX INFO: renamed from: c */
    public final ArrayList f985c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final HashMap f986d = new HashMap();

    /* JADX INFO: renamed from: e */
    public final MediaSessionCompat$Token f987e;

    public C0027a(PlayerService playerService, MediaSessionCompat$Token mediaSessionCompat$Token) {
        xx3 xx3Var;
        this.f987e = mediaSessionCompat$Token;
        MediaController mediaController = new MediaController(playerService, (MediaSession.Token) mediaSessionCompat$Token.f959b);
        this.f983a = mediaController;
        synchronized (mediaSessionCompat$Token.f958a) {
            xx3Var = mediaSessionCompat$Token.f960c;
        }
        if (xx3Var == null) {
            ResultReceiverC0026x50fd9e4a resultReceiverC0026x50fd9e4a = new ResultReceiverC0026x50fd9e4a(null);
            resultReceiverC0026x50fd9e4a.f954a = new WeakReference(this);
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, resultReceiverC0026x50fd9e4a);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m629a() {
        xx3 xx3Var;
        ArrayList arrayList = this.f985c;
        MediaSessionCompat$Token mediaSessionCompat$Token = this.f987e;
        synchronized (mediaSessionCompat$Token.f958a) {
            xx3Var = mediaSessionCompat$Token.f960c;
        }
        if (xx3Var == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            arrayList.clear();
        } else if (it.next() != null) {
            ho2.m13383c();
        } else {
            this.f986d.put(null, new gu5());
            throw null;
        }
    }
}
