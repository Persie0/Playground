package p040c4;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.activity.result.C0204c;
import androidx.navigation.ActivityNavigator;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import com.kochava.core.BuildConfig;
import dm.C5207g;
import java.io.IOException;
import java.io.Serializable;
import mo.C7661i;
import org.xmlpull.v1.XmlPullParserException;
import p063d4.C5043a;
import sl.C9072e;

/* JADX INFO: renamed from: c4.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1689n {

    /* JADX INFO: renamed from: c */
    public static final ThreadLocal<TypedValue> f9422c = new ThreadLocal<>();

    /* JADX INFO: renamed from: a */
    public final Context f9423a;

    /* JADX INFO: renamed from: b */
    public final C1694s f9424b;

    /* JADX INFO: renamed from: c4.n$a */
    public static final class a {
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public static AbstractC1692q m5418a(TypedValue typedValue, AbstractC1692q abstractC1692q, AbstractC1692q abstractC1692q2, String str, String str2) throws XmlPullParserException {
            if (abstractC1692q == null || abstractC1692q == abstractC1692q2) {
                if (abstractC1692q == null) {
                    abstractC1692q = abstractC1692q2;
                }
                return abstractC1692q;
            }
            StringBuilder sbM855o = C0204c.m855o("Type is ", str, " but found ", str2, ": ");
            sbM855o.append(typedValue.data);
            throw new XmlPullParserException(sbM855o.toString());
        }
    }

    public C1689n(Context context, C1694s c1694s) {
        C5207g.m11111f(context, "context");
        C5207g.m11111f(c1694s, "navigatorProvider");
        this.f9423a = context;
        this.f9424b = c1694s;
    }

    /* JADX WARN: Code duplicated, block: B:189:0x034d  */
    /* JADX WARN: Code duplicated, block: B:191:0x0357  */
    /* JADX WARN: Code duplicated, block: B:193:0x036a  */
    /* JADX WARN: Code duplicated, block: B:195:0x0376  */
    /* JADX WARN: Code duplicated, block: B:196:0x037b  */
    /* JADX WARN: Code duplicated, block: B:198:0x0383  */
    /* JADX WARN: Code duplicated, block: B:200:0x0387  */
    /* JADX WARN: Code duplicated, block: B:201:0x0392  */
    /* JADX WARN: Code duplicated, block: B:203:0x0396  */
    /* JADX WARN: Code duplicated, block: B:204:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:206:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:207:0x03b0  */
    /* JADX WARN: Instruction removed from duplicated block: B:207:0x03b0, please report this as an issue */
    /* JADX INFO: renamed from: c */
    public static C1683h m5415c(TypedArray typedArray, Resources resources, int i10) throws XmlPullParserException {
        boolean z10;
        AbstractC1692q.e eVar;
        AbstractC1692q.h hVar;
        AbstractC1692q pVar;
        Class cls;
        AbstractC1692q.h hVar2;
        boolean z11;
        Object objMo5423e;
        AbstractC1692q abstractC1692q;
        Class<?> componentType;
        Class<?> componentType2;
        AbstractC1692q abstractC1692qM5418a;
        Object objValueOf;
        int i11;
        boolean z12 = typedArray.getBoolean(3, false);
        ThreadLocal<TypedValue> threadLocal = f9422c;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(2);
        AbstractC1692q abstractC1692qM5418a2 = AbstractC1692q.f9443c;
        AbstractC1692q.c cVar = AbstractC1692q.f9448h;
        AbstractC1692q.j jVar = AbstractC1692q.f9452l;
        AbstractC1692q.a aVar = AbstractC1692q.f9450j;
        AbstractC1692q.g gVar = AbstractC1692q.f9446f;
        AbstractC1692q.e eVar2 = AbstractC1692q.f9444d;
        AbstractC1692q.h hVar3 = AbstractC1692q.f9445e;
        AbstractC1692q.k kVar = AbstractC1692q.f9451k;
        AbstractC1692q.b bVar = AbstractC1692q.f9449i;
        AbstractC1692q pVar2 = AbstractC1692q.f9447g;
        AbstractC1692q.f fVar = AbstractC1692q.f9442b;
        if (string != null) {
            eVar = eVar2;
            String resourcePackageName = resources.getResourcePackageName(i10);
            if (C5207g.m11106a("integer", string)) {
                z10 = z12;
                pVar = fVar;
            } else {
                z10 = z12;
                if (C5207g.m11106a("integer[]", string)) {
                    pVar = eVar;
                } else if (C5207g.m11106a("long", string)) {
                    pVar = hVar3;
                } else if (C5207g.m11106a("long[]", string)) {
                    pVar = gVar;
                } else if (C5207g.m11106a("boolean", string)) {
                    pVar = bVar;
                } else if (C5207g.m11106a("boolean[]", string)) {
                    pVar = aVar;
                } else if (C5207g.m11106a("string", string)) {
                    pVar = kVar;
                } else if (C5207g.m11106a("string[]", string)) {
                    pVar = jVar;
                } else if (C5207g.m11106a("float", string)) {
                    pVar = pVar2;
                } else if (C5207g.m11106a("float[]", string)) {
                    pVar = cVar;
                } else if (C5207g.m11106a("reference", string)) {
                    pVar = abstractC1692qM5418a2;
                } else {
                    if (string.length() == 0) {
                        hVar = hVar3;
                        pVar = kVar;
                    } else {
                        try {
                            hVar = hVar3;
                            String strConcat = (!C7661i.m15256V2(string, ".", false) || resourcePackageName == null) ? string : resourcePackageName.concat(string);
                            if (C7661i.m15248N2(string, BuildConfig.SDK_PERMISSIONS)) {
                                strConcat = strConcat.substring(0, strConcat.length() - 2);
                                C5207g.m11110e(strConcat, "this as java.lang.String…ing(startIndex, endIndex)");
                                Class<?> cls2 = Class.forName(strConcat);
                                if (!Parcelable.class.isAssignableFrom(cls2)) {
                                    if (Serializable.class.isAssignableFrom(cls2)) {
                                        pVar = new AbstractC1692q.o(cls2);
                                    }
                                    throw new IllegalArgumentException(strConcat + " is not Serializable or Parcelable.");
                                }
                                pVar = new AbstractC1692q.m(cls2);
                            } else {
                                Class<?> cls3 = Class.forName(strConcat);
                                if (Parcelable.class.isAssignableFrom(cls3)) {
                                    pVar = new AbstractC1692q.n(cls3);
                                } else {
                                    if (!Enum.class.isAssignableFrom(cls3)) {
                                        if (Serializable.class.isAssignableFrom(cls3)) {
                                            pVar = new AbstractC1692q.p(cls3);
                                        }
                                        throw new IllegalArgumentException(strConcat + " is not Serializable or Parcelable.");
                                    }
                                    pVar = new AbstractC1692q.l(cls3);
                                }
                            }
                        } catch (ClassNotFoundException e10) {
                            throw new RuntimeException(e10);
                        }
                    }
                }
            }
            hVar = hVar3;
        } else {
            z10 = z12;
            eVar = eVar2;
            hVar = hVar3;
            pVar = null;
        }
        if (typedArray.getValue(1, typedValue)) {
            cls = Serializable.class;
            if (pVar == abstractC1692qM5418a2) {
                int i12 = typedValue.resourceId;
                if (i12 != 0) {
                    i11 = i12;
                } else {
                    if (typedValue.type != 16 || typedValue.data != 0) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + pVar.mo5420b() + ". Must be a reference to a resource.");
                    }
                    i11 = 0;
                }
                objMo5423e = Integer.valueOf(i11);
                z11 = true;
            } else {
                int i13 = typedValue.resourceId;
                if (i13 != 0) {
                    if (pVar != null) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + pVar.mo5420b() + ". You must use a \"reference\" type to reference other resources.");
                    }
                    objMo5423e = Integer.valueOf(i13);
                    hVar2 = hVar;
                    z11 = true;
                } else if (pVar == kVar) {
                    z11 = true;
                    objMo5423e = typedArray.getString(1);
                } else {
                    z11 = true;
                    int i14 = typedValue.type;
                    if (i14 != 3) {
                        if (i14 == 4) {
                            abstractC1692qM5418a = a.m5418a(typedValue, pVar, pVar2, string, "float");
                            objValueOf = Float.valueOf(typedValue.getFloat());
                        } else if (i14 == 5) {
                            abstractC1692qM5418a = a.m5418a(typedValue, pVar, fVar, string, "dimension");
                            objValueOf = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                        } else if (i14 == 18) {
                            abstractC1692qM5418a = a.m5418a(typedValue, pVar, bVar, string, "boolean");
                            objValueOf = Boolean.valueOf(typedValue.data != 0);
                        } else {
                            if (i14 < 16 || i14 > 31) {
                                throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                            }
                            if (pVar == pVar2) {
                                abstractC1692qM5418a2 = a.m5418a(typedValue, pVar, pVar2, string, "float");
                                objMo5423e = Float.valueOf(typedValue.data);
                            } else {
                                abstractC1692qM5418a = a.m5418a(typedValue, pVar, fVar, string, "integer");
                                objValueOf = Integer.valueOf(typedValue.data);
                            }
                            hVar2 = hVar;
                        }
                        abstractC1692qM5418a2 = abstractC1692qM5418a;
                        objMo5423e = objValueOf;
                        hVar2 = hVar;
                    } else {
                        String string2 = typedValue.string.toString();
                        if (pVar == null) {
                            C5207g.m11111f(string2, "value");
                            try {
                                fVar.mo5423e(string2);
                                pVar = fVar;
                                hVar2 = hVar;
                            } catch (IllegalArgumentException unused) {
                                hVar2 = hVar;
                                try {
                                    try {
                                        try {
                                            hVar2.mo5423e(string2);
                                            pVar = hVar2;
                                        } catch (IllegalArgumentException unused2) {
                                            bVar.mo5423e(string2);
                                            pVar = bVar;
                                        }
                                    } catch (IllegalArgumentException unused3) {
                                        pVar2.mo5423e(string2);
                                        pVar = pVar2;
                                    }
                                } catch (IllegalArgumentException unused4) {
                                    pVar = kVar;
                                }
                            }
                        } else {
                            hVar2 = hVar;
                        }
                        abstractC1692qM5418a2 = pVar;
                        objMo5423e = abstractC1692qM5418a2.mo5423e(string2);
                    }
                }
            }
            abstractC1692qM5418a2 = pVar;
            hVar2 = hVar;
        } else {
            cls = Serializable.class;
            hVar2 = hVar;
            z11 = true;
            abstractC1692qM5418a2 = pVar;
            objMo5423e = null;
        }
        if (objMo5423e == null) {
            objMo5423e = null;
            z11 = false;
        }
        AbstractC1692q abstractC1692q2 = abstractC1692qM5418a2 != null ? abstractC1692qM5418a2 : null;
        if (abstractC1692q2 != null) {
            abstractC1692q = abstractC1692q2;
        } else if (objMo5423e instanceof Integer) {
            abstractC1692q = fVar;
        } else if (objMo5423e instanceof int[]) {
            abstractC1692q = eVar;
        } else if (objMo5423e instanceof Long) {
            abstractC1692q = hVar2;
        } else if (objMo5423e instanceof long[]) {
            abstractC1692q = gVar;
        } else if (objMo5423e instanceof Float) {
            abstractC1692q = pVar2;
        } else if (objMo5423e instanceof float[]) {
            abstractC1692q = cVar;
        } else if (objMo5423e instanceof Boolean) {
            abstractC1692q = bVar;
        } else if (objMo5423e instanceof boolean[]) {
            abstractC1692q = aVar;
        } else if ((objMo5423e instanceof String) || objMo5423e == null) {
            abstractC1692q = kVar;
        } else if ((objMo5423e instanceof Object[]) && (((Object[]) objMo5423e) instanceof String[])) {
            abstractC1692q = jVar;
        } else {
            if (objMo5423e.getClass().isArray()) {
                Class<?> componentType3 = objMo5423e.getClass().getComponentType();
                C5207g.m11108c(componentType3);
                if (Parcelable.class.isAssignableFrom(componentType3)) {
                    Class<?> componentType4 = objMo5423e.getClass().getComponentType();
                    if (componentType4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                    }
                    pVar2 = new AbstractC1692q.m(componentType4);
                } else if (objMo5423e.getClass().isArray()) {
                    componentType = objMo5423e.getClass().getComponentType();
                    C5207g.m11108c(componentType);
                    if (cls.isAssignableFrom(componentType)) {
                        componentType2 = objMo5423e.getClass().getComponentType();
                        if (componentType2 != null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                        }
                        pVar2 = new AbstractC1692q.o(componentType2);
                    } else if (objMo5423e instanceof Parcelable) {
                        pVar2 = new AbstractC1692q.n(objMo5423e.getClass());
                    } else if (objMo5423e instanceof Enum) {
                        pVar2 = new AbstractC1692q.l(objMo5423e.getClass());
                    } else {
                        if (objMo5423e instanceof Serializable) {
                            throw new IllegalArgumentException("Object of type " + objMo5423e.getClass().getName() + " is not supported for navigation arguments.");
                        }
                        pVar2 = new AbstractC1692q.p(objMo5423e.getClass());
                    }
                } else if (objMo5423e instanceof Parcelable) {
                    pVar2 = new AbstractC1692q.n(objMo5423e.getClass());
                } else if (objMo5423e instanceof Enum) {
                    pVar2 = new AbstractC1692q.l(objMo5423e.getClass());
                } else {
                    if (objMo5423e instanceof Serializable) {
                        throw new IllegalArgumentException("Object of type " + objMo5423e.getClass().getName() + " is not supported for navigation arguments.");
                    }
                    pVar2 = new AbstractC1692q.p(objMo5423e.getClass());
                }
            } else if (objMo5423e.getClass().isArray()) {
                componentType = objMo5423e.getClass().getComponentType();
                C5207g.m11108c(componentType);
                if (cls.isAssignableFrom(componentType)) {
                    componentType2 = objMo5423e.getClass().getComponentType();
                    if (componentType2 != null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                    }
                    pVar2 = new AbstractC1692q.o(componentType2);
                } else if (objMo5423e instanceof Parcelable) {
                    pVar2 = new AbstractC1692q.n(objMo5423e.getClass());
                } else if (objMo5423e instanceof Enum) {
                    pVar2 = new AbstractC1692q.l(objMo5423e.getClass());
                } else {
                    if (objMo5423e instanceof Serializable) {
                        throw new IllegalArgumentException("Object of type " + objMo5423e.getClass().getName() + " is not supported for navigation arguments.");
                    }
                    pVar2 = new AbstractC1692q.p(objMo5423e.getClass());
                }
            } else if (objMo5423e instanceof Parcelable) {
                pVar2 = new AbstractC1692q.n(objMo5423e.getClass());
            } else if (objMo5423e instanceof Enum) {
                pVar2 = new AbstractC1692q.l(objMo5423e.getClass());
            } else {
                if (objMo5423e instanceof Serializable) {
                    throw new IllegalArgumentException("Object of type " + objMo5423e.getClass().getName() + " is not supported for navigation arguments.");
                }
                pVar2 = new AbstractC1692q.p(objMo5423e.getClass());
            }
            abstractC1692q = pVar2;
        }
        return new C1683h(abstractC1692q, z10, objMo5423e, z11);
    }

    /* JADX INFO: renamed from: a */
    public final NavDestination m5416a(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i10) throws XmlPullParserException, IOException {
        int depth;
        String strM15254T2;
        String strM15254T3;
        String strM15254T4;
        Context context;
        int i11;
        int i12;
        C1689n c1689n;
        int depth2;
        C1689n c1689n2 = this;
        int i13 = i10;
        String name = xmlResourceParser.getName();
        C5207g.m11110e(name, "parser.name");
        NavDestination navDestinationMo3971a = c1689n2.f9424b.mo5414b(name).mo3971a();
        Context context2 = c1689n2.f9423a;
        navDestinationMo3971a.mo3974p(context2, attributeSet);
        int i14 = 1;
        int depth3 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == i14 || ((depth = xmlResourceParser.getDepth()) < depth3 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth3) {
                String name2 = xmlResourceParser.getName();
                boolean zM11106a = C5207g.m11106a("argument", name2);
                int[] iArr = C5043a.f32875b;
                if (zM11106a) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, iArr);
                    C5207g.m11110e(typedArrayObtainAttributes, "res.obtainAttributes(att… R.styleable.NavArgument)");
                    String string = typedArrayObtainAttributes.getString(0);
                    if (string == null) {
                        throw new XmlPullParserException("Arguments must have a name");
                    }
                    navDestinationMo3971a.f6833g.put(string, m5415c(typedArrayObtainAttributes, resources, i13));
                    C9072e c9072e = C9072e.f47360a;
                    typedArrayObtainAttributes.recycle();
                } else if (C5207g.m11106a("deepLink", name2)) {
                    TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(attributeSet, C5043a.f32876c);
                    C5207g.m11110e(typedArrayObtainAttributes2, "res.obtainAttributes(att… R.styleable.NavDeepLink)");
                    String string2 = typedArrayObtainAttributes2.getString(3);
                    String string3 = typedArrayObtainAttributes2.getString(i14);
                    String string4 = typedArrayObtainAttributes2.getString(2);
                    if (((string2 == null || string2.length() == 0) ? i14 : 0) != 0) {
                        if (((string3 == null || string3.length() == 0) ? i14 : 0) != 0) {
                            if (((string4 == null || string4.length() == 0) ? i14 : 0) != 0) {
                                throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
                            }
                        }
                    }
                    if (string2 != null) {
                        String packageName = context2.getPackageName();
                        C5207g.m11110e(packageName, "context.packageName");
                        strM15254T2 = C7661i.m15254T2(string2, "${applicationId}", packageName);
                    } else {
                        strM15254T2 = null;
                    }
                    if (((string3 == null || string3.length() == 0) ? i14 : 0) == 0) {
                        String packageName2 = context2.getPackageName();
                        C5207g.m11110e(packageName2, "context.packageName");
                        strM15254T3 = C7661i.m15254T2(string3, "${applicationId}", packageName2);
                        if ((strM15254T3.length() > 0 ? i14 : 0) == 0) {
                            throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.".toString());
                        }
                    } else {
                        strM15254T3 = null;
                    }
                    if (string4 != null) {
                        String packageName3 = context2.getPackageName();
                        C5207g.m11110e(packageName3, "context.packageName");
                        strM15254T4 = C7661i.m15254T2(string4, "${applicationId}", packageName3);
                    } else {
                        strM15254T4 = null;
                    }
                    navDestinationMo3971a.m4013a(new NavDeepLink(strM15254T2, strM15254T3, strM15254T4));
                    C9072e c9072e2 = C9072e.f47360a;
                    typedArrayObtainAttributes2.recycle();
                } else {
                    if (C5207g.m11106a("action", name2)) {
                        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C5043a.f32874a, 0, 0);
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                        C1679d c1679d = new C1679d(typedArrayObtainStyledAttributes.getResourceId(i14, 0));
                        c1679d.f9400b = new C1690o(typedArrayObtainStyledAttributes.getBoolean(4, false), typedArrayObtainStyledAttributes.getBoolean(10, false), typedArrayObtainStyledAttributes.getResourceId(7, -1), typedArrayObtainStyledAttributes.getBoolean(8, false), typedArrayObtainStyledAttributes.getBoolean(9, false), typedArrayObtainStyledAttributes.getResourceId(2, -1), typedArrayObtainStyledAttributes.getResourceId(3, -1), typedArrayObtainStyledAttributes.getResourceId(5, -1), typedArrayObtainStyledAttributes.getResourceId(6, -1));
                        Bundle bundle = new Bundle();
                        context = context2;
                        int i15 = 1;
                        int depth4 = xmlResourceParser.getDepth() + 1;
                        i11 = depth3;
                        while (true) {
                            int next2 = xmlResourceParser.next();
                            if (next2 == i15 || ((depth2 = xmlResourceParser.getDepth()) < depth4 && next2 == 3)) {
                                break;
                            }
                            if (next2 == 2 && depth2 <= depth4 && C5207g.m11106a("argument", xmlResourceParser.getName())) {
                                TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(attributeSet, iArr);
                                C5207g.m11110e(typedArrayObtainAttributes3, "res.obtainAttributes(att… R.styleable.NavArgument)");
                                String string5 = typedArrayObtainAttributes3.getString(0);
                                if (string5 == null) {
                                    throw new XmlPullParserException("Arguments must have a name");
                                }
                                C1683h c1683hM5415c = m5415c(typedArrayObtainAttributes3, resources, i13);
                                boolean z10 = c1683hM5415c.f9409c;
                                if (z10 && z10) {
                                    c1683hM5415c.f9407a.mo5422d(bundle, string5, c1683hM5415c.f9410d);
                                }
                                C9072e c9072e3 = C9072e.f47360a;
                                typedArrayObtainAttributes3.recycle();
                            }
                            i15 = 1;
                            i13 = i10;
                        }
                        if (!bundle.isEmpty()) {
                            c1679d.f9401c = bundle;
                        }
                        i12 = 1;
                        if (!(!(navDestinationMo3971a instanceof ActivityNavigator.C1068a))) {
                            throw new UnsupportedOperationException("Cannot add action " + resourceId + " to " + navDestinationMo3971a + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
                        }
                        if (!(resourceId != 0)) {
                            throw new IllegalArgumentException("Cannot have an action with actionId 0".toString());
                        }
                        navDestinationMo3971a.f6832f.m16536g(resourceId, c1679d);
                        typedArrayObtainStyledAttributes.recycle();
                        c1689n = this;
                    } else {
                        context = context2;
                        i11 = depth3;
                        i12 = i14;
                        if (C5207g.m11106a("include", name2) && (navDestinationMo3971a instanceof NavGraph)) {
                            TypedArray typedArrayObtainAttributes4 = resources.obtainAttributes(attributeSet, C1697v.f9470c);
                            C5207g.m11110e(typedArrayObtainAttributes4, "res.obtainAttributes(att…n.R.styleable.NavInclude)");
                            c1689n = this;
                            ((NavGraph) navDestinationMo3971a).m4023q(c1689n.m5417b(typedArrayObtainAttributes4.getResourceId(0, 0)));
                            C9072e c9072e4 = C9072e.f47360a;
                            typedArrayObtainAttributes4.recycle();
                        } else {
                            c1689n = this;
                            if (navDestinationMo3971a instanceof NavGraph) {
                                ((NavGraph) navDestinationMo3971a).m4023q(m5416a(resources, xmlResourceParser, attributeSet, i10));
                            }
                        }
                    }
                    c1689n2 = c1689n;
                    context2 = context;
                    depth3 = i11;
                    i14 = i12;
                    i13 = i10;
                }
            }
        }
        return navDestinationMo3971a;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @SuppressLint({"ResourceType"})
    /* JADX INFO: renamed from: b */
    public final NavGraph m5417b(int i10) {
        int next;
        Resources resources = this.f9423a.getResources();
        XmlResourceParser xml = resources.getXml(i10);
        C5207g.m11110e(xml, "res.getXml(graphResId)");
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e10) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i10) + " line " + xml.getLineNumber(), e10);
                }
            } catch (Throwable th2) {
                xml.close();
                throw th2;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        C5207g.m11110e(attributeSetAsAttributeSet, "attrs");
        NavDestination navDestinationM5416a = m5416a(resources, xml, attributeSetAsAttributeSet, i10);
        if (navDestinationM5416a instanceof NavGraph) {
            NavGraph navGraph = (NavGraph) navDestinationM5416a;
            xml.close();
            return navGraph;
        }
        throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
    }
}
