package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class qg3 {

    /* JADX INFO: renamed from: a */
    public int f57750a;

    /* JADX INFO: renamed from: b */
    public int f57751b;

    public /* synthetic */ qg3(int i, int i2) {
        this.f57750a = i;
        this.f57751b = i2;
    }

    /* JADX INFO: renamed from: a */
    public int m19942a() {
        int i = this.f57751b;
        if (i == 2) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        if (i == 29) {
            return 12;
        }
        if (i == 42) {
            return 16;
        }
        if (i != 22) {
            return i != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    /* JADX INFO: renamed from: b */
    public int m19943b() {
        return this.f57751b | this.f57750a;
    }

    /* JADX INFO: renamed from: c */
    public void m19944c(int i) {
        this.f57750a = i;
    }

    /* JADX INFO: renamed from: d */
    public void m19945d(int i, int i2) {
        if (i2 == 1) {
            this.f57751b = i;
        } else {
            this.f57750a = i;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m19946e(int i) {
        if (i == 1) {
            this.f57751b = 0;
        } else {
            this.f57750a = 0;
        }
    }

    public qg3() {
    }
}
