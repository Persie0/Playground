package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cie implements Iterable {

    /* JADX INFO: renamed from: a */
    public final List f5786a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final synchronized kba m3798a(cid cidVar) {
        this.f5786a.add(cidVar);
        return new cic(this, cidVar, 0);
    }

    @Override // java.lang.Iterable
    public final synchronized Iterator iterator() {
        return new ArrayList(this.f5786a).iterator();
    }
}
