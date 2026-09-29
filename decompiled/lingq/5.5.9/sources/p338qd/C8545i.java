package p338qd;

import android.os.RemoteException;
import com.google.android.play.core.assetpacks.C3110a;
import p457wd.C9907h;
import td.AbstractRunnableC9250a;
import td.InterfaceC9277y;

/* JADX INFO: renamed from: qd.i */
/* JADX INFO: loaded from: classes.dex */
public final class C8545i extends AbstractRunnableC9250a {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C9907h f45876b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3110a f45877c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8545i(C3110a c3110a, C9907h c9907h, C9907h c9907h2) {
        super(c9907h);
        this.f45877c = c3110a;
        this.f45876b = c9907h2;
    }

    @Override // td.AbstractRunnableC9250a
    /* JADX INFO: renamed from: a */
    public final void mo16640a() {
        C3110a c3110a = this.f45877c;
        try {
            ((InterfaceC9277y) c3110a.f15894e.f47965n).mo17639g0(c3110a.f15890a, C3110a.m8952h(), new BinderC8560n(c3110a, this.f45876b));
        } catch (RemoteException e10) {
            C3110a.f15888g.m15813n(e10, "keepAlive", new Object[0]);
        }
    }
}
