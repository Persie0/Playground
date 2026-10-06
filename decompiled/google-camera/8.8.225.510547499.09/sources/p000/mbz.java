package p000;

import com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250Worker;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250Worker$uploadAllValidResources$latestUploads$2", m18657c = "F250Worker.kt", m18658d = "invokeSuspend", m18659e = {161})
public final class mbz extends oml implements onm {

    /* JADX INFO: renamed from: a */
    int f39905a;

    /* JADX INFO: renamed from: b */
    /* synthetic */ Object f39906b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ F250Worker f39907c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ mau f39908d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mbz(F250Worker f250Worker, mau mauVar, ols olsVar) {
        super(2, olsVar);
        this.f39907c = f250Worker;
        this.f39908d = mauVar;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((mbz) mo562c((lzc) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (this.f39905a) {
            case 0:
                lkm.m15592s(obj);
                lzc lzcVar = (lzc) this.f39906b;
                mdc mdcVar = this.f39907c.f7990i;
                mau mauVar = this.f39908d;
                this.f39905a = 1;
                obj = mdcVar.mo16328a(mauVar, lzcVar, this);
                return obj == omaVar ? omaVar : obj;
            default:
                lkm.m15592s(obj);
        }
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: c */
    public final ols mo562c(Object obj, ols olsVar) {
        mbz mbzVar = new mbz(this.f39907c, this.f39908d, olsVar);
        mbzVar.f39906b = obj;
        return mbzVar;
    }
}
