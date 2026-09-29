package p000;

import androidx.lifecycle.compose.AbstractC0711a;
import com.lingq.feature.challenges.C1961a;
import com.lingq.feature.challenges.ChallengeDetailsFragment;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sq0 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61220a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ChallengeDetailsFragment f61221b;

    public /* synthetic */ sq0(ChallengeDetailsFragment challengeDetailsFragment, int i) {
        this.f61220a = i;
        this.f61221b = challengeDetailsFragment;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f61220a;
        xfa xfaVar = xfa.f68157a;
        ChallengeDetailsFragment challengeDetailsFragment = this.f61221b;
        int i2 = 1;
        int i3 = 0;
        ye1 ye1Var = (ye1) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                bh4[] bh4VarArr = ChallengeDetailsFragment.f24346G0;
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    fy9.m12246a(false, null, ci8.m4703P(-1030318498, new sq0(challengeDetailsFragment, i2), tj3Var), tj3Var, 384);
                }
                break;
            default:
                bh4[] bh4VarArr2 = ChallengeDetailsFragment.f24346G0;
                tj3 tj3Var2 = (tj3) ye1Var;
                if (!tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    t66 t66VarM2513c = AbstractC0711a.m2513c(challengeDetailsFragment.m8806R0().f24510u, tj3Var2);
                    fr0 fr0Var = (fr0) t66VarM2513c.getValue();
                    boolean zM22124i = tj3Var2.m22124i(challengeDetailsFragment);
                    Object objM22097O = tj3Var2.m22097O();
                    p84 p84Var = we1.f66679a;
                    if (zM22124i || objM22097O == p84Var) {
                        objM22097O = new C1961a(i3, challengeDetailsFragment);
                        tj3Var2.m22131l0(objM22097O);
                    }
                    vi3 vi3Var = (vi3) objM22097O;
                    boolean zM22120g = tj3Var2.m22120g(t66VarM2513c) | tj3Var2.m22124i(challengeDetailsFragment);
                    Object objM22097O2 = tj3Var2.m22097O();
                    if (zM22120g || objM22097O2 == p84Var) {
                        objM22097O2 = new s70(10, challengeDetailsFragment, t66VarM2513c);
                        tj3Var2.m22131l0(objM22097O2);
                    }
                    q5d.m19670d(fr0Var, vi3Var, (vi3) objM22097O2, tj3Var2, 0);
                }
                break;
        }
        return xfaVar;
    }
}
