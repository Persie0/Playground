package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lva {

    /* JADX INFO: renamed from: a */
    public final String f39376a;

    /* JADX INFO: renamed from: b */
    public final mrm f39377b;

    public lva(String str, mrm mrmVar) {
        if (str == null) {
            throw new NullPointerException("Null actionText");
        }
        this.f39376a = str;
        this.f39377b = mrmVar;
    }

    /* JADX INFO: renamed from: a */
    public static lva m16083a(String str) {
        return new lva(str, mqu.f41450a);
    }

    /* JADX INFO: renamed from: d */
    private static lva m16084d(String str, String str2) {
        if (true == str.equals(str2)) {
            str2 = null;
        }
        return new lva(str, mrm.m16828h(str2));
    }

    /* JADX INFO: renamed from: b */
    public final lva m16085b(String str) {
        str.getClass();
        return m16084d(str, (String) this.f39377b.mo16812f());
    }

    /* JADX INFO: renamed from: c */
    public final lva m16086c(String str) {
        return m16084d(this.f39376a, str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lva) {
            lva lvaVar = (lva) obj;
            if (this.f39376a.equals(lvaVar.f39376a) && this.f39377b.equals(lvaVar.f39377b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f39376a.hashCode() ^ 1000003) * 1000003) ^ this.f39377b.hashCode();
    }

    public final String toString() {
        return "SemanticResultText{actionText=" + this.f39376a + ", displayText=" + this.f39377b.toString() + "}";
    }

    public lva() {
    }
}
