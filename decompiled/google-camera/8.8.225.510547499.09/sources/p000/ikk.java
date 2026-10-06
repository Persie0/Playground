package p000;

import android.graphics.PointF;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ikk implements iqd {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ iqd f31350a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ dxh f31351b;

    public ikk(iqd iqdVar, dxh dxhVar) {
        this.f31350a = iqdVar;
        this.f31351b = dxhVar;
    }

    @Override // p000.iqd
    /* JADX INFO: renamed from: a */
    public final boolean mo3470a(PointF pointF) {
        this.f31350a.mo3470a(new PointF(pointF.x - this.f31351b.mo4145c().x, pointF.y - this.f31351b.mo4145c().y));
        return false;
    }

    @Override // p000.iqd
    /* JADX INFO: renamed from: b */
    public final void mo3484b() {
        this.f31350a.mo3484b();
    }

    @Override // p000.iqd
    /* JADX INFO: renamed from: f */
    public final boolean mo3488f(PointF pointF) {
        this.f31350a.mo3488f(new PointF(pointF.x - this.f31351b.mo4145c().x, pointF.y - this.f31351b.mo4145c().y));
        return false;
    }
}
