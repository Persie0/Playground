package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import p000.o94;
import p000.t6d;
import p000.wq1;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.k */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1136k {

    /* JADX INFO: renamed from: a */
    public static final char[] f13596a;

    static {
        char[] cArr = new char[80];
        f13596a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: renamed from: a */
    public static void m6554a(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(f13596a, 0, i2);
            i -= i2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m6555b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m6555b(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m6555b(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        m6554a(i, sb);
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
            ByteString byteString = ByteString.f13555b;
            sb.append(t6d.m21880b(new ByteString.LiteralByteString(((String) obj).getBytes(o94.f54077a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof ByteString) {
            sb.append(": \"");
            sb.append(t6d.m21880b((ByteString) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC1134i) {
            sb.append(" {");
            m6556c((AbstractC1134i) obj, sb, i + 2);
            sb.append("\n");
            m6554a(i, sb);
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
        m6555b(sb, i3, "key", entry.getKey());
        m6555b(sb, i3, "value", entry.getValue());
        sb.append("\n");
        m6554a(i, sb);
        sb.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0185  */
    /* JADX WARN: Code duplicated, block: B:75:0x0187  */
    /* JADX INFO: renamed from: c */
    public static void m6556c(AbstractC1134i abstractC1134i, StringBuilder sb, int i) {
        int i2;
        boolean zBooleanValue;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = abstractC1134i.getClass().getDeclaredMethods();
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
                m6555b(sb, i, wq1.m24112h(4, strSubstring, 0), AbstractC1134i.m6540k(method2, abstractC1134i, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                m6555b(sb, i, wq1.m24112h(3, strSubstring, 0), AbstractC1134i.m6540k(method, abstractC1134i, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objM6540k = AbstractC1134i.m6540k(method4, abstractC1134i, new Object[0]);
                    if (method5 == null) {
                        zBooleanValue = true;
                        if (objM6540k instanceof Boolean) {
                            zEquals = !((Boolean) objM6540k).booleanValue();
                        } else if (objM6540k instanceof Integer) {
                            if (((Integer) objM6540k).intValue() == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objM6540k instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objM6540k).floatValue()) == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objM6540k instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) objM6540k).doubleValue()) == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objM6540k instanceof String) {
                            zEquals = objM6540k.equals("");
                        } else if (objM6540k instanceof ByteString) {
                            zEquals = objM6540k.equals(ByteString.f13555b);
                        } else if (!(objM6540k instanceof AbstractC1126a) ? !((objM6540k instanceof Enum) && ((Enum) objM6540k).ordinal() == 0) : objM6540k != ((AbstractC1126a) objM6540k).getDefaultInstanceForType()) {
                            zEquals = false;
                        } else {
                            zEquals = true;
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        }
                    } else {
                        zBooleanValue = ((Boolean) AbstractC1134i.m6540k(method5, abstractC1134i, new Object[0])).booleanValue();
                    }
                    if (zBooleanValue) {
                        m6555b(sb, i, strSubstring, objM6540k);
                    }
                }
            }
            i2 = 3;
        }
        C1141p c1141p = abstractC1134i.unknownFields;
        if (c1141p != null) {
            for (int i4 = 0; i4 < c1141p.f13621a; i4++) {
                m6555b(sb, i, String.valueOf(c1141p.f13622b[i4] >>> 3), c1141p.f13623c[i4]);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m6557d(AbstractC1134i abstractC1134i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m6556c(abstractC1134i, sb, 0);
        return sb.toString();
    }
}
