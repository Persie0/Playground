package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p021j$.util.List$EL;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fps implements fre {

    /* JADX INFO: renamed from: a */
    private final ftm f23134a;

    /* JADX INFO: renamed from: b */
    private final ohb f23135b;

    /* JADX INFO: renamed from: c */
    private final gti f23136c;

    /* JADX INFO: renamed from: d */
    private final fqi f23137d;

    /* JADX INFO: renamed from: e */
    private final List f23138e = new ArrayList();

    public fps(gti gtiVar, ohb ohbVar, ftm ftmVar, fqi fqiVar) {
        this.f23134a = ftmVar;
        this.f23135b = ohbVar;
        this.f23136c = gtiVar;
        this.f23137d = fqiVar;
    }

    /* JADX INFO: renamed from: d */
    private final fpr m8675d(long j) {
        gth gthVarMo9758c = this.f23136c.mo9758c(j);
        if (gthVarMo9758c == null) {
            mqu mquVar = mqu.f41450a;
            gthVarMo9758c = new gth(j, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, false, mquVar, mquVar, mquVar);
        }
        return new fpr(gthVarMo9758c);
    }

    /* JADX INFO: renamed from: e */
    private static final fpx m8676e(fpr fprVar) {
        return new fpq(fprVar, 0);
    }

    @Override // p000.fte
    /* JADX INFO: renamed from: a */
    public final synchronized int mo8677a(List list) {
        this.f23138e.clear();
        ArrayList arrayList = new ArrayList(list);
        List$EL.sort(arrayList, amx.f744h);
        mws mwsVarM17095j = mws.m17095j(arrayList);
        int size = mwsVarM17095j.size();
        int iMo8705b = this.f23137d.mo8705b();
        int iMo8704a = this.f23137d.mo8704a();
        if (size < iMo8705b) {
            iMo8704a = Math.max(1, size - 2);
        }
        if (this.f23134a.mo8764a() == 1) {
            return 0;
        }
        kfd kfdVarM14358b = ((kiq) mwsVarM17095j.get(mwsVarM17095j.size() - 1)).m14358b();
        kfdVarM14358b.getClass();
        long j = kfdVarM14358b.f35811b;
        int iMax = Math.max(mwsVarM17095j.size() - iMo8704a, 0);
        kfd kfdVarM14358b2 = ((kiq) mwsVarM17095j.get(iMax)).m14358b();
        kfdVarM14358b2.getClass();
        mzj mzjVarM17175e = mzj.m17175e(Long.valueOf(kfdVarM14358b2.f35811b), Long.valueOf(j));
        HashMap map = new HashMap();
        for (int i = 0; i < mwsVarM17095j.size(); i++) {
            kfd kfdVarM14358b3 = ((kiq) mwsVarM17095j.get(i)).m14358b();
            kfdVarM14358b3.getClass();
            fpr fprVarM8675d = m8675d(kfdVarM14358b3.f35811b);
            map.put((kiq) mwsVarM17095j.get(i), fprVarM8675d);
            this.f23138e.add(fprVarM8675d);
        }
        List<fpr> list2 = this.f23138e;
        ArrayList<gth> arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (fpr fprVar : list2) {
            if (mzjVarM17175e.mo8324a(Long.valueOf(((gth) fprVar.f23133c).f26339a))) {
                arrayList3.add(Float.valueOf(0.0f));
            } else {
                arrayList2.add(fprVar.f23133c);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (gth gthVar : arrayList2) {
            float fM9774c = guh.m9774c(gthVar, arrayList2) * 5.0E-4f;
            long j2 = gthVar.f26339a;
            arrayList4.add(new gtg(fM9774c, fM9774c));
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it = arrayList4.iterator();
        while (it.hasNext()) {
            arrayList5.add(Float.valueOf(((gtg) it.next()).f26338b));
        }
        arrayList5.addAll(arrayList3);
        for (int i2 = 0; i2 < this.f23138e.size(); i2++) {
            fpr fprVar2 = (fpr) this.f23138e.get(i2);
            fha fhaVar = (fha) this.f23135b.get();
            Long lValueOf = Long.valueOf(((gth) fprVar2.f23133c).f26339a);
            float f = true != fhaVar.mo8407b(mzj.m17175e(lValueOf, lValueOf)) ? 0.0f : -1000.0f;
            fha fhaVar2 = (fha) this.f23135b.get();
            Long lValueOf2 = Long.valueOf(((gth) fprVar2.f23133c).f26339a);
            if (!fhaVar2.mo8406a(mzj.m17175e(lValueOf2, lValueOf2))) {
                f -= 1000.0f;
            }
            fprVar2.f23131a += ((Float) arrayList5.get(i2)).floatValue() + f;
            fprVar2.f23132b += f;
        }
        while (iMax < mwsVarM17095j.size()) {
            kiq kiqVar = (kiq) mwsVarM17095j.get(iMax);
            if (map.containsKey(kiqVar)) {
                ((fpr) map.get(kiqVar)).f23131a += 10000.0f;
            }
            iMax++;
        }
        float f2 = Float.MAX_VALUE;
        int i3 = 0;
        for (int i4 = 0; i4 < mwsVarM17095j.size(); i4++) {
            fpr fprVar3 = (fpr) map.get(mwsVarM17095j.get(i4));
            fprVar3.getClass();
            float f3 = fprVar3.f23131a;
            if (f3 < f2) {
                i3 = i4;
            }
            if (f3 < f2) {
                f2 = f3;
            }
        }
        this.f23138e.remove(i3);
        return i3;
    }

    @Override // p000.fpy
    /* JADX INFO: renamed from: b */
    public final fpx mo8678b(long j) {
        return m8676e(m8675d(j));
    }

    @Override // p000.fpy
    /* JADX INFO: renamed from: c */
    public final synchronized List mo8679c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f23138e.iterator();
        while (it.hasNext()) {
            arrayList.add(m8676e((fpr) it.next()));
        }
        return arrayList;
    }
}
