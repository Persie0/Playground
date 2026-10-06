package p000;

import android.os.Handler;
import android.os.Looper;
import com.google.p020vr.cardboard.ExternalSurfaceManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ofi implements off {

    /* JADX INFO: renamed from: a */
    private final Runnable f45849a;

    /* JADX INFO: renamed from: b */
    private final long f45850b;

    /* JADX INFO: renamed from: c */
    private final Handler f45851c = new Handler(Looper.getMainLooper());

    public ofi(final long j, long j2) {
        this.f45849a = new Runnable() { // from class: ofh
            @Override // java.lang.Runnable
            public final void run() {
                ExternalSurfaceManager.nativeCallback(j);
            }
        };
        this.f45850b = j2;
    }

    @Override // p000.off
    /* JADX INFO: renamed from: a */
    public final void mo18458a() {
        this.f45851c.removeCallbacks(this.f45849a);
    }

    @Override // p000.off
    /* JADX INFO: renamed from: b */
    public final void mo18459b() {
        ExternalSurfaceManager.nativeCallback(this.f45850b);
    }

    @Override // p000.off
    /* JADX INFO: renamed from: c */
    public final void mo18460c() {
        this.f45851c.post(this.f45849a);
    }
}
