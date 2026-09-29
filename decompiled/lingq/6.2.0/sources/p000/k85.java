package p000;

import com.lingq.core.database.dao.C1321i;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k85 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f46855a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1321i f46856b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ArrayList f46857c;

    public /* synthetic */ k85(C1321i c1321i, ArrayList arrayList, int i) {
        this.f46855a = i;
        this.f46856b = c1321i;
        this.f46857c = arrayList;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        int i = this.f46855a;
        xfa xfaVar = xfa.f68157a;
        ArrayList arrayList = this.f46857c;
        C1321i c1321i = this.f46856b;
        bk8 bk8Var = (bk8) obj;
        switch (i) {
            case 0:
                bk8Var.getClass();
                c1321i.f17035L.m21730L(bk8Var, arrayList);
                break;
            case 1:
                bk8Var.getClass();
                c1321i.f17043T.m3840V(bk8Var, arrayList);
                break;
            default:
                bk8Var.getClass();
                c1321i.f17039P.m3840V(bk8Var, arrayList);
                break;
        }
        return xfaVar;
    }
}
