package p000;

import android.app.Application;
import android.os.SystemClock;
import com.pairip.StartupLauncher;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class fbt extends Application {

    /* JADX INFO: renamed from: i */
    protected static final long f21199i;

    /* JADX INFO: renamed from: j */
    public final fao f21200j = new fao();

    static {
        StartupLauncher.launch();
        f21199i = SystemClock.elapsedRealtimeNanos();
    }

    @Override // android.app.Application
    public void onCreate() {
        fao faoVar = this.f21200j;
        fag fagVar = fag.f21102d;
        faoVar.m8082f(fagVar);
        faoVar.f21142d = fagVar;
        super.onCreate();
    }

    @Override // android.app.Application
    public final void onTerminate() {
        fao faoVar = this.f21200j;
        faoVar.m8081a(faoVar.f21142d);
        for (fbp fbpVar : faoVar.f21139a) {
            if (fbpVar instanceof fau) {
                ((fau) fbpVar).m8087a();
            }
        }
        super.onTerminate();
    }
}
