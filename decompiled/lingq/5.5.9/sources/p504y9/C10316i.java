package p504y9;

/* JADX INFO: renamed from: y9.i */
/* JADX INFO: loaded from: classes.dex */
public final class C10316i {

    /* JADX INFO: renamed from: a */
    public int f51876a = 0;

    /* JADX INFO: renamed from: b */
    public int f51877b = -1;

    /* JADX INFO: renamed from: c */
    public int f51878c = 0;

    /* JADX INFO: renamed from: d */
    public int[] f51879d;

    /* JADX INFO: renamed from: e */
    public int f51880e;

    public C10316i() {
        int[] iArr = new int[16];
        this.f51879d = iArr;
        this.f51880e = iArr.length - 1;
    }

    /* JADX INFO: renamed from: a */
    public final void m19318a(int i10) {
        int i11 = this.f51878c;
        int[] iArr = this.f51879d;
        if (i11 == iArr.length) {
            int length = iArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i12 = this.f51876a;
            int i13 = length2 - i12;
            System.arraycopy(iArr, i12, iArr2, 0, i13);
            System.arraycopy(this.f51879d, 0, iArr2, i13, i12);
            this.f51876a = 0;
            this.f51877b = this.f51878c - 1;
            this.f51879d = iArr2;
            this.f51880e = length - 1;
        }
        int i14 = (this.f51877b + 1) & this.f51880e;
        this.f51877b = i14;
        this.f51879d[i14] = i10;
        this.f51878c++;
    }
}
