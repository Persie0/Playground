package p000;

/* JADX INFO: loaded from: classes.dex */
public final class a97 {

    /* JADX INFO: renamed from: c */
    public static final a97 f381c = new a97(0, false);

    /* JADX INFO: renamed from: a */
    public final boolean f382a;

    /* JADX INFO: renamed from: b */
    public final int f383b;

    public a97() {
        this.f382a = false;
        this.f383b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a97)) {
            return false;
        }
        a97 a97Var = (a97) obj;
        return this.f382a == a97Var.f382a && this.f383b == a97Var.f383b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f383b) + (Boolean.hashCode(this.f382a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f382a + ", emojiSupportMatch=" + ((Object) dr2.m10603a(this.f383b)) + ')';
    }

    public a97(int i, boolean z) {
        this.f382a = z;
        this.f383b = i;
    }
}
