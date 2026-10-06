package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.google.android.apps.camera.bottombar.C0100R;
import java.io.IOException;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ace {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f80a = 0;

    /* JADX INFO: renamed from: b */
    private static final ThreadLocal f81b = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public static ColorStateList m184a(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                return m185b(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
            }
        } while (next != 1);
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Code duplicated, block: B:133:0x0300  */
    /* JADX WARN: Code duplicated, block: B:135:0x030b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0098  */
    /* JADX WARN: Code duplicated, block: B:75:0x013f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0150  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX INFO: renamed from: b */
    public static ColorStateList m185b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int color;
        int i;
        double d;
        float f;
        acc accVar;
        Object[] objArr;
        resources = resources;
        attributeSet = attributeSet;
        theme = theme;
        String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        ?? r4 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int i2 = 0;
        int[][] iArr = new int[20][];
        int i3 = 0;
        int[] iArr2 = new int[20];
        while (true) {
            int next = xmlPullParser.next();
            if (next == r4 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                int[] iArr3 = aao.f34a;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr3) : theme.obtainStyledAttributes(attributeSet, iArr3, i2, i2);
                int resourceId = typedArrayObtainAttributes.getResourceId(i2, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f81b;
                    TypedValue typedValue = (TypedValue) threadLocal.get();
                    if (typedValue == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    }
                    resources.getValue(resourceId, typedValue, (boolean) r4);
                    if (typedValue.type < 28 || typedValue.type > 31) {
                        try {
                            color = m184a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                        } catch (Exception e) {
                            color = typedArrayObtainAttributes.getColor(i2, -65281);
                        }
                    } else {
                        color = typedArrayObtainAttributes.getColor(i2, -65281);
                    }
                } else {
                    color = typedArrayObtainAttributes.getColor(i2, -65281);
                }
                float f2 = typedArrayObtainAttributes.hasValue(r4) ? typedArrayObtainAttributes.getFloat(r4, 1.0f) : typedArrayObtainAttributes.hasValue(3) ? typedArrayObtainAttributes.getFloat(3, 1.0f) : 1.0f;
                float f3 = typedArrayObtainAttributes.hasValue(2) ? typedArrayObtainAttributes.getFloat(2, -1.0f) : typedArrayObtainAttributes.getFloat(4, -1.0f);
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr4 = new int[attributeCount];
                int i4 = 0;
                for (int i5 = 0; i5 < attributeCount; i5++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i5);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != C0100R.attr.alpha && attributeNameResource != C0100R.attr.lStar) {
                        int i6 = i4 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i5, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr4[i4] = attributeNameResource;
                        i4 = i6;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr4, i4);
                boolean z = f3 >= 0.0f && f3 <= 100.0f;
                if (f2 != 1.0f) {
                    int iM69d = aax.m69d((int) ((Color.alpha(color) * f2) + 0.5f), 0, 255);
                    if (z) {
                        acc accVarM178b = acc.m178b(color);
                        float f4 = accVarM178b.f70a;
                        float f5 = accVarM178b.f71b;
                        d = f5;
                        aco acoVar = aco.f91a;
                        if (d >= 1.0d) {
                            i = depth2;
                            if (Math.round(f3) <= 0.0d && Math.round(f3) < 100.0d) {
                                float fMin = f4 < 0.0f ? 0.0f : Math.min(360.0f, f4);
                                float f6 = f5;
                                acc accVar2 = null;
                                boolean z2 = true;
                                float f7 = 0.0f;
                                while (true) {
                                    if (Math.abs(f7 - f5) < 0.4f) {
                                        iArrTrimStateSet = iArrTrimStateSet;
                                        iArr = iArr;
                                        if (accVar2 != null) {
                                            color = accVar2.m180a(acoVar);
                                            break;
                                        }
                                        color = acd.m182b(f3);
                                        break;
                                    }
                                    float f8 = 1000.0f;
                                    float f9 = 1000.0f;
                                    float f10 = 0.0f;
                                    float f11 = 100.0f;
                                    acc accVar3 = null;
                                    while (true) {
                                        if (Math.abs(f10 - f11) <= 0.01f) {
                                            fMin = fMin;
                                            iArr = iArr;
                                            f = f6;
                                            iArrTrimStateSet = iArrTrimStateSet;
                                            accVar = accVar3;
                                            break;
                                        }
                                        float f12 = f10 + ((f11 - f10) / 2.0f);
                                        int iM180a = acc.m179c(f12, f6, fMin).m180a(aco.f91a);
                                        float fM181a = acd.m181a(Color.red(iM180a));
                                        float fM181a2 = acd.m181a(Color.green(iM180a));
                                        float fM181a3 = acd.m181a(Color.blue(iM180a));
                                        float[] fArr = acd.f79d[1];
                                        float f13 = (((fM181a * fArr[0]) + (fM181a2 * fArr[1])) + (fM181a3 * fArr[2])) / 100.0f;
                                        float fCbrt = f13 <= 0.008856452f ? f13 * 903.2963f : (((float) Math.cbrt(f13)) * 116.0f) - 16.0f;
                                        float fAbs = Math.abs(f3 - fCbrt);
                                        if (fAbs < 0.2f) {
                                            acc accVarM178b2 = acc.m178b(iM180a);
                                            acc accVarM179c = acc.m179c(accVarM178b2.f72c, accVarM178b2.f71b, fMin);
                                            fMin = fMin;
                                            float f14 = accVarM178b2.f73d - accVarM179c.f73d;
                                            f = f6;
                                            float f15 = accVarM178b2.f74e - accVarM179c.f74e;
                                            float f16 = accVarM178b2.f75f - accVarM179c.f75f;
                                            double dSqrt = Math.sqrt((f14 * f14) + (f15 * f15) + (f16 * f16));
                                            iArrTrimStateSet = iArrTrimStateSet;
                                            float fPow = (float) (Math.pow(dSqrt, 0.63d) * 1.41d);
                                            if (fPow <= 1.0f) {
                                                f9 = fPow;
                                                accVar3 = accVarM178b2;
                                                f8 = fAbs;
                                            }
                                        } else {
                                            fMin = fMin;
                                            f = f6;
                                            iArrTrimStateSet = iArrTrimStateSet;
                                        }
                                        if (f8 == 0.0f && f9 == 0.0f) {
                                            accVar = accVar3;
                                            break;
                                        }
                                        if (fCbrt >= f3) {
                                            f11 = f12;
                                        }
                                        if (fCbrt < f3) {
                                            f10 = f12;
                                        }
                                        fMin = fMin;
                                        f6 = f;
                                    }
                                    if (!z2) {
                                        if (accVar != null) {
                                            accVar2 = accVar;
                                        }
                                        if (accVar != null) {
                                            f7 = f;
                                        }
                                        if (accVar == null) {
                                            f5 = f;
                                        }
                                        f6 = f7 + ((f5 - f7) / 2.0f);
                                    } else {
                                        if (accVar != null) {
                                            color = accVar.m180a(acoVar);
                                            break;
                                        }
                                        f6 = f7 + ((f5 - f7) / 2.0f);
                                        z2 = false;
                                    }
                                }
                            }
                        } else {
                            i = depth2;
                        }
                        color = acd.m182b(f3);
                    } else {
                        iArrTrimStateSet = iArrTrimStateSet;
                        i = depth2;
                        iArr = iArr;
                    }
                    color = (color & 16777215) | (iM69d << 24);
                } else if (z) {
                    z = true;
                    int iM69d2 = aax.m69d((int) ((Color.alpha(color) * f2) + 0.5f), 0, 255);
                    if (z) {
                        acc accVarM178b3 = acc.m178b(color);
                        float f17 = accVarM178b3.f70a;
                        float f18 = accVarM178b3.f71b;
                        d = f18;
                        aco acoVar2 = aco.f91a;
                        if (d >= 1.0d) {
                            i = depth2;
                            if (Math.round(f3) <= 0.0d) {
                            }
                        } else {
                            i = depth2;
                        }
                        color = acd.m182b(f3);
                    } else {
                        iArrTrimStateSet = iArrTrimStateSet;
                        i = depth2;
                        iArr = iArr;
                    }
                    color = (color & 16777215) | (iM69d2 << 24);
                } else {
                    iArrTrimStateSet = iArrTrimStateSet;
                    i = depth2;
                    iArr = iArr;
                }
                int i7 = i3 + 1;
                if (i7 > iArr2.length) {
                    int[] iArr5 = new int[aaq.m36d(i3)];
                    System.arraycopy(iArr2, 0, iArr5, 0, i3);
                    iArr2 = iArr5;
                }
                iArr2[i3] = color;
                int[][] iArr6 = iArr;
                if (i7 > iArr6.length) {
                    Object[] objArr2 = (Object[]) Array.newInstance(iArr6.getClass().getComponentType(), aaq.m36d(i3));
                    System.arraycopy(iArr6, 0, objArr2, 0, i3);
                    objArr = objArr2;
                } else {
                    objArr = iArr6;
                }
                objArr[i3] = iArrTrimStateSet;
                iArr = (int[][]) objArr;
                i3 = i7;
                depth2 = i;
                r4 = 1;
                i2 = 0;
            } else {
                iArr = iArr;
                depth2 = depth2;
                r4 = 1;
                i2 = 0;
            }
        }
        int[] iArr7 = new int[i3];
        int[][] iArr8 = new int[i3][];
        System.arraycopy(iArr2, 0, iArr7, 0, i3);
        System.arraycopy(iArr, 0, iArr8, 0, i3);
        return new ColorStateList(iArr8, iArr7);
    }
}
