package p000;

import okhttp3.Protocol;

/* JADX INFO: loaded from: classes.dex */
public final class h88 {

    /* JADX INFO: renamed from: a */
    public co7 f41979a;

    /* JADX INFO: renamed from: b */
    public Protocol f41980b;

    /* JADX INFO: renamed from: d */
    public String f41982d;

    /* JADX INFO: renamed from: e */
    public ar3 f41983e;

    /* JADX INFO: renamed from: h */
    public id9 f41986h;

    /* JADX INFO: renamed from: i */
    public j88 f41987i;

    /* JADX INFO: renamed from: j */
    public j88 f41988j;

    /* JADX INFO: renamed from: k */
    public j88 f41989k;

    /* JADX INFO: renamed from: l */
    public long f41990l;

    /* JADX INFO: renamed from: m */
    public long f41991m;

    /* JADX INFO: renamed from: n */
    public C3552rx f41992n;

    /* JADX INFO: renamed from: c */
    public int f41981c = -1;

    /* JADX INFO: renamed from: g */
    public m88 f41985g = m88.f50759b;

    /* JADX INFO: renamed from: o */
    public b9a f41993o = b9a.f8185x;

    /* JADX INFO: renamed from: f */
    public or3 f41984f = new or3(0);

    /* JADX INFO: renamed from: b */
    public static void m13142b(String str, j88 j88Var) {
        if (j88Var != null) {
            if (j88Var.f45209i != null) {
                C3386nv.m17624j(str.concat(".networkResponse != null"));
            } else if (j88Var.f45210j != null) {
                C3386nv.m17624j(str.concat(".cacheResponse != null"));
            } else {
                if (j88Var.f45211k == null) {
                    return;
                }
                C3386nv.m17624j(str.concat(".priorResponse != null"));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final j88 m13143a() {
        int i = this.f41981c;
        if (i < 0) {
            ij6.m13960r(this.f41981c, "code < 0: ");
            return null;
        }
        co7 co7Var = this.f41979a;
        if (co7Var == null) {
            C3386nv.m17633t("request == null");
            return null;
        }
        Protocol protocol = this.f41980b;
        if (protocol == null) {
            C3386nv.m17633t("protocol == null");
            return null;
        }
        String str = this.f41982d;
        if (str != null) {
            return new j88(co7Var, protocol, str, i, this.f41983e, this.f41984f.m18309w(), this.f41985g, this.f41986h, this.f41987i, this.f41988j, this.f41989k, this.f41990l, this.f41991m, this.f41992n, this.f41993o);
        }
        C3386nv.m17633t("message == null");
        return null;
    }
}
