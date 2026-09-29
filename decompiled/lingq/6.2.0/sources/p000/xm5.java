package p000;

/* JADX INFO: loaded from: classes.dex */
public final class xm5 implements ym5 {

    /* JADX INFO: renamed from: a */
    public final Object f68348a;

    public xm5(Object obj) {
        this.f68348a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xm5) && fa4.m11650l(this.f68348a, ((xm5) obj).f68348a);
    }

    public final int hashCode() {
        Object obj = this.f68348a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Success(data=" + this.f68348a + ")";
    }
}
