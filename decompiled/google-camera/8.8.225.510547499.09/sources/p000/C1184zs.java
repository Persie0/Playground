package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: zs */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C1184zs {

    /* JADX INFO: renamed from: a */
    int[] f48466a = new int[10];

    /* JADX INFO: renamed from: b */
    int[] f48467b = new int[10];

    /* JADX INFO: renamed from: c */
    int f48468c = 0;

    /* JADX INFO: renamed from: d */
    int[] f48469d = new int[10];

    /* JADX INFO: renamed from: e */
    float[] f48470e = new float[10];

    /* JADX INFO: renamed from: f */
    int f48471f = 0;

    /* JADX INFO: renamed from: g */
    int[] f48472g = new int[5];

    /* JADX INFO: renamed from: h */
    String[] f48473h = new String[5];

    /* JADX INFO: renamed from: i */
    int f48474i = 0;

    /* JADX INFO: renamed from: j */
    int[] f48475j = new int[4];

    /* JADX INFO: renamed from: k */
    boolean[] f48476k = new boolean[4];

    /* JADX INFO: renamed from: l */
    int f48477l = 0;

    /* JADX INFO: renamed from: a */
    final void m19805a(int i, float f) {
        int i2 = this.f48471f;
        int[] iArr = this.f48469d;
        int length = iArr.length;
        if (i2 >= length) {
            this.f48469d = Arrays.copyOf(iArr, length + length);
            float[] fArr = this.f48470e;
            int length2 = fArr.length;
            this.f48470e = Arrays.copyOf(fArr, length2 + length2);
        }
        int[] iArr2 = this.f48469d;
        int i3 = this.f48471f;
        iArr2[i3] = i;
        float[] fArr2 = this.f48470e;
        this.f48471f = i3 + 1;
        fArr2[i3] = f;
    }

    /* JADX INFO: renamed from: b */
    final void m19806b(int i, int i2) {
        int i3 = this.f48468c;
        int[] iArr = this.f48466a;
        int length = iArr.length;
        if (i3 >= length) {
            this.f48466a = Arrays.copyOf(iArr, length + length);
            int[] iArr2 = this.f48467b;
            int length2 = iArr2.length;
            this.f48467b = Arrays.copyOf(iArr2, length2 + length2);
        }
        int[] iArr3 = this.f48466a;
        int i4 = this.f48468c;
        iArr3[i4] = i;
        int[] iArr4 = this.f48467b;
        this.f48468c = i4 + 1;
        iArr4[i4] = i2;
    }

    /* JADX INFO: renamed from: c */
    final void m19807c(int i, String str) {
        int i2 = this.f48474i;
        int[] iArr = this.f48472g;
        int length = iArr.length;
        if (i2 >= length) {
            this.f48472g = Arrays.copyOf(iArr, length + length);
            String[] strArr = this.f48473h;
            int length2 = strArr.length;
            this.f48473h = (String[]) Arrays.copyOf(strArr, length2 + length2);
        }
        int[] iArr2 = this.f48472g;
        int i3 = this.f48474i;
        iArr2[i3] = i;
        String[] strArr2 = this.f48473h;
        this.f48474i = i3 + 1;
        strArr2[i3] = str;
    }

    /* JADX INFO: renamed from: d */
    final void m19808d(int i, boolean z) {
        int i2 = this.f48477l;
        int[] iArr = this.f48475j;
        int length = iArr.length;
        if (i2 >= length) {
            this.f48475j = Arrays.copyOf(iArr, length + length);
            boolean[] zArr = this.f48476k;
            int length2 = zArr.length;
            this.f48476k = Arrays.copyOf(zArr, length2 + length2);
        }
        int[] iArr2 = this.f48475j;
        int i3 = this.f48477l;
        iArr2[i3] = i;
        boolean[] zArr2 = this.f48476k;
        this.f48477l = i3 + 1;
        zArr2[i3] = z;
    }
}
