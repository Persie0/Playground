package p286o2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: o2.k */
/* JADX INFO: loaded from: classes.dex */
public final class C7911k {
    /* JADX INFO: renamed from: a */
    public static int m15683a(int i10, Context context, int i11) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId != 0 ? i10 : i11;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m15684b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, boolean z10) {
        return !m15692j(xmlPullParser, str) ? z10 : typedArray.getBoolean(i10, z10);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public static ColorStateList m15685c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        if (!m15692j(xmlPullParser, "tint")) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(1, typedValue);
        int i10 = typedValue.type;
        if (i10 == 2) {
            throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
        }
        if (i10 >= 28 && i10 <= 31) {
            return ColorStateList.valueOf(typedValue.data);
        }
        Resources resources = typedArray.getResources();
        int resourceId = typedArray.getResourceId(1, 0);
        ThreadLocal<TypedValue> threadLocal = C7902b.f43039a;
        try {
            return C7902b.m15666a(resources, resources.getXml(resourceId), theme);
        } catch (Exception e10) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static C7903c m15686d(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i10) {
        C7903c c7903cM15668a;
        if (m15692j(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i10, typedValue);
            int i11 = typedValue.type;
            if (i11 >= 28 && i11 <= 31) {
                return new C7903c(null, null, typedValue.data);
            }
            try {
                c7903cM15668a = C7903c.m15668a(typedArray.getResources(), typedArray.getResourceId(i10, 0), theme);
            } catch (Exception e10) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e10);
                c7903cM15668a = null;
            }
            if (c7903cM15668a != null) {
                return c7903cM15668a;
            }
        }
        return new C7903c(null, null, 0);
    }

    /* JADX INFO: renamed from: e */
    public static float m15687e(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, float f3) {
        return !m15692j(xmlPullParser, str) ? f3 : typedArray.getFloat(i10, f3);
    }

    /* JADX INFO: renamed from: f */
    public static int m15688f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, int i11) {
        return !m15692j(xmlPullParser, str) ? i11 : typedArray.getInt(i10, i11);
    }

    /* JADX INFO: renamed from: g */
    public static int m15689g(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10) {
        if (m15692j(xmlPullParser, str)) {
            return typedArray.getResourceId(i10, 0);
        }
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public static String m15690h(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10) {
        if (m15692j(xmlPullParser, str)) {
            return typedArray.getString(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static String m15691i(TypedArray typedArray, int i10, int i11) {
        String string = typedArray.getString(i10);
        if (string == null) {
            string = typedArray.getString(i11);
        }
        return string;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m15692j(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* JADX INFO: renamed from: k */
    public static TypedArray m15693k(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
