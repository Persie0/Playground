package p000;

import com.lingq.core.database.dao.C1315c;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lv0 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50167a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1315c f50168b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ArrayList f50169c;

    public /* synthetic */ lv0(C1315c c1315c, ArrayList arrayList, int i) {
        this.f50167a = i;
        this.f50168b = c1315c;
        this.f50169c = arrayList;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f50167a;
        xfa xfaVar = xfa.f68157a;
        ArrayList arrayList = this.f50169c;
        C1315c c1315c = this.f50168b;
        bk8 bk8Var = (bk8) obj;
        switch (i) {
            case 0:
                bk8Var.getClass();
                c1315c.f17008R.m3840V(bk8Var, arrayList);
                return xfaVar;
            case 1:
                bk8Var.getClass();
                c1315c.f17007Q.m3840V(bk8Var, arrayList);
                return xfaVar;
            default:
                bk8Var.getClass();
                return c1315c.f17002L.m3843Y(bk8Var, arrayList);
        }
    }
}
