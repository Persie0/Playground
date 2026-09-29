package p502y7;

import android.text.TextUtils;
import com.kochava.tracker.BuildConfig;
import dm.C5207g;
import java.io.File;
import java.nio.charset.Charset;
import kotlin.text.Regex;
import p173i8.C6205a;
import p291o7.C8004n;

/* JADX INFO: renamed from: y7.e */
/* JADX INFO: loaded from: classes.dex */
public final class C10304e {

    /* JADX INFO: renamed from: a */
    public static final C10304e f51833a = new C10304e();

    /* JADX INFO: renamed from: a */
    public static final File m19310a() {
        if (C6205a.m12742b(C10304e.class)) {
            return null;
        }
        try {
            File file = new File(C8004n.m15871a().getFilesDir(), "facebook_ml/");
            return (file.exists() || file.mkdirs()) ? file : null;
        } catch (Throwable th2) {
            C6205a.m12741a(C10304e.class, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m19311b(String str) {
        if (C6205a.m12742b(this)) {
            return null;
        }
        try {
            C5207g.m11111f(str, "str");
            int length = str.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = C5207g.m11113h(str.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    }
                    length--;
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            Object[] array = new Regex("\\s+").m14273d(str.subSequence(i10, length + 1).toString()).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String strJoin = TextUtils.join(" ", (String[]) array);
            C5207g.m11110e(strJoin, "join(\" \", strArray)");
            return strJoin;
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final int[] m19312c(String str) {
        if (C6205a.m12742b(this)) {
            return null;
        }
        try {
            C5207g.m11111f(str, "texts");
            int[] iArr = new int[BuildConfig.SDK_TRUNCATE_LENGTH];
            String strM19311b = m19311b(str);
            Charset charsetForName = Charset.forName("UTF-8");
            C5207g.m11110e(charsetForName, "forName(\"UTF-8\")");
            if (strM19311b == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = strM19311b.getBytes(charsetForName);
            C5207g.m11110e(bytes, "(this as java.lang.String).getBytes(charset)");
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if (i10 < bytes.length) {
                    iArr[i10] = bytes[i10] & 255;
                } else {
                    iArr[i10] = 0;
                }
                if (i11 >= 128) {
                    return iArr;
                }
                i10 = i11;
            }
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
            return null;
        }
    }
}
