package p000;

import com.lingq.core.database.dao.C1317e;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class st1 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61379a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1317e f61380b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f61381c;

    public /* synthetic */ st1(C1317e c1317e, List list, int i) {
        this.f61379a = i;
        this.f61380b = c1317e;
        this.f61381c = list;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f61379a;
        xfa xfaVar = xfa.f68157a;
        List list = this.f61381c;
        C1317e c1317e = this.f61380b;
        bk8 bk8Var = (bk8) obj;
        switch (i) {
            case 0:
                bk8Var.getClass();
                c1317e.f17018e.m3840V(bk8Var, list);
                break;
            case 1:
                bk8Var.getClass();
                c1317e.f17017d.m3840V(bk8Var, list);
                break;
            default:
                bk8Var.getClass();
                c1317e.f17019f.m3840V(bk8Var, list);
                break;
        }
        return xfaVar;
    }
}
