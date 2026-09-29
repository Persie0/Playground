package p000;

import android.os.Bundle;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.google.common.collect.ImmutableList;
import com.lingq.core.achievements.R$drawable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a5d {
    /* JADX WARN: Code duplicated, block: B:55:0x009b  */
    /* JADX WARN: Code duplicated, block: B:56:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00de  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:75:0x010f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0114  */
    /* JADX WARN: Code duplicated, block: B:83:0x0129  */
    /* JADX WARN: Code duplicated, block: B:86:0x015c  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:91:0x022b  */
    /* JADX WARN: Code duplicated, block: B:93:0x023b  */
    /* JADX WARN: Code duplicated, block: B:96:0x0246  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:90:0x01b7, please report this as an issue */
    /* JADX INFO: renamed from: a */
    public static final void m126a(e16 e16Var, final int i, final int i2, final boolean z, final boolean z2, float f, ye1 ye1Var, final int i3, final int i4) {
        e16 e16Var2;
        int i5;
        float f2;
        int i6;
        boolean z3;
        final e16 e16Var3;
        final float f3;
        x18 x18VarM22143u;
        b16 b16Var;
        float f4;
        int iMax;
        int i7;
        gc0 gc0Var;
        ui3 ui3Var;
        float f5;
        e16 e16VarM4411d;
        long jM10037f;
        int i8;
        ci0 ci0Var;
        float f6;
        ci0 ci0Var2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1177891464);
        int i9 = i4 & 1;
        if (i9 != 0) {
            i5 = i3 | 6;
            e16Var2 = e16Var;
        } else if ((i3 & 6) == 0) {
            e16Var2 = e16Var;
            i5 = (tj3Var.m22120g(e16Var2) ? 4 : 2) | i3;
        } else {
            e16Var2 = e16Var;
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= tj3Var.m22116e(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= tj3Var.m22116e(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= tj3Var.m22122h(z) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= tj3Var.m22122h(z2) ? 16384 : 8192;
        }
        int i10 = i4 & 32;
        if (i10 == 0) {
            if ((196608 & i3) == 0) {
                f2 = f;
                i5 |= tj3Var.m22114d(f2) ? 131072 : 65536;
            }
            i6 = i5;
            if ((i6 & 74899) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (tj3Var.m22099R(i6 & 1, z3)) {
                b16Var = b16.f7762a;
                if (i9 != 0) {
                    e16Var2 = b16Var;
                }
                if (i10 != 0) {
                    f4 = 4.0f;
                } else {
                    f4 = f2;
                }
                iMax = Math.max(0, i);
                if (i2 != 0) {
                    i7 = iMax / i2;
                } else {
                    i7 = 0;
                }
                gc0Var = nj0.f52812g;
                ht5 ht5VarM19966d = qh0.m19966d(gc0Var, false);
                int iHashCode = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m = tj3Var.m22132m();
                e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16Var2);
                se1.f60731q.getClass();
                ui3Var = C0352b.f4299b;
                tj3Var.m22119f0();
                f5 = f4;
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d);
                oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
                oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
                oha.m18000f(tj3Var, C0352b.f4305h);
                oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
                y27 y27VarM18236U = AbstractC3423or.m18236U(R$drawable.ic_fire_no_star, tj3Var, 0);
                if (z2) {
                    e16VarM4411d = c99.m4411d(b16Var, 0.5f);
                } else {
                    e16VarM4411d = c99.m4411d(b16Var, 1.0f);
                }
                if (i7 != 0 || z) {
                    jM10037f = d32.m10037f(4290558385L);
                } else {
                    jM10037f = d32.m10037f(4294926397L);
                }
                i8 = i7;
                bq1.m4042R(y27VarM18236U, null, e16VarM4411d, null, null, 0.0f, new qd0(5, jM10037f), tj3Var, 56, 56);
                ci0Var = ci0.f10109a;
                if (z2) {
                    tj3Var.m22111b0(-2129737318);
                    ci0Var2 = ci0Var;
                    AbstractC3122is.m14090d(ci0Var.mo3727a(c99.m4411d(b16Var, 1.0f), gc0Var), Math.max(0, i), i2, f5, false, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55823H, d32.m10037f(4294926397L), aa1.f411j, tj3Var, ((i6 >> 6) & 7168) | 113442816);
                    f6 = f5;
                    tj3Var = tj3Var;
                    tj3Var.m22139q(false);
                } else {
                    f6 = f5;
                    ci0Var2 = ci0Var;
                    tj3Var.m22111b0(-2129210380);
                    tj3Var.m22139q(false);
                }
                if (i8 > 1) {
                    tj3Var.m22111b0(-2129154890);
                    tj3 tj3Var2 = tj3Var;
                    g4d.m12360a(i8 + "x", AbstractC3584sr.m21611X(AbstractC3584sr.m21609V(c99.m4410c(c99.m4412e(ci0Var2.mo3727a(b16Var, nj0.f52815j), 0.55f), 0.5f), 4.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 4.0f, 7), aa1.f406e, new ks9(3), 0L, 0, false, 1, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71408l, null, tj3Var2, 12583296, 624);
                    tj3Var = tj3Var2;
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(-2128654860);
                    tj3Var.m22139q(false);
                }
                tj3Var.m22139q(true);
                e16Var3 = e16Var2;
                f3 = f6;
            } else {
                tj3Var.m22102U();
                e16Var3 = e16Var2;
                f3 = f2;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: nj9
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        a5d.m126a(e16Var3, i, i2, z, z2, f3, (ye1) obj, pk9.m19383z(i3 | 1), i4);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i5 |= 196608;
        f2 = f;
        i6 = i5;
        if ((i6 & 74899) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (tj3Var.m22099R(i6 & 1, z3)) {
            b16Var = b16.f7762a;
            if (i9 != 0) {
                e16Var2 = b16Var;
            }
            if (i10 != 0) {
                f4 = 4.0f;
            } else {
                f4 = f2;
            }
            iMax = Math.max(0, i);
            if (i2 != 0) {
                i7 = iMax / i2;
            } else {
                i7 = 0;
            }
            gc0Var = nj0.f52812g;
            ht5 ht5VarM19966d2 = qh0.m19966d(gc0Var, false);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16Var2);
            se1.f60731q.getClass();
            ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            f5 = f4;
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d2);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m2);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode2));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c2);
            y27 y27VarM18236U2 = AbstractC3423or.m18236U(R$drawable.ic_fire_no_star, tj3Var, 0);
            if (z2) {
                e16VarM4411d = c99.m4411d(b16Var, 0.5f);
            } else {
                e16VarM4411d = c99.m4411d(b16Var, 1.0f);
            }
            if (i7 != 0) {
                jM10037f = d32.m10037f(4290558385L);
            } else {
                jM10037f = d32.m10037f(4290558385L);
            }
            i8 = i7;
            bq1.m4042R(y27VarM18236U2, null, e16VarM4411d, null, null, 0.0f, new qd0(5, jM10037f), tj3Var, 56, 56);
            ci0Var = ci0.f10109a;
            if (z2) {
                tj3Var.m22111b0(-2129737318);
                ci0Var2 = ci0Var;
                AbstractC3122is.m14090d(ci0Var.mo3727a(c99.m4411d(b16Var, 1.0f), gc0Var), Math.max(0, i), i2, f5, false, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55823H, d32.m10037f(4294926397L), aa1.f411j, tj3Var, ((i6 >> 6) & 7168) | 113442816);
                f6 = f5;
                tj3Var = tj3Var;
                tj3Var.m22139q(false);
            } else {
                f6 = f5;
                ci0Var2 = ci0Var;
                tj3Var.m22111b0(-2129210380);
                tj3Var.m22139q(false);
            }
            if (i8 > 1) {
                tj3Var.m22111b0(-2129154890);
                tj3 tj3Var3 = tj3Var;
                g4d.m12360a(i8 + "x", AbstractC3584sr.m21611X(AbstractC3584sr.m21609V(c99.m4410c(c99.m4412e(ci0Var2.mo3727a(b16Var, nj0.f52815j), 0.55f), 0.5f), 4.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 4.0f, 7), aa1.f406e, new ks9(3), 0L, 0, false, 1, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71408l, null, tj3Var3, 12583296, 624);
                tj3Var = tj3Var3;
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-2128654860);
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(true);
            e16Var3 = e16Var2;
            f3 = f6;
        } else {
            tj3Var.m22102U();
            e16Var3 = e16Var2;
            f3 = f2;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: nj9
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    a5d.m126a(e16Var3, i, i2, z, z2, f3, (ye1) obj, pk9.m19383z(i3 | 1), i4);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static ImmutableList m127b(tj0 tj0Var, ArrayList arrayList) {
        c14 c14VarM6284m = ImmutableList.m6284m();
        for (int i = 0; i < arrayList.size(); i++) {
            Bundle bundle = (Bundle) arrayList.get(i);
            bundle.getClass();
            c14VarM6284m.m3157b(tj0Var.apply(bundle));
        }
        return c14VarM6284m.m4280g();
    }
}
