package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ddc {

    /* JADX INFO: renamed from: a */
    public final String f10550a;

    /* JADX INFO: renamed from: b */
    public int f10551b;

    /* JADX INFO: renamed from: c */
    public int f10552c;

    /* JADX INFO: renamed from: d */
    public int f10553d;

    /* JADX INFO: renamed from: e */
    public int f10554e;

    /* JADX INFO: renamed from: f */
    public long f10555f;

    /* JADX INFO: renamed from: g */
    public int f10556g;

    public ddc(String str) {
        this.f10550a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ddc)) {
            return false;
        }
        ddc ddcVar = (ddc) obj;
        return this.f10550a.equals(ddcVar.f10550a) && this.f10553d == ddcVar.f10553d && this.f10554e == ddcVar.f10554e && this.f10552c == ddcVar.f10552c && this.f10551b == ddcVar.f10551b && this.f10555f == ddcVar.f10555f && this.f10556g == ddcVar.f10556g;
    }
}
