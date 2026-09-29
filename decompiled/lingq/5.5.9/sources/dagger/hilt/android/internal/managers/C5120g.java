package dagger.hilt.android.internal.managers;

import android.app.Application;
import android.app.Service;
import dm.C5206f;
import mk.C7590g;
import mk.C7593h;
import p385sf.C9000b;
import pl.InterfaceC8405b;

/* JADX INFO: renamed from: dagger.hilt.android.internal.managers.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C5120g implements InterfaceC8405b<Object> {

    /* JADX INFO: renamed from: a */
    public final Service f33102a;

    /* JADX INFO: renamed from: b */
    public C7593h f33103b;

    /* JADX INFO: renamed from: dagger.hilt.android.internal.managers.g$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        C7590g mo10900a();
    }

    public C5120g(Service service) {
        this.f33102a = service;
    }

    @Override // pl.InterfaceC8405b
    /* JADX INFO: renamed from: d */
    public final Object mo469d() {
        if (this.f33103b == null) {
            Application application = this.f33102a.getApplication();
            C5206f.m11030y0(application instanceof InterfaceC8405b, "Hilt service must be attached to an @HiltAndroidApp Application. Found: %s", application.getClass());
            C7590g c7590gMo10900a = ((a) C9000b.m17245k(a.class, application)).mo10900a();
            c7590gMo10900a.getClass();
            this.f33103b = new C7593h(c7590gMo10900a.f41858a);
        }
        return this.f33103b;
    }
}
