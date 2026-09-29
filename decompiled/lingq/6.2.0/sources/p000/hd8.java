package p000;

import android.os.Parcelable;
import com.lingq.core.domain.model.review.ReviewType;
import com.lingq.core.domain.model.status.CardStatus;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class hd8 {
    /* JADX INFO: renamed from: a */
    public static id8 m13206a(nl8 nl8Var) {
        Integer num;
        ReviewType reviewType;
        Boolean bool;
        Boolean bool2;
        String str;
        CardStatus cardStatus;
        Integer num2 = -1;
        nl8Var.getClass();
        if (nl8Var.m17487a("lessonId")) {
            num = (Integer) nl8Var.m17488b("lessonId");
            if (num == null) {
                C3386nv.m17626m("Argument \"lessonId\" of type integer does not support null values");
                return null;
            }
        } else {
            num = num2;
        }
        if (!nl8Var.m17487a("reviewType")) {
            reviewType = ReviewType.All;
        } else {
            if (!Parcelable.class.isAssignableFrom(ReviewType.class) && !Serializable.class.isAssignableFrom(ReviewType.class)) {
                C3386nv.m17636w(ReviewType.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                return null;
            }
            reviewType = (ReviewType) nl8Var.m17488b("reviewType");
            if (reviewType == null) {
                C3386nv.m17626m("Argument \"reviewType\" is marked as non-null but was passed a null value");
                return null;
            }
        }
        ReviewType reviewType2 = reviewType;
        if (nl8Var.m17487a("isDailyLingQs")) {
            bool = (Boolean) nl8Var.m17488b("isDailyLingQs");
            if (bool == null) {
                C3386nv.m17626m("Argument \"isDailyLingQs\" of type boolean does not support null values");
                return null;
            }
        } else {
            bool = Boolean.FALSE;
        }
        if (nl8Var.m17487a("isFromVocabulary")) {
            bool2 = (Boolean) nl8Var.m17488b("isFromVocabulary");
            if (bool2 == null) {
                C3386nv.m17626m("Argument \"isFromVocabulary\" of type boolean does not support null values");
                return null;
            }
        } else {
            bool2 = Boolean.FALSE;
        }
        if (nl8Var.m17487a("sentenceIndex") && (num2 = (Integer) nl8Var.m17488b("sentenceIndex")) == null) {
            C3386nv.m17626m("Argument \"sentenceIndex\" of type integer does not support null values");
            return null;
        }
        String str2 = "";
        if (nl8Var.m17487a("reviewLanguageFromDeeplink")) {
            String str3 = (String) nl8Var.m17488b("reviewLanguageFromDeeplink");
            if (str3 == null) {
                C3386nv.m17626m("Argument \"reviewLanguageFromDeeplink\" is marked as non-null but was passed a null value");
                return null;
            }
            str = str3;
        } else {
            str = "";
        }
        String str4 = nl8Var.m17487a("lotd") ? (String) nl8Var.m17488b("lotd") : null;
        if (!nl8Var.m17487a("statusUpper")) {
            cardStatus = CardStatus.Known;
        } else {
            if (!Parcelable.class.isAssignableFrom(CardStatus.class) && !Serializable.class.isAssignableFrom(CardStatus.class)) {
                C3386nv.m17636w(CardStatus.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                return null;
            }
            cardStatus = (CardStatus) nl8Var.m17488b("statusUpper");
            if (cardStatus == null) {
                C3386nv.m17626m("Argument \"statusUpper\" is marked as non-null but was passed a null value");
                return null;
            }
        }
        CardStatus cardStatus2 = cardStatus;
        if (!nl8Var.m17487a("reviewLocation") || (str2 = (String) nl8Var.m17488b("reviewLocation")) != null) {
            return new id8(num.intValue(), reviewType2, bool.booleanValue(), bool2.booleanValue(), num2.intValue(), str, str4, cardStatus2, str2);
        }
        C3386nv.m17626m("Argument \"reviewLocation\" is marked as non-null but was passed a null value");
        return null;
    }
}
