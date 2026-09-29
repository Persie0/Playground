package p534zf;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import p349qo.C8656b;

/* JADX INFO: renamed from: zf.e */
/* JADX INFO: loaded from: classes.dex */
public final class C10487e implements InterfaceC10488f {

    /* JADX INFO: renamed from: a */
    public final JSONObject f52418a;

    public C10487e(JSONObject jSONObject) {
        this.f52418a = jSONObject;
    }

    /* JADX INFO: renamed from: u */
    public static C10487e m19445u() {
        return new C10487e(new JSONObject());
    }

    /* JADX INFO: renamed from: v */
    public static C10487e m19446v(String str, boolean z10) {
        try {
            return new C10487e(new JSONObject(str));
        } catch (Exception unused) {
            if (z10) {
                return new C10487e(new JSONObject());
            }
            return null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: A */
    public final synchronized boolean m19447A(String str, InterfaceC10484b interfaceC10484b) {
        return m19470t(interfaceC10484b, str);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: B */
    public final synchronized boolean m19448B(InterfaceC10488f interfaceC10488f, String str) {
        return m19470t(interfaceC10488f, str);
    }

    /* JADX INFO: renamed from: C */
    public final synchronized boolean m19449C(String str, long j10) {
        return m19470t(Long.valueOf(j10), str);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: D */
    public final synchronized boolean m19450D(String str, String str2) {
        return m19470t(str2, str);
    }

    @Override // p534zf.InterfaceC10488f
    /* JADX INFO: renamed from: a */
    public final synchronized C10487e mo19451a() {
        try {
        } finally {
        }
        return m19446v(this.f52418a.toString(), true);
    }

    @Override // p534zf.InterfaceC10488f
    /* JADX INFO: renamed from: b */
    public final synchronized String mo19452b() {
        try {
        } catch (Exception unused) {
            return "{}";
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f52418a.toString(2);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p534zf.InterfaceC10488f
    /* JADX INFO: renamed from: c */
    public final synchronized C10487e mo19453c(InterfaceC10488f interfaceC10488f) {
        C10487e c10487e;
        c10487e = new C10487e(new JSONObject());
        JSONObject jSONObjectMo19456f = interfaceC10488f.mo19456f();
        C10487e c10487e2 = new C10487e(jSONObjectMo19456f);
        Iterator<String> itKeys = jSONObjectMo19456f.keys();
        while (true) {
            while (true) {
                if (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object objM19469s = c10487e2.m19469s(next);
                    if (objM19469s != null) {
                        if (!m19471w(objM19469s, next)) {
                            c10487e.m19470t(objM19469s, next);
                        }
                    }
                }
            }
        }
        return c10487e;
    }

    @Override // p534zf.InterfaceC10488f
    /* JADX INFO: renamed from: d */
    public final synchronized InterfaceC10488f mo19454d(String str, boolean z10) {
        return C8656b.m16887N(m19469s(str), z10);
    }

    @Override // p534zf.InterfaceC10488f
    /* JADX INFO: renamed from: e */
    public final synchronized InterfaceC10484b mo19455e(String str) {
        return C8656b.m16884K(m19469s(str));
    }

    public final synchronized boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (C10487e.class == obj.getClass()) {
                C10487e c10487e = (C10487e) obj;
                if (length() != c10487e.length()) {
                    return false;
                }
                if (length() == 0) {
                    return true;
                }
                Iterator<String> itKeys = this.f52418a.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object objM19469s = m19469s(next);
                    if (objM19469s != null && c10487e.m19471w(objM19469s, next)) {
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @Override // p534zf.InterfaceC10488f
    /* JADX INFO: renamed from: f */
    public final synchronized JSONObject mo19456f() {
        return this.f52418a;
    }

    @Override // p534zf.InterfaceC10488f
    /* JADX INFO: renamed from: g */
    public final synchronized C10485c mo19457g(String str) {
        return C10485c.m19442e(m19469s(str));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p534zf.InterfaceC10488f
    /* JADX INFO: renamed from: h */
    public final synchronized boolean mo19458h(String str, InterfaceC10486d interfaceC10486d) {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return m19470t(((C10485c) interfaceC10486d).f52417a, str);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final synchronized int hashCode() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return toString().hashCode();
    }

    @Override // p534zf.InterfaceC10488f
    /* JADX INFO: renamed from: i */
    public final synchronized Long mo19459i(String str, Long l10) {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return C8656b.m16888O(m19469s(str), l10);
    }

    @Override // p534zf.InterfaceC10488f
    /* JADX INFO: renamed from: j */
    public final synchronized ArrayList mo19460j() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator<String> itKeys = this.f52418a.keys();
            while (itKeys.hasNext()) {
                arrayList.add(itKeys.next());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    @Override // p534zf.InterfaceC10488f
    /* JADX INFO: renamed from: k */
    public final synchronized C10485c mo19461k() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return new C10485c(this);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p534zf.InterfaceC10488f
    /* JADX INFO: renamed from: l */
    public final synchronized Double mo19462l(String str, Double d10) {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return C8656b.m16882I(m19469s(str), d10);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p534zf.InterfaceC10488f
    public final synchronized int length() {
        try {
        } finally {
        }
        return this.f52418a.length();
    }

    @Override // p534zf.InterfaceC10488f
    /* JADX INFO: renamed from: m */
    public final synchronized boolean mo19463m(String str) {
        return this.f52418a.has(str);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p534zf.InterfaceC10488f
    /* JADX INFO: renamed from: n */
    public final synchronized void mo19464n(InterfaceC10488f interfaceC10488f) {
        try {
            JSONObject jSONObjectMo19456f = interfaceC10488f.mo19456f();
            C10487e c10487e = new C10487e(jSONObjectMo19456f);
            Iterator<String> itKeys = jSONObjectMo19456f.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objM19469s = c10487e.m19469s(next);
                if (objM19469s != null) {
                    m19470t(objM19469s, next);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p534zf.InterfaceC10488f
    /* JADX INFO: renamed from: o */
    public final synchronized boolean mo19465o(String str) {
        try {
        } finally {
        }
        return this.f52418a.remove(str) != null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p534zf.InterfaceC10488f
    /* JADX INFO: renamed from: p */
    public final synchronized Integer mo19466p(Integer num, String str) {
        try {
            Integer numM16883J = C8656b.m16883J(m19469s(str));
            if (numM16883J != null) {
                num = numM16883J;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return num;
    }

    @Override // p534zf.InterfaceC10488f
    /* JADX INFO: renamed from: q */
    public final synchronized String mo19467q(String str, String str2) {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return C8656b.m16889P(m19469s(str), str2);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p534zf.InterfaceC10488f
    /* JADX INFO: renamed from: r */
    public final synchronized Boolean mo19468r(String str, Boolean bool) {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return C8656b.m16881H(m19469s(str), bool);
    }

    /* JADX INFO: renamed from: s */
    public final Object m19469s(String str) {
        Object c10483a;
        Object objOpt = this.f52418a.opt(str);
        if (objOpt == null) {
            return null;
        }
        if (objOpt instanceof JSONObject) {
            c10483a = new C10487e((JSONObject) objOpt);
        } else {
            if (!(objOpt instanceof JSONArray)) {
                return objOpt;
            }
            c10483a = new C10483a((JSONArray) objOpt);
        }
        return c10483a;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m19470t(Object obj, String str) {
        try {
            JSONObject jSONObject = this.f52418a;
            if (obj instanceof InterfaceC10488f) {
                obj = ((InterfaceC10488f) obj).mo19456f();
            } else if (obj instanceof InterfaceC10484b) {
                obj = ((InterfaceC10484b) obj).mo19435e();
            }
            jSONObject.put(str, obj);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p534zf.InterfaceC10488f
    public final synchronized String toString() {
        String string;
        try {
            string = this.f52418a.toString();
            if (string == null) {
                string = "{}";
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return string;
    }

    /* JADX INFO: renamed from: w */
    public final synchronized boolean m19471w(Object obj, String str) {
        Object objM19469s;
        objM19469s = m19469s(str);
        if (obj instanceof InterfaceC10486d) {
            objM19469s = C10485c.m19442e(objM19469s);
        }
        return C8656b.m16875B(obj, objM19469s);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: x */
    public final synchronized boolean m19472x(String str, boolean z10) {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return m19470t(Boolean.valueOf(z10), str);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: y */
    public final synchronized boolean m19473y(String str, double d10) {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return m19470t(Double.valueOf(d10), str);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: z */
    public final synchronized boolean m19474z(String str, int i10) {
        return m19470t(Integer.valueOf(i10), str);
    }
}
