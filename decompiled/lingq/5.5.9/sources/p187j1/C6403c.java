package p187j1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.compose.p017ui.graphics.vector.VectorPainterKt;
import androidx.compose.p017ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import cm.InterfaceC2057q;
import dm.C5207g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.text.C7076b;
import org.xmlpull.v1.XmlPullParserException;
import p081e0.AbstractC5326n0;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5336s0;
import p286o2.C7903c;
import p286o2.C7911k;
import p338qd.C8584v;
import p387t0.AbstractC9161o;
import p387t0.C9143f;
import p387t0.C9169u;
import p387t0.InterfaceC9174z;
import p444w0.AbstractC9790b;
import p444w0.C9789a;
import p469x0.AbstractC10003d;
import p469x0.C10002c;
import p469x0.C10008i;
import p469x0.C10009j;
import p469x0.C10012m;
import p495y0.C10276a;
import p495y0.C10277b;
import sl.C9072e;

/* JADX INFO: renamed from: j1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6403c {
    /* JADX WARN: Code duplicated, block: B:116:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:118:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:119:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:121:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:124:0x033c  */
    /* JADX WARN: Code duplicated, block: B:125:0x033f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0171  */
    /* JADX WARN: Code duplicated, block: B:95:0x026b  */
    /* JADX INFO: renamed from: a */
    public static final AbstractC9790b m13028a(int i10, InterfaceC0476a interfaceC0476a) {
        AbstractC9790b c9789a;
        long jM16783h;
        int i11;
        int i12;
        int i13;
        HashMap<C6402b.b, WeakReference<C6402b.a>> map;
        C6402b.b bVar;
        int i14;
        int iM19247c;
        int i15;
        int iM19247c2;
        int i16;
        int i17;
        int i18;
        interfaceC0476a.mo1622c(473971343);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        AbstractC5326n0 abstractC5326n0 = AndroidCompositionLocals_androidKt.f4084b;
        Context context = (Context) interfaceC0476a.mo1648p(abstractC5326n0);
        interfaceC0476a.mo1648p(AndroidCompositionLocals_androidKt.f4083a);
        Resources resources = ((Context) interfaceC0476a.mo1648p(abstractC5326n0)).getResources();
        C5207g.m11110e(resources, "LocalContext.current.resources");
        interfaceC0476a.mo1622c(-492369756);
        Object objMo1624d = interfaceC0476a.mo1624d();
        Object obj = InterfaceC0476a.a.f3122a;
        if (objMo1624d == obj) {
            objMo1624d = new TypedValue();
            interfaceC0476a.mo1655t(objMo1624d);
        }
        interfaceC0476a.mo1661w();
        TypedValue typedValue = (TypedValue) objMo1624d;
        int i19 = 1;
        resources.getValue(i10, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && C7076b.m14280Z2(charSequence, ".xml")) {
            interfaceC0476a.mo1622c(-738265327);
            Resources.Theme theme = context.getTheme();
            C5207g.m11110e(theme, "context.theme");
            int i20 = typedValue.changingConfigurations;
            interfaceC0476a.mo1622c(21855625);
            C6402b c6402b = (C6402b) interfaceC0476a.mo1648p(AndroidCompositionLocals_androidKt.f4085c);
            C6402b.b bVar2 = new C6402b.b(i10, theme);
            c6402b.getClass();
            HashMap<C6402b.b, WeakReference<C6402b.a>> map2 = c6402b.f36862a;
            WeakReference<C6402b.a> weakReference = map2.get(bVar2);
            C6402b.a aVar = weakReference != null ? weakReference.get() : null;
            if (aVar == null) {
                XmlResourceParser xml = resources.getXml(i10);
                C5207g.m11110e(xml, "res.getXml(id)");
                int next = xml.next();
                while (next != 2 && next != 1) {
                    next = xml.next();
                }
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!C5207g.m11106a(xml.getName(), "vector")) {
                    throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG");
                }
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                C10276a c10276a = new C10276a(xml);
                C5207g.m11110e(attributeSetAsAttributeSet, "attrs");
                TypedArray typedArrayM19249e = c10276a.m19249e(resources, theme, attributeSetAsAttributeSet, C8584v.f46029j);
                boolean zM15684b = C7911k.m15684b(typedArrayM19249e, xml, "autoMirrored", 5, false);
                c10276a.m19250f(typedArrayM19249e.getChangingConfigurations());
                float fM19246b = c10276a.m19246b(typedArrayM19249e, "viewportWidth", 7, 0.0f);
                float fM19246b2 = c10276a.m19246b(typedArrayM19249e, "viewportHeight", 8, 0.0f);
                if (fM19246b <= 0.0f) {
                    throw new XmlPullParserException(typedArrayM19249e.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
                }
                if (fM19246b2 <= 0.0f) {
                    throw new XmlPullParserException(typedArrayM19249e.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
                }
                int i21 = 3;
                float dimension = typedArrayM19249e.getDimension(3, 0.0f);
                c10276a.m19250f(typedArrayM19249e.getChangingConfigurations());
                float dimension2 = typedArrayM19249e.getDimension(2, 0.0f);
                c10276a.m19250f(typedArrayM19249e.getChangingConfigurations());
                if (typedArrayM19249e.hasValue(1)) {
                    TypedValue typedValue2 = new TypedValue();
                    typedArrayM19249e.getValue(1, typedValue2);
                    if (typedValue2.type == 2) {
                        jM16783h = C9169u.f47703f;
                    } else {
                        ColorStateList colorStateListM15685c = C7911k.m15685c(typedArrayM19249e, xml, theme);
                        c10276a.m19250f(typedArrayM19249e.getChangingConfigurations());
                        jM16783h = colorStateListM15685c != null ? C8584v.m16783h(colorStateListM15685c.getDefaultColor()) : C9169u.f47703f;
                    }
                } else {
                    jM16783h = C9169u.f47703f;
                }
                int i22 = typedArrayM19249e.getInt(6, -1);
                c10276a.m19250f(typedArrayM19249e.getChangingConfigurations());
                if (i22 == -1) {
                    i11 = 5;
                    i12 = i11;
                } else if (i22 == 3) {
                    i12 = 3;
                } else if (i22 == 5) {
                    i11 = 5;
                    i12 = i11;
                } else if (i22 != 9) {
                    switch (i22) {
                        case 14:
                            i11 = 13;
                            break;
                        case 15:
                            i11 = 14;
                            break;
                        case 16:
                            i11 = 12;
                            break;
                        default:
                            i11 = 5;
                            break;
                    }
                    i12 = i11;
                } else {
                    i12 = 9;
                }
                float f3 = dimension / resources.getDisplayMetrics().density;
                float f10 = dimension2 / resources.getDisplayMetrics().density;
                typedArrayM19249e.recycle();
                C10002c.a aVar2 = new C10002c.a(f3, f10, fM19246b, fM19246b2, jM16783h, i12, zM15684b);
                int i23 = 0;
                while (true) {
                    int i24 = (xml.getEventType() == i19 || (xml.getDepth() < i19 && xml.getEventType() == i21)) ? i19 : 0;
                    ArrayList<C10002c.a.C10679a> arrayList = aVar2.f50851i;
                    if (i24 == 0) {
                        int eventType = xml.getEventType();
                        if (eventType == 2) {
                            String name = xml.getName();
                            if (name == null) {
                                i13 = i20;
                                map = map2;
                                bVar = bVar2;
                            } else {
                                int iHashCode = name.hashCode();
                                if (iHashCode != -1649314686) {
                                    if (iHashCode != 3433509) {
                                        if (iHashCode == 98629247 && name.equals("group")) {
                                            TypedArray typedArrayM19249e2 = c10276a.m19249e(resources, theme, attributeSetAsAttributeSet, C8584v.f46030k);
                                            float fM19246b3 = c10276a.m19246b(typedArrayM19249e2, "rotation", 5, 0.0f);
                                            float f11 = typedArrayM19249e2.getFloat(1, 0.0f);
                                            c10276a.m19250f(typedArrayM19249e2.getChangingConfigurations());
                                            float f12 = typedArrayM19249e2.getFloat(2, 0.0f);
                                            c10276a.m19250f(typedArrayM19249e2.getChangingConfigurations());
                                            float fM19246b4 = c10276a.m19246b(typedArrayM19249e2, "scaleX", 3, 1.0f);
                                            float fM19246b5 = c10276a.m19246b(typedArrayM19249e2, "scaleY", 4, 1.0f);
                                            float fM19246b6 = c10276a.m19246b(typedArrayM19249e2, "translateX", 6, 0.0f);
                                            float fM19246b7 = c10276a.m19246b(typedArrayM19249e2, "translateY", 7, 0.0f);
                                            String strM19248d = c10276a.m19248d(typedArrayM19249e2, 0);
                                            String str = strM19248d == null ? "" : strM19248d;
                                            typedArrayM19249e2.recycle();
                                            aVar2.m18586a(str, fM19246b3, f11, f12, fM19246b4, fM19246b5, fM19246b6, fM19246b7, C10009j.f50944a);
                                        }
                                    } else if (name.equals("path")) {
                                        TypedArray typedArrayM19249e3 = c10276a.m19249e(resources, theme, attributeSetAsAttributeSet, C8584v.f46031l);
                                        if (!C7911k.m15692j(xml, "pathData")) {
                                            throw new IllegalArgumentException("No path data available");
                                        }
                                        String strM19248d2 = c10276a.m19248d(typedArrayM19249e3, 0);
                                        String str2 = strM19248d2 == null ? "" : strM19248d2;
                                        List<AbstractC10003d> listM18595a = C10009j.m18595a(c10276a.m19248d(typedArrayM19249e3, 2));
                                        C7903c c7903cM19245a = c10276a.m19245a(typedArrayM19249e3, theme, "fillColor", 1);
                                        map = map2;
                                        bVar = bVar2;
                                        float fM19246b8 = c10276a.m19246b(typedArrayM19249e3, "fillAlpha", 12, 1.0f);
                                        int iM19247c3 = c10276a.m19247c(typedArrayM19249e3, "strokeLineCap", 8, -1);
                                        if (iM19247c3 != 0) {
                                            if (iM19247c3 != 1) {
                                                if (iM19247c3 == 2) {
                                                    i18 = 2;
                                                }
                                                iM19247c = c10276a.m19247c(typedArrayM19249e3, "strokeLineJoin", 9, -1);
                                                if (iM19247c != 0) {
                                                    if (iM19247c != 1) {
                                                        i17 = 2;
                                                    } else {
                                                        i17 = 1;
                                                    }
                                                    i15 = i17;
                                                } else {
                                                    i15 = 0;
                                                }
                                                float fM19246b9 = c10276a.m19246b(typedArrayM19249e3, "strokeMiterLimit", 10, 1.0f);
                                                C7903c c7903cM19245a2 = c10276a.m19245a(typedArrayM19249e3, theme, "strokeColor", 3);
                                                i13 = i20;
                                                float fM19246b10 = c10276a.m19246b(typedArrayM19249e3, "strokeAlpha", 11, 1.0f);
                                                float fM19246b11 = c10276a.m19246b(typedArrayM19249e3, "strokeWidth", 4, 1.0f);
                                                float fM19246b12 = c10276a.m19246b(typedArrayM19249e3, "trimPathEnd", 6, 1.0f);
                                                float fM19246b13 = c10276a.m19246b(typedArrayM19249e3, "trimPathOffset", 7, 0.0f);
                                                float fM19246b14 = c10276a.m19246b(typedArrayM19249e3, "trimPathStart", 5, 0.0f);
                                                iM19247c2 = c10276a.m19247c(typedArrayM19249e3, "fillType", 13, 0);
                                                typedArrayM19249e3.recycle();
                                                AbstractC9161o abstractC9161oM19251a = C10277b.m19251a(c7903cM19245a);
                                                AbstractC9161o abstractC9161oM19251a2 = C10277b.m19251a(c7903cM19245a2);
                                                if (iM19247c2 == 0) {
                                                    i16 = 0;
                                                } else {
                                                    i16 = 1;
                                                }
                                                C5207g.m11111f(listM18595a, "pathData");
                                                aVar2.m18588c();
                                                arrayList.get(arrayList.size() - 1).f50863j.add(new C10012m(str2, listM18595a, i16, abstractC9161oM19251a, fM19246b8, abstractC9161oM19251a2, fM19246b10, fM19246b11, i14, i15, fM19246b9, fM19246b14, fM19246b12, fM19246b13));
                                            } else {
                                                i18 = 1;
                                            }
                                            i14 = i18;
                                            iM19247c = c10276a.m19247c(typedArrayM19249e3, "strokeLineJoin", 9, -1);
                                            if (iM19247c != 0) {
                                                if (iM19247c != 1) {
                                                    i17 = 2;
                                                } else {
                                                    i17 = 1;
                                                }
                                                i15 = i17;
                                            } else {
                                                i15 = 0;
                                            }
                                            float fM19246b15 = c10276a.m19246b(typedArrayM19249e3, "strokeMiterLimit", 10, 1.0f);
                                            C7903c c7903cM19245a3 = c10276a.m19245a(typedArrayM19249e3, theme, "strokeColor", 3);
                                            i13 = i20;
                                            float fM19246b16 = c10276a.m19246b(typedArrayM19249e3, "strokeAlpha", 11, 1.0f);
                                            float fM19246b17 = c10276a.m19246b(typedArrayM19249e3, "strokeWidth", 4, 1.0f);
                                            float fM19246b18 = c10276a.m19246b(typedArrayM19249e3, "trimPathEnd", 6, 1.0f);
                                            float fM19246b19 = c10276a.m19246b(typedArrayM19249e3, "trimPathOffset", 7, 0.0f);
                                            float fM19246b110 = c10276a.m19246b(typedArrayM19249e3, "trimPathStart", 5, 0.0f);
                                            iM19247c2 = c10276a.m19247c(typedArrayM19249e3, "fillType", 13, 0);
                                            typedArrayM19249e3.recycle();
                                            AbstractC9161o abstractC9161oM19251a3 = C10277b.m19251a(c7903cM19245a);
                                            AbstractC9161o abstractC9161oM19251a4 = C10277b.m19251a(c7903cM19245a3);
                                            if (iM19247c2 == 0) {
                                                i16 = 0;
                                            } else {
                                                i16 = 1;
                                            }
                                            C5207g.m11111f(listM18595a, "pathData");
                                            aVar2.m18588c();
                                            arrayList.get(arrayList.size() - 1).f50863j.add(new C10012m(str2, listM18595a, i16, abstractC9161oM19251a3, fM19246b8, abstractC9161oM19251a4, fM19246b16, fM19246b17, i14, i15, fM19246b15, fM19246b110, fM19246b18, fM19246b19));
                                        }
                                        i14 = 0;
                                        iM19247c = c10276a.m19247c(typedArrayM19249e3, "strokeLineJoin", 9, -1);
                                        if (iM19247c != 0) {
                                            if (iM19247c != 1) {
                                                i17 = 2;
                                            } else {
                                                i17 = 1;
                                            }
                                            i15 = i17;
                                        } else {
                                            i15 = 0;
                                        }
                                        float fM19246b111 = c10276a.m19246b(typedArrayM19249e3, "strokeMiterLimit", 10, 1.0f);
                                        C7903c c7903cM19245a4 = c10276a.m19245a(typedArrayM19249e3, theme, "strokeColor", 3);
                                        i13 = i20;
                                        float fM19246b112 = c10276a.m19246b(typedArrayM19249e3, "strokeAlpha", 11, 1.0f);
                                        float fM19246b113 = c10276a.m19246b(typedArrayM19249e3, "strokeWidth", 4, 1.0f);
                                        float fM19246b114 = c10276a.m19246b(typedArrayM19249e3, "trimPathEnd", 6, 1.0f);
                                        float fM19246b115 = c10276a.m19246b(typedArrayM19249e3, "trimPathOffset", 7, 0.0f);
                                        float fM19246b116 = c10276a.m19246b(typedArrayM19249e3, "trimPathStart", 5, 0.0f);
                                        iM19247c2 = c10276a.m19247c(typedArrayM19249e3, "fillType", 13, 0);
                                        typedArrayM19249e3.recycle();
                                        AbstractC9161o abstractC9161oM19251a5 = C10277b.m19251a(c7903cM19245a);
                                        AbstractC9161o abstractC9161oM19251a6 = C10277b.m19251a(c7903cM19245a4);
                                        if (iM19247c2 == 0) {
                                            i16 = 0;
                                        } else {
                                            i16 = 1;
                                        }
                                        C5207g.m11111f(listM18595a, "pathData");
                                        aVar2.m18588c();
                                        arrayList.get(arrayList.size() - 1).f50863j.add(new C10012m(str2, listM18595a, i16, abstractC9161oM19251a5, fM19246b8, abstractC9161oM19251a6, fM19246b112, fM19246b113, i14, i15, fM19246b111, fM19246b116, fM19246b114, fM19246b115));
                                    }
                                    i13 = i20;
                                    map = map2;
                                    bVar = bVar2;
                                } else {
                                    i13 = i20;
                                    map = map2;
                                    bVar = bVar2;
                                    if (name.equals("clip-path")) {
                                        TypedArray typedArrayM19249e4 = c10276a.m19249e(resources, theme, attributeSetAsAttributeSet, C8584v.f46019H);
                                        String strM19248d3 = c10276a.m19248d(typedArrayM19249e4, 0);
                                        String str3 = strM19248d3 == null ? "" : strM19248d3;
                                        List<AbstractC10003d> listM18595a2 = C10009j.m18595a(c10276a.m19248d(typedArrayM19249e4, 1));
                                        typedArrayM19249e4.recycle();
                                        aVar2.m18586a(str3, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, listM18595a2);
                                        i23++;
                                    }
                                }
                            }
                        } else if (eventType == i21 && C5207g.m11106a("group", xml.getName())) {
                            int i25 = i23 + 1;
                            for (int i26 = 0; i26 < i25; i26++) {
                                aVar2.m18587b();
                            }
                            i13 = i20;
                            map = map2;
                            bVar = bVar2;
                            i23 = 0;
                        } else {
                            i13 = i20;
                            map = map2;
                            bVar = bVar2;
                        }
                        xml.next();
                        i20 = i13;
                        map2 = map;
                        bVar2 = bVar;
                        i19 = 1;
                        i21 = 3;
                    } else {
                        int i27 = i20;
                        HashMap<C6402b.b, WeakReference<C6402b.a>> map3 = map2;
                        C6402b.b bVar3 = bVar2;
                        aVar2.m18588c();
                        while (arrayList.size() > 1) {
                            aVar2.m18587b();
                        }
                        String str4 = aVar2.f50843a;
                        float f13 = aVar2.f50844b;
                        float f14 = aVar2.f50845c;
                        float f15 = aVar2.f50846d;
                        float f16 = aVar2.f50847e;
                        C10002c.a.C10679a c10679a = aVar2.f50852j;
                        C10002c c10002c = new C10002c(str4, f13, f14, f15, f16, new C10008i(c10679a.f50854a, c10679a.f50855b, c10679a.f50856c, c10679a.f50857d, c10679a.f50858e, c10679a.f50859f, c10679a.f50860g, c10679a.f50861h, c10679a.f50862i, c10679a.f50863j), aVar2.f50848f, aVar2.f50849g, aVar2.f50850h);
                        aVar2.f50853k = true;
                        C6402b.a aVar3 = new C6402b.a(c10002c, i27);
                        map3.put(bVar3, new WeakReference<>(aVar3));
                        aVar = aVar3;
                    }
                }
            }
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
            interfaceC0476a.mo1661w();
            c9789a = VectorPainterKt.m2013b(aVar.f36863a, interfaceC0476a);
            interfaceC0476a.mo1661w();
        } else {
            interfaceC0476a.mo1622c(-738265172);
            Object objValueOf = Integer.valueOf(i10);
            Object theme2 = context.getTheme();
            interfaceC0476a.mo1622c(1618982084);
            boolean zMo1665y = interfaceC0476a.mo1665y(theme2) | interfaceC0476a.mo1665y(objValueOf) | interfaceC0476a.mo1665y(charSequence);
            Object objMo1624d2 = interfaceC0476a.mo1624d();
            if (zMo1665y || objMo1624d2 == obj) {
                try {
                    Drawable drawable = resources.getDrawable(i10, null);
                    C5207g.m11109d(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                    Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                    C5207g.m11110e(bitmap, "res.getDrawable(id, null…as BitmapDrawable).bitmap");
                    objMo1624d2 = new C9143f(bitmap);
                    interfaceC0476a.mo1655t(objMo1624d2);
                } catch (Throwable unused) {
                    throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG");
                }
            }
            interfaceC0476a.mo1661w();
            c9789a = new C9789a((InterfaceC9174z) objMo1624d2);
            interfaceC0476a.mo1661w();
        }
        interfaceC0476a.mo1661w();
        return c9789a;
    }
}
