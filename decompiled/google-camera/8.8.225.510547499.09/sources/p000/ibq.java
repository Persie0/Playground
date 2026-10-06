package p000;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.view.WindowManager;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.p014ui.views.ViewfinderCover;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ibq implements icf {

    /* JADX INFO: renamed from: a */
    public static final nbh f30215a = nbh.m17259h("com/google/android/apps/camera/ui/modeswitch/ModeSwitchControllerImpl");

    /* JADX INFO: renamed from: A */
    private final bko f30216A;

    /* JADX INFO: renamed from: b */
    public final BottomBarController f30217b;

    /* JADX INFO: renamed from: c */
    public icd f30218c;

    /* JADX INFO: renamed from: d */
    public final igb f30219d;

    /* JADX INFO: renamed from: e */
    public final eoq f30220e;

    /* JADX INFO: renamed from: f */
    public boolean f30221f;

    /* JADX INFO: renamed from: g */
    public ikw f30222g;

    /* JADX INFO: renamed from: h */
    public final icx f30223h;

    /* JADX INFO: renamed from: i */
    public final gfa f30224i;

    /* JADX INFO: renamed from: j */
    public final msi f30225j;

    /* JADX INFO: renamed from: k */
    public final ibs f30226k;

    /* JADX INFO: renamed from: l */
    private final WindowManager f30227l;

    /* JADX INFO: renamed from: m */
    private ice f30228m;

    /* JADX INFO: renamed from: n */
    private final ArrayList f30229n;

    /* JADX INFO: renamed from: o */
    private int f30230o;

    /* JADX INFO: renamed from: p */
    private final Context f30231p;

    /* JADX INFO: renamed from: q */
    private final kbz f30232q;

    /* JADX INFO: renamed from: r */
    private final boolean f30233r;

    /* JADX INFO: renamed from: s */
    private final fcp f30234s;

    /* JADX INFO: renamed from: t */
    private final hkx f30235t;

    /* JADX INFO: renamed from: u */
    private final boolean f30236u;

    /* JADX INFO: renamed from: v */
    private final boolean f30237v;

    /* JADX INFO: renamed from: w */
    private boolean f30238w;

    /* JADX INFO: renamed from: x */
    private boolean f30239x = true;

    /* JADX INFO: renamed from: y */
    private ViewfinderCover f30240y;

    /* JADX INFO: renamed from: z */
    private final cdu f30241z;

    public ibq(WindowManager windowManager, fcp fcpVar, BottomBarController bottomBarController, cdu cduVar, igb igbVar, eoq eoqVar, icx icxVar, boolean z, kbz kbzVar, Context context, bko bkoVar, fma fmaVar, hkx hkxVar, gfa gfaVar, dhv dhvVar, msi msiVar, byte[] bArr, byte[] bArr2) {
        this.f30227l = windowManager;
        this.f30217b = bottomBarController;
        this.f30241z = cduVar;
        this.f30219d = igbVar;
        this.f30220e = eoqVar;
        this.f30223h = icxVar;
        this.f30231p = context;
        this.f30232q = kbzVar;
        this.f30216A = bkoVar;
        this.f30233r = z;
        this.f30234s = fcpVar;
        this.f30235t = hkxVar;
        this.f30224i = gfaVar;
        this.f30225j = msiVar;
        this.f30226k = new ibs(this, windowManager, context);
        ArrayList arrayList = new ArrayList();
        this.f30229n = arrayList;
        boolean zMo6184l = dhvVar.mo6184l(dik.f11607e);
        this.f30236u = zMo6184l;
        boolean zMo6184l2 = dhvVar.mo6184l(dhh.f11084aj);
        this.f30237v = zMo6184l2;
        arrayList.add(ikw.LONG_EXPOSURE);
        if (zMo6184l) {
            arrayList.add(ikw.MOTION_BLUR);
        }
        if (z) {
            arrayList.add(ikw.PORTRAIT);
        }
        arrayList.add(ikw.PHOTO);
        arrayList.add(ikw.VIDEO);
        if (zMo6184l2) {
            arrayList.add(ikw.AMBER);
        }
        arrayList.add(ikw.MORE_MODES);
        ikw ikwVarM3505d = cds.m3505d(bkoVar.m2611e());
        switch (ikwVarM3505d.ordinal()) {
            case 5:
            case 13:
                ikwVarM3505d = ikw.VIDEO;
            case 2:
            case 6:
            case 11:
            case 12:
            case 15:
            case 19:
                this.f30222g = ikwVarM3505d;
                break;
            default:
                this.f30222g = ikw.PHOTO;
                break;
        }
        int iIndexOf = arrayList.indexOf(this.f30222g);
        m11001z(iIndexOf);
        this.f30230o = iIndexOf;
        fmaVar.mo8563a(this);
    }

    /* JADX INFO: renamed from: y */
    private final void m11000y(ikw ikwVar, boolean z) {
        if (this.f30229n.contains(ikwVar)) {
            int i = 0;
            this.f30217b.setClickable(false);
            this.f30219d.mo11197E(false);
            int i2 = 2;
            this.f30220e.m7600g(2);
            this.f30221f = true;
            ktz ktzVar = new ktz(this.f30234s, this.f30235t, this.f30222g, ikwVar);
            int iIndexOf = this.f30229n.indexOf(ikwVar);
            if (iIndexOf != -1) {
                int i3 = this.f30230o;
                if (iIndexOf < i3) {
                    i2 = 1;
                } else if (iIndexOf > i3) {
                }
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(250, 0);
                valueAnimatorOfInt.setDuration(250L);
                if (z) {
                    valueAnimatorOfInt.addUpdateListener(new ibn(this, i2, 0));
                }
                valueAnimatorOfInt.addListener(new ibp(this));
                valueAnimatorOfInt.start();
            }
            huh huhVar = new huh(ktzVar, 19, (byte[]) null, (byte[]) null, (byte[]) null);
            if (this.f30218c != null) {
                if (this.f30241z.m3526f()) {
                    return;
                }
                if (this.f30222g != ikwVar) {
                    this.f30222g = ikwVar;
                    int iIndexOf2 = this.f30229n.indexOf(ikwVar);
                    m11001z(iIndexOf2);
                    this.f30230o = iIndexOf2;
                    this.f30240y.m4500l(ikwVar, new ibo(this, i), huhVar);
                    return;
                }
            }
            huhVar.run();
        }
    }

    /* JADX INFO: renamed from: z */
    private static void m11001z(int i) {
        lku.m15613H(i != -1);
    }

    @Override // p000.icf
    /* JADX INFO: renamed from: a */
    public final List mo11002a() {
        return this.f30229n;
    }

    @Override // p000.icf
    /* JADX INFO: renamed from: b */
    public final void mo11003b() {
        ikw ikwVar = ikw.PHOTO;
        this.f30223h.mo11089o(ikwVar, false);
        m11000y(ikwVar, false);
    }

    @Override // p000.icf
    /* JADX INFO: renamed from: c */
    public final void mo11004c() {
        this.f30223h.mo11087m();
    }

    @Override // p000.icf
    /* JADX INFO: renamed from: d */
    public final void mo11005d(boolean z) {
        this.f30223h.mo11088n(z);
    }

    @Override // p000.icf
    /* JADX INFO: renamed from: e */
    public final void mo11006e(iid iidVar) {
        this.f30240y = iidVar.f31068e;
        this.f30222g.getClass();
        this.f30232q.mo13961e("ModeSwitchCtrl#init");
        this.f30223h.mo11092r(this);
        this.f30223h.mo11094t(this.f30234s);
        this.f30223h.mo11084j(ikw.LONG_EXPOSURE);
        if (this.f30236u) {
            this.f30223h.mo11084j(ikw.MOTION_BLUR);
        }
        if (this.f30233r) {
            this.f30223h.mo11084j(ikw.PORTRAIT);
        }
        this.f30223h.mo11084j(ikw.PHOTO);
        this.f30223h.mo11084j(ikw.VIDEO);
        if (this.f30237v) {
            this.f30223h.mo11084j(ikw.AMBER);
        }
        this.f30223h.mo11086l(this.f30222g);
        this.f30232q.mo13962f();
    }

    @Override // p000.icy
    /* JADX INFO: renamed from: f */
    public final void mo11007f(ikw ikwVar) {
        if (this.f30222g == ikwVar || !this.f30238w) {
            return;
        }
        m11000y(ikwVar, false);
        mo11011j(ikwVar, true);
    }

    @Override // p000.icy
    /* JADX INFO: renamed from: g */
    public final void mo11008g(ikw ikwVar) {
        nps npsVarM14965K;
        ice iceVar = this.f30228m;
        if (iceVar == null || !this.f30238w) {
            return;
        }
        esl eslVar = (esl) iceVar;
        int i = 1;
        if (eslVar.f15339U.m3526f()) {
            npsVarM14965K = kxk.m14965K(true);
        } else {
            ikw ikwVar2 = ikw.ORNAMENT;
            if (ikwVar == ikwVar2) {
                eslVar.f15418v = true;
                ((ido) eslVar.f15332N).get().m16303a();
                eslVar.f15328J.mo3415bf(true);
                npsVarM14965K = kxk.m14965K(true);
            } else {
                ikw ikwVar3 = ikw.MEASURE;
                if (ikwVar == ikwVar3) {
                    eslVar.f15418v = true;
                    mca mcaVarM11124b = ((ido) eslVar.f15332N).get();
                    Context context = eslVar.f15399c;
                    Intent intent = new Intent();
                    intent.setClassName(new oes(context.getPackageManager()).m18440b(), "com.google.vr.apps.ornament.measure.MeasureMainActivity");
                    mcaVarM11124b.m16304b(intent);
                    eslVar.f15330L.mo3415bf(true);
                    npsVarM14965K = kxk.m14965K(true);
                } else {
                    ikw ikwVar4 = ikw.TIARA;
                    if (ikwVar == ikwVar4) {
                        eslVar.f15418v = true;
                        ((ido) eslVar.f15332N).get().m16305c();
                        eslVar.f15331M.mo3415bf(true);
                        npsVarM14965K = kxk.m14965K(true);
                    } else {
                        ikw ikwVar5 = ikw.LENS;
                        if (ikwVar == ikwVar5) {
                            eslVar.f15418v = true;
                            npsVarM14965K = nod.m17553i(((iad) eslVar.f15333O.get()).m10976b(), new etx(eslVar, i), jvh.m13554b());
                        } else {
                            chm chmVar = eslVar.f15411o;
                            if (ikwVar == ikwVar2 || ikwVar == ikwVar4 || ikwVar == ikwVar5 || ikwVar == ikwVar3) {
                                ((ciq) chmVar).f5859y.mo8151Z(iku.m11411e(ikwVar), 1);
                            }
                            ciq ciqVar = (ciq) chmVar;
                            ciqVar.f5843i.mo11199G(false);
                            if (ikwVar == ikw.PHOTO_SPHERE || ikwVar == ikw.REWIND) {
                                ciqVar.f5839e.mo4494f(ikwVar);
                                ciqVar.f5839e.m4499k();
                                if (ikwVar == ikw.REWIND) {
                                    ciqVar.f5839e.mo4492d();
                                    ciqVar.f5839e.mo4493e();
                                }
                                ciqVar.m3808q(ikwVar);
                            } else {
                                ciqVar.f5839e.m4500l(ikwVar, new ibo(ciqVar, i), cik.f5793a);
                            }
                            npsVarM14965K = kxk.m14965K(true);
                        }
                    }
                }
            }
        }
        kxk.m14975U(npsVarM14965K, new cou(this, ikwVar, 8), not.INSTANCE);
    }

    /* JADX INFO: renamed from: h */
    public final void m11009h(boolean z) {
        jvd.m13538a();
        this.f30239x = z;
        if (!z) {
            this.f30226k.f30263a = false;
            this.f30223h.mo11090p(false);
        } else if (this.f30238w) {
            this.f30226k.f30263a = true;
            this.f30223h.mo11090p(true);
        }
    }

    @Override // p000.icf
    /* JADX INFO: renamed from: i */
    public final void mo11010i(icd icdVar) {
        this.f30218c = icdVar;
    }

    @Override // p000.icf
    /* JADX INFO: renamed from: j */
    public final void mo11011j(ikw ikwVar, boolean z) {
        if (ikwVar == null || this.f30222g == ikwVar || this.f30221f) {
            return;
        }
        this.f30222g = ikwVar;
        if (mo11020s(ikwVar)) {
            int iIndexOf = this.f30229n.indexOf(ikwVar);
            m11001z(iIndexOf);
            this.f30230o = iIndexOf;
        } else if (ikwVar.equals(ikw.TIME_LAPSE) || ikwVar.equals(ikw.SLOW_MOTION)) {
            ikw ikwVar2 = ikw.VIDEO;
            this.f30222g = ikwVar2;
            int iIndexOf2 = this.f30229n.indexOf(ikwVar2);
            m11001z(iIndexOf2);
            this.f30230o = iIndexOf2;
        } else {
            int iIndexOf3 = this.f30229n.indexOf(ikw.MORE_MODES);
            m11001z(iIndexOf3);
            this.f30230o = iIndexOf3;
        }
        this.f30223h.mo11089o(this.f30222g, z);
    }

    @Override // p000.icf
    /* JADX INFO: renamed from: k */
    public final void mo11012k(ice iceVar) {
        this.f30228m = iceVar;
    }

    @Override // p000.icf
    /* JADX INFO: renamed from: l */
    public final void mo11013l(boolean z) {
        jvd.m13538a();
        this.f30238w = z;
        if (!z) {
            this.f30226k.f30263a = false;
            this.f30223h.mo11090p(false);
        } else if (this.f30239x) {
            this.f30226k.f30263a = true;
            this.f30223h.mo11090p(true);
        }
    }

    @Override // p000.icf
    /* JADX INFO: renamed from: m */
    public final void mo11014m() {
        this.f30223h.mo11095u();
    }

    @Override // p000.icf
    /* JADX INFO: renamed from: n */
    public final void mo11015n() {
        this.f30223h.mo11096v();
    }

    @Override // p000.icg
    /* JADX INFO: renamed from: o */
    public final boolean mo11016o() {
        return this.f30230o == 0;
    }

    @Override // p000.icg
    /* JADX INFO: renamed from: p */
    public final boolean mo11017p() {
        return this.f30230o == this.f30229n.size() + (-1);
    }

    @Override // p000.icf
    /* JADX INFO: renamed from: q */
    public final boolean mo11018q() {
        return this.f30238w;
    }

    @Override // p000.icf
    /* JADX INFO: renamed from: r */
    public final boolean mo11019r() {
        return this.f30226k.f30263a;
    }

    @Override // p000.icf
    /* JADX INFO: renamed from: s */
    public final boolean mo11020s(ikw ikwVar) {
        return this.f30229n.contains(ikwVar);
    }

    @Override // p000.icf
    /* JADX INFO: renamed from: t */
    public final boolean mo11021t(ikw ikwVar) {
        lku.m15670x(ikwVar != null, "requested mode is null");
        if (this.f30222g == ikwVar) {
            ((nbe) ((nbe) f30215a.m17252c()).mo17276G((char) 4090)).mo17290o("requested mode is currently active");
            return true;
        }
        if (this.f30221f) {
            ((nbe) ((nbe) f30215a.m17251b()).mo17276G((char) 4089)).mo17290o("scroll is currently in progress; don't know what to do with this.");
            return false;
        }
        if (!this.f30238w) {
            ((nbe) ((nbe) f30215a.m17252c()).mo17276G((char) 4088)).mo17290o("mode switch requested when switcher is disabled. Ignoring.");
            return false;
        }
        if (mo11020s(ikwVar)) {
            mo11007f(ikwVar);
        } else {
            mo11008g(ikwVar);
        }
        return true;
    }

    @Override // p000.icg
    /* JADX INFO: renamed from: u */
    public final void mo11022u(int i, boolean z) {
        if (i == 1 && mo11016o()) {
            return;
        }
        if ((i == 2 && mo11017p()) || ((hzp) this.f30225j.mo6051a()).f30074a.f30073i.equals(hzj.f30014d)) {
            return;
        }
        ikw ikwVar = null;
        if (z) {
            if (i == 2) {
                int i2 = mo11017p() ? 0 : this.f30230o + 1;
                while (this.f30229n.get(i2) == ikw.MORE_MODES && i2 != this.f30230o) {
                    i2 = i2 >= this.f30229n.size() + (-1) ? 0 : i2 + 1;
                }
                if (i2 != this.f30230o) {
                    ikwVar = (ikw) this.f30229n.get(i2);
                }
            } else {
                int size = mo11016o() ? this.f30229n.size() : this.f30230o;
                while (true) {
                    size--;
                    if (this.f30229n.get(size) != ikw.MORE_MODES || size == this.f30230o) {
                        break;
                    } else if (size <= 0) {
                        size = this.f30229n.size();
                    }
                }
                if (size != this.f30230o) {
                    ikwVar = (ikw) this.f30229n.get(size);
                }
            }
        } else if (i == 2 && !mo11017p()) {
            ikwVar = (ikw) this.f30229n.get(this.f30230o + 1);
        } else if (i == 1 && !mo11016o()) {
            ikwVar = (ikw) this.f30229n.get(this.f30230o - 1);
        }
        if (ikwVar != null) {
            this.f30234s.mo8158ac(2, this.f30222g.toString(), ikwVar.toString());
            m11000y(ikwVar, true);
        }
    }

    @Override // p000.icf
    /* JADX INFO: renamed from: v */
    public final void mo11023v(boolean z) {
        this.f30223h.mo11077A(z);
    }

    @Override // p000.icf
    /* JADX INFO: renamed from: w */
    public final void mo11024w(ikw ikwVar) {
        m11000y(ikwVar, false);
    }

    @Override // p000.icf
    /* JADX INFO: renamed from: x */
    public final ibs mo11025x() {
        return this.f30226k;
    }
}
