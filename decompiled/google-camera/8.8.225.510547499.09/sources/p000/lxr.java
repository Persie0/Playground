package p000;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "com.google.android.libraries.vision.visionkit.f250.internal.airlock.room.BatchUploadUpdateDao", m18657c = "BatchUploadUpdateDao.kt", m18658d = "failPermanently$suspendImpl", m18659e = {55, 63})
final class lxr extends omf {

    /* JADX INFO: renamed from: a */
    /* synthetic */ Object f39527a;

    /* JADX INFO: renamed from: b */
    int f39528b;

    /* JADX INFO: renamed from: c */
    List f39529c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ lxu f39530d;

    /* JADX INFO: renamed from: e */
    lxu f39531e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lxr(lxs lxsVar, ols olsVar) {
        super(olsVar);
        this.f39530d = (lxu) lxsVar;
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        this.f39527a = obj;
        this.f39528b |= Integer.MIN_VALUE;
        return lxs.m16122b(this.f39530d, null, null, this);
    }
}
