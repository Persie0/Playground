package p418uj;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import com.lingq.p055ui.lesson.ReviewType;
import com.lingq.shared.uimodel.CardStatus;
import dm.C5207g;
import java.io.Serializable;
import p003a2.C0009a;
import p040c4.InterfaceC1680e;

/* JADX INFO: renamed from: uj.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C9548h implements InterfaceC1680e {

    /* JADX INFO: renamed from: a */
    public final int f49120a;

    /* JADX INFO: renamed from: b */
    public final ReviewType f49121b;

    /* JADX INFO: renamed from: c */
    public final boolean f49122c;

    /* JADX INFO: renamed from: d */
    public final boolean f49123d;

    /* JADX INFO: renamed from: e */
    public final int f49124e;

    /* JADX INFO: renamed from: f */
    public final String f49125f;

    /* JADX INFO: renamed from: g */
    public final String f49126g;

    /* JADX INFO: renamed from: h */
    public final CardStatus f49127h;

    public C9548h() {
        this(-1, ReviewType.All, false, false, -1, "", null, CardStatus.Known);
    }

    public C9548h(int i10, ReviewType reviewType, boolean z10, boolean z11, int i11, String str, String str2, CardStatus cardStatus) {
        C5207g.m11111f(reviewType, "reviewType");
        C5207g.m11111f(str, "reviewLanguageFromDeeplink");
        C5207g.m11111f(cardStatus, "statusUpper");
        this.f49120a = i10;
        this.f49121b = reviewType;
        this.f49122c = z10;
        this.f49123d = z11;
        this.f49124e = i11;
        this.f49125f = str;
        this.f49126g = str2;
        this.f49127h = cardStatus;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static final C9548h fromBundle(Bundle bundle) {
        ReviewType reviewType;
        String string;
        CardStatus cardStatus;
        int i10 = C0166e.m778y(bundle, "bundle", C9548h.class, "lessonId") ? bundle.getInt("lessonId") : -1;
        if (bundle.containsKey("reviewType")) {
            if (!Parcelable.class.isAssignableFrom(ReviewType.class) && !Serializable.class.isAssignableFrom(ReviewType.class)) {
                throw new UnsupportedOperationException(ReviewType.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            reviewType = (ReviewType) bundle.get("reviewType");
            if (reviewType == null) {
                throw new IllegalArgumentException("Argument \"reviewType\" is marked as non-null but was passed a null value.");
            }
        } else {
            reviewType = ReviewType.All;
        }
        boolean z10 = false;
        boolean z11 = bundle.containsKey("isDailyLingQs") ? bundle.getBoolean("isDailyLingQs") : false;
        if (bundle.containsKey("isFromVocabulary")) {
            z10 = bundle.getBoolean("isFromVocabulary");
        }
        int i11 = bundle.containsKey("sentenceIndex") ? bundle.getInt("sentenceIndex") : -1;
        if (bundle.containsKey("reviewLanguageFromDeeplink")) {
            string = bundle.getString("reviewLanguageFromDeeplink");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"reviewLanguageFromDeeplink\" is marked as non-null but was passed a null value.");
            }
        } else {
            string = "";
        }
        String str = string;
        String string2 = bundle.containsKey("lotd") ? bundle.getString("lotd") : null;
        if (!bundle.containsKey("statusUpper")) {
            cardStatus = CardStatus.Known;
        } else {
            if (!Parcelable.class.isAssignableFrom(CardStatus.class) && !Serializable.class.isAssignableFrom(CardStatus.class)) {
                throw new UnsupportedOperationException(CardStatus.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            cardStatus = (CardStatus) bundle.get("statusUpper");
            if (cardStatus == null) {
                throw new IllegalArgumentException("Argument \"statusUpper\" is marked as non-null but was passed a null value.");
            }
        }
        return new C9548h(i10, reviewType, z11, z10, i11, str, string2, cardStatus);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9548h)) {
            return false;
        }
        C9548h c9548h = (C9548h) obj;
        return this.f49120a == c9548h.f49120a && this.f49121b == c9548h.f49121b && this.f49122c == c9548h.f49122c && this.f49123d == c9548h.f49123d && this.f49124e == c9548h.f49124e && C5207g.m11106a(this.f49125f, c9548h.f49125f) && C5207g.m11106a(this.f49126g, c9548h.f49126g) && this.f49127h == c9548h.f49127h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    public final int hashCode() {
        int iHashCode = (this.f49121b.hashCode() + (Integer.hashCode(this.f49120a) * 31)) * 31;
        boolean z10 = this.f49122c;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = (iHashCode + r10) * 31;
        boolean z11 = this.f49123d;
        int iM758d = C0166e.m758d(this.f49125f, C0009a.m16d(this.f49124e, (i10 + (z11 ? 1 : z11)) * 31, 31), 31);
        String str = this.f49126g;
        return this.f49127h.hashCode() + ((iM758d + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "ReviewFragmentArgs(lessonId=" + this.f49120a + ", reviewType=" + this.f49121b + ", isDailyLingQs=" + this.f49122c + ", isFromVocabulary=" + this.f49123d + ", sentenceIndex=" + this.f49124e + ", reviewLanguageFromDeeplink=" + this.f49125f + ", lotd=" + this.f49126g + ", statusUpper=" + this.f49127h + ")";
    }
}
