package p000;

import com.lingq.core.domain.model.lesson.TokenType;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class in0 implements bj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f44298a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f44299b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ e37 f44300c;

    public /* synthetic */ in0(int i, vi3 vi3Var, e37 e37Var) {
        this.f44298a = i;
        this.f44299b = vi3Var;
        this.f44300c = e37Var;
    }

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.f44298a;
        xfa xfaVar = xfa.f68157a;
        e37 e37Var = this.f44300c;
        vi3 vi3Var = this.f44299b;
        switch (i) {
            case 0:
                xz7 xz7Var = (xz7) obj;
                TokenType tokenType = (TokenType) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                e28 e28Var = (e28) obj4;
                xz7Var.getClass();
                tokenType.getClass();
                e28Var.getClass();
                vi3Var.invoke(new lra(e37Var.f36652a, xz7Var, tokenType, zBooleanValue, e28Var));
                break;
            default:
                xz7 xz7Var2 = (xz7) obj;
                TokenType tokenType2 = (TokenType) obj2;
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                e28 e28Var2 = (e28) obj4;
                xz7Var2.getClass();
                tokenType2.getClass();
                e28Var2.getClass();
                vi3Var.invoke(new lra(e37Var.f36652a, xz7Var2, tokenType2, zBooleanValue2, e28Var2));
                break;
        }
        return xfaVar;
    }
}
