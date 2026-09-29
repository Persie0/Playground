package p462wj;

import com.lingq.p055ui.review.data.ReviewActivityResult;
import dm.C5207g;

/* JADX INFO: renamed from: wj.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C9954b {

    /* JADX INFO: renamed from: a */
    public final String f50652a;

    /* JADX INFO: renamed from: b */
    public final ReviewActivityResult f50653b;

    public C9954b(String str, ReviewActivityResult reviewActivityResult) {
        C5207g.m11111f(str, "answer");
        C5207g.m11111f(reviewActivityResult, "result");
        this.f50652a = str;
        this.f50653b = reviewActivityResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9954b)) {
            return false;
        }
        C9954b c9954b = (C9954b) obj;
        return C5207g.m11106a(this.f50652a, c9954b.f50652a) && this.f50653b == c9954b.f50653b;
    }

    public final int hashCode() {
        return this.f50653b.hashCode() + (this.f50652a.hashCode() * 31);
    }

    public final String toString() {
        return "ReviewAnswer(answer=" + this.f50652a + ", result=" + this.f50653b + ")";
    }
}
