package p000;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class imc implements fbp, fbd, ezx {

    /* JADX INFO: renamed from: a */
    public final jvd f31475a;

    /* JADX INFO: renamed from: b */
    public final fan f31476b;

    /* JADX INFO: renamed from: c */
    public final elx f31477c;

    /* JADX INFO: renamed from: d */
    public final oju f31478d;

    /* JADX INFO: renamed from: e */
    final idb f31479e;

    /* JADX INFO: renamed from: f */
    private final Context f31480f;

    /* JADX INFO: renamed from: g */
    private final ConnectivityManager.NetworkCallback f31481g = new imb(this);

    /* JADX INFO: renamed from: h */
    private final cdu f31482h;

    public imc(Context context, jvd jvdVar, fan fanVar, cdu cduVar, elx elxVar, oju ojuVar) {
        this.f31480f = context;
        this.f31475a = jvdVar;
        this.f31476b = fanVar;
        this.f31482h = cduVar;
        this.f31477c = elxVar;
        this.f31478d = ojuVar;
        this.f31479e = jpd.m13426g(true, 3000, null, null, context.getString(C0100R.string.camera_outdated_chip), context, false, -1, 2);
    }

    /* JADX INFO: renamed from: a */
    private final void m11457a() {
        this.f31477c.mo7485g(this.f31479e);
        if (inr.m11534f(this.f31480f) == 1) {
            this.f31477c.mo7482d(this.f31479e);
        }
    }

    @Override // p000.ezx
    /* JADX INFO: renamed from: bD */
    public final void mo6425bD(Intent intent) {
        m11457a();
    }

    @Override // p000.fbd
    /* JADX INFO: renamed from: bI */
    public final void mo6422bI() {
        this.f31482h.m3529i().m13537d(inr.m11533e(this.f31480f, this.f31481g));
        m11457a();
    }
}
