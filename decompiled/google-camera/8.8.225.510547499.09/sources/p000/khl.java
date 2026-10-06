package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class khl implements kba {

    /* JADX INFO: renamed from: a */
    private final mwx f36058a;

    /* JADX INFO: renamed from: b */
    private boolean f36059b = false;

    public khl(mwx mwxVar) {
        this.f36058a = mwxVar;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized key m14267a(kho khoVar) {
        key keyVar;
        if (!this.f36059b && (keyVar = (key) this.f36058a.get(khoVar)) != null) {
            return keyVar.mo7040a();
        }
        return null;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f36059b) {
            return;
        }
        this.f36059b = true;
        naz nazVarListIterator = this.f36058a.values().listIterator();
        while (nazVarListIterator.hasNext()) {
            ((key) nazVarListIterator.next()).close();
        }
    }
}
