package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cgc implements cfc {

    /* JADX INFO: renamed from: a */
    private final jwn f5572a;

    /* JADX INFO: renamed from: b */
    private final jww f5573b = new jwf(15);

    public cgc(hah hahVar) {
        this.f5572a = hahVar.mo10029a(gzy.f27058q);
    }

    @Override // p000.cfc
    /* JADX INFO: renamed from: a */
    public final jwn mo3590a() {
        return this.f5572a;
    }

    @Override // p000.cfc
    /* JADX INFO: renamed from: b */
    public final jww mo3591b() {
        return this.f5573b;
    }

    @Override // p000.cfc
    /* JADX INFO: renamed from: c */
    public final boolean mo3592c() {
        try {
            return ivt.f32347a != null;
        } catch (NoSuchFieldError e) {
            return false;
        }
    }
}
