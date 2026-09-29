package androidx.datastore.preferences.protobuf;

import dm.C5206f;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0852k0 {
    /* JADX INFO: renamed from: a */
    public static final String m3364a(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isUpperCase(cCharAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(cCharAt));
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: b */
    public static final void m3365b(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m3365b(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m3365b(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            sb2.append(' ');
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            ByteString byteString = ByteString.f5793b;
            sb2.append(C5206f.m10986G0(new ByteString.LiteralByteString(((String) obj).getBytes(C0871u.f5935a))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof ByteString) {
            sb2.append(": \"");
            sb2.append(C5206f.m10986G0((ByteString) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof GeneratedMessageLite) {
            sb2.append(" {");
            m3366c((GeneratedMessageLite) obj, sb2, i10 + 2);
            sb2.append("\n");
            while (i11 < i10) {
                sb2.append(' ');
                i11++;
            }
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj.toString());
            return;
        }
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i13 = i10 + 2;
        m3365b(sb2, i13, "key", entry.getKey());
        m3365b(sb2, i13, "value", entry.getValue());
        sb2.append("\n");
        while (i11 < i10) {
            sb2.append(' ');
            i11++;
        }
        sb2.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:83:0x0203  */
    /* JADX WARN: Code duplicated, block: B:84:0x0205  */
    /* JADX INFO: renamed from: c */
    public static void m3366c(InterfaceC0848i0 interfaceC0848i0, StringBuilder sb2, int i10) {
        boolean zEquals;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : interfaceC0848i0.getClass().getDeclaredMethods()) {
            map2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                map.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String strReplaceFirst = str.replaceFirst("get", "");
            boolean zBooleanValue = true;
            if (strReplaceFirst.endsWith("List") && !strReplaceFirst.endsWith("OrBuilderList") && !strReplaceFirst.equals("List")) {
                String str2 = strReplaceFirst.substring(0, 1).toLowerCase() + strReplaceFirst.substring(1, strReplaceFirst.length() - 4);
                Method method2 = (Method) map.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m3365b(sb2, i10, m3364a(str2), GeneratedMessageLite.m3124m(interfaceC0848i0, method2, new Object[0]));
                }
            }
            if (strReplaceFirst.endsWith("Map") && !strReplaceFirst.equals("Map")) {
                String str3 = strReplaceFirst.substring(0, 1).toLowerCase() + strReplaceFirst.substring(1, strReplaceFirst.length() - 3);
                Method method3 = (Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m3365b(sb2, i10, m3364a(str3), GeneratedMessageLite.m3124m(interfaceC0848i0, method3, new Object[0]));
                }
            }
            if (((Method) map2.get("set".concat(strReplaceFirst))) != null) {
                if (strReplaceFirst.endsWith("Bytes")) {
                    if (map.containsKey("get" + strReplaceFirst.substring(0, strReplaceFirst.length() - 5))) {
                    }
                }
                String str4 = strReplaceFirst.substring(0, 1).toLowerCase() + strReplaceFirst.substring(1);
                Method method4 = (Method) map.get("get".concat(strReplaceFirst));
                Method method5 = (Method) map.get("has".concat(strReplaceFirst));
                if (method4 != null) {
                    Object objM3124m = GeneratedMessageLite.m3124m(interfaceC0848i0, method4, new Object[0]);
                    if (method5 == null) {
                        if (objM3124m instanceof Boolean) {
                            zEquals = !((Boolean) objM3124m).booleanValue();
                        } else if (objM3124m instanceof Integer) {
                            if (((Integer) objM3124m).intValue() == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objM3124m instanceof Float) {
                            if (((Float) objM3124m).floatValue() == 0.0f) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objM3124m instanceof Double) {
                            if (((Double) objM3124m).doubleValue() == 0.0d) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objM3124m instanceof String) {
                            zEquals = objM3124m.equals("");
                        } else if (objM3124m instanceof ByteString) {
                            zEquals = objM3124m.equals(ByteString.f5793b);
                        } else if (!(objM3124m instanceof InterfaceC0848i0) ? !((objM3124m instanceof Enum) && ((Enum) objM3124m).ordinal() == 0) : objM3124m != ((InterfaceC0848i0) objM3124m).mo3132f()) {
                            zEquals = false;
                        } else {
                            zEquals = true;
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        }
                    } else {
                        zBooleanValue = ((Boolean) GeneratedMessageLite.m3124m(interfaceC0848i0, method5, new Object[0])).booleanValue();
                    }
                    if (zBooleanValue) {
                        m3365b(sb2, i10, m3364a(str4), objM3124m);
                    }
                }
            }
        }
        if (interfaceC0848i0 instanceof GeneratedMessageLite.AbstractC0813c) {
            Iterator<Map.Entry<T, Object>> itM3431k = ((GeneratedMessageLite.AbstractC0813c) interfaceC0848i0).extensions.m3431k();
            while (itM3431k.hasNext()) {
                Map.Entry entry = (Map.Entry) itM3431k.next();
                ((GeneratedMessageLite.C0814d) entry.getKey()).getClass();
                m3365b(sb2, i10, "[0]", entry.getValue());
            }
        }
        C0832c1 c0832c1 = ((GeneratedMessageLite) interfaceC0848i0).unknownFields;
        if (c0832c1 != null) {
            for (int i11 = 0; i11 < c0832c1.f5831a; i11++) {
                m3365b(sb2, i10, String.valueOf(c0832c1.f5832b[i11] >>> 3), c0832c1.f5833c[i11]);
            }
        }
    }
}
