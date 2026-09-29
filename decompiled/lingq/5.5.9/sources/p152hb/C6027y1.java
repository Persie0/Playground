package p152hb;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC2544c;
import com.google.android.gms.common.api.C2542a;
import p176ib.C6272i;

/* JADX INFO: renamed from: hb.y1 */
/* JADX INFO: loaded from: classes.dex */
public final class C6027y1 implements AbstractC2544c.a, AbstractC2544c.b {

    /* JADX INFO: renamed from: a */
    public final C2542a<?> f35627a;

    /* JADX INFO: renamed from: b */
    public final boolean f35628b;

    /* JADX INFO: renamed from: c */
    public InterfaceC6030z1 f35629c;

    public C6027y1(C2542a<?> c2542a, boolean z10) {
        this.f35627a = c2542a;
        this.f35628b = z10;
    }

    @Override // p152hb.InterfaceC5957c
    /* JADX INFO: renamed from: b1 */
    public final void mo12397b1(Bundle bundle) {
        C6272i.m12916j(this.f35629c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.f35629c.mo12397b1(bundle);
    }

    @Override // p152hb.InterfaceC5957c
    /* JADX INFO: renamed from: h */
    public final void mo12398h(int i10) {
        C6272i.m12916j(this.f35629c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.f35629c.mo12398h(i10);
    }

    @Override // p152hb.InterfaceC5980j
    /* JADX INFO: renamed from: j */
    public final void mo494j(ConnectionResult connectionResult) {
        C6272i.m12916j(this.f35629c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.f35629c.mo12439h0(connectionResult, this.f35627a, this.f35628b);
    }
}
