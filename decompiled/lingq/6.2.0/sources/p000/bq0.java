package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.core.domain.model.challenge.ChallengeStatus;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bq0 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8845a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fr0 f8846b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f8847c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ vi3 f8848d;

    public /* synthetic */ bq0(fr0 fr0Var, vi3 vi3Var, vi3 vi3Var2, int i) {
        this.f8845a = i;
        this.f8846b = fr0Var;
        this.f8847c = vi3Var;
        this.f8848d = vi3Var2;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00bf  */
    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f8845a;
        xfa xfaVar = xfa.f68157a;
        p84 p84Var = we1.f66679a;
        int i2 = 4;
        int i3 = 2;
        switch (i) {
            case 0:
                int i4 = 3;
                ye1 ye1Var = (ye1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    tj3Var.m22102U();
                } else {
                    fr0 fr0Var = this.f8846b;
                    ef0 ef0Var = fr0Var.f39508f;
                    if (fr0Var.m12005b() && ef0Var != null) {
                        tj3Var.m22111b0(1920697276);
                        boolean z = fr0Var.f39511i;
                        vi3 vi3Var = this.f8847c;
                        boolean zM22120g = tj3Var.m22120g(vi3Var);
                        Object objM22097O = tj3Var.m22097O();
                        if (zM22120g || objM22097O == p84Var) {
                            objM22097O = new C3353mz(vi3Var, 6);
                            tj3Var.m22131l0(objM22097O);
                        }
                        ui3 ui3Var = (ui3) objM22097O;
                        boolean zM22120g2 = tj3Var.m22120g(vi3Var);
                        Object objM22097O2 = tj3Var.m22097O();
                        if (zM22120g2 || objM22097O2 == p84Var) {
                            objM22097O2 = new te0(vi3Var, i3);
                            tj3Var.m22131l0(objM22097O2);
                        }
                        vi3 vi3Var2 = (vi3) objM22097O2;
                        vi3 vi3Var3 = this.f8848d;
                        boolean zM22120g3 = tj3Var.m22120g(vi3Var3);
                        Object objM22097O3 = tj3Var.m22097O();
                        if (zM22120g3 || objM22097O3 == p84Var) {
                            objM22097O3 = new te0(vi3Var3, i4);
                            tj3Var.m22131l0(objM22097O3);
                        }
                        vi3 vi3Var4 = (vi3) objM22097O3;
                        boolean zM22120g4 = tj3Var.m22120g(vi3Var);
                        Object objM22097O4 = tj3Var.m22097O();
                        if (zM22120g4 || objM22097O4 == p84Var) {
                            objM22097O4 = new te0(vi3Var, i2);
                            tj3Var.m22131l0(objM22097O4);
                        }
                        vi3 vi3Var5 = (vi3) objM22097O4;
                        boolean zM22120g5 = tj3Var.m22120g(vi3Var3);
                        Object objM22097O5 = tj3Var.m22097O();
                        if (zM22120g5 || objM22097O5 == p84Var) {
                            objM22097O5 = new C3353mz(vi3Var3, 7);
                            tj3Var.m22131l0(objM22097O5);
                        }
                        t4d.m21841b(ef0Var, z, ui3Var, vi3Var2, vi3Var4, vi3Var5, (ui3) objM22097O5, tj3Var, 0);
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(1921673652);
                        tj3Var.m22139q(false);
                    }
                }
                break;
            default:
                t17 t17Var = (t17) obj;
                ye1 ye1Var2 = (ye1) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                t17Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((tj3) ye1Var2).m22120g(t17Var) ? 4 : 2;
                }
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    tj3Var2.m22102U();
                } else {
                    bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var2, 0);
                    int iHashCode = Long.hashCode(tj3Var2.f62385T);
                    l77 l77VarM22132m = tj3Var2.m22132m();
                    b16 b16Var = b16.f7762a;
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, b16Var);
                    se1.f60731q.getClass();
                    ui3 ui3Var2 = C0352b.f4299b;
                    tj3Var2.m22119f0();
                    if (tj3Var2.f62384S) {
                        tj3Var2.m22130l(ui3Var2);
                    } else {
                        tj3Var2.m22137o0();
                    }
                    oha.m18001g(tj3Var2, C0352b.f4303f, bb1VarM230a);
                    oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m);
                    oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode));
                    oha.m18000f(tj3Var2, C0352b.f4305h);
                    fr0 fr0Var2 = this.f8846b;
                    vi3 vi3Var6 = this.f8847c;
                    vi3 vi3Var7 = this.f8848d;
                    q5d.m19673g(e65.m10871c(tj3Var2, e16VarM1322c, C0352b.f4301d, 1.0f, true), t17Var, fr0Var2, vi3Var6, vi3Var7, tj3Var2, (iIntValue2 << 3) & 112);
                    rs0 rs0Var = fr0Var2.f39504b;
                    if (rs0Var instanceof qs0) {
                        ChallengeStatus challengeStatusM148f = a6d.m148f(((qs0) rs0Var).f58119a);
                        challengeStatusM148f.getClass();
                        if (challengeStatusM148f == ChallengeStatus.Joined || challengeStatusM148f == ChallengeStatus.CanJoin) {
                            tj3Var2.m22111b0(-210628662);
                            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                            zf1 zf1Var = ge9.f40637a;
                            e16 e16VarM21611X = AbstractC3584sr.m21611X(e16VarM4412e, ((fe9) tj3Var2.m22128k(zf1Var)).f38960i, 0.0f, ((fe9) tj3Var2.m22128k(zf1Var)).f38960i, t17Var.mo14018a(), 2);
                            boolean zM22124i = tj3Var2.m22124i(fr0Var2) | tj3Var2.m22120g(vi3Var7) | tj3Var2.m22120g(vi3Var6);
                            Object objM22097O6 = tj3Var2.m22097O();
                            if (zM22124i || objM22097O6 == p84Var) {
                                objM22097O6 = new zg0(fr0Var2, vi3Var7, vi3Var6, i3);
                                tj3Var2.m22131l0(objM22097O6);
                            }
                            ss5.m21708e(1572864, 30, null, tj3Var2, (ui3) objM22097O6, ci8.m4703P(9587930, new aq0(fr0Var2, i2), tj3Var2), e16VarM21611X, null, null, false);
                            tj3Var2 = tj3Var2;
                            tj3Var2.m22139q(false);
                        } else {
                            tj3Var2.m22111b0(-209382245);
                            tj3Var2.m22139q(false);
                        }
                    } else {
                        tj3Var2.m22111b0(-209382245);
                        tj3Var2.m22139q(false);
                    }
                    tj3Var2.m22139q(true);
                }
                break;
        }
        return xfaVar;
    }
}
