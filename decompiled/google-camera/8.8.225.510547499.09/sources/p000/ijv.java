package p000;

import android.content.Context;
import com.google.android.apps.camera.p014ui.mars.MarsSwitch;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ijv implements ikg {

    /* JADX INFO: renamed from: a */
    public final Context f31251a;

    /* JADX INFO: renamed from: b */
    public final iak f31252b;

    /* JADX INFO: renamed from: c */
    public final dhv f31253c;

    /* JADX INFO: renamed from: d */
    public final oju f31254d;

    /* JADX INFO: renamed from: e */
    public final oju f31255e;

    /* JADX INFO: renamed from: f */
    public final jvd f31256f;

    /* JADX INFO: renamed from: g */
    public final kbz f31257g;

    /* JADX INFO: renamed from: h */
    public final fan f31258h;

    /* JADX INFO: renamed from: i */
    public final htf f31259i;

    /* JADX INFO: renamed from: j */
    public MarsSwitch f31260j;

    /* JADX INFO: renamed from: k */
    private final ikw f31261k;

    /* JADX INFO: renamed from: l */
    private final hai f31262l;

    /* JADX INFO: renamed from: m */
    private final Executor f31263m;

    public ijv(Context context, ikw ikwVar, iak iakVar, hai haiVar, dhv dhvVar, oju ojuVar, oju ojuVar2, jvd jvdVar, Executor executor, kbz kbzVar, fan fanVar, htf htfVar) {
        this.f31251a = context;
        this.f31261k = ikwVar;
        this.f31252b = iakVar;
        this.f31262l = haiVar;
        this.f31253c = dhvVar;
        this.f31255e = ojuVar;
        this.f31254d = ojuVar2;
        this.f31256f = jvdVar;
        this.f31263m = executor;
        this.f31257g = kbzVar;
        this.f31258h = fanVar;
        this.f31259i = htfVar;
    }

    @Override // p000.ikg
    /* JADX INFO: renamed from: a */
    public final void mo6340a() {
        ikw ikwVar;
        this.f31262l.mo10033e(gzy.f27036at, false);
        if (!this.f31253c.mo6184l(dib.f11305bL) || (ikwVar = this.f31261k) == ikw.IMAGE_INTENT || ikwVar == ikw.VIDEO_INTENT) {
            return;
        }
        kxk.m14975U(iak.m10985a(this.f31263m, this.f31251a), new cmo(this, 20), this.f31263m);
    }
}
