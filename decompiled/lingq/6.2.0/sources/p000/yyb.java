package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class yyb extends r2c {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f70657e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f70658f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ v3c f70659g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yyb(v3c v3cVar, String str, int i) {
        super(v3cVar, true);
        this.f70657e = i;
        switch (i) {
            case 1:
                this.f70658f = str;
                Objects.requireNonNull(v3cVar);
                this.f70659g = v3cVar;
                super(v3cVar, true);
                break;
            default:
                this.f70658f = str;
                Objects.requireNonNull(v3cVar);
                this.f70659g = v3cVar;
                break;
        }
    }

    @Override // p000.r2c
    /* JADX INFO: renamed from: a */
    public final void mo40a() {
        switch (this.f70657e) {
            case 0:
                eub eubVar = this.f70659g.f64811f;
                lda.m16130p(eubVar);
                eubVar.beginAdUnitExposure(this.f70658f, this.f58539b);
                break;
            default:
                eub eubVar2 = this.f70659g.f64811f;
                lda.m16130p(eubVar2);
                eubVar2.endAdUnitExposure(this.f70658f, this.f58539b);
                break;
        }
    }
}
