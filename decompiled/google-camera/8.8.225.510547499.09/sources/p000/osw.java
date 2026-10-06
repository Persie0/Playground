package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class osw extends oqo {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f46505c = 0;

    static {
        new osw();
    }

    private osw() {
    }

    @Override // p000.oqo
    /* JADX INFO: renamed from: d */
    public final void mo18915d(oly olyVar, Runnable runnable) {
        olyVar.getClass();
        if (((osz) olyVar.get(osz.f46508a)) == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }

    @Override // p000.oqo
    /* JADX INFO: renamed from: e */
    public final boolean mo18916e(oly olyVar) {
        olyVar.getClass();
        return false;
    }

    @Override // p000.oqo
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
