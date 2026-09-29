package p152hb;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: renamed from: hb.w */
/* JADX INFO: loaded from: classes.dex */
public final class C6019w extends AbstractC5984k0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ConnectionResult f35618b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C6025y f35619c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6019w(C6025y c6025y, C5966e0 c5966e0, ConnectionResult connectionResult) {
        super(c5966e0);
        this.f35619c = c6025y;
        this.f35618b = connectionResult;
    }

    @Override // p152hb.AbstractC5984k0
    /* JADX INFO: renamed from: a */
    public final void mo12385a() {
        this.f35619c.f35626c.m12417k(this.f35618b);
    }
}
