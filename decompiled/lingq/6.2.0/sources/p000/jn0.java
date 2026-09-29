package p000;

import com.lingq.core.domain.model.lesson.TokenType;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jn0 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45852a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e37 f45853b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f45854c;

    public /* synthetic */ jn0(int i, vi3 vi3Var, e37 e37Var) {
        this.f45852a = i;
        this.f45853b = e37Var;
        this.f45854c = vi3Var;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0039  */
    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        iy7 iy7Var;
        iy7 iy7Var2;
        int i = this.f45852a;
        xfa xfaVar = xfa.f68157a;
        Object obj4 = null;
        vi3 vi3Var = this.f45854c;
        e37 e37Var = this.f45853b;
        d87 d87Var = (d87) obj;
        TokenType tokenType = (TokenType) obj2;
        e28 e28Var = (e28) obj3;
        switch (i) {
            case 0:
                d87Var.getClass();
                tokenType.getClass();
                e28Var.getClass();
                for (Object obj5 : e37Var.f36657f) {
                    if (((iy7) obj5).f44780b == d87Var.f35172a) {
                        obj4 = obj5;
                        iy7Var = (iy7) obj4;
                        if (iy7Var != null) {
                            vi3Var.invoke(new xqa(iy7Var, tokenType, e28Var));
                        }
                        break;
                    }
                }
                iy7Var = (iy7) obj4;
                if (iy7Var != null) {
                    vi3Var.invoke(new xqa(iy7Var, tokenType, e28Var));
                }
                break;
            default:
                d87Var.getClass();
                tokenType.getClass();
                e28Var.getClass();
                for (Object obj6 : e37Var.f36657f) {
                    if (((iy7) obj6).f44780b == d87Var.f35172a) {
                        obj4 = obj6;
                        iy7Var2 = (iy7) obj4;
                        if (iy7Var2 != null) {
                            vi3Var.invoke(new xqa(iy7Var2, tokenType, e28Var));
                        }
                        break;
                    }
                }
                iy7Var2 = (iy7) obj4;
                if (iy7Var2 != null) {
                    vi3Var.invoke(new xqa(iy7Var2, tokenType, e28Var));
                }
                break;
        }
        return xfaVar;
    }
}
