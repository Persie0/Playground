package p000;

import com.lingq.core.database.dao.C1318f;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mf2 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f51243a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1318f f51244b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f51245c;

    public /* synthetic */ mf2(C1318f c1318f, List list, int i) {
        this.f51243a = i;
        this.f51244b = c1318f;
        this.f51245c = list;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f51243a;
        List list = this.f51245c;
        C1318f c1318f = this.f51244b;
        bk8 bk8Var = (bk8) obj;
        switch (i) {
            case 0:
                bk8Var.getClass();
                c1318f.f17024N.m3840V(bk8Var, list);
                return xfa.f68157a;
            default:
                bk8Var.getClass();
                return c1318f.f17023M.m3843Y(bk8Var, list);
        }
    }
}
