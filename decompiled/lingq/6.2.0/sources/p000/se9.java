package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class se9 {

    /* JADX INFO: renamed from: a */
    public final int f60764a;

    /* JADX INFO: renamed from: b */
    public final double f60765b;

    /* JADX INFO: renamed from: c */
    public final double f60766c;

    /* JADX INFO: renamed from: d */
    public final String f60767d;

    /* JADX INFO: renamed from: e */
    public final boolean f60768e;

    public se9(double d, double d2, int i, String str, boolean z) {
        this.f60764a = i;
        this.f60765b = d;
        this.f60766c = d2;
        this.f60767d = str;
        this.f60768e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof se9)) {
            return false;
        }
        se9 se9Var = (se9) obj;
        return this.f60764a == se9Var.f60764a && Double.compare(this.f60765b, se9Var.f60765b) == 0 && Double.compare(this.f60766c, se9Var.f60766c) == 0 && this.f60767d.equals(se9Var.f60767d) && this.f60768e == se9Var.f60768e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f60768e) + ux5.m22980c(g9a.m12424a(this.f60766c, g9a.m12424a(this.f60765b, Integer.hashCode(this.f60764a) * 31, 31), 31), this.f60767d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpeakSentenceParams(lessonId=");
        sb.append(this.f60764a);
        sb.append(", start=");
        sb.append(this.f60765b);
        hn1.m13370t(sb, ", end=", this.f60766c, ", text=");
        sb.append(this.f60767d);
        sb.append(", useWebVoices=");
        sb.append(this.f60768e);
        sb.append(")");
        return sb.toString();
    }
}
