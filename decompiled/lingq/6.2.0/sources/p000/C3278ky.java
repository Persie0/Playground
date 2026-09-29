package p000;

import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: renamed from: ky */
/* JADX INFO: loaded from: classes2.dex */
public final class C3278ky {

    /* JADX INFO: renamed from: a */
    public int f48571a;

    /* JADX INFO: renamed from: b */
    public AudioManager.OnAudioFocusChangeListener f48572b;

    /* JADX INFO: renamed from: c */
    public Handler f48573c;

    /* JADX INFO: renamed from: d */
    public C3476px f48574d = C3476px.f56934c;

    /* JADX INFO: renamed from: e */
    public boolean f48575e;

    /* JADX INFO: renamed from: f */
    public boolean f48576f;

    public C3278ky(int i) {
        this.f48571a = i;
    }

    /* JADX INFO: renamed from: a */
    public final C3315ly m15722a() {
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f48572b;
        if (onAudioFocusChangeListener == null) {
            C3386nv.m17633t("Can't build an AudioFocusRequestCompat instance without a listener");
            return null;
        }
        int i = this.f48571a;
        Handler handler = this.f48573c;
        handler.getClass();
        return new C3315ly(i, onAudioFocusChangeListener, handler, this.f48574d, this.f48575e, this.f48576f);
    }

    /* JADX INFO: renamed from: b */
    public final void m15723b() {
        this.f48576f = true;
    }

    /* JADX INFO: renamed from: c */
    public final void m15724c(C3476px c3476px) {
        c3476px.getClass();
        this.f48574d = c3476px;
    }

    /* JADX INFO: renamed from: d */
    public final void m15725d(C3092hy c3092hy, Handler handler) {
        handler.getClass();
        this.f48572b = c3092hy;
        this.f48573c = handler;
    }

    /* JADX INFO: renamed from: e */
    public final void m15726e(boolean z) {
        this.f48575e = z;
    }
}
