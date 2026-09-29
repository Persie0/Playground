package androidx.work.impl.constraints;

import android.net.ConnectivityManager;
import androidx.work.NetworkType;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3222b;
import p000.ak1;
import p000.dj1;
import p000.p8b;

/* JADX INFO: renamed from: androidx.work.impl.constraints.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0775a implements dj1 {

    /* JADX INFO: renamed from: a */
    public final ConnectivityManager f7234a;

    public C0775a(ConnectivityManager connectivityManager) {
        this.f7234a = connectivityManager;
    }

    @Override // p000.dj1
    /* JADX INFO: renamed from: a */
    public final C3222b mo2920a(ak1 ak1Var) {
        ak1Var.getClass();
        return AbstractC3224d.m15526e(new NetworkRequestConstraintController$track$1(ak1Var, this, null));
    }

    @Override // p000.dj1
    /* JADX INFO: renamed from: b */
    public final boolean mo2921b(p8b p8bVar) {
        return (p8bVar.f55781j.m516d() == null && p8bVar.f55781j.m518f() == NetworkType.NOT_REQUIRED) ? false : true;
    }
}
