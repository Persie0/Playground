package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ms7 extends pt7 {

    /* JADX INFO: renamed from: a */
    public final int f51804a;

    /* JADX INFO: renamed from: b */
    public final String f51805b;

    /* JADX INFO: renamed from: c */
    public final float f51806c;

    public ms7(String str, int i, float f) {
        this.f51804a = i;
        this.f51805b = str;
        this.f51806c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ms7)) {
            return false;
        }
        ms7 ms7Var = (ms7) obj;
        return this.f51804a == ms7Var.f51804a && this.f51805b.equals(ms7Var.f51805b) && Float.compare(this.f51806c, ms7Var.f51806c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f51806c) + ux5.m22980c(Integer.hashCode(this.f51804a) * 31, this.f51805b, 31);
    }

    public final String toString() {
        return wq1.m24121q(ux5.m22995r(this.f51804a, "PlaySentenceTts(sentenceIndex=", ", text=", this.f51805b, ", playbackSpeed="), this.f51806c, ")");
    }
}
