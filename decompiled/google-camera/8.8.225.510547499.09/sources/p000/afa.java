package p000;

import android.view.View;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class afa {
    /* JADX INFO: renamed from: a */
    public static boolean m418a(View view) {
        return view.hasOnClickListeners();
    }

    /* JADX INFO: renamed from: b */
    public static final Set m419b(String str) {
        Character ch;
        if (str.length() == 0) {
            return okx.f46217a;
        }
        String strSubstring = str.substring(ook.m18807u(str, '(', 0, 6) + 1, ook.m18809w(str, ')'));
        strSubstring.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque();
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        while (i < strSubstring.length()) {
            char cCharAt = strSubstring.charAt(i);
            int i4 = i3 + 1;
            if (cCharAt == '\'' || cCharAt == '\"' || cCharAt == '`') {
                if (arrayDeque.isEmpty()) {
                    arrayDeque.push(Character.valueOf(cCharAt));
                } else {
                    Character ch2 = (Character) arrayDeque.peek();
                    if (ch2 != null && ch2.charValue() == cCharAt) {
                        arrayDeque.pop();
                    }
                }
            } else if (cCharAt == '[') {
                if (arrayDeque.isEmpty()) {
                    arrayDeque.push('[');
                }
            } else if (cCharAt == ']') {
                if (!arrayDeque.isEmpty() && (ch = (Character) arrayDeque.peek()) != null && ch.charValue() == '[') {
                    arrayDeque.pop();
                }
            } else if (cCharAt == ',' && arrayDeque.isEmpty()) {
                String strSubstring2 = strSubstring.substring(i2 + 1, i3);
                strSubstring2.getClass();
                int length = strSubstring2.length() - 1;
                int i5 = 0;
                boolean z = false;
                while (i5 <= length) {
                    int iM18735a = ooc.m18735a(strSubstring2.charAt(true != z ? i5 : length), 32);
                    if (z) {
                        if (iM18735a > 0) {
                            break;
                        }
                        length--;
                    } else if (iM18735a > 0) {
                        z = true;
                    } else {
                        i5++;
                    }
                }
                arrayList.add(strSubstring2.subSequence(i5, length + 1).toString());
                i2 = i3;
            }
            i++;
            i3 = i4;
        }
        String strSubstring3 = strSubstring.substring(i2 + 1);
        strSubstring3.getClass();
        arrayList.add(ook.m18802p(strSubstring3).toString());
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            String str2 = (String) obj;
            String[] strArr = aqd.f2111a;
            for (int i6 = 0; i6 < 9; i6++) {
                if (ook.m18766D(str2, strArr[i6])) {
                    arrayList2.add(obj);
                    break;
                }
            }
        }
        return omn.m18675O(arrayList2);
    }
}
