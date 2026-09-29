package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ada {

    /* JADX INFO: renamed from: a */
    public final String f522a;

    /* JADX INFO: renamed from: b */
    public final boolean f523b;

    /* JADX INFO: renamed from: c */
    public final boolean f524c;

    /* JADX INFO: renamed from: d */
    public final boolean f525d;

    public ada(String str, boolean z, boolean z2, boolean z3) {
        str.getClass();
        this.f522a = str;
        this.f523b = z;
        this.f524c = z2;
        this.f525d = z3;
    }

    /* JADX INFO: renamed from: a */
    public static ada m287a(ada adaVar, boolean z) {
        String str = adaVar.f522a;
        boolean z2 = adaVar.f524c;
        boolean z3 = adaVar.f525d;
        adaVar.getClass();
        str.getClass();
        return new ada(str, z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ada)) {
            return false;
        }
        ada adaVar = (ada) obj;
        return fa4.m11650l(this.f522a, adaVar.f522a) && this.f523b == adaVar.f523b && this.f524c == adaVar.f524c && this.f525d == adaVar.f525d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f525d) + g9a.m12428e(g9a.m12428e(this.f522a.hashCode() * 31, 31, this.f523b), 31, this.f524c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TtsPlayerStatus(text=");
        sb.append(this.f522a);
        sb.append(", isPlaying=");
        sb.append(this.f523b);
        sb.append(", isSentence=");
        return e65.m10875g(sb, this.f524c, ", isLoading=", this.f525d, ")");
    }
}
