package p338qd;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.assetpacks.C3110a;
import p457wd.C9907h;
import td.AbstractRunnableC9250a;
import td.InterfaceC9277y;

/* JADX INFO: renamed from: qd.g */
/* JADX INFO: loaded from: classes.dex */
public final class C8539g extends AbstractRunnableC9250a {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f45845b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C9907h f45846c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C3110a f45847d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8539g(C3110a c3110a, C9907h c9907h, int i10, C9907h c9907h2) {
        super(c9907h);
        this.f45847d = c3110a;
        this.f45845b = i10;
        this.f45846c = c9907h2;
    }

    @Override // td.AbstractRunnableC9250a
    /* JADX INFO: renamed from: a */
    public final void mo16640a() {
        C3110a c3110a = this.f45847d;
        try {
            InterfaceC9277y interfaceC9277y = (InterfaceC9277y) c3110a.f15893d.f47965n;
            String str = c3110a.f15890a;
            int i10 = this.f45845b;
            Bundle bundle = new Bundle();
            bundle.putInt("session_id", i10);
            interfaceC9277y.mo17638W0(str, bundle, C3110a.m8952h(), new BinderC8566p(c3110a, this.f45846c));
        } catch (RemoteException e10) {
            C3110a.f15888g.m15813n(e10, "notifySessionFailed", new Object[0]);
        }
    }
}
