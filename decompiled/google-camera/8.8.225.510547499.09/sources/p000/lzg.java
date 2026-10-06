package p000;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "com.google.android.libraries.vision.visionkit.f250.internal.airlock.room.UploadQueryDao", m18657c = "UploadQueryDao.kt", m18658d = "getOldestValidUploadAndSetResourceToUploadInProgress$suspendImpl", m18659e = {128, 129})
final class lzg extends omf {

    /* JADX INFO: renamed from: a */
    Object f39620a;

    /* JADX INFO: renamed from: b */
    /* synthetic */ Object f39621b;

    /* JADX INFO: renamed from: c */
    int f39622c;

    /* JADX INFO: renamed from: d */
    List f39623d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ lzo f39624e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lzg(lzh lzhVar, ols olsVar) {
        super(olsVar);
        this.f39624e = (lzo) lzhVar;
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        this.f39621b = obj;
        this.f39622c |= Integer.MIN_VALUE;
        return lzh.m16246d(this.f39624e, this);
    }
}
