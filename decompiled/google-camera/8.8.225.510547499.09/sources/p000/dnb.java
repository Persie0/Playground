package p000;

import android.graphics.Bitmap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dnb extends dnd implements fbp, fbd, fbg, gyi {

    /* JADX INFO: renamed from: a */
    private final gye f12072a;

    /* JADX INFO: renamed from: b */
    private final Set f12073b = new HashSet();

    /* JADX INFO: renamed from: c */
    private volatile boolean f12074c;

    /* JADX INFO: renamed from: d */
    private final bko f12075d;

    public dnb(bko bkoVar, gye gyeVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f12075d = bkoVar;
        this.f12072a = gyeVar;
    }

    /* JADX INFO: renamed from: F */
    private final void m6421F() {
        boolean z = !this.f12073b.isEmpty();
        if (this.f12074c != z) {
            this.f12074c = z;
        }
    }

    @Override // p000.fbg
    /* JADX INFO: renamed from: bC */
    public final void mo3521bC() {
        this.f12072a.m9973h(this);
    }

    @Override // p000.fbd
    /* JADX INFO: renamed from: bI */
    public final void mo6422bI() {
        this.f12072a.m9966a(this);
    }

    @Override // p000.dnd
    /* JADX INFO: renamed from: g */
    public final void mo6423g(double d) {
        if (this.f12074c && d > ohp.m18493b()) {
            this.f12075d.m2632z();
        }
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: j */
    public final void mo3957j(gyu gyuVar) {
        this.f12073b.remove(gyuVar);
        m6421F();
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void mo3958k(gyu gyuVar) {
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: l */
    public final void mo3959l(gyu gyuVar) {
        this.f12073b.remove(gyuVar);
        m6421F();
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void mo3960m(long j) {
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void mo3961n(Bitmap bitmap) {
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void mo3962o(Bitmap bitmap, int i) {
        jib.m13195D(this, bitmap);
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void mo3963p(gyu gyuVar, kbb kbbVar) {
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: q */
    public final void mo3964q(gyu gyuVar, gyp gypVar, gyx gyxVar) {
        this.f12073b.add(gyuVar);
        m6421F();
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void mo3965r(gyu gyuVar) {
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: x */
    public final void mo3971x(gyu gyuVar) {
        this.f12073b.remove(gyuVar);
        m6421F();
    }
}
