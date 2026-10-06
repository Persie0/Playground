package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ohj implements ohi, ohb {

    /* JADX INFO: renamed from: a */
    public final Object f46012a;

    private ohj(Object obj) {
        this.f46012a = obj;
    }

    /* JADX INFO: renamed from: a */
    public static ohi m18487a(Object obj) {
        obj.getClass();
        return new ohj(obj);
    }

    @Override // p000.oju
    public final Object get() {
        return this.f46012a;
    }
}
