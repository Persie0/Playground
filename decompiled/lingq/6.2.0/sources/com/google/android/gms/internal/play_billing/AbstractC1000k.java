package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import p000.jjc;
import p000.m9c;
import p000.tdd;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.k */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1000k {

    /* JADX INFO: renamed from: a */
    public static final char[] f12185a;

    static {
        char[] cArr = new char[80];
        f12185a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: renamed from: a */
    public static String m5543a(AbstractC0998i abstractC0998i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m5546d(abstractC0998i, sb, 0);
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static void m5544b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m5544b(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m5544b(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        m5545c(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            String str2 = (String) obj;
            zzev zzevVar = zzev.f12230b;
            sb.append(tdd.m21967b(str2.isEmpty() ? zzev.f12230b : new zzet(str2.getBytes(m9c.f50823a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzev) {
            sb.append(": \"");
            sb.append(tdd.m21967b((zzev) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0998i) {
            sb.append(" {");
            m5546d((AbstractC0998i) obj, sb, i + 2);
            sb.append("\n");
            m5545c(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i3 = i + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        m5544b(sb, i3, "key", entry.getKey());
        m5544b(sb, i3, "value", entry.getValue());
        sb.append("\n");
        m5545c(i, sb);
        sb.append("}");
    }

    /* JADX INFO: renamed from: c */
    public static void m5545c(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(f12185a, 0, i2);
            i -= i2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:67:0x0180  */
    /* JADX INFO: renamed from: d */
    public static void m5546d(AbstractC0998i abstractC0998i, StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean zBooleanValue;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = abstractC0998i.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            Method method3 = declaredMethods[i4];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i4++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i2);
            if (!strSubstring.endsWith("List") || strSubstring.endsWith("OrBuilderList") || strSubstring.equals("List") || (method2 = (Method) entry.getValue()) == null) {
                i3 = i2;
            } else {
                i3 = i2;
                if (method2.getReturnType().equals(List.class)) {
                    m5544b(sb, i, strSubstring.substring(0, strSubstring.length() - 4), AbstractC0998i.m5536o(method2, abstractC0998i, new Object[0]));
                }
                i2 = i3;
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                m5544b(sb, i, strSubstring.substring(0, strSubstring.length() - 3), AbstractC0998i.m5536o(method, abstractC0998i, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objM5536o = AbstractC0998i.m5536o(method4, abstractC0998i, new Object[0]);
                    if (method5 != null) {
                        zBooleanValue = ((Boolean) AbstractC0998i.m5536o(method5, abstractC0998i, new Object[0])).booleanValue();
                    } else if (objM5536o instanceof Boolean) {
                        if (((Boolean) objM5536o).booleanValue()) {
                            zBooleanValue = true;
                        } else {
                            zBooleanValue = false;
                        }
                    } else if (objM5536o instanceof Integer) {
                        if (((Integer) objM5536o).intValue() == 0) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (objM5536o instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) objM5536o).floatValue()) == 0) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (!(objM5536o instanceof Double)) {
                        if (objM5536o instanceof String) {
                            zEquals = objM5536o.equals("");
                        } else if (objM5536o instanceof zzev) {
                            zEquals = objM5536o.equals(zzev.f12230b);
                        } else if (!(objM5536o instanceof AbstractC0997h) ? !((objM5536o instanceof Enum) && ((Enum) objM5536o).ordinal() == 0) : objM5536o != ((AbstractC0998i) ((AbstractC0998i) ((AbstractC0997h) objM5536o)).mo5511j(6))) {
                            zBooleanValue = true;
                        } else {
                            zBooleanValue = false;
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (Double.doubleToRawLongBits(((Double) objM5536o).doubleValue()) == 0) {
                        zBooleanValue = false;
                    } else {
                        zBooleanValue = true;
                    }
                    if (zBooleanValue) {
                        m5544b(sb, i, strSubstring, objM5536o);
                    }
                }
            }
            i2 = i3;
        }
        jjc jjcVar = abstractC0998i.zzc;
        if (jjcVar != null) {
            for (int i5 = 0; i5 < jjcVar.f45640a; i5++) {
                m5544b(sb, i, String.valueOf(jjcVar.f45641b[i5] >>> 3), jjcVar.f45642c[i5]);
            }
        }
    }
}
