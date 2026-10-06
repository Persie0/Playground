package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dvg implements dtk {

    /* JADX INFO: renamed from: b */
    public final dtj f12641b;

    /* JADX INFO: renamed from: d */
    private final float[] f12643d;

    /* JADX INFO: renamed from: e */
    private final long[] f12644e;

    /* JADX INFO: renamed from: f */
    private final int f12645f;

    /* JADX INFO: renamed from: g */
    private final int f12646g;

    /* JADX INFO: renamed from: h */
    private final int f12647h;

    /* JADX INFO: renamed from: i */
    private final dvf f12648i;

    /* JADX INFO: renamed from: j */
    private final dve f12649j;

    /* JADX INFO: renamed from: l */
    private final int f12651l;

    /* JADX INFO: renamed from: m */
    private final dvh f12652m;

    /* JADX INFO: renamed from: a */
    public final Object f12640a = new Object();

    /* JADX INFO: renamed from: c */
    public int f12642c = 0;

    /* JADX INFO: renamed from: k */
    private boolean f12650k = false;

    public dvg(dtj dtjVar, int i, int i2, int i3, int i4, dvf dvfVar, dvh dvhVar, dve dveVar) {
        this.f12641b = dtjVar;
        this.f12652m = dvhVar;
        this.f12649j = dveVar;
        this.f12645f = i3;
        int i5 = i2 * i;
        this.f12643d = new float[i5];
        this.f12644e = new long[i];
        this.f12646g = i;
        this.f12647h = i5;
        this.f12651l = i4;
        this.f12648i = dvfVar;
    }

    /* JADX INFO: renamed from: i */
    private final boolean m6771i() {
        if (!this.f12650k) {
            return false;
        }
        this.f12650k = false;
        return this.f12648i.mo6770a(this);
    }

    /* JADX INFO: renamed from: j */
    private static final int m6772j(int i) {
        return i >= 0 ? i : -(i + 1);
    }

    /* JADX INFO: renamed from: k */
    private static final int m6773k(int i) {
        return i >= 0 ? i : -(i + 2);
    }

    @Override // p000.dtk
    /* JADX INFO: renamed from: a */
    public final float mo6734a(long j) {
        lku.m15614I(this.f12645f == 1, "valueAt() only applicable to 1D features!");
        synchronized (this.f12640a) {
            int i = this.f12642c;
            float f = Float.NaN;
            if (i == 0) {
                return Float.NaN;
            }
            int iBinarySearch = Arrays.binarySearch(this.f12644e, 0, i, j);
            int i2 = this.f12651l;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            switch (i3) {
                case 0:
                case 1:
                    int iMax = Math.max(0, m6773k(iBinarySearch));
                    int iMin = Math.min(this.f12642c - 1, m6772j(iBinarySearch));
                    long[] jArr = this.f12644e;
                    long j2 = jArr[iMax];
                    long j3 = jArr[iMin];
                    float[] fArr = this.f12643d;
                    if (j - j2 >= j3 - j) {
                        iMax = iMin;
                    }
                    return fArr[iMax];
                case 2:
                    return iBinarySearch >= 0 ? this.f12643d[iBinarySearch] : Float.NaN;
                case 3:
                    if (iBinarySearch != -1) {
                        f = this.f12643d[m6773k(iBinarySearch)];
                    }
                    return f;
                case 4:
                    int iMax2 = Math.max(0, m6773k(iBinarySearch));
                    int iMin2 = Math.min(this.f12642c - 1, m6772j(iBinarySearch));
                    if (iMax2 == iMin2) {
                        return this.f12643d[iMax2];
                    }
                    long[] jArr2 = this.f12644e;
                    long j4 = jArr2[iMax2];
                    double d = j - j4;
                    double d2 = jArr2[iMin2] - j4;
                    Double.isNaN(d);
                    Double.isNaN(d2);
                    double d3 = d / d2;
                    double d4 = 1.0d - d3;
                    float[] fArr2 = this.f12643d;
                    double d5 = fArr2[iMax2];
                    Double.isNaN(d5);
                    double d6 = d4 * d5;
                    double d7 = fArr2[iMin2];
                    Double.isNaN(d7);
                    return (float) (d6 + (d3 * d7));
                default:
                    return Float.NaN;
            }
        }
    }

    @Override // p000.dtk
    /* JADX INFO: renamed from: b */
    public final long mo6735b() {
        long j;
        synchronized (this.f12640a) {
            int i = this.f12642c;
            j = i > 0 ? this.f12644e[i - 1] : 0L;
        }
        return j;
    }

    @Override // p000.dtk
    /* JADX INFO: renamed from: c */
    public final dtg mo6736c(long j) throws Throwable {
        Object obj;
        dtg dtgVarM6722d;
        int i = this.f12651l;
        Object obj2 = this.f12640a;
        synchronized (obj2) {
            try {
                try {
                    int i2 = this.f12642c;
                    if (i2 != 0) {
                        int i3 = 0;
                        int iBinarySearch = Arrays.binarySearch(this.f12644e, 0, i2, j);
                        int i4 = i - 1;
                        if (i == 0) {
                            throw null;
                        }
                        switch (i4) {
                            case 0:
                                int iMax = Math.max(0, m6773k(iBinarySearch));
                                int iMin = Math.min(this.f12642c - 1, m6772j(iBinarySearch));
                                long[] jArr = this.f12644e;
                                dtgVarM6722d = j - jArr[iMax] < jArr[iMin] - j ? dtg.m6722d(this.f12641b, j, this.f12643d, this.f12649j.mo6768a(iMax), this.f12652m.f12653a) : dtg.m6722d(this.f12641b, j, this.f12643d, this.f12649j.mo6768a(iMin), this.f12652m.f12653a);
                                break;
                            case 1:
                                int iMax2 = Math.max(0, m6773k(iBinarySearch));
                                int iMin2 = Math.min(this.f12642c - 1, m6772j(iBinarySearch));
                                long[] jArr2 = this.f12644e;
                                long j2 = jArr2[iMax2];
                                long j3 = jArr2[iMin2];
                                dtgVarM6722d = j - j2 < j3 - j ? dtg.m6722d(this.f12641b, j2, this.f12643d, this.f12649j.mo6768a(iMax2), this.f12652m.f12653a) : dtg.m6722d(this.f12641b, j3, this.f12643d, this.f12649j.mo6768a(iMin2), this.f12652m.f12653a);
                                break;
                            case 2:
                                dtgVarM6722d = iBinarySearch >= 0 ? dtg.m6722d(this.f12641b, j, this.f12643d, this.f12649j.mo6768a(iBinarySearch), this.f12652m.f12653a) : dtg.m6721c(this.f12641b, j);
                                break;
                            case 3:
                                dtgVarM6722d = iBinarySearch != -1 ? dtg.m6722d(this.f12641b, j, this.f12643d, this.f12649j.mo6768a(m6773k(iBinarySearch)), this.f12652m.f12653a) : dtg.m6721c(this.f12641b, j);
                                break;
                            case 4:
                                try {
                                    lku.m15613H(true);
                                    int iMax3 = Math.max(0, m6773k(iBinarySearch));
                                    int iMin3 = Math.min(this.f12642c - 1, m6772j(iBinarySearch));
                                    if (iMax3 != iMin3) {
                                        long[] jArr3 = this.f12644e;
                                        long j4 = jArr3[iMax3];
                                        double d = j - j4;
                                        double d2 = jArr3[iMin3] - j4;
                                        Double.isNaN(d);
                                        Double.isNaN(d2);
                                        double d3 = d / d2;
                                        dtj dtjVar = this.f12641b;
                                        float[] fArr = this.f12643d;
                                        dve dveVar = this.f12649j;
                                        int iMo6768a = dveVar.mo6768a(iMax3);
                                        int iMo6768a2 = dveVar.mo6768a(iMin3);
                                        int i5 = this.f12652m.f12653a;
                                        float[] fArr2 = new float[i5];
                                        while (i3 < i5) {
                                            double d4 = 1.0d - d3;
                                            dtj dtjVar2 = dtjVar;
                                            double d5 = fArr[iMo6768a + i3];
                                            float[] fArr3 = fArr;
                                            obj = obj2;
                                            double d6 = fArr[iMo6768a2 + i3];
                                            Double.isNaN(d6);
                                            Double.isNaN(d5);
                                            try {
                                                fArr2[i3] = (float) ((d4 * d5) + (d6 * d3));
                                                i3++;
                                                dtjVar = dtjVar2;
                                                obj2 = obj;
                                                fArr = fArr3;
                                            } catch (Throwable th) {
                                                th = th;
                                                throw th;
                                            }
                                        }
                                        obj = obj2;
                                        dtgVarM6722d = new dtg(dtjVar, j, fArr2);
                                    } else {
                                        dtgVarM6722d = dtg.m6722d(this.f12641b, j, this.f12643d, this.f12649j.mo6768a(iMax3), this.f12652m.f12653a);
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    obj = obj2;
                                }
                                break;
                            default:
                                dtgVarM6722d = dtg.m6721c(this.f12641b, j);
                                break;
                        }
                        throw th;
                    }
                    dtgVarM6722d = dtg.m6721c(this.f12641b, j);
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                obj = obj2;
            }
        }
        return dtgVarM6722d;
    }

    @Override // p000.dtk
    /* JADX INFO: renamed from: d */
    public final dtg mo6737d() {
        dtg dtgVarM6721c;
        synchronized (this.f12640a) {
            int i = this.f12642c;
            if (i > 0) {
                int i2 = i - 1;
                dtgVarM6721c = dtg.m6722d(this.f12641b, this.f12644e[i2], this.f12643d, this.f12649j.mo6768a(i2), this.f12652m.f12653a);
            } else {
                dtgVarM6721c = dtg.m6721c(this.f12641b, 0L);
            }
        }
        return dtgVarM6721c;
    }

    @Override // p000.dtk
    /* JADX INFO: renamed from: e */
    public final boolean mo6738e() {
        boolean z;
        synchronized (this.f12640a) {
            z = this.f12642c == 0;
        }
        return z;
    }

    @Override // p000.dtk
    /* JADX INFO: renamed from: f */
    public final List mo6739f(long j, int i) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f12640a) {
            try {
                if (j > 0) {
                    int iM6773k = m6773k(Arrays.binarySearch(this.f12644e, 0, this.f12642c, j));
                    if (iM6773k < 0) {
                        return arrayList;
                    }
                    for (int i2 = iM6773k; i2 >= 0 && i2 > iM6773k - i; i2--) {
                        long j2 = this.f12644e[i2];
                        if (j2 < 0) {
                            break;
                        }
                        arrayList.add(dtg.m6722d(this.f12641b, j2, this.f12643d, this.f12649j.mo6768a(i2), this.f12652m.f12653a));
                    }
                } else {
                    int iM6772j = m6772j(Arrays.binarySearch(this.f12644e, 0, this.f12642c, j));
                    for (int i3 = iM6772j; i3 < this.f12642c && i3 < iM6772j + i; i3++) {
                        long j3 = this.f12644e[i3];
                        if (j3 > 0) {
                            break;
                        }
                        arrayList.add(dtg.m6722d(this.f12641b, j3, this.f12643d, this.f12649j.mo6768a(i3), this.f12652m.f12653a));
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m6775h(long j, float... fArr) {
        synchronized (this.f12640a) {
            int i = this.f12642c;
            if (i >= this.f12646g) {
                if (m6771i()) {
                    m6775h(j, fArr);
                }
                return;
            }
            dve dveVar = this.f12649j;
            int length = fArr.length;
            int iMo6769b = dveVar.mo6769b(i);
            if (iMo6769b + length <= this.f12647h) {
                System.arraycopy(fArr, 0, this.f12643d, iMo6769b, this.f12652m.m6776a(length));
                long[] jArr = this.f12644e;
                int i2 = this.f12642c;
                jArr[i2] = j;
                this.f12642c = i2 + 1;
                this.f12650k = true;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m6774g(long j, float f) {
        int iMo6769b;
        synchronized (this.f12640a) {
            int i = this.f12642c;
            if (i >= this.f12646g || (iMo6769b = this.f12649j.mo6769b(i)) >= this.f12647h) {
                if (m6771i()) {
                    m6774g(j, f);
                }
                return;
            }
            this.f12643d[iMo6769b] = f;
            this.f12644e[i] = j;
            this.f12652m.m6776a(1);
            this.f12642c++;
            this.f12650k = true;
        }
    }
}
