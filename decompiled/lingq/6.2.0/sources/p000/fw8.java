package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class fw8 {

    /* JADX INFO: renamed from: a */
    public final int f39811a;

    /* JADX INFO: renamed from: b */
    public final float f39812b;

    /* JADX INFO: renamed from: c */
    public final float f39813c;

    public fw8(float f, float f2, int i) {
        this.f39811a = i;
        this.f39812b = f;
        this.f39813c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fw8)) {
            return false;
        }
        fw8 fw8Var = (fw8) obj;
        return this.f39811a == fw8Var.f39811a && Float.compare(this.f39812b, fw8Var.f39812b) == 0 && Float.compare(this.f39813c, fw8Var.f39813c) == 0 && Float.compare(0.0f, 0.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + wq1.m24105a(wq1.m24105a(Integer.hashCode(this.f39811a) * 31, this.f39812b, 31), this.f39813c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SentenceAnchor(sentenceIndex=");
        sb.append(this.f39811a);
        sb.append(", top=");
        sb.append(this.f39812b);
        sb.append(", bottom=");
        return wq1.m24121q(sb, this.f39813c, ", left=0.0)");
    }
}
