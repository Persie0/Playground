package p000;

import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.domain.model.lesson.TokenType;
import com.lingq.core.domain.model.milestones.Badge;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pn4 implements bj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f56502a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f56503b;

    public /* synthetic */ pn4(Object obj, int i) {
        this.f56502a = i;
        this.f56503b = obj;
    }

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.f56502a;
        xfa xfaVar = xfa.f68157a;
        Object obj5 = this.f56503b;
        switch (i) {
            case 0:
                List list = (List) obj5;
                int iIntValue = ((Integer) obj2).intValue();
                ye1 ye1Var = (ye1) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((ms4) obj).getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= ((tj3) ye1Var).m22116e(iIntValue) ? 32 : 16;
                }
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    tj3Var.m22102U();
                } else {
                    j4d.m14286a(AbstractC3584sr.m21609V(b16.f7762a, 0.0f, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38956e, 1), (Badge) list.get(iIntValue), tj3Var, 0);
                }
                break;
            case 1:
                xz7 xz7Var = (xz7) obj;
                TokenType tokenType = (TokenType) obj2;
                Boolean bool = (Boolean) obj3;
                bool.booleanValue();
                e28 e28Var = (e28) obj4;
                xz7Var.getClass();
                tokenType.getClass();
                e28Var.getClass();
                ((bj3) obj5).mo825e(xz7Var, tokenType, bool, e28Var);
                break;
            default:
                Integer num = (Integer) obj2;
                num.getClass();
                int iIntValue3 = ((Integer) obj4).intValue();
                ((o27) obj).getClass();
                ((C0282a) obj5).invoke(num, (ye1) obj3, Integer.valueOf((iIntValue3 >> 3) & 14));
                break;
        }
        return xfaVar;
    }
}
