package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class muz implements Comparable, Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b */
    final Comparable f41672b;

    public muz(Comparable comparable) {
        this.f41672b = comparable;
    }

    /* JADX INFO: renamed from: j */
    static muz m17009j(Comparable comparable) {
        return new muw(comparable);
    }

    /* JADX INFO: renamed from: k */
    static muz m17010k(Comparable comparable) {
        return new muy(comparable);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(muz muzVar) {
        if (muzVar != mux.f41671a) {
            if (muzVar == muv.f41670a) {
                return -1;
            }
            int iM17172b = mzj.m17172b(this.f41672b, muzVar.f41672b);
            if (iM17172b != 0) {
                return iM17172b;
            }
            boolean z = this instanceof muw;
            if (z == (muzVar instanceof muw)) {
                return 0;
            }
            if (!z) {
                return -1;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: b */
    public Comparable mo17001b() {
        return this.f41672b;
    }

    /* JADX INFO: renamed from: c */
    public abstract Comparable mo17002c(mve mveVar);

    /* JADX INFO: renamed from: d */
    public abstract Comparable mo17003d(mve mveVar);

    /* JADX INFO: renamed from: e */
    public abstract void mo17004e(StringBuilder sb);

    public final boolean equals(Object obj) {
        if (obj instanceof muz) {
            try {
                return compareTo((muz) obj) == 0;
            } catch (ClassCastException e) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo17005f(StringBuilder sb);

    /* JADX INFO: renamed from: g */
    public abstract boolean mo17006g(Comparable comparable);

    /* JADX INFO: renamed from: h */
    public abstract muz mo17007h(mve mveVar);

    public abstract int hashCode();

    /* JADX INFO: renamed from: i */
    public abstract muz mo17008i(mve mveVar);
}
