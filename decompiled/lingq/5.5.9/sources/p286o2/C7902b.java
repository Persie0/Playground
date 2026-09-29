package p286o2;

import ae.C0062b;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.linguist.R;
import java.io.IOException;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParserException;
import p211k2.C6578a;
import p338qd.C8573r0;

/* JADX INFO: renamed from: o2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7902b {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<TypedValue> f43039a = new ThreadLocal<>();

    /* JADX INFO: renamed from: a */
    public static ColorStateList m15666a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m15667b(resources, xmlResourceParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x009a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r33v0, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    /* JADX INFO: renamed from: b */
    public static ColorStateList m15667b(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        float f3;
        int[] iArr;
        boolean z10;
        float f10;
        float f11;
        float f12;
        float f13;
        TypedValue typedValue;
        resources = resources;
        attributeSet = attributeSet;
        theme = theme;
        String name = xmlResourceParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        ?? r10 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        Object[] objArr = new int[20][];
        int[] iArr2 = new int[20];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == r10 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlResourceParser.getName().equals("item")) {
                int[] iArr3 = C6578a.f37398a;
                ?? ObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr3) : theme.obtainStyledAttributes(attributeSet, iArr3, i10, i10);
                int resourceId = ObtainAttributes.getResourceId(i10, -1);
                if (resourceId == -1) {
                    color = ObtainAttributes.getColor(i10, -65281);
                } else {
                    ThreadLocal<TypedValue> threadLocal = f43039a;
                    TypedValue typedValue2 = threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    resources.getValue(resourceId, typedValue, r10);
                    int i12 = typedValue.type;
                    if (((i12 < 28 || i12 > 31) ? i10 : r10) == 0) {
                        try {
                            color = m15666a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                        } catch (Exception unused) {
                            color = ObtainAttributes.getColor(i10, -65281);
                        }
                    } else {
                        color = ObtainAttributes.getColor(i10, -65281);
                    }
                }
                if (ObtainAttributes.hasValue(r10)) {
                    f3 = ObtainAttributes.getFloat(r10, 1.0f);
                } else {
                    f3 = ObtainAttributes.hasValue(3) ? ObtainAttributes.getFloat(3, 1.0f) : 1.0f;
                }
                float f14 = (Build.VERSION.SDK_INT < 31 || !ObtainAttributes.hasValue(2)) ? ObtainAttributes.getFloat(4, -1.0f) : ObtainAttributes.getFloat(2, -1.0f);
                ObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr4 = new int[attributeCount];
                int i13 = i10;
                int i14 = i13;
                while (i13 < attributeCount) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i13);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                        int i15 = i14 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i13, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr4[i14] = attributeNameResource;
                        i14 = i15;
                    }
                    i13++;
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr4, i14);
                float f15 = 0.0f;
                float f16 = 100.0f;
                boolean z11 = f14 >= 0.0f && f14 <= 100.0f;
                if (f3 != 1.0f || z11) {
                    int iM16699T = C8573r0.m16699T((int) ((Color.alpha(color) * f3) + 0.5f), 0, 255);
                    if (z11) {
                        C7901a c7901aM15663a = C7901a.m15663a(color);
                        C7912l c7912l = C7912l.f43072k;
                        float f17 = c7901aM15663a.f43034b;
                        if (f17 >= 1.0d && Math.round(f14) > 0.0d && Math.round(f14) < 100.0d) {
                            float f18 = c7901aM15663a.f43033a;
                            float fMin = f18 < 0.0f ? 0.0f : Math.min(360.0f, f18);
                            float f19 = 0.0f;
                            float f20 = f17;
                            C7901a c7901a = null;
                            boolean z12 = true;
                            while (true) {
                                if (Math.abs(f19 - f17) < 0.4f) {
                                    iArr = iArrTrimStateSet;
                                    depth2 = depth2;
                                    z10 = true;
                                    if (c7901a != null) {
                                        color = c7901a.m15665c(c7912l);
                                        break;
                                    }
                                    color = C0062b.m386q1(f14);
                                    break;
                                }
                                float f21 = 1000.0f;
                                float f22 = f15;
                                float f23 = f16;
                                float f24 = 1000.0f;
                                C7901a c7901a2 = null;
                                while (true) {
                                    if (Math.abs(f22 - f23) <= 0.01f) {
                                        depth2 = depth2;
                                        f10 = fMin;
                                        f11 = f16;
                                        z10 = true;
                                        float f25 = f15;
                                        iArr = iArrTrimStateSet;
                                        f12 = f25;
                                        break;
                                    }
                                    float f26 = ((f23 - f22) / 2.0f) + f22;
                                    int iM15665c = C7901a.m15664b(f26, f20, fMin).m15665c(C7912l.f43072k);
                                    float fM258D1 = C0062b.m258D1(Color.red(iM15665c));
                                    float fM258D2 = C0062b.m258D1(Color.green(iM15665c));
                                    float fM258D3 = C0062b.m258D1(Color.blue(iM15665c));
                                    z10 = true;
                                    float[] fArr = C0062b.f151M[1];
                                    f11 = 100.0f;
                                    float f27 = ((fM258D3 * fArr[2]) + ((fM258D2 * fArr[1]) + (fM258D1 * fArr[0]))) / 100.0f;
                                    float fCbrt = f27 <= 0.008856452f ? f27 * 903.2963f : (((float) Math.cbrt(f27)) * 116.0f) - 16.0f;
                                    float fAbs = Math.abs(f14 - fCbrt);
                                    if (fAbs < 0.2f) {
                                        C7901a c7901aM15663a2 = C7901a.m15663a(iM15665c);
                                        C7901a c7901aM15664b = C7901a.m15664b(c7901aM15663a2.f43035c, c7901aM15663a2.f43034b, fMin);
                                        f13 = f26;
                                        float f28 = c7901aM15663a2.f43036d - c7901aM15664b.f43036d;
                                        f10 = fMin;
                                        float f29 = c7901aM15663a2.f43037e - c7901aM15664b.f43037e;
                                        float f30 = c7901aM15663a2.f43038f - c7901aM15664b.f43038f;
                                        double dSqrt = Math.sqrt((f30 * f30) + (f29 * f29) + (f28 * f28));
                                        iArr = iArrTrimStateSet;
                                        float fPow = (float) (Math.pow(dSqrt, 0.63d) * 1.41d);
                                        if (fPow <= 1.0f) {
                                            f24 = fPow;
                                            c7901a2 = c7901aM15663a2;
                                            f21 = fAbs;
                                        }
                                    } else {
                                        f13 = f26;
                                        f10 = fMin;
                                        iArr = iArrTrimStateSet;
                                    }
                                    f12 = 0.0f;
                                    if (f21 == 0.0f && f24 == 0.0f) {
                                        break;
                                    }
                                    if (fCbrt < f14) {
                                        f22 = f13;
                                    } else {
                                        f23 = f13;
                                    }
                                    f16 = 100.0f;
                                    depth2 = depth2;
                                    fMin = f10;
                                    int[] iArr5 = iArr;
                                    f15 = 0.0f;
                                    iArrTrimStateSet = iArr5;
                                }
                                C7901a c7901a3 = c7901a2;
                                if (!z12) {
                                    if (c7901a3 == null) {
                                        f17 = f20;
                                        f20 = f19;
                                    } else {
                                        c7901a = c7901a3;
                                    }
                                    f19 = f20;
                                    f20 = ((f17 - f20) / 2.0f) + f20;
                                } else {
                                    if (c7901a3 != null) {
                                        color = c7901a3.m15665c(c7912l);
                                        break;
                                    }
                                    f20 = ((f17 - f19) / 2.0f) + f19;
                                    z12 = false;
                                }
                                f16 = f11;
                                depth2 = depth2;
                                fMin = f10;
                                int[] iArr6 = iArr;
                                f15 = f12;
                                iArrTrimStateSet = iArr6;
                            }
                        } else {
                            iArr = iArrTrimStateSet;
                            depth2 = depth2;
                            z10 = true;
                            color = C0062b.m386q1(f14);
                        }
                    } else {
                        iArr = iArrTrimStateSet;
                        depth2 = depth2;
                        z10 = true;
                    }
                    color = (16777215 & color) | (iM16699T << 24);
                } else {
                    iArr = iArrTrimStateSet;
                    depth2 = depth2;
                    z10 = true;
                }
                int i16 = i11 + 1;
                if (i16 > iArr2.length) {
                    int[] iArr7 = new int[i11 <= 4 ? 8 : i11 * 2];
                    System.arraycopy(iArr2, 0, iArr7, 0, i11);
                    iArr2 = iArr7;
                }
                iArr2[i11] = color;
                if (i16 > objArr.length) {
                    Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i11 > 4 ? i11 * 2 : 8);
                    System.arraycopy(objArr, 0, objArr2, 0, i11);
                    objArr = objArr2;
                }
                objArr[i11] = iArr;
                objArr = (int[][]) objArr;
                i11 = i16;
                r10 = z10;
                depth2 = depth2;
                i10 = 0;
            } else {
                r10 = r10 == true ? 1 : 0;
                depth2 = depth2;
                i10 = 0;
            }
        }
        int[] iArr8 = new int[i11];
        int[][] iArr9 = new int[i11][];
        System.arraycopy(iArr2, 0, iArr8, 0, i11);
        System.arraycopy(objArr, 0, iArr9, 0, i11);
        return new ColorStateList(iArr9, iArr8);
    }
}
