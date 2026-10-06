package p000;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bzk implements byw {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ bzm f4816a;

    public bzk(bzm bzmVar) {
        this.f4816a = bzmVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Collection] */
    @Override // p000.byw
    /* JADX INFO: renamed from: a */
    public final void mo2860a(boolean z) {
        ArrayList arrayList;
        cbi.m3387h();
        synchronized (this.f4816a) {
            arrayList = new ArrayList((Collection) this.f4816a.f4820b);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((byw) arrayList.get(i)).mo2860a(z);
        }
    }
}
