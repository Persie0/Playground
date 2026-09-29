package cc;

import ae.C0062b;
import android.os.Bundle;
import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzaw;
import com.kochava.core.BuildConfig;
import dm.C5212l;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import p080e.C5288t;
import p176ib.C6272i;
import p338qd.C8573r0;

/* JADX INFO: renamed from: cc.f3 */
/* JADX INFO: loaded from: classes.dex */
public final class C1815f3 {

    /* JADX INFO: renamed from: b */
    public static final AtomicReference f9793b = new AtomicReference();

    /* JADX INFO: renamed from: c */
    public static final AtomicReference f9794c = new AtomicReference();

    /* JADX INFO: renamed from: d */
    public static final AtomicReference f9795d = new AtomicReference();

    /* JADX INFO: renamed from: a */
    public final C5288t f9796a;

    public C1815f3(C5288t c5288t) {
        this.f9796a = c5288t;
    }

    /* JADX INFO: renamed from: g */
    public static final String m5599g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        C6272i.m12915i(atomicReference);
        C6272i.m12908b(strArr.length == strArr2.length);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            Object obj = strArr[i10];
            if (str == obj || str.equals(obj)) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i10];
                    if (str2 == null) {
                        str2 = strArr2[i10] + "(" + strArr[i10] + ")";
                        strArr3[i10] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: a */
    public final String m5600a(Object[] objArr) {
        if (objArr == null) {
            return BuildConfig.SDK_PERMISSIONS;
        }
        StringBuilder sbM771r = C0166e.m771r("[");
        for (Object obj : objArr) {
            String strM5601b = obj instanceof Bundle ? m5601b((Bundle) obj) : String.valueOf(obj);
            if (strM5601b != null) {
                if (sbM771r.length() != 1) {
                    sbM771r.append(", ");
                }
                sbM771r.append(strM5601b);
            }
        }
        sbM771r.append("]");
        return sbM771r.toString();
    }

    /* JADX INFO: renamed from: b */
    public final String m5601b(Bundle bundle) {
        String strM5600a;
        if (bundle == null) {
            return null;
        }
        if (!this.f9796a.m11409h()) {
            return bundle.toString();
        }
        StringBuilder sbM771r = C0166e.m771r("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sbM771r.length() != 8) {
                sbM771r.append(", ");
            }
            sbM771r.append(m5604e(str));
            sbM771r.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                strM5600a = m5600a(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                strM5600a = m5600a((Object[]) obj);
            } else {
                strM5600a = obj instanceof ArrayList ? m5600a(((ArrayList) obj).toArray()) : String.valueOf(obj);
            }
            sbM771r.append(strM5600a);
        }
        sbM771r.append("}]");
        return sbM771r.toString();
    }

    /* JADX INFO: renamed from: c */
    public final String m5602c(zzaw zzawVar) {
        String string;
        C5288t c5288t = this.f9796a;
        if (!c5288t.m11409h()) {
            return zzawVar.toString();
        }
        StringBuilder sb2 = new StringBuilder("origin=");
        sb2.append(zzawVar.f14615c);
        sb2.append(",name=");
        sb2.append(m5603d(zzawVar.f14613a));
        sb2.append(",params=");
        zzau zzauVar = zzawVar.f14614b;
        if (zzauVar == null) {
            string = null;
        } else {
            string = !c5288t.m11409h() ? zzauVar.toString() : m5601b(zzauVar.m8535q());
        }
        sb2.append(string);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: d */
    public final String m5603d(String str) {
        if (str == null) {
            return null;
        }
        return !this.f9796a.m11409h() ? str : m5599g(str, C5212l.f33285d, C5212l.f33283b, f9793b);
    }

    /* JADX INFO: renamed from: e */
    public final String m5604e(String str) {
        if (str == null) {
            return null;
        }
        return !this.f9796a.m11409h() ? str : m5599g(str, C0062b.f156c, C0062b.f155b, f9794c);
    }

    /* JADX INFO: renamed from: f */
    public final String m5605f(String str) {
        if (str == null) {
            return null;
        }
        if (this.f9796a.m11409h()) {
            return str.startsWith("_exp_") ? C0141b.m611g("experiment_id(", str, ")") : m5599g(str, C8573r0.f45968e, C8573r0.f45967d, f9795d);
        }
        return str;
    }
}
