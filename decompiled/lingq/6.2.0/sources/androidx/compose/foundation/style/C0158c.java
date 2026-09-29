package androidx.compose.foundation.style;

import p000.InterfaceC0025an;
import p000.e84;
import p000.fa4;
import p000.pg9;
import p000.t56;
import p000.un1;
import p000.wfb;
import p000.wl9;

/* JADX INFO: renamed from: androidx.compose.foundation.style.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0158c {

    /* JADX INFO: renamed from: a */
    public final Object f2749a = new Object();

    /* JADX INFO: renamed from: b */
    public final t56 f2750b;

    public C0158c() {
        t56 t56Var = e84.f36837a;
        this.f2750b = new t56();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x005c A[LOOP:0: B:7:0x000e->B:24:0x005c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x005f A[EDGE_INSN: B:32:0x005f->B:25:0x005f BREAK  A[LOOP:0: B:7:0x000e->B:24:0x005c], SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m1052a(C0158c c0158c) {
        synchronized (c0158c.f2749a) {
            t56 t56Var = c0158c.f2750b;
            long[] jArr = t56Var.f35143a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i << 3) + i3;
                                int i5 = t56Var.f35144b[i4];
                                C0157b c0157b = (C0157b) t56Var.f35145c[i4];
                                if (c0157b.f2745d == StyleAnimations$EntryState.Removing && !c0157b.f2744c.m746e()) {
                                    t56Var.m21849h(i4);
                                }
                            }
                            j >>= 8;
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
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b0 A[LOOP:0: B:7:0x0013->B:39:0x00b0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b4 A[EDGE_INSN: B:47:0x00b4->B:40:0x00b4 BREAK  A[LOOP:0: B:7:0x0013->B:39:0x00b0], SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public final void m1053b(C0159d c0159d) {
        int i;
        synchronized (this.f2749a) {
            try {
                t56 t56Var = this.f2750b;
                int[] iArr = t56Var.f35144b;
                Object[] objArr = t56Var.f35145c;
                long[] jArr = t56Var.f35143a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i2 != length) {
                                break;
                                break;
                            }
                            i2++;
                        } else {
                            int i3 = 8;
                            int i4 = 8 - ((~(i2 - length)) >>> 31);
                            int i5 = 0;
                            while (i5 < i4) {
                                if ((255 & j) < 128) {
                                    int i6 = (i2 << 3) + i5;
                                    int i7 = iArr[i6];
                                    C0157b c0157b = (C0157b) objArr[i6];
                                    int i8 = wl9.f67020a[c0157b.f2745d.ordinal()];
                                    if (i8 == 1) {
                                        i = i3;
                                        un1 un1VarM9971N0 = c0159d.m9971N0();
                                        c0157b.f2746e = true;
                                        pg9 pg9Var = c0157b.f2747f;
                                        if (pg9Var != null) {
                                            pg9Var.mo4537a(null);
                                        }
                                        c0157b.f2747f = wfb.m23926u(un1VarM9971N0, null, null, new StyleAnimations$Entry$animateIn$1(c0157b, null), 3);
                                    } else if (i8 != 3) {
                                        if (i8 == 4) {
                                            c0157b.f2745d = StyleAnimations$EntryState.Removing;
                                            c0157b.m1051a(c0159d.m9971N0());
                                        }
                                        i = i3;
                                    } else {
                                        un1 un1VarM9971N1 = c0159d.m9971N0();
                                        i = i3;
                                        if (c0157b.f2746e) {
                                            c0157b.f2746e = true;
                                            pg9 pg9Var2 = c0157b.f2747f;
                                            if (pg9Var2 != null) {
                                                pg9Var2.mo4537a(null);
                                            }
                                            c0157b.f2747f = wfb.m23926u(un1VarM9971N1, null, null, new StyleAnimations$Entry$animateIn$1(c0157b, null), 3);
                                        } else {
                                            c0157b.m1051a(un1VarM9971N1);
                                        }
                                    }
                                } else {
                                    i = i3;
                                }
                                j >>= i;
                                i5++;
                                i3 = i;
                            }
                            if (i4 != i3) {
                                break;
                            } else if (i2 != length) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0064 A[LOOP:0: B:7:0x0014->B:26:0x0064, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0067 A[EDGE_INSN: B:34:0x0067->B:27:0x0067 BREAK  A[LOOP:0: B:7:0x0014->B:26:0x0064], SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public final void m1054c() {
        synchronized (this.f2749a) {
            t56 t56Var = this.f2750b;
            int[] iArr = t56Var.f35144b;
            Object[] objArr = t56Var.f35145c;
            long[] jArr = t56Var.f35143a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i << 3) + i3;
                                int i5 = iArr[i4];
                                C0157b c0157b = (C0157b) objArr[i4];
                                int i6 = wl9.f67020a[c0157b.f2745d.ordinal()];
                                if (i6 == 1 || i6 == 2 || i6 == 3) {
                                    c0157b.f2745d = StyleAnimations$EntryState.Untouched;
                                }
                            }
                            j >>= 8;
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
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1055d(int i, InterfaceC0025an interfaceC0025an, InterfaceC0025an interfaceC0025an2) {
        synchronized (this.f2749a) {
            try {
                C0157b c0157b = (C0157b) this.f2750b.m10152b(i);
                if (c0157b == null) {
                    this.f2750b.m21850i(i, new C0157b(this, interfaceC0025an, interfaceC0025an2));
                } else if (fa4.m11650l(c0157b.f2742a, interfaceC0025an) && fa4.m11650l(c0157b.f2743b, interfaceC0025an2)) {
                    c0157b.f2745d = StyleAnimations$EntryState.Unchanged;
                } else {
                    c0157b.f2743b = interfaceC0025an2;
                    c0157b.f2742a = interfaceC0025an;
                    c0157b.f2745d = StyleAnimations$EntryState.Changed;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final float m1056e(int i) {
        synchronized (this.f2749a) {
            C0157b c0157b = (C0157b) this.f2750b.m10152b(i);
            if (c0157b == null) {
                return 0.0f;
            }
            return ((Number) c0157b.f2744c.m745d()).floatValue();
        }
    }
}
