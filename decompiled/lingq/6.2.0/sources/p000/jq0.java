package p000;

import com.lingq.core.analytics.embedded.EmbeddedMessage;
import com.lingq.core.domain.model.challenge.ChallengeRanking;
import com.lingq.feature.imports.data.UserImportSourceType;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jq0 implements bj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45992a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f45993b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f45994c;

    public /* synthetic */ jq0(List list, Object obj, int i) {
        this.f45992a = i;
        this.f45993b = list;
        this.f45994c = obj;
    }

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.f45992a;
        p84 p84Var = we1.f66679a;
        xfa xfaVar = xfa.f68157a;
        List list = this.f45993b;
        Object obj5 = this.f45994c;
        switch (i5) {
            case 0:
                ft4 ft4Var = (ft4) obj;
                int iIntValue = ((Number) obj2).intValue();
                ye1 ye1Var = (ye1) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (((tj3) ye1Var).m22120g(ft4Var) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= ((tj3) ye1Var).m22116e(iIntValue) ? 32 : 16;
                }
                tj3 tj3Var = (tj3) ye1Var;
                if (tj3Var.m22099R(i & 1, (i & 147) != 146)) {
                    ChallengeRanking challengeRanking = (ChallengeRanking) list.get(iIntValue);
                    tj3Var.m22111b0(367317942);
                    q5d.m19668b(null, challengeRanking, ((fr0) obj5).f39503a, tj3Var, 0);
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22102U();
                }
                return xfaVar;
            case 1:
                ft4 ft4Var2 = (ft4) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                ye1 ye1Var2 = (ye1) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                b85 b85Var = (b85) obj5;
                if ((iIntValue4 & 6) == 0) {
                    i2 = (((tj3) ye1Var2).m22120g(ft4Var2) ? 4 : 2) | iIntValue4;
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= ((tj3) ye1Var2).m22116e(iIntValue3) ? 32 : 16;
                }
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (tj3Var2.m22099R(i2 & 1, (i2 & 147) != 146)) {
                    EmbeddedMessage embeddedMessage = (EmbeddedMessage) list.get(iIntValue3);
                    tj3Var2.m22111b0(-449245043);
                    e16 e16VarM15198E = AbstractC3184kh.m15198E(new la5(b85Var, embeddedMessage, 0));
                    int i6 = db5.f35358c[gcd.m12483c(embeddedMessage.f14318b).ordinal()];
                    if (i6 == 1) {
                        tj3Var2.m22111b0(-449095779);
                        e16 e16VarM4421n = c99.m4421n(e16VarM15198E, 350.0f);
                        boolean zM22124i = tj3Var2.m22124i(b85Var) | tj3Var2.m22124i(embeddedMessage);
                        Object objM22097O = tj3Var2.m22097O();
                        if (zM22124i || objM22097O == p84Var) {
                            objM22097O = new xa5(b85Var, embeddedMessage, 0);
                            tj3Var2.m22131l0(objM22097O);
                        }
                        ecd.m11039a(embeddedMessage, (vi3) objM22097O, e16VarM4421n, tj3Var2, 0);
                        tj3Var2.m22139q(false);
                    } else if (i6 == 2) {
                        tj3Var2.m22111b0(-448478693);
                        e16 e16VarM4421n2 = c99.m4421n(e16VarM15198E, 350.0f);
                        boolean zM22124i2 = tj3Var2.m22124i(b85Var) | tj3Var2.m22124i(embeddedMessage);
                        Object objM22097O2 = tj3Var2.m22097O();
                        if (zM22124i2 || objM22097O2 == p84Var) {
                            objM22097O2 = new xa5(b85Var, embeddedMessage, 1);
                            tj3Var2.m22131l0(objM22097O2);
                        }
                        dcd.m10287a(embeddedMessage, (vi3) objM22097O2, e16VarM4421n2, tj3Var2, 0);
                        tj3Var2.m22139q(false);
                    } else if (i6 == 3) {
                        tj3Var2.m22111b0(-447862816);
                        e16 e16VarM4421n3 = c99.m4421n(e16VarM15198E, 350.0f);
                        boolean zM22124i3 = tj3Var2.m22124i(b85Var) | tj3Var2.m22124i(embeddedMessage);
                        Object objM22097O3 = tj3Var2.m22097O();
                        if (zM22124i3 || objM22097O3 == p84Var) {
                            objM22097O3 = new xa5(b85Var, embeddedMessage, 2);
                            tj3Var2.m22131l0(objM22097O3);
                        }
                        hcd.m13199a(embeddedMessage, (vi3) objM22097O3, e16VarM4421n3, tj3Var2, 0);
                        tj3Var2.m22139q(false);
                    } else {
                        if (i6 != 4) {
                            throw ux5.m23001x(tj3Var2, 1786626580, false);
                        }
                        tj3Var2.m22111b0(-447243560);
                        e16 e16VarM4421n4 = c99.m4421n(e16VarM15198E, 350.0f);
                        boolean zM22124i4 = tj3Var2.m22124i(b85Var) | tj3Var2.m22124i(embeddedMessage);
                        Object objM22097O4 = tj3Var2.m22097O();
                        if (zM22124i4 || objM22097O4 == p84Var) {
                            objM22097O4 = new xa5(b85Var, embeddedMessage, 3);
                            tj3Var2.m22131l0(objM22097O4);
                        }
                        bcd.m3619a(embeddedMessage, (vi3) objM22097O4, e16VarM4421n4, tj3Var2, 0);
                        tj3Var2.m22139q(false);
                    }
                    tj3Var2.m22139q(false);
                } else {
                    tj3Var2.m22102U();
                }
                return xfaVar;
            case 2:
                ft4 ft4Var3 = (ft4) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                ye1 ye1Var3 = (ye1) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i3 = iIntValue6 | (((tj3) ye1Var3).m22120g(ft4Var3) ? 4 : 2);
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= ((tj3) ye1Var3).m22116e(iIntValue5) ? 32 : 16;
                }
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (tj3Var3.m22099R(i3 & 1, (i3 & 147) != 146)) {
                    we8 we8Var = (we8) ((ArrayList) list).get(iIntValue5);
                    tj3Var3.m22111b0(2141992043);
                    ywc.m25369b(we8Var, (vi3) obj5, tj3Var3, 0);
                    tj3Var3.m22139q(false);
                } else {
                    tj3Var3.m22102U();
                }
                return xfaVar;
            default:
                ms4 ms4Var = (ms4) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                ye1 ye1Var4 = (ye1) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                vi3 vi3Var = (vi3) obj5;
                if ((iIntValue8 & 6) == 0) {
                    i4 = iIntValue8 | (((tj3) ye1Var4).m22120g(ms4Var) ? 4 : 2);
                } else {
                    i4 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i4 |= ((tj3) ye1Var4).m22116e(iIntValue7) ? 32 : 16;
                }
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (tj3Var4.m22099R(i4 & 1, (i4 & 147) != 146)) {
                    UserImportSourceType userImportSourceType = (UserImportSourceType) ((ys2) list).get(iIntValue7);
                    tj3Var4.m22111b0(-1172642108);
                    boolean zM22120g = tj3Var4.m22120g(vi3Var) | tj3Var4.m22116e(userImportSourceType.ordinal());
                    Object objM22097O5 = tj3Var4.m22097O();
                    if (zM22120g || objM22097O5 == p84Var) {
                        objM22097O5 = new we0(vi3Var, userImportSourceType, 23);
                        tj3Var4.m22131l0(objM22097O5);
                    }
                    x9d.m24423f(null, userImportSourceType, (ui3) objM22097O5, tj3Var4, 0);
                    tj3Var4.m22139q(false);
                } else {
                    tj3Var4.m22102U();
                }
                return xfaVar;
        }
    }
}
