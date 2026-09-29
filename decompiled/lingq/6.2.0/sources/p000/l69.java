package p000;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class l69 {

    /* JADX INFO: renamed from: a */
    public final Random f49199a;

    /* JADX INFO: renamed from: b */
    public final int[] f49200b;

    /* JADX INFO: renamed from: c */
    public final int[] f49201c;

    public l69(int[] iArr, Random random) {
        this.f49200b = iArr;
        this.f49199a = random;
        this.f49201c = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.f49201c[iArr[i]] = i;
        }
    }

    /* JADX INFO: renamed from: a */
    public final l69 m15907a(int i) {
        int[] iArr;
        Random random;
        int[] iArr2 = new int[i];
        int[] iArr3 = new int[i];
        int i2 = 0;
        while (true) {
            iArr = this.f49200b;
            random = this.f49199a;
            if (i2 >= i) {
                break;
            }
            iArr2[i2] = random.nextInt(iArr.length + 1);
            int i3 = i2 + 1;
            int iNextInt = random.nextInt(i3);
            iArr3[i2] = iArr3[iNextInt];
            iArr3[iNextInt] = i2;
            i2 = i3;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i];
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < iArr.length + i; i6++) {
            if (i4 >= i || i5 != iArr2[i4]) {
                int i7 = i5 + 1;
                int i8 = iArr[i5];
                iArr4[i6] = i8;
                if (i8 >= 0) {
                    iArr4[i6] = i8 + i;
                }
                i5 = i7;
            } else {
                iArr4[i6] = iArr3[i4];
                i4++;
            }
        }
        return new l69(iArr4, new Random(random.nextLong()));
    }

    public l69() {
        this(new Random());
    }

    public l69(Random random) {
        this(new int[0], random);
    }
}
