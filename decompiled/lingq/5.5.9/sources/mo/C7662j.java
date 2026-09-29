package mo;

import android.support.v4.media.session.C0166e;
import android.text.Editable;
import dm.C5207g;
import java.util.NoSuchElementException;
import jm.C6526i;
import kotlin.text.C7076b;

/* JADX INFO: renamed from: mo.j */
/* JADX INFO: loaded from: classes2.dex */
public class C7662j extends C7076b {
    /* JADX INFO: renamed from: C3 */
    public static final String m15258C3() {
        return m15261F3("https://www.lingq.com/", 21);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: D3 */
    public static final char m15259D3(CharSequence charSequence) {
        C5207g.m11111f(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(C7076b.m14281a3(charSequence));
    }

    /* JADX INFO: renamed from: E3 */
    public static final CharSequence m15260E3(Editable editable, C6526i c6526i) {
        C5207g.m11111f(c6526i, "indices");
        return c6526i.isEmpty() ? "" : editable.subSequence(Integer.valueOf(c6526i.f37163a).intValue(), Integer.valueOf(c6526i.f37164b).intValue() + 1);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: F3 */
    public static final String m15261F3(String str, int i10) {
        C5207g.m11111f(str, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(C0166e.m762h("Requested character count ", i10, " is less than zero.").toString());
        }
        int length = str.length();
        if (i10 > length) {
            i10 = length;
        }
        String strSubstring = str.substring(0, i10);
        C5207g.m11110e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }
}
