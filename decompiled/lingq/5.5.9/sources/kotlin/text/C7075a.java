package kotlin.text;

import ae.C0062b;
import android.support.v4.media.session.C0166e;
import dm.C5206f;
import dm.C5207g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C6752c;
import mo.C7661i;
import p385sf.C9000b;
import tl.C9325m;

/* JADX INFO: renamed from: kotlin.text.a */
/* JADX INFO: loaded from: classes2.dex */
public class C7075a extends C0062b {
    /* JADX INFO: renamed from: I2 */
    public static final String m14274I2(String str) throws IOException {
        Comparable comparable;
        C5207g.m11111f(str, "<this>");
        List<String> listM14289i3 = C7076b.m14289i3(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM14289i3) {
            if (true ^ C7661i.m15250P2((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C9325m.m17681z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            int length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!C5206f.m11008f1(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList2.add(Integer.valueOf(length));
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int size = (listM14289i3.size() * 0) + str.length();
        StringsKt__IndentKt$getIndentFunction$1 stringsKt__IndentKt$getIndentFunction$1 = StringsKt__IndentKt$getIndentFunction$1.f39979b;
        int iM17249o = C9000b.m17249o(listM14289i3);
        ArrayList arrayList3 = new ArrayList();
        int i10 = 0;
        for (Object obj2 : listM14289i3) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C9000b.m17257w();
                throw null;
            }
            String str3 = (String) obj2;
            if ((i10 == 0 || i10 == iM17249o) && C7661i.m15250P2(str3)) {
                str3 = null;
            } else {
                C5207g.m11111f(str3, "<this>");
                if (!(iIntValue >= 0)) {
                    throw new IllegalArgumentException(C0166e.m762h("Requested character count ", iIntValue, " is less than zero.").toString());
                }
                int length3 = str3.length();
                if (iIntValue <= length3) {
                    length3 = iIntValue;
                }
                String strSubstring = str3.substring(length3);
                C5207g.m11110e(strSubstring, "this as java.lang.String).substring(startIndex)");
                String strMo528n = stringsKt__IndentKt$getIndentFunction$1.mo528n(strSubstring);
                if (strMo528n != null) {
                    str3 = strMo528n;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i10 = i11;
        }
        StringBuilder sb2 = new StringBuilder(size);
        C6752c.m13429W(arrayList3, sb2, "\n", null, null, null, 124);
        String string = sb2.toString();
        C5207g.m11110e(string, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return string;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: J2 */
    public static String m14275J2(String str) throws IOException {
        C5207g.m11111f(str, "<this>");
        if (!(!C7661i.m15250P2("|"))) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
        List<String> listM14289i3 = C7076b.m14289i3(str);
        int size = (listM14289i3.size() * 0) + str.length();
        StringsKt__IndentKt$getIndentFunction$1 stringsKt__IndentKt$getIndentFunction$1 = StringsKt__IndentKt$getIndentFunction$1.f39979b;
        int iM17249o = C9000b.m17249o(listM14289i3);
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object obj : listM14289i3) {
            int i11 = i10 + 1;
            String strSubstring = null;
            if (i10 < 0) {
                C9000b.m17257w();
                throw null;
            }
            String str2 = (String) obj;
            if ((i10 != 0 && i10 != iM17249o) || !C7661i.m15250P2(str2)) {
                int length = str2.length();
                int i12 = 0;
                while (true) {
                    if (i12 >= length) {
                        i12 = -1;
                        break;
                    }
                    if (!C5206f.m11008f1(str2.charAt(i12))) {
                        break;
                    }
                    i12++;
                }
                if (i12 != -1 && C7661i.m15255U2(str2, i12, "|", false)) {
                    strSubstring = str2.substring("|".length() + i12);
                    C5207g.m11110e(strSubstring, "this as java.lang.String).substring(startIndex)");
                }
                if (strSubstring == null || (strSubstring = stringsKt__IndentKt$getIndentFunction$1.mo528n(strSubstring)) == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList.add(strSubstring);
            }
            i10 = i11;
        }
        StringBuilder sb2 = new StringBuilder(size);
        C6752c.m13429W(arrayList, sb2, "\n", null, null, null, 124);
        String string = sb2.toString();
        C5207g.m11110e(string, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return string;
    }
}
