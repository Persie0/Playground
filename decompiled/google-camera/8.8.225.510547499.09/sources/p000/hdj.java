package p000;

import android.graphics.Bitmap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hdj implements gyi {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hdk f27318a;

    /* JADX INFO: renamed from: b */
    private final Set f27319b = new HashSet();

    public hdj(hdk hdkVar) {
        this.f27318a = hdkVar;
    }

    /* JADX INFO: renamed from: a */
    private final synchronized void m10118a(gyu gyuVar, gyw gywVar) {
        gyw gywVar2 = gyw.UNKNOWN;
        switch (gywVar.ordinal()) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 12:
            case 14:
                if (this.f27319b.add(gyuVar)) {
                    this.f27318a.f27326b.m13541c(new gxw(this, 9));
                    break;
                }
            default:
                break;
        }
        throw th;
    }

    /* JADX INFO: renamed from: b */
    private final synchronized void m10119b(gyu gyuVar) {
        if (this.f27319b.remove(gyuVar)) {
            this.f27318a.f27327c.postDelayed(new gxw(this, 10), 3000L);
        }
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: j */
    public final void mo3957j(gyu gyuVar) {
        m10119b(gyuVar);
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void mo3958k(gyu gyuVar) {
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: l */
    public final void mo3959l(gyu gyuVar) {
        m10119b(gyuVar);
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
        m10118a(gyuVar, gypVar.f26867c);
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void mo3965r(gyu gyuVar) {
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: x */
    public final void mo3971x(gyu gyuVar) {
        m10119b(gyuVar);
    }
}
