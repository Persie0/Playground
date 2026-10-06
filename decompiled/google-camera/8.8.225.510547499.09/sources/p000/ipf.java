package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ipf extends kfv {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ipg f31693a;

    /* JADX INFO: renamed from: b */
    private final key f31694b;

    /* JADX INFO: renamed from: c */
    private final boolean f31695c;

    /* JADX INFO: renamed from: d */
    private final kcc f31696d;

    public ipf(ipg ipgVar, key keyVar, boolean z) {
        this.f31693a = ipgVar;
        this.f31694b = keyVar;
        this.f31695c = z;
        this.f31696d = ipgVar.f31701e.mo13957a(true != z ? "VFE.FrameToImg" : "VFE.FrameToMd");
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bc */
    public final void mo4007bc() {
        if (this.f31695c) {
            this.f31696d.mo13952a();
            this.f31693a.m11586f(this.f31694b);
        }
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bi */
    public final void mo5510bi() {
        if (this.f31695c) {
            return;
        }
        this.f31696d.mo13952a();
        this.f31693a.m11586f(this.f31694b);
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bw */
    public final Executor mo11578bw() {
        return this.f31693a.f31698b;
    }
}
