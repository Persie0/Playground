package p000;

import com.airbnb.lottie.model.content.ShapeTrimPath$Type;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class eca implements qk1, i90 {

    /* JADX INFO: renamed from: a */
    public final boolean f37014a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f37015b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final ShapeTrimPath$Type f37016c;

    /* JADX INFO: renamed from: d */
    public final j73 f37017d;

    /* JADX INFO: renamed from: e */
    public final j73 f37018e;

    /* JADX INFO: renamed from: f */
    public final j73 f37019f;

    public eca(o90 o90Var, k28 k28Var) {
        this.f37014a = k28Var.f46590d;
        this.f37016c = (ShapeTrimPath$Type) k28Var.f46588b;
        j73 j73VarMo550a = k28Var.f46589c.mo550a();
        this.f37017d = j73VarMo550a;
        j73 j73VarMo550a2 = ((C3763xl) k28Var.f46591e).mo550a();
        this.f37018e = j73VarMo550a2;
        j73 j73VarMo550a3 = ((C3763xl) k28Var.f46592f).mo550a();
        this.f37019f = j73VarMo550a3;
        o90Var.m17863e(j73VarMo550a);
        o90Var.m17863e(j73VarMo550a2);
        o90Var.m17863e(j73VarMo550a3);
        j73VarMo550a.m16687a(this);
        j73VarMo550a2.m16687a(this);
        j73VarMo550a3.m16687a(this);
    }

    @Override // p000.i90
    /* JADX INFO: renamed from: a */
    public final void mo9827a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f37015b;
            if (i >= arrayList.size()) {
                return;
            }
            ((i90) arrayList.get(i)).mo9827a();
            i++;
        }
    }

    @Override // p000.qk1
    /* JADX INFO: renamed from: b */
    public final void mo9828b(List list, List list2) {
    }

    /* JADX INFO: renamed from: c */
    public final void m11028c(i90 i90Var) {
        this.f37015b.add(i90Var);
    }
}
