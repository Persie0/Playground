package p000;

import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.material3.AbstractC0257p;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.core.domain.model.status.CardStatus;
import com.lingq.feature.vocabulary.filter.AbstractC2849a;
import com.lingq.feature.vocabulary.filter.C2850b;
import com.lingq.feature.vocabulary.filter.C2851c;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nya implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f53419a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f53420b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f53421c;

    public /* synthetic */ nya(fv8 fv8Var, ui3 ui3Var, int i) {
        this.f53419a = 3;
        this.f53421c = fv8Var;
        this.f53420b = ui3Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        String strM23620a0;
        int i = this.f53419a;
        b16 b16Var = b16.f7762a;
        p84 p84Var = we1.f66679a;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f53421c;
        Object obj4 = this.f53420b;
        switch (i) {
            case 0:
                ui3 ui3Var = (ui3) obj4;
                zza zzaVar = (zza) obj3;
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    e16 e16VarM21610W = AbstractC3584sr.m21610W(AbstractC0080f.m815b(null, false, ui3Var, b16Var, 15), ge9.m12515a(tj3Var).f38956e, ge9.m12515a(tj3Var).f38952a, ge9.m12515a(tj3Var).f38952a, ge9.m12515a(tj3Var).f38952a);
                    sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(ge9.m12515a(tj3Var).f38955d, true, new gm5(28)), nj0.f52789H, tj3Var, 48);
                    int iHashCode = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m = tj3Var.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21610W);
                    se1.f60731q.getClass();
                    ui3 ui3Var2 = C0352b.f4299b;
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var2);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
                    oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
                    oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
                    oha.m18000f(tj3Var, C0352b.f4305h);
                    oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
                    Pair pair = zzaVar.f72435b;
                    CardStatus cardStatus = (CardStatus) pair.f47623a;
                    CardStatus cardStatus2 = (CardStatus) pair.f47624b;
                    if (cardStatus == cardStatus2) {
                        tj3Var.m22111b0(-66123596);
                        strM23620a0 = vz1.m23620a0(tj3Var, AbstractC3423or.m18225J(cardStatus));
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(-66064603);
                        strM23620a0 = vz1.m23620a0(tj3Var, AbstractC3423or.m18225J(cardStatus)) + " - " + vz1.m23620a0(tj3Var, AbstractC3423or.m18225J(cardStatus2));
                        tj3Var.m22139q(false);
                    }
                    lw9.m16554b(strM23620a0, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71407k, tj3Var, 0, 0, 131070);
                    ty3.m22351a(pvc.m19521q(), null, c99.m4422o(b16Var, ge9.m12515a(tj3Var).f38956e), 0L, tj3Var, 48, 8);
                    tj3Var.m22139q(true);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC2849a.m9756b((C2851c) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC2849a.m9758d((C2850b) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ebd.m11016a((fv8) obj3, (ui3) obj4, (ye1) obj, pk9.m19383z(9));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ebd.m11017b((String) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ebd.m11019d((g43) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                ebd.m11018c((List) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 7:
                n1b n1bVar = (n1b) obj4;
                vi3 vi3Var = (vi3) obj3;
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    e16 e16VarM23624c0 = vz1.m23624c0(b16Var, "vocabulary:review");
                    boolean zM22124i = tj3Var2.m22124i(n1bVar) | tj3Var2.m22120g(vi3Var);
                    Object objM22097O = tj3Var2.m22097O();
                    if (zM22124i || objM22097O == p84Var) {
                        objM22097O = new z0b(n1bVar, vi3Var);
                        tj3Var2.m22131l0(objM22097O);
                    }
                    AbstractC0257p.m1186a((ui3) objM22097O, e16VarM23624c0, false, null, 0L, 0L, null, tj3Var2, 3126);
                }
                break;
            default:
                r0b r0bVar = (r0b) obj4;
                vi3 vi3Var2 = (vi3) obj3;
                ye1 ye1Var3 = (ye1) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    tj3Var3.m22102U();
                } else {
                    boolean zM22120g = tj3Var3.m22120g(r0bVar) | tj3Var3.m22120g(vi3Var2);
                    Object objM22097O2 = tj3Var3.m22097O();
                    if (zM22120g || objM22097O2 == p84Var) {
                        objM22097O2 = new r3a(14, r0bVar, vi3Var2);
                        tj3Var3.m22131l0(objM22097O2);
                    }
                    fa4.m11642c(null, null, null, null, null, null, false, null, (vi3) objM22097O2, tj3Var3, 0, 511);
                }
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ nya(int i, Object obj, Object obj2) {
        this.f53419a = i;
        this.f53420b = obj;
        this.f53421c = obj2;
    }

    public /* synthetic */ nya(Object obj, vi3 vi3Var, int i, int i2) {
        this.f53419a = i2;
        this.f53420b = obj;
        this.f53421c = vi3Var;
    }
}
