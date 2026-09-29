package p000;

import com.google.android.gms.common.ConnectionResult;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ucb implements e90 {

    /* JADX INFO: renamed from: a */
    public final co3 f63725a;

    /* JADX INFO: renamed from: b */
    public final C3118io f63726b;

    /* JADX INFO: renamed from: c */
    public lx3 f63727c;

    /* JADX INFO: renamed from: d */
    public Set f63728d;

    /* JADX INFO: renamed from: e */
    public boolean f63729e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ so3 f63730f;

    public ucb(so3 so3Var, co3 co3Var, C3118io c3118io) {
        Objects.requireNonNull(so3Var);
        this.f63730f = so3Var;
        this.f63727c = null;
        this.f63728d = null;
        this.f63729e = false;
        this.f63725a = co3Var;
        this.f63726b = c3118io;
    }

    @Override // p000.e90
    /* JADX INFO: renamed from: a */
    public final void mo4796a(ConnectionResult connectionResult) {
        this.f63730f.f61092H.post(new gvb(this, connectionResult, false, 11));
    }

    /* JADX INFO: renamed from: b */
    public final void m22675b(ConnectionResult connectionResult) {
        scb scbVar = (scb) this.f63730f.f61103j.get(this.f63726b);
        if (scbVar != null) {
            scbVar.m21236k(connectionResult);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m22676c(int i) {
        scb scbVar = (scb) this.f63730f.f61103j.get(this.f63726b);
        if (scbVar != null) {
            if (scbVar.f60696n) {
                scbVar.m21236k(new ConnectionResult(17, null, null));
            } else {
                scbVar.onConnectionSuspended(i);
            }
        }
    }
}
