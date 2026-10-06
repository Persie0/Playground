package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.upload.OneAttachmentUploader$failOnErroneousResourceComplete$2", m18657c = "OneAttachmentUploader.kt", m18658d = "invokeSuspend", m18659e = {138})
public final class mcp extends oml implements oni {

    /* JADX INFO: renamed from: a */
    int f39972a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ mcf f39973b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ drj f39974c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mcp(drj drjVar, mcf mcfVar, ols olsVar, byte[] bArr, byte[] bArr2) {
        super(1, olsVar);
        this.f39974c = drjVar;
        this.f39973b = mcfVar;
    }

    @Override // p000.oni
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo1803a(Object obj) {
        return new mcp(this.f39974c, this.f39973b, (ols) obj, null, null).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (this.f39972a) {
            case 0:
                lkm.m15592s(obj);
                Object obj2 = this.f39974c.f12395a;
                lzb lzbVar = this.f39973b.f39935a;
                this.f39972a = 1;
                if (((lzv) obj2).mo16256a(lzbVar, this) == omaVar) {
                    return omaVar;
                }
                break;
            default:
                lkm.m15592s(obj);
                break;
        }
        return oki.f46196a;
    }
}
