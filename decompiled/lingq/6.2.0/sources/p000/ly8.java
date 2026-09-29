package p000;

import android.app.Application;
import android.app.Service;

/* JADX INFO: loaded from: classes2.dex */
public final class ly8 implements mk3 {

    /* JADX INFO: renamed from: a */
    public final Service f50315a;

    /* JADX INFO: renamed from: b */
    public gy1 f50316b;

    public ly8(Service service) {
        this.f50315a = service;
    }

    @Override // p000.mk3
    /* JADX INFO: renamed from: b */
    public final Object mo6995b() {
        if (this.f50316b == null) {
            Application application = this.f50315a.getApplication();
            thb.m22048g(application instanceof mk3, "Hilt service must be attached to an @HiltAndroidApp Application. Found: %s", application.getClass());
            this.f50316b = new gy1(((ky1) ((ky8) ci8.m4741z(application, ky8.class))).f48672b);
        }
        return this.f50316b;
    }
}
