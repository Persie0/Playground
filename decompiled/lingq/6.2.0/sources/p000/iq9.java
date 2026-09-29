package p000;

import androidx.compose.animation.AbstractC0054a;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iq9 {

    /* JADX INFO: renamed from: a */
    public static final float f44431a;

    /* JADX INFO: renamed from: b */
    public static final float f44432b;

    /* JADX INFO: renamed from: c */
    public static final float f44433c;

    /* JADX INFO: renamed from: d */
    public static final float f44434d;

    /* JADX INFO: renamed from: e */
    public static final long f44435e;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = tj7.f62415a;
        f44431a = tj7.f62418d;
        f44432b = 16.0f;
        f44433c = 14.0f;
        f44434d = 6.0f;
        f44435e = d32.m10018P(20);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0113  */
    /* JADX WARN: Code duplicated, block: B:102:0x0116  */
    /* JADX WARN: Code duplicated, block: B:105:0x011c  */
    /* JADX WARN: Code duplicated, block: B:108:0x012c  */
    /* JADX WARN: Code duplicated, block: B:111:0x0175  */
    /* JADX WARN: Code duplicated, block: B:114:0x0182  */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:41:0x006a  */
    /* JADX WARN: Code duplicated, block: B:43:0x006e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:46:0x0079  */
    /* JADX WARN: Code duplicated, block: B:49:0x007f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0086  */
    /* JADX WARN: Code duplicated, block: B:54:0x008a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0092  */
    /* JADX WARN: Code duplicated, block: B:57:0x0095  */
    /* JADX WARN: Code duplicated, block: B:60:0x009b  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00da  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:98:0x010e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x0110  */
    /* JADX INFO: renamed from: a */
    public static final void m14076a(final boolean z, final ui3 ui3Var, e16 e16Var, boolean z2, long j, long j2, final C0282a c0282a, ye1 ye1Var, final int i, final int i2) {
        int i3;
        final e16 e16Var2;
        int i4;
        boolean z3;
        int i5;
        long j3;
        long j4;
        int i6;
        C0282a c0282a2;
        boolean z4;
        final boolean z5;
        final long j5;
        final long j6;
        x18 x18VarM22143u;
        e16 e16Var3;
        int i7;
        boolean z6;
        long j7;
        e16 e16Var4;
        int i8;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1573136853);
        if ((i & 6) == 0) {
            i3 = (tj3Var.m22122h(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= tj3Var.m22124i(ui3Var) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 == 0) {
            if ((i & 384) == 0) {
                e16Var2 = e16Var;
                i3 |= tj3Var.m22120g(e16Var2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z3 = z2;
                    if (tj3Var.m22122h(z3)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        j3 = j;
                        int i10 = tj3Var.m22118f(j3) ? 16384 : 8192;
                        i3 |= i10;
                    } else {
                        j3 = j;
                    }
                    i3 |= i10;
                } else {
                    j3 = j;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        j4 = j2;
                        int i11 = tj3Var.m22118f(j4) ? 131072 : 65536;
                        i3 |= i11;
                    } else {
                        j4 = j2;
                    }
                    i3 |= i11;
                } else {
                    j4 = j2;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (tj3Var.m22120g(null)) {
                        i6 = 1048576;
                    } else {
                        i6 = 524288;
                    }
                    i3 |= i6;
                }
                if ((12582912 & i) == 0) {
                    c0282a2 = c0282a;
                    if (tj3Var.m22124i(c0282a2)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i3 |= i8;
                } else {
                    c0282a2 = c0282a;
                }
                if ((4793491 & i3) != 4793490) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (tj3Var.m22099R(i3 & 1, z4)) {
                    tj3Var.m22104W();
                    if ((i & 1) != 0 || tj3Var.m22084B()) {
                        if (i9 != 0) {
                            e16Var3 = b16.f7762a;
                        } else {
                            e16Var3 = e16Var2;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if ((i2 & 16) != 0) {
                            j3 = ((aa1) tj3Var.m22128k(sk1.f60948a)).f414a;
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            j4 = j3;
                        }
                        i7 = i3;
                        z6 = z3;
                        j7 = j4;
                        e16Var4 = e16Var3;
                    } else {
                        tj3Var.m22102U();
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        e16Var4 = e16Var2;
                        j7 = j4;
                        i7 = i3;
                        z6 = z3;
                    }
                    long j8 = j3;
                    tj3Var.m22140r();
                    int i12 = i7 >> 12;
                    m14079d(j8, j7, z, ci8.m4703P(1128552423, new o48(e16Var4, z, gh8.m12656a(true, 0.0f, j8, null, 250), z6, ui3Var, c0282a2), tj3Var), tj3Var, (i12 & 112) | (i12 & 14) | 3072 | ((i7 << 6) & 896));
                    j5 = j8;
                    j6 = j7;
                    e16Var2 = e16Var4;
                    z5 = z6;
                } else {
                    tj3Var.m22102U();
                    z5 = z3;
                    j5 = j3;
                    j6 = j4;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zi3() { // from class: eq9
                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            iq9.m14076a(z, ui3Var, e16Var2, z5, j5, j6, c0282a, (ye1) obj, pk9.m19383z(i | 1), i2);
                            return xfa.f68157a;
                        }
                    };
                }
            }
            i3 |= 3072;
            z3 = z2;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    j3 = j;
                    if (tj3Var.m22118f(j3)) {
                    }
                    i3 |= i10;
                } else {
                    j3 = j;
                }
                i3 |= i10;
            } else {
                j3 = j;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    j4 = j2;
                    if (tj3Var.m22118f(j4)) {
                    }
                    i3 |= i11;
                } else {
                    j4 = j2;
                }
                i3 |= i11;
            } else {
                j4 = j2;
            }
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (tj3Var.m22120g(null)) {
                    i6 = 1048576;
                } else {
                    i6 = 524288;
                }
                i3 |= i6;
            }
            if ((12582912 & i) == 0) {
                c0282a2 = c0282a;
                if (tj3Var.m22124i(c0282a2)) {
                    i8 = 8388608;
                } else {
                    i8 = 4194304;
                }
                i3 |= i8;
            } else {
                c0282a2 = c0282a;
            }
            if ((4793491 & i3) != 4793490) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (tj3Var.m22099R(i3 & 1, z4)) {
                tj3Var.m22104W();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        e16Var3 = b16.f7762a;
                    } else {
                        e16Var3 = e16Var2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        j3 = ((aa1) tj3Var.m22128k(sk1.f60948a)).f414a;
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        j4 = j3;
                    }
                    i7 = i3;
                    z6 = z3;
                    j7 = j4;
                    e16Var4 = e16Var3;
                } else {
                    if (i9 != 0) {
                        e16Var3 = b16.f7762a;
                    } else {
                        e16Var3 = e16Var2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        j3 = ((aa1) tj3Var.m22128k(sk1.f60948a)).f414a;
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        j4 = j3;
                    }
                    i7 = i3;
                    z6 = z3;
                    j7 = j4;
                    e16Var4 = e16Var3;
                }
                long j9 = j3;
                tj3Var.m22140r();
                int i13 = i7 >> 12;
                m14079d(j9, j7, z, ci8.m4703P(1128552423, new o48(e16Var4, z, gh8.m12656a(true, 0.0f, j9, null, 250), z6, ui3Var, c0282a2), tj3Var), tj3Var, (i13 & 112) | (i13 & 14) | 3072 | ((i7 << 6) & 896));
                j5 = j9;
                j6 = j7;
                e16Var2 = e16Var4;
                z5 = z6;
            } else {
                tj3Var.m22102U();
                z5 = z3;
                j5 = j3;
                j6 = j4;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: eq9
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        iq9.m14076a(z, ui3Var, e16Var2, z5, j5, j6, c0282a, (ye1) obj, pk9.m19383z(i | 1), i2);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i3 |= 384;
        e16Var2 = e16Var;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                z3 = z2;
                if (tj3Var.m22122h(z3)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    j3 = j;
                    if (tj3Var.m22118f(j3)) {
                    }
                    i3 |= i10;
                } else {
                    j3 = j;
                }
                i3 |= i10;
            } else {
                j3 = j;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    j4 = j2;
                    if (tj3Var.m22118f(j4)) {
                    }
                    i3 |= i11;
                } else {
                    j4 = j2;
                }
                i3 |= i11;
            } else {
                j4 = j2;
            }
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (tj3Var.m22120g(null)) {
                    i6 = 1048576;
                } else {
                    i6 = 524288;
                }
                i3 |= i6;
            }
            if ((12582912 & i) == 0) {
                c0282a2 = c0282a;
                if (tj3Var.m22124i(c0282a2)) {
                    i8 = 8388608;
                } else {
                    i8 = 4194304;
                }
                i3 |= i8;
            } else {
                c0282a2 = c0282a;
            }
            if ((4793491 & i3) != 4793490) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (tj3Var.m22099R(i3 & 1, z4)) {
                tj3Var.m22104W();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        e16Var3 = b16.f7762a;
                    } else {
                        e16Var3 = e16Var2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        j3 = ((aa1) tj3Var.m22128k(sk1.f60948a)).f414a;
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        j4 = j3;
                    }
                    i7 = i3;
                    z6 = z3;
                    j7 = j4;
                    e16Var4 = e16Var3;
                } else {
                    if (i9 != 0) {
                        e16Var3 = b16.f7762a;
                    } else {
                        e16Var3 = e16Var2;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        j3 = ((aa1) tj3Var.m22128k(sk1.f60948a)).f414a;
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        j4 = j3;
                    }
                    i7 = i3;
                    z6 = z3;
                    j7 = j4;
                    e16Var4 = e16Var3;
                }
                long j10 = j3;
                tj3Var.m22140r();
                int i14 = i7 >> 12;
                m14079d(j10, j7, z, ci8.m4703P(1128552423, new o48(e16Var4, z, gh8.m12656a(true, 0.0f, j10, null, 250), z6, ui3Var, c0282a2), tj3Var), tj3Var, (i14 & 112) | (i14 & 14) | 3072 | ((i7 << 6) & 896));
                j5 = j10;
                j6 = j7;
                e16Var2 = e16Var4;
                z5 = z6;
            } else {
                tj3Var.m22102U();
                z5 = z3;
                j5 = j3;
                j6 = j4;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: eq9
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        iq9.m14076a(z, ui3Var, e16Var2, z5, j5, j6, c0282a, (ye1) obj, pk9.m19383z(i | 1), i2);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i3 |= 3072;
        z3 = z2;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                j3 = j;
                if (tj3Var.m22118f(j3)) {
                }
                i3 |= i10;
            } else {
                j3 = j;
            }
            i3 |= i10;
        } else {
            j3 = j;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                j4 = j2;
                if (tj3Var.m22118f(j4)) {
                }
                i3 |= i11;
            } else {
                j4 = j2;
            }
            i3 |= i11;
        } else {
            j4 = j2;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            if (tj3Var.m22120g(null)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i3 |= i6;
        }
        if ((12582912 & i) == 0) {
            c0282a2 = c0282a;
            if (tj3Var.m22124i(c0282a2)) {
                i8 = 8388608;
            } else {
                i8 = 4194304;
            }
            i3 |= i8;
        } else {
            c0282a2 = c0282a;
        }
        if ((4793491 & i3) != 4793490) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (tj3Var.m22099R(i3 & 1, z4)) {
            tj3Var.m22104W();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    e16Var3 = b16.f7762a;
                } else {
                    e16Var3 = e16Var2;
                }
                if (i4 != 0) {
                    z3 = true;
                }
                if ((i2 & 16) != 0) {
                    j3 = ((aa1) tj3Var.m22128k(sk1.f60948a)).f414a;
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    j4 = j3;
                }
                i7 = i3;
                z6 = z3;
                j7 = j4;
                e16Var4 = e16Var3;
            } else {
                if (i9 != 0) {
                    e16Var3 = b16.f7762a;
                } else {
                    e16Var3 = e16Var2;
                }
                if (i4 != 0) {
                    z3 = true;
                }
                if ((i2 & 16) != 0) {
                    j3 = ((aa1) tj3Var.m22128k(sk1.f60948a)).f414a;
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    j4 = j3;
                }
                i7 = i3;
                z6 = z3;
                j7 = j4;
                e16Var4 = e16Var3;
            }
            long j11 = j3;
            tj3Var.m22140r();
            int i15 = i7 >> 12;
            m14079d(j11, j7, z, ci8.m4703P(1128552423, new o48(e16Var4, z, gh8.m12656a(true, 0.0f, j11, null, 250), z6, ui3Var, c0282a2), tj3Var), tj3Var, (i15 & 112) | (i15 & 14) | 3072 | ((i7 << 6) & 896));
            j5 = j11;
            j6 = j7;
            e16Var2 = e16Var4;
            z5 = z6;
        } else {
            tj3Var.m22102U();
            z5 = z3;
            j5 = j3;
            j6 = j4;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: eq9
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    iq9.m14076a(z, ui3Var, e16Var2, z5, j5, j6, c0282a, (ye1) obj, pk9.m19383z(i | 1), i2);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m14077b(final boolean z, final ui3 ui3Var, e16 e16Var, boolean z2, final zi3 zi3Var, long j, long j2, ye1 ye1Var, final int i) {
        final e16 e16Var2;
        final boolean z3;
        final long j3;
        final long j4;
        int i2;
        e16 e16Var3;
        long j5;
        long j6;
        boolean z4;
        C0282a c0282aM4703P;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1015017965);
        int i3 = i | (tj3Var.m22122h(z) ? 4 : 2) | (tj3Var.m22124i(ui3Var) ? 32 : 16) | 105581952;
        byte b = 0;
        if (tj3Var.m22099R(i3 & 1, (38347923 & i3) != 38347922)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                long j7 = ((aa1) tj3Var.m22128k(sk1.f60948a)).f414a;
                i2 = i3 & (-33030145);
                e16Var3 = b16.f7762a;
                j5 = j7;
                j6 = j5;
                z4 = true;
            } else {
                tj3Var.m22102U();
                i2 = i3 & (-33030145);
                e16Var3 = e16Var;
                z4 = z2;
                j5 = j;
                j6 = j2;
            }
            tj3Var.m22140r();
            if (zi3Var == null) {
                tj3Var.m22111b0(1830887765);
                tj3Var.m22139q(false);
                c0282aM4703P = null;
            } else {
                tj3Var.m22111b0(1830887766);
                c0282aM4703P = ci8.m4703P(-1745256900, new C0844ce(zi3Var, 7, b), tj3Var);
                tj3Var.m22139q(false);
            }
            m14076a(z, ui3Var, te1.m21968A(e16Var3, new z70(0)), z4, j5, j6, ci8.m4703P(-906085472, new wu8(1, c0282aM4703P), tj3Var), tj3Var, (i2 & 112) | (i2 & 14) | 12582912 | 1575936, 0);
            e16Var2 = e16Var3;
            z3 = z4;
            j3 = j5;
            j4 = j6;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
            z3 = z2;
            j3 = j;
            j4 = j2;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3(z, ui3Var, e16Var2, z3, zi3Var, j3, j4, i) { // from class: dq9

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ boolean f36034a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ui3 f36035b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ e16 f36036c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ boolean f36037d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ zi3 f36038e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ long f36039f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ long f36040g;

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(24577);
                    iq9.m14077b(this.f36034a, this.f36035b, this.f36036c, this.f36037d, this.f36038e, this.f36039f, this.f36040g, (ye1) obj, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m14078c(zi3 zi3Var, ye1 ye1Var, int i) {
        boolean z;
        gc0 gc0Var = nj0.f52808c;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1349901398);
        int i2 = (tj3Var.m22124i(zi3Var) ? 4 : 2) | i | (tj3Var.m22124i(null) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            int i3 = i2 & 14;
            boolean z2 = ((i2 & 112) == 32) | (i3 == 4);
            Object objM22097O = tj3Var.m22097O();
            if (z2 || objM22097O == we1.f66679a) {
                objM22097O = new hq9(zi3Var);
                tj3Var.m22131l0(objM22097O);
            }
            ht5 ht5Var = (ht5) objM22097O;
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            b16 b16Var = b16.f7762a;
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, b16Var);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            zi3 zi3Var2 = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var2, ht5Var);
            zi3 zi3Var3 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var3, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var4 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var4, numValueOf);
            vi3 vi3Var = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var);
            zi3 zi3Var5 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var5, e16VarM1322c);
            if (zi3Var != null) {
                tj3Var.m22111b0(870361332);
                e16 e16VarM21609V = AbstractC3584sr.m21609V(l70.m15961x(b16Var, "text"), f44432b, 0.0f, 2);
                ht5 ht5VarM19966d = qh0.m19966d(gc0Var, false);
                int iHashCode2 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m2 = tj3Var.m22132m();
                e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM21609V);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var2, ht5VarM19966d);
                oha.m18001g(tj3Var, zi3Var3, l77VarM22132m2);
                AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var4, tj3Var, vi3Var);
                oha.m18001g(tj3Var, zi3Var5, e16VarM1322c2);
                zi3Var.invoke(tj3Var, Integer.valueOf(i3));
                z = true;
                tj3Var.m22139q(true);
                tj3Var.m22139q(false);
            } else {
                z = true;
                tj3Var.m22111b0(870466081);
                tj3Var.m22139q(false);
            }
            tj3Var.m22111b0(870557345);
            tj3Var.m22139q(false);
            tj3Var.m22139q(z);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C0844ce(i, zi3Var);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m14079d(final long j, final long j2, boolean z, final C0282a c0282a, ye1 ye1Var, final int i) {
        int i2;
        final boolean z2;
        Object objM24111g;
        boolean z3;
        l43 l43VarM21705c0;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-833145221);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22118f(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22118f(j2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= tj3Var.m22122h(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var.m22124i(c0282a) ? 2048 : 1024;
        }
        boolean z4 = false;
        if (tj3Var.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = i2 >> 6;
            faa faaVarM15046h = kaa.m15046h(Boolean.valueOf(z2), null, tj3Var, i3 & 14, 2);
            boolean zBooleanValue = ((Boolean) ((xc9) faaVarM15046h.f38738d).getValue()).booleanValue();
            tj3Var.m22111b0(-1069234984);
            long j3 = zBooleanValue ? j : j2;
            tj3Var.m22139q(false);
            sa1 sa1VarM202f = aa1.m202f(j3);
            boolean zM22120g = tj3Var.m22120g(sa1VarM202f);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22120g || objM22097O == p84Var) {
                int i4 = aa1.f413l;
                objM22097O = (jda) AbstractC0054a.m735j().invoke(sa1VarM202f);
                tj3Var.m22131l0(objM22097O);
            }
            jda jdaVar = (jda) objM22097O;
            if (faaVarM15046h.m11673g()) {
                objM24111g = wq1.m24111g(tj3Var, 1666827533, false, faaVarM15046h);
            } else {
                tj3Var.m22111b0(1666573488);
                boolean zM22120g2 = tj3Var.m22120g(faaVarM15046h);
                objM24111g = tj3Var.m22097O();
                if (zM22120g2 || objM24111g == p84Var) {
                    jc9 jc9VarM16139y = lda.m16139y();
                    vi3 vi3VarMo3163e = jc9VarM16139y != null ? jc9VarM16139y.mo3163e() : null;
                    jc9 jc9VarM16106F = lda.m16106F(jc9VarM16139y);
                    try {
                        Object objM11669c = faaVarM15046h.m11669c();
                        lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
                        tj3Var.m22131l0(objM11669c);
                        objM24111g = objM11669c;
                        z4 = false;
                    } catch (Throwable th) {
                        lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
                        throw th;
                    }
                }
                tj3Var.m22139q(z4);
            }
            boolean zBooleanValue2 = ((Boolean) objM24111g).booleanValue();
            tj3Var.m22111b0(-1069234984);
            long j4 = zBooleanValue2 ? j : j2;
            tj3Var.m22139q(z4);
            aa1 aa1Var = new aa1(j4);
            boolean zM22120g3 = tj3Var.m22120g(faaVarM15046h);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22120g3 || objM22097O2 == p84Var) {
                objM22097O2 = AbstractC0278f.m1254d(new sw5(faaVarM15046h, 4));
                tj3Var.m22131l0(objM22097O2);
            }
            boolean zBooleanValue3 = ((Boolean) ((dh9) objM22097O2).getValue()).booleanValue();
            tj3Var.m22111b0(-1069234984);
            long j5 = zBooleanValue3 ? j : j2;
            tj3Var.m22139q(false);
            aa1 aa1Var2 = new aa1(j5);
            boolean zM22120g4 = tj3Var.m22120g(faaVarM15046h);
            Object objM22097O3 = tj3Var.m22097O();
            if (zM22120g4 || objM22097O3 == p84Var) {
                objM22097O3 = AbstractC0278f.m1254d(new sw5(faaVarM15046h, 5));
                tj3Var.m22131l0(objM22097O3);
            }
            z9a z9aVar = (z9a) ((dh9) objM22097O3).getValue();
            tj3Var.m22111b0(1058649156);
            if (z9aVar.m25516b(Boolean.FALSE, Boolean.TRUE)) {
                tj3Var.m22111b0(272207019);
                l43VarM21705c0 = ss5.m21705c0(MotionSchemeKeyTokens.DefaultEffects, tj3Var);
                z3 = false;
                tj3Var.m22139q(false);
            } else {
                z3 = false;
                tj3Var.m22111b0(272326989);
                l43VarM21705c0 = ss5.m21705c0(MotionSchemeKeyTokens.FastEffects, tj3Var);
                tj3Var.m22139q(false);
            }
            l43 l43Var = l43VarM21705c0;
            tj3Var.m22139q(z3);
            pvc.m19507c(AbstractC3393o1.m17727b(((aa1) kaa.m15041c(faaVarM15046h, aa1Var, aa1Var2, l43Var, jdaVar, tj3Var, 0).getValue()).f414a, sk1.f60948a), c0282a, tj3Var, (i3 & 112) | 8);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: fq9
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    iq9.m14079d(j, j2, z2, c0282a, (ye1) obj, pk9.m19383z(i | 1));
                    return xfa.f68157a;
                }
            };
        }
    }
}
