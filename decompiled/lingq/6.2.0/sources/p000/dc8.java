package p000;

import com.lingq.feature.review.data.ReviewActivityResult;

/* JADX INFO: loaded from: classes3.dex */
public final class dc8 {

    /* JADX INFO: renamed from: a */
    public final String f35397a;

    /* JADX INFO: renamed from: b */
    public final ReviewActivityResult f35398b;

    public dc8(String str, ReviewActivityResult reviewActivityResult) {
        str.getClass();
        reviewActivityResult.getClass();
        this.f35397a = str;
        this.f35398b = reviewActivityResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dc8)) {
            return false;
        }
        dc8 dc8Var = (dc8) obj;
        return fa4.m11650l(this.f35397a, dc8Var.f35397a) && this.f35398b == dc8Var.f35398b;
    }

    public final int hashCode() {
        return this.f35398b.hashCode() + (this.f35397a.hashCode() * 31);
    }

    public final String toString() {
        return "ReviewAnswer(answer=" + this.f35397a + ", result=" + this.f35398b + ")";
    }
}
