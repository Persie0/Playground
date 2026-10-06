package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dcv {

    /* JADX INFO: renamed from: a */
    final int f10539a;

    /* JADX INFO: renamed from: b */
    int f10540b;

    /* JADX INFO: renamed from: c */
    int f10541c;

    /* JADX INFO: renamed from: d */
    int f10542d;

    /* JADX INFO: renamed from: e */
    long f10543e;

    public dcv(int i) {
        this.f10539a = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dcv)) {
            return false;
        }
        dcv dcvVar = (dcv) obj;
        return this.f10539a == dcvVar.f10539a && this.f10540b == dcvVar.f10540b && this.f10541c == dcvVar.f10541c && this.f10542d == dcvVar.f10542d && this.f10543e == dcvVar.f10543e;
    }
}
