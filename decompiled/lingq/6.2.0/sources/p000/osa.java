package p000;

/* JADX INFO: loaded from: classes.dex */
public final class osa {

    /* JADX INFO: renamed from: a */
    public int f54947a;

    /* JADX INFO: renamed from: b */
    public int f54948b;

    /* JADX INFO: renamed from: c */
    public int f54949c;

    /* JADX INFO: renamed from: d */
    public int f54950d;

    /* JADX INFO: renamed from: e */
    public int f54951e;

    /* JADX INFO: renamed from: a */
    public final boolean m18463a() {
        int i;
        int i2;
        int i3;
        int i4 = this.f54947a;
        int i5 = 2;
        if ((i4 & 7) != 0) {
            int i6 = this.f54950d;
            int i7 = this.f54948b;
            if (i6 > i7) {
                i3 = 1;
            } else {
                i3 = i6 == i7 ? 2 : 4;
            }
            if ((i3 & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 112) != 0) {
            int i8 = this.f54950d;
            int i9 = this.f54949c;
            if (i8 > i9) {
                i2 = 1;
            } else {
                i2 = i8 == i9 ? 2 : 4;
            }
            if (((i2 << 4) & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 1792) != 0) {
            int i10 = this.f54951e;
            int i11 = this.f54948b;
            if (i10 > i11) {
                i = 1;
            } else {
                i = i10 == i11 ? 2 : 4;
            }
            if (((i << 8) & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 28672) != 0) {
            int i12 = this.f54951e;
            int i13 = this.f54949c;
            if (i12 > i13) {
                i5 = 1;
            } else if (i12 != i13) {
                i5 = 4;
            }
            if (((i5 << 12) & i4) == 0) {
                return false;
            }
        }
        return true;
    }
}
