package p000;

import android.os.Trace;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gtk implements dxy, dyn {

    /* JADX INFO: renamed from: a */
    private static final nbh f26359a = nbh.m17259h("com/google/android/apps/camera/qualityscore/FrameQualityScoreProcessor");

    /* JADX INFO: renamed from: b */
    private final gtc f26360b;

    /* JADX INFO: renamed from: c */
    private final gtl f26361c;

    /* JADX INFO: renamed from: d */
    private final dxx f26362d;

    /* JADX INFO: renamed from: e */
    private final fgy f26363e;

    /* JADX INFO: renamed from: f */
    private final mrm f26364f;

    /* JADX INFO: renamed from: g */
    private final mrm f26365g;

    /* JADX INFO: renamed from: h */
    private long f26366h = -1;

    /* JADX INFO: renamed from: i */
    private final hmw f26367i;

    /* JADX INFO: renamed from: j */
    private final msa f26368j;

    public gtk(gtc gtcVar, gtl gtlVar, dxx dxxVar, fgy fgyVar, jww jwwVar, dhv dhvVar, oju ojuVar, hmw hmwVar, msa msaVar, byte[] bArr) {
        boolean z;
        mqu mquVar;
        this.f26360b = gtcVar;
        this.f26361c = gtlVar;
        this.f26362d = dxxVar;
        this.f26363e = fgyVar;
        if (((Boolean) jwwVar.mo3831be()).booleanValue()) {
            z = true;
        } else {
            dhx dhxVar = dhs.f11163a;
            dhvVar.mo6177e();
            z = false;
        }
        if (dhvVar.mo6184l(dhs.f11167e)) {
            if (z) {
                this.f26364f = mqu.f41450a;
                this.f26365g = mrm.m16829i((dyl) ojuVar.get());
            }
            this.f26367i = hmwVar;
            this.f26368j = msaVar;
        }
        if (z) {
            this.f26364f = mrm.m16829i((dyq) ojuVar.get());
            mquVar = mqu.f41450a;
        }
        this.f26365g = mquVar;
        this.f26367i = hmwVar;
        this.f26368j = msaVar;
        mquVar = mqu.f41450a;
        this.f26364f = mquVar;
        this.f26365g = mquVar;
        this.f26367i = hmwVar;
        this.f26368j = msaVar;
    }

    @Override // p000.dyn
    /* JADX INFO: renamed from: b */
    public final void mo6936b(jzk jzkVar) {
        m9761c(jzkVar.f35296a);
    }

    @Override // p000.dxy
    /* JADX INFO: renamed from: bP */
    public final synchronized void mo6891bP(gsr gsrVar) {
        m9761c(gsrVar.f26243c);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m9761c(long j) {
        gsr gsrVarM6885a;
        kpw kpwVarMo8328c = this.f26363e.mo8328c(j);
        if (kpwVarMo8328c == null) {
            return;
        }
        try {
            if (this.f26361c.mo9758c(j) == null && (gsrVarM6885a = this.f26362d.m6885a(j)) != null) {
                mrm mrmVar = this.f26365g;
                if ((!mrmVar.mo16813g() || gsrVarM6885a.f26257q.length <= 0 || ((dyl) mrmVar.mo16809c()).mo6934a(j) != null) && !((Boolean) this.f26367i.m10476a().mo3831be()).booleanValue() && !((Boolean) this.f26368j.m16852g().mo3831be()).booleanValue()) {
                    Trace.beginSection("frameQualityScorer.getFrameScore");
                    gth gthVarM9732a = this.f26360b.m9732a(kpwVarMo8328c, gsrVarM6885a);
                    Trace.endSection();
                    if (j <= this.f26366h) {
                        ((nbe) ((nbe) f26359a.m17251b()).mo17276G(3240)).mo17290o("Out of order frame scores detected!");
                    }
                    this.f26361c.m9762f(gthVarM9732a);
                    mrm mrmVar2 = this.f26364f;
                    if (mrmVar2.mo16813g() && gthVarM9732a.f26354p.mo16813g()) {
                        dyq dyqVar = (dyq) mrmVar2.mo16809c();
                        gtt gttVar = (gtt) gthVarM9732a.f26354p.mo16809c();
                        ArrayList arrayList = new ArrayList();
                        for (gts gtsVar : gttVar.f26393a) {
                            dyj dyjVarM6933a = dyk.m6933a();
                            dyjVarM6933a.m6932d(gtsVar.f26386a);
                            dyjVarM6933a.f12912a = gtsVar.f26387b;
                            dyjVarM6933a.m6931c(gtsVar.f26388c);
                            dyjVarM6933a.f12913b = gtsVar.f26389d;
                            dyjVarM6933a.m6930b(gtsVar.f26390e);
                            arrayList.add(dyjVarM6933a.m6929a());
                        }
                        dyqVar.m6937c(new jzk(gttVar.f26398f, arrayList));
                    }
                    this.f26366h = j;
                }
            }
            kpwVarMo8328c.close();
        } catch (Throwable th) {
            try {
                kpwVarMo8328c.close();
            } catch (Throwable th2) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                } catch (Exception e) {
                }
            }
            throw th;
        }
    }
}
