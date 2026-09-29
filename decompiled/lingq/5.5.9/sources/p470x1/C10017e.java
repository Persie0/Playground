package p470x1;

/* JADX INFO: renamed from: x1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C10017e implements Comparable<C10017e> {

    /* JADX INFO: renamed from: a */
    public final float f50966a;

    /* JADX INFO: renamed from: a */
    public static final boolean m18618a(float f3, float f10) {
        return Float.compare(f3, f10) == 0;
    }

    /* JADX INFO: renamed from: f */
    public static String m18619f(float f3) {
        if (Float.isNaN(f3)) {
            return "Dp.Unspecified";
        }
        return f3 + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(C10017e c10017e) {
        return Float.compare(this.f50966a, c10017e.f50966a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10017e) {
            return Float.compare(this.f50966a, ((C10017e) obj).f50966a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f50966a);
    }

    public final String toString() {
        return m18619f(this.f50966a);
    }
}
