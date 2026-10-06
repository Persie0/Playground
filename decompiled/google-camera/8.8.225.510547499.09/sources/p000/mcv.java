package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.upload.OneAttachmentUploader$updateHandle$2", m18657c = "OneAttachmentUploader.kt", m18658d = "invokeSuspend", m18659e = {75})
public final class mcv extends oml implements oni {

    /* JADX INFO: renamed from: a */
    int f40001a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ lxm f40002b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ drj f40003c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mcv(drj drjVar, lxm lxmVar, ols olsVar, byte[] bArr, byte[] bArr2) {
        super(1, olsVar);
        this.f40003c = drjVar;
        this.f40002b = lxmVar;
    }

    @Override // p000.oni
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo1803a(Object obj) {
        return new mcv(this.f40003c, this.f40002b, (ols) obj, null, null).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (this.f40001a) {
            case 0:
                lkm.m15592s(obj);
                Object obj2 = this.f40003c.f12395a;
                lxm lxmVar = this.f40002b;
                this.f40001a = 1;
                obj = ((lzv) obj2).mo16260g(lxmVar, this);
                return obj == omaVar ? omaVar : obj;
            default:
                lkm.m15592s(obj);
        }
    }
}
