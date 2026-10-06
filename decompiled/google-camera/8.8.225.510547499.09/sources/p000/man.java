package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "com.google.android.libraries.vision.visionkit.f250.internal.authenticator.F250AuthenticatorInternal$userAccount$1", m18657c = "F250AuthenticatorInternal.kt", m18658d = "invokeSuspend", m18659e = {46})
final class man extends oml implements onm {

    /* JADX INFO: renamed from: a */
    int f39727a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ mao f39728b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public man(mao maoVar, ols olsVar) {
        super(2, olsVar);
        this.f39728b = maoVar;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((man) mo562c((ous) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (this.f39727a) {
            case 0:
                lkm.m15592s(obj);
                mao maoVar = this.f39728b;
                this.f39727a = 1;
                if (ook.m18774L(maoVar.f39729a, new mal(maoVar, null), this) == omaVar) {
                    return omaVar;
                }
                break;
            default:
                lkm.m15592s(obj);
                break;
        }
        return oki.f46196a;
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: c */
    public final ols mo562c(Object obj, ols olsVar) {
        return new man(this.f39728b, olsVar);
    }
}
