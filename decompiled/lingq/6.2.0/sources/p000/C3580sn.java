package p000;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: renamed from: sn */
/* JADX INFO: loaded from: classes.dex */
public final class C3580sn implements ht5 {

    /* JADX INFO: renamed from: b */
    public static final C3580sn f61035b = new C3580sn(0);

    /* JADX INFO: renamed from: c */
    public static final C3580sn f61036c = new C3580sn(1);

    /* JADX INFO: renamed from: d */
    public static final C3580sn f61037d = new C3580sn(2);

    /* JADX INFO: renamed from: e */
    public static final C3580sn f61038e = new C3580sn(3);

    /* JADX INFO: renamed from: f */
    public static final C2951e4 f61039f = new C2951e4(29);

    /* JADX INFO: renamed from: g */
    public static final C3580sn f61040g = new C3580sn(4);

    /* JADX INFO: renamed from: h */
    public static final C3580sn f61041h = new C3580sn(5);

    /* JADX INFO: renamed from: i */
    public static final C3580sn f61042i = new C3580sn(6);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61043a;

    public /* synthetic */ C3580sn(int i) {
        this.f61043a = i;
    }

    @Override // p000.ht5
    /* JADX INFO: renamed from: b */
    public final it5 mo738b(jt5 jt5Var, List list, long j) {
        switch (this.f61043a) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(((ct5) list.get(i)).mo1514r(j));
                }
                return jt5Var.mo9895M0(bk1.m3801i(j), bk1.m3800h(j), AbstractC3194a.m15360M(), new C3542rn(0, arrayList));
            case 1:
                return jt5Var.mo9895M0(bk1.m3803k(j), bk1.m3802j(j), AbstractC3194a.m15360M(), new C2951e4(29));
            case 2:
                return jt5Var.mo9895M0(bk1.m3803k(j), bk1.m3802j(j), AbstractC3194a.m15360M(), new C2951e4(29));
            case 3:
                return jt5Var.mo9895M0(bk1.m3801i(j), bk1.m3800h(j), AbstractC3194a.m15360M(), f61039f);
            case 4:
                return jt5Var.mo9895M0(bk1.m3803k(j), bk1.m3802j(j), AbstractC3194a.m15360M(), new C2951e4(29));
            case 5:
                ArrayList arrayList2 = new ArrayList(list.size());
                int size2 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                for (int i2 = 0; i2 < size2; i2++) {
                    l87 l87VarMo1514r = ((ct5) list.get(i2)).mo1514r(j);
                    iMax = Math.max(iMax, l87VarMo1514r.f49301a);
                    iMax2 = Math.max(iMax2, l87VarMo1514r.f49302b);
                    arrayList2.add(l87VarMo1514r);
                }
                return jt5Var.mo9895M0(iMax, iMax2, AbstractC3194a.m15360M(), new C3542rn(2, arrayList2));
            default:
                return jt5Var.mo9895M0(bk1.m3799g(j) ? bk1.m3801i(j) : 0, bk1.m3798f(j) ? bk1.m3800h(j) : 0, AbstractC3194a.m15360M(), new C2951e4(29));
        }
    }
}
