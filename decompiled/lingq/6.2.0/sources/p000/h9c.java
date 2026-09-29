package p000;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes2.dex */
public final class h9c extends ifb {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ f90 f42061g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h9c(f90 f90Var, int i, Bundle bundle) {
        super(f90Var, i, bundle);
        this.f42061g = f90Var;
    }

    @Override // p000.ifb
    /* JADX INFO: renamed from: a */
    public final boolean mo10847a() {
        this.f42061g.f38649j.mo4796a(ConnectionResult.f11635f);
        return true;
    }

    @Override // p000.ifb
    /* JADX INFO: renamed from: b */
    public final void mo10848b(ConnectionResult connectionResult) {
        f90 f90Var = this.f42061g;
        f90Var.getClass();
        f90Var.f38649j.mo4796a(connectionResult);
        System.currentTimeMillis();
    }
}
