package p338qd;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.assetpacks.AssetPackException;
import com.google.android.play.core.assetpacks.C3110a;
import java.util.ArrayList;
import p457wd.C9907h;
import td.AbstractBinderC9278z;
import td.C9262j;

/* JADX INFO: renamed from: qd.j */
/* JADX INFO: loaded from: classes.dex */
public class BinderC8548j extends AbstractBinderC9278z {

    /* JADX INFO: renamed from: a */
    public final C9907h f45886a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3110a f45887b;

    public BinderC8548j(C3110a c3110a, C9907h c9907h) {
        this.f45887b = c3110a;
        this.f45886a = c9907h;
    }

    @Override // td.InterfaceC9251a0
    /* JADX INFO: renamed from: L0 */
    public void mo16653L0(ArrayList arrayList) {
        this.f45887b.f15893d.m17621c(this.f45886a);
        C3110a.f15888g.m15814o("onGetSessionStates", new Object[0]);
    }

    @Override // td.InterfaceC9251a0
    /* JADX INFO: renamed from: P0 */
    public void mo16654P0(Bundle bundle, Bundle bundle2) {
        this.f45887b.f15894e.m17621c(this.f45886a);
        C3110a.f15888g.m15814o("onKeepAlive(%b)", Boolean.valueOf(bundle.getBoolean("keep_alive")));
    }

    @Override // td.InterfaceC9251a0
    /* JADX INFO: renamed from: e */
    public void mo16655e(Bundle bundle) {
        C9262j c9262j = this.f45887b.f15893d;
        C9907h c9907h = this.f45886a;
        c9262j.m17621c(c9907h);
        int i10 = bundle.getInt("error_code");
        C3110a.f15888g.m15812m("onError(%d)", Integer.valueOf(i10));
        c9907h.m18407a(new AssetPackException(i10));
    }

    @Override // td.InterfaceC9251a0
    /* JADX INFO: renamed from: l */
    public void mo16656l(Bundle bundle, Bundle bundle2) throws RemoteException {
        this.f45887b.f15893d.m17621c(this.f45886a);
        C3110a.f15888g.m15814o("onGetChunkFileDescriptor", new Object[0]);
    }
}
