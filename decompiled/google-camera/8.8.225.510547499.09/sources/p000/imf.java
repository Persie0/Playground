package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.Toast;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class imf extends hei implements img, imo, gyi {

    /* JADX INFO: renamed from: m */
    private static final nbh f31492m = nbh.m17259h("com/google/android/apps/camera/update/InAppUpdateUIController");

    /* JADX INFO: renamed from: b */
    public final imh f31493b;

    /* JADX INFO: renamed from: c */
    public final Context f31494c;

    /* JADX INFO: renamed from: d */
    public final elx f31495d;

    /* JADX INFO: renamed from: e */
    public final hah f31496e;

    /* JADX INFO: renamed from: f */
    public final hai f31497f;

    /* JADX INFO: renamed from: g */
    public final fcp f31498g;

    /* JADX INFO: renamed from: h */
    public final gye f31499h;

    /* JADX INFO: renamed from: i */
    public final long f31500i;

    /* JADX INFO: renamed from: j */
    final idb f31501j;

    /* JADX INFO: renamed from: k */
    public final idb f31502k;

    /* JADX INFO: renamed from: l */
    public long f31503l;

    /* JADX INFO: renamed from: o */
    private final dja f31505o;

    /* JADX INFO: renamed from: p */
    private final jvd f31506p;

    /* JADX INFO: renamed from: q */
    private final boolean f31507q;

    /* JADX INFO: renamed from: r */
    private final boolean f31508r;

    /* JADX INFO: renamed from: s */
    private boolean f31509s;

    /* JADX INFO: renamed from: t */
    private boolean f31510t;

    /* JADX INFO: renamed from: n */
    private final Set f31504n = new HashSet();

    /* JADX INFO: renamed from: u */
    private int f31511u = 1;

    public imf(imh imhVar, Context context, elx elxVar, hah hahVar, hai haiVar, PackageInfo packageInfo, fcp fcpVar, gye gyeVar, dja djaVar, jvd jvdVar, boolean z, boolean z2) {
        this.f31493b = imhVar;
        this.f31494c = context;
        this.f31495d = elxVar;
        this.f31496e = hahVar;
        this.f31497f = haiVar;
        this.f31498g = fcpVar;
        this.f31499h = gyeVar;
        this.f31505o = djaVar;
        this.f31506p = jvdVar;
        this.f31507q = z;
        this.f31508r = z2;
        this.f31501j = jpd.m13426g(false, 10000, null, null, context.getResources().getString(C0100R.string.preparing_updates), context, false, -1, 8);
        this.f31502k = jpd.m13426g(true, 3000, new iec(this, 5), null, context.getResources().getString(C0100R.string.update_ready_tap_restart), context, false, -1, 8);
        this.f31500i = packageInfo.getLongVersionCode();
    }

    @Override // p000.img
    /* JADX INFO: renamed from: A */
    public final void mo11459A(final int i, final int i2) {
        ((nbe) ((nbe) f31492m.m17252c()).mo17276G(4314)).mo17299x("onUpdateFailed failureType=%s, errorCode=%d", nea.m17399m(i), i2);
        this.f31511u = 1;
        m11458B();
        this.f31498g.mo8167al(6, this.f31503l, this.f31500i, i, i2);
        if (this.f31505o.m6200b(dja.DOGFOOD)) {
            this.f31506p.m13541c(new Runnable() { // from class: ime
                @Override // java.lang.Runnable
                public final void run() {
                    imf imfVar = this.f31489a;
                    int i3 = i;
                    int i4 = i2;
                    Toast.makeText(imfVar.f31494c, String.format(Locale.US, "Update failed! type=%s, code=%d. Please file a bug report.", nea.m17399m(i3), Integer.valueOf(i4)), 0).show();
                }
            });
        }
    }

    @Override // p000.hei, p000.hes
    /* JADX INFO: renamed from: a */
    public final void mo3950a() {
        super.mo3950a();
        this.f31499h.m9973h(this);
    }

    @Override // p000.img
    /* JADX INFO: renamed from: e */
    public final void mo11460e() {
        m10152c();
    }

    @Override // p000.imo
    /* JADX INFO: renamed from: f */
    public final void mo11461f() {
        this.f31510t = true;
        m11458B();
    }

    @Override // p000.imo
    /* JADX INFO: renamed from: g */
    public final void mo11462g() {
        this.f31510t = false;
        m11458B();
    }

    @Override // p000.img
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void mo11463h() {
    }

    @Override // p000.img
    /* JADX INFO: renamed from: i */
    public final void mo11464i() {
        this.f31498g.mo8167al(3, this.f31503l, this.f31500i, 0, 0);
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: j */
    public final void mo3957j(gyu gyuVar) {
        if (this.f31504n.remove(gyuVar)) {
            m11458B();
        }
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void mo3958k(gyu gyuVar) {
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: l */
    public final void mo3959l(gyu gyuVar) {
        if (this.f31504n.remove(gyuVar)) {
            m11458B();
        }
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void mo3960m(long j) {
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void mo3961n(Bitmap bitmap) {
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void mo3962o(Bitmap bitmap, int i) {
        jib.m13195D(this, bitmap);
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void mo3963p(gyu gyuVar, kbb kbbVar) {
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: q */
    public final void mo3964q(gyu gyuVar, gyp gypVar, gyx gyxVar) {
        gyw gywVar;
        if (gypVar.f26867c == gyw.VIDEO || (gywVar = gypVar.f26867c) == gyw.TIMELAPSE || gywVar == gyw.CINEMATIC) {
            return;
        }
        this.f31504n.add(gyuVar);
        m11458B();
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void mo3965r(gyu gyuVar) {
    }

    @Override // p000.img
    /* JADX INFO: renamed from: s */
    public final void mo11465s(int i, Integer num) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (((Integer) this.f31496e.mo10031c(gzy.f27024ah)).intValue() != i) {
            this.f31497f.mo10033e(gzy.f27024ah, Integer.valueOf(i));
            this.f31497f.mo10033e(gzy.f27025ai, Long.valueOf(jCurrentTimeMillis));
        }
        long jMo18501a = ohs.f46034a.mo6051a().mo18501a();
        long hours = TimeUnit.MILLISECONDS.toHours(jCurrentTimeMillis - ((Long) this.f31496e.mo10031c(gzy.f27025ai)).longValue());
        if (jMo18501a <= 0 || hours >= jMo18501a) {
            long jMo18503c = ohs.f46034a.mo6051a().mo18503c();
            if (num == null || num.intValue() >= jMo18503c) {
                Drawable drawable = this.f31494c.getDrawable(C0100R.drawable.quantum_gm_ic_system_update_vd_theme_24);
                drawable.getClass();
                drawable.setTint(-1);
                heu heuVarM10165a = hev.m10165a();
                heuVarM10165a.f27492a = this.f31494c.getString(C0100R.string.new_version_available);
                heuVarM10165a.f27493b = drawable;
                heuVarM10165a.f27494c = new idd(this, 13);
                if (!this.f31507q || !this.f31508r) {
                    long jMo18504d = ohs.f46034a.mo6051a().mo18504d();
                    if (jMo18504d != -1) {
                        heuVarM10165a.m10164e(jMo18504d * 1000);
                    }
                    if (ohs.f46034a.mo6051a().mo18505e()) {
                        heuVarM10165a.f27497f = new idd(this, 14);
                    }
                }
                m10153d(heuVarM10165a.m10160a());
                long j = i;
                this.f31503l = j;
                this.f31498g.mo8167al(2, j, this.f31500i, 0, 0);
            }
        }
    }

    @Override // p000.img
    /* JADX INFO: renamed from: t */
    public final void mo11466t() {
        this.f31511u = 3;
        m11458B();
        this.f31499h.m9966a(this);
        if (this.f31509s) {
            this.f31498g.mo8167al(4, this.f31503l, this.f31500i, 0, 0);
        }
    }

    @Override // p000.img
    /* JADX INFO: renamed from: u */
    public final void mo11467u(int i) {
        this.f31511u = 2;
        m11458B();
        this.f31501j.mo11109s(i == 0 ? this.f31494c.getResources().getString(C0100R.string.preparing_updates) : this.f31494c.getResources().getString(C0100R.string.downloading_updates, Integer.valueOf(i)));
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: x */
    public final void mo3971x(gyu gyuVar) {
        if (this.f31504n.remove(gyuVar)) {
            m11458B();
        }
    }

    @Override // p000.img
    /* JADX INFO: renamed from: y */
    public final void mo11468y() {
        this.f31498g.mo8167al(7, this.f31503l, this.f31500i, 0, 0);
    }

    @Override // p000.img
    /* JADX INFO: renamed from: z */
    public final void mo11469z() {
        this.f31509s = true;
    }

    /* JADX INFO: renamed from: B */
    private final void m11458B() {
        if (this.f31511u != 2 || this.f31510t) {
            this.f31495d.mo7485g(this.f31501j);
        } else {
            this.f31495d.mo7482d(this.f31501j);
        }
        if (this.f31511u == 3 && !this.f31510t && this.f31504n.isEmpty()) {
            this.f31495d.mo7482d(this.f31502k);
        } else {
            this.f31495d.mo7485g(this.f31502k);
        }
    }
}
