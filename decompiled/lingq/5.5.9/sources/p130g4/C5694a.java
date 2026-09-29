package p130g4;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import p312p2.C8169a;

/* JADX INFO: renamed from: g4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5694a {

    /* JADX INFO: renamed from: f */
    public static final a f34672f = new a();

    /* JADX INFO: renamed from: a */
    public final int[] f34673a;

    /* JADX INFO: renamed from: b */
    public final int[] f34674b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f34675c;

    /* JADX INFO: renamed from: d */
    public final C5695b.b[] f34676d;

    /* JADX INFO: renamed from: e */
    public final float[] f34677e = new float[3];

    /* JADX INFO: renamed from: g4.a$a */
    public static class a implements Comparator<b> {
        @Override // java.util.Comparator
        public final int compare(b bVar, b bVar2) {
            b bVar3 = bVar;
            b bVar4 = bVar2;
            return (((bVar4.f34686i - bVar4.f34685h) + 1) * (((bVar4.f34684g - bVar4.f34683f) + 1) * ((bVar4.f34682e - bVar4.f34681d) + 1))) - (((bVar3.f34686i - bVar3.f34685h) + 1) * (((bVar3.f34684g - bVar3.f34683f) + 1) * ((bVar3.f34682e - bVar3.f34681d) + 1)));
        }
    }

    /* JADX INFO: renamed from: g4.a$b */
    public class b {

        /* JADX INFO: renamed from: a */
        public final int f34678a;

        /* JADX INFO: renamed from: b */
        public int f34679b;

        /* JADX INFO: renamed from: c */
        public int f34680c;

        /* JADX INFO: renamed from: d */
        public int f34681d;

        /* JADX INFO: renamed from: e */
        public int f34682e;

        /* JADX INFO: renamed from: f */
        public int f34683f;

        /* JADX INFO: renamed from: g */
        public int f34684g;

        /* JADX INFO: renamed from: h */
        public int f34685h;

        /* JADX INFO: renamed from: i */
        public int f34686i;

        public b(int i10, int i11) {
            this.f34678a = i10;
            this.f34679b = i11;
            m12058a();
        }

        /* JADX INFO: renamed from: a */
        public final void m12058a() {
            C5694a c5694a = C5694a.this;
            int[] iArr = c5694a.f34673a;
            int[] iArr2 = c5694a.f34674b;
            int i10 = Integer.MAX_VALUE;
            int i11 = Integer.MIN_VALUE;
            int i12 = Integer.MIN_VALUE;
            int i13 = 0;
            int i14 = Integer.MAX_VALUE;
            int i15 = Integer.MAX_VALUE;
            int i16 = Integer.MIN_VALUE;
            for (int i17 = this.f34678a; i17 <= this.f34679b; i17++) {
                int i18 = iArr[i17];
                i13 += iArr2[i18];
                int i19 = (i18 >> 10) & 31;
                int i20 = (i18 >> 5) & 31;
                int i21 = i18 & 31;
                if (i19 > i16) {
                    i16 = i19;
                }
                if (i19 < i10) {
                    i10 = i19;
                }
                if (i20 > i11) {
                    i11 = i20;
                }
                if (i20 < i14) {
                    i14 = i20;
                }
                if (i21 > i12) {
                    i12 = i21;
                }
                if (i21 < i15) {
                    i15 = i21;
                }
            }
            this.f34681d = i10;
            this.f34682e = i16;
            this.f34683f = i14;
            this.f34684g = i11;
            this.f34685h = i15;
            this.f34686i = i12;
            this.f34680c = i13;
        }
    }

    public C5694a(int[] iArr, int i10, C5695b.b[] bVarArr) {
        boolean z10;
        b bVar;
        boolean z11;
        this.f34676d = bVarArr;
        int[] iArr2 = new int[32768];
        this.f34674b = iArr2;
        int i11 = 0;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            int i13 = iArr[i12];
            int iM12057b = m12057b(Color.blue(i13), 8, 5) | (m12057b(Color.red(i13), 8, 5) << 10) | (m12057b(Color.green(i13), 8, 5) << 5);
            iArr[i12] = iM12057b;
            iArr2[iM12057b] = iArr2[iM12057b] + 1;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < 32768; i15++) {
            if (iArr2[i15] > 0) {
                int iRgb = Color.rgb(m12057b((i15 >> 10) & 31, 5, 8), m12057b((i15 >> 5) & 31, 5, 8), m12057b(i15 & 31, 5, 8));
                ThreadLocal<double[]> threadLocal = C8169a.f44300a;
                int iRed = Color.red(iRgb);
                int iGreen = Color.green(iRgb);
                int iBlue = Color.blue(iRgb);
                float[] fArr = this.f34677e;
                C8169a.m16209a(iRed, iGreen, iBlue, fArr);
                C5695b.b[] bVarArr2 = this.f34676d;
                if (bVarArr2 == null || bVarArr2.length <= 0) {
                    z11 = false;
                    break;
                }
                int length = bVarArr2.length;
                int i16 = 0;
                while (true) {
                    if (i16 >= length) {
                        z11 = false;
                        break;
                    } else {
                        if (!bVarArr2[i16].mo12059a(fArr)) {
                            z11 = true;
                            break;
                        }
                        i16++;
                    }
                }
                if (z11) {
                    iArr2[i15] = 0;
                }
            }
            if (iArr2[i15] > 0) {
                i14++;
            }
        }
        int[] iArr3 = new int[i14];
        this.f34673a = iArr3;
        int i17 = 0;
        for (int i18 = 0; i18 < 32768; i18++) {
            if (iArr2[i18] > 0) {
                iArr3[i17] = i18;
                i17++;
            }
        }
        if (i14 <= i10) {
            this.f34675c = new ArrayList();
            while (i11 < i14) {
                int i19 = iArr3[i11];
                this.f34675c.add(new C5695b.c(Color.rgb(m12057b((i19 >> 10) & 31, 5, 8), m12057b((i19 >> 5) & 31, 5, 8), m12057b(i19 & 31, 5, 8)), iArr2[i19]));
                i11++;
            }
            return;
        }
        PriorityQueue<b> priorityQueue = new PriorityQueue(i10, f34672f);
        priorityQueue.offer(new b(0, this.f34673a.length - 1));
        while (priorityQueue.size() < i10 && (bVar = (b) priorityQueue.poll()) != null) {
            int i20 = bVar.f34679b;
            int iMin = bVar.f34678a;
            if (((i20 + 1) - iMin > 1 ? 1 : i11) == 0) {
                break;
            }
            if (((i20 + 1) - iMin > 1 ? 1 : i11) == 0) {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
            int i21 = bVar.f34682e - bVar.f34681d;
            int i22 = bVar.f34684g - bVar.f34683f;
            int i23 = bVar.f34686i - bVar.f34685h;
            int i24 = (i21 < i22 || i21 < i23) ? (i22 < i21 || i22 < i23) ? -1 : -2 : -3;
            C5694a c5694a = C5694a.this;
            int[] iArr4 = c5694a.f34673a;
            m12056a(i24, iMin, i20, iArr4);
            Arrays.sort(iArr4, iMin, bVar.f34679b + 1);
            m12056a(i24, iMin, bVar.f34679b, iArr4);
            int i25 = bVar.f34680c / 2;
            int i26 = i11;
            int i27 = iMin;
            while (true) {
                int i28 = bVar.f34679b;
                if (i27 > i28) {
                    break;
                }
                i26 += c5694a.f34674b[iArr4[i27]];
                if (i26 >= i25) {
                    iMin = Math.min(i28 - 1, i27);
                    break;
                }
                i27++;
            }
            b bVar2 = c5694a.new b(iMin + 1, bVar.f34679b);
            bVar.f34679b = iMin;
            bVar.m12058a();
            priorityQueue.offer(bVar2);
            priorityQueue.offer(bVar);
            i11 = 0;
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        for (b bVar3 : priorityQueue) {
            C5694a c5694a2 = C5694a.this;
            int[] iArr5 = c5694a2.f34673a;
            int i29 = 0;
            int i30 = 0;
            int i31 = 0;
            int i32 = 0;
            for (int i33 = bVar3.f34678a; i33 <= bVar3.f34679b; i33++) {
                int i34 = iArr5[i33];
                int i35 = c5694a2.f34674b[i34];
                i30 += i35;
                i29 = (((i34 >> 10) & 31) * i35) + i29;
                i31 = (((i34 >> 5) & 31) * i35) + i31;
                i32 += i35 * (i34 & 31);
            }
            float f3 = i30;
            C5695b.c cVar = new C5695b.c(Color.rgb(m12057b(Math.round(i29 / f3), 5, 8), m12057b(Math.round(i31 / f3), 5, 8), m12057b(Math.round(i32 / f3), 5, 8)), i30);
            float[] fArrM12061b = cVar.m12061b();
            C5695b.b[] bVarArr3 = this.f34676d;
            if (bVarArr3 == null || bVarArr3.length <= 0) {
                z10 = false;
                break;
            }
            int length2 = bVarArr3.length;
            int i36 = 0;
            while (true) {
                if (i36 >= length2) {
                    z10 = false;
                    break;
                } else {
                    if (!bVarArr3[i36].mo12059a(fArrM12061b)) {
                        z10 = true;
                        break;
                    }
                    i36++;
                }
            }
            if (!z10) {
                arrayList.add(cVar);
            }
        }
        this.f34675c = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static void m12056a(int i10, int i11, int i12, int[] iArr) {
        if (i10 == -2) {
            while (i11 <= i12) {
                int i13 = iArr[i11];
                iArr[i11] = (i13 & 31) | (((i13 >> 5) & 31) << 10) | (((i13 >> 10) & 31) << 5);
                i11++;
            }
        } else {
            if (i10 != -1) {
                return;
            }
            while (i11 <= i12) {
                int i14 = iArr[i11];
                iArr[i11] = ((i14 >> 10) & 31) | ((i14 & 31) << 10) | (((i14 >> 5) & 31) << 5);
                i11++;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m12057b(int i10, int i11, int i12) {
        return (i12 > i11 ? i10 << (i12 - i11) : i10 >> (i11 - i12)) & ((1 << i12) - 1);
    }
}
