package androidx.compose.p002ui.node;

import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;
import java.util.Map;
import p000.AbstractC3550rv;
import p000.AbstractC3608te;
import p000.C3488q8;
import p000.InterfaceC3682ve;
import p000.aq4;
import p000.f84;
import p000.fa4;
import p000.i54;
import p000.it5;
import p000.jt5;
import p000.kv3;
import p000.l36;
import p000.l87;
import p000.m2b;
import p000.n66;
import p000.n84;
import p000.n87;
import p000.o66;
import p000.oq4;
import p000.pvc;
import p000.qpa;
import p000.ui3;
import p000.vi3;
import p000.vk5;
import p000.wk5;
import p000.xfa;
import p000.xk5;

/* JADX INFO: renamed from: androidx.compose.ui.node.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0359i extends l87 implements l36, jt5 {

    /* JADX INFO: renamed from: H */
    public C3488q8 f4360H;

    /* JADX INFO: renamed from: I */
    public n66 f4361I;

    /* JADX INFO: renamed from: f */
    public vk5 f4362f;

    /* JADX INFO: renamed from: g */
    public vi3 f4363g;

    /* JADX INFO: renamed from: h */
    public n87 f4364h;

    /* JADX INFO: renamed from: i */
    public boolean f4365i;

    /* JADX INFO: renamed from: j */
    public boolean f4366j;

    /* JADX INFO: renamed from: k */
    public boolean f4367k;

    /* JADX INFO: renamed from: l */
    public final xk5 f4368l = new xk5(this, 0);

    /* JADX INFO: renamed from: R0 */
    public static void m1616R0(AbstractC0362l abstractC0362l) {
        oq4 oq4Var;
        AbstractC0362l abstractC0362l2 = abstractC0362l.f4433K;
        C0357g c0357g = abstractC0362l.f4432J;
        if (!fa4.m11650l(abstractC0362l2 != null ? abstractC0362l2.f4432J : null, c0357g)) {
            c0357g.f4337b0.f58070p.f4405T.m1538g();
            return;
        }
        InterfaceC3682ve interfaceC3682veMo1644f = c0357g.f4337b0.f58070p.mo1644f();
        if (interfaceC3682veMo1644f == null || (oq4Var = ((C0361k) interfaceC3682veMo1644f).f4405T) == null) {
            return;
        }
        oq4Var.m1538g();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0052 A[LOOP:0: B:11:0x001b->B:21:0x0052, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x0055 A[EDGE_INSN: B:48:0x0055->B:22:0x0055 BREAK  A[LOOP:0: B:11:0x001b->B:21:0x0052], SYNTHETIC] */
    /* JADX INFO: renamed from: B0 */
    public final void m1617B0(it5 it5Var) {
        long j;
        long j2;
        n66 n66Var = this.f4361I;
        if (this.f4367k) {
            return;
        }
        vi3 vi3VarMo10691e = it5Var.mo10691e();
        if (vi3VarMo10691e != null) {
            boolean z = this.f4363g != vi3VarMo10691e;
            if (z || !m1627Q0().f65535a) {
                j = 0;
                j2 = 9223372034707292159L;
            } else {
                aq4 aq4VarMo1620H0 = mo1620H0();
                long jM19495C = pvc.m19495C(aq4VarMo1620H0.mo1695q(0L));
                long jMo1687j = aq4VarMo1620H0.mo1687j();
                j2 = jM19495C;
                j = jMo1687j;
                z = (f84.m11593b(jM19495C, m1627Q0().f65536b) && n84.m17279a(jMo1687j, m1627Q0().f65537c)) ? false : true;
            }
            if (z) {
                n87 n87Var = this.f4364h;
                if (n87Var != null) {
                    n87Var.f52489a = it5Var;
                } else {
                    n87Var = new n87(it5Var, this);
                    this.f4364h = n87Var;
                }
                m1632u0(n87Var, j2, j);
                this.f4363g = it5Var.mo10691e();
                return;
            }
            return;
        }
        if (n66Var != null) {
            Object[] objArr = n66Var.f52401c;
            long[] jArr = n66Var.f52399a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j3 = jArr[i];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j3) < 128) {
                                m1628S0((o66) objArr[(i << 3) + i3]);
                            }
                            j3 >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            n66Var.m17249a();
        }
    }

    /* JADX INFO: renamed from: E0 */
    public abstract AbstractC0359i mo1618E0();

    @Override // p000.l36
    /* JADX INFO: renamed from: H */
    public final void mo1619H(boolean z) {
        AbstractC0359i abstractC0359iMo1625O0 = mo1625O0();
        C0357g c0357gMo1622J0 = abstractC0359iMo1625O0 != null ? abstractC0359iMo1625O0.mo1622J0() : null;
        if (fa4.m11650l(c0357gMo1622J0, mo1622J0())) {
            this.f4365i = z;
            return;
        }
        if ((c0357gMo1622J0 != null ? c0357gMo1622J0.f4337b0.f58058d : null) != LayoutNode$LayoutState.LayingOut) {
            if ((c0357gMo1622J0 != null ? c0357gMo1622J0.f4337b0.f58058d : null) != LayoutNode$LayoutState.LookaheadLayingOut) {
                return;
            }
        }
        this.f4365i = z;
    }

    /* JADX INFO: renamed from: H0 */
    public abstract aq4 mo1620H0();

    /* JADX INFO: renamed from: I0 */
    public abstract boolean mo1621I0();

    /* JADX INFO: renamed from: J0 */
    public abstract C0357g mo1622J0();

    @Override // p000.jt5
    /* JADX INFO: renamed from: M */
    public final it5 mo1623M(int i, int i2, Map map, vi3 vi3Var, vi3 vi3Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            i54.m13663b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new wk5(i, i2, map, vi3Var, vi3Var2, this);
    }

    /* JADX INFO: renamed from: N0 */
    public abstract it5 mo1624N0();

    /* JADX INFO: renamed from: O0 */
    public abstract AbstractC0359i mo1625O0();

    /* JADX INFO: renamed from: P0 */
    public abstract long mo1626P0();

    /* JADX INFO: renamed from: Q0 */
    public final vk5 m1627Q0() {
        vk5 vk5Var = this.f4362f;
        if (vk5Var != null) {
            return vk5Var;
        }
        vk5 vk5Var2 = new vk5(this);
        this.f4362f = vk5Var2;
        return vk5Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S0 */
    public final void m1628S0(o66 o66Var) {
        C0357g c0357g;
        Object[] objArr = o66Var.f1303b;
        long[] jArr = o66Var.f1302a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128 && (c0357g = (C0357g) ((m2b) objArr[(i << 3) + i3]).get()) != null) {
                        if (mo211f0()) {
                            c0357g.m1581Y(false);
                        } else {
                            c0357g.m1582a0(false);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: T0 */
    public abstract void mo1629T0();

    @Override // p000.l87
    /* JADX INFO: renamed from: V */
    public final int mo1630V(AbstractC3608te abstractC3608te) {
        int iMo1547r0;
        if (!mo1621I0() || (iMo1547r0 = mo1547r0(abstractC3608te)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        boolean z = abstractC3608te instanceof qpa;
        long j = this.f49305e;
        return iMo1547r0 + ((int) (z ? j >> 32 : 4294967295L & j));
    }

    @Override // p000.aa4
    /* JADX INFO: renamed from: f0 */
    public boolean mo211f0() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0108  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p0 */
    public final void m1631p0(C0357g c0357g, kv3 kv3Var) {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        char c2;
        long j5;
        long j6;
        int i2;
        int i3;
        int i4;
        n66 n66Var = this.f4361I;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i5 = 8;
        if (n66Var != null) {
            Object[] objArr = n66Var.f52401c;
            long[] jArr3 = n66Var.f52399a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                long j8 = 128;
                while (true) {
                    long j9 = jArr3[i6];
                    j2 = 255;
                    if ((((~j9) << c3) & j9 & j7) != j7) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j9 & 255) < j8) {
                                c2 = c3;
                                o66 o66Var = (o66) objArr[(i6 << 3) + i8];
                                j5 = j7;
                                Object[] objArr2 = o66Var.f1303b;
                                long[] jArr4 = o66Var.f1302a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j6 = j8;
                                    int i9 = 0;
                                    int i10 = i5;
                                    while (true) {
                                        int i11 = length2;
                                        long j10 = jArr4[i9];
                                        jArr2 = jArr3;
                                        j4 = j9;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i12 = 8 - ((~(i9 - i11)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((j10 & 255) < j6) {
                                                    int i14 = (i9 << 3) + i13;
                                                    C0357g c0357g2 = (C0357g) ((m2b) objArr2[i14]).get();
                                                    i3 = i13;
                                                    if (c0357g2 != null) {
                                                        boolean zM1569L = c0357g2.m1569L();
                                                        i4 = i8;
                                                        if (zM1569L) {
                                                        }
                                                    } else {
                                                        i4 = i8;
                                                    }
                                                    o66Var.m17820m(i14);
                                                } else {
                                                    i3 = i13;
                                                    i4 = i8;
                                                }
                                                j10 >>= i10;
                                                i13 = i3 + 1;
                                                i8 = i4;
                                            }
                                            i = i8;
                                            if (i12 != i10) {
                                                break;
                                            }
                                        } else {
                                            i = i8;
                                        }
                                        length2 = i11;
                                        if (i9 == length2) {
                                            break;
                                        }
                                        i9++;
                                        jArr3 = jArr2;
                                        j9 = j4;
                                        i8 = i;
                                        i10 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j4 = j9;
                                    i = i8;
                                    j6 = j8;
                                }
                                i2 = 8;
                            } else {
                                jArr2 = jArr3;
                                j4 = j9;
                                i = i8;
                                c2 = c3;
                                j5 = j7;
                                j6 = j8;
                                i2 = i5;
                            }
                            i5 = i2;
                            j9 = j4 >> i2;
                            c3 = c2;
                            j7 = j5;
                            j8 = j6;
                            i8 = i + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                        if (i7 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c3 = c;
                    j7 = j;
                    j8 = j3;
                    jArr3 = jArr;
                    i5 = 8;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 255;
                j3 = 128;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 255;
            j3 = 128;
        }
        n66 n66Var2 = this.f4361I;
        if (n66Var2 != null) {
            long[] jArr5 = n66Var2.f52399a;
            int length3 = jArr5.length - 2;
            if (length3 >= 0) {
                int i15 = 0;
                while (true) {
                    long j11 = jArr5[i15];
                    if ((((~j11) << c) & j11 & j) != j) {
                        int i16 = 8 - ((~(i15 - length3)) >>> 31);
                        for (int i17 = 0; i17 < i16; i17++) {
                            if ((j11 & j2) < j3) {
                                int i18 = (i15 << 3) + i17;
                                if (((o66) n66Var2.f52401c[i18]).m724b()) {
                                    n66Var2.m17260l(i18);
                                }
                            }
                            j11 >>= 8;
                        }
                        if (i16 != 8) {
                            break;
                        }
                    }
                    if (i15 == length3) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
        }
        n66 n66Var3 = this.f4361I;
        if (n66Var3 == null) {
            n66Var3 = new n66();
            this.f4361I = n66Var3;
        }
        Object objM17255g = n66Var3.m17255g(kv3Var);
        if (objM17255g == null) {
            objM17255g = new o66();
            n66Var3.m17261m(kv3Var, objM17255g);
        }
        ((o66) objM17255g).m17818k(new m2b(c0357g));
    }

    /* JADX INFO: renamed from: r0 */
    public abstract int mo1547r0(AbstractC3608te abstractC3608te);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u0 */
    public final void m1632u0(final n87 n87Var, final long j, final long j2) {
        boolean z;
        char c;
        long j3;
        long j4;
        long j5;
        C0357g c0357g;
        boolean z2;
        int i;
        char c2;
        long j6;
        C0364n snapshotObserver;
        n66 n66Var = this.f4361I;
        C3488q8 c3488q8 = this.f4360H;
        if (c3488q8 == null) {
            c3488q8 = new C3488q8();
            this.f4360H = c3488q8;
        }
        C3488q8 c3488q9 = c3488q8;
        Owner owner = mo1622J0().f4316I;
        if (owner != null && (snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0391c) owner).getSnapshotObserver()) != null) {
            snapshotObserver.f4460a.m11067c(n87Var, LookaheadCapablePlaceable$Companion$onCommitAffectingRuler$1.f4237b, new ui3() { // from class: androidx.compose.ui.node.LookaheadCapablePlaceable$captureRulers$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p000.ui3
                /* JADX INFO: renamed from: a */
                public final Object mo0a() {
                    AbstractC0359i abstractC0359i = this.f4238b;
                    abstractC0359i.m1627Q0().f65535a = false;
                    abstractC0359i.m1627Q0().f65536b = j;
                    abstractC0359i.m1627Q0().f65537c = j2;
                    vi3 vi3VarMo10691e = n87Var.f52489a.mo10691e();
                    if (vi3VarMo10691e != null) {
                        vi3VarMo10691e.invoke(abstractC0359i.m1627Q0());
                    }
                    return xfa.f68157a;
                }
            });
        }
        boolean zMo211f0 = mo211f0();
        o66 o66Var = (o66) c3488q9.f57372f;
        o66 o66Var2 = (o66) c3488q9.f57373g;
        int i2 = c3488q9.f57368b;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = ((byte[]) c3488q9.f57371e)[i3];
            if (b == 3) {
                kv3 kv3Var = ((kv3[]) c3488q9.f57369c)[i3];
                kv3Var.getClass();
                o66Var2.m17818k(kv3Var);
            } else if (b != 0 && n66Var != null) {
                kv3 kv3Var2 = ((kv3[]) c3488q9.f57369c)[i3];
                kv3Var2.getClass();
                o66 o66Var3 = (o66) n66Var.m17259k(kv3Var2);
                if (o66Var3 != null) {
                    o66Var.m17817j(o66Var3);
                }
            }
        }
        int i4 = c3488q9.f57368b;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = (byte[]) c3488q9.f57371e;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                kv3[] kv3VarArr = (kv3[]) c3488q9.f57369c;
                kv3VarArr[i6 - i5] = kv3VarArr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = c3488q9.f57368b;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            ((kv3[]) c3488q9.f57369c)[i8] = null;
        }
        c3488q9.f57368b -= i5;
        AbstractC0359i abstractC0359iMo1625O0 = mo1625O0();
        Object[] objArr = o66Var2.f1303b;
        long[] jArr = o66Var2.f1302a;
        int length = jArr.length - 2;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i9 = 8;
        if (length >= 0) {
            j4 = 128;
            int i10 = 0;
            while (true) {
                long j8 = jArr[i10];
                j5 = 255;
                if ((((~j8) << c3) & j8 & j7) != j7) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            c2 = c3;
                            kv3 kv3Var3 = (kv3) objArr[(i10 << 3) + i12];
                            j6 = j7;
                            AbstractC0359i abstractC0359i = abstractC0359iMo1625O0 == null ? this : abstractC0359iMo1625O0;
                            i = i9;
                            AbstractC0359i abstractC0359i2 = abstractC0359i;
                            while (true) {
                                C3488q8 c3488q10 = abstractC0359i2.f4360H;
                                if (c3488q10 != null) {
                                    z2 = zMo211f0;
                                    if (AbstractC3550rv.m20823Q((kv3[]) c3488q10.f57369c, kv3Var3)) {
                                        break;
                                    } else {
                                        break;
                                    }
                                }
                                z2 = zMo211f0;
                                AbstractC0359i abstractC0359iMo1625O1 = abstractC0359i2.mo1625O0();
                                if (abstractC0359iMo1625O1 == null) {
                                    break;
                                }
                                abstractC0359i2 = abstractC0359iMo1625O1;
                                zMo211f0 = z2;
                            }
                            n66 n66Var2 = abstractC0359i2.f4361I;
                            o66 o66Var4 = n66Var2 != null ? (o66) n66Var2.m17259k(kv3Var3) : null;
                            if (o66Var4 != null) {
                                abstractC0359i.m1628S0(o66Var4);
                            }
                        } else {
                            z2 = zMo211f0;
                            i = i9;
                            c2 = c3;
                            j6 = j7;
                        }
                        j8 >>= i;
                        i12++;
                        c3 = c2;
                        j7 = j6;
                        i9 = i;
                        zMo211f0 = z2;
                    }
                    z = zMo211f0;
                    c = c3;
                    j3 = j7;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    z = zMo211f0;
                    c = c3;
                    j3 = j7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c3 = c;
                j7 = j3;
                zMo211f0 = z;
                i9 = 8;
            }
        } else {
            z = zMo211f0;
            c = 7;
            j3 = -9187201950435737472L;
            j4 = 128;
            j5 = 255;
        }
        o66Var2.m17812e();
        Object[] objArr2 = o66Var.f1303b;
        long[] jArr2 = o66Var.f1302a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c) & j9 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j4 && (c0357g = (C0357g) ((m2b) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (z) {
                                c0357g.m1581Y(false);
                            } else {
                                c0357g.m1582a0(false);
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length2) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        o66Var.m17812e();
    }
}
