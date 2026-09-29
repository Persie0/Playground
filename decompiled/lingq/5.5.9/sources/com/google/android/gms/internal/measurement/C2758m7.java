package com.google.android.gms.internal.measurement;

import ae.C0062b;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2758m7 {

    /* JADX INFO: renamed from: a */
    public static final char[] f14313a;

    static {
        char[] cArr = new char[80];
        f14313a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: renamed from: a */
    public static void m8067a(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m8067a(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m8067a(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        m8068b(i10, sb2);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i11 = 1; i11 < str.length(); i11++) {
                char cCharAt = str.charAt(i11);
                if (Character.isUpperCase(cCharAt)) {
                    sb3.append("_");
                }
                sb3.append(Character.toLowerCase(cCharAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(C0062b.m267F2(new zzjx(((String) obj).getBytes(C2849t6.f14439a))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzka) {
            sb2.append(": \"");
            sb2.append(C0062b.m267F2((zzka) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof AbstractC2771n6) {
            sb2.append(" {");
            m8069c((AbstractC2771n6) obj, sb2, i10 + 2);
            sb2.append("\n");
            m8068b(i10, sb2);
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i12 = i10 + 2;
        m8067a(sb2, i12, "key", entry.getKey());
        m8067a(sb2, i12, "value", entry.getValue());
        sb2.append("\n");
        m8068b(i10, sb2);
        sb2.append("}");
    }

    /* JADX INFO: renamed from: b */
    public static void m8068b(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(f14313a, 0, i11);
            i10 -= i11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01fc  */
    /* JADX INFO: renamed from: c */
    public static void m8069c(InterfaceC2730k7 interfaceC2730k7, StringBuilder sb2, int i10) {
        int i11;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = interfaceC2730k7.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i12 = 0;
        while (true) {
            i11 = 3;
            if (i12 >= length) {
                break;
            }
            Method method3 = declaredMethods[i12];
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
            i12++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i11);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                m8067a(sb2, i10, strSubstring.substring(0, strSubstring.length() - 4), AbstractC2771n6.m8082n(interfaceC2730k7, method2, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                m8067a(sb2, i10, strSubstring.substring(0, strSubstring.length() - 3), AbstractC2771n6.m8082n(interfaceC2730k7, method, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objM8082n = AbstractC2771n6.m8082n(interfaceC2730k7, method4, new Object[0]);
                    if (method5 == null) {
                        if (objM8082n instanceof Boolean) {
                            if (((Boolean) objM8082n).booleanValue()) {
                                m8067a(sb2, i10, strSubstring, objM8082n);
                            }
                        } else if (objM8082n instanceof Integer) {
                            if (((Integer) objM8082n).intValue() != 0) {
                                m8067a(sb2, i10, strSubstring, objM8082n);
                            }
                        } else if (objM8082n instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objM8082n).floatValue()) != 0) {
                                m8067a(sb2, i10, strSubstring, objM8082n);
                            }
                        } else if (!(objM8082n instanceof Double)) {
                            if (objM8082n instanceof String) {
                                zEquals = objM8082n.equals("");
                            } else if (objM8082n instanceof zzka) {
                                zEquals = objM8082n.equals(zzka.f14563b);
                            } else if (objM8082n instanceof InterfaceC2730k7) {
                                if (objM8082n != ((InterfaceC2730k7) objM8082n).mo8049c()) {
                                    m8067a(sb2, i10, strSubstring, objM8082n);
                                }
                            } else if (!(objM8082n instanceof Enum) || ((Enum) objM8082n).ordinal() != 0) {
                                m8067a(sb2, i10, strSubstring, objM8082n);
                            }
                            if (!zEquals) {
                                m8067a(sb2, i10, strSubstring, objM8082n);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objM8082n).doubleValue()) != 0) {
                            m8067a(sb2, i10, strSubstring, objM8082n);
                        }
                    } else if (((Boolean) AbstractC2771n6.m8082n(interfaceC2730k7, method5, new Object[0])).booleanValue()) {
                        m8067a(sb2, i10, strSubstring, objM8082n);
                    }
                }
            }
            i11 = 3;
        }
        if (interfaceC2730k7 instanceof AbstractC2729k6) {
            throw null;
        }
        C2689h8 c2689h8 = ((AbstractC2771n6) interfaceC2730k7).zzc;
        if (c2689h8 != null) {
            for (int i13 = 0; i13 < c2689h8.f14235a; i13++) {
                m8067a(sb2, i10, String.valueOf(c2689h8.f14236b[i13] >>> 3), c2689h8.f14237c[i13]);
            }
        }
    }
}
