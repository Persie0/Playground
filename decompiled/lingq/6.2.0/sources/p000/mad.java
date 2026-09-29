package p000;

import androidx.compose.material3.AbstractC0226d0;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.AbstractC0278f;
import com.lingq.feature.reader.video.C2583a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlinx.datetime.internal.format.C3257b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mad {
    /* JADX INFO: renamed from: a */
    public static final void m16719a(hqa hqaVar, vi3 vi3Var, e16 e16Var, ye1 ye1Var, int i) {
        int i2;
        vi3 vi3Var2;
        e16 e16Var2;
        t66 t66Var;
        hqa hqaVar2;
        t66 t66Var2;
        hqaVar.getClass();
        long j = hqaVar.f42794b;
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-701716029);
        if ((i & 6) == 0) {
            i2 = i | (tj3Var.m22120g(hqaVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(vi3Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (tj3Var.m22099R(i3 & 1, (i3 & 147) != 146)) {
            fe9 fe9VarM12515a = ge9.m12515a(tj3Var);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O);
            }
            t66 t66Var3 = (t66) objM22097O;
            Object objM22097O2 = tj3Var.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O2);
            }
            t66 t66Var4 = (t66) objM22097O2;
            Object objM22097O3 = tj3Var.m22097O();
            if (objM22097O3 == p84Var) {
                objM22097O3 = AbstractC0278f.m1260j(0L);
                tj3Var.m22131l0(objM22097O3);
            }
            t66 t66Var5 = (t66) objM22097O3;
            long jLongValue = ((Boolean) t66Var4.getValue()).booleanValue() ? ((Number) t66Var5.getValue()).longValue() : hqaVar.f42793a;
            b16 b16Var = b16.f7762a;
            e16 e16VarM21608U = AbstractC3584sr.m21608U(c99.m4412e(b16Var, 1.0f), fe9VarM12515a.f38957f, fe9VarM12515a.f38952a);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var, 0);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21608U);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var, bb1VarM230a);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var3, numValueOf);
            vi3 vi3Var3 = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var3);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            float f = jLongValue / 1000.0f;
            long j2 = jLongValue;
            float f2 = j / 1000.0f;
            if (f > f2) {
                f = f2;
            }
            if (f2 < 1.0f) {
                f2 = 1.0f;
            }
            h41 h41Var = new h41(0.0f, f2);
            Object objM22097O4 = tj3Var.m22097O();
            int i4 = 6;
            if (objM22097O4 == p84Var) {
                objM22097O4 = new n20(t66Var4, t66Var5, i4);
                tj3Var.m22131l0(objM22097O4);
            }
            vi3 vi3Var4 = (vi3) objM22097O4;
            int i5 = i3 & 112;
            boolean z = i5 == 32;
            Object objM22097O5 = tj3Var.m22097O();
            if (z || objM22097O5 == p84Var) {
                objM22097O5 = new wy0(vi3Var, t66Var5, t66Var4, 4);
                tj3Var.m22131l0(objM22097O5);
            }
            AbstractC0226d0.m1132c(f, vi3Var4, e16VarM4412e, false, h41Var, 0, (ui3) objM22097O5, null, null, tj3Var, 432, 424);
            e16 e16VarM4412e2 = c99.m4412e(b16Var, 1.0f);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37242h, nj0.f52817l, tj3Var, 6);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM4412e2);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var3);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            lw9.m16554b(m16722d(j2), null, p58.m18900f(tj3Var).f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71408l, tj3Var, 0, 0, 131066);
            long j3 = j - j2;
            lw9.m16554b("-".concat(m16722d(j3 >= 0 ? j3 : 0L)), null, p58.m18900f(tj3Var).f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71408l, tj3Var, 0, 0, 131066);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
            e16 e16VarM4412e3 = c99.m4412e(b16Var, 1.0f);
            sj8 sj8VarM20003a2 = qj8.m20003a(eh0.f37241g, nj0.f52789H, tj3Var, 54);
            int iHashCode3 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m3 = tj3Var.m22132m();
            e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, e16VarM4412e3);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a2);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m3);
            AbstractC3393o1.m17747v(iHashCode3, tj3Var, zi3Var3, tj3Var, vi3Var3);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c3);
            e16 e16VarM4426s = c99.m4426s(b16Var, 48.0f);
            Object objM22097O6 = tj3Var.m22097O();
            if (objM22097O6 == p84Var) {
                t66Var = t66Var3;
                objM22097O6 = new un7(29, t66Var);
                tj3Var.m22131l0(objM22097O6);
            } else {
                t66Var = t66Var3;
            }
            omd.m18141c((ui3) objM22097O6, e16VarM4426s, false, null, null, ci8.m4703P(-559960460, new rh7(hqaVar, 2), tj3Var), tj3Var, 1572918, 60);
            int i6 = i3 & 14;
            boolean z2 = (i5 == 32) | (i6 == 4);
            Object objM22097O7 = tj3Var.m22097O();
            if (z2 || objM22097O7 == p84Var) {
                objM22097O7 = new sh7(hqaVar, vi3Var, 3);
                tj3Var.m22131l0(objM22097O7);
            }
            vi3Var2 = vi3Var;
            t66 t66Var6 = t66Var;
            omd.m18141c((ui3) objM22097O7, null, false, null, null, esc.f37783a, tj3Var, 1572864, 62);
            e16 e16VarM10007D = d32.m10007D(c99.m4422o(b16Var, 48.0f), p58.m18900f(tj3Var).f55842a, p58.m18901i(tj3Var).f64857c);
            boolean z3 = (i6 == 4) | (i5 == 32);
            Object objM22097O8 = tj3Var.m22097O();
            if (z3 || objM22097O8 == p84Var) {
                hqaVar2 = hqaVar;
                objM22097O8 = new sh7(vi3Var2, hqaVar2, 4);
                tj3Var.m22131l0(objM22097O8);
            } else {
                hqaVar2 = hqaVar;
            }
            omd.m18141c((ui3) objM22097O8, e16VarM10007D, false, null, null, ci8.m4703P(-1257238660, new rh7(hqaVar2, 3), tj3Var), tj3Var, 1572864, 60);
            boolean z4 = (i5 == 32) | (i6 == 4);
            Object objM22097O9 = tj3Var.m22097O();
            if (z4 || objM22097O9 == p84Var) {
                objM22097O9 = new sh7(hqaVar2, vi3Var2, 5);
                tj3Var.m22131l0(objM22097O9);
            }
            omd.m18141c((ui3) objM22097O9, null, false, null, null, esc.f37784b, tj3Var, 1572864, 62);
            boolean z5 = i5 == 32;
            Object objM22097O10 = tj3Var.m22097O();
            if (z5 || objM22097O10 == p84Var) {
                objM22097O10 = new x4a(vi3Var2, 24);
                tj3Var.m22131l0(objM22097O10);
            }
            omd.m18141c((ui3) objM22097O10, null, false, null, null, esc.f37785c, tj3Var, 1572864, 62);
            tj3Var.m22139q(true);
            tj3Var.m22139q(true);
            if (((Boolean) t66Var6.getValue()).booleanValue()) {
                tj3Var.m22111b0(-1211429778);
                float f3 = hqaVar2.f42797e.f486a;
                C2583a.Companion.getClass();
                ArrayList arrayList = C2583a.f31341c0;
                boolean z6 = i5 == 32;
                Object objM22097O11 = tj3Var.m22097O();
                int i7 = 28;
                if (z6 || objM22097O11 == p84Var) {
                    t66Var2 = t66Var6;
                    objM22097O11 = new ix0(vi3Var2, t66Var2, i7);
                    tj3Var.m22131l0(objM22097O11);
                } else {
                    t66Var2 = t66Var6;
                }
                vi3 vi3Var5 = (vi3) objM22097O11;
                Object objM22097O12 = tj3Var.m22097O();
                if (objM22097O12 == p84Var) {
                    objM22097O12 = new un7(28, t66Var2);
                    tj3Var.m22131l0(objM22097O12);
                }
                d4d.m10095a(f3, arrayList, vi3Var5, (ui3) objM22097O12, tj3Var, 3072);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-1211075169);
                tj3Var.m22139q(false);
            }
            e16Var2 = b16Var;
        } else {
            vi3Var2 = vi3Var;
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new uh7(hqaVar, vi3Var2, e16Var2, i, 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m16720b(j12 j12Var, vi3[] vi3VarArr, vi3 vi3Var) {
        j12Var.getClass();
        if (!(j12Var instanceof InterfaceC2984f0)) {
            C3386nv.m17633t("impossible");
            return;
        }
        InterfaceC2984f0 interfaceC2984f0 = (InterfaceC2984f0) j12Var;
        vi3[] vi3VarArr2 = (vi3[]) Arrays.copyOf(vi3VarArr, vi3VarArr.length);
        lda.m16119e(1, vi3Var);
        ArrayList arrayList = new ArrayList(vi3VarArr2.length);
        for (vi3 vi3Var2 : vi3VarArr2) {
            InterfaceC2984f0 interfaceC2984f0Mo3732h = interfaceC2984f0.mo3732h();
            vi3Var2.invoke(interfaceC2984f0Mo3732h);
            arrayList.add(new bg1((ArrayList) interfaceC2984f0Mo3732h.mo3730b().f65802b));
        }
        InterfaceC2984f0 interfaceC2984f0Mo3732h2 = interfaceC2984f0.mo3732h();
        vi3Var.invoke(interfaceC2984f0Mo3732h2);
        interfaceC2984f0.mo3730b().m23473o(new C0017af(new bg1((ArrayList) interfaceC2984f0Mo3732h2.mo3730b().f65802b), arrayList));
    }

    /* JADX INFO: renamed from: c */
    public static final void m16721c(j12 j12Var, char c) {
        j12Var.getClass();
        String strValueOf = String.valueOf(c);
        strValueOf.getClass();
        ((InterfaceC2984f0) j12Var).mo3730b().m23473o(new yi1(strValueOf));
    }

    /* JADX INFO: renamed from: d */
    public static final String m16722d(long j) {
        long j2 = j / 1000;
        return String.format(Locale.getDefault(), "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2 / 60), Long.valueOf(j2 % 60)}, 2));
    }

    /* JADX INFO: renamed from: e */
    public static final void m16723e(j12 j12Var, String str, vi3 vi3Var) {
        j12Var.getClass();
        if (!(j12Var instanceof InterfaceC2984f0)) {
            C3386nv.m17633t("impossible");
            return;
        }
        InterfaceC2984f0 interfaceC2984f0 = (InterfaceC2984f0) j12Var;
        lda.m16119e(1, vi3Var);
        vqb vqbVarMo3730b = interfaceC2984f0.mo3730b();
        InterfaceC2984f0 interfaceC2984f0Mo3732h = interfaceC2984f0.mo3732h();
        vi3Var.invoke(interfaceC2984f0Mo3732h);
        vqbVarMo3730b.m23473o(new C3257b(str, new bg1((ArrayList) interfaceC2984f0Mo3732h.mo3730b().f65802b)));
    }
}
