package p000;

import com.lingq.core.database.dao.C1321i;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f85 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38613a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1321i f38614b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f38615c;

    public /* synthetic */ f85(C1321i c1321i, List list, int i) {
        this.f38613a = i;
        this.f38614b = c1321i;
        this.f38615c = list;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f38613a;
        List list = this.f38615c;
        C1321i c1321i = this.f38614b;
        bk8 bk8Var = (bk8) obj;
        switch (i) {
            case 0:
                bk8Var.getClass();
                return c1321i.f17037N.m3843Y(bk8Var, list);
            default:
                bk8Var.getClass();
                c1321i.f17044U.m3840V(bk8Var, list);
                return xfa.f68157a;
        }
    }
}
