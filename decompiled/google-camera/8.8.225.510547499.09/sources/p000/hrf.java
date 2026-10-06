package p000;

import android.view.View;
import android.view.ViewGroup;
import p021j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class hrf {

    /* JADX INFO: renamed from: a */
    public Duration f29266a;

    /* JADX INFO: renamed from: b */
    public ViewGroup f29267b;

    /* JADX INFO: renamed from: e */
    public gfa f29270e;

    /* JADX INFO: renamed from: f */
    public elx f29271f;

    /* JADX INFO: renamed from: g */
    public fcp f29272g;

    /* JADX INFO: renamed from: c */
    public View f29268c = null;

    /* JADX INFO: renamed from: i */
    private final Runnable f29274i = hde.f27302d;

    /* JADX INFO: renamed from: d */
    public boolean f29269d = false;

    /* JADX INFO: renamed from: h */
    public int f29273h = 1;

    /* JADX INFO: renamed from: a */
    public final hrg m10649a() {
        this.f29271f.getClass();
        boolean z = this.f29269d;
        if (z && this.f29268c == null) {
            this.f29270e.getClass();
            this.f29272g.getClass();
        } else {
            if (this.f29268c == null) {
                throw null;
            }
            this.f29267b.getClass();
        }
        hrg hrgVar = new hrg(this.f29266a, this.f29267b, this.f29268c, this.f29274i, this.f29273h, z, this.f29270e, this.f29272g);
        hrgVar.f29277c = new hri(this, hrgVar, 1);
        return hrgVar;
    }
}
