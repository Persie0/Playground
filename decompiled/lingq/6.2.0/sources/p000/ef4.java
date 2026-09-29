package p000;

import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public final class ef4 implements ff4 {

    /* JADX INFO: renamed from: a */
    public final JSONArray f37181a;

    public ef4(JSONArray jSONArray) {
        this.f37181a = jSONArray;
    }

    /* JADX INFO: renamed from: d */
    public static ef4 m11088d() {
        return new ef4(new JSONArray());
    }

    /* JADX INFO: renamed from: a */
    public final Object m11089a(int i) {
        Object objOpt = this.f37181a.opt(i);
        if (objOpt == null) {
            return null;
        }
        return b34.m3238e0(objOpt);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m11090b(Object obj) {
        this.f37181a.put(b34.m3233b0(obj));
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized boolean m11091c(dg4 dg4Var) {
        m11090b(dg4Var);
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized eg4 m11092e(int i) {
        return b34.m3215J(m11089a(i), false);
    }

    public final synchronized boolean equals(Object obj) {
        boolean zM3254v;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            try {
                if (ef4.class == obj.getClass()) {
                    ef4 ef4Var = (ef4) obj;
                    if (m11093f() != ef4Var.m11093f()) {
                        return false;
                    }
                    if (m11093f() == 0) {
                        return true;
                    }
                    for (int i = 0; i < m11093f(); i++) {
                        Object objM11089a = m11089a(i);
                        if (objM11089a != null) {
                            synchronized (ef4Var) {
                                try {
                                    Object objM11089a2 = ef4Var.m11089a(i);
                                    if (objM11089a instanceof rf4) {
                                        objM11089a2 = rf4.m20645e(objM11089a2);
                                    }
                                    zM3254v = b34.m3254v(objM11089a, objM11089a2);
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            if (zM3254v) {
                            }
                        }
                        return false;
                    }
                    return true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized int m11093f() {
        return this.f37181a.length();
    }

    /* JADX INFO: renamed from: g */
    public final synchronized String m11094g() {
        try {
        } catch (Exception unused) {
            return "[]";
        }
        return this.f37181a.toString(2).replace("\\/", "/");
    }

    public final synchronized int hashCode() {
        return toString().hashCode();
    }

    public final synchronized String toString() {
        String string;
        string = this.f37181a.toString();
        if (string == null) {
            string = "[]";
        }
        return string;
    }
}
