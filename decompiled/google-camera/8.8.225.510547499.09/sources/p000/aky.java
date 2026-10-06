package p000;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.wear.ambient.AmbientDelegate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class aky extends Service implements akv {

    /* JADX INFO: renamed from: a */
    private final AmbientDelegate f607a = new AmbientDelegate(this);

    @Override // p000.akv
    public final aks getLifecycle() {
        return (aks) this.f607a.f1686b;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        this.f607a.m1610m(akq.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f607a.m1610m(akq.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        AmbientDelegate ambientDelegate = this.f607a;
        ambientDelegate.m1610m(akq.ON_STOP);
        ambientDelegate.m1610m(akq.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        this.f607a.m1610m(akq.ON_START);
        super.onStart(intent, i);
    }
}
