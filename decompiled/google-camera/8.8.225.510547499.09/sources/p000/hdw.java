package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hdw {

    /* JADX INFO: renamed from: a */
    public static final nbh f27397a = nbh.m17259h("com/google/android/apps/camera/smarts/SmartsHighResBitmapProviderImpl");

    /* JADX INFO: renamed from: b */
    public final fsz f27398b;

    /* JADX INFO: renamed from: c */
    private final htb f27399c;

    public hdw(htb htbVar, fsz fszVar, byte[] bArr) {
        this.f27399c = htbVar;
        this.f27398b = fszVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m10129a(heq heqVar) {
        mrm mrmVarM10725c = this.f27399c.m10725c();
        mrm mrmVarM10726d = this.f27399c.m10726d();
        if (mrmVarM10725c.mo16813g() && mrmVarM10726d.mo16813g()) {
            ((hcp) mrmVarM10725c.mo16809c()).mo10116a(new hdu(this, mrmVarM10726d, heqVar));
        } else {
            ((nbe) ((nbe) f27397a.m17252c()).mo17276G((char) 3493)).mo17290o("No frame provider.");
            heqVar.mo5957a(null);
        }
    }
}
