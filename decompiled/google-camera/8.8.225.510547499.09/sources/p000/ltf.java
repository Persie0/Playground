package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ltf implements nom {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ lth f39147a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f39148b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f39149c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f39150d;

    public /* synthetic */ ltf(lth lthVar, int i, List list, int i2) {
        this.f39150d = i2;
        this.f39147a = lthVar;
        this.f39148b = i;
        this.f39149c = list;
    }

    public /* synthetic */ ltf(lth lthVar, List list, int i, int i2) {
        this.f39150d = i2;
        this.f39147a = lthVar;
        this.f39149c = list;
        this.f39148b = i;
    }

    @Override // p000.nom
    /* JADX INFO: renamed from: a */
    public final nps mo3942a(Object obj) {
        switch (this.f39150d) {
            case 0:
                lth lthVar = this.f39147a;
                int i = this.f39148b;
                List list = this.f39149c;
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    if (((Boolean) kxk.m14973S((Future) list.get(i2))).booleanValue()) {
                        arrayList.add(((lte) lthVar.f39156a.get(i2)).m15963a());
                    }
                }
                return kxk.m14960F(arrayList).m17605a(new ljc(3), not.INSTANCE);
            default:
                lth lthVar2 = this.f39147a;
                List list2 = this.f39149c;
                return kxk.m14958D(list2).m17606b(mov.m16715a(new ltg(lthVar2, (nyw) obj, this.f39148b, list2, 0)), lthVar2.f39157b);
        }
    }
}
