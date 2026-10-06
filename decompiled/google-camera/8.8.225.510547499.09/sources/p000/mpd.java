package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "com.google.async.coroutines.MapConcurrentlyKt$mapConcurrently$2$1", m18657c = "MapConcurrently.kt", m18658d = "invokeSuspend", m18659e = {87})
final class mpd extends oml implements onm {

    /* JADX INFO: renamed from: a */
    int f41236a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ our f41237b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ onm f41238c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ oyt f41239d;

    /* JADX INFO: renamed from: e */
    private /* synthetic */ Object f41240e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mpd(our ourVar, oyt oytVar, onm onmVar, ols olsVar) {
        super(2, olsVar);
        this.f41237b = ourVar;
        this.f41239d = oytVar;
        this.f41238c = onmVar;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((mpd) mo562c((oub) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (this.f41236a) {
            case 0:
                lkm.m15592s(obj);
                oub oubVar = (oub) this.f41240e;
                our ourVar = this.f41237b;
                mpc mpcVar = new mpc(oubVar, this.f41239d, this.f41238c);
                this.f41236a = 1;
                if (ourVar.mo16104da(mpcVar, this) == omaVar) {
                    return omaVar;
                }
                break;
            default:
                lkm.m15592s(obj);
                break;
        }
        return oki.f46196a;
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: c */
    public final ols mo562c(Object obj, ols olsVar) {
        mpd mpdVar = new mpd(this.f41237b, this.f41239d, this.f41238c, olsVar);
        mpdVar.f41240e = obj;
        return mpdVar;
    }
}
