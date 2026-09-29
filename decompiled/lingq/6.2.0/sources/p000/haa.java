package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public final class haa {

    /* JADX INFO: renamed from: b */
    public static final Class[] f42107b = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: c */
    public static final C3275kv f42108c = new C3275kv(0);

    /* JADX INFO: renamed from: a */
    public final Context f42109a;

    public haa(Context context) {
        this.f42109a = context;
    }

    /* JADX INFO: renamed from: a */
    public final Object m13155a(AttributeSet attributeSet, Class cls, String str) {
        Object objNewInstance;
        Class<? extends U> clsAsSubclass;
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        if (attributeValue == null) {
            throw new InflateException(str.concat(" tag must have a 'class' attribute"));
        }
        try {
            C3275kv c3275kv = f42108c;
            synchronized (c3275kv) {
                try {
                    Constructor constructor = (Constructor) c3275kv.get(attributeValue);
                    if (constructor == null && (clsAsSubclass = Class.forName(attributeValue, false, this.f42109a.getClassLoader()).asSubclass(cls)) != 0) {
                        constructor = clsAsSubclass.getConstructor(f42107b);
                        constructor.setAccessible(true);
                        c3275kv.put(attributeValue, constructor);
                    }
                    objNewInstance = constructor.newInstance(this.f42109a, attributeSet);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return objNewInstance;
        } catch (Exception e) {
            throw new InflateException("Could not instantiate " + cls + " class " + attributeValue, e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:150:0x0307  */
    /* JADX WARN: Code duplicated, block: B:152:0x030d  */
    /* JADX WARN: Code duplicated, block: B:154:0x0312  */
    /* JADX WARN: Code duplicated, block: B:155:0x0318 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:176:0x031b A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public final daa m13156b(XmlPullParser xmlPullParser, AttributeSet attributeSet, daa daaVar) throws XmlPullParserException, IOException {
        daa daaVar2;
        int depth = xmlPullParser.getDepth();
        daa daaVar3 = null;
        raa raaVar = daaVar instanceof raa ? (raa) daaVar : null;
        daa raaVar2 = null;
        while (true) {
            int next = xmlPullParser.next();
            int i = 3;
            if (next == 3 && xmlPullParser.getDepth() <= depth) {
                break;
            }
            if (next == 1) {
                break;
            }
            int i2 = 2;
            if (next == 2) {
                String name = xmlPullParser.getName();
                boolean zEquals = "fade".equals(name);
                Context context = this.f42109a;
                if (zEquals) {
                    zy2 zy2Var = new zy2(context, attributeSet);
                    TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ywc.f70607e);
                    zy2Var.m13545b0(nda.m17380d(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, zy2Var.f43081e0));
                    typedArrayObtainStyledAttributes.recycle();
                    raaVar2 = zy2Var;
                } else if ("changeBounds".equals(name)) {
                    kt0 kt0Var = new kt0(context, attributeSet);
                    kt0Var.f48403e0 = false;
                    TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, ywc.f70605c);
                    boolean z = nda.m17382f((XmlResourceParser) attributeSet, "resizeClip") ? typedArrayObtainStyledAttributes2.getBoolean(0, false) : false;
                    typedArrayObtainStyledAttributes2.recycle();
                    kt0Var.f48403e0 = z;
                    raaVar2 = kt0Var;
                } else if ("slide".equals(name)) {
                    ba9 ba9Var = new ba9(context, attributeSet);
                    z99 z99Var = ba9.f8237o0;
                    ba9Var.f8238g0 = z99Var;
                    TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, ywc.f70609g);
                    int iM17380d = nda.m17380d(typedArrayObtainStyledAttributes3, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
                    typedArrayObtainStyledAttributes3.recycle();
                    if (iM17380d == 3) {
                        ba9Var.f8238g0 = ba9.f8232j0;
                    } else if (iM17380d == 5) {
                        ba9Var.f8238g0 = ba9.f8235m0;
                    } else if (iM17380d == 48) {
                        ba9Var.f8238g0 = ba9.f8234l0;
                    } else if (iM17380d == 80) {
                        ba9Var.f8238g0 = z99Var;
                    } else if (iM17380d == 8388611) {
                        ba9Var.f8238g0 = ba9.f8233k0;
                    } else {
                        if (iM17380d != 8388613) {
                            C3386nv.m17626m("Invalid slide direction");
                            return daaVar3;
                        }
                        ba9Var.f8238g0 = ba9.f8236n0;
                    }
                    n69 n69Var = new n69();
                    n69Var.f52415b = iM17380d;
                    ba9Var.f35324V = n69Var;
                    raaVar2 = ba9Var;
                } else if ("explode".equals(name)) {
                    vw2 vw2Var = new vw2(context, attributeSet);
                    vw2Var.f66012g0 = new int[2];
                    vw2Var.f35324V = new r21();
                    raaVar2 = vw2Var;
                } else if ("changeImageTransform".equals(name)) {
                    raaVar2 = new rt0(context, attributeSet);
                } else if ("changeTransform".equals(name)) {
                    au0 au0Var = new au0(context, attributeSet);
                    au0Var.f7502e0 = true;
                    au0Var.f7503f0 = true;
                    au0Var.f7504g0 = new Matrix();
                    TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, ywc.f70608f);
                    XmlPullParser xmlPullParser2 = (XmlPullParser) attributeSet;
                    au0Var.f7502e0 = !nda.m17382f(xmlPullParser2, "reparentWithOverlay") ? true : typedArrayObtainStyledAttributes4.getBoolean(1, true);
                    au0Var.f7503f0 = nda.m17382f(xmlPullParser2, "reparent") ? typedArrayObtainStyledAttributes4.getBoolean(0, true) : true;
                    typedArrayObtainStyledAttributes4.recycle();
                    raaVar2 = au0Var;
                } else if ("changeClipBounds".equals(name)) {
                    raaVar2 = new mt0(context, attributeSet);
                } else if ("autoTransition".equals(name)) {
                    p20 p20Var = new p20(context, attributeSet);
                    p20Var.m18857c0();
                    raaVar2 = p20Var;
                } else if ("changeScroll".equals(name)) {
                    raaVar2 = new ut0(context, attributeSet);
                } else if ("transitionSet".equals(name)) {
                    raaVar2 = new raa(context, attributeSet);
                } else {
                    if ("transition".equals(name)) {
                        raaVar2 = (daa) m13155a(attributeSet, daa.class, "transition");
                    } else {
                        daaVar2 = daaVar3;
                        if ("targets".equals(name)) {
                            int depth2 = xmlPullParser.getDepth();
                            while (true) {
                                int next2 = xmlPullParser.next();
                                if ((next2 == i && xmlPullParser.getDepth() <= depth2) || next2 == 1) {
                                    break;
                                }
                                if (next2 != i2) {
                                    i = 3;
                                } else {
                                    if (!xmlPullParser.getName().equals("target")) {
                                        throw new RuntimeException("Unknown scene name: " + xmlPullParser.getName());
                                    }
                                    TypedArray typedArrayObtainStyledAttributes5 = context.obtainStyledAttributes(attributeSet, ywc.f70603a);
                                    int resourceId = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "targetId") != null ? typedArrayObtainStyledAttributes5.getResourceId(1, 0) : 0;
                                    if (resourceId != 0) {
                                        daaVar.mo10203b(resourceId);
                                    } else {
                                        int resourceId2 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "excludeId") != null ? typedArrayObtainStyledAttributes5.getResourceId(i2, 0) : 0;
                                        if (resourceId2 != 0) {
                                            daaVar.mo10214s(resourceId2);
                                        } else {
                                            String strM17381e = nda.m17381e(typedArrayObtainStyledAttributes5, xmlPullParser, "targetName", 4);
                                            if (strM17381e != null) {
                                                daaVar.mo10206e(strM17381e);
                                            } else {
                                                String strM17381e2 = nda.m17381e(typedArrayObtainStyledAttributes5, xmlPullParser, "excludeName", 5);
                                                if (strM17381e2 != null) {
                                                    daaVar.mo10216u(strM17381e2);
                                                } else {
                                                    String strM17381e3 = nda.m17381e(typedArrayObtainStyledAttributes5, xmlPullParser, "excludeClass", 3);
                                                    if (strM17381e3 != null) {
                                                        try {
                                                            daaVar.mo10215t(Class.forName(strM17381e3));
                                                        } catch (ClassNotFoundException e) {
                                                            typedArrayObtainStyledAttributes5.recycle();
                                                            ij6.m13958p(AbstractC3393o1.m17734i("Could not create ", strM17381e3), e);
                                                            return daaVar2;
                                                        }
                                                    } else {
                                                        String strM17381e4 = nda.m17381e(typedArrayObtainStyledAttributes5, xmlPullParser, "targetClass", 0);
                                                        if (strM17381e4 != null) {
                                                            daaVar.mo10205d(Class.forName(strM17381e4));
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    typedArrayObtainStyledAttributes5.recycle();
                                    i = 3;
                                    i2 = 2;
                                }
                            }
                        } else if ("arcMotion".equals(name)) {
                            if (daaVar == null) {
                                ho2.m13385e("Invalid use of arcMotion element");
                                return daaVar2;
                            }
                            C2940du c2940du = new C2940du();
                            c2940du.f36229a = 0.0f;
                            c2940du.f36230b = 0.0f;
                            c2940du.f36231c = C2940du.f36228d;
                            TypedArray typedArrayObtainStyledAttributes6 = context.obtainStyledAttributes(attributeSet, ywc.f70611i);
                            XmlPullParser xmlPullParser3 = (XmlPullParser) attributeSet;
                            c2940du.f36230b = C2940du.m10645b(!nda.m17382f(xmlPullParser3, "minimumVerticalAngle") ? 0.0f : typedArrayObtainStyledAttributes6.getFloat(1, 0.0f));
                            c2940du.f36229a = C2940du.m10645b(xmlPullParser3.getAttributeValue("http://schemas.android.com/apk/res/android", "minimumHorizontalAngle") != null ? typedArrayObtainStyledAttributes6.getFloat(0, 0.0f) : 0.0f);
                            c2940du.f36231c = C2940du.m10645b(xmlPullParser3.getAttributeValue("http://schemas.android.com/apk/res/android", "maximumAngle") != null ? typedArrayObtainStyledAttributes6.getFloat(2, 70.0f) : 70.0f);
                            typedArrayObtainStyledAttributes6.recycle();
                            daaVar.mo10197R(c2940du);
                        } else if ("pathMotion".equals(name)) {
                            if (daaVar == null) {
                                ho2.m13385e("Invalid use of pathMotion element");
                                return daaVar2;
                            }
                            daaVar.mo10197R((k57) m13155a(attributeSet, k57.class, "pathMotion"));
                        } else {
                            if (!"patternPathMotion".equals(name)) {
                                throw new RuntimeException("Unknown scene name: " + xmlPullParser.getName());
                            }
                            if (daaVar == null) {
                                ho2.m13385e("Invalid use of patternPathMotion element");
                                return daaVar2;
                            }
                            daaVar.mo10197R(new g67(context, attributeSet));
                        }
                    }
                    if (raaVar2 != null) {
                        if (!xmlPullParser.isEmptyElementTag()) {
                            m13156b(xmlPullParser, attributeSet, raaVar2);
                        }
                        if (raaVar != null) {
                            raaVar.m20494W(raaVar2);
                            raaVar2 = daaVar2;
                        } else if (daaVar != null) {
                            throw new InflateException("Could not add transition to another transition.");
                        }
                    }
                    daaVar3 = daaVar2;
                }
                daaVar2 = daaVar3;
                if (raaVar2 != null) {
                    if (!xmlPullParser.isEmptyElementTag()) {
                        m13156b(xmlPullParser, attributeSet, raaVar2);
                    }
                    if (raaVar != null) {
                        raaVar.m20494W(raaVar2);
                        raaVar2 = daaVar2;
                    } else if (daaVar != null) {
                        throw new InflateException("Could not add transition to another transition.");
                    }
                }
                daaVar3 = daaVar2;
            }
        }
        return raaVar2;
    }

    /* JADX INFO: renamed from: c */
    public final daa m13157c(int i) {
        XmlResourceParser xml = this.f42109a.getResources().getXml(i);
        try {
            try {
                daa daaVarM13156b = m13156b(xml, Xml.asAttributeSet(xml), null);
                xml.close();
                return daaVarM13156b;
            } catch (IOException e) {
                throw new InflateException(xml.getPositionDescription() + ": " + e.getMessage(), e);
            } catch (XmlPullParserException e2) {
                throw new InflateException(e2.getMessage(), e2);
            }
        } catch (Throwable th) {
            xml.close();
            throw th;
        }
    }
}
