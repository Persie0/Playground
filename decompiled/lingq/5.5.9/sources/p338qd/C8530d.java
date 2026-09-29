package p338qd;

import android.os.RemoteException;
import com.google.android.play.core.assetpacks.C3110a;
import java.util.HashMap;
import java.util.Map;
import p457wd.C9907h;
import td.AbstractRunnableC9250a;
import td.InterfaceC9277y;

/* JADX INFO: renamed from: qd.d */
/* JADX INFO: loaded from: classes.dex */
public final class C8530d extends AbstractRunnableC9250a {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Map f45816b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C9907h f45817c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C3110a f45818d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8530d(C3110a c3110a, C9907h c9907h, HashMap map, C9907h c9907h2) {
        super(c9907h);
        this.f45818d = c3110a;
        this.f45816b = map;
        this.f45817c = c9907h2;
    }

    @Override // td.AbstractRunnableC9250a
    /* JADX INFO: renamed from: a */
    public final void mo16640a() {
        C9907h c9907h = this.f45817c;
        C3110a c3110a = this.f45818d;
        try {
            ((InterfaceC9277y) c3110a.f15893d.f47965n).mo17635J(c3110a.f15890a, C3110a.m8954k(this.f45816b), new BinderC8557m(c3110a, c9907h));
        } catch (RemoteException e10) {
            C3110a.f15888g.m15813n(e10, "syncPacks", new Object[0]);
            c9907h.m18407a(new RuntimeException(e10));
        }
    }
}
