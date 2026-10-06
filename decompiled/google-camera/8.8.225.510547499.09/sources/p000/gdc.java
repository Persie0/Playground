package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gdc extends jxd {

    /* JADX INFO: renamed from: a */
    private final gdb f24270a;

    public gdc(jww jwwVar, gdb gdbVar) {
        super(jwwVar);
        this.f24270a = gdbVar;
    }

    @Override // p000.jxd
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo3609b(Object obj) {
        String str = (String) obj;
        gdb gdbVar = this.f24270a;
        if (gdb.AUTO.f24268d.equals(str)) {
            return gdb.AUTO;
        }
        if (gdb.OFF.f24268d.equals(str)) {
            return gdb.OFF;
        }
        return gdb.ON.f24268d.equals(str) ? gdb.ON : gdbVar;
    }

    @Override // p000.jxd
    /* JADX INFO: renamed from: c */
    protected final /* synthetic */ Object mo3610c(Object obj) {
        return ((gdb) obj).f24268d;
    }
}
