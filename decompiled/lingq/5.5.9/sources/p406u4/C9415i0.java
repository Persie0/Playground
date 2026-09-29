package p406u4;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import androidx.activity.result.C0204c;
import java.io.IOException;
import java.lang.reflect.Constructor;
import org.xmlpull.v1.XmlPullParserException;
import p286o2.C7911k;
import p326q.C8446b;

/* JADX INFO: renamed from: u4.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C9415i0 {

    /* JADX INFO: renamed from: b */
    public static final Class<?>[] f48342b = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: c */
    public static final C8446b<String, Constructor<?>> f48343c = new C8446b<>();

    /* JADX INFO: renamed from: a */
    public final Context f48344a;

    public C9415i0(Context context) {
        this.f48344a = context;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final Object m17814a(AttributeSet attributeSet, Class<?> cls, String str) {
        Object objNewInstance;
        Class<? extends U> clsAsSubclass;
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        if (attributeValue == null) {
            throw new InflateException(str.concat(" tag must have a 'class' attribute"));
        }
        try {
            C8446b<String, Constructor<?>> c8446b = f48343c;
            synchronized (c8446b) {
                Constructor<?> orDefault = c8446b.getOrDefault(attributeValue, null);
                if (orDefault == null && (clsAsSubclass = Class.forName(attributeValue, false, this.f48344a.getClassLoader()).asSubclass(cls)) != 0) {
                    orDefault = clsAsSubclass.getConstructor(f48342b);
                    orDefault.setAccessible(true);
                    c8446b.put(attributeValue, orDefault);
                }
                objNewInstance = orDefault.newInstance(this.f48344a, attributeSet);
            }
            return objNewInstance;
        } catch (Exception e10) {
            throw new InflateException("Could not instantiate " + cls + " class " + attributeValue, e10);
        }
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC9409f0 m17815b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, AbstractC9409f0 abstractC9409f0) throws XmlPullParserException, IOException {
        AbstractC9409f0 c9421l0;
        int depth = xmlResourceParser.getDepth();
        C9421l0 c9421l1 = abstractC9409f0 instanceof C9421l0 ? (C9421l0) abstractC9409f0 : null;
        loop0: while (true) {
            c9421l0 = null;
            while (true) {
                int next = xmlResourceParser.next();
                int i10 = 3;
                if ((next == 3 && xmlResourceParser.getDepth() <= depth) || next == 1) {
                    break loop0;
                }
                if (next == 2) {
                    String name = xmlResourceParser.getName();
                    boolean zEquals = "fade".equals(name);
                    Context context = this.f48344a;
                    if (zEquals) {
                        c9421l0 = new C9422m(context, attributeSet);
                    } else if ("changeBounds".equals(name)) {
                        c9421l0 = new C9404d(context, attributeSet);
                    } else if ("slide".equals(name)) {
                        c9421l0 = new C9405d0(context, attributeSet);
                    } else if ("explode".equals(name)) {
                        c9421l0 = new C9418k(context, attributeSet);
                    } else if ("changeImageTransform".equals(name)) {
                        c9421l0 = new C9408f(context, attributeSet);
                    } else if ("changeTransform".equals(name)) {
                        c9421l0 = new C9412h(context, attributeSet);
                    } else if ("changeClipBounds".equals(name)) {
                        c9421l0 = new C9406e(context, attributeSet);
                    } else if ("autoTransition".equals(name)) {
                        c9421l0 = new C9400b(context, attributeSet);
                    } else if ("changeScroll".equals(name)) {
                        c9421l0 = new C9410g(context, attributeSet);
                    } else if ("transitionSet".equals(name)) {
                        c9421l0 = new C9421l0(context, attributeSet);
                    } else if ("transition".equals(name)) {
                        c9421l0 = (AbstractC9409f0) m17814a(attributeSet, AbstractC9409f0.class, "transition");
                    } else if ("targets".equals(name)) {
                        int depth2 = xmlResourceParser.getDepth();
                        while (true) {
                            int next2 = xmlResourceParser.next();
                            if ((next2 == i10 && xmlResourceParser.getDepth() <= depth2) || next2 == 1) {
                                break;
                            }
                            if (next2 == 2) {
                                if (!xmlResourceParser.getName().equals("target")) {
                                    throw new RuntimeException("Unknown scene name: " + xmlResourceParser.getName());
                                }
                                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9407e0.f48260a);
                                int iM15689g = C7911k.m15689g(typedArrayObtainStyledAttributes, xmlResourceParser, "targetId", 1);
                                if (iM15689g != 0) {
                                    abstractC9409f0.mo17792c(iM15689g);
                                } else {
                                    int iM15689g2 = C7911k.m15689g(typedArrayObtainStyledAttributes, xmlResourceParser, "excludeId", 2);
                                    if (iM15689g2 != 0) {
                                        abstractC9409f0.mo17803t(iM15689g2);
                                    } else {
                                        String strM15690h = C7911k.m15690h(typedArrayObtainStyledAttributes, xmlResourceParser, "targetName", 4);
                                        if (strM15690h != null) {
                                            abstractC9409f0.mo17795f(strM15690h);
                                        } else {
                                            String strM15690h2 = C7911k.m15690h(typedArrayObtainStyledAttributes, xmlResourceParser, "excludeName", 5);
                                            if (strM15690h2 != null) {
                                                abstractC9409f0.mo17805v(strM15690h2);
                                            } else {
                                                String strM15690h3 = C7911k.m15690h(typedArrayObtainStyledAttributes, xmlResourceParser, "excludeClass", i10);
                                                if (strM15690h3 != null) {
                                                    try {
                                                        abstractC9409f0.mo17804u(Class.forName(strM15690h3));
                                                    } catch (ClassNotFoundException e10) {
                                                        typedArrayObtainStyledAttributes.recycle();
                                                        throw new RuntimeException(C0204c.m852k("Could not create ", strM15690h3), e10);
                                                    }
                                                } else {
                                                    String strM15690h4 = C7911k.m15690h(typedArrayObtainStyledAttributes, xmlResourceParser, "targetClass", 0);
                                                    if (strM15690h4 != null) {
                                                        abstractC9409f0.mo17794e(Class.forName(strM15690h4));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                typedArrayObtainStyledAttributes.recycle();
                                i10 = 3;
                            }
                        }
                    } else if ("arcMotion".equals(name)) {
                        if (abstractC9409f0 == null) {
                            throw new RuntimeException("Invalid use of arcMotion element");
                        }
                        abstractC9409f0.mo17786M(new C9397a(context, attributeSet));
                    } else if ("pathMotion".equals(name)) {
                        if (abstractC9409f0 == null) {
                            throw new RuntimeException("Invalid use of pathMotion element");
                        }
                        abstractC9409f0.mo17786M((AbstractC9446y) m17814a(attributeSet, AbstractC9446y.class, "pathMotion"));
                    } else {
                        if (!"patternPathMotion".equals(name)) {
                            throw new RuntimeException("Unknown scene name: " + xmlResourceParser.getName());
                        }
                        if (abstractC9409f0 == null) {
                            throw new RuntimeException("Invalid use of patternPathMotion element");
                        }
                        abstractC9409f0.mo17786M(new C9448z(context, attributeSet));
                    }
                    if (c9421l0 == null) {
                        continue;
                    } else {
                        if (!xmlResourceParser.isEmptyElementTag()) {
                            m17815b(xmlResourceParser, attributeSet, c9421l0);
                        }
                        if (c9421l1 != null) {
                            break;
                        }
                        if (abstractC9409f0 != null) {
                            throw new InflateException("Could not add transition to another transition.");
                        }
                    }
                }
            }
            c9421l1.m17821S(c9421l0);
        }
        return c9421l0;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC9409f0 m17816c(int i10) {
        XmlResourceParser xml = this.f48344a.getResources().getXml(i10);
        try {
            try {
                AbstractC9409f0 abstractC9409f0M17815b = m17815b(xml, Xml.asAttributeSet(xml), null);
                xml.close();
                return abstractC9409f0M17815b;
            } catch (IOException e10) {
                throw new InflateException(xml.getPositionDescription() + ": " + e10.getMessage(), e10);
            } catch (XmlPullParserException e11) {
                throw new InflateException(e11.getMessage(), e11);
            }
        } catch (Throwable th2) {
            xml.close();
            throw th2;
        }
    }
}
