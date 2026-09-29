package p445w1;

/* JADX INFO: renamed from: w1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C9795e {

    /* JADX INFO: renamed from: b */
    public static final int f49905b = 66305;

    /* JADX INFO: renamed from: a */
    public final int f49906a;

    /* JADX INFO: renamed from: w1.e$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int f49907a;

        /* JADX INFO: renamed from: a */
        public static String m18283a(int i10) {
            if (i10 == 1) {
                return "Strategy.Simple";
            }
            if (i10 == 2) {
                return "Strategy.HighQuality";
            }
            return i10 == 3 ? "Strategy.Balanced" : "Invalid";
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return this.f49907a == ((a) obj).f49907a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f49907a);
        }

        public final String toString() {
            return m18283a(this.f49907a);
        }
    }

    /* JADX INFO: renamed from: w1.e$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final int f49908a;

        /* JADX INFO: renamed from: a */
        public static String m18284a(int i10) {
            if (i10 == 1) {
                return "Strictness.None";
            }
            if (i10 == 2) {
                return "Strictness.Loose";
            }
            if (i10 == 3) {
                return "Strictness.Normal";
            }
            return i10 == 4 ? "Strictness.Strict" : "Invalid";
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f49908a == ((b) obj).f49908a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f49908a);
        }

        public final String toString() {
            return m18284a(this.f49908a);
        }
    }

    /* JADX INFO: renamed from: w1.e$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final int f49909a;

        public final boolean equals(Object obj) {
            if (obj instanceof c) {
                return this.f49909a == ((c) obj).f49909a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f49909a);
        }

        public final String toString() {
            int i10 = this.f49909a;
            boolean z10 = false;
            if (i10 == 1) {
                return "WordBreak.None";
            }
            if (i10 == 2) {
                z10 = true;
            }
            return z10 ? "WordBreak.Phrase" : "Invalid";
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C9795e) {
            return this.f49906a == ((C9795e) obj).f49906a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f49906a);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("LineBreak(strategy=");
        int i10 = this.f49906a;
        sb2.append((Object) a.m18283a(i10 & 255));
        sb2.append(", strictness=");
        sb2.append((Object) b.m18284a((i10 >> 8) & 255));
        sb2.append(", wordBreak=");
        int i11 = (i10 >> 16) & 255;
        if (i11 == 1) {
            str = "WordBreak.None";
        } else {
            str = i11 == 2 ? "WordBreak.Phrase" : "Invalid";
        }
        sb2.append((Object) str);
        sb2.append(')');
        return sb2.toString();
    }
}
