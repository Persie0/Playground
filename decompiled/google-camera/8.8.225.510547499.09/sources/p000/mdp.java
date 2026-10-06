package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.upload.ResourceManifestUploader$transmitUploadError$3", m18657c = "ResourceManifestUploader.kt", m18658d = "invokeSuspend", m18659e = {130})
public final class mdp extends oml implements oni {

    /* JADX INFO: renamed from: a */
    int f40118a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ mea f40119b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ lwz f40120c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mdp(lwz lwzVar, mea meaVar, ols olsVar, byte[] bArr) {
        super(1, olsVar);
        this.f40120c = lwzVar;
        this.f40119b = meaVar;
    }

    @Override // p000.oni
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo1803a(Object obj) {
        return new mdp(this.f40120c, this.f40119b, (ols) obj, null).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (this.f40118a) {
            case 0:
                lkm.m15592s(obj);
                Object obj2 = this.f40120c.f39489a;
                lzb lzbVar = this.f40119b.f40161a;
                this.f40118a = 1;
                Object objMo16266n = ((lzv) obj2).mo16266n(lzbVar.f39611u, lwh.UPLOAD_PAUSED, this);
                if (objMo16266n != oma.COROUTINE_SUSPENDED) {
                    objMo16266n = oki.f46196a;
                }
                if (objMo16266n == omaVar) {
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
