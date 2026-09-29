package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public abstract class nda {
    /* JADX INFO: renamed from: a */
    public static final boolean m17377a(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: b */
    public static ColorStateList m17378b(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        if (!m17382f(xmlPullParser, "tint")) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(1, typedValue);
        int i = typedValue.type;
        if (i == 2) {
            throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
        }
        if (i >= 28 && i <= 31) {
            return ColorStateList.valueOf(typedValue.data);
        }
        Resources resources = typedArray.getResources();
        int resourceId = typedArray.getResourceId(1, 0);
        ThreadLocal threadLocal = wa1.f66559a;
        try {
            return wa1.m23822a(resources, resources.getXml(resourceId), theme);
        } catch (Exception e) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static C3047gq m17379c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        C3047gq c3047gqM12796d;
        if (m17382f(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new C3047gq((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                c3047gqM12796d = C3047gq.m12796d(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception e) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                c3047gqM12796d = null;
            }
            if (c3047gqM12796d != null) {
                return c3047gqM12796d;
            }
        }
        return new C3047gq((Shader) null, (ColorStateList) null, 0);
    }

    /* JADX INFO: renamed from: d */
    public static int m17380d(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m17382f(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    /* JADX INFO: renamed from: e */
    public static String m17381e(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (m17382f(xmlPullParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m17382f(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* JADX INFO: renamed from: g */
    public static TypedArray m17383g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* JADX INFO: renamed from: h */
    public static final v64 m17384h(l64 l64Var) {
        return new v64(l64Var.f49116a, l64Var.f49117b, l64Var.f49118c, l64Var.f49119d);
    }

    /* JADX INFO: renamed from: i */
    public static void m17385i(int i, int i2) {
        String strM23891b;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strM23891b = wed.m23891b("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    C3386nv.m17626m(ux5.m22988k(i2, "negative size: "));
                    return;
                }
                strM23891b = wed.m23891b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strM23891b);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m17386j(int i, int i2) {
        if (i < 0 || i > i2) {
            v63.m23143u(m17388l(i, "index", i2));
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m17387k(int i, int i2, int i3) {
        String strM17388l;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strM17388l = m17388l(i, "start index", i3);
            } else {
                strM17388l = (i2 < 0 || i2 > i3) ? m17388l(i2, "end index", i3) : wed.m23891b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strM17388l);
        }
    }

    /* JADX INFO: renamed from: l */
    public static String m17388l(int i, String str, int i2) {
        if (i < 0) {
            return wed.m23891b("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return wed.m23891b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        C3386nv.m17626m(ux5.m22988k(i2, "negative size: "));
        return null;
    }
}
