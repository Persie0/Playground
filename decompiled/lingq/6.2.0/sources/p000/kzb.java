package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class kzb extends r2c {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f48827e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ptb f48828f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ v3c f48829g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kzb(v3c v3cVar, ptb ptbVar, int i) {
        super(v3cVar, true);
        this.f48827e = i;
        switch (i) {
            case 1:
                this.f48828f = ptbVar;
                Objects.requireNonNull(v3cVar);
                this.f48829g = v3cVar;
                super(v3cVar, true);
                break;
            case 2:
                this.f48828f = ptbVar;
                Objects.requireNonNull(v3cVar);
                this.f48829g = v3cVar;
                super(v3cVar, true);
                break;
            default:
                this.f48828f = ptbVar;
                Objects.requireNonNull(v3cVar);
                this.f48829g = v3cVar;
                break;
        }
    }

    @Override // p000.r2c
    /* JADX INFO: renamed from: a */
    public final void mo40a() {
        switch (this.f48827e) {
            case 0:
                eub eubVar = this.f48829g.f64811f;
                lda.m16130p(eubVar);
                eubVar.getGmpAppId(this.f48828f);
                break;
            case 1:
                eub eubVar2 = this.f48829g.f64811f;
                lda.m16130p(eubVar2);
                eubVar2.getCachedAppInstanceId(this.f48828f);
                break;
            case 2:
                eub eubVar3 = this.f48829g.f64811f;
                lda.m16130p(eubVar3);
                eubVar3.generateEventId(this.f48828f);
                break;
            case 3:
                eub eubVar4 = this.f48829g.f64811f;
                lda.m16130p(eubVar4);
                eubVar4.getCurrentScreenName(this.f48828f);
                break;
            default:
                eub eubVar5 = this.f48829g.f64811f;
                lda.m16130p(eubVar5);
                eubVar5.getCurrentScreenClass(this.f48828f);
                break;
        }
    }

    @Override // p000.r2c
    /* JADX INFO: renamed from: b */
    public final void mo41b() {
        int i = this.f48827e;
        ptb ptbVar = this.f48828f;
        switch (i) {
            case 0:
                ptbVar.mo16549u(null);
                break;
            case 1:
                ptbVar.mo16549u(null);
                break;
            case 2:
                ptbVar.mo16549u(null);
                break;
            case 3:
                ptbVar.mo16549u(null);
                break;
            default:
                ptbVar.mo16549u(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kzb(v3c v3cVar, ptb ptbVar, int i, boolean z) {
        super(v3cVar, true);
        this.f48827e = i;
        this.f48828f = ptbVar;
        this.f48829g = v3cVar;
    }
}
