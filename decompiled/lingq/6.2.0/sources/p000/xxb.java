package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class xxb extends r2c {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f68931e = 0;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ v3c f68932f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f68933g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xxb(v3c v3cVar, String str) {
        super(v3cVar, true);
        this.f68933g = str;
        Objects.requireNonNull(v3cVar);
        this.f68932f = v3cVar;
    }

    @Override // p000.r2c
    /* JADX INFO: renamed from: a */
    public final void mo40a() {
        switch (this.f68931e) {
            case 0:
                eub eubVar = this.f68932f.f64811f;
                lda.m16130p(eubVar);
                eubVar.setUserId((String) this.f68933g, this.f58538a);
                break;
            default:
                eub eubVar2 = this.f68932f.f64811f;
                lda.m16130p(eubVar2);
                eubVar2.registerOnMeasurementEventListener((w2c) this.f68933g);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xxb(v3c v3cVar, w2c w2cVar) {
        super(v3cVar, true);
        this.f68933g = w2cVar;
        this.f68932f = v3cVar;
    }
}
