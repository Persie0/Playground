package va;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import p219ka.C6640a;

/* JADX INFO: renamed from: va.r */
/* JADX INFO: loaded from: classes.dex */
public final class C9704r {
    /* JADX INFO: renamed from: a */
    public static void m18214a(C6640a.a aVar) {
        aVar.f37681k = -3.4028235E38f;
        aVar.f37680j = Integer.MIN_VALUE;
        CharSequence charSequence = aVar.f37671a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                aVar.f37671a = SpannableString.valueOf(charSequence);
            }
            CharSequence charSequence2 = aVar.f37671a;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static float m18215b(float f3, int i10, int i11, int i12) {
        float f10;
        if (f3 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i10 == 0) {
            f10 = i12;
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    return -3.4028235E38f;
                }
                return f3;
            }
            f10 = i11;
        }
        return f3 * f10;
    }
}
