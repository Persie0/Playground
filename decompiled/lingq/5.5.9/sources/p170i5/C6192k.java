package p170i5;

import android.content.Context;
import android.net.ConnectivityManager;
import dm.C5207g;
import p026b5.AbstractC1314g;
import p131g5.C5698b;
import p235l5.C7264k;
import p235l5.C7266m;
import p257m5.C7480b;

/* JADX INFO: renamed from: i5.k */
/* JADX INFO: loaded from: classes.dex */
public final class C6192k extends AbstractC6189h<C5698b> {

    /* JADX INFO: renamed from: f */
    public final ConnectivityManager f36052f;

    /* JADX INFO: renamed from: g */
    public final C6191j f36053g;

    public C6192k(Context context, C7480b c7480b) {
        super(context, c7480b);
        Object systemService = this.f36046b.getSystemService("connectivity");
        C5207g.m11109d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f36052f = (ConnectivityManager) systemService;
        this.f36053g = new C6191j(this);
    }

    @Override // p170i5.AbstractC6189h
    /* JADX INFO: renamed from: a */
    public final C5698b mo12702a() {
        return C6193l.m12710a(this.f36052f);
    }

    @Override // p170i5.AbstractC6189h
    /* JADX INFO: renamed from: d */
    public final void mo12706d() {
        try {
            AbstractC1314g.m4867d().mo4869a(C6193l.f36054a, "Registering network callback");
            C7266m.m14657a(this.f36052f, this.f36053g);
        } catch (IllegalArgumentException e10) {
            AbstractC1314g.m4867d().mo4871c(C6193l.f36054a, "Received exception while registering network callback", e10);
        } catch (SecurityException e11) {
            AbstractC1314g.m4867d().mo4871c(C6193l.f36054a, "Received exception while registering network callback", e11);
        }
    }

    @Override // p170i5.AbstractC6189h
    /* JADX INFO: renamed from: e */
    public final void mo12707e() {
        try {
            AbstractC1314g.m4867d().mo4869a(C6193l.f36054a, "Unregistering network callback");
            C7264k.m14655c(this.f36052f, this.f36053g);
        } catch (IllegalArgumentException e10) {
            AbstractC1314g.m4867d().mo4871c(C6193l.f36054a, "Received exception while unregistering network callback", e10);
        } catch (SecurityException e11) {
            AbstractC1314g.m4867d().mo4871c(C6193l.f36054a, "Received exception while unregistering network callback", e11);
        }
    }
}
