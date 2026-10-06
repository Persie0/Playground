package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jxs {

    /* JADX INFO: renamed from: a */
    public final jxk f35086a;

    /* JADX INFO: renamed from: b */
    public final int f35087b;

    /* JADX INFO: renamed from: c */
    public final int f35088c;

    /* JADX INFO: renamed from: d */
    public final int f35089d;

    /* JADX INFO: renamed from: e */
    public final int f35090e;

    public jxs(jxk jxkVar, int i, int i2, int i3, int i4) {
        this.f35086a = jxkVar;
        this.f35087b = i;
        this.f35088c = i2;
        this.f35089d = i3;
        this.f35090e = i4;
    }

    public final String toString() {
        return "encoder=" + this.f35086a.toString() + ", sampling rate=" + this.f35088c + ", capture sample rate=" + this.f35089d + ", bit rate=" + this.f35087b + ", channels=" + this.f35090e;
    }
}
