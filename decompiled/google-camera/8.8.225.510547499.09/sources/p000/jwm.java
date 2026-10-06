package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jwm implements jwn {

    /* JADX INFO: renamed from: a */
    public final List f34958a;

    public jwm(Collection collection) {
        this.f34958a = mws.m17095j(collection);
    }

    @Override // p000.jwn
    /* JADX INFO: renamed from: a */
    public final kba mo3830a(kbg kbgVar, Executor executor) {
        if (this.f34958a.isEmpty()) {
            executor.execute(new juz(kbgVar, 9));
            return new gog(14);
        }
        jwl jwlVar = new jwl(this, kbgVar, executor);
        jvb jvbVar = new jvb();
        jwx jwxVar = new jwx();
        for (int i = 0; i < this.f34958a.size(); i++) {
            jvbVar.m13537d(((jwn) this.f34958a.get(i)).mo3830a(new jwk(jwlVar, i), jwxVar));
        }
        return jvbVar;
    }

    @Override // p000.jwn
    /* JADX INFO: renamed from: be */
    public final /* bridge */ /* synthetic */ Object mo3831be() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f34958a.iterator();
        while (it.hasNext()) {
            arrayList.add(((jwn) it.next()).mo3831be());
        }
        return arrayList;
    }
}
