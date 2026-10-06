package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.upload.OneAttachmentUploader$transmitUploadError$2", m18657c = "OneAttachmentUploader.kt", m18658d = "invokeSuspend", m18659e = {169})
public final class mcr extends oml implements oni {

    /* JADX INFO: renamed from: a */
    int f39984a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ lzb f39985b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ lxm f39986c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ mcg f39987d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ drj f39988e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mcr(drj drjVar, lzb lzbVar, lxm lxmVar, mcg mcgVar, ols olsVar, byte[] bArr, byte[] bArr2) {
        super(1, olsVar);
        this.f39988e = drjVar;
        this.f39985b = lzbVar;
        this.f39986c = lxmVar;
        this.f39987d = mcgVar;
    }

    @Override // p000.oni
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo1803a(Object obj) {
        return new mcr(this.f39988e, this.f39985b, this.f39986c, this.f39987d, (ols) obj, null, null).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (this.f39984a) {
            case 0:
                lkm.m15592s(obj);
                Object obj2 = this.f39988e.f12395a;
                lzb lzbVar = this.f39985b;
                lxm lxmVar = this.f39986c;
                avu avuVar = new avu(this.f39987d, 5);
                this.f39984a = 1;
                obj = ((lzv) obj2).mo16263j(lzbVar, lxmVar, true, avuVar, this);
                return obj == omaVar ? omaVar : obj;
            default:
                lkm.m15592s(obj);
        }
    }
}
