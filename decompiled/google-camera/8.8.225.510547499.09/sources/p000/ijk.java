package p000;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ijk implements ikg {

    /* JADX INFO: renamed from: a */
    private final Set f31174a;

    /* JADX INFO: renamed from: b */
    private boolean f31175b = false;

    public ijk(Set set) {
        this.f31174a = set;
    }

    @Override // p000.ikg
    /* JADX INFO: renamed from: a */
    public final void mo6340a() {
        jvd.m13538a();
        if (this.f31175b) {
            return;
        }
        Iterator it = this.f31174a.iterator();
        while (it.hasNext()) {
            ((ikg) it.next()).mo6340a();
        }
        this.f31175b = true;
    }
}
