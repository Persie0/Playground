package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nl4 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52910a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ul4 f52911b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ArrayList f52912c;

    public /* synthetic */ nl4(ul4 ul4Var, ArrayList arrayList, int i) {
        this.f52910a = i;
        this.f52911b = ul4Var;
        this.f52912c = arrayList;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f52910a;
        ArrayList arrayList = this.f52912c;
        ul4 ul4Var = this.f52911b;
        bk8 bk8Var = (bk8) obj;
        switch (i) {
            case 0:
                bk8Var.getClass();
                ul4Var.f64046O.m3840V(bk8Var, arrayList);
                return xfa.f68157a;
            default:
                bk8Var.getClass();
                return ul4Var.f64043L.m3843Y(bk8Var, arrayList);
        }
    }
}
