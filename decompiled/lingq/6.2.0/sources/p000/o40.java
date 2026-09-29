package p000;

/* JADX INFO: loaded from: classes.dex */
public final class o40 extends ey2 {

    /* JADX INFO: renamed from: a */
    public final Integer f53813a;

    public o40(Integer num) {
        this.f53813a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ey2)) {
            return false;
        }
        Integer num = this.f53813a;
        o40 o40Var = (o40) ((ey2) obj);
        if (num == null) {
            return o40Var.f53813a == null;
        }
        return num.equals(o40Var.f53813a);
    }

    public final int hashCode() {
        Integer num = this.f53813a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f53813a + "}";
    }
}
