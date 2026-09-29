package p000;

import androidx.compose.foundation.AbstractC0080f;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.lesson.LessonWord;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class vy4 implements bj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66092a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f66093b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f66094c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ vs3 f66095d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zi3 f66096e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ vi3 f66097f;

    public /* synthetic */ vy4(List list, vi3 vi3Var, vs3 vs3Var, zi3 zi3Var, vi3 vi3Var2, int i) {
        this.f66092a = i;
        this.f66093b = list;
        this.f66094c = vi3Var;
        this.f66095d = vs3Var;
        this.f66096e = zi3Var;
        this.f66097f = vi3Var2;
    }

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.f66092a;
        xfa xfaVar = xfa.f68157a;
        p84 p84Var = we1.f66679a;
        b16 b16Var = b16.f7762a;
        List list = this.f66093b;
        vi3 vi3Var = this.f66094c;
        switch (i) {
            case 0:
                ft4 ft4Var = (ft4) obj;
                int iIntValue = ((Number) obj2).intValue();
                ye1 ye1Var = (ye1) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                int i2 = (iIntValue2 & 6) == 0 ? iIntValue2 | (((tj3) ye1Var).m22120g(ft4Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i2 |= ((tj3) ye1Var).m22116e(iIntValue) ? 32 : 16;
                }
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
                    tj3Var.m22102U();
                } else {
                    LessonCard lessonCard = (LessonCard) list.get(iIntValue);
                    tj3Var.m22111b0(-1721041786);
                    vh9 vh9Var = ps5.f56764b;
                    e16 e16VarM19045o = pb1.m19045o(d32.m10007D(b16Var, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55821F, ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64856b), ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64856b);
                    boolean zM22120g = tj3Var.m22120g(vi3Var) | tj3Var.m22124i(lessonCard);
                    Object objM22097O = tj3Var.m22097O();
                    if (zM22120g || objM22097O == p84Var) {
                        objM22097O = new we0(vi3Var, lessonCard, 5);
                        tj3Var.m22131l0(objM22097O);
                    }
                    pid.m19192c(AbstractC0080f.m815b(null, false, (ui3) objM22097O, e16VarM19045o, 15), this.f66095d, lessonCard, this.f66096e, this.f66097f, tj3Var, 0);
                    thb.m22044c(tj3Var, c99.m4422o(b16Var, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38956e));
                    tj3Var.m22139q(false);
                }
                break;
            default:
                ft4 ft4Var2 = (ft4) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                ye1 ye1Var2 = (ye1) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i3 = (iIntValue4 & 6) == 0 ? iIntValue4 | (((tj3) ye1Var2).m22120g(ft4Var2) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i3 |= ((tj3) ye1Var2).m22116e(iIntValue3) ? 32 : 16;
                }
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(i3 & 1, (i3 & 147) != 146)) {
                    tj3Var2.m22102U();
                } else {
                    LessonWord lessonWord = (LessonWord) list.get(iIntValue3);
                    tj3Var2.m22111b0(-836105545);
                    vh9 vh9Var2 = ps5.f56764b;
                    e16 e16VarM19045o2 = pb1.m19045o(d32.m10007D(b16Var, ((ms5) tj3Var2.m22128k(vh9Var2)).f51799a.f55821F, ((ms5) tj3Var2.m22128k(vh9Var2)).f51801c.f64856b), ((ms5) tj3Var2.m22128k(vh9Var2)).f51801c.f64856b);
                    boolean zM22120g2 = tj3Var2.m22120g(vi3Var) | tj3Var2.m22124i(lessonWord);
                    Object objM22097O2 = tj3Var2.m22097O();
                    if (zM22120g2 || objM22097O2 == p84Var) {
                        objM22097O2 = new we0(vi3Var, lessonWord, 6);
                        tj3Var2.m22131l0(objM22097O2);
                    }
                    pid.m19192c(AbstractC0080f.m815b(null, false, (ui3) objM22097O2, e16VarM19045o2, 15), this.f66095d, lessonWord, this.f66096e, this.f66097f, tj3Var2, 0);
                    thb.m22044c(tj3Var2, c99.m4422o(b16Var, ((fe9) tj3Var2.m22128k(ge9.f40637a)).f38956e));
                    tj3Var2.m22139q(false);
                }
                break;
        }
        return xfaVar;
    }
}
