package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "com.google.android.libraries.vision.visionkit.f250.internal.authenticator.F250AuthenticatorInternal$signedInAccountInternal$2", m18657c = "F250AuthenticatorInternal.kt", m18658d = "invokeSuspend", m18659e = {91})
final class mam extends oml implements oni {

    /* JADX INFO: renamed from: a */
    int f39725a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ mao f39726b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mam(mao maoVar, ols olsVar) {
        super(1, olsVar);
        this.f39726b = maoVar;
    }

    @Override // p000.oni
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo1803a(Object obj) {
        return new mam(this.f39726b, (ols) obj).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (this.f39725a) {
            case 0:
                lkm.m15592s(obj);
                mas masVar = this.f39726b.f39731c;
                this.f39725a = 1;
                obj = masVar.mo16274c(this);
                return obj == omaVar ? omaVar : obj;
            default:
                lkm.m15592s(obj);
        }
    }
}
