package p152hb;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C2542a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.InterfaceC2556b;
import java.util.Set;
import p176ib.AbstractC6251a;
import p176ib.C6272i;

/* JADX INFO: renamed from: hb.v0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6017v0 implements AbstractC6251a.c, InterfaceC5970f1 {

    /* JADX INFO: renamed from: a */
    public final C2542a.e f35608a;

    /* JADX INFO: renamed from: b */
    public final C5949a<?> f35609b;

    /* JADX INFO: renamed from: c */
    public InterfaceC2556b f35610c = null;

    /* JADX INFO: renamed from: d */
    public Set<Scope> f35611d = null;

    /* JADX INFO: renamed from: e */
    public boolean f35612e = false;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C5961d f35613f;

    public C6017v0(C5961d c5961d, C2542a.e eVar, C5949a<?> c5949a) {
        this.f35613f = c5961d;
        this.f35608a = eVar;
        this.f35609b = c5949a;
    }

    @Override // p176ib.AbstractC6251a.c
    /* JADX INFO: renamed from: a */
    public final void mo12467a(ConnectionResult connectionResult) {
        this.f35613f.f35440I.post(new RunnableC6014u0(this, connectionResult));
    }

    /* JADX INFO: renamed from: b */
    public final void m12468b(ConnectionResult connectionResult) {
        C6008s0 c6008s0 = (C6008s0) this.f35613f.f35451j.get(this.f35609b);
        if (c6008s0 != null) {
            C6272i.m12909c(c6008s0.f35592l.f35440I);
            C2542a.e eVar = c6008s0.f35582b;
            String name = eVar.getClass().getName();
            String strValueOf = String.valueOf(connectionResult);
            StringBuilder sb2 = new StringBuilder(name.length() + 25 + strValueOf.length());
            sb2.append("onSignInFailed for ");
            sb2.append(name);
            sb2.append(" with ");
            sb2.append(strValueOf);
            eVar.mo7542f(sb2.toString());
            c6008s0.m12465o(connectionResult, null);
        }
    }
}
