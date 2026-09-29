package p000;

import androidx.compose.p002ui.layout.AbstractC0343j;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rs4 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59756a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t66 f59757b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ArrayList f59758c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ List f59759d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f59760e;

    public /* synthetic */ rs4(t66 t66Var, ArrayList arrayList, List list, boolean z, int i) {
        this.f59756a = i;
        this.f59757b = t66Var;
        this.f59758c = arrayList;
        this.f59759d = list;
        this.f59760e = z;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f59756a;
        boolean z = this.f59760e;
        List list = this.f59759d;
        ArrayList arrayList = this.f59758c;
        t66 t66Var = this.f59757b;
        xfa xfaVar = xfa.f68157a;
        AbstractC0343j abstractC0343j = (AbstractC0343j) obj;
        switch (i) {
            case 0:
                abstractC0343j.f4216a = true;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((ts4) arrayList.get(i2)).m22284m(abstractC0343j, z);
                }
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ((ts4) list.get(i3)).m22284m(abstractC0343j, z);
                }
                abstractC0343j.f4216a = false;
                t66Var.getValue();
                break;
            default:
                abstractC0343j.f4216a = true;
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    ((iv4) arrayList.get(i4)).m14159n(abstractC0343j, z);
                }
                int size4 = list.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    ((iv4) list.get(i5)).m14159n(abstractC0343j, z);
                }
                abstractC0343j.f4216a = false;
                t66Var.getValue();
                break;
        }
        return xfaVar;
    }
}
