package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.upload.ResourceManifestUploader$updateProgress$updatedResource$1", m18657c = "ResourceManifestUploader.kt", m18658d = "invokeSuspend", m18659e = {81})
public final class mdu extends oml implements oni {

    /* JADX INFO: renamed from: a */
    int f40136a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ mea f40137b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ double f40138c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ lwz f40139d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mdu(lwz lwzVar, mea meaVar, double d, ols olsVar, byte[] bArr) {
        super(1, olsVar);
        this.f40139d = lwzVar;
        this.f40137b = meaVar;
        this.f40138c = d;
    }

    @Override // p000.oni
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo1803a(Object obj) {
        return new mdu(this.f40139d, this.f40137b, this.f40138c, (ols) obj, null).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (this.f40136a) {
            case 0:
                lkm.m15592s(obj);
                Object obj2 = this.f40139d.f39489a;
                lzb lzbVar = this.f40137b.f40161a;
                double d = this.f40138c;
                this.f40136a = 1;
                obj = ((lzv) obj2).m16261h(lzbVar, d, this);
                return obj == omaVar ? omaVar : obj;
            default:
                lkm.m15592s(obj);
        }
    }
}
