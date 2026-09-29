package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class yw8 {

    /* JADX INFO: renamed from: a */
    public final int f70595a;

    /* JADX INFO: renamed from: b */
    public final boolean f70596b;

    public yw8(int i, boolean z) {
        this.f70595a = i;
        this.f70596b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yw8)) {
            return false;
        }
        yw8 yw8Var = (yw8) obj;
        return this.f70595a == yw8Var.f70595a && this.f70596b == yw8Var.f70596b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f70596b) + (Integer.hashCode(this.f70595a) * 31);
    }

    public final String toString() {
        return "SentenceEditPagerState(totalSentences=" + this.f70595a + ", isRtl=" + this.f70596b + ")";
    }
}
