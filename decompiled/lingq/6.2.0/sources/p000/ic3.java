package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class ic3 implements Comparable {

    /* JADX INFO: renamed from: a */
    public final int f43920a;

    /* JADX INFO: renamed from: b */
    public final int f43921b;

    /* JADX INFO: renamed from: c */
    public final String f43922c;

    /* JADX INFO: renamed from: d */
    public final String f43923d;

    public ic3(String str, int i, int i2, String str2) {
        str.getClass();
        str2.getClass();
        this.f43920a = i;
        this.f43921b = i2;
        this.f43922c = str;
        this.f43923d = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ic3 ic3Var = (ic3) obj;
        ic3Var.getClass();
        int i = this.f43920a - ic3Var.f43920a;
        return i == 0 ? this.f43921b - ic3Var.f43921b : i;
    }
}
