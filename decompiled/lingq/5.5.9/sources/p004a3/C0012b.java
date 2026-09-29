package p004a3;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;

/* JADX INFO: renamed from: a3.b */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public final class C0012b {
    /* JADX INFO: renamed from: a */
    public static void m51a(EditorInfo editorInfo, CharSequence charSequence) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            editorInfo.setInitialSurroundingSubText(charSequence, 0);
            return;
        }
        charSequence.getClass();
        if (i10 >= 30) {
            editorInfo.setInitialSurroundingSubText(charSequence, 0);
            return;
        }
        int i11 = editorInfo.initialSelStart;
        int i12 = editorInfo.initialSelEnd;
        int i13 = i11 > i12 ? i12 + 0 : i11 + 0;
        int i14 = i11 > i12 ? i11 - 0 : i12 + 0;
        int length = charSequence.length();
        if (i13 < 0 || i14 > length) {
            m52b(editorInfo, null, 0, 0);
            return;
        }
        int i15 = editorInfo.inputType & 4095;
        if (i15 == 129 || i15 == 225 || i15 == 18) {
            m52b(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            m52b(editorInfo, charSequence, i13, i14);
            return;
        }
        int i16 = i14 - i13;
        int i17 = i16 > 1024 ? 0 : i16;
        int i18 = 2048 - i17;
        int iMin = Math.min(charSequence.length() - i14, i18 - Math.min(i13, (int) (((double) i18) * 0.8d)));
        int iMin2 = Math.min(i13, i18 - iMin);
        int i19 = i13 - iMin2;
        if (Character.isLowSurrogate(charSequence.charAt(i19))) {
            i19++;
            iMin2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i14 + iMin) - 1))) {
            iMin--;
        }
        CharSequence charSequenceConcat = i17 != i16 ? TextUtils.concat(charSequence.subSequence(i19, i19 + iMin2), charSequence.subSequence(i14, iMin + i14)) : charSequence.subSequence(i19, iMin2 + i17 + iMin + i19);
        int i20 = iMin2 + 0;
        m52b(editorInfo, charSequenceConcat, i20, i17 + i20);
    }

    /* JADX INFO: renamed from: b */
    public static void m52b(EditorInfo editorInfo, CharSequence charSequence, int i10, int i11) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i10);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i11);
    }
}
