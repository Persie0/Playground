package p000;

import androidx.compose.foundation.lazy.grid.C0129b;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bt4 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8984a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f8985b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f8986c;

    public /* synthetic */ bt4(int i, Collection collection) {
        this.f8984a = 2;
        this.f8985b = i;
        this.f8986c = collection;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f8984a;
        xfa xfaVar = xfa.f68157a;
        Object obj2 = this.f8986c;
        int i2 = this.f8985b;
        switch (i) {
            case 0:
                ju4 ju4Var = (ju4) obj;
                b72 b72Var = ((C0129b) obj2).f2468a;
                jc9 jc9VarM16139y = lda.m16139y();
                lda.m16110J(jc9VarM16139y, lda.m16106F(jc9VarM16139y), jc9VarM16139y != null ? jc9VarM16139y.mo3163e() : null);
                b72Var.getClass();
                int i3 = ju4Var.f46158a;
                if (i3 == -1) {
                    i3 = 2;
                }
                for (int i4 = 0; i4 < i3; i4++) {
                    ju4Var.m14656a(i2 + i4);
                }
                return xfaVar;
            case 1:
                o72 o72Var = (o72) obj2;
                q98 q98Var = (q98) obj;
                q98Var.getClass();
                float fM15944g = 1.0f - l70.m15944g(Math.abs(o72Var.m1037l() + (o72Var.m1036k() - i2)), 0.0f, 1.0f);
                q98Var.m19813c(AbstractC3423or.m18232Q(0.3f, 1.0f, fM15944g));
                float fM18232Q = AbstractC3423or.m18232Q(0.95f, 1.0f, fM15944g);
                q98Var.m19823p(fM18232Q);
                q98Var.m19824q(fM18232Q);
                return xfaVar;
            default:
                return Boolean.valueOf(((List) obj).addAll(i2, (Collection) obj2));
        }
    }

    public /* synthetic */ bt4(do8 do8Var, int i, int i2) {
        this.f8984a = i2;
        this.f8986c = do8Var;
        this.f8985b = i;
    }
}
