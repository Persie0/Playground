package p152hb;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C2542a;
import com.google.android.gms.common.api.internal.AbstractC2546a;
import gb.InterfaceC5740d;
import java.util.Collections;
import java.util.Iterator;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* JADX INFO: renamed from: hb.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5969f0 implements InterfaceC5981j0 {

    /* JADX INFO: renamed from: a */
    @NotOnlyInitialized
    public final C5990m0 f35484a;

    public C5969f0(C5990m0 c5990m0) {
        this.f35484a = c5990m0;
    }

    @Override // p152hb.InterfaceC5981j0
    /* JADX INFO: renamed from: a */
    public final void mo12407a(Bundle bundle) {
    }

    @Override // p152hb.InterfaceC5981j0
    /* JADX INFO: renamed from: b */
    public final void mo12408b() {
        C5990m0 c5990m0 = this.f35484a;
        c5990m0.f35530a.lock();
        try {
            c5990m0.f35540k = new C5966e0(c5990m0, c5990m0.f35537h, c5990m0.f35538i, c5990m0.f35533d, c5990m0.f35539j, c5990m0.f35530a, c5990m0.f35532c);
            c5990m0.f35540k.mo12411e();
            c5990m0.f35531b.signalAll();
            c5990m0.f35530a.unlock();
        } catch (Throwable th2) {
            c5990m0.f35530a.unlock();
            throw th2;
        }
    }

    @Override // p152hb.InterfaceC5981j0
    /* JADX INFO: renamed from: c */
    public final void mo12409c(ConnectionResult connectionResult, C2542a<?> c2542a, boolean z10) {
    }

    @Override // p152hb.InterfaceC5981j0
    /* JADX INFO: renamed from: d */
    public final void mo12410d(int i10) {
    }

    @Override // p152hb.InterfaceC5981j0
    /* JADX INFO: renamed from: e */
    public final void mo12411e() {
        C5990m0 c5990m0 = this.f35484a;
        Iterator<C2542a.e> it = c5990m0.f35535f.values().iterator();
        while (it.hasNext()) {
            it.next().mo7545i();
        }
        c5990m0.f35542m.f35500K = Collections.emptySet();
    }

    @Override // p152hb.InterfaceC5981j0
    /* JADX INFO: renamed from: f */
    public final boolean mo12412f() {
        return true;
    }

    @Override // p152hb.InterfaceC5981j0
    /* JADX INFO: renamed from: g */
    public final <A, T extends AbstractC2546a<? extends InterfaceC5740d, A>> T mo12413g(T t10) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
