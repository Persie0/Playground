package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.upload.OneResourceUploaderImpl$uploadAllAttachments$2", m18657c = "OneResourceUploaderImpl.kt", m18658d = "invokeSuspend", m18659e = {137})
final class mdg extends oml implements onm {

    /* JADX INFO: renamed from: a */
    int f40062a;

    /* JADX INFO: renamed from: b */
    /* synthetic */ Object f40063b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ mdi f40064c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ mau f40065d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ lzb f40066e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mdg(mdi mdiVar, mau mauVar, lzb lzbVar, ols olsVar) {
        super(2, olsVar);
        this.f40064c = mdiVar;
        this.f40065d = mauVar;
        this.f40066e = lzbVar;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((mdg) mo562c((lxm) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) throws Throwable {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (this.f40062a) {
            case 0:
                lkm.m15592s(obj);
                lxm lxmVar = (lxm) this.f40063b;
                if (lxmVar.f39512b != lvl.ATTACHMENT || lxmVar.f39520j.f39541e == lwh.UPLOADED_TO_F250) {
                    return lxmVar;
                }
                drj drjVar = this.f40064c.f40079a;
                mau mauVar = this.f40065d;
                lzb lzbVar = this.f40066e;
                this.f40062a = 1;
                obj = drjVar.m6638r(mauVar, lzbVar, lxmVar, this);
                if (obj == omaVar) {
                    return omaVar;
                }
                break;
            default:
                lkm.m15592s(obj);
                break;
        }
        return (lxm) obj;
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: c */
    public final ols mo562c(Object obj, ols olsVar) {
        mdg mdgVar = new mdg(this.f40064c, this.f40065d, this.f40066e, olsVar);
        mdgVar.f40063b = obj;
        return mdgVar;
    }
}
