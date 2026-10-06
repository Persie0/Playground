package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.upload.OneAttachmentUploader$transmitUploadError$3", m18657c = "OneAttachmentUploader.kt", m18658d = "invokeSuspend", m18659e = {180})
public final class mcs extends oml implements oni {

    /* JADX INFO: renamed from: a */
    int f39989a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ lzb f39990b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ lxm f39991c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ drj f39992d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mcs(drj drjVar, lzb lzbVar, lxm lxmVar, ols olsVar, byte[] bArr, byte[] bArr2) {
        super(1, olsVar);
        this.f39992d = drjVar;
        this.f39990b = lzbVar;
        this.f39991c = lxmVar;
    }

    @Override // p000.oni
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo1803a(Object obj) {
        return new mcs(this.f39992d, this.f39990b, this.f39991c, (ols) obj, null, null).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (this.f39989a) {
            case 0:
                lkm.m15592s(obj);
                Object obj2 = this.f39992d.f12395a;
                lzb lzbVar = this.f39990b;
                lxm lxmVar = this.f39991c;
                this.f39989a = 1;
                if (((lzv) obj2).mo16257c(lzbVar, lxmVar, this) == omaVar) {
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
