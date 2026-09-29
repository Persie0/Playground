package p000;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fe0 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38931a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f38932b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Set f38933c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ vi3 f38934d;

    public /* synthetic */ fe0(List list, Set set, vi3 vi3Var, int i, int i2) {
        this.f38931a = i2;
        this.f38932b = list;
        this.f38933c = set;
        this.f38934d = vi3Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f38931a;
        xfa xfaVar = xfa.f68157a;
        vi3 vi3Var = this.f38934d;
        Set set = this.f38933c;
        List list = this.f38932b;
        ye1 ye1Var = (ye1) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                t4d.m21842c(list, set, vi3Var, ye1Var, pk9.m19383z(1));
                break;
            default:
                q7a.m19707b(list, set, vi3Var, ye1Var, pk9.m19383z(1));
                break;
        }
        return xfaVar;
    }
}
