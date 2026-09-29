package p000;

import com.lingq.core.domain.model.lesson.TokenType;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class px7 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f56950a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ey7 f56951b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f56952c;

    public /* synthetic */ px7(ey7 ey7Var, vi3 vi3Var, int i) {
        this.f56950a = i;
        this.f56951b = ey7Var;
        this.f56952c = vi3Var;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0071  */
    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        iy7 iy7Var;
        iy7 iy7Var2;
        int i = this.f56950a;
        xfa xfaVar = xfa.f68157a;
        Object obj4 = null;
        vi3 vi3Var = this.f56952c;
        ey7 ey7Var = this.f56951b;
        d87 d87Var = (d87) obj;
        TokenType tokenType = (TokenType) obj2;
        e28 e28Var = (e28) obj3;
        switch (i) {
            case 0:
                d87Var.getClass();
                tokenType.getClass();
                e28Var.getClass();
                for (Object obj5 : ey7Var.f38083g.f34871c) {
                    if (((iy7) obj5).f44780b == d87Var.f35172a) {
                        obj4 = obj5;
                        iy7Var = (iy7) obj4;
                        if (iy7Var != null) {
                            vi3Var.invoke(new js7(iy7Var, tokenType, e28Var));
                        }
                        break;
                    }
                }
                iy7Var = (iy7) obj4;
                if (iy7Var != null) {
                    vi3Var.invoke(new js7(iy7Var, tokenType, e28Var));
                }
                break;
            default:
                d87Var.getClass();
                tokenType.getClass();
                e28Var.getClass();
                for (Object obj6 : ey7Var.f38083g.f34871c) {
                    if (((iy7) obj6).f44780b == d87Var.f35172a) {
                        obj4 = obj6;
                        iy7Var2 = (iy7) obj4;
                        if (iy7Var2 != null) {
                            vi3Var.invoke(new js7(iy7Var2, tokenType, e28Var));
                        }
                        break;
                    }
                }
                iy7Var2 = (iy7) obj4;
                if (iy7Var2 != null) {
                    vi3Var.invoke(new js7(iy7Var2, tokenType, e28Var));
                }
                break;
        }
        return xfaVar;
    }
}
