package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.upload.ResourceManifestUploader$completeResource$completedResource$1", m18657c = "ResourceManifestUploader.kt", m18658d = "invokeSuspend", m18659e = {90})
public final class mdk extends oml implements oni {

    /* JADX INFO: renamed from: a */
    int f40093a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ mea f40094b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ String f40095c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ lwz f40096d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mdk(lwz lwzVar, mea meaVar, String str, ols olsVar, byte[] bArr) {
        super(1, olsVar);
        this.f40096d = lwzVar;
        this.f40094b = meaVar;
        this.f40095c = str;
    }

    @Override // p000.oni
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo1803a(Object obj) {
        return new mdk(this.f40096d, this.f40094b, this.f40095c, (ols) obj, null).mo561b(oki.f46196a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, ksi] */
    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (this.f40093a) {
            case 0:
                lkm.m15592s(obj);
                Object obj2 = this.f40096d.f39489a;
                lzb lzbVar = this.f40094b.f40161a;
                lvn lvnVarM15716b = lme.m15716b(this.f40095c);
                nzw nzwVarM15687g = lle.m15687g(this.f40096d.f39490b);
                this.f40093a = 1;
                obj = ((lzv) obj2).m16267p(lzbVar, lvnVarM15716b, nzwVarM15687g, this);
                return obj == omaVar ? omaVar : obj;
            default:
                lkm.m15592s(obj);
        }
    }
}
