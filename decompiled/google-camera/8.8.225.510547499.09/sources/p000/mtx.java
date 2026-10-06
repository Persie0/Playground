package p000;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class mtx extends mts implements naf {

    /* JADX INFO: renamed from: b */
    private transient naf f41610b;
    final Comparator comparator;

    public mtx() {
        this(mzg.f41839a);
    }

    @Override // p000.naf, p000.nae
    public final Comparator comparator() {
        return this.comparator;
    }

    @Override // p000.mts
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ Set mo16919e() {
        return new nah(this);
    }

    @Override // p000.naf
    /* JADX INFO: renamed from: j */
    public final myx mo16928j() {
        Iterator itC = mo16910c();
        if (itC.hasNext()) {
            return ((nav) itC).m17209a();
        }
        return null;
    }

    @Override // p000.naf
    /* JADX INFO: renamed from: k */
    public final myx mo16929k() {
        Iterator itMo16933o = mo16933o();
        if (itMo16933o.hasNext()) {
            return ((nav) itMo16933o).m17209a();
        }
        return null;
    }

    @Override // p000.naf
    /* JADX INFO: renamed from: l */
    public final myx mo16930l() {
        Iterator itC = mo16910c();
        if (!itC.hasNext()) {
            return null;
        }
        myx myxVarM17209a = ((nav) itC).m17209a();
        myx myxVarM16554s = mkv.m16554s(myxVarM17209a.mo17162b(), myxVarM17209a.mo17161a());
        itC.remove();
        return myxVarM16554s;
    }

    @Override // p000.naf
    /* JADX INFO: renamed from: m */
    public final myx mo16931m() {
        Iterator itMo16933o = mo16933o();
        if (!itMo16933o.hasNext()) {
            return null;
        }
        myx myxVarM17209a = ((nav) itMo16933o).m17209a();
        myx myxVarM16554s = mkv.m16554s(myxVarM17209a.mo17162b(), myxVarM17209a.mo17161a());
        itMo16933o.remove();
        return myxVarM16554s;
    }

    @Override // p000.naf
    /* JADX INFO: renamed from: n */
    public final naf mo16932n() {
        naf nafVar = this.f41610b;
        if (nafVar != null) {
            return nafVar;
        }
        mtw mtwVar = new mtw(this);
        this.f41610b = mtwVar;
        return mtwVar;
    }

    /* JADX INFO: renamed from: o */
    public abstract Iterator mo16933o();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.NavigableSet, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.NavigableSet, java.util.Set] */
    @Override // p000.mts, p000.myy
    /* JADX INFO: renamed from: p */
    public final NavigableSet mo16920f() {
        ?? r0 = this.f41606a;
        if (r0 != 0) {
            return r0;
        }
        ?? Mo16919e = mo16919e();
        this.f41606a = Mo16919e;
        return Mo16919e;
    }

    @Override // p000.naf
    /* JADX INFO: renamed from: q */
    public final naf mo16935q(Object obj, int i, Object obj2, int i2) {
        return mo17017s(obj, i).mo17016r(obj2, i2);
    }

    public mtx(Comparator comparator) {
        this.comparator = comparator;
    }
}
