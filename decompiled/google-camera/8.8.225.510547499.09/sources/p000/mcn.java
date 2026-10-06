package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.upload.OneAttachmentUploader$complete$updatedResource$1", m18657c = "OneAttachmentUploader.kt", m18658d = "invokeSuspend", m18659e = {122})
public final class mcn extends oml implements oni {

    /* JADX INFO: renamed from: a */
    int f39961a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ lzb f39962b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ lxm f39963c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ mcg f39964d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ drj f39965e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mcn(drj drjVar, lzb lzbVar, lxm lxmVar, mcg mcgVar, ols olsVar, byte[] bArr, byte[] bArr2) {
        super(1, olsVar);
        this.f39965e = drjVar;
        this.f39962b = lzbVar;
        this.f39963c = lxmVar;
        this.f39964d = mcgVar;
    }

    @Override // p000.oni
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo1803a(Object obj) {
        return new mcn(this.f39965e, this.f39962b, this.f39963c, this.f39964d, (ols) obj, null, null).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (this.f39961a) {
            case 0:
                lkm.m15592s(obj);
                Object obj2 = this.f39965e.f12395a;
                lzb lzbVar = this.f39962b;
                lxm lxmVar = this.f39963c;
                avu avuVar = new avu(this.f39964d, 4);
                this.f39961a = 1;
                obj = ((lzv) obj2).mo16263j(lzbVar, lxmVar, false, avuVar, this);
                return obj == omaVar ? omaVar : obj;
            default:
                lkm.m15592s(obj);
        }
    }
}
