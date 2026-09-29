package com.google.android.gms.internal.vision;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import p000.gfc;
import p000.led;
import p000.noc;
import p000.ozc;
import p000.wq1;

/* JADX INFO: renamed from: com.google.android.gms.internal.vision.v */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1037v {
    /* JADX INFO: renamed from: a */
    public static final String m5782a(String str) {
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

    /* JADX WARN: Code duplicated, block: B:84:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ca  */
    /* JADX INFO: renamed from: b */
    public static void m5783b(AbstractC1034s abstractC1034s, StringBuilder sb, int i) {
        boolean zEquals;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : abstractC1034s.getClass().getDeclaredMethods()) {
            map2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                map.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String strSubstring = str.startsWith("get") ? str.substring(3) : str;
            boolean zBooleanValue = true;
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List")) {
                String strValueOf = String.valueOf(strSubstring.substring(0, 1).toLowerCase());
                String strM24112h = wq1.m24112h(4, strSubstring, 1);
                String strConcat = strM24112h.length() != 0 ? strValueOf.concat(strM24112h) : new String(strValueOf);
                Method method2 = (Method) map.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m5784c(sb, i, m5782a(strConcat), AbstractC1034s.m5741f(method2, abstractC1034s, new Object[0]));
                }
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map")) {
                String strValueOf2 = String.valueOf(strSubstring.substring(0, 1).toLowerCase());
                String strM24112h2 = wq1.m24112h(3, strSubstring, 1);
                String strConcat2 = strM24112h2.length() != 0 ? strValueOf2.concat(strM24112h2) : new String(strValueOf2);
                Method method3 = (Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m5784c(sb, i, m5782a(strConcat2), AbstractC1034s.m5741f(method3, abstractC1034s, new Object[0]));
                }
            }
            if (((Method) map2.get(strSubstring.length() != 0 ? "set".concat(strSubstring) : new String("set"))) != null) {
                if (strSubstring.endsWith("Bytes")) {
                    String strM24112h3 = wq1.m24112h(5, strSubstring, 0);
                    if (!map.containsKey(strM24112h3.length() != 0 ? "get".concat(strM24112h3) : new String("get"))) {
                    }
                }
                String strValueOf3 = String.valueOf(strSubstring.substring(0, 1).toLowerCase());
                String strSubstring2 = strSubstring.substring(1);
                String strConcat3 = strSubstring2.length() != 0 ? strValueOf3.concat(strSubstring2) : new String(strValueOf3);
                Method method4 = (Method) map.get(strSubstring.length() != 0 ? "get".concat(strSubstring) : new String("get"));
                Method method5 = (Method) map.get(strSubstring.length() != 0 ? "has".concat(strSubstring) : new String("has"));
                if (method4 != null) {
                    Object objM5741f = AbstractC1034s.m5741f(method4, abstractC1034s, new Object[0]);
                    if (method5 == null) {
                        if (objM5741f instanceof Boolean) {
                            if (((Boolean) objM5741f).booleanValue()) {
                                zEquals = false;
                            } else {
                                zEquals = true;
                            }
                        } else if (objM5741f instanceof Integer) {
                            if (((Integer) objM5741f).intValue() == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objM5741f instanceof Float) {
                            if (((Float) objM5741f).floatValue() == 0.0f) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objM5741f instanceof Double) {
                            if (((Double) objM5741f).doubleValue() == 0.0d) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objM5741f instanceof String) {
                            zEquals = objM5741f.equals("");
                        } else if (objM5741f instanceof zzht) {
                            zEquals = objM5741f.equals(zzht.f12293b);
                        } else if (!(objM5741f instanceof gfc) ? !((objM5741f instanceof Enum) && ((Enum) objM5741f).ordinal() == 0) : objM5741f != ((AbstractC1034s) ((AbstractC1034s) ((gfc) objM5741f)).mo5699e(6))) {
                            zEquals = false;
                        } else {
                            zEquals = true;
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        }
                    } else {
                        zBooleanValue = ((Boolean) AbstractC1034s.m5741f(method5, abstractC1034s, new Object[0])).booleanValue();
                    }
                    if (zBooleanValue) {
                        m5784c(sb, i, m5782a(strConcat3), objM5741f);
                    }
                }
            }
        }
        ozc ozcVar = abstractC1034s.zzb;
        if (ozcVar != null) {
            for (int i2 = 0; i2 < ozcVar.f55342a; i2++) {
                m5784c(sb, i, String.valueOf(ozcVar.f55343b[i2] >>> 3), ozcVar.f55344c[i2]);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m5784c(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m5784c(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m5784c(sb, i, str, (Map.Entry) it2.next());
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
            zzht zzhtVar = zzht.f12293b;
            sb.append(led.m16157b(new zzid(((String) obj).getBytes(noc.f53082a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzht) {
            sb.append(": \"");
            sb.append(led.m16157b((zzht) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC1034s) {
            sb.append(" {");
            m5783b((AbstractC1034s) obj, sb, i + 2);
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
        m5784c(sb, i4, "key", entry.getKey());
        m5784c(sb, i4, "value", entry.getValue());
        sb.append("\n");
        while (i2 < i) {
            sb.append(' ');
            i2++;
        }
        sb.append("}");
    }
}
