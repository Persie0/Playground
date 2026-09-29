package p000;

import android.os.Bundle;
import android.os.Parcelable;
import com.lingq.core.domain.model.review.ReviewType;
import com.lingq.core.domain.model.status.CardStatus;
import com.lingq.feature.review.R$id;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class gc6 implements t86 {

    /* JADX INFO: renamed from: a */
    public final int f40538a;

    /* JADX INFO: renamed from: b */
    public final ReviewType f40539b;

    /* JADX INFO: renamed from: c */
    public final boolean f40540c;

    /* JADX INFO: renamed from: d */
    public final boolean f40541d;

    /* JADX INFO: renamed from: e */
    public final int f40542e;

    /* JADX INFO: renamed from: f */
    public final String f40543f;

    /* JADX INFO: renamed from: g */
    public final String f40544g;

    /* JADX INFO: renamed from: h */
    public final CardStatus f40545h;

    /* JADX INFO: renamed from: i */
    public final String f40546i;

    /* JADX INFO: renamed from: j */
    public final int f40547j;

    public gc6(int i, ReviewType reviewType, boolean z, boolean z2, int i2, String str, String str2, CardStatus cardStatus, String str3) {
        reviewType.getClass();
        str.getClass();
        cardStatus.getClass();
        str3.getClass();
        this.f40538a = i;
        this.f40539b = reviewType;
        this.f40540c = z;
        this.f40541d = z2;
        this.f40542e = i2;
        this.f40543f = str;
        this.f40544g = str2;
        this.f40545h = cardStatus;
        this.f40546i = str3;
        this.f40547j = R$id.actionToReview;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: a */
    public final Bundle mo233a() {
        Bundle bundle = new Bundle();
        bundle.putInt("lessonId", this.f40538a);
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(ReviewType.class);
        Serializable serializable = this.f40539b;
        if (zIsAssignableFrom) {
            serializable.getClass();
            bundle.putParcelable("reviewType", (Parcelable) serializable);
        } else if (Serializable.class.isAssignableFrom(ReviewType.class)) {
            serializable.getClass();
            bundle.putSerializable("reviewType", serializable);
        }
        bundle.putBoolean("isDailyLingQs", this.f40540c);
        bundle.putBoolean("isFromVocabulary", this.f40541d);
        bundle.putInt("sentenceIndex", this.f40542e);
        bundle.putString("reviewLanguageFromDeeplink", this.f40543f);
        bundle.putString("lotd", this.f40544g);
        boolean zIsAssignableFrom2 = Parcelable.class.isAssignableFrom(CardStatus.class);
        Serializable serializable2 = this.f40545h;
        if (zIsAssignableFrom2) {
            serializable2.getClass();
            bundle.putParcelable("statusUpper", (Parcelable) serializable2);
        } else if (Serializable.class.isAssignableFrom(CardStatus.class)) {
            serializable2.getClass();
            bundle.putSerializable("statusUpper", serializable2);
        }
        bundle.putString("reviewLocation", this.f40546i);
        return bundle;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: b */
    public final int mo234b() {
        return this.f40547j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gc6)) {
            return false;
        }
        gc6 gc6Var = (gc6) obj;
        return this.f40538a == gc6Var.f40538a && this.f40539b == gc6Var.f40539b && this.f40540c == gc6Var.f40540c && this.f40541d == gc6Var.f40541d && this.f40542e == gc6Var.f40542e && fa4.m11650l(this.f40543f, gc6Var.f40543f) && fa4.m11650l(this.f40544g, gc6Var.f40544g) && this.f40545h == gc6Var.f40545h && fa4.m11650l(this.f40546i, gc6Var.f40546i);
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(wq1.m24106b(this.f40542e, g9a.m12428e(g9a.m12428e((this.f40539b.hashCode() + (Integer.hashCode(this.f40538a) * 31)) * 31, 31, this.f40540c), 31, this.f40541d), 31), this.f40543f, 31);
        String str = this.f40544g;
        return this.f40546i.hashCode() + ((this.f40545h.hashCode() + ((iM22980c + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionToReview(lessonId=");
        sb.append(this.f40538a);
        sb.append(", reviewType=");
        sb.append(this.f40539b);
        sb.append(", isDailyLingQs=");
        wq1.m24101A(sb, this.f40540c, ", isFromVocabulary=", this.f40541d, ", sentenceIndex=");
        hn1.m13361k(this.f40542e, ", reviewLanguageFromDeeplink=", this.f40543f, ", lotd=", sb);
        sb.append(this.f40544g);
        sb.append(", statusUpper=");
        sb.append(this.f40545h);
        sb.append(", reviewLocation=");
        return AbstractC3393o1.m17738m(sb, this.f40546i, ")");
    }
}
