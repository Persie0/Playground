package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class cbm implements aed {

    /* JADX INFO: renamed from: a */
    private final cbl f4958a;

    /* JADX INFO: renamed from: b */
    private final cbo f4959b;

    /* JADX INFO: renamed from: c */
    private final aed f4960c;

    public cbm(aed aedVar, cbl cblVar, cbo cboVar) {
        this.f4960c = aedVar;
        this.f4958a = cblVar;
        this.f4959b = cboVar;
    }

    @Override // p000.aed
    /* JADX INFO: renamed from: a */
    public final Object mo320a() {
        Object objMo320a = this.f4960c.mo320a();
        if (objMo320a == null) {
            objMo320a = this.f4958a.mo2998a();
        }
        if (objMo320a instanceof cbn) {
            ((cbn) objMo320a).mo2992f().f22442a = false;
        }
        return objMo320a;
    }

    @Override // p000.aed
    /* JADX INFO: renamed from: b */
    public final boolean mo321b(Object obj) {
        if (obj instanceof cbn) {
            ((cbn) obj).mo2992f().f22442a = true;
        }
        this.f4959b.mo3394a(obj);
        return this.f4960c.mo321b(obj);
    }
}
