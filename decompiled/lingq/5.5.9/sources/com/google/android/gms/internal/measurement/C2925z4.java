package com.google.android.gms.internal.measurement;

import android.support.v4.media.session.C0166e;
import java.util.logging.Level;
import java.util.logging.Logger;
import p003a2.C0009a;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2925z4 {
    /* JADX INFO: renamed from: a */
    public static String m8474a(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strM766l;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = objArr.length;
            if (i11 >= length) {
                break;
            }
            Object obj = objArr[i11];
            if (obj == null) {
                strM766l = "null";
            } else {
                try {
                    strM766l = obj.toString();
                } catch (Exception e10) {
                    String strM21i = C0009a.m21i(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strM21i), (Throwable) e10);
                    strM766l = C0166e.m766l("<", strM21i, " threw ", e10.getClass().getName(), ">");
                }
            }
            objArr[i11] = strM766l;
            i11++;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + (length * 16));
        int i12 = 0;
        while (true) {
            length2 = objArr.length;
            if (i10 >= length2 || (iIndexOf = str.indexOf("%s", i12)) == -1) {
                break;
                break;
            }
            sb2.append((CharSequence) str, i12, iIndexOf);
            sb2.append(objArr[i10]);
            i12 = iIndexOf + 2;
            i10++;
        }
        sb2.append((CharSequence) str, i12, str.length());
        if (i10 < length2) {
            sb2.append(" [");
            sb2.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb2.append(", ");
                sb2.append(objArr[i13]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }
}
