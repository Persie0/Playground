package p000;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdd;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class qxb extends r2c {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f58353e = 2;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f58354f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f58355g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ v3c f58356h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f58357i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxb(v3c v3cVar, zzdd zzddVar, String str, String str2) {
        super(v3cVar, true);
        this.f58357i = zzddVar;
        this.f58354f = str;
        this.f58355g = str2;
        Objects.requireNonNull(v3cVar);
        this.f58356h = v3cVar;
    }

    @Override // p000.r2c
    /* JADX INFO: renamed from: a */
    public final void mo40a() {
        switch (this.f58353e) {
            case 0:
                eub eubVar = this.f58356h.f64811f;
                lda.m16130p(eubVar);
                eubVar.clearConditionalUserProperty(this.f58354f, this.f58355g, (Bundle) this.f58357i);
                break;
            case 1:
                eub eubVar2 = this.f58356h.f64811f;
                lda.m16130p(eubVar2);
                eubVar2.getConditionalUserProperties(this.f58354f, this.f58355g, (ptb) this.f58357i);
                break;
            default:
                eub eubVar3 = this.f58356h.f64811f;
                lda.m16130p(eubVar3);
                eubVar3.setCurrentScreenByScionActivityInfo((zzdd) this.f58357i, this.f58354f, this.f58355g, this.f58538a);
                break;
        }
    }

    @Override // p000.r2c
    /* JADX INFO: renamed from: b */
    public void mo41b() {
        switch (this.f58353e) {
            case 1:
                ((ptb) this.f58357i).mo16549u(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxb(v3c v3cVar, String str, String str2, Bundle bundle) {
        super(v3cVar, true);
        this.f58354f = str;
        this.f58355g = str2;
        this.f58357i = bundle;
        Objects.requireNonNull(v3cVar);
        this.f58356h = v3cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxb(v3c v3cVar, String str, String str2, ptb ptbVar) {
        super(v3cVar, true);
        this.f58354f = str;
        this.f58355g = str2;
        this.f58357i = ptbVar;
        Objects.requireNonNull(v3cVar);
        this.f58356h = v3cVar;
    }
}
