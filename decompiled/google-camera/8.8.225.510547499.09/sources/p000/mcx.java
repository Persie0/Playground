package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.upload.OneAttachmentUploader$updateProgress$updatedResource$1", m18657c = "OneAttachmentUploader.kt", m18658d = "invokeSuspend", m18659e = {95})
public final class mcx extends oml implements oni {

    /* JADX INFO: renamed from: a */
    int f40009a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ lzb f40010b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ lxm f40011c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ mcg f40012d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ drj f40013e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mcx(drj drjVar, lzb lzbVar, lxm lxmVar, mcg mcgVar, ols olsVar, byte[] bArr, byte[] bArr2) {
        super(1, olsVar);
        this.f40013e = drjVar;
        this.f40010b = lzbVar;
        this.f40011c = lxmVar;
        this.f40012d = mcgVar;
    }

    @Override // p000.oni
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo1803a(Object obj) {
        return new mcx(this.f40013e, this.f40010b, this.f40011c, this.f40012d, (ols) obj, null, null).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (this.f40009a) {
            case 0:
                lkm.m15592s(obj);
                Object obj2 = this.f40013e.f12395a;
                lzb lzbVar = this.f40010b;
                lxm lxmVar = this.f40011c;
                avu avuVar = new avu(this.f40012d, 6);
                this.f40009a = 1;
                obj = ((lzv) obj2).mo16263j(lzbVar, lxmVar, false, avuVar, this);
                return obj == omaVar ? omaVar : obj;
            default:
                lkm.m15592s(obj);
        }
    }
}
