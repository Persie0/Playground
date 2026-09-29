package p000;

import com.lingq.core.database.dao.C1314b;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kd0 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f47056a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1314b f47057b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f47058c;

    public /* synthetic */ kd0(C1314b c1314b, List list, int i) {
        this.f47056a = i;
        this.f47057b = c1314b;
        this.f47058c = list;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f47056a;
        xfa xfaVar = xfa.f68157a;
        List list = this.f47058c;
        C1314b c1314b = this.f47057b;
        bk8 bk8Var = (bk8) obj;
        switch (i) {
            case 0:
                bk8Var.getClass();
                c1314b.f16999b.m3840V(bk8Var, list);
                break;
            default:
                bk8Var.getClass();
                c1314b.f17000c.m3840V(bk8Var, list);
                break;
        }
        return xfaVar;
    }
}
