package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class flh implements dxy, flf {

    /* JADX INFO: renamed from: b */
    private static final long f22465b = Math.round(1.6666666666666666E7d);

    /* JADX INFO: renamed from: a */
    public final dxx f22466a;

    /* JADX INFO: renamed from: d */
    private final long f22468d;

    /* JADX INFO: renamed from: f */
    private final List f22470f;

    /* JADX INFO: renamed from: g */
    private final Executor f22471g;

    /* JADX INFO: renamed from: h */
    private final dhv f22472h;

    /* JADX INFO: renamed from: i */
    private final mrm f22473i;

    /* JADX INFO: renamed from: l */
    private volatile gsr f22476l;

    /* JADX INFO: renamed from: m */
    private volatile fle f22477m;

    /* JADX INFO: renamed from: n */
    private volatile long f22478n;

    /* JADX INFO: renamed from: p */
    private volatile int f22480p;

    /* JADX INFO: renamed from: q */
    private final gtg f22481q;

    /* JADX INFO: renamed from: r */
    private final gtg f22482r;

    /* JADX INFO: renamed from: s */
    private final dsx f22483s;

    /* JADX INFO: renamed from: k */
    private mrm f22475k = mqu.f41450a;

    /* JADX INFO: renamed from: c */
    private final AtomicBoolean f22467c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e */
    private final AtomicBoolean f22469e = new AtomicBoolean(true);

    /* JADX INFO: renamed from: o */
    private volatile long f22479o = Long.MAX_VALUE;

    /* JADX INFO: renamed from: j */
    private final List f22474j = new ArrayList();

    public flh(dxx dxxVar, long j, List list, int i, Executor executor, dsx dsxVar, dhv dhvVar, mrm mrmVar, byte[] bArr, byte[] bArr2) {
        gtg gtgVar;
        this.f22466a = dxxVar;
        this.f22468d = j;
        this.f22470f = list;
        this.f22480p = i;
        this.f22471g = executor;
        this.f22483s = dsxVar;
        this.f22472h = dhvVar;
        this.f22473i = mrmVar;
        if (dhvVar == null || !dhvVar.mo6184l(dij.f11560J)) {
            this.f22481q = new gtg(0.3f, 0.6f, null);
            gtgVar = new gtg(0.5f, 0.8f, null);
        } else {
            this.f22481q = new gtg(0.3f, 0.6f, null);
            gtgVar = new gtg(0.6f, 0.8f, null);
        }
        this.f22482r = gtgVar;
    }

    /* JADX INFO: renamed from: b */
    private final int m8544b(List list) {
        int size = list.size();
        do {
            size--;
            if (size <= 1) {
                break;
            }
        } while (((gsr) list.get(size)).f26243c > this.f22468d + f22465b);
        this.f22476l = (gsr) list.get(size);
        return size;
    }

    /* JADX INFO: renamed from: c */
    private final mrm m8545c(gsr gsrVar) {
        gsr gsrVar2 = this.f22476l;
        if (gsrVar2 == null || gsrVar == null) {
            return mqu.f41450a;
        }
        m8546e(gsrVar);
        long j = gsrVar.f26243c;
        long j2 = this.f22468d;
        if (j < j2) {
            return mqu.f41450a;
        }
        if (j > j2 + 1500000000) {
            mrm.m16829i(fli.MAX_LENGTH);
            return mrm.m16829i(fli.MAX_LENGTH);
        }
        for (flp flpVar : this.f22470f) {
            if (flpVar.mo8555b(gsrVar, gsrVar2)) {
                mrm.m16829i(flpVar.mo8554a());
                return mrm.m16829i(flpVar.mo8554a());
            }
        }
        return mqu.f41450a;
    }

    /* JADX INFO: renamed from: e */
    private final synchronized void m8546e(gsr gsrVar) {
        this.f22474j.add(gsrVar);
    }

    /* JADX INFO: renamed from: f */
    private final void m8547f(fli fliVar) {
        if (fliVar.equals(fli.ADAPTIVE_DISTANCE)) {
            this.f22479o = Math.max(this.f22468d, this.f22479o - (dye.f12890j * 6));
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0041  */
    /* JADX WARN: Code duplicated, block: B:22:0x0057  */
    /* JADX INFO: renamed from: g */
    private final void m8548g(fle fleVar, long j, fli fliVar) {
        boolean zM8550i;
        boolean zM8549h;
        String str;
        boolean z = false;
        if (!this.f22467c.compareAndSet(false, true) || fleVar == null) {
            return;
        }
        long jMin = Math.min(TimeUnit.MICROSECONDS.convert(this.f22479o, TimeUnit.NANOSECONDS), TimeUnit.MICROSECONDS.convert(this.f22468d, TimeUnit.NANOSECONDS) + 1500000);
        if (this.f22472h != null) {
            dhx dhxVar = dii.f11525a;
            int i = this.f22480p;
            if (i == 0) {
                throw null;
            }
            if (i == 1) {
                zM8550i = m8550i();
            } else {
                zM8550i = false;
            }
        } else {
            zM8550i = false;
        }
        if (this.f22483s.m6693h()) {
            int i2 = this.f22480p;
            if (i2 == 0) {
                throw null;
            }
            if (i2 == 1) {
                zM8549h = m8549h();
            } else {
                zM8549h = false;
            }
        } else {
            zM8549h = false;
        }
        if (jMin - j < 1000000) {
            z = zM8549h;
        } else {
            if (!zM8550i || zM8549h) {
                fleVar.mo8369b(jMin, fliVar);
                return;
            }
            zM8550i = true;
        }
        int i3 = this.f22480p;
        if (i3 == 0) {
            throw null;
        }
        if (i3 == 1) {
            if (zM8550i && !z) {
                mrm.m16829i(fkv.STATIC_SCENE_OR_NO_BETTER_FRAME);
                fleVar.mo8368a(fkv.STATIC_SCENE_OR_NO_BETTER_FRAME);
                return;
            } else if (TimeUnit.MICROSECONDS.convert(this.f22468d, TimeUnit.NANOSECONDS) - j < dye.f12889i * 10) {
                mrm.m16829i(fkv.START_TOO_CLOSE_TO_SHUTTER);
                fleVar.mo8368a(fkv.START_TOO_CLOSE_TO_SHUTTER);
                return;
            } else {
                mrm.m16829i(fkv.TOO_SHORT);
                fleVar.mo8368a(fkv.TOO_SHORT);
                return;
            }
        }
        int i4 = this.f22480p;
        if (i4 == 0) {
            throw null;
        }
        if (i4 == 2) {
            fleVar.mo8369b(j + 1000000, fliVar);
            return;
        }
        switch (this.f22480p) {
            case 1:
                str = "TRIMMING_MODE_AUTO";
                break;
            case 2:
                str = "TRIMMING_MODE_NEVER_DROP";
                break;
            default:
                str = "null";
                break;
        }
        throw new IllegalStateException("Unknown trimming mode:".concat(str));
    }

    /* JADX INFO: renamed from: h */
    private final synchronized boolean m8549h() {
        boolean z;
        gth gthVarMo9758c = ((gti) ((mrq) this.f22473i).f41482a).mo9758c(this.f22476l.f26243c);
        if (gthVarMo9758c == null) {
            return false;
        }
        Iterator it = this.f22474j.iterator();
        float f = 0.0f;
        while (it.hasNext()) {
            gth gthVarMo9758c2 = ((gti) ((mrq) this.f22473i).f41482a).mo9758c(((gsr) it.next()).f26243c);
            float f2 = gthVarMo9758c2 == null ? 0.0f : gthVarMo9758c2.f26340b;
            if (f2 > f) {
                f = f2;
            }
        }
        if (this.f22472h.mo6184l(dij.f11586j)) {
            this.f22472h.mo6177e();
            z = true;
        } else {
            z = false;
        }
        return fko.m8524a(f - gthVarMo9758c.f26340b, z) > 0.6f;
    }

    /* JADX INFO: renamed from: i */
    private final synchronized boolean m8550i() {
        int size = this.f22474j.size();
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i = 0; i < size; i++) {
            gsr gsrVar = (gsr) this.f22474j.get(i);
            f += gsrVar.f26249i;
            float f3 = gsrVar.f26256p;
            if (f3 > f2) {
                f2 = f3;
            }
        }
        float size2 = f / this.f22474j.size();
        float fM8551j = m8551j(size2, this.f22481q);
        float fM8551j2 = m8551j(size2, this.f22482r);
        if (this.f22472h.mo6184l(dij.f11560J) && size2 < 1.0E-9d) {
            fM8551j2 = 0.8f;
            fM8551j = 0.6f;
        }
        Iterator it = this.f22474j.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            float f4 = ((gsr) it.next()).f26256p;
            if (f4 > 0.1f) {
                f4 /= f2;
            }
            if (f4 > fM8551j) {
                i2++;
            } else {
                i3++;
            }
        }
        if (i2 == 0) {
            return true;
        }
        return ((float) i2) / ((float) (i3 + i2)) < fM8551j2;
    }

    /* JADX INFO: renamed from: j */
    private static final float m8551j(float f, gtg gtgVar) {
        float f2 = gtgVar.f26338b;
        float f3 = gtgVar.f26337a;
        float fMin = Math.min(Math.max((f - 1.0f) / 0.5f, 0.0f), 1.0f);
        return (f2 * (1.0f - fMin)) + (f3 * fMin);
    }

    @Override // p000.flf
    /* JADX INFO: renamed from: a */
    public final long mo8530a() {
        List listM6888d = this.f22466a.m6888d();
        if (listM6888d.isEmpty()) {
            return TimeUnit.MICROSECONDS.convert(this.f22468d, TimeUnit.NANOSECONDS) - 1500000;
        }
        int iM8544b = m8544b(listM6888d);
        long j = this.f22476l.f26243c;
        int i = iM8544b - 1;
        while (true) {
            if (i < 0) {
                this.f22475k = mrm.m16829i(fli.MAX_LENGTH);
                break;
            }
            gsr gsrVar = (gsr) listM6888d.get(i);
            long j2 = gsrVar.f26243c;
            gsr gsrVar2 = this.f22476l;
            if (gsrVar2 != null && gsrVar != null) {
                m8546e(gsrVar);
                long j3 = gsrVar.f26243c;
                long j4 = this.f22468d;
                if (j3 > j4) {
                    continue;
                } else {
                    if (j3 < j4 - 1500000000) {
                        this.f22475k = mrm.m16829i(fli.MAX_LENGTH);
                    } else {
                        Iterator it = this.f22470f.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                flp flpVar = (flp) it.next();
                                if (flpVar.mo8555b(gsrVar, gsrVar2)) {
                                    this.f22475k = mrm.m16829i(flpVar.mo8554a());
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    if (i <= iM8544b) {
                        break;
                    }
                }
            }
            i--;
            j = j2;
        }
        this.f22478n = Math.min(Math.max(TimeUnit.MICROSECONDS.convert(j + (this.f22475k.equals(mrm.m16829i(fli.ADAPTIVE_DISTANCE)) ? dye.f12890j * 6 : 0L), TimeUnit.NANOSECONDS), TimeUnit.MICROSECONDS.convert(this.f22468d, TimeUnit.NANOSECONDS) - 1500000), TimeUnit.MICROSECONDS.convert(this.f22468d, TimeUnit.NANOSECONDS));
        return this.f22478n;
    }

    @Override // p000.dxy
    /* JADX INFO: renamed from: bP */
    public final synchronized void mo6891bP(gsr gsrVar) {
        fle fleVar = this.f22477m;
        long j = this.f22478n;
        if (!this.f22469e.compareAndSet(true, false)) {
            mrm mrmVarM8545c = m8545c(gsrVar);
            if (mrmVarM8545c.mo16813g()) {
                m8547f((fli) mrmVarM8545c.mo16809c());
                m8548g(fleVar, j, (fli) mrmVarM8545c.mo16809c());
            } else {
                this.f22479o = gsrVar.f26243c;
            }
            return;
        }
        List listM6888d = this.f22466a.m6888d();
        if (!listM6888d.isEmpty()) {
            this.f22479o = this.f22468d;
            for (int iM8544b = m8544b(listM6888d) + 1; iM8544b < listM6888d.size(); iM8544b++) {
                gsr gsrVar2 = (gsr) listM6888d.get(iM8544b);
                mrm mrmVarM8545c2 = m8545c(gsrVar2);
                if (mrmVarM8545c2.mo16813g()) {
                    m8547f((fli) mrmVarM8545c2.mo16809c());
                    m8548g(fleVar, j, (fli) mrmVarM8545c2.mo16809c());
                } else {
                    this.f22479o = gsrVar2.f26243c;
                }
            }
        }
    }

    @Override // p000.flf
    /* JADX INFO: renamed from: d */
    public final void mo8533d(fle fleVar) {
        this.f22477m = new flg(this, fleVar);
        this.f22466a.m6887c(this, this.f22471g);
    }
}
