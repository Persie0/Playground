package p000;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nyy {

    /* JADX INFO: renamed from: a */
    private static final char[] f45037a;

    static {
        char[] cArr = new char[80];
        f45037a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: renamed from: a */
    static void m18197a(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m18197a(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m18197a(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        m18199c(i, sb);
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
            sb.append(lij.m15427aj(nwr.m17801w((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof nwr) {
            sb.append(": \"");
            sb.append(lij.m15427aj((nwr) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof nxq) {
            sb.append(" {");
            m18198b((nxq) obj, sb, i + 2);
            sb.append("\n");
            m18199c(i, sb);
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
        m18197a(sb, i3, "key", entry.getKey());
        m18197a(sb, i3, "value", entry.getValue());
        sb.append("\n");
        m18199c(i, sb);
        sb.append("}");
    }

    /* JADX INFO: renamed from: b */
    public static void m18198b(nyw nywVar, StringBuilder sb, int i) {
        int i2;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = nywVar.getClass().getDeclaredMethods();
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
                m18197a(sb, i, strSubstring.substring(0, strSubstring.length() - 4), nxq.m18128W(method2, nywVar, new Object[0]));
                i2 = 3;
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                m18197a(sb, i, strSubstring.substring(0, strSubstring.length() - 3), nxq.m18128W(method, nywVar, new Object[0]));
                i2 = 3;
            } else if (!hashSet.contains("set".concat(String.valueOf(strSubstring)))) {
                i2 = 3;
            } else if (strSubstring.endsWith("Bytes") && treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5))))) {
                i2 = 3;
            } else {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(String.valueOf(strSubstring)));
                if (method4 != null) {
                    Object objM18128W = nxq.m18128W(method4, nywVar, new Object[0]);
                    if (method5 == null) {
                        if (objM18128W instanceof Boolean) {
                            if (((Boolean) objM18128W).booleanValue()) {
                                m18197a(sb, i, strSubstring, objM18128W);
                                i2 = 3;
                            } else {
                                i2 = 3;
                            }
                        } else if (objM18128W instanceof Integer) {
                            if (((Integer) objM18128W).intValue() != 0) {
                                m18197a(sb, i, strSubstring, objM18128W);
                                i2 = 3;
                            } else {
                                i2 = 3;
                            }
                        } else if (objM18128W instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objM18128W).floatValue()) != 0) {
                                m18197a(sb, i, strSubstring, objM18128W);
                                i2 = 3;
                            } else {
                                i2 = 3;
                            }
                        } else if (!(objM18128W instanceof Double)) {
                            if (objM18128W instanceof String) {
                                zEquals = objM18128W.equals("");
                            } else if (objM18128W instanceof nwr) {
                                zEquals = objM18128W.equals(nwr.f44839b);
                            } else if (objM18128W instanceof nyw) {
                                if (objM18128W != ((nyw) objM18128W).mo18097cx()) {
                                    m18197a(sb, i, strSubstring, objM18128W);
                                    i2 = 3;
                                } else {
                                    i2 = 3;
                                }
                            } else if ((objM18128W instanceof Enum) && ((Enum) objM18128W).ordinal() == 0) {
                                i2 = 3;
                            } else {
                                m18197a(sb, i, strSubstring, objM18128W);
                                i2 = 3;
                            }
                            if (zEquals) {
                                i2 = 3;
                            } else {
                                m18197a(sb, i, strSubstring, objM18128W);
                                i2 = 3;
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objM18128W).doubleValue()) != 0) {
                            m18197a(sb, i, strSubstring, objM18128W);
                            i2 = 3;
                        } else {
                            i2 = 3;
                        }
                    } else if (((Boolean) nxq.m18128W(method5, nywVar, new Object[0])).booleanValue()) {
                        m18197a(sb, i, strSubstring, objM18128W);
                        i2 = 3;
                    } else {
                        i2 = 3;
                    }
                } else {
                    i2 = 3;
                }
            }
        }
        if (nywVar instanceof nxo) {
            Iterator itM18023d = ((nxo) nywVar).f44976l.m18023d();
            while (itM18023d.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itM18023d.next();
                m18197a(sb, i, "[" + ((nxp) entry2.getKey()).f44977a + "]", entry2.getValue());
            }
        }
        nzy nzyVar = ((nxq) nywVar).f44981aJ;
        if (nzyVar != null) {
            for (int i4 = 0; i4 < nzyVar.f45106b; i4++) {
                m18197a(sb, i, String.valueOf(oal.m18386a(nzyVar.f45107c[i4])), nzyVar.f45108d[i4]);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private static void m18199c(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(f45037a, 0, i2);
            i -= i2;
        }
    }
}
