package p000;

import android.content.Context;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.Timer;
import p021j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fpp extends kfv {

    /* JADX INFO: renamed from: a */
    public static final Duration f23118a = Duration.ofMillis(8000);

    /* JADX INFO: renamed from: b */
    public final elx f23119b;

    /* JADX INFO: renamed from: c */
    public final jww f23120c;

    /* JADX INFO: renamed from: d */
    public final jvd f23121d;

    /* JADX INFO: renamed from: f */
    public idb f23123f;

    /* JADX INFO: renamed from: j */
    private final idb f23127j;

    /* JADX INFO: renamed from: k */
    private final Timer f23128k = new Timer();

    /* JADX INFO: renamed from: e */
    public final msd f23122e = msd.m16856c(mqt.f41449a);

    /* JADX INFO: renamed from: i */
    public int f23126i = 1;

    /* JADX INFO: renamed from: g */
    public boolean f23124g = false;

    /* JADX INFO: renamed from: h */
    public final iqc f23125h = new fpn(this);

    public fpp(elx elxVar, Context context, jvd jvdVar, jww jwwVar) {
        this.f23119b = elxVar;
        this.f23121d = jvdVar;
        this.f23120c = jwwVar;
        jpd.m13426g(true, 3000, null, null, context.getResources().getString(C0100R.string.portrait_notification_tap_to_focus), context, false, -1, 6);
        jpd.m13426g(true, 3000, null, null, context.getResources().getString(C0100R.string.amber_move_closer), context, false, -1, 6);
        this.f23127j = jpd.m13426g(false, 5000, null, new ide(this, 1), context.getResources().getString(C0100R.string.amber_tap_on_subject_to_focus), context, false, -1, 6);
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bu */
    public final void mo3408bu(kpp kppVar) {
    }

    /* JADX INFO: renamed from: i */
    public final void m8665i() {
        this.f23126i = 4;
        this.f23123f = this.f23127j;
        this.f23128k.schedule(new fpo(this), 500L);
        this.f23124g = true;
    }

    /* JADX INFO: renamed from: j */
    public final void m8666j() {
        this.f23124g = false;
        this.f23120c.mo3415bf(false);
        this.f23122e.m16859d();
        m8667k(this.f23126i);
    }

    /* JADX INFO: renamed from: k */
    public final void m8667k(int i) {
        int i2 = this.f23126i;
        if (i2 == 1 || i2 != i) {
            return;
        }
        this.f23126i = 1;
        idb idbVar = this.f23123f;
        if (idbVar != null) {
            this.f23119b.mo7485g(idbVar);
            this.f23123f = null;
        }
    }
}
