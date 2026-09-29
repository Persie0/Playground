package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ogd extends vkb {

    /* JADX INFO: renamed from: c */
    public final boolean f54329c;

    /* JADX INFO: renamed from: d */
    public final boolean f54330d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ trc f54331e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ogd(trc trcVar, boolean z, boolean z2) {
        super("log");
        this.f54331e = trcVar;
        this.f54329c = z;
        this.f54330d = z2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0081  */
    /* JADX WARN: Code duplicated, block: B:22:0x0092  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a1 A[LOOP:0: B:23:0x0097->B:25:0x00a1, LOOP_END] */
    @Override // p000.vkb
    /* JADX INFO: renamed from: a */
    public final kmb mo12757a(C3329mb c3329mb, List list) {
        int i;
        int i2;
        String strMo3809c;
        ArrayList arrayList;
        qdd.m19876c(1, "log", list);
        int size = list.size();
        cnb cnbVar = kmb.f47523y;
        trc trcVar = this.f54331e;
        if (size == 1) {
            ((gw9) trcVar.f62791d).m12937h(3, ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) list.get(0)).mo3809c(), Collections.EMPTY_LIST, this.f54329c, this.f54330d);
            return cnbVar;
        }
        kmb kmbVar = (kmb) list.get(0);
        cdb cdbVar = (cdb) c3329mb.f50861c;
        cdb cdbVar2 = (cdb) c3329mb.f50861c;
        int iM19881h = qdd.m19881h(cdbVar.m4562k(c3329mb, kmbVar).mo3811e().doubleValue());
        if (iM19881h != 2) {
            i = 3;
            if (iM19881h == 3) {
                i2 = 1;
            } else if (iM19881h == 5) {
                i2 = 5;
            } else if (iM19881h == 6) {
                i2 = 2;
            }
            strMo3809c = cdbVar2.m4562k(c3329mb, (kmb) list.get(1)).mo3809c();
            if (list.size() == 2) {
                ((gw9) trcVar.f62791d).m12937h(i2, strMo3809c, Collections.EMPTY_LIST, this.f54329c, this.f54330d);
                return cnbVar;
            }
            arrayList = new ArrayList();
            for (int i3 = 2; i3 < Math.min(list.size(), 5); i3++) {
                arrayList.add(cdbVar2.m4562k(c3329mb, (kmb) list.get(i3)).mo3809c());
            }
            ((gw9) trcVar.f62791d).m12937h(i2, strMo3809c, arrayList, this.f54329c, this.f54330d);
            return cnbVar;
        }
        i = 4;
        i2 = i;
        strMo3809c = cdbVar2.m4562k(c3329mb, (kmb) list.get(1)).mo3809c();
        if (list.size() == 2) {
            ((gw9) trcVar.f62791d).m12937h(i2, strMo3809c, Collections.EMPTY_LIST, this.f54329c, this.f54330d);
            return cnbVar;
        }
        arrayList = new ArrayList();
        while (i3 < Math.min(list.size(), 5)) {
            arrayList.add(cdbVar2.m4562k(c3329mb, (kmb) list.get(i3)).mo3809c());
        }
        ((gw9) trcVar.f62791d).m12937h(i2, strMo3809c, arrayList, this.f54329c, this.f54330d);
        return cnbVar;
    }
}
