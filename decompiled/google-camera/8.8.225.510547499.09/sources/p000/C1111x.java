package p000;

import java.text.ParseException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.TreeMap;

/* JADX INFO: renamed from: x */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1111x extends C0868o {

    /* JADX INFO: renamed from: b */
    public Map f47980b;

    /* JADX INFO: renamed from: c */
    public Map f47981c;

    /* JADX INFO: renamed from: e */
    private final Map f47982e = new HashMap();

    /* JADX INFO: renamed from: d */
    private static final ResourceBundle f47979d = new C0175f();

    /* JADX INFO: renamed from: a */
    public static final C1111x f47978a = new C1111x();

    private C1111x() {
    }

    /* JADX INFO: renamed from: a */
    public final C1084w m19536a(String str) {
        boolean zContainsKey;
        C1030u c1030uM19514a;
        C1084w c1084w;
        Object[][] objArr;
        synchronized (this.f47982e) {
            zContainsKey = this.f47982e.containsKey(str);
            c1030uM19514a = null;
            c1084w = zContainsKey ? (C1084w) this.f47982e.get(str) : null;
        }
        if (!zContainsKey) {
            try {
                Object[][] objArr2 = (Object[][]) f47979d.getObject("rules");
                int length = objArr2.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        objArr = null;
                        break;
                    }
                    Object[] objArr3 = objArr2[i];
                    if (str.equals(objArr3[0])) {
                        objArr = (Object[][]) objArr3[1];
                        break;
                    }
                    i++;
                }
                StringBuilder sb = new StringBuilder();
                for (Object[] objArr4 : objArr) {
                    if (sb.length() > 0) {
                        sb.append("; ");
                    }
                    sb.append((String) objArr4[0]);
                    sb.append(": ");
                    sb.append((String) objArr4[1]);
                }
                String string = sb.toString();
                C1084w c1084w2 = C1084w.f47887a;
                String strTrim = string.trim();
                if (strTrim.length() == 0) {
                    c1084w = C1084w.f47887a;
                } else {
                    C1057v c1057v = new C1057v();
                    if (strTrim.endsWith(";")) {
                        strTrim = strTrim.substring(0, strTrim.length() - 1);
                    }
                    for (String str2 : C1084w.f47893g.split(strTrim)) {
                        C1030u c1030uM19514a2 = C1084w.m19514a(str2.trim());
                        c1057v.f47799a = c1057v.f47799a | (c1030uM19514a2.f47721c == null ? c1030uM19514a2.f47722d != null : true);
                        c1057v.m19460a(c1030uM19514a2);
                    }
                    Iterator it = c1057v.f47800b.iterator();
                    while (it.hasNext()) {
                        C1030u c1030u = (C1030u) it.next();
                        if ("other".equals(c1030u.f47719a)) {
                            it.remove();
                            c1030uM19514a = c1030u;
                        }
                    }
                    if (c1030uM19514a == null) {
                        c1030uM19514a = C1084w.m19514a("other:");
                    }
                    c1057v.f47800b.add(c1030uM19514a);
                    c1084w = new C1084w(c1057v);
                }
            } catch (ParseException e) {
            } catch (MissingResourceException e2) {
            }
            synchronized (this.f47982e) {
                if (this.f47982e.containsKey(str)) {
                    c1084w = (C1084w) this.f47982e.get(str);
                } else {
                    this.f47982e.put(str, c1084w);
                }
            }
        }
        return c1084w;
    }

    /* JADX INFO: renamed from: b */
    public final void m19537b() {
        Map map;
        Map mapEmptyMap;
        Map mapEmptyMap2;
        synchronized (this) {
            map = this.f47980b;
        }
        if (map == null) {
            try {
                ResourceBundle resourceBundle = f47979d;
                Object[][] objArr = (Object[][]) resourceBundle.getObject("locales");
                mapEmptyMap = new TreeMap();
                for (Object[] objArr2 : objArr) {
                    mapEmptyMap.put((String) objArr2[0], (String) objArr2[1]);
                }
                Object[][] objArr3 = (Object[][]) resourceBundle.getObject("locales_ordinals");
                mapEmptyMap2 = new TreeMap();
                for (Object[] objArr4 : objArr3) {
                    mapEmptyMap2.put((String) objArr4[0], (String) objArr4[1]);
                }
            } catch (MissingResourceException e) {
                mapEmptyMap = Collections.emptyMap();
                mapEmptyMap2 = Collections.emptyMap();
            }
            synchronized (this) {
                if (this.f47980b == null) {
                    this.f47980b = mapEmptyMap;
                    this.f47981c = mapEmptyMap2;
                }
            }
        }
    }
}
