package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class a1c extends r2c {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f77e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ptb f78f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ v3c f79g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1c(v3c v3cVar, String str, ptb ptbVar) {
        super(v3cVar, true);
        this.f77e = str;
        this.f78f = ptbVar;
        Objects.requireNonNull(v3cVar);
        this.f79g = v3cVar;
    }

    @Override // p000.r2c
    /* JADX INFO: renamed from: a */
    public final void mo40a() {
        eub eubVar = this.f79g.f64811f;
        lda.m16130p(eubVar);
        eubVar.getMaxUserProperties(this.f77e, this.f78f);
    }

    @Override // p000.r2c
    /* JADX INFO: renamed from: b */
    public final void mo41b() {
        this.f78f.mo16549u(null);
    }
}
