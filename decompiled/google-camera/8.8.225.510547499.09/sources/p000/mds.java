package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.upload.ResourceManifestUploader$updateHandle$updatedResource$1", m18657c = "ResourceManifestUploader.kt", m18658d = "invokeSuspend", m18659e = {65})
public final class mds extends oml implements oni {

    /* JADX INFO: renamed from: a */
    int f40128a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ mea f40129b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ String f40130c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ lwz f40131d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mds(lwz lwzVar, mea meaVar, String str, ols olsVar, byte[] bArr) {
        super(1, olsVar);
        this.f40131d = lwzVar;
        this.f40129b = meaVar;
        this.f40130c = str;
    }

    @Override // p000.oni
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo1803a(Object obj) {
        return new mds(this.f40131d, this.f40129b, this.f40130c, (ols) obj, null).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (this.f40128a) {
            case 0:
                lkm.m15592s(obj);
                Object obj2 = this.f40131d.f39489a;
                lzb lzbVar = this.f40129b.f40161a;
                String str = this.f40130c;
                this.f40128a = 1;
                obj = ((lzv) obj2).m16264l(lzbVar, str, this);
                return obj == omaVar ? omaVar : obj;
            default:
                lkm.m15592s(obj);
        }
    }
}
