package p000;

import com.google.android.clockwork.common.wearable.wearmaterial.selectioncontrol.eMjB.VzWFSVj;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mzp extends muu {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: d */
    private final mzj f41850d;

    public mzp(mzj mzjVar, mve mveVar) {
        super(mveVar);
        this.f41850d = mzjVar;
    }

    /* JADX INFO: renamed from: T */
    public static boolean m17187T(Comparable comparable, Comparable comparable2) {
        return mzj.m17172b(comparable, comparable2) == 0;
    }

    /* JADX INFO: renamed from: U */
    private final muu m17188U(mzj mzjVar) {
        return this.f41850d.m17185n(mzjVar) ? muu.m16979a(this.f41850d.m17179h(mzjVar), this.f41669a) : new mvg(this.f41669a);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException(VzWFSVj.NZJHbRzNGOJsSEA);
    }

    @Override // p000.mxk
    /* JADX INFO: renamed from: C */
    public final mws mo17143C() {
        boolean z = this.f41669a.f41679b;
        return new mwe(this);
    }

    @Override // p000.mxt, java.util.SortedSet
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final Comparable first() {
        Comparable comparableMo17003d = this.f41850d.f41842b.mo17003d(this.f41669a);
        comparableMo17003d.getClass();
        return comparableMo17003d;
    }

    @Override // p000.mxt, java.util.SortedSet
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final Comparable last() {
        Comparable comparableMo17002c = this.f41850d.f41843c.mo17002c(this.f41669a);
        comparableMo17002c.getClass();
        return comparableMo17002c;
    }

    @Override // p000.mwj, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return this.f41850d.mo8324a((Comparable) obj);
        } catch (ClassCastException e) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return lku.m15651e(this, collection);
    }

    @Override // p000.mxt, java.util.NavigableSet
    /* JADX INFO: renamed from: cq */
    public final naz descendingIterator() {
        return new mzn(this, last());
    }

    @Override // p000.mxt, p000.mxk, p000.mwj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* JADX INFO: renamed from: cr */
    public final naz listIterator() {
        return new mzm(this, first());
    }

    @Override // p000.mwj
    /* JADX INFO: renamed from: cs */
    public final boolean mo17014cs() {
        return false;
    }

    @Override // p000.mxk, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mzp) {
            mzp mzpVar = (mzp) obj;
            if (this.f41669a.equals(mzpVar.f41669a)) {
                return first().equals(mzpVar.first()) && last().equals(mzpVar.last());
            }
        }
        return super.equals(obj);
    }

    @Override // p000.muu, p000.mxt
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final muu mo16995q(Comparable comparable, boolean z, Comparable comparable2, boolean z2) {
        if (comparable.compareTo(comparable2) != 0 || z || z2) {
            return m17188U(mzj.m17177g(lku.m15656j(z) == 1 ? muz.m17009j(comparable) : muz.m17010k(comparable), lku.m15656j(z2) == 1 ? muz.m17010k(comparable2) : muz.m17009j(comparable2)));
        }
        return new mvg(this.f41669a);
    }

    @Override // p000.mxk, java.util.Collection, java.util.Set
    public final int hashCode() {
        return mpw.m16787z(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        long jMo17018a = this.f41669a.mo17018a(first(), last());
        if (jMo17018a >= 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return ((int) jMo17018a) + 1;
    }

    @Override // p000.muu
    /* JADX INFO: renamed from: u */
    public final mzj mo16999u() {
        return mzj.m17177g(this.f41850d.f41842b.mo17007h(this.f41669a), this.f41850d.f41843c.mo17008i(this.f41669a));
    }

    @Override // p000.mxt, p000.mxk, p000.mwj
    Object writeReplace() {
        return new mzo(this.f41850d, this.f41669a);
    }

    @Override // p000.muu, p000.mxt
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final muu mo16998t(Comparable comparable, boolean z) {
        mzj mzjVarM17177g;
        switch (lku.m15656j(z) - 1) {
            case 0:
                mzjVarM17177g = mzj.m17177g(muz.m17009j(comparable), muv.f41670a);
                break;
            default:
                mzjVarM17177g = mzj.m17173c(comparable);
                break;
        }
        return m17188U(mzjVarM17177g);
    }

    @Override // p000.muu, p000.mxt
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final muu mo16992n(Comparable comparable, boolean z) {
        mzj mzjVarM17177g;
        switch (lku.m15656j(z) - 1) {
            case 0:
                mzjVarM17177g = mzj.m17177g(mux.f41671a, muz.m17010k(comparable));
                break;
            default:
                mzjVarM17177g = mzj.m17174d(comparable);
                break;
        }
        return m17188U(mzjVarM17177g);
    }
}
