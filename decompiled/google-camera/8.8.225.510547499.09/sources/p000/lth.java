package p000;

import androidx.wear.ambient.AmbientMode;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lth implements nom {

    /* JADX INFO: renamed from: a */
    public final List f39156a;

    /* JADX INFO: renamed from: b */
    public final Executor f39157b;

    public lth(List list, Executor executor) {
        this.f39156a = list;
        this.f39157b = executor;
    }

    @Override // p000.nom
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ nps mo3942a(Object obj) {
        AmbientMode.AmbientController ambientController = (AmbientMode.AmbientController) obj;
        int i = ((mzr) this.f39156a).f41859c;
        ArrayList arrayList = new ArrayList(i);
        nba it = ((mws) this.f39156a).iterator();
        while (it.hasNext()) {
            arrayList.add(((lte) it.next()).m15964b());
        }
        return nod.m17554j(nod.m17554j(kxk.m14966L(((ltp) ambientController.f1697a).f39191c.m16668c()), mov.m16716b(new lqs(ambientController, mov.m16716b(new ltf(this, arrayList, i, 1)), not.INSTANCE, 4, null, null, null)), not.INSTANCE), mov.m16716b(new ltf(this, i, arrayList, 0)), not.INSTANCE);
    }
}
