package p000;

import android.os.Build;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wed {
    /* JADX INFO: renamed from: a */
    public static int m23890a(int i) {
        if (i == -1) {
            return -1;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 34) {
            switch (i) {
                case 21:
                case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                case 26:
                    i = 6;
                    break;
                case 22:
                case 24:
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    i = 4;
                    break;
                case 25:
                    i = 0;
                    break;
            }
        }
        if (i2 >= 30) {
            return i;
        }
        if (i != 12) {
            if (i == 13) {
                return 6;
            }
            if (i != 16) {
                if (i != 17) {
                    return i;
                }
                return 0;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: b */
    public static String m23891b(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strM22991n;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                strM22991n = "null";
            } else {
                try {
                    strM22991n = obj.toString();
                } catch (Exception e) {
                    String strM17735j = AbstractC3393o1.m17735j(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strM17735j), (Throwable) e);
                    strM22991n = ux5.m22991n("<", strM17735j, " threw ", e.getClass().getName(), ">");
                }
            }
            objArr[i2] = strM22991n;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(objArr[i]);
            i++;
            i3 = iIndexOf + 2;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
