package p000;

import com.lingq.feature.review.data.ReviewActivityShow;

/* JADX INFO: loaded from: classes3.dex */
public final class jc8 {

    /* JADX INFO: renamed from: a */
    public final ReviewActivityShow f45415a;

    public jc8(ReviewActivityShow reviewActivityShow) {
        reviewActivityShow.getClass();
        this.f45415a = reviewActivityShow;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jc8) && this.f45415a == ((jc8) obj).f45415a;
    }

    public final int hashCode() {
        return this.f45415a.hashCode();
    }

    public final String toString() {
        return "ReviewBottomViewState(showWhat=" + this.f45415a + ")";
    }
}
