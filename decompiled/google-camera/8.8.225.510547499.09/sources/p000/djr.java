package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import p021j$.time.Instant;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class djr implements chv, gyi {

    /* JADX INFO: renamed from: a */
    public static final nbh f11795a = nbh.m17259h("com/google/android/apps/camera/data/CameraFilmstripDataAdapter");

    /* JADX INFO: renamed from: b */
    public final djv f11796b = new djv();

    /* JADX INFO: renamed from: c */
    public final nph f11797c = new djq(this, 0);

    /* JADX INFO: renamed from: d */
    public final Context f11798d;

    /* JADX INFO: renamed from: e */
    public final dkg f11799e;

    /* JADX INFO: renamed from: f */
    public final kbz f11800f;

    /* JADX INFO: renamed from: g */
    public final boolean f11801g;

    /* JADX INFO: renamed from: h */
    public final dke f11802h;

    /* JADX INFO: renamed from: i */
    public final dke f11803i;

    /* JADX INFO: renamed from: j */
    public final nqf f11804j;

    /* JADX INFO: renamed from: k */
    public final hah f11805k;

    /* JADX INFO: renamed from: l */
    public final Instant f11806l;

    /* JADX INFO: renamed from: m */
    public final djz f11807m;

    /* JADX INFO: renamed from: n */
    public final cdu f11808n;

    /* JADX INFO: renamed from: o */
    public final cvy f11809o;

    /* JADX INFO: renamed from: p */
    public final bko f11810p;

    /* JADX INFO: renamed from: q */
    private final Executor f11811q;

    /* JADX INFO: renamed from: r */
    private final dhv f11812r;

    /* JADX INFO: renamed from: s */
    private final gxa f11813s;

    /* JADX INFO: renamed from: t */
    private final djs f11814t;

    public djr(Context context, cdu cduVar, dkg dkgVar, cvy cvyVar, bko bkoVar, kbz kbzVar, dhv dhvVar, Executor executor, gxa gxaVar, boolean z, hah hahVar, djz djzVar, djs djsVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f11798d = context;
        this.f11808n = cduVar;
        this.f11799e = dkgVar;
        this.f11809o = cvyVar;
        this.f11810p = bkoVar;
        this.f11800f = kbzVar;
        this.f11812r = dhvVar;
        this.f11811q = executor;
        this.f11813s = gxaVar;
        this.f11801g = z;
        this.f11805k = hahVar;
        this.f11807m = djzVar;
        this.f11814t = djsVar;
        nnf nnfVar = nnf.INSTANCE;
        this.f11806l = Instant.now();
        this.f11804j = nqf.m17621g();
        this.f11802h = new dke();
        this.f11803i = new dke();
    }

    /* JADX INFO: renamed from: w */
    private final chp m6253w(gyu gyuVar) {
        chp chpVarMo3761e = mo3761e(gyuVar);
        lku.m15616K(true, "Could not find %s in dataAdapter", gyuVar);
        return chpVarMo3761e;
    }

    /* JADX INFO: renamed from: y */
    private final dke m6254y(chp chpVar) {
        return chpVar.mo3736e() == gyx.MEDIA_STORE ? this.f11802h : this.f11803i;
    }

    /* JADX INFO: renamed from: z */
    private final nps m6255z() {
        nps npsVarM14968N = kxk.m14968N(new dgt(this, 2), this.f11811q);
        dhv dhvVar = this.f11812r;
        dhx dhxVar = dib.f11240a;
        dhvVar.mo6178f();
        this.f11808n.m3529i().m13537d(new dev(npsVarM14968N, 10));
        return npsVarM14968N;
    }

    @Override // p000.cho
    /* JADX INFO: renamed from: a */
    public final int mo3728a() {
        return m6256s().m6294a();
    }

    @Override // p000.cho
    /* JADX INFO: renamed from: b */
    public final chp mo3729b() {
        return m6256s().m6295b();
    }

    @Override // p000.chv
    /* JADX INFO: renamed from: bs */
    public final void mo3759bs() {
        this.f11811q.execute(new dgt(this, 3));
    }

    @Override // p000.chv
    /* JADX INFO: renamed from: bt */
    public final void mo3760bt() {
        if (mo3728a() == 0) {
            nps npsVar = npp.f44031a;
            return;
        }
        nps npsVarM14968N = kxk.m14968N(new dgt(this, 4), this.f11811q);
        kxk.m14975U(npsVarM14968N, this.f11797c, this.f11811q);
        this.f11808n.m3529i().m13537d(new dev(npsVarM14968N, 11));
    }

    @Override // p000.cho
    /* JADX INFO: renamed from: c */
    public final void mo3730c(chn chnVar) {
        djv djvVar = this.f11796b;
        lku.m15614I(djvVar.f11824a.size() < 4, "More listeners added than is allowed in configured capacity: 4");
        djvVar.f11824a.add(chnVar);
        if (this.f11804j.isDone()) {
            chnVar.mo3727a();
        }
    }

    @Override // p000.cho
    /* JADX INFO: renamed from: d */
    public final void mo3731d(chn chnVar) {
        this.f11796b.f11824a.remove(chnVar);
    }

    @Override // p000.chv
    /* JADX INFO: renamed from: e */
    public final chp mo3761e(gyu gyuVar) {
        chp chpVarM6297d = this.f11802h.m6297d(gyuVar);
        return chpVarM6297d != null ? chpVarM6297d : this.f11803i.m6297d(gyuVar);
    }

    @Override // p000.chv
    /* JADX INFO: renamed from: f */
    public final chp mo3762f(chp chpVar) {
        return m6254y(chpVar).m6298e(chpVar);
    }

    @Override // p000.chv
    /* JADX INFO: renamed from: g */
    public final nps mo3763g() {
        nps npsVarM6255z = m6255z();
        kxk.m14975U(npsVarM6255z, this.f11797c, this.f11811q);
        return npsVarM6255z;
    }

    @Override // p000.chv
    /* JADX INFO: renamed from: h */
    public final void mo3764h() {
        mo3728a();
        this.f11803i.m6301h();
        this.f11796b.mo3727a();
    }

    @Override // p000.chv
    /* JADX INFO: renamed from: i */
    public final void mo3765i() {
        djs djsVar = this.f11814t;
        nps npsVarM14968N = djsVar.f11818d.getAndSet(true) ? npp.f44031a : kxk.m14968N(new dgt(djsVar, 6), djsVar.f11817c);
        nps npsVarM6255z = m6255z();
        nps npsVarMo9922b = this.f11813s.mo9922b(this);
        not notVar = not.INSTANCE;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(npsVarM14968N);
        arrayList.add(npsVarM6255z);
        arrayList.add(npsVarMo9922b);
        kxk.m14975U(nod.m17554j(kxk.m14961G(arrayList), new etv(5), notVar), this.f11797c, this.f11811q);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return m6256s().iterator();
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: j */
    public final void mo3957j(gyu gyuVar) {
        chp chpVarMo3761e = mo3761e(gyuVar);
        if (chpVarMo3761e == null) {
            ((nbe) ((nbe) f11795a.m17252c()).mo17276G((char) 909)).mo17293r("onSessionCanceled tried to remove URI that couldn't be found: %s", gyuVar);
        } else {
            m6257t(chpVarMo3761e);
        }
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void mo3958k(gyu gyuVar) {
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: l */
    public final void mo3959l(gyu gyuVar) {
        chp chpVarM6253w = m6253w(gyuVar);
        if (chpVarM6253w == null) {
            return;
        }
        boolean zBooleanValue = ((Boolean) mrm.m16828h(this.f11813s.mo9921a(gyuVar)).mo16808b(ddu.f10587d).mo16811e(false)).booleanValue();
        if (chpVarM6253w.mo3736e() == gyx.MARS_STORE) {
            mo3965r(gyuVar);
            chq chqVarMo3733b = chpVarM6253w.mo3733b();
            if (chqVarMo3733b instanceof dkb) {
                dka dkaVar = new dka((dkb) chqVarMo3733b);
                dkaVar.m6279d(false);
                chpVarM6253w.mo3737f(dkaVar.m6276a());
                return;
            }
            return;
        }
        if (!(chpVarM6253w instanceof dkh) && !zBooleanValue) {
            if (chpVarM6253w instanceof dkf) {
                Uri uriMo3743c = chpVarM6253w.mo3733b().mo3743c();
                lku.m15613H(!uriMo3743c.equals(Uri.EMPTY));
                try {
                    dkg dkgVar = this.f11799e;
                    m6258u(chpVarM6253w, new dkf(dkgVar.f11885c, dkgVar.f11886d, dkgVar.f11888f.m6288c(uriMo3743c, gyuVar), dkgVar.f11890h, chpVarM6253w.mo3736e()));
                    return;
                } catch (mso e) {
                    ((nbe) ((nbe) ((nbe) f11795a.m17251b()).mo17283h(e)).mo17276G((char) 907)).mo17290o("createPublished gets exception in transforming a cursor.");
                    return;
                }
            }
            return;
        }
        Uri uriMo3743c2 = chpVarM6253w.mo3733b().mo3743c();
        lku.m15616K(!uriMo3743c2.equals(Uri.EMPTY), "Could not find MediaStore URI for %s", gyuVar);
        try {
            cvy cvyVar = this.f11809o;
            gyx gyxVarMo3736e = chpVarM6253w.mo3736e();
            m6258u(chpVarM6253w, new dkh((Context) cvyVar.f9845b, (djy) cvyVar.f9846c, ((dkc) cvyVar.f9844a).m6288c(uriMo3743c2, gyuVar), gyxVarMo3736e));
        } catch (mso e2) {
            ((nbe) ((nbe) ((nbe) f11795a.m17251b()).mo17283h(e2)).mo17276G((char) 918)).mo17290o("createPublished gets exception in transforming a cursor.");
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
        Instant instantOfEpochMilli;
        gyw gywVar = gypVar.f26867c;
        if (gywVar == gyw.LONG_SHOT || gywVar == gyw.VIDEO || gywVar == gyw.TIMELAPSE || gywVar == gyw.CINEMATIC || gywVar == gyw.AMBER || gywVar == gyw.AMETHYST) {
            if (gywVar == gyw.LONG_SHOT || !this.f11801g || gypVar.f26868d) {
                cvy cvyVar = this.f11809o;
                Object obj = cvyVar.f9847d;
                Instant instantNow = Instant.now();
                dka dkaVarM6285k = dkb.m6285k();
                dkaVarM6285k.m6278c(instantNow);
                dkaVarM6285k.m6280e(instantNow);
                dkaVarM6285k.m6279d(true);
                dkaVarM6285k.m6277b(gypVar.f26865a);
                dkaVarM6285k.m6284i(gypVar.f26866b);
                dkaVarM6285k.f11844a = gyuVar;
                m6259v(new dkh((Context) cvyVar.f9845b, (djy) cvyVar.f9846c, dkaVarM6285k.m6276a(), gyxVar));
                return;
            }
            return;
        }
        dkg dkgVar = this.f11799e;
        lqq lqqVar = (lqq) dkgVar.f11890h.f28273b.get(gyuVar);
        Object obj2 = lqqVar != null ? lqqVar.f39003c : null;
        if (obj2 == null) {
            obj2 = dkg.f11884b;
            ((nbe) ((nbe) dkg.f11883a.m17252c()).mo17276G(953)).mo17271B("Size not set for in-progress item %s with mediaStoreRecord %s. Assuming %s", gyuVar, gypVar, obj2);
        }
        gyh gyhVarMo9921a = dkgVar.f11889g.mo9921a(gyuVar);
        if (gyhVarMo9921a == null) {
            nng nngVar = dkgVar.f11887e;
            instantOfEpochMilli = Instant.now();
        } else {
            instantOfEpochMilli = Instant.ofEpochMilli(gyhVarMo9921a.mo9898d());
        }
        dka dkaVarM6285k2 = dkb.m6285k();
        dkaVarM6285k2.f11844a = gyuVar;
        dkaVarM6285k2.m6278c(instantOfEpochMilli);
        dkaVarM6285k2.m6280e(instantOfEpochMilli);
        dkaVarM6285k2.f11845b = (kbc) obj2;
        dkaVarM6285k2.m6279d(true);
        dkaVarM6285k2.m6277b(gypVar.f26865a);
        dkaVarM6285k2.m6284i(gypVar.f26866b);
        m6259v(new dkf(dkgVar.f11885c, dkgVar.f11886d, dkaVarM6285k2.m6276a(), dkgVar.f11890h, gyxVar));
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: r */
    public final void mo3965r(gyu gyuVar) {
        if (m6253w(gyuVar) == null) {
            return;
        }
        this.f11796b.mo3727a();
    }

    /* JADX INFO: renamed from: s */
    public final dke m6256s() {
        return ((Boolean) this.f11805k.mo10031c(gzy.f27036at)).booleanValue() ? this.f11803i : this.f11802h;
    }

    /* JADX INFO: renamed from: t */
    public final void m6257t(chp chpVar) {
        m6254y(chpVar).m6303j(chpVar);
        this.f11796b.mo3727a();
    }

    /* JADX INFO: renamed from: u */
    public final void m6258u(chp chpVar, chp chpVar2) {
        m6254y(chpVar2).m6304k(chpVar2);
        nps npsVarM14969O = kxk.m14969O(new cpb(this, chpVar, 3), this.f11811q);
        npsVarM14969O.mo2282d(new dgt(this.f11796b, 5), this.f11811q);
        this.f11808n.m3529i().m13537d(new dev(npsVarM14969O, 12));
    }

    /* JADX INFO: renamed from: v */
    public final void m6259v(chp chpVar) {
        m6254y(chpVar).m6304k(chpVar);
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: x */
    public final void mo3971x(gyu gyuVar) throws Throwable {
        chp chpVarMo3761e = mo3761e(gyuVar);
        gyh gyhVarMo9921a = this.f11813s.mo9921a(gyuVar);
        if (gyhVarMo9921a != null) {
            ((hjz) gyhVarMo9921a.mo9905k()).m10410i(2, SystemClock.elapsedRealtime());
        }
        if (chpVarMo3761e != null) {
            m6257t(chpVarMo3761e);
        }
    }
}
