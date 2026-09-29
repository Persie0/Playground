package p000;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.navigation.common.R$styleable;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.Pair;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class vd6 {

    /* JADX INFO: renamed from: c */
    public static final ThreadLocal f65233c = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public final Context f65234a;

    /* JADX INFO: renamed from: b */
    public final lj6 f65235b;

    public vd6(Context context, lj6 lj6Var) {
        lj6Var.getClass();
        this.f65234a = context;
        this.f65235b = lj6Var;
    }

    /* JADX WARN: Code duplicated, block: B:205:0x036e  */
    /* JADX WARN: Code duplicated, block: B:207:0x0378  */
    /* JADX WARN: Code duplicated, block: B:209:0x0389  */
    /* JADX WARN: Code duplicated, block: B:210:0x039a  */
    /* JADX WARN: Code duplicated, block: B:212:0x039e  */
    /* JADX WARN: Code duplicated, block: B:213:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:215:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:216:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:218:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:219:0x03c4  */
    /* JADX INFO: renamed from: c */
    public static x76 m23232c(TypedArray typedArray, Resources resources, int i) throws XmlPullParserException {
        boolean z;
        gf0 gf0Var;
        ff0 ff0Var;
        de6 de6Var;
        gf0 gf0Var2;
        boolean z2;
        Object objMo303d;
        boolean z3;
        de6 ce6Var;
        Class<?> componentType;
        de6 be6Var;
        boolean z4 = typedArray.getBoolean(R$styleable.NavArgument_nullable, false);
        ThreadLocal threadLocal = f65233c;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(R$styleable.NavArgument_argType);
        de6 de6VarM22046e = de6.f35502c;
        ff0 ff0Var2 = de6.f35509j;
        ff0 ff0Var3 = de6.f35515p;
        ff0 ff0Var4 = de6.f35512m;
        ff0 ff0Var5 = de6.f35506g;
        ff0 ff0Var6 = de6.f35503d;
        gf0 gf0Var3 = de6.f35505f;
        de6 de6Var2 = de6.f35511l;
        gf0 gf0Var4 = de6.f35514o;
        gf0 gf0Var5 = de6.f35508i;
        gf0 gf0Var6 = de6.f35501b;
        if (string != null) {
            ff0Var = ff0Var6;
            String resourcePackageName = resources.getResourcePackageName(i);
            z = z4;
            if ("integer".equals(string)) {
                gf0Var = gf0Var3;
                de6Var = gf0Var6;
            } else {
                gf0Var = gf0Var3;
                if ("integer[]".equals(string)) {
                    de6Var = ff0Var;
                } else if ("List<Int>".equals(string)) {
                    de6Var = de6.f35504e;
                } else if ("long".equals(string)) {
                    de6Var = gf0Var;
                } else if ("long[]".equals(string)) {
                    de6Var = ff0Var5;
                } else if ("List<Long>".equals(string)) {
                    de6Var = de6.f35507h;
                } else if ("boolean".equals(string)) {
                    de6Var = de6Var2;
                } else if ("boolean[]".equals(string)) {
                    de6Var = ff0Var4;
                } else if ("List<Boolean>".equals(string)) {
                    de6Var = de6.f35513n;
                } else if ("string".equals(string)) {
                    de6Var = gf0Var4;
                } else if ("string[]".equals(string)) {
                    de6Var = ff0Var3;
                } else if ("List<String>".equals(string)) {
                    de6Var = de6.f35516q;
                } else if ("float".equals(string)) {
                    de6Var = gf0Var5;
                } else if ("float[]".equals(string)) {
                    de6Var = ff0Var2;
                } else {
                    de6Var = "List<Float>".equals(string) ? de6.f35510k : null;
                }
            }
            if (de6Var == null) {
                if ("reference".equals(string)) {
                    de6Var = de6VarM22046e;
                } else if (string.length() == 0) {
                    de6Var = gf0Var4;
                } else {
                    try {
                        String strConcat = (!cl9.m4842Y(string, ".", false) || resourcePackageName == null) ? string : resourcePackageName.concat(string);
                        boolean zM4833P = cl9.m4833P(string, "[]", false);
                        if (zM4833P) {
                            strConcat = strConcat.substring(0, strConcat.length() - 2);
                        }
                        Class<?> cls = Class.forName(strConcat);
                        if (Parcelable.class.isAssignableFrom(cls)) {
                            be6Var = zM4833P ? new zd6(cls) : new ae6(cls);
                        } else if (Enum.class.isAssignableFrom(cls) && zM4833P == 0) {
                            be6Var = new yd6(cls);
                        } else if (Serializable.class.isAssignableFrom(cls)) {
                            be6Var = zM4833P != 0 ? new be6(cls) : new ce6(cls);
                        } else {
                            be6Var = null;
                        }
                        if (be6Var == null) {
                            throw new IllegalArgumentException(strConcat.concat(" is not Serializable or Parcelable.").toString());
                        }
                        de6Var = be6Var;
                    } catch (ClassNotFoundException e) {
                        v63.m23141s(e);
                        return null;
                    }
                }
            }
        } else {
            z = z4;
            gf0Var = gf0Var3;
            ff0Var = ff0Var6;
            de6Var = null;
        }
        if (typedArray.getValue(R$styleable.NavArgument_android_defaultValue, typedValue)) {
            int i2 = typedValue.resourceId;
            if (de6Var != de6VarM22046e) {
                z2 = false;
                if (i2 != 0) {
                    if (de6Var != null) {
                        StringBuilder sb = new StringBuilder("unsupported value '");
                        sb.append((Object) typedValue.string);
                        String strMo302b = de6Var.mo302b();
                        sb.append("' for ");
                        sb.append(strMo302b);
                        sb.append(". You must use a \"reference\" type to reference other resources.");
                        throw new XmlPullParserException(sb.toString());
                    }
                    objMo303d = Integer.valueOf(i2);
                } else if (de6Var == gf0Var4) {
                    objMo303d = typedArray.getString(R$styleable.NavArgument_android_defaultValue);
                } else {
                    int i3 = typedValue.type;
                    if (i3 == 3) {
                        String string2 = typedValue.string.toString();
                        if (de6Var == null) {
                            string2.getClass();
                            try {
                                gf0Var6.mo303d(string2);
                                de6Var = gf0Var6;
                                gf0Var2 = gf0Var;
                            } catch (IllegalArgumentException unused) {
                                gf0Var2 = gf0Var;
                                try {
                                    try {
                                        try {
                                            gf0Var2.mo303d(string2);
                                            de6Var = gf0Var2;
                                        } catch (IllegalArgumentException unused2) {
                                            gf0Var5.mo303d(string2);
                                            de6Var = gf0Var5;
                                        }
                                    } catch (IllegalArgumentException unused3) {
                                        de6Var = gf0Var4;
                                    }
                                } catch (IllegalArgumentException unused4) {
                                    de6Var2.mo303d(string2);
                                    de6Var = de6Var2;
                                }
                            }
                        } else {
                            gf0Var2 = gf0Var;
                        }
                        de6VarM22046e = de6Var;
                        objMo303d = de6VarM22046e.mo303d(string2);
                    } else if (i3 == 4) {
                        de6VarM22046e = thb.m22046e(typedValue, de6Var, gf0Var5, string, "float");
                        objMo303d = Float.valueOf(typedValue.getFloat());
                    } else if (i3 == 5) {
                        de6VarM22046e = thb.m22046e(typedValue, de6Var, gf0Var6, string, "dimension");
                        objMo303d = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                    } else if (i3 == 18) {
                        de6VarM22046e = thb.m22046e(typedValue, de6Var, de6Var2, string, "boolean");
                        objMo303d = Boolean.valueOf(typedValue.data != 0);
                    } else {
                        if (i3 < 16 || i3 > 31) {
                            throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                        }
                        if (de6Var == gf0Var5) {
                            de6VarM22046e = thb.m22046e(typedValue, de6Var, gf0Var5, string, "float");
                            objMo303d = Float.valueOf(typedValue.data);
                        } else {
                            de6VarM22046e = thb.m22046e(typedValue, de6Var, gf0Var6, string, "integer");
                            objMo303d = Integer.valueOf(typedValue.data);
                        }
                    }
                }
                gf0Var2 = gf0Var;
            } else if (i2 != 0) {
                objMo303d = Integer.valueOf(i2);
                z2 = false;
            } else {
                if (typedValue.type != 16 || typedValue.data != 0) {
                    StringBuilder sb2 = new StringBuilder("unsupported value '");
                    sb2.append((Object) typedValue.string);
                    String strMo302b2 = de6Var.mo302b();
                    sb2.append("' for ");
                    sb2.append(strMo302b2);
                    sb2.append(". Must be a reference to a resource.");
                    throw new XmlPullParserException(sb2.toString());
                }
                z2 = false;
                objMo303d = 0;
            }
            de6VarM22046e = de6Var;
            gf0Var2 = gf0Var;
        } else {
            gf0Var2 = gf0Var;
            z2 = false;
            de6VarM22046e = de6Var;
            objMo303d = null;
        }
        if (objMo303d != null) {
            z3 = true;
        } else {
            z3 = z2;
            objMo303d = null;
        }
        if (de6VarM22046e == null) {
            de6VarM22046e = null;
        }
        if (de6VarM22046e == null) {
            if (objMo303d instanceof Integer) {
                de6Var2 = gf0Var6;
            } else if (objMo303d instanceof int[]) {
                de6Var2 = ff0Var;
            } else if (objMo303d instanceof Long) {
                de6Var2 = gf0Var2;
            } else if (objMo303d instanceof long[]) {
                de6Var2 = ff0Var5;
            } else if (objMo303d instanceof Float) {
                de6Var2 = gf0Var5;
            } else if (!(objMo303d instanceof float[]) && !(objMo303d instanceof Boolean)) {
                if (objMo303d instanceof boolean[]) {
                    de6Var2 = ff0Var4;
                } else {
                    de6Var2 = ((objMo303d instanceof String) || objMo303d == null) ? gf0Var4 : null;
                }
            }
            if (de6Var2 == null) {
                de6Var2 = ff0Var2;
                if ((objMo303d instanceof Object[]) && (((Object[]) objMo303d) instanceof String[])) {
                    ce6Var = ff0Var3;
                } else {
                    objMo303d.getClass();
                    if (objMo303d.getClass().isArray()) {
                        Class<?> componentType2 = objMo303d.getClass().getComponentType();
                        componentType2.getClass();
                        if (Parcelable.class.isAssignableFrom(componentType2)) {
                            Class<?> componentType3 = objMo303d.getClass().getComponentType();
                            componentType3.getClass();
                            ce6Var = new zd6(componentType3);
                        } else if (objMo303d.getClass().isArray()) {
                            componentType = objMo303d.getClass().getComponentType();
                            componentType.getClass();
                            if (Serializable.class.isAssignableFrom(componentType)) {
                                Class<?> componentType4 = objMo303d.getClass().getComponentType();
                                componentType4.getClass();
                                ce6Var = new be6(componentType4);
                            } else if (objMo303d instanceof Parcelable) {
                                ce6Var = new ae6(objMo303d.getClass());
                            } else if (objMo303d instanceof Enum) {
                                ce6Var = new yd6(objMo303d.getClass());
                            } else {
                                if (objMo303d instanceof Serializable) {
                                    v63.m23144v("Object of type ", objMo303d.getClass().getName(), " is not supported for navigation arguments.");
                                    return null;
                                }
                                ce6Var = new ce6(objMo303d.getClass());
                            }
                        } else if (objMo303d instanceof Parcelable) {
                            ce6Var = new ae6(objMo303d.getClass());
                        } else if (objMo303d instanceof Enum) {
                            ce6Var = new yd6(objMo303d.getClass());
                        } else {
                            if (objMo303d instanceof Serializable) {
                                v63.m23144v("Object of type ", objMo303d.getClass().getName(), " is not supported for navigation arguments.");
                                return null;
                            }
                            ce6Var = new ce6(objMo303d.getClass());
                        }
                    } else if (objMo303d.getClass().isArray()) {
                        componentType = objMo303d.getClass().getComponentType();
                        componentType.getClass();
                        if (Serializable.class.isAssignableFrom(componentType)) {
                            Class<?> componentType5 = objMo303d.getClass().getComponentType();
                            componentType5.getClass();
                            ce6Var = new be6(componentType5);
                        } else if (objMo303d instanceof Parcelable) {
                            ce6Var = new ae6(objMo303d.getClass());
                        } else if (objMo303d instanceof Enum) {
                            ce6Var = new yd6(objMo303d.getClass());
                        } else {
                            if (objMo303d instanceof Serializable) {
                                v63.m23144v("Object of type ", objMo303d.getClass().getName(), " is not supported for navigation arguments.");
                                return null;
                            }
                            ce6Var = new ce6(objMo303d.getClass());
                        }
                    } else if (objMo303d instanceof Parcelable) {
                        ce6Var = new ae6(objMo303d.getClass());
                    } else if (objMo303d instanceof Enum) {
                        ce6Var = new yd6(objMo303d.getClass());
                    } else {
                        if (objMo303d instanceof Serializable) {
                            v63.m23144v("Object of type ", objMo303d.getClass().getName(), " is not supported for navigation arguments.");
                            return null;
                        }
                        ce6Var = new ce6(objMo303d.getClass());
                    }
                }
            } else {
                de6Var2 = ff0Var2;
                ce6Var = de6Var2;
            }
            de6VarM22046e = ce6Var;
        }
        return new x76(de6VarM22046e, z, objMo303d, z3);
    }

    /* JADX INFO: renamed from: a */
    public final r86 m23233a(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i) throws XmlPullParserException, IOException {
        int depth;
        String strM4839V;
        String strM4839V2;
        String strM4839V3;
        Context context;
        C3488q8 c3488q8;
        Object obj;
        int i2 = i;
        String name = xmlResourceParser.getName();
        name.getClass();
        r86 r86VarMo10901a = this.f65235b.m16259b(name).mo10901a();
        Context context2 = this.f65234a;
        r86VarMo10901a.mo10135k(context2, attributeSet);
        C3488q8 c3488q9 = r86VarMo10901a.f58881b;
        int i3 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == i3 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2) {
                String name2 = xmlResourceParser.getName();
                if ("argument".equals(name2)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, R$styleable.NavArgument);
                    typedArrayObtainAttributes.getClass();
                    String string = typedArrayObtainAttributes.getString(R$styleable.NavArgument_android_name);
                    if (string == null) {
                        throw new XmlPullParserException("Arguments must have a name");
                    }
                    x76 x76VarM23232c = m23232c(typedArrayObtainAttributes, resources, i2);
                    c3488q9.getClass();
                    ((LinkedHashMap) c3488q9.f57372f).put(string, x76VarM23232c);
                    typedArrayObtainAttributes.recycle();
                } else if ("deepLink".equals(name2)) {
                    TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(attributeSet, R$styleable.NavDeepLink);
                    typedArrayObtainAttributes2.getClass();
                    String string2 = typedArrayObtainAttributes2.getString(R$styleable.NavDeepLink_uri);
                    String string3 = typedArrayObtainAttributes2.getString(R$styleable.NavDeepLink_action);
                    String string4 = typedArrayObtainAttributes2.getString(R$styleable.NavDeepLink_mimeType);
                    if ((string2 == null || string2.length() == 0) && ((string3 == null || string3.length() == 0) && (string4 == null || string4.length() == 0))) {
                        throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
                    }
                    if (string2 != null) {
                        String packageName = context2.getPackageName();
                        packageName.getClass();
                        strM4839V = cl9.m4839V(string2, "${applicationId}", packageName);
                    } else {
                        strM4839V = null;
                    }
                    if (string3 == null || string3.length() == 0) {
                        strM4839V2 = null;
                    } else {
                        String packageName2 = context2.getPackageName();
                        packageName2.getClass();
                        strM4839V2 = cl9.m4839V(string3, "${applicationId}", packageName2);
                        if (strM4839V2.length() <= 0) {
                            C3386nv.m17626m("The NavDeepLink cannot have an empty action.");
                            return null;
                        }
                    }
                    if (string4 != null) {
                        String packageName3 = context2.getPackageName();
                        packageName3.getClass();
                        strM4839V3 = cl9.m4839V(string4, "${applicationId}", packageName3);
                    } else {
                        strM4839V3 = null;
                    }
                    o86 o86Var = new o86(strM4839V, strM4839V2, strM4839V3);
                    c3488q9.getClass();
                    ArrayList arrayListM19378s = pk9.m19378s((LinkedHashMap) c3488q9.f57372f, new s86(o86Var, 0));
                    if (!arrayListM19378s.isEmpty()) {
                        v63.m23140r(AbstractC3393o1.m17742q("Deep link ", strM4839V, " can't be used to open destination "), (r86) c3488q9.f57369c, ".\nFollowing required arguments are missing: ", arrayListM19378s);
                        return null;
                    }
                    ((ArrayList) c3488q9.f57370d).add(o86Var);
                    typedArrayObtainAttributes2.recycle();
                } else {
                    if ("action".equals(name2)) {
                        int[] iArr = R$styleable.NavAction;
                        iArr.getClass();
                        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.NavAction_android_id, 0);
                        u76 u76Var = new u76(typedArrayObtainStyledAttributes.getResourceId(R$styleable.NavAction_destination, 0));
                        int i4 = i3;
                        u76Var.f63518b = new wd6(typedArrayObtainStyledAttributes.getBoolean(R$styleable.NavAction_launchSingleTop, false), typedArrayObtainStyledAttributes.getBoolean(R$styleable.NavAction_restoreState, false), typedArrayObtainStyledAttributes.getResourceId(R$styleable.NavAction_popUpTo, -1), typedArrayObtainStyledAttributes.getBoolean(R$styleable.NavAction_popUpToInclusive, false), typedArrayObtainStyledAttributes.getBoolean(R$styleable.NavAction_popUpToSaveState, false), typedArrayObtainStyledAttributes.getResourceId(R$styleable.NavAction_enterAnim, -1), typedArrayObtainStyledAttributes.getResourceId(R$styleable.NavAction_exitAnim, -1), typedArrayObtainStyledAttributes.getResourceId(R$styleable.NavAction_popEnterAnim, -1), typedArrayObtainStyledAttributes.getResourceId(R$styleable.NavAction_popExitAnim, -1));
                        Bundle bundleM18160p = omd.m18160p((Pair[]) Arrays.copyOf(new Pair[0], 0));
                        int depth3 = xmlResourceParser.getDepth() + 1;
                        while (true) {
                            int next2 = xmlResourceParser.next();
                            context = context2;
                            if (next2 == i4) {
                                c3488q8 = c3488q9;
                                break;
                            }
                            int depth4 = xmlResourceParser.getDepth();
                            c3488q8 = c3488q9;
                            if (depth4 < depth3 && next2 == 3) {
                                break;
                            }
                            if (next2 == 2 && depth4 <= depth3) {
                                if ("argument".equals(xmlResourceParser.getName())) {
                                    TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(attributeSet, R$styleable.NavArgument);
                                    typedArrayObtainAttributes3.getClass();
                                    String string5 = typedArrayObtainAttributes3.getString(R$styleable.NavArgument_android_name);
                                    if (string5 == null) {
                                        throw new XmlPullParserException("Arguments must have a name");
                                    }
                                    x76 x76VarM23232c2 = m23232c(typedArrayObtainAttributes3, resources, i2);
                                    boolean z = x76VarM23232c2.f67890c;
                                    if (z && z && (obj = x76VarM23232c2.f67891d) != null) {
                                        x76VarM23232c2.f67888a.mo304e(bundleM18160p, string5, obj);
                                    }
                                    typedArrayObtainAttributes3.recycle();
                                }
                                i2 = i;
                            }
                            context2 = context;
                            c3488q9 = c3488q8;
                            i4 = 1;
                        }
                        if (!bundleM18160p.isEmpty()) {
                            u76Var.f63519c = bundleM18160p;
                        }
                        if (r86VarMo10901a instanceof C2917d7) {
                            throw new UnsupportedOperationException("Cannot add action " + resourceId + " to " + r86VarMo10901a + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
                        }
                        if (resourceId == 0) {
                            C3386nv.m17626m("Cannot have an action with actionId 0");
                            return null;
                        }
                        r86VarMo10901a.f58884e.m19080d(resourceId, u76Var);
                        typedArrayObtainStyledAttributes.recycle();
                    } else {
                        context = context2;
                        c3488q8 = c3488q9;
                        if ("include".equals(name2) && (r86VarMo10901a instanceof u86)) {
                            TypedArray typedArrayObtainAttributes4 = resources.obtainAttributes(attributeSet, androidx.navigation.R$styleable.NavInclude);
                            typedArrayObtainAttributes4.getClass();
                            ((u86) r86VarMo10901a).m22537l(m23234b(typedArrayObtainAttributes4.getResourceId(androidx.navigation.R$styleable.NavInclude_graph, 0)));
                            typedArrayObtainAttributes4.recycle();
                        } else if (r86VarMo10901a instanceof u86) {
                            ((u86) r86VarMo10901a).m22537l(m23233a(resources, xmlResourceParser, attributeSet, i));
                        }
                    }
                    i2 = i;
                    context2 = context;
                    c3488q9 = c3488q8;
                    i3 = 1;
                }
            }
        }
        return r86VarMo10901a;
    }

    /* JADX INFO: renamed from: b */
    public final u86 m23234b(int i) {
        int next;
        Resources resources = this.f65234a.getResources();
        XmlResourceParser xml = resources.getXml(i);
        xml.getClass();
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i) + " line " + xml.getLineNumber(), e);
                }
            } catch (Throwable th) {
                xml.close();
                throw th;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        attributeSetAsAttributeSet.getClass();
        r86 r86VarM23233a = m23233a(resources, xml, attributeSetAsAttributeSet, i);
        if (r86VarM23233a instanceof u86) {
            u86 u86Var = (u86) r86VarM23233a;
            xml.close();
            return u86Var;
        }
        throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
    }
}
