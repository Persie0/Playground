package p000;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class goq implements goo {

    /* JADX INFO: renamed from: a */
    private final kfk f25892a;

    public goq(kfk kfkVar) {
        this.f25892a = kfkVar;
    }

    /* JADX INFO: renamed from: c */
    private static final mxk m9586c(Set set) {
        mxi mxiVarM17132D = mxk.m17132D();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            kgg kggVar = (kgg) it.next();
            if (gls.m9445g(kggVar) || gls.m9444f(kggVar)) {
                mxiVarM17132D.mo17072d(kggVar);
            }
        }
        return mxiVarM17132D.mo17127f();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, key] */
    @Override // p000.goo
    /* JADX INFO: renamed from: a */
    public final mxk mo9584a(gmc gmcVar) {
        return m9586c(gmcVar.f25581a.mo7049j().f36067c);
    }

    @Override // p000.goo
    /* JADX INFO: renamed from: b */
    public final kho mo9585b(kho khoVar) {
        mxk mxkVar = khoVar.f36067c;
        return mxkVar.size() == 1 ? khoVar : this.f25892a.mo14135v(m9586c(mxkVar), khoVar.f36068d);
    }
}
