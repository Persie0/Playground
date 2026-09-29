package cc;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.C2852t9;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p176ib.C6272i;

/* JADX INFO: renamed from: cc.k3 */
/* JADX INFO: loaded from: classes.dex */
public final class C1860k3 extends AbstractC1772a5 {

    /* JADX INFO: renamed from: H */
    public final C1842i3 f9937H;

    /* JADX INFO: renamed from: I */
    public final C1842i3 f9938I;

    /* JADX INFO: renamed from: c */
    public char f9939c;

    /* JADX INFO: renamed from: d */
    public long f9940d;

    /* JADX INFO: renamed from: e */
    public String f9941e;

    /* JADX INFO: renamed from: f */
    public final C1842i3 f9942f;

    /* JADX INFO: renamed from: g */
    public final C1842i3 f9943g;

    /* JADX INFO: renamed from: h */
    public final C1842i3 f9944h;

    /* JADX INFO: renamed from: i */
    public final C1842i3 f9945i;

    /* JADX INFO: renamed from: j */
    public final C1842i3 f9946j;

    /* JADX INFO: renamed from: k */
    public final C1842i3 f9947k;

    /* JADX INFO: renamed from: l */
    public final C1842i3 f9948l;

    public C1860k3(C1897o4 c1897o4) {
        super(c1897o4);
        this.f9939c = (char) 0;
        this.f9940d = -1L;
        this.f9942f = new C1842i3(this, 6, false, false);
        this.f9943g = new C1842i3(this, 6, true, false);
        this.f9944h = new C1842i3(this, 6, false, true);
        this.f9945i = new C1842i3(this, 5, false, false);
        this.f9946j = new C1842i3(this, 5, true, false);
        this.f9947k = new C1842i3(this, 5, false, true);
        this.f9948l = new C1842i3(this, 4, false, false);
        this.f9937H = new C1842i3(this, 3, false, false);
        this.f9938I = new C1842i3(this, 2, false, false);
    }

    /* JADX INFO: renamed from: q */
    public static C1851j3 m5700q(String str) {
        if (str == null) {
            return null;
        }
        return new C1851j3(str);
    }

    /* JADX INFO: renamed from: r */
    public static String m5701r(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        String strM5702s = m5702s(obj, z10);
        String strM5702s2 = m5702s(obj2, z10);
        String strM5702s3 = m5702s(obj3, z10);
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strM5702s)) {
            sb2.append(str2);
            sb2.append(strM5702s);
            str2 = str3;
        }
        if (TextUtils.isEmpty(strM5702s2)) {
            str3 = str2;
        } else {
            sb2.append(str2);
            sb2.append(strM5702s2);
        }
        if (!TextUtils.isEmpty(strM5702s3)) {
            sb2.append(str3);
            sb2.append(strM5702s3);
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: s */
    public static String m5702s(Object obj, boolean z10) {
        String str = "";
        if (obj == null) {
            return str;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z10) {
                return obj.toString();
            }
            Long l10 = (Long) obj;
            if (Math.abs(l10.longValue()) < 100) {
                return obj.toString();
            }
            char cCharAt = obj.toString().charAt(0);
            String strValueOf = String.valueOf(Math.abs(l10.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            StringBuilder sb2 = new StringBuilder();
            str = cCharAt == '-' ? "-" : "";
            sb2.append(str);
            sb2.append(jRound);
            sb2.append("...");
            sb2.append(str);
            sb2.append(jRound2);
            return sb2.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof C1851j3) {
                return ((C1851j3) obj).f9916a;
            }
            return z10 ? "-" : obj.toString();
        }
        Throwable th2 = (Throwable) obj;
        StringBuilder sb3 = new StringBuilder(z10 ? th2.getClass().getName() : th2.toString());
        String strM5703t = m5703t(C1897o4.class.getCanonicalName());
        for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
            if (!stackTraceElement.isNativeMethod()) {
                String className = stackTraceElement.getClassName();
                if (className != null && m5703t(className).equals(strM5703t)) {
                    sb3.append(": ");
                    sb3.append(stackTraceElement);
                    break;
                }
            }
        }
        return sb3.toString();
    }

    /* JADX INFO: renamed from: t */
    public static String m5703t(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            return str.substring(0, iLastIndexOf);
        }
        C2852t9.f14445b.zza().zza();
        return ((Boolean) C1985y2.f10376s0.m5912a(null)).booleanValue() ? "" : str;
    }

    @Override // cc.AbstractC1772a5
    /* JADX INFO: renamed from: h */
    public final boolean mo5491h() {
        return false;
    }

    /* JADX INFO: renamed from: l */
    public final C1842i3 m5704l() {
        return this.f9937H;
    }

    /* JADX INFO: renamed from: m */
    public final C1842i3 m5705m() {
        return this.f9942f;
    }

    /* JADX INFO: renamed from: n */
    public final C1842i3 m5706n() {
        return this.f9938I;
    }

    /* JADX INFO: renamed from: o */
    public final C1842i3 m5707o() {
        return this.f9945i;
    }

    /* JADX INFO: renamed from: p */
    public final C1842i3 m5708p() {
        return this.f9947k;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @EnsuresNonNull({"logTagDoNotUseDirectly"})
    /* JADX INFO: renamed from: u */
    public final String m5709u() {
        String str;
        synchronized (this) {
            try {
                if (this.f9941e == null) {
                    InterfaceC1781b5 interfaceC1781b5 = this.f10430a;
                    if (((C1897o4) interfaceC1781b5).f10081d != null) {
                        this.f9941e = ((C1897o4) interfaceC1781b5).f10081d;
                    } else {
                        ((C1897o4) ((C1897o4) interfaceC1781b5).f10084g.f10430a).getClass();
                        this.f9941e = "FA";
                    }
                }
                C6272i.m12915i(this.f9941e);
                str = this.f9941e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: v */
    public final void m5710v(int i10, boolean z10, boolean z11, String str, Object obj, Object obj2, Object obj3) {
        if (!z10 && Log.isLoggable(m5709u(), i10)) {
            Log.println(i10, m5709u(), m5701r(false, str, obj, obj2, obj3));
        }
        if (!z11 && i10 >= 5) {
            C6272i.m12915i(str);
            C1879m4 c1879m4 = ((C1897o4) this.f10430a).f10087j;
            if (c1879m4 == null) {
                Log.println(6, m5709u(), "Scheduler not set. Not logging error/warn");
            } else if (!c1879m4.f9672b) {
                Log.println(6, m5709u(), "Scheduler not initialized. Not logging error/warn");
            } else {
                if (i10 >= 9) {
                    i10 = 8;
                }
                c1879m4.m5753p(new RunnableC1833h3(this, i10, str, obj, obj2, obj3));
            }
        }
    }
}
