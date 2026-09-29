package p000;

/* JADX INFO: loaded from: classes.dex */
public final class xj2 implements Comparable {

    /* JADX INFO: renamed from: a */
    public final float f68285a;

    /* JADX INFO: renamed from: a */
    public static int m24559a(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return 0;
        }
        return Float.compare(f, f2);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m24560b(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    /* JADX INFO: renamed from: c */
    public static String m24561c(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return m24559a(this.f68285a, ((xj2) obj).f68285a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xj2) {
            return Float.compare(this.f68285a, ((xj2) obj).f68285a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f68285a);
    }

    public final String toString() {
        return m24561c(this.f68285a);
    }
}
