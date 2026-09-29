package p000;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import androidx.core.R$styleable;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ted {
    /* JADX INFO: renamed from: a */
    public static Shader m22019a(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        float f;
        float f2;
        Shader.TileMode tileMode;
        Shader.TileMode tileMode2;
        Resources resources2 = resources;
        String name = xmlResourceParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray typedArrayM17383g = nda.m17383g(resources2, theme, attributeSet, R$styleable.GradientColor);
        float f3 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? typedArrayM17383g.getFloat(R$styleable.GradientColor_android_startX, 0.0f) : 0.0f;
        float f4 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? typedArrayM17383g.getFloat(R$styleable.GradientColor_android_startY, 0.0f) : 0.0f;
        float f5 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? typedArrayM17383g.getFloat(R$styleable.GradientColor_android_endX, 0.0f) : 0.0f;
        float f6 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? typedArrayM17383g.getFloat(R$styleable.GradientColor_android_endY, 0.0f) : 0.0f;
        float f7 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? typedArrayM17383g.getFloat(R$styleable.GradientColor_android_centerX, 0.0f) : 0.0f;
        float f8 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? typedArrayM17383g.getFloat(R$styleable.GradientColor_android_centerY, 0.0f) : 0.0f;
        int i = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? typedArrayM17383g.getInt(R$styleable.GradientColor_android_type, 0) : 0;
        int color = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? typedArrayM17383g.getColor(R$styleable.GradientColor_android_startColor, 0) : 0;
        boolean z = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int i2 = 1;
        int color2 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? typedArrayM17383g.getColor(R$styleable.GradientColor_android_centerColor, 0) : 0;
        float f9 = f3;
        int color3 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? typedArrayM17383g.getColor(R$styleable.GradientColor_android_endColor, 0) : 0;
        float f10 = f4;
        int i3 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? typedArrayM17383g.getInt(R$styleable.GradientColor_android_tileMode, 0) : 0;
        float f11 = f5;
        float f12 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? typedArrayM17383g.getFloat(R$styleable.GradientColor_android_gradientRadius, 0.0f) : 0.0f;
        typedArrayM17383g.recycle();
        int depth = xmlResourceParser.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next = xmlResourceParser.next();
            f = f12;
            if (next == i2) {
                f2 = f6;
                break;
            }
            int depth2 = xmlResourceParser.getDepth();
            f2 = f6;
            if (depth2 < depth && next == 3) {
                break;
            }
            if (next == 2) {
                if (depth2 > depth) {
                    resources2 = resources;
                } else if (xmlResourceParser.getName().equals("item")) {
                    TypedArray typedArrayM17383g2 = nda.m17383g(resources2, theme, attributeSet, R$styleable.GradientColorItem);
                    boolean zHasValue = typedArrayM17383g2.hasValue(R$styleable.GradientColorItem_android_color);
                    boolean zHasValue2 = typedArrayM17383g2.hasValue(R$styleable.GradientColorItem_android_offset);
                    if (!zHasValue || !zHasValue2) {
                        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                    }
                    int color4 = typedArrayM17383g2.getColor(R$styleable.GradientColorItem_android_color, 0);
                    float f13 = typedArrayM17383g2.getFloat(R$styleable.GradientColorItem_android_offset, 0.0f);
                    typedArrayM17383g2.recycle();
                    arrayList2.add(Integer.valueOf(color4));
                    arrayList.add(Float.valueOf(f13));
                    resources2 = resources;
                } else {
                    continue;
                }
            }
            f12 = f;
            f6 = f2;
            i2 = 1;
        }
        p33 p33Var = arrayList2.size() > 0 ? new p33(arrayList2, arrayList) : null;
        if (p33Var == null) {
            p33Var = z ? new p33(color, color2, color3) : new p33(color, color3);
        }
        if (i != 1) {
            if (i == 2) {
                return new SweepGradient(f7, f8, (int[]) p33Var.f55513b, (float[]) p33Var.f55514c);
            }
            int[] iArr = (int[]) p33Var.f55513b;
            float[] fArr = (float[]) p33Var.f55514c;
            if (i3 != 1) {
                tileMode2 = i3 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode2 = Shader.TileMode.REPEAT;
            }
            return new LinearGradient(f9, f10, f11, f2, iArr, fArr, tileMode2);
        }
        if (f <= 0.0f) {
            throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
        }
        int[] iArr2 = (int[]) p33Var.f55513b;
        float[] fArr2 = (float[]) p33Var.f55514c;
        if (i3 != 1) {
            tileMode = i3 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
        } else {
            tileMode = Shader.TileMode.REPEAT;
        }
        return new RadialGradient(f7, f8, f, iArr2, fArr2, tileMode);
    }

    /* JADX INFO: renamed from: b */
    public static void m22020b(int i, int i2) {
        String strM365e;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strM365e = afd.m365e("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    C3386nv.m17626m(wq1.m24124t(new StringBuilder(String.valueOf(i2).length() + 15), "negative size: ", i2));
                    return;
                }
                strM365e = afd.m365e("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strM365e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m22021c(int i, int i2, int i3) {
        String strM22022d;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strM22022d = m22022d(i, "start index", i3);
            } else {
                strM22022d = (i2 < 0 || i2 > i3) ? m22022d(i2, "end index", i3) : afd.m365e("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strM22022d);
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m22022d(int i, String str, int i2) {
        if (i < 0) {
            return afd.m365e("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return afd.m365e("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        C3386nv.m17626m(wq1.m24124t(new StringBuilder(String.valueOf(i2).length() + 15), "negative size: ", i2));
        return null;
    }
}
