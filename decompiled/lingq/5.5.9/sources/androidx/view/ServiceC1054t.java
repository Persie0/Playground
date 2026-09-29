package androidx.view;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import dm.C5207g;

/* JADX INFO: renamed from: androidx.lifecycle.t */
/* JADX INFO: loaded from: classes.dex */
public class ServiceC1054t extends Service implements InterfaceC1051q {

    /* JADX INFO: renamed from: a */
    public final C1034g0 f6689a = new C1034g0(this);

    @Override // androidx.view.InterfaceC1051q
    /* JADX INFO: renamed from: G */
    public final C1052r mo786G() {
        return this.f6689a.f6649a;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        C5207g.m11111f(intent, "intent");
        C1034g0 c1034g0 = this.f6689a;
        c1034g0.getClass();
        c1034g0.m3938a(Lifecycle.Event.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        C1034g0 c1034g0 = this.f6689a;
        c1034g0.getClass();
        c1034g0.m3938a(Lifecycle.Event.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        C1034g0 c1034g0 = this.f6689a;
        c1034g0.getClass();
        c1034g0.m3938a(Lifecycle.Event.ON_STOP);
        c1034g0.m3938a(Lifecycle.Event.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i10) {
        C1034g0 c1034g0 = this.f6689a;
        c1034g0.getClass();
        c1034g0.m3938a(Lifecycle.Event.ON_START);
        super.onStart(intent, i10);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }
}
