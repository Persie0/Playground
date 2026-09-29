package p000;

import android.app.Activity;
import com.google.android.gms.internal.measurement.zzdd;

/* JADX INFO: loaded from: classes.dex */
public final class c3c extends r2c {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f9429e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Activity f9430f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C3600t6 f9431g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3c(C3600t6 c3600t6, Activity activity, int i) {
        super((v3c) c3600t6.f61897b, true);
        this.f9429e = i;
        switch (i) {
            case 1:
                this.f9430f = activity;
                this.f9431g = c3600t6;
                super((v3c) c3600t6.f61897b, true);
                break;
            case 2:
                this.f9430f = activity;
                this.f9431g = c3600t6;
                super((v3c) c3600t6.f61897b, true);
                break;
            case 3:
                this.f9430f = activity;
                this.f9431g = c3600t6;
                super((v3c) c3600t6.f61897b, true);
                break;
            default:
                this.f9430f = activity;
                this.f9431g = c3600t6;
                break;
        }
    }

    @Override // p000.r2c
    /* JADX INFO: renamed from: a */
    public final void mo40a() {
        switch (this.f9429e) {
            case 0:
                eub eubVar = ((v3c) this.f9431g.f61897b).f64811f;
                lda.m16130p(eubVar);
                eubVar.onActivityStartedByScionActivityInfo(zzdd.m5439r(this.f9430f), this.f58539b);
                break;
            case 1:
                eub eubVar2 = ((v3c) this.f9431g.f61897b).f64811f;
                lda.m16130p(eubVar2);
                eubVar2.onActivityResumedByScionActivityInfo(zzdd.m5439r(this.f9430f), this.f58539b);
                break;
            case 2:
                eub eubVar3 = ((v3c) this.f9431g.f61897b).f64811f;
                lda.m16130p(eubVar3);
                eubVar3.onActivityPausedByScionActivityInfo(zzdd.m5439r(this.f9430f), this.f58539b);
                break;
            default:
                eub eubVar4 = ((v3c) this.f9431g.f61897b).f64811f;
                lda.m16130p(eubVar4);
                eubVar4.onActivityStoppedByScionActivityInfo(zzdd.m5439r(this.f9430f), this.f58539b);
                break;
        }
    }
}
