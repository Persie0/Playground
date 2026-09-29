package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.core.R$attr;
import androidx.core.R$styleable;
import java.io.IOException;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class wa1 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f66559a = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public static ColorStateList m23822a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m23823b(resources, xmlResourceParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008f  */
    /* JADX INFO: renamed from: b */
    public static ColorStateList m23823b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        float f;
        resources = resources;
        String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        boolean z = true;
        int depth2 = xmlPullParser.getDepth() + 1;
        Object[] objArr = new int[20][];
        int[] iArr = new int[20];
        int i = 0;
        int i2 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == z || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                int[] iArr2 = R$styleable.ColorStateListItem;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr2) : theme.obtainStyledAttributes(attributeSet, iArr2, i, i);
                int resourceId = typedArrayObtainAttributes.getResourceId(R$styleable.ColorStateListItem_android_color, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f66559a;
                    TypedValue typedValue = (TypedValue) threadLocal.get();
                    if (typedValue == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    }
                    resources.getValue(resourceId, typedValue, z);
                    int i3 = typedValue.type;
                    if (i3 < 28 || i3 > 31) {
                        try {
                            color = m23822a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                        } catch (Exception unused) {
                            color = typedArrayObtainAttributes.getColor(R$styleable.ColorStateListItem_android_color, -65281);
                        }
                    } else {
                        color = typedArrayObtainAttributes.getColor(R$styleable.ColorStateListItem_android_color, -65281);
                    }
                } else {
                    color = typedArrayObtainAttributes.getColor(R$styleable.ColorStateListItem_android_color, -65281);
                }
                float f2 = 1.0f;
                if (typedArrayObtainAttributes.hasValue(R$styleable.ColorStateListItem_android_alpha)) {
                    f = typedArrayObtainAttributes.getFloat(R$styleable.ColorStateListItem_android_alpha, 1.0f);
                } else {
                    f = typedArrayObtainAttributes.hasValue(R$styleable.ColorStateListItem_alpha) ? typedArrayObtainAttributes.getFloat(R$styleable.ColorStateListItem_alpha, 1.0f) : 1.0f;
                }
                float f3 = (Build.VERSION.SDK_INT < 31 || !typedArrayObtainAttributes.hasValue(R$styleable.ColorStateListItem_android_lStar)) ? typedArrayObtainAttributes.getFloat(R$styleable.ColorStateListItem_lStar, -1.0f) : typedArrayObtainAttributes.getFloat(R$styleable.ColorStateListItem_android_lStar, -1.0f);
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr3 = new int[attributeCount];
                int i4 = i;
                int i5 = i4;
                while (i5 < attributeCount) {
                    float f4 = f2;
                    int attributeNameResource = attributeSet.getAttributeNameResource(i5);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R$attr.alpha && attributeNameResource != R$attr.lStar) {
                        int i6 = i4 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i5, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr3[i4] = attributeNameResource;
                        i4 = i6;
                    }
                    i5++;
                    f2 = f4;
                }
                float f5 = f2;
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr3, i4);
                boolean z2 = f3 >= 0.0f && f3 <= 100.0f;
                if (f != f5 || z2) {
                    int iM21645x = AbstractC3584sr.m21645x((int) ((Color.alpha(color) * f) + 0.5f), 0, 255);
                    if (z2) {
                        hm0 hm0VarM13325a = hm0.m13325a(color);
                        color = hm0.m13327e(hm0VarM13325a.m13329d(), hm0VarM13325a.m13328c(), f3);
                    }
                    color = (16777215 & color) | (iM21645x << 24);
                }
                int i7 = i2 + 1;
                if (i7 > iArr.length) {
                    int[] iArr4 = new int[i2 <= 4 ? 8 : i2 * 2];
                    System.arraycopy(iArr, 0, iArr4, 0, i2);
                    iArr = iArr4;
                }
                iArr[i2] = color;
                if (i7 > objArr.length) {
                    Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i2 > 4 ? i2 * 2 : 8);
                    System.arraycopy(objArr, 0, objArr2, 0, i2);
                    objArr = objArr2;
                }
                objArr[i2] = iArrTrimStateSet;
                objArr = (int[][]) objArr;
                i2 = i7;
            }
            z = true;
            i = 0;
        }
        int[] iArr5 = new int[i2];
        int[][] iArr6 = new int[i2][];
        System.arraycopy(iArr, 0, iArr5, 0, i2);
        System.arraycopy(objArr, 0, iArr6, 0, i2);
        return new ColorStateList(iArr6, iArr5);
    }
}
