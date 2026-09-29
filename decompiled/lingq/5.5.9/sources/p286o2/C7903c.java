package p286o2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;
import p211k2.C6578a;

/* JADX INFO: renamed from: o2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C7903c {

    /* JADX INFO: renamed from: a */
    public final Shader f43040a;

    /* JADX INFO: renamed from: b */
    public final ColorStateList f43041b;

    /* JADX INFO: renamed from: c */
    public int f43042c;

    public C7903c(Shader shader, ColorStateList colorStateList, int i10) {
        this.f43040a = shader;
        this.f43041b = colorStateList;
        this.f43042c = i10;
    }

    /* JADX INFO: renamed from: a */
    public static C7903c m15668a(Resources resources, int i10, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        float f3;
        float f10;
        Shader radialGradient;
        Shader.TileMode tileMode;
        Shader.TileMode tileMode2;
        XmlResourceParser xml = resources.getXml(i10);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListM15667b = C7902b.m15667b(resources, xml, attributeSetAsAttributeSet, theme);
                return new C7903c(null, colorStateListM15667b, colorStateListM15667b.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayM15693k = C7911k.m15693k(resources, theme, attributeSetAsAttributeSet, C6578a.f37401d);
        float fM15687e = C7911k.m15687e(typedArrayM15693k, xml, "startX", 8, 0.0f);
        float fM15687e2 = C7911k.m15687e(typedArrayM15693k, xml, "startY", 9, 0.0f);
        float fM15687e3 = C7911k.m15687e(typedArrayM15693k, xml, "endX", 10, 0.0f);
        float fM15687e4 = C7911k.m15687e(typedArrayM15693k, xml, "endY", 11, 0.0f);
        float fM15687e5 = C7911k.m15687e(typedArrayM15693k, xml, "centerX", 3, 0.0f);
        float fM15687e6 = C7911k.m15687e(typedArrayM15693k, xml, "centerY", 4, 0.0f);
        int iM15688f = C7911k.m15688f(typedArrayM15693k, xml, "type", 2, 0);
        int color = !C7911k.m15692j(xml, "startColor") ? 0 : typedArrayM15693k.getColor(0, 0);
        boolean zM15692j = C7911k.m15692j(xml, "centerColor");
        int color2 = !C7911k.m15692j(xml, "centerColor") ? 0 : typedArrayM15693k.getColor(7, 0);
        int color3 = !C7911k.m15692j(xml, "endColor") ? 0 : typedArrayM15693k.getColor(1, 0);
        int iM15688f2 = C7911k.m15688f(typedArrayM15693k, xml, "tileMode", 6, 0);
        float fM15687e7 = C7911k.m15687e(typedArrayM15693k, xml, "gradientRadius", 5, 0.0f);
        typedArrayM15693k.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f3 = fM15687e3;
            if (next2 == 1) {
                f10 = fM15687e2;
                break;
            }
            int depth2 = xml.getDepth();
            f10 = fM15687e2;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray typedArrayM15693k2 = C7911k.m15693k(resources, theme, attributeSetAsAttributeSet, C6578a.f37402e);
                boolean zHasValue = typedArrayM15693k2.hasValue(0);
                boolean zHasValue2 = typedArrayM15693k2.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArrayM15693k2.getColor(0, 0);
                float f11 = typedArrayM15693k2.getFloat(1, 0.0f);
                typedArrayM15693k2.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f11));
            }
            fM15687e3 = f3;
            fM15687e2 = f10;
        }
        C7905e c7905e = arrayList2.size() > 0 ? new C7905e(arrayList2, arrayList) : null;
        if (c7905e == null) {
            c7905e = zM15692j ? new C7905e(color, color2, color3) : new C7905e(color, color3);
        }
        if (iM15688f != 1) {
            if (iM15688f != 2) {
                int[] iArr = c7905e.f43054a;
                float[] fArr = c7905e.f43055b;
                if (iM15688f2 != 1) {
                    tileMode2 = iM15688f2 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
                } else {
                    tileMode2 = Shader.TileMode.REPEAT;
                }
                radialGradient = new LinearGradient(fM15687e, f10, f3, fM15687e4, iArr, fArr, tileMode2);
            } else {
                radialGradient = new SweepGradient(fM15687e5, fM15687e6, c7905e.f43054a, c7905e.f43055b);
            }
        } else {
            if (fM15687e7 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            int[] iArr2 = c7905e.f43054a;
            float[] fArr2 = c7905e.f43055b;
            if (iM15688f2 != 1) {
                tileMode = iM15688f2 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode = Shader.TileMode.REPEAT;
            }
            radialGradient = new RadialGradient(fM15687e5, fM15687e6, fM15687e7, iArr2, fArr2, tileMode);
        }
        return new C7903c(radialGradient, null, 0);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m15669b() {
        ColorStateList colorStateList;
        return this.f43040a == null && (colorStateList = this.f43041b) != null && colorStateList.isStateful();
    }
}
