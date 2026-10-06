package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "com.google.android.libraries.vision.visionkit.f250.internal.authenticator.F250AuthenticatorInternal$getSignedInAccount$2", m18657c = "F250AuthenticatorInternal.kt", m18658d = "invokeSuspend", m18659e = {51, 51})
final class mal extends oml implements onm {

    /* JADX INFO: renamed from: a */
    Object f39722a;

    /* JADX INFO: renamed from: b */
    int f39723b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ mao f39724c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mal(mao maoVar, ols olsVar) {
        super(2, olsVar);
        this.f39724c = maoVar;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((mal) mo562c((oqs) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0038  */
    /* JADX WARN: Code duplicated, block: B:12:0x004b  */
    /* JADX WARN: Code duplicated, block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        mau mauVar;
        lve lveVar;
        mav mavVar;
        lvo lvoVarM16278d;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (this.f39723b) {
            case 0:
                lkm.m15592s(obj);
                mauVar = new mau(this.f39724c.f39730b, lwa.f39423a, null);
                mao maoVar = this.f39724c;
                this.f39722a = mauVar;
                this.f39723b = 1;
                obj = maoVar.m16271b(mauVar, this);
                if (obj != omaVar) {
                    lveVar = (lve) obj;
                    if (lveVar != null) {
                        return null;
                    }
                    mavVar = this.f39724c.f39732d;
                    lvoVarM16278d = mau.m16278d(mauVar);
                    this.f39722a = lveVar;
                    this.f39723b = 2;
                    if (mavVar.m16285a(lvoVarM16278d, this) != omaVar) {
                        return lveVar;
                    }
                }
                return omaVar;
            case 1:
                mauVar = (mau) this.f39722a;
                lkm.m15592s(obj);
                lveVar = (lve) obj;
                if (lveVar != null) {
                    return null;
                }
                mavVar = this.f39724c.f39732d;
                lvoVarM16278d = mau.m16278d(mauVar);
                this.f39722a = lveVar;
                this.f39723b = 2;
                if (mavVar.m16285a(lvoVarM16278d, this) != omaVar) {
                    return lveVar;
                }
                return omaVar;
            default:
                lve lveVar2 = (lve) this.f39722a;
                lkm.m15592s(obj);
                return lveVar2;
        }
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: c */
    public final ols mo562c(Object obj, ols olsVar) {
        return new mal(this.f39724c, olsVar);
    }
}
