package androidx.compose.runtime.snapshots;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p000.AbstractC3550rv;
import p000.cc4;
import p000.fa4;
import p000.omd;
import p000.tg4;
import p000.v63;
import p000.v91;
import p000.wfb;
import p000.x56;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0285a implements Iterable, tg4 {

    /* JADX INFO: renamed from: e */
    public static final C0285a f3799e = new C0285a(0, 0, 0, null);

    /* JADX INFO: renamed from: a */
    public final long f3800a;

    /* JADX INFO: renamed from: b */
    public final long f3801b;

    /* JADX INFO: renamed from: c */
    public final long f3802c;

    /* JADX INFO: renamed from: d */
    public final long[] f3803d;

    public C0285a(long j, long j2, long j3, long[] jArr) {
        this.f3800a = j;
        this.f3801b = j2;
        this.f3802c = j3;
        this.f3803d = jArr;
    }

    /* JADX INFO: renamed from: d */
    public final C0285a m1313d(C0285a c0285a) {
        long[] jArr;
        C0285a c0285aM1314f = this;
        C0285a c0285a2 = f3799e;
        if (c0285a == c0285a2) {
            return c0285aM1314f;
        }
        if (c0285aM1314f == c0285a2) {
            return c0285a2;
        }
        long j = c0285a.f3802c;
        long j2 = c0285a.f3802c;
        long[] jArr2 = c0285a.f3803d;
        long j3 = c0285a.f3801b;
        long j4 = c0285a.f3800a;
        long j5 = c0285aM1314f.f3802c;
        if (j == j5 && jArr2 == (jArr = c0285aM1314f.f3803d)) {
            return new C0285a(c0285aM1314f.f3800a & (~j4), c0285aM1314f.f3801b & (~j3), j5, jArr);
        }
        if (jArr2 != null) {
            for (long j6 : jArr2) {
                c0285aM1314f = c0285aM1314f.m1314f(j6);
            }
        }
        if (j3 != 0) {
            for (int i = 0; i < 64; i++) {
                if (((1 << i) & j3) != 0) {
                    c0285aM1314f = c0285aM1314f.m1314f(((long) i) + j2);
                }
            }
        }
        if (j4 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j4) != 0) {
                    c0285aM1314f = c0285aM1314f.m1314f(((long) i2) + j2 + 64);
                }
            }
        }
        return c0285aM1314f;
    }

    /* JADX INFO: renamed from: f */
    public final C0285a m1314f(long j) {
        long[] jArr;
        int iM23912g;
        long[] jArr2;
        long j2 = j - this.f3802c;
        if (fa4.m11652n(j2, 0L) >= 0 && fa4.m11652n(j2, 64L) < 0) {
            long j3 = 1 << ((int) j2);
            long j4 = this.f3801b;
            if ((j4 & j3) != 0) {
                return new C0285a(this.f3800a, j4 & (~j3), this.f3802c, this.f3803d);
            }
        } else if (fa4.m11652n(j2, 64L) >= 0 && fa4.m11652n(j2, 128L) < 0) {
            long j5 = 1 << (((int) j2) - 64);
            long j6 = this.f3800a;
            if ((j6 & j5) != 0) {
                return new C0285a(j6 & (~j5), this.f3801b, this.f3802c, this.f3803d);
            }
        } else if (fa4.m11652n(j2, 0L) < 0 && (jArr = this.f3803d) != null && (iM23912g = wfb.m23912g(jArr, j)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (iM23912g > 0) {
                    AbstractC3550rv.m20828V(jArr, jArr3, 0, 0, iM23912g);
                }
                if (iM23912g < i) {
                    AbstractC3550rv.m20828V(jArr, jArr3, iM23912g, iM23912g + 1, length);
                }
                jArr2 = jArr3;
            }
            return new C0285a(this.f3800a, this.f3801b, this.f3802c, jArr2);
        }
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m1315g(long j) {
        long[] jArr;
        long j2 = j - this.f3802c;
        if (fa4.m11652n(j2, 0L) >= 0 && fa4.m11652n(j2, 64L) < 0) {
            return ((1 << ((int) j2)) & this.f3801b) != 0;
        }
        if (fa4.m11652n(j2, 64L) < 0 || fa4.m11652n(j2, 128L) >= 0) {
            return fa4.m11652n(j2, 0L) <= 0 && (jArr = this.f3803d) != null && wfb.m23912g(jArr, j) >= 0;
        }
        return ((1 << (((int) j2) + (-64))) & this.f3800a) != 0;
    }

    /* JADX INFO: renamed from: h */
    public final C0285a m1316h(C0285a c0285a) {
        C0285a c0285aM1317i;
        long[] jArr;
        C0285a c0285aM1317i2 = this;
        C0285a c0285a2 = f3799e;
        if (c0285a == c0285a2) {
            return c0285aM1317i2;
        }
        if (c0285aM1317i2 == c0285a2) {
            return c0285a;
        }
        long j = c0285a.f3802c;
        long j2 = c0285a.f3802c;
        long[] jArr2 = c0285a.f3803d;
        long j3 = c0285a.f3801b;
        long j4 = c0285a.f3800a;
        long j5 = c0285aM1317i2.f3802c;
        long j6 = c0285aM1317i2.f3801b;
        long j7 = c0285aM1317i2.f3800a;
        if (j == j5 && jArr2 == (jArr = c0285aM1317i2.f3803d)) {
            return new C0285a(j7 | j4, j6 | j3, j5, jArr);
        }
        int i = 0;
        long[] jArr3 = c0285aM1317i2.f3803d;
        if (jArr3 != null) {
            if (jArr2 != null) {
                for (long j8 : jArr2) {
                    c0285aM1317i2 = c0285aM1317i2.m1317i(j8);
                }
            }
            if (j3 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j3) != 0) {
                        c0285aM1317i2 = c0285aM1317i2.m1317i(((long) i2) + j2);
                    }
                }
            }
            if (j4 != 0) {
                while (i < 64) {
                    if (((1 << i) & j4) != 0) {
                        c0285aM1317i2 = c0285aM1317i2.m1317i(((long) i) + j2 + 64);
                    }
                    i++;
                }
            }
            return c0285aM1317i2;
        }
        if (jArr3 != null) {
            c0285aM1317i = c0285a;
            for (long j9 : jArr3) {
                c0285aM1317i = c0285aM1317i.m1317i(j9);
            }
        } else {
            c0285aM1317i = c0285a;
        }
        long j10 = c0285aM1317i2.f3802c;
        if (j6 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j6) != 0) {
                    c0285aM1317i = c0285aM1317i.m1317i(((long) i3) + j10);
                }
            }
        }
        if (j7 != 0) {
            while (i < 64) {
                if (((1 << i) & j7) != 0) {
                    c0285aM1317i = c0285aM1317i.m1317i(((long) i) + j10 + 64);
                }
                i++;
            }
        }
        return c0285aM1317i;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0152  */
    /* JADX INFO: renamed from: i */
    public final C0285a m1317i(long j) {
        long[] jArr;
        long j2;
        long j3;
        long[] jArr2;
        long[] jArr3;
        int i;
        x56 x56Var;
        long j4 = this.f3802c;
        long j5 = j - j4;
        long j6 = 0;
        int iM11652n = fa4.m11652n(j5, 0L);
        long j7 = this.f3801b;
        if (iM11652n < 0 || fa4.m11652n(j5, 64L) >= 0) {
            int iM11652n2 = fa4.m11652n(j5, 64L);
            long j8 = this.f3800a;
            int i2 = 64;
            if (iM11652n2 < 0 || fa4.m11652n(j5, 128L) >= 0) {
                int iM11652n3 = fa4.m11652n(j5, 128L);
                long[] jArr4 = this.f3803d;
                if (iM11652n3 < 0) {
                    if (jArr4 == null) {
                        return new C0285a(this.f3800a, this.f3801b, this.f3802c, new long[]{j});
                    }
                    int iM23912g = wfb.m23912g(jArr4, j);
                    if (iM23912g < 0) {
                        int i3 = -(iM23912g + 1);
                        int length = jArr4.length;
                        long[] jArr5 = new long[length + 1];
                        AbstractC3550rv.m20828V(jArr4, jArr5, 0, 0, i3);
                        AbstractC3550rv.m20828V(jArr4, jArr5, i3 + 1, i3, length);
                        jArr5[i3] = j;
                        return new C0285a(this.f3800a, this.f3801b, this.f3802c, jArr5);
                    }
                } else if (!m1315g(j)) {
                    long j9 = ((j + 1) / 64) * 64;
                    if (fa4.m11652n(j9, 0L) < 0) {
                        j9 = 9223372036854775680L;
                    }
                    long j10 = j8;
                    cc4 cc4Var = null;
                    while (true) {
                        if (fa4.m11652n(j4, j9) >= 0) {
                            jArr = null;
                            j2 = j4;
                            j3 = j7;
                            break;
                        }
                        if (j7 != j6) {
                            if (cc4Var == null) {
                                cc4Var = new cc4();
                                if (jArr4 != null) {
                                    long[] jArrCopyOf = Arrays.copyOf(jArr4, jArr4.length);
                                    jArr = null;
                                    x56Var = new x56(jArrCopyOf.length);
                                    int i4 = x56Var.f67781b;
                                    if (i4 < 0) {
                                        v63.m23143u("");
                                        throw null;
                                    }
                                    j3 = j6;
                                    if (jArrCopyOf.length != 0) {
                                        int length2 = jArrCopyOf.length + i4;
                                        long[] jArr6 = x56Var.f67780a;
                                        if (jArr6.length < length2) {
                                            x56Var.f67780a = Arrays.copyOf(jArr6, Math.max(length2, (jArr6.length * 3) / 2));
                                        }
                                        long[] jArr7 = x56Var.f67780a;
                                        int i5 = x56Var.f67781b;
                                        if (i4 != i5) {
                                            AbstractC3550rv.m20828V(jArr7, jArr7, jArrCopyOf.length + i4, i4, i5);
                                        }
                                        AbstractC3550rv.m20828V(jArrCopyOf, jArr7, i4, 0, jArrCopyOf.length);
                                        x56Var.f67781b += jArrCopyOf.length;
                                    }
                                } else {
                                    j3 = j6;
                                    jArr = null;
                                    x56Var = new x56();
                                }
                                cc4Var.f9881a = x56Var;
                            } else {
                                j3 = j6;
                                jArr = null;
                            }
                            i = i2;
                            for (int i6 = 0; i6 < i; i6++) {
                                if (((1 << i6) & j7) != j3) {
                                    ((x56) cc4Var.f9881a).m24287a(((long) i6) + j4);
                                }
                            }
                        } else {
                            j3 = j6;
                            i = i2;
                            jArr = null;
                        }
                        if (j10 == j3) {
                            j2 = j9;
                            break;
                        }
                        j4 += 64;
                        i2 = i;
                        j7 = j10;
                        j6 = j3;
                        j10 = j6;
                    }
                    if (cc4Var == null) {
                        jArr2 = jArr4;
                    } else {
                        x56 x56Var2 = (x56) cc4Var.f9881a;
                        int i7 = x56Var2.f67781b;
                        if (i7 == 0) {
                            jArr3 = jArr;
                        } else {
                            long[] jArr8 = new long[i7];
                            long[] jArr9 = x56Var2.f67780a;
                            for (int i8 = 0; i8 < i7; i8++) {
                                jArr8[i8] = jArr9[i8];
                            }
                            jArr3 = jArr8;
                        }
                        if (jArr3 == null) {
                            jArr2 = jArr4;
                        } else {
                            jArr2 = jArr3;
                        }
                    }
                    return new C0285a(j10, j3, j2, jArr2).m1317i(j);
                }
            } else {
                long j11 = 1 << (((int) j5) - 64);
                if ((j8 & j11) == 0) {
                    return new C0285a(j8 | j11, this.f3801b, this.f3802c, this.f3803d);
                }
            }
        } else {
            long j12 = 1 << ((int) j5);
            if ((j7 & j12) == 0) {
                return new C0285a(this.f3800a, j7 | j12, this.f3802c, this.f3803d);
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return omd.m18129S(new SnapshotIdSet$iterator$1(this, null));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(v91.m23189q0(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) obj.toString());
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
