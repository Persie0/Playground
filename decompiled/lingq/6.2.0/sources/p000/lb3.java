package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class lb3 implements lk1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49393a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f49394b;

    public /* synthetic */ lb3(Object obj, int i) {
        this.f49393a = i;
        this.f49394b = obj;
    }

    @Override // p000.lk1
    public final void accept(Object obj) {
        switch (this.f49393a) {
            case 0:
                mb3 mb3Var = (mb3) obj;
                if (mb3Var == null) {
                    mb3Var = new mb3(-3);
                }
                ((C3156jq) this.f49394b).m14591E(mb3Var);
                return;
            case 1:
                mb3 mb3Var2 = (mb3) obj;
                synchronized (nb3.f52563c) {
                    try {
                        l79 l79Var = nb3.f52564d;
                        ArrayList arrayList = (ArrayList) l79Var.get((String) this.f49394b);
                        if (arrayList == null) {
                            return;
                        }
                        l79Var.remove((String) this.f49394b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((lk1) arrayList.get(i)).accept(mb3Var2);
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 2:
                qc0 qc0Var = (qc0) obj;
                ArrayList arrayList2 = new ArrayList();
                new ArrayList();
                fy4 fy4Var = (fy4) ((C3440oy) this.f49394b).f55160b;
                qc0Var.getClass();
                if (qc0Var.f57553a != 0 || arrayList2.isEmpty()) {
                    return;
                }
                fy4Var.invoke(arrayList2);
                return;
            default:
                ((C3440oy) this.f49394b).m18570e((qc0) obj);
                return;
        }
    }
}
