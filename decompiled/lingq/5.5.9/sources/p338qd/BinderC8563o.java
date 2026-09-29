package p338qd;

import android.os.Bundle;
import com.google.android.play.core.assetpacks.C3110a;
import p457wd.C9907h;

/* JADX INFO: renamed from: qd.o */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC8563o extends BinderC8548j {

    /* JADX INFO: renamed from: c */
    public final int f45930c;

    /* JADX INFO: renamed from: d */
    public final String f45931d;

    /* JADX INFO: renamed from: e */
    public final int f45932e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C3110a f45933f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC8563o(C3110a c3110a, C9907h c9907h, int i10, String str, int i11) {
        super(c3110a, c9907h);
        this.f45933f = c3110a;
        this.f45930c = i10;
        this.f45931d = str;
        this.f45932e = i11;
    }

    @Override // p338qd.BinderC8548j, td.InterfaceC9251a0
    /* JADX INFO: renamed from: e */
    public final void mo16655e(Bundle bundle) {
        C3110a c3110a = this.f45933f;
        c3110a.f15893d.m17621c(this.f45886a);
        C3110a.f15888g.m15812m("onError(%d), retrying notifyModuleCompleted...", Integer.valueOf(bundle.getInt("error_code")));
        int i10 = this.f45932e;
        if (i10 > 0) {
            c3110a.m8962j(this.f45931d, this.f45930c, i10 - 1);
        }
    }
}
