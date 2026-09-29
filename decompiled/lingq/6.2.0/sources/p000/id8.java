package p000;

import android.os.Bundle;
import android.os.Parcelable;
import com.lingq.core.domain.model.review.ReviewType;
import com.lingq.core.domain.model.status.CardStatus;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class id8 implements v76 {
    public static final hd8 Companion = new hd8();

    /* JADX INFO: renamed from: a */
    public final int f43978a;

    /* JADX INFO: renamed from: b */
    public final ReviewType f43979b;

    /* JADX INFO: renamed from: c */
    public final boolean f43980c;

    /* JADX INFO: renamed from: d */
    public final boolean f43981d;

    /* JADX INFO: renamed from: e */
    public final int f43982e;

    /* JADX INFO: renamed from: f */
    public final String f43983f;

    /* JADX INFO: renamed from: g */
    public final String f43984g;

    /* JADX INFO: renamed from: h */
    public final CardStatus f43985h;

    /* JADX INFO: renamed from: i */
    public final String f43986i;

    public id8(int i, ReviewType reviewType, boolean z, boolean z2, int i2, String str, String str2, CardStatus cardStatus, String str3) {
        reviewType.getClass();
        cardStatus.getClass();
        this.f43978a = i;
        this.f43979b = reviewType;
        this.f43980c = z;
        this.f43981d = z2;
        this.f43982e = i2;
        this.f43983f = str;
        this.f43984g = str2;
        this.f43985h = cardStatus;
        this.f43986i = str3;
    }

    public static final id8 fromBundle(Bundle bundle) {
        ReviewType reviewType;
        String string;
        CardStatus cardStatus;
        Companion.getClass();
        bundle.getClass();
        bundle.setClassLoader(id8.class.getClassLoader());
        int i = bundle.containsKey("lessonId") ? bundle.getInt("lessonId") : -1;
        if (!bundle.containsKey("reviewType")) {
            reviewType = ReviewType.All;
        } else {
            if (!Parcelable.class.isAssignableFrom(ReviewType.class) && !Serializable.class.isAssignableFrom(ReviewType.class)) {
                C3386nv.m17636w(ReviewType.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                return null;
            }
            reviewType = (ReviewType) bundle.get("reviewType");
            if (reviewType == null) {
                C3386nv.m17626m("Argument \"reviewType\" is marked as non-null but was passed a null value.");
                return null;
            }
        }
        boolean z = bundle.containsKey("isDailyLingQs") ? bundle.getBoolean("isDailyLingQs") : false;
        boolean z2 = bundle.containsKey("isFromVocabulary") ? bundle.getBoolean("isFromVocabulary") : false;
        int i2 = bundle.containsKey("sentenceIndex") ? bundle.getInt("sentenceIndex") : -1;
        String string2 = "";
        if (bundle.containsKey("reviewLanguageFromDeeplink")) {
            string = bundle.getString("reviewLanguageFromDeeplink");
            if (string == null) {
                C3386nv.m17626m("Argument \"reviewLanguageFromDeeplink\" is marked as non-null but was passed a null value.");
                return null;
            }
        } else {
            string = "";
        }
        String string3 = bundle.containsKey("lotd") ? bundle.getString("lotd") : null;
        if (!bundle.containsKey("statusUpper")) {
            cardStatus = CardStatus.Known;
        } else {
            if (!Parcelable.class.isAssignableFrom(CardStatus.class) && !Serializable.class.isAssignableFrom(CardStatus.class)) {
                C3386nv.m17636w(CardStatus.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                return null;
            }
            cardStatus = (CardStatus) bundle.get("statusUpper");
            if (cardStatus == null) {
                C3386nv.m17626m("Argument \"statusUpper\" is marked as non-null but was passed a null value.");
                return null;
            }
        }
        if (!bundle.containsKey("reviewLocation") || (string2 = bundle.getString("reviewLocation")) != null) {
            return new id8(i, reviewType, z, z2, i2, string, string3, cardStatus, string2);
        }
        C3386nv.m17626m("Argument \"reviewLocation\" is marked as non-null but was passed a null value.");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof id8)) {
            return false;
        }
        id8 id8Var = (id8) obj;
        return this.f43978a == id8Var.f43978a && this.f43979b == id8Var.f43979b && this.f43980c == id8Var.f43980c && this.f43981d == id8Var.f43981d && this.f43982e == id8Var.f43982e && this.f43983f.equals(id8Var.f43983f) && fa4.m11650l(this.f43984g, id8Var.f43984g) && this.f43985h == id8Var.f43985h && this.f43986i.equals(id8Var.f43986i);
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(wq1.m24106b(this.f43982e, g9a.m12428e(g9a.m12428e((this.f43979b.hashCode() + (Integer.hashCode(this.f43978a) * 31)) * 31, 31, this.f43980c), 31, this.f43981d), 31), this.f43983f, 31);
        String str = this.f43984g;
        return this.f43986i.hashCode() + ((this.f43985h.hashCode() + ((iM22980c + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReviewFragmentArgs(lessonId=");
        sb.append(this.f43978a);
        sb.append(", reviewType=");
        sb.append(this.f43979b);
        sb.append(", isDailyLingQs=");
        wq1.m24101A(sb, this.f43980c, ", isFromVocabulary=", this.f43981d, ", sentenceIndex=");
        hn1.m13361k(this.f43982e, ", reviewLanguageFromDeeplink=", this.f43983f, ", lotd=", sb);
        sb.append(this.f43984g);
        sb.append(", statusUpper=");
        sb.append(this.f43985h);
        sb.append(", reviewLocation=");
        return AbstractC3393o1.m17738m(sb, this.f43986i, ")");
    }
}
