package p000;

import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mqb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f51748a = new C0282a(-1660979308, false, new qd1(6));

    /* JADX INFO: renamed from: b */
    public static final C0282a f51749b = new C0282a(1075776244, false, new qd1(7));

    /* JADX INFO: renamed from: c */
    public static final C0282a f51750c = new C0282a(-1200719314, false, new od1(29));

    /* JADX INFO: renamed from: d */
    public static final C0282a f51751d = new C0282a(-414745707, false, new rd1(0));

    /* JADX INFO: renamed from: a */
    public static l56 m17007a(String str, String str2, z68 z68Var) {
        StringBuilder sbM22997t = ux5.m22997t("form-data; name=");
        xv5 xv5Var = m56.f50604f;
        lqb.m16467a(str, sbM22997t);
        if (str2 != null) {
            sbM22997t.append("; filename=");
            lqb.m16467a(str2, sbM22997t);
        }
        String string = sbM22997t.toString();
        or3 or3Var = new or3(0);
        or3Var.m18308v("Content-Disposition", string);
        qr3 qr3VarM18309w = or3Var.m18309w();
        if (qr3VarM18309w.m20121d("Content-Type") != null) {
            C3386nv.m17626m("Unexpected header: Content-Type");
            return null;
        }
        if (qr3VarM18309w.m20121d("Content-Length") == null) {
            return new l56(qr3VarM18309w, z68Var);
        }
        C3386nv.m17626m("Unexpected header: Content-Length");
        return null;
    }
}
