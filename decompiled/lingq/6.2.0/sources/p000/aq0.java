package p000;

import com.lingq.core.p012ui.R$string;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class aq0 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7354a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fr0 f7355b;

    public /* synthetic */ aq0(fr0 fr0Var, int i) {
        this.f7354a = i;
        this.f7355b = fr0Var;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f7354a;
        String strM23620a0 = "";
        xfa xfaVar = xfa.f68157a;
        fr0 fr0Var = this.f7355b;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    tj3Var.m22102U();
                } else if (!(fr0Var.f39504b instanceof qs0)) {
                    tj3Var.m22111b0(992129181);
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(992039808);
                    q5d.m19669c(null, ((qs0) fr0Var.f39504b).f58119a, tj3Var, 0);
                    tj3Var.m22139q(false);
                }
                break;
            case 1:
                ye1 ye1Var2 = (ye1) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    tj3Var2.m22102U();
                } else if (!(fr0Var.f39507e instanceof pp0)) {
                    tj3Var2.m22111b0(570293366);
                    tj3Var2.m22139q(false);
                } else {
                    tj3Var2.m22111b0(570201110);
                    q5d.m19667a(0, tj3Var2, null, ((pp0) fr0Var.f39507e).f56619a);
                    tj3Var2.m22139q(false);
                }
                break;
            case 2:
                ye1 ye1Var3 = (ye1) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    tj3Var3.m22102U();
                } else {
                    int i2 = kq0.f48312a[fr0Var.f39503a.ordinal()];
                    if (i2 == 1) {
                        tj3Var3.m22111b0(1079978906);
                        strM23620a0 = vz1.m23620a0(tj3Var3, R$string.lingq_lingqs);
                        tj3Var3.m22139q(false);
                    } else if (i2 == 3) {
                        tj3Var3.m22111b0(1079981984);
                        strM23620a0 = vz1.m23620a0(tj3Var3, com.lingq.feature.challenges.R$string.challenge_target_met);
                        tj3Var3.m22139q(false);
                    } else if (i2 == 4) {
                        tj3Var3.m22111b0(1079985220);
                        strM23620a0 = vz1.m23620a0(tj3Var3, com.lingq.core.achievements.R$string.lesson_coins);
                        tj3Var3.m22139q(false);
                    } else if (i2 != 5) {
                        tj3Var3.m22111b0(-880116661);
                        tj3Var3.m22139q(false);
                    } else {
                        tj3Var3.m22111b0(1079975647);
                        strM23620a0 = vz1.m23620a0(tj3Var3, com.lingq.feature.challenges.R$string.challenges_complete);
                        tj3Var3.m22139q(false);
                    }
                    b6d.m3389i(0, tj3Var3, null, strM23620a0);
                }
                break;
            case 3:
                ye1 ye1Var4 = (ye1) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (!tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    tj3Var4.m22102U();
                } else {
                    int i3 = kq0.f48313b[fr0Var.f39514l.ordinal()];
                    if (i3 == 1) {
                        tj3Var4.m22111b0(-921415324);
                        strM23620a0 = vz1.m23620a0(tj3Var4, com.lingq.feature.challenges.R$string.challenge_rank_following_empty);
                        tj3Var4.m22139q(false);
                    } else if (i3 != 2) {
                        tj3Var4.m22111b0(1501095761);
                        tj3Var4.m22139q(false);
                    } else {
                        tj3Var4.m22111b0(-921411710);
                        strM23620a0 = vz1.m23620a0(tj3Var4, com.lingq.feature.challenges.R$string.challenge_rank_country_empty);
                        tj3Var4.m22139q(false);
                    }
                    lw9.m16554b(strM23620a0, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var4, 0, 0, 262142);
                }
                break;
            default:
                ye1 ye1Var5 = (ye1) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var5 = (tj3) ye1Var5;
                if (!tj3Var5.m22099R(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    tj3Var5.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var5, ((qs0) fr0Var.f39504b).f58119a.f18862j ? com.lingq.feature.challenges.R$string.challenges_leave_challenge : com.lingq.feature.challenges.R$string.challenges_join), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var5, 0, 0, 262142);
                }
                break;
        }
        return xfaVar;
    }
}
