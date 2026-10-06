package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mrl {

    /* JADX INFO: renamed from: a */
    public boolean f41475a;

    /* JADX INFO: renamed from: b */
    private final String f41476b;

    /* JADX INFO: renamed from: c */
    private final mrk f41477c;

    /* JADX INFO: renamed from: d */
    private mrk f41478d;

    public mrl(String str) {
        mrk mrkVar = new mrk();
        this.f41477c = mrkVar;
        this.f41478d = mrkVar;
        this.f41475a = false;
        str.getClass();
        this.f41476b = str;
    }

    /* JADX INFO: renamed from: g */
    private final mrk m16821g() {
        mrk mrkVar = new mrk();
        this.f41478d.f41474c = mrkVar;
        this.f41478d = mrkVar;
        return mrkVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m16822a(Object obj) {
        m16821g().f41473b = obj;
    }

    /* JADX INFO: renamed from: b */
    public final void m16823b(String str, Object obj) {
        mrk mrkVarM16821g = m16821g();
        mrkVarM16821g.f41473b = obj;
        mrkVarM16821g.f41472a = str;
    }

    /* JADX INFO: renamed from: c */
    public final void m16824c(String str, Object obj) {
        mrj mrjVar = new mrj();
        this.f41478d.f41474c = mrjVar;
        this.f41478d = mrjVar;
        mrjVar.f41473b = obj;
        mrjVar.f41472a = str;
    }

    /* JADX INFO: renamed from: d */
    public final void m16825d(String str, float f) {
        m16824c(str, String.valueOf(f));
    }

    /* JADX INFO: renamed from: e */
    public final void m16826e(String str, int i) {
        m16824c(str, String.valueOf(i));
    }

    /* JADX INFO: renamed from: f */
    public final void m16827f(String str, long j) {
        m16824c(str, String.valueOf(j));
    }

    public final String toString() {
        boolean z = this.f41475a;
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f41476b);
        sb.append('{');
        String str = "";
        for (mrk mrkVar = this.f41477c.f41474c; mrkVar != null; mrkVar = mrkVar.f41474c) {
            Object obj = mrkVar.f41473b;
            if ((mrkVar instanceof mrj) || obj != null || !z) {
                sb.append(str);
                String str2 = mrkVar.f41472a;
                if (str2 != null) {
                    sb.append(str2);
                    sb.append('=');
                }
                if (obj == null || !obj.getClass().isArray()) {
                    sb.append(obj);
                } else {
                    String strDeepToString = Arrays.deepToString(new Object[]{obj});
                    sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                }
                str = ", ";
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
