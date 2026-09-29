package p000;

import androidx.compose.material3.AbstractC0218a;
import androidx.compose.material3.AbstractC0231g;
import com.lingq.feature.reader.rating.p016ui.AbstractC2474a;
import com.lingq.feature.reader.vocabulary.model.VocabularyType;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n14 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52169a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f52170b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f52171c;

    public /* synthetic */ n14(int i, vi3 vi3Var, int i2) {
        this.f52169a = i2;
        this.f52170b = i;
        this.f52171c = vi3Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f52169a;
        int i2 = 7;
        p84 p84Var = we1.f66679a;
        xfa xfaVar = xfa.f68157a;
        int i3 = this.f52170b;
        vi3 vi3Var = this.f52171c;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zM22120g = tj3Var.m22120g(vi3Var) | tj3Var.m22116e(i3);
                    Object objM22097O = tj3Var.m22097O();
                    if (zM22120g || objM22097O == p84Var) {
                        objM22097O = new C3390nz(vi3Var, i3, 6);
                        tj3Var.m22131l0(objM22097O);
                    }
                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var, (ui3) objM22097O, pqb.f56699a, null, null, null, false);
                } else {
                    tj3Var.m22102U();
                }
                return xfaVar;
            case 1:
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean z = i3 == 0;
                    boolean zM22120g2 = tj3Var2.m22120g(vi3Var);
                    Object objM22097O2 = tj3Var2.m22097O();
                    if (zM22120g2 || objM22097O2 == p84Var) {
                        objM22097O2 = new fl4(vi3Var, 7);
                        tj3Var2.m22131l0(objM22097O2);
                    }
                    iq9.m14076a(z, (ui3) objM22097O2, null, false, 0L, 0L, nsb.f53221g, tj3Var2, 12582912, 124);
                    boolean z2 = i3 == 1;
                    boolean zM22120g3 = tj3Var2.m22120g(vi3Var);
                    Object objM22097O3 = tj3Var2.m22097O();
                    if (zM22120g3 || objM22097O3 == p84Var) {
                        objM22097O3 = new fl4(vi3Var, 8);
                        tj3Var2.m22131l0(objM22097O3);
                    }
                    iq9.m14076a(z2, (ui3) objM22097O3, null, false, 0L, 0L, nsb.f53222h, tj3Var2, 12582912, 124);
                } else {
                    tj3Var2.m22102U();
                }
                return xfaVar;
            case 2:
                ye1 ye1Var3 = (ye1) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    AbstractC0218a.m1121a(ci8.m4703P(1589462064, new ex0(i3, i2), tj3Var3), null, ci8.m4703P(-186613010, new ks3(vi3Var, 3), tj3Var3), null, 0.0f, null, h7a.m13119f(tj3Var3), null, null, tj3Var3, 390, 442);
                } else {
                    tj3Var3.m22102U();
                }
                return xfaVar;
            case 3:
                ye1 ye1Var4 = (ye1) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    int i4 = 0;
                    for (Object obj3 : VocabularyType.getEntries()) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            vz1.m23628e0();
                            throw null;
                        }
                        VocabularyType vocabularyType = (VocabularyType) obj3;
                        boolean z3 = i3 == i4;
                        boolean zM22120g4 = tj3Var4.m22120g(vi3Var) | tj3Var4.m22116e(i4);
                        Object objM22097O4 = tj3Var4.m22097O();
                        if (zM22120g4 || objM22097O4 == p84Var) {
                            objM22097O4 = new C3390nz(vi3Var, i4, 8);
                            tj3Var4.m22131l0(objM22097O4);
                        }
                        iq9.m14077b(z3, (ui3) objM22097O4, null, false, ci8.m4703P(-1110932255, new wz2(vocabularyType, 16), tj3Var4), 0L, 0L, tj3Var4, 24576);
                        i4 = i5;
                    }
                } else {
                    tj3Var4.m22102U();
                }
                return xfaVar;
            default:
                ((Integer) obj2).intValue();
                AbstractC2474a.m9384c(vi3Var, (ye1) obj, pk9.m19383z(i3 | 1));
                return xfaVar;
        }
    }

    public /* synthetic */ n14(vi3 vi3Var, int i, int i2) {
        this.f52169a = i2;
        this.f52171c = vi3Var;
        this.f52170b = i;
    }
}
