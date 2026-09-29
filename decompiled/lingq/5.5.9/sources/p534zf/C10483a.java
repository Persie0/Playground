package p534zf;

import com.kochava.core.BuildConfig;
import org.json.JSONArray;
import org.json.JSONObject;
import p349qo.C8656b;

/* JADX INFO: renamed from: zf.a */
/* JADX INFO: loaded from: classes.dex */
public final class C10483a implements InterfaceC10484b {

    /* JADX INFO: renamed from: a */
    public final JSONArray f52414a;

    public C10483a(JSONArray jSONArray) {
        this.f52414a = jSONArray;
    }

    /* JADX INFO: renamed from: i */
    public static C10483a m19430i() {
        return new C10483a(new JSONArray());
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p534zf.InterfaceC10484b
    /* JADX INFO: renamed from: a */
    public final synchronized String mo19431a(int i10) {
        return C8656b.m16889P(m19436f(i10), null);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p534zf.InterfaceC10484b
    /* JADX INFO: renamed from: b */
    public final synchronized String mo19432b() {
        try {
        } catch (Exception unused) {
            return BuildConfig.SDK_PERMISSIONS;
        }
        return this.f52414a.toString(2);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p534zf.InterfaceC10484b
    /* JADX INFO: renamed from: c */
    public final synchronized Double mo19433c(int i10) {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return C8656b.m16882I(m19436f(i10), null);
    }

    @Override // p534zf.InterfaceC10484b
    /* JADX INFO: renamed from: d */
    public final synchronized InterfaceC10488f mo19434d(int i10) {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return C8656b.m16887N(m19436f(i10), false);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p534zf.InterfaceC10484b
    /* JADX INFO: renamed from: e */
    public final synchronized JSONArray mo19435e() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f52414a;
    }

    public final synchronized boolean equals(Object obj) {
        boolean zM16875B;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (C10483a.class == obj.getClass()) {
                C10483a c10483a = (C10483a) obj;
                if (length() != c10483a.length()) {
                    return false;
                }
                if (length() == 0) {
                    return true;
                }
                for (int i10 = 0; i10 < length(); i10++) {
                    Object objM19436f = m19436f(i10);
                    if (objM19436f != null) {
                        synchronized (c10483a) {
                            Object objM19436f2 = c10483a.m19436f(i10);
                            if (objM19436f instanceof InterfaceC10486d) {
                                objM19436f2 = C10485c.m19442e(objM19436f2);
                            }
                            zM16875B = C8656b.m16875B(objM19436f, objM19436f2);
                        }
                        if (zM16875B) {
                        }
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final Object m19436f(int i10) {
        Object c10483a;
        Object objOpt = this.f52414a.opt(i10);
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

    /* JADX INFO: renamed from: g */
    public final boolean m19437g(Object obj) {
        JSONArray jSONArray = this.f52414a;
        if (obj instanceof InterfaceC10488f) {
            obj = ((InterfaceC10488f) obj).mo19456f();
        } else if (obj instanceof InterfaceC10484b) {
            obj = ((InterfaceC10484b) obj).mo19435e();
        }
        jSONArray.put(obj);
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final synchronized boolean m19438h(InterfaceC10488f interfaceC10488f) {
        try {
            m19437g(interfaceC10488f);
        } catch (Throwable th2) {
            throw th2;
        }
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final synchronized int hashCode() {
        return toString().hashCode();
    }

    @Override // p534zf.InterfaceC10484b
    public final synchronized int length() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f52414a.length();
    }

    public final synchronized String toString() {
        String string;
        try {
            string = this.f52414a.toString();
            if (string == null) {
                string = BuildConfig.SDK_PERMISSIONS;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return string;
    }
}
