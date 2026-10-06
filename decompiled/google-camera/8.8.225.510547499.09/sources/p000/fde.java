package p000;

import android.content.res.Resources;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fde extends heh {

    /* JADX INFO: renamed from: a */
    public final fly f21416a;

    /* JADX INFO: renamed from: d */
    private final Resources f21417d;

    public fde(Resources resources, fly flyVar, jfs jfsVar, ScheduledExecutorService scheduledExecutorService, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f21417d = resources;
        this.f21416a = flyVar;
    }

    @Override // p000.heh
    /* JADX INFO: renamed from: c */
    protected final heg mo7344c() {
        heu heuVarM10165a = hev.m10165a();
        heuVarM10165a.f27492a = this.f21417d.getString(C0100R.string.longexposure_suggestion_text);
        heuVarM10165a.f27493b = this.f21417d.getDrawable(C0100R.drawable.ic_night_suggestion, null);
        heuVarM10165a.f27494c = new evu(this, 20);
        heuVarM10165a.m10164e(2000L);
        hev hevVarM10160a = heuVarM10165a.m10160a();
        kyu kyuVarM10151a = heg.m10151a();
        kyuVarM10151a.f37742a = hevVarM10160a;
        kyuVarM10151a.m15070f(1);
        kyuVarM10151a.m15071g(5);
        kyuVarM10151a.m15069e(ikw.LONG_EXPOSURE);
        kyuVarM10151a.m15072h();
        return kyuVarM10151a.m15068d();
    }
}
