package p000;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class muu extends mxt {

    /* JADX INFO: renamed from: a */
    final mve f41669a;

    public muu(mve mveVar) {
        super(mzg.f41839a);
        this.f41669a = mveVar;
    }

    /* JADX INFO: renamed from: a */
    public static muu m16979a(mzj mzjVar, mve mveVar) {
        mzjVar.getClass();
        mveVar.getClass();
        try {
            mzj mzjVarM17179h = !mzjVar.m17183l() ? mzjVar.m17179h(mzj.m17173c(mveVar.mo17020c())) : mzjVar;
            if (!mzjVar.m17184m()) {
                mzjVarM17179h = mzjVarM17179h.m17179h(mzj.m17174d(mveVar.mo17019b()));
            }
            if (!mzjVarM17179h.m17186o()) {
                Comparable comparableMo17003d = mzjVar.f41842b.mo17003d(mveVar);
                comparableMo17003d.getClass();
                Comparable comparableMo17002c = mzjVar.f41843c.mo17002c(mveVar);
                comparableMo17002c.getClass();
                if (mzj.m17172b(comparableMo17003d, comparableMo17002c) <= 0) {
                    return new mzp(mzjVarM17179h, mveVar);
                }
            }
            return new mvg(mveVar);
        } catch (NoSuchElementException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // p000.mxt
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final muu mo16990l(Comparable comparable) {
        comparable.getClass();
        return mo16992n(comparable, false);
    }

    @Override // p000.mxt
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final muu mo16991m(Comparable comparable, boolean z) {
        comparable.getClass();
        return mo16992n(comparable, z);
    }

    /* JADX INFO: renamed from: d */
    public abstract muu mo16992n(Comparable comparable, boolean z);

    @Override // p000.mxt, java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final muu subSet(Comparable comparable, Comparable comparable2) {
        comparable.getClass();
        comparable2.getClass();
        lku.m15669w(this.f41779b.compare(comparable, comparable2) <= 0);
        return mo16995q(comparable, true, comparable2, false);
    }

    @Override // p000.mxt, java.util.NavigableSet
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final muu subSet(Comparable comparable, boolean z, Comparable comparable2, boolean z2) {
        comparable.getClass();
        comparable2.getClass();
        lku.m15669w(this.f41779b.compare(comparable, comparable2) <= 0);
        return mo16995q(comparable, z, comparable2, z2);
    }

    /* JADX INFO: renamed from: g */
    public abstract muu mo16995q(Comparable comparable, boolean z, Comparable comparable2, boolean z2);

    @Override // p000.mxt, java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final muu tailSet(Comparable comparable) {
        comparable.getClass();
        return mo16998t(comparable, true);
    }

    @Override // p000.mxt, java.util.NavigableSet
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final muu tailSet(Comparable comparable, boolean z) {
        comparable.getClass();
        return mo16998t(comparable, z);
    }

    /* JADX INFO: renamed from: j */
    public abstract muu mo16998t(Comparable comparable, boolean z);

    @Override // p000.mxt
    /* JADX INFO: renamed from: k */
    public mxt mo16989k() {
        return new mva(this);
    }

    @Override // p000.mxt
    /* JADX INFO: renamed from: n */
    public /* bridge */ /* synthetic */ mxt mo16992n(Object obj, boolean z) {
        throw null;
    }

    @Override // p000.mxt
    /* JADX INFO: renamed from: q */
    public /* bridge */ /* synthetic */ mxt mo16995q(Object obj, boolean z, Object obj2, boolean z2) {
        throw null;
    }

    @Override // p000.mxt
    /* JADX INFO: renamed from: t */
    public /* bridge */ /* synthetic */ mxt mo16998t(Object obj, boolean z) {
        throw null;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return mo16999u().toString();
    }

    /* JADX INFO: renamed from: u */
    public abstract mzj mo16999u();
}
