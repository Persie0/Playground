package p462wj;

import com.lingq.p055ui.review.data.ReviewActivityShow;
import dm.C5207g;

/* JADX INFO: renamed from: wj.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C9955c {

    /* JADX INFO: renamed from: a */
    public final ReviewActivityShow f50654a;

    public C9955c(ReviewActivityShow reviewActivityShow) {
        C5207g.m11111f(reviewActivityShow, "showWhat");
        this.f50654a = reviewActivityShow;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9955c) && this.f50654a == ((C9955c) obj).f50654a;
    }

    public final int hashCode() {
        return this.f50654a.hashCode();
    }

    public final String toString() {
        return "ReviewBottomViewState(showWhat=" + this.f50654a + ")";
    }
}
