package p000;

import android.content.Context;
import com.google.android.apps.camera.p014ui.mars.MarsSwitch;
import com.google.android.apps.camera.p014ui.popupmenu.PopupMenuView;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iak implements fbp, fbl {

    /* JADX INFO: renamed from: a */
    public static final nbh f30148a = nbh.m17259h("com/google/android/apps/camera/ui/mars/MarsSwitchController");

    /* JADX INFO: renamed from: b */
    public final Context f30149b;

    /* JADX INFO: renamed from: c */
    public final dhv f30150c;

    /* JADX INFO: renamed from: d */
    public final jvd f30151d;

    /* JADX INFO: renamed from: e */
    public final hah f30152e;

    /* JADX INFO: renamed from: f */
    public final hai f30153f;

    /* JADX INFO: renamed from: g */
    public final elx f30154g;

    /* JADX INFO: renamed from: h */
    public final igb f30155h;

    /* JADX INFO: renamed from: i */
    public final gfa f30156i;

    /* JADX INFO: renamed from: k */
    public MarsSwitch f30158k;

    /* JADX INFO: renamed from: l */
    public PopupMenuView f30159l;

    /* JADX INFO: renamed from: m */
    public idu f30160m;

    /* JADX INFO: renamed from: o */
    public final jvb f30162o;

    /* JADX INFO: renamed from: p */
    public idq f30163p;

    /* JADX INFO: renamed from: q */
    public final lrd f30164q;

    /* JADX INFO: renamed from: r */
    private final Executor f30165r;

    /* JADX INFO: renamed from: j */
    public boolean f30157j = false;

    /* JADX INFO: renamed from: n */
    public kba f30161n = gog.f25854g;

    public iak(Context context, dhv dhvVar, hah hahVar, hai haiVar, lrd lrdVar, jvd jvdVar, Executor executor, elx elxVar, igb igbVar, gfa gfaVar, cdu cduVar, byte[] bArr) {
        this.f30149b = context;
        this.f30150c = dhvVar;
        this.f30151d = jvdVar;
        this.f30165r = executor;
        this.f30152e = hahVar;
        this.f30153f = haiVar;
        this.f30164q = lrdVar;
        this.f30154g = elxVar;
        this.f30155h = igbVar;
        this.f30156i = gfaVar;
        this.f30162o = cduVar.m3529i();
    }

    /* JADX INFO: renamed from: a */
    public static nps m10985a(Executor executor, Context context) {
        return kxk.m14969O(new bdv(context, 14), executor);
    }

    /* JADX INFO: renamed from: b */
    public final void m10986b() {
        jvd jvdVar = this.f30151d;
        jvdVar.getClass();
        jvdVar.m13541c(new huh(this, 18));
    }

    @Override // p000.fbl
    /* JADX INFO: renamed from: bF */
    public final void mo3523bF() {
        kxk.m14975U(m10985a(this.f30165r, this.f30149b), new djq(this, 16), this.f30165r);
    }

    /* JADX INFO: renamed from: d */
    public final void m10987d() {
        if (this.f30150c.mo6184l(dib.f11361co)) {
            idu iduVar = this.f30160m;
            if (iduVar != null) {
                iduVar.dismiss();
                return;
            }
            return;
        }
        PopupMenuView popupMenuView = this.f30159l;
        if (popupMenuView != null) {
            popupMenuView.m4406b();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m10988e() {
        this.f30161n.close();
    }

    /* JADX INFO: renamed from: f */
    public final void m10989f(boolean z) {
        if (this.f30150c.mo6184l(dib.f11361co)) {
            idu iduVar = this.f30160m;
            if (iduVar != null) {
                iduVar.m11139e(z ? gyx.MARS_STORE : gyx.MEDIA_STORE);
                return;
            } else {
                this.f30157j = z;
                return;
            }
        }
        idq idqVar = this.f30163p;
        if (idqVar != null) {
            idqVar.m11127c(z ? gyx.MARS_STORE : gyx.MEDIA_STORE);
        } else {
            this.f30157j = z;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m10990g(htf htfVar) {
        this.f30162o.m13537d(htfVar.mo10733a(new iai(this)));
    }

    /* JADX INFO: renamed from: h */
    public final void m10991h() {
        kxk.m14975U(m10985a(this.f30165r, this.f30149b), new djq(this, 17), this.f30165r);
    }
}
