package p000;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aar {
    /* JADX INFO: renamed from: a */
    public static boolean m37a(Activity activity, String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }

    /* JADX INFO: renamed from: b */
    public static float m38b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !m46j(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    /* JADX INFO: renamed from: c */
    public static int m39c(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    /* JADX INFO: renamed from: d */
    public static int m40d(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m46j(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    /* JADX INFO: renamed from: e */
    public static int m41e(TypedArray typedArray, int i, int i2, int i3) {
        return typedArray.getResourceId(i, typedArray.getResourceId(i2, i3));
    }

    /* JADX INFO: renamed from: f */
    public static TypedArray m42f(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* JADX INFO: renamed from: g */
    public static CharSequence m43g(TypedArray typedArray, int i, int i2) {
        CharSequence text = typedArray.getText(i);
        return text == null ? typedArray.getText(i2) : text;
    }

    /* JADX INFO: renamed from: h */
    public static String m44h(TypedArray typedArray, int i, int i2) {
        String string = typedArray.getString(i);
        return string == null ? typedArray.getString(i2) : string;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m45i(TypedArray typedArray, int i, int i2, boolean z) {
        return typedArray.getBoolean(i, typedArray.getBoolean(i2, z));
    }

    /* JADX INFO: renamed from: j */
    public static boolean m46j(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* JADX INFO: renamed from: k */
    public static CharSequence[] m47k(TypedArray typedArray, int i, int i2) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        return textArray == null ? typedArray.getTextArray(i2) : textArray;
    }

    /* JADX INFO: renamed from: l */
    public static int m48l(TypedArray typedArray, int i, int i2) {
        return typedArray.getInt(i, typedArray.getInt(i2, Integer.MAX_VALUE));
    }

    /* JADX INFO: renamed from: m */
    public static int m49m(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (m46j(xmlPullParser, str)) {
            return typedArray.getColor(i, 0);
        }
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0073  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static ilo m50n(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        ilo iloVar;
        byte b;
        Shader radialGradient;
        String str2 = "centerColor";
        if (m46j(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            if (typedValue.type >= 28 && typedValue.type <= 31) {
                return ilo.m11437k(typedValue.data);
            }
            Resources resources = typedArray.getResources();
            try {
                XmlResourceParser xml = resources.getXml(typedArray.getResourceId(i, 0));
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    int next = xml.next();
                    if (next == 2) {
                        String name = xml.getName();
                        switch (name) {
                            case "gradient":
                                b = 1;
                                break;
                            case "selector":
                                b = 0;
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        try {
                            switch (b) {
                                case 0:
                                    ColorStateList colorStateListM185b = ace.m185b(resources, xml, attributeSetAsAttributeSet, theme);
                                    iloVar = new ilo((Shader) null, colorStateListM185b, colorStateListM185b.getDefaultColor());
                                    break;
                                case 1:
                                    String name2 = xml.getName();
                                    if (!name2.equals("gradient")) {
                                        throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
                                    }
                                    TypedArray typedArrayM42f = m42f(resources, theme, attributeSetAsAttributeSet, aao.f37d);
                                    float fM38b = m38b(typedArrayM42f, xml, "startX", 8, 0.0f);
                                    float fM38b2 = m38b(typedArrayM42f, xml, "startY", 9, 0.0f);
                                    float fM38b3 = m38b(typedArrayM42f, xml, "endX", 10, 0.0f);
                                    float fM38b4 = m38b(typedArrayM42f, xml, "endY", 11, 0.0f);
                                    float fM38b5 = m38b(typedArrayM42f, xml, "centerX", 3, 0.0f);
                                    float fM38b6 = m38b(typedArrayM42f, xml, "centerY", 4, 0.0f);
                                    int iM40d = m40d(typedArrayM42f, xml, "type", 2, 0);
                                    int iM49m = m49m(typedArrayM42f, xml, "startColor", 0);
                                    boolean zM46j = m46j(xml, "centerColor");
                                    int iM49m2 = m49m(typedArrayM42f, xml, "centerColor", 7);
                                    int iM49m3 = m49m(typedArrayM42f, xml, "endColor", 1);
                                    int iM40d2 = m40d(typedArrayM42f, xml, "tileMode", 6, 0);
                                    float fM38b7 = m38b(typedArrayM42f, xml, "gradientRadius", 5, 0.0f);
                                    typedArrayM42f.recycle();
                                    int depth = xml.getDepth() + 1;
                                    ArrayList arrayList = new ArrayList(20);
                                    ArrayList arrayList2 = new ArrayList(20);
                                    while (true) {
                                        int next2 = xml.next();
                                        fM38b = fM38b;
                                        if (next2 != 1) {
                                            int depth2 = xml.getDepth();
                                            if (depth2 < depth) {
                                                iM40d2 = iM40d2;
                                                if (next2 != 3) {
                                                }
                                            } else {
                                                iM40d2 = iM40d2;
                                            }
                                            if (next2 == 2 && depth2 <= depth) {
                                                if (xml.getName().equals("item")) {
                                                    TypedArray typedArrayM42f2 = m42f(resources, theme, attributeSetAsAttributeSet, aao.f38e);
                                                    boolean zHasValue = typedArrayM42f2.hasValue(0);
                                                    boolean zHasValue2 = typedArrayM42f2.hasValue(1);
                                                    if (!zHasValue || !zHasValue2) {
                                                        throw new XmlPullParserException(String.valueOf(xml.getPositionDescription()).concat(": <item> tag requires a 'color' attribute and a 'offset' attribute!"));
                                                    }
                                                    int color = typedArrayM42f2.getColor(0, 0);
                                                    float f = typedArrayM42f2.getFloat(1, 0.0f);
                                                    typedArrayM42f2.recycle();
                                                    arrayList2.add(Integer.valueOf(color));
                                                    arrayList.add(Float.valueOf(f));
                                                }
                                            }
                                        } else {
                                            iM40d2 = iM40d2;
                                        }
                                    }
                                    aie aieVar = arrayList2.size() > 0 ? new aie(arrayList2, arrayList) : null;
                                    if (aieVar == null) {
                                        aieVar = zM46j ? new aie(iM49m, iM49m2, iM49m3) : new aie(iM49m, iM49m3);
                                    }
                                    switch (iM40d) {
                                        case 1:
                                            if (fM38b7 <= 0.0f) {
                                                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
                                            }
                                            radialGradient = new RadialGradient(fM38b5, fM38b6, fM38b7, (int[]) aieVar.f426a, (float[]) aieVar.f427b, aap.m32d(iM40d2));
                                            break;
                                            break;
                                        case 2:
                                            radialGradient = new SweepGradient(fM38b5, fM38b6, (int[]) aieVar.f426a, (float[]) aieVar.f427b);
                                            break;
                                        default:
                                            radialGradient = new LinearGradient(fM38b, fM38b2, fM38b3, fM38b4, (int[]) aieVar.f426a, (float[]) aieVar.f427b, aap.m32d(iM40d2));
                                            break;
                                    }
                                    try {
                                        iloVar = new ilo(radialGradient, (ColorStateList) null, 0);
                                    } catch (Exception e) {
                                        e = e;
                                        str2 = null;
                                        Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                                        iloVar = str2;
                                    }
                                    break;
                                    break;
                                default:
                                    throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
                            }
                        } catch (Exception e2) {
                            e = e2;
                        }
                    } else if (next == 1) {
                        throw new XmlPullParserException("No start tag found");
                    }
                }
            } catch (Exception e3) {
                e = e3;
                str2 = null;
            }
            if (iloVar != 0) {
                return iloVar;
            }
        }
        return ilo.m11437k(0);
    }
}
