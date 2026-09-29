package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.sequences.AbstractC3204c;

/* JADX INFO: loaded from: classes.dex */
public abstract class wk9 extends x74 {
    /* JADX INFO: renamed from: K */
    public static String m24028K(String str, String str2) {
        int i = 1;
        return AbstractC3204c.m15419o0(new bl3(new jd5(str, i), new ql4(str2, 26), i), "\n");
    }

    /* JADX INFO: renamed from: L */
    public static String m24029L(String str) {
        int length;
        Comparable comparable;
        List listM23395r0 = vk9.m23395r0(str);
        List list = listM23395r0;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!vk9.m23391n0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            length = 0;
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
                if (!ci8.m4697J(str2.charAt(length))) {
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
        int length3 = str.length();
        listM23395r0.size();
        ow8 ow8Var = new ow8(7);
        int size = listM23395r0.size() - 1;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            int i = length + 1;
            if (length < 0) {
                vz1.m23628e0();
                throw null;
            }
            String str3 = (String) obj2;
            if ((length == 0 || length == size) && vk9.m23391n0(str3)) {
                str3 = null;
            } else {
                str3.getClass();
                if (iIntValue < 0) {
                    C3386nv.m17624j(ux5.m22989l("Requested character count ", iIntValue, " is less than zero."));
                    return null;
                }
                int length4 = str3.length();
                if (iIntValue <= length4) {
                    length4 = iIntValue;
                }
                String str4 = (String) ow8Var.invoke(str3.substring(length4));
                if (str4 != null) {
                    str3 = str4;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            length = i;
        }
        StringBuilder sb = new StringBuilder(length3);
        u91.m22595M0(arrayList3, sb, "\n", null, 124);
        return sb.toString();
    }

    /* JADX INFO: renamed from: M */
    public static String m24030M(String str) {
        String str2;
        if (vk9.m23391n0("|")) {
            C3386nv.m17626m("marginPrefix must be non-blank string.");
            return null;
        }
        List listM23395r0 = vk9.m23395r0(str);
        int length = str.length();
        listM23395r0.size();
        ow8 ow8Var = new ow8(7);
        int size = listM23395r0.size() - 1;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listM23395r0) {
            int i2 = i + 1;
            if (i < 0) {
                vz1.m23628e0();
                throw null;
            }
            String str3 = (String) obj;
            if ((i == 0 || i == size) && vk9.m23391n0(str3)) {
                str3 = null;
            } else {
                int length2 = str3.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!ci8.m4697J(str3.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                String strSubstring = (i3 != -1 && cl9.m4841X(str3, i3, "|", false)) ? str3.substring("|".length() + i3) : null;
                if (strSubstring != null && (str2 = (String) ow8Var.invoke(strSubstring)) != null) {
                    str3 = str2;
                }
            }
            if (str3 != null) {
                arrayList.add(str3);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        u91.m22595M0(arrayList, sb, "\n", null, 124);
        return sb.toString();
    }
}
