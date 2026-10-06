package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "com.google.android.libraries.vision.visionkit.f250.internal.airlock.room.UploadUpdateDao", m18657c = "UploadUpdateDao.kt", m18658d = "failPermanently$suspendImpl", m18659e = {62, 63})
final class lzq extends omf {

    /* JADX INFO: renamed from: a */
    /* synthetic */ Object f39646a;

    /* JADX INFO: renamed from: b */
    int f39647b;

    /* JADX INFO: renamed from: c */
    lzb f39648c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ maj f39649d;

    /* JADX INFO: renamed from: e */
    maj f39650e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lzq(lzv lzvVar, ols olsVar) {
        super(olsVar);
        this.f39649d = (maj) lzvVar;
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        this.f39646a = obj;
        this.f39647b |= Integer.MIN_VALUE;
        return lzv.m16252b(this.f39649d, null, this);
    }
}
