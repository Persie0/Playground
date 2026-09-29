package p338qd;

import android.os.Bundle;
import com.google.android.play.core.assetpacks.AssetPackException;
import com.google.android.play.core.assetpacks.C3110a;
import p457wd.C9907h;
import td.C9262j;

/* JADX INFO: renamed from: qd.n */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC8560n extends BinderC8548j {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3110a f45927c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC8560n(C3110a c3110a, C9907h c9907h) {
        super(c3110a, c9907h);
        this.f45927c = c3110a;
    }

    @Override // p338qd.BinderC8548j, td.InterfaceC9251a0
    /* JADX INFO: renamed from: P0 */
    public final void mo16654P0(Bundle bundle, Bundle bundle2) {
        super.mo16654P0(bundle, bundle2);
        C3110a c3110a = this.f45927c;
        if (!c3110a.f15895f.compareAndSet(true, false)) {
            C3110a.f15888g.m15815p("Expected keepingAlive to be true, but was false.", new Object[0]);
        }
        if (bundle.getBoolean("keep_alive")) {
            c3110a.mo8961g();
        }
    }

    @Override // p338qd.BinderC8548j, td.InterfaceC9251a0
    /* JADX INFO: renamed from: e */
    public final void mo16655e(Bundle bundle) {
        C9262j c9262j = this.f45927c.f15894e;
        C9907h c9907h = this.f45886a;
        c9262j.m17621c(c9907h);
        int i10 = bundle.getInt("error_code");
        C3110a.f15888g.m15812m("onError(%d)", Integer.valueOf(i10));
        c9907h.m18407a(new AssetPackException(i10));
    }
}
