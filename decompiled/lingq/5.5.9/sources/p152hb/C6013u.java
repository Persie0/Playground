package p152hb;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C2542a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC2546a;
import gb.InterfaceC5740d;
import p176ib.C6272i;

/* JADX INFO: renamed from: hb.u */
/* JADX INFO: loaded from: classes.dex */
public final class C6013u implements InterfaceC5981j0 {

    /* JADX INFO: renamed from: a */
    public final C5990m0 f35600a;

    public C6013u(C5990m0 c5990m0) {
        this.f35600a = c5990m0;
    }

    @Override // p152hb.InterfaceC5981j0
    /* JADX INFO: renamed from: a */
    public final void mo12407a(Bundle bundle) {
    }

    @Override // p152hb.InterfaceC5981j0
    /* JADX INFO: renamed from: b */
    public final void mo12408b() {
    }

    @Override // p152hb.InterfaceC5981j0
    /* JADX INFO: renamed from: c */
    public final void mo12409c(ConnectionResult connectionResult, C2542a<?> c2542a, boolean z10) {
    }

    @Override // p152hb.InterfaceC5981j0
    /* JADX INFO: renamed from: d */
    public final void mo12410d(int i10) {
        C5990m0 c5990m0 = this.f35600a;
        c5990m0.m12440i();
        c5990m0.f35543n.mo12425c(i10, false);
    }

    @Override // p152hb.InterfaceC5981j0
    /* JADX INFO: renamed from: e */
    public final void mo12411e() {
    }

    @Override // p152hb.InterfaceC5981j0
    /* JADX INFO: renamed from: f */
    public final boolean mo12412f() {
        C5990m0 c5990m0 = this.f35600a;
        c5990m0.f35542m.getClass();
        c5990m0.m12440i();
        return true;
    }

    @Override // p152hb.InterfaceC5981j0
    /* JADX INFO: renamed from: g */
    public final <A, T extends AbstractC2546a<? extends InterfaceC5740d, A>> T mo12413g(T t10) {
        C5990m0 c5990m0 = this.f35600a;
        try {
            C5985k1 c5985k1 = c5990m0.f35542m.f35507R;
            c5985k1.f35523a.add(t10);
            t10.f13906e.set(c5985k1.f35524b);
            C5978i0 c5978i0 = c5990m0.f35542m;
            C2542a.f fVar = t10.f13914m;
            C2542a.e eVar = c5978i0.f35499J.get(fVar);
            C6272i.m12916j(eVar, "Appropriate Api was not requested.");
            if (eVar.mo7537a() || !c5990m0.f35536g.containsKey(fVar)) {
                try {
                    t10.mo7580k(eVar);
                } catch (DeadObjectException e10) {
                    t10.m7581l(new Status(8, null, e10.getLocalizedMessage()));
                    throw e10;
                } catch (RemoteException e11) {
                    t10.m7581l(new Status(8, null, e11.getLocalizedMessage()));
                }
            } else {
                t10.m7581l(new Status(null, 17));
            }
        } catch (DeadObjectException unused) {
            c5990m0.m12441j(new C6010t(this, this));
        }
        return t10;
    }
}
