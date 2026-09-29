package p000;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class dxb extends r2c {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f36403e = 2;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f36404f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f36405g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f36406h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ v3c f36407i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f36408j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxb(v3c v3cVar, String str, String str2, Object obj, boolean z) {
        super(v3cVar, true);
        this.f36404f = str;
        this.f36405g = str2;
        this.f36408j = obj;
        this.f36406h = z;
        Objects.requireNonNull(v3cVar);
        this.f36407i = v3cVar;
    }

    @Override // p000.r2c
    /* JADX INFO: renamed from: a */
    public final void mo40a() {
        switch (this.f36403e) {
            case 0:
                eub eubVar = this.f36407i.f64811f;
                lda.m16130p(eubVar);
                eubVar.setUserProperty(this.f36404f, this.f36405g, new lp6(this.f36408j), this.f36406h, this.f58538a);
                break;
            case 1:
                eub eubVar2 = this.f36407i.f64811f;
                lda.m16130p(eubVar2);
                eubVar2.getUserProperties(this.f36404f, this.f36405g, this.f36406h, (ptb) this.f36408j);
                break;
            default:
                long j = this.f58538a;
                long j2 = this.f58539b;
                eub eubVar3 = this.f36407i.f64811f;
                lda.m16130p(eubVar3);
                eubVar3.logEventWithElapsedTime(this.f36404f, this.f36405g, (Bundle) this.f36408j, this.f36406h, true, j, j2);
                break;
        }
    }

    @Override // p000.r2c
    /* JADX INFO: renamed from: b */
    public void mo41b() {
        switch (this.f36403e) {
            case 1:
                ((ptb) this.f36408j).mo16549u(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxb(v3c v3cVar, String str, String str2, Bundle bundle, boolean z) {
        super(v3cVar, true);
        this.f36404f = str;
        this.f36405g = str2;
        this.f36408j = bundle;
        this.f36406h = z;
        this.f36407i = v3cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxb(v3c v3cVar, String str, String str2, boolean z, ptb ptbVar) {
        super(v3cVar, true);
        this.f36404f = str;
        this.f36405g = str2;
        this.f36406h = z;
        this.f36408j = ptbVar;
        Objects.requireNonNull(v3cVar);
        this.f36407i = v3cVar;
    }
}
