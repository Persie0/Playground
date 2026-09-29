package p000;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdd;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class lxb extends r2c {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f50280e = 3;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f50281f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f50282g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lxb(C3600t6 c3600t6, Activity activity) {
        super((v3c) c3600t6.f61897b, true);
        this.f50282g = activity;
        this.f50281f = c3600t6;
    }

    @Override // p000.r2c
    /* JADX INFO: renamed from: a */
    public final void mo40a() {
        switch (this.f50280e) {
            case 0:
                eub eubVar = ((v3c) this.f50281f).f64811f;
                lda.m16130p(eubVar);
                eubVar.setConditionalUserProperty((Bundle) this.f50282g, this.f58538a);
                break;
            case 1:
                eub eubVar2 = ((v3c) this.f50281f).f64811f;
                lda.m16130p(eubVar2);
                eubVar2.retrieveAndUploadBatches(new gzb(this, (kj3) this.f50282g));
                break;
            case 2:
                eub eubVar3 = ((v3c) this.f50281f).f64811f;
                lda.m16130p(eubVar3);
                eubVar3.logHealthData(5, "Error with data collection. Data lost.", new lp6((Exception) this.f50282g), new lp6(null), new lp6(null));
                break;
            default:
                eub eubVar4 = ((v3c) ((C3600t6) this.f50281f).f61897b).f64811f;
                lda.m16130p(eubVar4);
                eubVar4.onActivityDestroyedByScionActivityInfo(zzdd.m5439r((Activity) this.f50282g), this.f58539b);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lxb(v3c v3cVar, kj3 kj3Var) {
        super(v3cVar, true);
        this.f50282g = kj3Var;
        this.f50281f = v3cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lxb(v3c v3cVar, Bundle bundle) {
        super(v3cVar, true);
        this.f50282g = bundle;
        Objects.requireNonNull(v3cVar);
        this.f50281f = v3cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lxb(v3c v3cVar, Exception exc) {
        super(v3cVar, false);
        this.f50282g = exc;
        this.f50281f = v3cVar;
    }
}
