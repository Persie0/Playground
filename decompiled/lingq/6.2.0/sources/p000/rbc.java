package p000;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzbh;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class rbc {

    /* JADX INFO: renamed from: b */
    public static final AtomicReference f59048b = new AtomicReference();

    /* JADX INFO: renamed from: c */
    public static final AtomicReference f59049c = new AtomicReference();

    /* JADX INFO: renamed from: d */
    public static final AtomicReference f59050d = new AtomicReference();

    /* JADX INFO: renamed from: a */
    public final ggc f59051a;

    public rbc(ggc ggcVar) {
        this.f59051a = ggcVar;
    }

    /* JADX INFO: renamed from: g */
    public static final String m20571g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        lda.m16130p(atomicReference);
        lda.m16125k(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (Objects.equals(str, strArr[i])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i];
                        if (str2 == null) {
                            str2 = strArr2[i] + "(" + strArr[i] + ")";
                            strArr3[i] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: a */
    public final String m20572a(String str) {
        if (str == null) {
            return null;
        }
        return !this.f59051a.m12590a() ? str : m20571g(str, AbstractC3184kh.f47276r, AbstractC3184kh.f47271m, f59048b);
    }

    /* JADX INFO: renamed from: b */
    public final String m20573b(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f59051a.m12590a()) {
            return str;
        }
        return m20571g(str, syc.f61640b, syc.f61639a, f59049c);
    }

    /* JADX INFO: renamed from: c */
    public final String m20574c(String str) {
        if (str == null) {
            return null;
        }
        if (this.f59051a.m12590a()) {
            return str.startsWith("_exp_") ? wq1.m24118n("experiment_id(", str, ")") : m20571g(str, AbstractC3584sr.f61287n, AbstractC3584sr.f61286m, f59050d);
        }
        return str;
    }

    /* JADX INFO: renamed from: d */
    public final String m20575d(zzbh zzbhVar) {
        String string;
        ggc ggcVar = this.f59051a;
        if (!ggcVar.m12590a()) {
            return zzbhVar.toString();
        }
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(zzbhVar.f12391c);
        sb.append(",name=");
        sb.append(m20572a(zzbhVar.f12389a));
        sb.append(",params=");
        zzbf zzbfVar = zzbhVar.f12390b;
        if (zzbfVar == null) {
            string = null;
        } else {
            string = !ggcVar.m12590a() ? zzbfVar.f12388a.toString() : m20576e(zzbfVar.m5952g0());
        }
        sb.append(string);
        return sb.toString();
    }

    /* JADX INFO: renamed from: e */
    public final String m20576e(Bundle bundle) {
        String strM20577f;
        if (bundle == null) {
            return null;
        }
        if (!this.f59051a.m12590a()) {
            return bundle.toString();
        }
        StringBuilder sbM22997t = ux5.m22997t("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sbM22997t.length() != 8) {
                sbM22997t.append(", ");
            }
            sbM22997t.append(m20573b(str));
            sbM22997t.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                strM20577f = m20577f(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                strM20577f = m20577f((Object[]) obj);
            } else {
                strM20577f = obj instanceof ArrayList ? m20577f(((ArrayList) obj).toArray()) : String.valueOf(obj);
            }
            sbM22997t.append(strM20577f);
        }
        sbM22997t.append("}]");
        return sbM22997t.toString();
    }

    /* JADX INFO: renamed from: f */
    public final String m20577f(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sbM22997t = ux5.m22997t("[");
        for (Object obj : objArr) {
            String strM20576e = obj instanceof Bundle ? m20576e((Bundle) obj) : String.valueOf(obj);
            if (strM20576e != null) {
                if (sbM22997t.length() != 1) {
                    sbM22997t.append(", ");
                }
                sbM22997t.append(strM20576e);
            }
        }
        sbM22997t.append("]");
        return sbM22997t.toString();
    }
}
