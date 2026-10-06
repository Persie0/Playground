package p000;

import android.content.res.Resources;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class eia extends heh {

    /* JADX INFO: renamed from: a */
    public final fly f14120a;

    /* JADX INFO: renamed from: d */
    private final Resources f14121d;

    public eia(Resources resources, fly flyVar, jfs jfsVar, ScheduledExecutorService scheduledExecutorService, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f14121d = resources;
        this.f14120a = flyVar;
    }

    @Override // p000.heh
    /* JADX INFO: renamed from: c */
    protected final heg mo7344c() {
        heu heuVarM10165a = hev.m10165a();
        heuVarM10165a.f27492a = this.f14121d.getString(C0100R.string.imax_suggestion_text);
        heuVarM10165a.f27493b = this.f14121d.getDrawable(C0100R.drawable.quantum_gm_ic_vrpano_white_24, null);
        heuVarM10165a.f27494c = new efd(this, 10);
        heuVarM10165a.m10164e(7000L);
        hev hevVarM10160a = heuVarM10165a.m10160a();
        kyu kyuVarM10151a = heg.m10151a();
        kyuVarM10151a.f37742a = hevVarM10160a;
        kyuVarM10151a.m15070f(1);
        kyuVarM10151a.m15071g(5);
        kyuVarM10151a.m15069e(ikw.IMAX);
        kyuVarM10151a.m15072h();
        return kyuVarM10151a.m15068d();
    }
}
