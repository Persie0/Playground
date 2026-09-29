package mk;

import com.linguist.LingQApplication;
import dagger.hilt.android.internal.managers.C5117d;
import dagger.hilt.android.internal.managers.InterfaceC5118e;
import kh.ApplicationC6674a;
import pl.InterfaceC8405b;

/* JADX INFO: renamed from: mk.c1 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractApplicationC7580c1 extends ApplicationC6674a implements InterfaceC8405b {

    /* JADX INFO: renamed from: f */
    public boolean f41845f = false;

    /* JADX INFO: renamed from: g */
    public final C5117d f41846g = new C5117d(new a());

    /* JADX INFO: renamed from: mk.c1$a */
    public class a implements InterfaceC5118e {
        public a() {
        }
    }

    @Override // pl.InterfaceC8405b
    /* JADX INFO: renamed from: d */
    public final Object mo469d() {
        return this.f41846g.mo469d();
    }

    @Override // kh.ApplicationC6674a, android.app.Application
    public final void onCreate() {
        if (!this.f41845f) {
            this.f41845f = true;
            ((InterfaceC7583d1) mo469d()).mo15087b((LingQApplication) this);
        }
        super.onCreate();
    }
}
