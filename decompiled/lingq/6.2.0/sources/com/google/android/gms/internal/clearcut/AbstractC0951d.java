package com.google.android.gms.internal.clearcut;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import p000.btb;
import p000.ldd;
import p000.u3c;
import p000.wq1;
import p000.zmb;

/* JADX INFO: renamed from: com.google.android.gms.internal.clearcut.d */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0951d {
    /* JADX WARN: Code duplicated, block: B:101:0x0207  */
    /* JADX WARN: Code duplicated, block: B:103:0x020b  */
    /* JADX WARN: Code duplicated, block: B:104:0x020e  */
    /* JADX WARN: Code duplicated, block: B:116:0x0232  */
    /* JADX WARN: Code duplicated, block: B:117:0x0234  */
    /* JADX WARN: Code duplicated, block: B:139:0x013f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x0162 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x0162 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x01b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x0242 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:49:0x012d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0132  */
    /* JADX WARN: Code duplicated, block: B:55:0x0147  */
    /* JADX WARN: Code duplicated, block: B:57:0x0152  */
    /* JADX WARN: Code duplicated, block: B:58:0x0157  */
    /* JADX WARN: Code duplicated, block: B:63:0x0178  */
    /* JADX WARN: Code duplicated, block: B:64:0x017d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0189  */
    /* JADX WARN: Code duplicated, block: B:68:0x018e  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:77:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:79:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:82:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:83:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:88:0x01db  */
    /* JADX WARN: Code duplicated, block: B:90:0x01df  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:98:0x01fe  */
    /* JADX INFO: renamed from: a */
    public static void m5297a(AbstractC0949b abstractC0949b, StringBuilder sb, int i) {
        String str;
        String strValueOf;
        String strSubstring;
        String str2;
        String str3;
        Method method;
        String str4;
        Method method2;
        Object objM5290b;
        String strM5299c;
        boolean zEquals;
        String strM24112h;
        String str5;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method3 : abstractC0949b.getClass().getDeclaredMethods()) {
            map2.put(method3.getName(), method3);
            if (method3.getParameterTypes().length == 0) {
                map.put(method3.getName(), method3);
                if (method3.getName().startsWith("get")) {
                    treeSet.add(method3.getName());
                }
            }
        }
        for (String str6 : treeSet) {
            Object obj = "";
            String strReplaceFirst = str6.replaceFirst("get", "");
            boolean zBooleanValue = true;
            if (!strReplaceFirst.endsWith("List") || strReplaceFirst.endsWith("OrBuilderList") || strReplaceFirst.equals("List")) {
                if (!strReplaceFirst.endsWith("Map") && !strReplaceFirst.equals("Map")) {
                    String strValueOf2 = String.valueOf(strReplaceFirst.substring(0, 1).toLowerCase());
                    String strM24112h2 = wq1.m24112h(3, strReplaceFirst, 1);
                    String strConcat = strM24112h2.length() != 0 ? strValueOf2.concat(strM24112h2) : new String(strValueOf2);
                    Method method4 = (Method) map.get(str6);
                    if (method4 != null && method4.getReturnType().equals(Map.class) && !method4.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method4.getModifiers())) {
                        m5298b(sb, i, m5299c(strConcat), AbstractC0949b.m5290b(method4, abstractC0949b, new Object[0]));
                    }
                }
                if (strReplaceFirst.length() != 0) {
                    str = "set".concat(strReplaceFirst);
                } else {
                    str = new String("set");
                }
                if (((Method) map2.get(str)) == null) {
                    if (strReplaceFirst.endsWith("Bytes")) {
                        strM24112h = wq1.m24112h(5, strReplaceFirst, 0);
                        if (strM24112h.length() != 0) {
                            str5 = "get".concat(strM24112h);
                        } else {
                            str5 = new String("get");
                        }
                        if (!map.containsKey(str5)) {
                        }
                    }
                    strValueOf = String.valueOf(strReplaceFirst.substring(0, 1).toLowerCase());
                    strSubstring = strReplaceFirst.substring(1);
                    if (strSubstring.length() != 0) {
                        str2 = strValueOf.concat(strSubstring);
                    } else {
                        str2 = new String(strValueOf);
                    }
                    if (strReplaceFirst.length() != 0) {
                        str3 = "get".concat(strReplaceFirst);
                    } else {
                        str3 = new String("get");
                    }
                    method = (Method) map.get(str3);
                    if (strReplaceFirst.length() != 0) {
                        str4 = "has".concat(strReplaceFirst);
                    } else {
                        str4 = new String("has");
                    }
                    method2 = (Method) map.get(str4);
                    if (method != null) {
                        objM5290b = AbstractC0949b.m5290b(method, abstractC0949b, new Object[0]);
                        if (method2 == null) {
                            if (objM5290b instanceof Boolean) {
                                if (((Boolean) objM5290b).booleanValue()) {
                                    zEquals = false;
                                } else {
                                    zEquals = true;
                                }
                            } else if (objM5290b instanceof Integer) {
                                if (((Integer) objM5290b).intValue() == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objM5290b instanceof Float) {
                                if (((Float) objM5290b).floatValue() == 0.0f) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objM5290b instanceof Double) {
                                if (!(objM5290b instanceof String)) {
                                    if (objM5290b instanceof zzbb) {
                                        obj = zzbb.f11801b;
                                    } else if ((objM5290b instanceof zmb) ? !((objM5290b instanceof Enum) && ((Enum) objM5290b).ordinal() == 0) : objM5290b != ((AbstractC0949b) ((AbstractC0949b) ((zmb) objM5290b)).mo5293a(6))) {
                                        zEquals = false;
                                    } else {
                                        zEquals = true;
                                    }
                                }
                                zEquals = objM5290b.equals(obj);
                            } else if (((Double) objM5290b).doubleValue() == 0.0d) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                            if (zEquals) {
                                zBooleanValue = false;
                            }
                        } else {
                            zBooleanValue = ((Boolean) AbstractC0949b.m5290b(method2, abstractC0949b, new Object[0])).booleanValue();
                        }
                        if (zBooleanValue) {
                            strM5299c = m5299c(str2);
                            m5298b(sb, i, strM5299c, objM5290b);
                        }
                    }
                }
            } else {
                String strValueOf3 = String.valueOf(strReplaceFirst.substring(0, 1).toLowerCase());
                String strM24112h3 = wq1.m24112h(4, strReplaceFirst, 1);
                String strConcat2 = strM24112h3.length() != 0 ? strValueOf3.concat(strM24112h3) : new String(strValueOf3);
                Method method5 = (Method) map.get(str6);
                if (method5 == null || !method5.getReturnType().equals(List.class)) {
                    if (!strReplaceFirst.endsWith("Map")) {
                    }
                    if (strReplaceFirst.length() != 0) {
                        str = "set".concat(strReplaceFirst);
                    } else {
                        str = new String("set");
                    }
                    if (((Method) map2.get(str)) == null) {
                        if (strReplaceFirst.endsWith("Bytes")) {
                            strM24112h = wq1.m24112h(5, strReplaceFirst, 0);
                            if (strM24112h.length() != 0) {
                                str5 = "get".concat(strM24112h);
                            } else {
                                str5 = new String("get");
                            }
                            if (!map.containsKey(str5)) {
                            }
                        }
                        strValueOf = String.valueOf(strReplaceFirst.substring(0, 1).toLowerCase());
                        strSubstring = strReplaceFirst.substring(1);
                        if (strSubstring.length() != 0) {
                            str2 = strValueOf.concat(strSubstring);
                        } else {
                            str2 = new String(strValueOf);
                        }
                        if (strReplaceFirst.length() != 0) {
                            str3 = "get".concat(strReplaceFirst);
                        } else {
                            str3 = new String("get");
                        }
                        method = (Method) map.get(str3);
                        if (strReplaceFirst.length() != 0) {
                            str4 = "has".concat(strReplaceFirst);
                        } else {
                            str4 = new String("has");
                        }
                        method2 = (Method) map.get(str4);
                        if (method != null) {
                            objM5290b = AbstractC0949b.m5290b(method, abstractC0949b, new Object[0]);
                            if (method2 == null) {
                                if (objM5290b instanceof Boolean) {
                                    if (((Boolean) objM5290b).booleanValue()) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objM5290b instanceof Integer) {
                                    if (((Integer) objM5290b).intValue() == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objM5290b instanceof Float) {
                                    if (((Float) objM5290b).floatValue() == 0.0f) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objM5290b instanceof Double) {
                                    if (!(objM5290b instanceof String)) {
                                        if (objM5290b instanceof zzbb) {
                                            obj = zzbb.f11801b;
                                        } else if (objM5290b instanceof zmb) {
                                            zEquals = false;
                                        } else {
                                            zEquals = false;
                                        }
                                    }
                                    zEquals = objM5290b.equals(obj);
                                } else if (((Double) objM5290b).doubleValue() == 0.0d) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                                if (zEquals) {
                                    zBooleanValue = false;
                                }
                            } else {
                                zBooleanValue = ((Boolean) AbstractC0949b.m5290b(method2, abstractC0949b, new Object[0])).booleanValue();
                            }
                            if (zBooleanValue) {
                                strM5299c = m5299c(str2);
                            }
                        }
                    }
                } else {
                    strM5299c = m5299c(strConcat2);
                    objM5290b = AbstractC0949b.m5290b(method5, abstractC0949b, new Object[0]);
                }
                m5298b(sb, i, strM5299c, objM5290b);
            }
        }
        u3c u3cVar = abstractC0949b.zzjp;
        if (u3cVar != null) {
            for (int i2 = 0; i2 < u3cVar.f63368a; i2++) {
                m5298b(sb, i, String.valueOf(u3cVar.f63369b[i2] >>> 3), u3cVar.f63370c[i2]);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m5298b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m5298b(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m5298b(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            zzbb zzbbVar = zzbb.f11801b;
            sb.append(ldd.m16142b(new zzbi(((String) obj).getBytes(btb.f8994a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzbb) {
            sb.append(": \"");
            sb.append(ldd.m16142b((zzbb) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0949b) {
            sb.append(" {");
            m5297a((AbstractC0949b) obj, sb, i + 2);
            sb.append("\n");
            while (i2 < i) {
                sb.append(' ');
                i2++;
            }
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj.toString());
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i4 = i + 2;
        m5298b(sb, i4, "key", entry.getKey());
        m5298b(sb, i4, "value", entry.getValue());
        sb.append("\n");
        while (i2 < i) {
            sb.append(' ');
            i2++;
        }
        sb.append("}");
    }

    /* JADX INFO: renamed from: c */
    public static final String m5299c(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }
}
