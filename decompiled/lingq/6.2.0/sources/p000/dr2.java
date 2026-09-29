package p000;

/* JADX INFO: loaded from: classes.dex */
public final class dr2 {

    /* JADX INFO: renamed from: a */
    public final int f36076a;

    /* JADX INFO: renamed from: a */
    public static String m10603a(int i) {
        if (i == 0) {
            return "EmojiSupportMatch.Default";
        }
        if (i == 1) {
            return "EmojiSupportMatch.None";
        }
        return i == 2 ? "EmojiSupportMatch.All" : wq1.m24114j("Invalid(value=", i, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dr2) {
            return this.f36076a == ((dr2) obj).f36076a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f36076a);
    }

    public final String toString() {
        return m10603a(this.f36076a);
    }
}
