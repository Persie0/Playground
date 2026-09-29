package p000;

import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class xcc extends ooc {

    /* JADX INFO: renamed from: H */
    public final occ f68075H;

    /* JADX INFO: renamed from: I */
    public final occ f68076I;

    /* JADX INFO: renamed from: c */
    public char f68077c;

    /* JADX INFO: renamed from: d */
    public long f68078d;

    /* JADX INFO: renamed from: e */
    public String f68079e;

    /* JADX INFO: renamed from: f */
    public final occ f68080f;

    /* JADX INFO: renamed from: g */
    public final occ f68081g;

    /* JADX INFO: renamed from: h */
    public final occ f68082h;

    /* JADX INFO: renamed from: i */
    public final occ f68083i;

    /* JADX INFO: renamed from: j */
    public final occ f68084j;

    /* JADX INFO: renamed from: k */
    public final occ f68085k;

    /* JADX INFO: renamed from: l */
    public final occ f68086l;

    public xcc(kjc kjcVar) {
        super(kjcVar);
        this.f68077c = (char) 0;
        this.f68078d = -1L;
        this.f68080f = new occ(this, 6, false, false);
        this.f68081g = new occ(this, 6, true, false);
        this.f68082h = new occ(this, 6, false, true);
        this.f68083i = new occ(this, 5, false, false);
        this.f68084j = new occ(this, 5, true, false);
        this.f68085k = new occ(this, 5, false, true);
        this.f68086l = new occ(this, 4, false, false);
        this.f68075H = new occ(this, 3, false, false);
        this.f68076I = new occ(this, 2, false, false);
    }

    /* JADX INFO: renamed from: L */
    public static scc m24449L(String str) {
        if (str == null) {
            return null;
        }
        return new scc(str);
    }

    /* JADX INFO: renamed from: O */
    public static String m24450O(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String strM24451P = m24451P(obj, z);
        String strM24451P2 = m24451P(obj2, z);
        String strM24451P3 = m24451P(obj3, z);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strM24451P)) {
            sb.append(str2);
            sb.append(strM24451P);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strM24451P2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strM24451P2);
        }
        if (!TextUtils.isEmpty(strM24451P3)) {
            sb.append(str3);
            sb.append(strM24451P3);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: P */
    public static String m24451P(Object obj, boolean z) {
        int iLastIndexOf;
        String className;
        int iLastIndexOf2;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            char cCharAt = obj.toString().charAt(0);
            String strValueOf = String.valueOf(Math.abs(l.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            int length = String.valueOf(jRound).length();
            String str = cCharAt == '-' ? "-" : "";
            StringBuilder sb = new StringBuilder(str.length() + str.length() + length + 3 + String.valueOf(jRound2).length());
            sb.append(str);
            sb.append(jRound);
            sb.append("...");
            sb.append(str);
            sb.append(jRound2);
            return sb.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof scc) {
                return ((scc) obj).m21241a();
            }
            return z ? "-" : obj.toString();
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
        String canonicalName = kjc.class.getCanonicalName();
        String strSubstring = (TextUtils.isEmpty(canonicalName) || (iLastIndexOf = canonicalName.lastIndexOf(46)) == -1) ? "" : canonicalName.substring(0, iLastIndexOf);
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                if (((TextUtils.isEmpty(className) || (iLastIndexOf2 = className.lastIndexOf(46)) == -1) ? "" : className.substring(0, iLastIndexOf2)).equals(strSubstring)) {
                    sb2.append(": ");
                    sb2.append(stackTraceElement);
                    break;
                }
            }
        }
        return sb2.toString();
    }

    @Override // p000.ooc
    /* JADX INFO: renamed from: E */
    public final boolean mo12250E() {
        return false;
    }

    /* JADX INFO: renamed from: H */
    public final occ m24452H() {
        return this.f68080f;
    }

    /* JADX INFO: renamed from: I */
    public final occ m24453I() {
        return this.f68083i;
    }

    /* JADX INFO: renamed from: J */
    public final occ m24454J() {
        return this.f68075H;
    }

    /* JADX INFO: renamed from: K */
    public final occ m24455K() {
        return this.f68076I;
    }

    /* JADX INFO: renamed from: M */
    public final void m24456M(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(m24457N(), i)) {
            Log.println(i, m24457N(), m24450O(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        lda.m16130p(str);
        tic ticVar = ((kjc) this.f60774a).f47439g;
        if (ticVar == null) {
            Log.println(6, m24457N(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!ticVar.f54663b) {
                Log.println(6, m24457N(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i >= 9) {
                i = 8;
            }
            ticVar.m22076M(new jcc(this, i, str, obj, obj2, obj3));
        }
    }

    /* JADX INFO: renamed from: N */
    public final String m24457N() {
        String str;
        synchronized (this) {
            try {
                if (this.f68079e == null) {
                    ((kjc) ((kjc) this.f60774a).f47436d.f60774a).getClass();
                    this.f68079e = "FA";
                }
                lda.m16130p(this.f68079e);
                str = this.f68079e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
