package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ax9 {

    /* JADX INFO: renamed from: c */
    public static final ax9 f7649c = new ax9(2, false);

    /* JADX INFO: renamed from: d */
    public static final ax9 f7650d = new ax9(1, true);

    /* JADX INFO: renamed from: a */
    public final int f7651a;

    /* JADX INFO: renamed from: b */
    public final boolean f7652b;

    public ax9(int i, boolean z) {
        this.f7651a = i;
        this.f7652b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ax9)) {
            return false;
        }
        ax9 ax9Var = (ax9) obj;
        return this.f7651a == ax9Var.f7651a && this.f7652b == ax9Var.f7652b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7652b) + (Integer.hashCode(this.f7651a) * 31);
    }

    public final String toString() {
        if (equals(f7649c)) {
            return "TextMotion.Static";
        }
        return equals(f7650d) ? "TextMotion.Animated" : "Invalid";
    }
}
