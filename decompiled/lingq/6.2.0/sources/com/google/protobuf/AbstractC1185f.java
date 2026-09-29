package com.google.protobuf;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import p000.p94;
import p000.u6d;
import p000.wq1;

/* JADX INFO: renamed from: com.google.protobuf.f */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1185f {

    /* JADX INFO: renamed from: a */
    public static final char[] f13938a;

    static {
        char[] cArr = new char[80];
        f13938a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: renamed from: a */
    public static void m6819a(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(f13938a, 0, i2);
            i -= i2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m6820b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m6820b(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m6820b(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        m6819a(i, sb);
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
            ByteString byteString = ByteString.f13921b;
            sb.append(u6d.m22519d(new ByteString.LiteralByteString(((String) obj).getBytes(p94.f55800a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof ByteString) {
            sb.append(": \"");
            sb.append(u6d.m22519d((ByteString) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC1183d) {
            sb.append(" {");
            m6821c((AbstractC1183d) obj, sb, i + 2);
            sb.append("\n");
            m6819a(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i3 = i + 2;
        m6820b(sb, i3, "key", entry.getKey());
        m6820b(sb, i3, "value", entry.getValue());
        sb.append("\n");
        m6819a(i, sb);
        sb.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0185  */
    /* JADX WARN: Code duplicated, block: B:75:0x0187  */
    /* JADX INFO: renamed from: c */
    public static void m6821c(AbstractC1183d abstractC1183d, StringBuilder sb, int i) {
        int i2;
        boolean zBooleanValue;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = abstractC1183d.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i3 = 0;
        while (true) {
            i2 = 3;
            if (i3 >= length) {
                break;
            }
            Method method3 = declaredMethods[i3];
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
            i3++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i2);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                m6820b(sb, i, wq1.m24112h(4, strSubstring, 0), AbstractC1183d.m6811m(method2, abstractC1183d, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                m6820b(sb, i, wq1.m24112h(3, strSubstring, 0), AbstractC1183d.m6811m(method, abstractC1183d, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objM6811m = AbstractC1183d.m6811m(method4, abstractC1183d, new Object[0]);
                    if (method5 == null) {
                        zBooleanValue = true;
                        if (objM6811m instanceof Boolean) {
                            zEquals = !((Boolean) objM6811m).booleanValue();
                        } else if (objM6811m instanceof Integer) {
                            if (((Integer) objM6811m).intValue() == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objM6811m instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objM6811m).floatValue()) == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objM6811m instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) objM6811m).doubleValue()) == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objM6811m instanceof String) {
                            zEquals = objM6811m.equals("");
                        } else if (objM6811m instanceof ByteString) {
                            zEquals = objM6811m.equals(ByteString.f13921b);
                        } else if (!(objM6811m instanceof AbstractC1180a) ? !((objM6811m instanceof Enum) && ((Enum) objM6811m).ordinal() == 0) : objM6811m != ((AbstractC1183d) ((AbstractC1183d) ((AbstractC1180a) objM6811m)).mo454k(GeneratedMessageLite$MethodToInvoke.GET_DEFAULT_INSTANCE))) {
                            zEquals = false;
                        } else {
                            zEquals = true;
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        }
                    } else {
                        zBooleanValue = ((Boolean) AbstractC1183d.m6811m(method5, abstractC1183d, new Object[0])).booleanValue();
                    }
                    if (zBooleanValue) {
                        m6820b(sb, i, strSubstring, objM6811m);
                    }
                }
            }
            i2 = 3;
        }
        C1190k c1190k = abstractC1183d.unknownFields;
        if (c1190k != null) {
            for (int i4 = 0; i4 < c1190k.f13957a; i4++) {
                m6820b(sb, i, String.valueOf(c1190k.f13958b[i4] >>> 3), c1190k.f13959c[i4]);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m6822d(AbstractC1183d abstractC1183d, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m6821c(abstractC1183d, sb, 0);
        return sb.toString();
    }
}
