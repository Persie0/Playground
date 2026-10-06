package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.upload.ResourceManifestUploader$transmitUploadError$4", m18657c = "ResourceManifestUploader.kt", m18658d = "invokeSuspend", m18659e = {133})
public final class mdq extends oml implements oni {

    /* JADX INFO: renamed from: a */
    int f40121a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ mea f40122b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ lwz f40123c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mdq(lwz lwzVar, mea meaVar, ols olsVar, byte[] bArr) {
        super(1, olsVar);
        this.f40123c = lwzVar;
        this.f40122b = meaVar;
    }

    @Override // p000.oni
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo1803a(Object obj) {
        return new mdq(this.f40123c, this.f40122b, (ols) obj, null).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (this.f40121a) {
            case 0:
                lkm.m15592s(obj);
                Object obj2 = this.f40123c.f39489a;
                lzb lzbVar = this.f40122b.f40161a;
                this.f40121a = 1;
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
