package kh;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import com.lingq.p055ui.lesson.ReviewType;
import com.lingq.shared.uimodel.CardStatus;
import com.linguist.R;
import dm.C5207g;
import java.io.Serializable;
import p003a2.C0009a;
import p040c4.InterfaceC1687l;

/* JADX INFO: renamed from: kh.p */
/* JADX INFO: loaded from: classes.dex */
public final class C6689p implements InterfaceC1687l {

    /* JADX INFO: renamed from: a */
    public final int f37824a;

    /* JADX INFO: renamed from: b */
    public final ReviewType f37825b;

    /* JADX INFO: renamed from: c */
    public final boolean f37826c;

    /* JADX INFO: renamed from: d */
    public final boolean f37827d;

    /* JADX INFO: renamed from: e */
    public final int f37828e;

    /* JADX INFO: renamed from: f */
    public final String f37829f;

    /* JADX INFO: renamed from: g */
    public final String f37830g;

    /* JADX INFO: renamed from: h */
    public final CardStatus f37831h;

    /* JADX INFO: renamed from: i */
    public final int f37832i;

    public C6689p() {
        this(-1, ReviewType.All, false, false, -1, "", null, CardStatus.Known);
    }

    public C6689p(int i10, ReviewType reviewType, boolean z10, boolean z11, int i11, String str, String str2, CardStatus cardStatus) {
        C5207g.m11111f(reviewType, "reviewType");
        C5207g.m11111f(str, "reviewLanguageFromDeeplink");
        C5207g.m11111f(cardStatus, "statusUpper");
        this.f37824a = i10;
        this.f37825b = reviewType;
        this.f37826c = z10;
        this.f37827d = z11;
        this.f37828e = i11;
        this.f37829f = str;
        this.f37830g = str2;
        this.f37831h = cardStatus;
        this.f37832i = R.id.actionToReview;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: d */
    public final Bundle mo482d() {
        Bundle bundle = new Bundle();
        bundle.putInt("lessonId", this.f37824a);
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(ReviewType.class);
        Serializable serializable = this.f37825b;
        if (zIsAssignableFrom) {
            C5207g.m11109d(serializable, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("reviewType", (Parcelable) serializable);
        } else if (Serializable.class.isAssignableFrom(ReviewType.class)) {
            C5207g.m11109d(serializable, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("reviewType", serializable);
        }
        bundle.putBoolean("isDailyLingQs", this.f37826c);
        bundle.putBoolean("isFromVocabulary", this.f37827d);
        bundle.putInt("sentenceIndex", this.f37828e);
        bundle.putString("reviewLanguageFromDeeplink", this.f37829f);
        bundle.putString("lotd", this.f37830g);
        boolean zIsAssignableFrom2 = Parcelable.class.isAssignableFrom(CardStatus.class);
        Serializable serializable2 = this.f37831h;
        if (zIsAssignableFrom2) {
            C5207g.m11109d(serializable2, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("statusUpper", (Parcelable) serializable2);
        } else if (Serializable.class.isAssignableFrom(CardStatus.class)) {
            C5207g.m11109d(serializable2, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("statusUpper", serializable2);
        }
        return bundle;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: e */
    public final int mo483e() {
        return this.f37832i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6689p)) {
            return false;
        }
        C6689p c6689p = (C6689p) obj;
        return this.f37824a == c6689p.f37824a && this.f37825b == c6689p.f37825b && this.f37826c == c6689p.f37826c && this.f37827d == c6689p.f37827d && this.f37828e == c6689p.f37828e && C5207g.m11106a(this.f37829f, c6689p.f37829f) && C5207g.m11106a(this.f37830g, c6689p.f37830g) && this.f37831h == c6689p.f37831h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    public final int hashCode() {
        int iHashCode = (this.f37825b.hashCode() + (Integer.hashCode(this.f37824a) * 31)) * 31;
        ?? r10 = 1;
        boolean z10 = this.f37826c;
        ?? r11 = z10;
        if (z10) {
            r11 = 1;
        }
        int i10 = (iHashCode + r11) * 31;
        boolean z11 = this.f37827d;
        if (!z11) {
            r10 = z11;
        }
        int iM758d = C0166e.m758d(this.f37829f, C0009a.m16d(this.f37828e, (i10 + r10) * 31, 31), 31);
        String str = this.f37830g;
        return this.f37831h.hashCode() + ((iM758d + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "ActionToReview(lessonId=" + this.f37824a + ", reviewType=" + this.f37825b + ", isDailyLingQs=" + this.f37826c + ", isFromVocabulary=" + this.f37827d + ", sentenceIndex=" + this.f37828e + ", reviewLanguageFromDeeplink=" + this.f37829f + ", lotd=" + this.f37830g + ", statusUpper=" + this.f37831h + ")";
    }
}
