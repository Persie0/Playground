package p176ib;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: renamed from: ib.t0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6295t0 extends AbstractC6267f0 {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ AbstractC6251a f36498g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6295t0(AbstractC6251a abstractC6251a, int i10) {
        super(abstractC6251a, i10, null);
        this.f36498g = abstractC6251a;
    }

    @Override // p176ib.AbstractC6267f0
    /* JADX INFO: renamed from: c */
    public final void mo12903c(ConnectionResult connectionResult) {
        AbstractC6251a abstractC6251a = this.f36498g;
        abstractC6251a.getClass();
        abstractC6251a.f36402J.mo12467a(connectionResult);
        abstractC6251a.m12873G(connectionResult);
    }

    @Override // p176ib.AbstractC6267f0
    /* JADX INFO: renamed from: d */
    public final boolean mo12904d() {
        this.f36498g.f36402J.mo12467a(ConnectionResult.f13855e);
        return true;
    }
}
