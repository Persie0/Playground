package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fyd implements fzt {

    /* JADX INFO: renamed from: a */
    private final Map f23875a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final Map f23876b = new HashMap();

    /* JADX INFO: renamed from: c */
    private final fym f23877c;

    public fyd(fym fymVar) {
        this.f23877c = fymVar;
    }

    /* JADX INFO: renamed from: b */
    private final void m8946b() {
        Iterator it = this.f23875a.values().iterator();
        while (it.hasNext()) {
            ((kpw) it.next()).close();
        }
        Iterator it2 = this.f23876b.values().iterator();
        while (it2.hasNext()) {
            ((kpw) it2.next()).close();
        }
    }

    /* JADX INFO: renamed from: c */
    private static final void m8947c(long j, Map map) {
        ArrayList arrayList = new ArrayList();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            long jLongValue = ((Long) it.next()).longValue();
            if (jLongValue < j) {
                Long lValueOf = Long.valueOf(jLongValue);
                ((kpw) map.get(lValueOf)).close();
                arrayList.add(lValueOf);
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            map.remove((Long) arrayList.get(i));
        }
    }

    @Override // p000.fzt
    /* JADX INFO: renamed from: a */
    public final void mo3602a(kpw kpwVar, nps npsVar) {
        mrm mrmVarM16829i;
        Map map = this.f23876b;
        Long lValueOf = Long.valueOf(kpwVar.mo7248d());
        fxn fxnVar = new fxn(kpwVar);
        fxnVar.f23804a.put(fxm.f23802a, npsVar);
        map.put(lValueOf, fxnVar);
        if (this.f23876b.isEmpty()) {
            mrmVarM16829i = mqu.f41450a;
        } else {
            Iterator it = this.f23876b.values().iterator();
            long j = 0;
            boolean z = false;
            while (it.hasNext()) {
                long jMo7248d = ((kpw) it.next()).mo7248d();
                if (!z || jMo7248d > j) {
                    j = jMo7248d;
                }
                z = true;
            }
            mrmVarM16829i = !z ? mqu.f41450a : mrm.m16829i(Long.valueOf(j));
        }
        if (mrmVarM16829i.mo16813g()) {
            m8947c(((Long) mrmVarM16829i.mo16809c()).longValue(), this.f23876b);
            m8947c(((Long) mrmVarM16829i.mo16809c()).longValue(), this.f23875a);
        }
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        fxn fxnVar;
        try {
            nps npsVarM14964J = kxk.m14964J(new kec());
            kpw kpwVar = null;
            if (this.f23876b.isEmpty()) {
                fxnVar = null;
            } else {
                fxnVar = null;
                for (fxn fxnVar2 : this.f23876b.values()) {
                    if (fxnVar == null || fxnVar2.mo7248d() > fxnVar.mo7248d()) {
                        fxnVar = fxnVar2;
                    }
                }
            }
            if (fxnVar != null) {
                this.f23876b.remove(Long.valueOf(fxnVar.mo7248d()));
                npsVarM14964J = fxnVar.m8924k();
                npsVarM14964J.getClass();
            }
            if (fxnVar != null) {
                kpwVar = (kpw) this.f23875a.get(Long.valueOf(fxnVar.mo7248d()));
                if (kpwVar != null) {
                    this.f23875a.remove(Long.valueOf(kpwVar.mo7248d()));
                }
            }
            fym fymVar = this.f23877c;
            mrm mrmVarM16828h = mrm.m16828h(fxnVar);
            mrm mrmVarM16828h2 = mrm.m16828h(kpwVar);
            try {
                if (mrmVarM16828h2.mo16813g()) {
                    ((kpw) mrmVarM16828h2.mo16809c()).close();
                }
                HashSet hashSet = new HashSet();
                hashSet.add(grd.CREATE_EARLY_FILMSTRIP_PREVIEW);
                hashSet.add(grd.CONVERT_TO_RGB_PREVIEW);
                hashSet.add(grd.COMPRESS_TO_JPEG_AND_WRITE_TO_DISK);
                hashSet.add(grd.CLOSE_ON_ALL_TASKS_RELEASE);
                if (mrmVarM16828h.mo16813g()) {
                    fymVar.f23924e.f23972b.add(npsVarM14964J);
                    try {
                        grc grcVar = fymVar.f23923d.f23926b;
                        grl grlVarM9671a = grm.m9671a((kpw) mrmVarM16828h.mo16809c());
                        grlVarM9671a.f26146d = npsVarM14964J;
                        grlVarM9671a.f26145c = fymVar.f23921b;
                        grlVarM9671a.f26147e = fymVar.f23923d.f23927c;
                        grlVarM9671a.m9670b(fymVar.f23920a.mo9898d());
                        grcVar.mo9664d(grlVarM9671a.m9669a(), fymVar.f23923d.f23928d, hashSet, fymVar.f23920a, mrm.m16829i(fymVar.f23922c));
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    dos dosVar = new dos("received an image, but it did not have any image data!");
                    ((nbe) ((nbe) fyn.f23925a.m17251b()).mo17276G(2532)).mo17293r("%s", dosVar.getMessage());
                    fymVar.f23920a.mo9870B(ihd.f30944a, dosVar);
                }
                fymVar.f23924e.close();
                m8946b();
            } catch (Throwable th) {
                fymVar.f23924e.close();
                throw th;
            }
        } catch (Throwable th2) {
            m8946b();
            throw th2;
        }
    }
}
