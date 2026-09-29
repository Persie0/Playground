package p000;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class dg4 implements eg4 {

    /* JADX INFO: renamed from: a */
    public final JSONObject f35593a;

    public dg4(JSONObject jSONObject) {
        this.f35593a = jSONObject;
    }

    /* JADX INFO: renamed from: c */
    public static dg4 m10328c() {
        return new dg4(new JSONObject());
    }

    /* JADX INFO: renamed from: d */
    public static dg4 m10329d(String str, boolean z) {
        try {
            return new dg4(new JSONObject(str));
        } catch (Exception unused) {
            if (z) {
                return new dg4(new JSONObject());
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: A */
    public final synchronized boolean m10330A(String str, long j) {
        return m10334b(Long.valueOf(j), str);
    }

    /* JADX INFO: renamed from: B */
    public final synchronized boolean m10331B(String str, String str2) {
        return m10334b(str2, str);
    }

    /* JADX INFO: renamed from: C */
    public final synchronized rf4 m10332C() {
        return new rf4(this);
    }

    /* JADX INFO: renamed from: a */
    public final Object m10333a(String str) {
        Object objOpt = this.f35593a.opt(str);
        if (objOpt == null) {
            return null;
        }
        return b34.m3238e0(objOpt);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m10334b(Object obj, String str) {
        try {
            this.f35593a.put(str, b34.m3233b0(obj));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized boolean m10335e(Object obj, String str) {
        Object objM10333a;
        try {
            objM10333a = m10333a(str);
            if (obj instanceof rf4) {
                objM10333a = rf4.m20645e(objM10333a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return b34.m3254v(obj, objM10333a);
    }

    public final synchronized boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (dg4.class == obj.getClass()) {
                dg4 dg4Var = (dg4) obj;
                if (m10348r() != dg4Var.m10348r()) {
                    return false;
                }
                if (m10348r() == 0) {
                    return true;
                }
                Iterator<String> itKeys = this.f35593a.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object objM10333a = m10333a(next);
                    if (objM10333a == null || !dg4Var.m10335e(objM10333a, next)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized dg4 m10336f() {
        return m10329d(this.f35593a.toString(), true);
    }

    /* JADX INFO: renamed from: g */
    public final synchronized Boolean m10337g(String str, Boolean bool) {
        return b34.m3209D(m10333a(str), bool);
    }

    /* JADX INFO: renamed from: h */
    public final synchronized Double m10338h(String str, Double d) {
        return b34.m3210E(m10333a(str), d);
    }

    public final synchronized int hashCode() {
        return toString().hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final synchronized Integer m10339i(Integer num, String str) {
        Integer numM3211F = b34.m3211F(m10333a(str));
        if (numM3211F != null) {
            num = numM3211F;
        }
        return num;
    }

    /* JADX INFO: renamed from: j */
    public final synchronized ff4 m10340j(String str, boolean z) {
        return b34.m3213H(m10333a(str), z);
    }

    /* JADX INFO: renamed from: k */
    public final synchronized rf4 m10341k(String str, boolean z) {
        Object objM10333a = m10333a(str);
        if (objM10333a == null && !z) {
            return null;
        }
        return rf4.m20645e(objM10333a);
    }

    /* JADX INFO: renamed from: l */
    public final synchronized eg4 m10342l(String str, boolean z) {
        return b34.m3215J(m10333a(str), z);
    }

    /* JADX INFO: renamed from: m */
    public final synchronized Long m10343m(String str, Long l) {
        return b34.m3216K(m10333a(str), l);
    }

    /* JADX INFO: renamed from: n */
    public final synchronized String m10344n(String str, String str2) {
        String strM3217L = b34.m3217L(m10333a(str));
        if (strM3217L != null) {
            str2 = strM3217L;
        }
        return str2;
    }

    /* JADX INFO: renamed from: o */
    public final synchronized boolean m10345o(String str) {
        return this.f35593a.has(str);
    }

    /* JADX INFO: renamed from: p */
    public final synchronized void m10346p(eg4 eg4Var) {
        JSONObject jSONObject;
        try {
            dg4 dg4Var = (dg4) eg4Var;
            synchronized (dg4Var) {
                jSONObject = dg4Var.f35593a;
            }
            dg4 dg4Var2 = new dg4(jSONObject);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objM10333a = dg4Var2.m10333a(next);
                if (objM10333a != null) {
                    m10334b(objM10333a, next);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: q */
    public final synchronized ArrayList m10347q() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> itKeys = this.f35593a.keys();
        while (itKeys.hasNext()) {
            arrayList.add(itKeys.next());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: r */
    public final synchronized int m10348r() {
        return this.f35593a.length();
    }

    /* JADX INFO: renamed from: s */
    public final synchronized String m10349s() {
        try {
        } catch (Exception unused) {
            return "{}";
        }
        return this.f35593a.toString(2).replace("\\/", "/");
    }

    /* JADX INFO: renamed from: t */
    public final synchronized boolean m10350t(String str) {
        return this.f35593a.remove(str) != null;
    }

    public final synchronized String toString() {
        String string;
        string = this.f35593a.toString();
        if (string == null) {
            string = "{}";
        }
        return string;
    }

    /* JADX INFO: renamed from: u */
    public final synchronized boolean m10351u(String str, boolean z) {
        return m10334b(Boolean.valueOf(z), str);
    }

    /* JADX INFO: renamed from: v */
    public final synchronized boolean m10352v(double d, String str) {
        return m10334b(Double.valueOf(d), str);
    }

    /* JADX INFO: renamed from: w */
    public final synchronized boolean m10353w(int i, String str) {
        return m10334b(Integer.valueOf(i), str);
    }

    /* JADX INFO: renamed from: x */
    public final synchronized boolean m10354x(String str, ff4 ff4Var) {
        return m10334b(ff4Var, str);
    }

    /* JADX INFO: renamed from: y */
    public final synchronized boolean m10355y(String str, rf4 rf4Var) {
        return m10334b(rf4Var.f59203a, str);
    }

    /* JADX INFO: renamed from: z */
    public final synchronized boolean m10356z(String str, eg4 eg4Var) {
        return m10334b(eg4Var, str);
    }
}
