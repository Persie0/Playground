package p000;

import android.content.res.Resources;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class gox extends heh {

    /* JADX INFO: renamed from: a */
    public final fly f25906a;

    /* JADX INFO: renamed from: d */
    private final Resources f25907d;

    public gox(Resources resources, ScheduledExecutorService scheduledExecutorService, jfs jfsVar, fly flyVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f25907d = resources;
        this.f25906a = flyVar;
    }

    @Override // p000.heh
    /* JADX INFO: renamed from: c */
    protected final heg mo7344c() {
        heu heuVarM10165a = hev.m10165a();
        heuVarM10165a.f27492a = this.f25907d.getString(C0100R.string.portrait_suggestion_text);
        heuVarM10165a.f27493b = this.f25907d.getDrawable(C0100R.drawable.quantum_gm_ic_portrait_white_24, null);
        heuVarM10165a.f27494c = new ghv(this, 11);
        heuVarM10165a.m10164e(5000L);
        hev hevVarM10160a = heuVarM10165a.m10160a();
        kyu kyuVarM10151a = heg.m10151a();
        kyuVarM10151a.f37742a = hevVarM10160a;
        kyuVarM10151a.m15070f(2);
        kyuVarM10151a.m15071g(5);
        kyuVarM10151a.m15069e(ikw.PORTRAIT);
        kyuVarM10151a.m15072h();
        return kyuVarM10151a.m15068d();
    }
}
