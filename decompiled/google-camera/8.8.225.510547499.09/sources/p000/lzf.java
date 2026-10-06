package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "com.google.android.libraries.vision.visionkit.f250.internal.airlock.room.UploadQueryDao", m18657c = "UploadQueryDao.kt", m18658d = "failPermanentlyInvalidUploads$suspendImpl", m18659e = {56, 57, 58})
final class lzf extends omf {

    /* JADX INFO: renamed from: a */
    /* synthetic */ Object f39616a;

    /* JADX INFO: renamed from: b */
    int f39617b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ lzo f39618c;

    /* JADX INFO: renamed from: d */
    lzo f39619d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lzf(lzh lzhVar, ols olsVar) {
        super(olsVar);
        this.f39618c = (lzo) lzhVar;
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        this.f39616a = obj;
        this.f39617b |= Integer.MIN_VALUE;
        return lzh.m16245b(this.f39618c, this);
    }
}
