package p000;

import kotlin.Pair;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class x81 implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67920a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f67921b;

    public /* synthetic */ x81(vi3 vi3Var, int i) {
        this.f67920a = i;
        this.f67921b = vi3Var;
    }

    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) {
        int i;
        int i2 = this.f67920a;
        xfa xfaVar = xfa.f68157a;
        vi3 vi3Var = this.f67921b;
        switch (i2) {
            case 0:
                hv4 hv4Var = (hv4) obj;
                iv4 iv4Var = (iv4) u91.m22598P0(hv4Var.f42985k);
                i = iv4Var != null ? iv4Var.f44648a : 0;
                int i3 = hv4Var.f42988n;
                if (i3 > 0 && i >= i3 - 2) {
                    vi3Var.invoke(u51.f63411a);
                }
                break;
            case 1:
                hv4 hv4Var2 = (hv4) obj;
                iv4 iv4Var2 = (iv4) u91.m22598P0(hv4Var2.f42985k);
                if ((iv4Var2 != null ? iv4Var2.f44648a : 0) >= hv4Var2.f42988n - 5) {
                    vi3Var.invoke(mn6.f51575a);
                }
                break;
            case 2:
                vi3Var.invoke(new gs7(((Number) obj).intValue()));
                break;
            case 3:
                Pair pair = (Pair) obj;
                vi3Var.invoke(new pra(((Number) pair.f47623a).intValue(), ((Number) pair.f47624b).intValue()));
                break;
            case 4:
                hv4 hv4Var3 = (hv4) obj;
                iv4 iv4Var3 = (iv4) u91.m22598P0(hv4Var3.f42985k);
                i = iv4Var3 != null ? iv4Var3.f44648a : 0;
                int i4 = hv4Var3.f42988n;
                if (i >= i4 - 2 && i4 > 0) {
                    vi3Var.invoke(bs8.f8949a);
                }
                break;
            default:
                vi3Var.invoke(new i15(((Number) obj).intValue()));
                break;
        }
        return xfaVar;
    }
}
