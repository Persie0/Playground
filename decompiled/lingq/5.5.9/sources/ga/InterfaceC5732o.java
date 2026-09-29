package ga;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: renamed from: ga.o */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC5732o {

    /* JADX INFO: renamed from: ga.o$a */
    public static class a implements InterfaceC5732o {

        /* JADX INFO: renamed from: a */
        public final Random f34777a;

        /* JADX INFO: renamed from: b */
        public final int[] f34778b;

        /* JADX INFO: renamed from: c */
        public final int[] f34779c;

        public a() {
            this(new Random());
        }

        public a(Random random) {
            this(new int[0], random);
        }

        public a(int[] iArr, Random random) {
            this.f34778b = iArr;
            this.f34777a = random;
            this.f34779c = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f34779c[iArr[i10]] = i10;
            }
        }

        @Override // ga.InterfaceC5732o
        /* JADX INFO: renamed from: a */
        public final int mo12080a() {
            return this.f34778b.length;
        }

        @Override // ga.InterfaceC5732o
        /* JADX INFO: renamed from: b */
        public final a mo12081b(int i10, int i11) {
            int i12 = i11 - i10;
            int[] iArr = this.f34778b;
            int[] iArr2 = new int[iArr.length - i12];
            int i13 = 0;
            for (int i14 = 0; i14 < iArr.length; i14++) {
                int i15 = iArr[i14];
                if (i15 < i10 || i15 >= i11) {
                    int i16 = i14 - i13;
                    if (i15 >= i10) {
                        i15 -= i12;
                    }
                    iArr2[i16] = i15;
                } else {
                    i13++;
                }
            }
            return new a(iArr2, new Random(this.f34777a.nextLong()));
        }

        @Override // ga.InterfaceC5732o
        /* JADX INFO: renamed from: c */
        public final int mo12082c() {
            int[] iArr = this.f34778b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // ga.InterfaceC5732o
        /* JADX INFO: renamed from: d */
        public final int mo12083d(int i10) {
            int i11 = -1;
            int i12 = this.f34779c[i10] - 1;
            if (i12 >= 0) {
                i11 = this.f34778b[i12];
            }
            return i11;
        }

        @Override // ga.InterfaceC5732o
        /* JADX INFO: renamed from: e */
        public final int mo12084e(int i10) {
            int i11 = this.f34779c[i10] + 1;
            int[] iArr = this.f34778b;
            if (i11 < iArr.length) {
                return iArr[i11];
            }
            return -1;
        }

        @Override // ga.InterfaceC5732o
        /* JADX INFO: renamed from: f */
        public final a mo12085f(int i10, int i11) {
            Random random;
            int[] iArr;
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            int i12 = 0;
            while (true) {
                random = this.f34777a;
                iArr = this.f34778b;
                if (i12 >= i11) {
                    break;
                }
                iArr2[i12] = random.nextInt(iArr.length + 1);
                int i13 = i12 + 1;
                int iNextInt = random.nextInt(i13);
                iArr3[i12] = iArr3[iNextInt];
                iArr3[iNextInt] = i12 + i10;
                i12 = i13;
            }
            Arrays.sort(iArr2);
            int[] iArr4 = new int[iArr.length + i11];
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < iArr.length + i11; i16++) {
                if (i14 >= i11 || i15 != iArr2[i14]) {
                    int i17 = i15 + 1;
                    int i18 = iArr[i15];
                    iArr4[i16] = i18;
                    if (i18 >= i10) {
                        iArr4[i16] = i18 + i11;
                    }
                    i15 = i17;
                } else {
                    iArr4[i16] = iArr3[i14];
                    i14++;
                }
            }
            return new a(iArr4, new Random(random.nextLong()));
        }

        @Override // ga.InterfaceC5732o
        /* JADX INFO: renamed from: g */
        public final int mo12086g() {
            int[] iArr = this.f34778b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // ga.InterfaceC5732o
        /* JADX INFO: renamed from: h */
        public final a mo12087h() {
            return new a(new Random(this.f34777a.nextLong()));
        }
    }

    /* JADX INFO: renamed from: a */
    int mo12080a();

    /* JADX INFO: renamed from: b */
    a mo12081b(int i10, int i11);

    /* JADX INFO: renamed from: c */
    int mo12082c();

    /* JADX INFO: renamed from: d */
    int mo12083d(int i10);

    /* JADX INFO: renamed from: e */
    int mo12084e(int i10);

    /* JADX INFO: renamed from: f */
    a mo12085f(int i10, int i11);

    /* JADX INFO: renamed from: g */
    int mo12086g();

    /* JADX INFO: renamed from: h */
    a mo12087h();
}
