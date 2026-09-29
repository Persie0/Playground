package androidx.glance.appwidget.protobuf;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import p000.q94;
import p000.wq1;
import p000.y6d;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.j */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0676j {

    /* JADX INFO: renamed from: a */
    public static final char[] f6078a;

    static {
        char[] cArr = new char[80];
        f6078a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: renamed from: a */
    public static void m2389a(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(f6078a, 0, i2);
            i -= i2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m2390b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m2390b(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m2390b(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        m2389a(i, sb);
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
            ByteString byteString = ByteString.f6037b;
            sb.append(y6d.m24964a(new ByteString.LiteralByteString(((String) obj).getBytes(q94.f57449a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof ByteString) {
            sb.append(": \"");
            sb.append(y6d.m24964a((ByteString) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0675i) {
            sb.append(" {");
            m2391c((AbstractC0675i) obj, sb, i + 2);
            sb.append("\n");
            m2389a(i, sb);
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
        m2390b(sb, i3, "key", entry.getKey());
        m2390b(sb, i3, "value", entry.getValue());
        sb.append("\n");
        m2389a(i, sb);
        sb.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0185  */
    /* JADX WARN: Code duplicated, block: B:75:0x0187  */
    /* JADX INFO: renamed from: c */
    public static void m2391c(AbstractC0675i abstractC0675i, StringBuilder sb, int i) {
        int i2;
        boolean zBooleanValue;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = abstractC0675i.getClass().getDeclaredMethods();
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
                m2390b(sb, i, wq1.m24112h(4, strSubstring, 0), AbstractC0675i.m2379f(method2, abstractC0675i, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                m2390b(sb, i, wq1.m24112h(3, strSubstring, 0), AbstractC0675i.m2379f(method, abstractC0675i, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objM2379f = AbstractC0675i.m2379f(method4, abstractC0675i, new Object[0]);
                    if (method5 == null) {
                        zBooleanValue = true;
                        if (objM2379f instanceof Boolean) {
                            zEquals = !((Boolean) objM2379f).booleanValue();
                        } else if (objM2379f instanceof Integer) {
                            if (((Integer) objM2379f).intValue() == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objM2379f instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objM2379f).floatValue()) == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objM2379f instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) objM2379f).doubleValue()) == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objM2379f instanceof String) {
                            zEquals = objM2379f.equals("");
                        } else if (objM2379f instanceof ByteString) {
                            zEquals = objM2379f.equals(ByteString.f6037b);
                        } else if (!(objM2379f instanceof AbstractC0667a) ? !((objM2379f instanceof Enum) && ((Enum) objM2379f).ordinal() == 0) : objM2379f != ((AbstractC0675i) ((AbstractC0675i) ((AbstractC0667a) objM2379f)).mo2383d(GeneratedMessageLite$MethodToInvoke.GET_DEFAULT_INSTANCE))) {
                            zEquals = false;
                        } else {
                            zEquals = true;
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        }
                    } else {
                        zBooleanValue = ((Boolean) AbstractC0675i.m2379f(method5, abstractC0675i, new Object[0])).booleanValue();
                    }
                    if (zBooleanValue) {
                        m2390b(sb, i, strSubstring, objM2379f);
                    }
                }
            }
            i2 = 3;
        }
        C0681o c0681o = abstractC0675i.unknownFields;
        if (c0681o != null) {
            for (int i4 = 0; i4 < c0681o.f6101a; i4++) {
                m2390b(sb, i, String.valueOf(c0681o.f6102b[i4] >>> 3), c0681o.f6103c[i4]);
            }
        }
    }
}
