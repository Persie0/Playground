package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mzj extends mzk implements Serializable, mrp {

    /* JADX INFO: renamed from: a */
    public static final mzj f41841a = new mzj(mux.f41671a, muv.f41670a);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b */
    public final muz f41842b;

    /* JADX INFO: renamed from: c */
    public final muz f41843c;

    private mzj(muz muzVar, muz muzVar2) {
        this.f41842b = muzVar;
        this.f41843c = muzVar2;
        if (muzVar.compareTo(muzVar2) > 0 || muzVar == muv.f41670a || muzVar2 == mux.f41671a) {
            throw new IllegalArgumentException("Invalid range: ".concat(m17178p(muzVar, muzVar2)));
        }
    }

    /* JADX INFO: renamed from: b */
    static int m17172b(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    /* JADX INFO: renamed from: c */
    public static mzj m17173c(Comparable comparable) {
        return m17177g(muz.m17010k(comparable), muv.f41670a);
    }

    /* JADX INFO: renamed from: d */
    public static mzj m17174d(Comparable comparable) {
        return m17177g(mux.f41671a, muz.m17009j(comparable));
    }

    /* JADX INFO: renamed from: e */
    public static mzj m17175e(Comparable comparable, Comparable comparable2) {
        return m17177g(muz.m17010k(comparable), muz.m17009j(comparable2));
    }

    /* JADX INFO: renamed from: f */
    public static mzj m17176f(Comparable comparable, Comparable comparable2) {
        return m17177g(muz.m17010k(comparable), muz.m17010k(comparable2));
    }

    /* JADX INFO: renamed from: g */
    public static mzj m17177g(muz muzVar, muz muzVar2) {
        return new mzj(muzVar, muzVar2);
    }

    /* JADX INFO: renamed from: p */
    private static String m17178p(muz muzVar, muz muzVar2) {
        StringBuilder sb = new StringBuilder(16);
        muzVar.mo17004e(sb);
        sb.append("..");
        muzVar2.mo17005f(sb);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mzj) {
            mzj mzjVar = (mzj) obj;
            if (this.f41842b.equals(mzjVar.f41842b) && this.f41843c.equals(mzjVar.f41843c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final mzj m17179h(mzj mzjVar) {
        int iCompareTo = this.f41842b.compareTo(mzjVar.f41842b);
        int iCompareTo2 = this.f41843c.compareTo(mzjVar.f41843c);
        if (iCompareTo >= 0 && iCompareTo2 <= 0) {
            return this;
        }
        if (iCompareTo <= 0 && iCompareTo2 >= 0) {
            return mzjVar;
        }
        muz muzVar = iCompareTo >= 0 ? this.f41842b : mzjVar.f41842b;
        muz muzVar2 = iCompareTo2 <= 0 ? this.f41843c : mzjVar.f41843c;
        lku.m15610E(muzVar.compareTo(muzVar2) <= 0, "intersection is undefined for disconnected ranges %s and %s", this, mzjVar);
        return m17177g(muzVar, muzVar2);
    }

    public final int hashCode() {
        return (this.f41842b.hashCode() * 31) + this.f41843c.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final Comparable m17180i() {
        return this.f41842b.mo17001b();
    }

    /* JADX INFO: renamed from: j */
    public final Comparable m17181j() {
        return this.f41843c.mo17001b();
    }

    @Override // p000.mrp
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final boolean mo8324a(Comparable comparable) {
        comparable.getClass();
        return this.f41842b.mo17006g(comparable) && !this.f41843c.mo17006g(comparable);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m17183l() {
        return this.f41842b != mux.f41671a;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m17184m() {
        return this.f41843c != muv.f41670a;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m17185n(mzj mzjVar) {
        return this.f41842b.compareTo(mzjVar.f41843c) <= 0 && mzjVar.f41842b.compareTo(this.f41843c) <= 0;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m17186o() {
        return this.f41842b.equals(this.f41843c);
    }

    Object readResolve() {
        mzj mzjVar = f41841a;
        return equals(mzjVar) ? mzjVar : this;
    }

    public final String toString() {
        return m17178p(this.f41842b, this.f41843c);
    }
}
