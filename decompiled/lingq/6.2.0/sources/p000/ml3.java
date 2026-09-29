package p000;

import com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus;

/* JADX INFO: loaded from: classes.dex */
public final class ml3 implements mh9 {

    /* JADX INFO: renamed from: a */
    public final ina f51465a;

    /* JADX INFO: renamed from: b */
    public final wr9 f51466b;

    public ml3(ina inaVar, wr9 wr9Var) {
        this.f51465a = inaVar;
        this.f51466b = wr9Var;
    }

    @Override // p000.mh9
    /* JADX INFO: renamed from: a */
    public final boolean mo12748a(Exception exc) {
        this.f51466b.m24139c(exc);
        return true;
    }

    @Override // p000.mh9
    /* JADX INFO: renamed from: b */
    public final boolean mo12749b(c50 c50Var) {
        if (c50Var.f9503b == PersistedInstallation$RegistrationStatus.REGISTERED && !this.f51465a.m14039a(c50Var)) {
            String str = c50Var.f9504c;
            if (str != null) {
                this.f51466b.m24138b(new t40(c50Var.f9506e, c50Var.f9507f, str));
                return true;
            }
            C3386nv.m17635v("Null token");
        }
        return false;
    }
}
