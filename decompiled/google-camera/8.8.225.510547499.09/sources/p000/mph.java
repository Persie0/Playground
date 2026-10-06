package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@omh(m18656b = "com.google.async.coroutines.MapConcurrentlyKt$mapConcurrently$2", m18657c = "MapConcurrently.kt", m18658d = "invokeSuspend", m18659e = {62})
public final class mph extends oml implements onm {

    /* JADX INFO: renamed from: a */
    int f41251a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ int f41252b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ our f41253c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ onm f41254d;

    /* JADX INFO: renamed from: e */
    private /* synthetic */ Object f41255e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mph(int i, our ourVar, onm onmVar, ols olsVar) {
        super(2, olsVar);
        this.f41252b = i;
        this.f41253c = ourVar;
        this.f41254d = onmVar;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((mph) mo562c((ous) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        Object[] objArr;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (this.f41251a) {
            case 0:
                lkm.m15592s(obj);
                ous ousVar = (ous) this.f41255e;
                oyt oytVar = new oyt(this.f41252b);
                int i = this.f41252b;
                objArr = new Object[i];
                for (int i2 = 0; i2 < i; i2++) {
                    objArr[i2] = mpi.f41256a;
                }
                ooh oohVar = new ooh();
                our ourVarM18778P = ook.m18778P(new oun(new mpd(this.f41253c, oytVar, this.f41254d, null), olz.f46282a), new mpe(null));
                mpg mpgVar = new mpg(objArr, this.f41252b, oohVar, ousVar, oytVar);
                this.f41255e = objArr;
                this.f41251a = 1;
                if (ourVarM18778P.mo16104da(mpgVar, this) == omaVar) {
                    return omaVar;
                }
                break;
            default:
                objArr = (Object[]) this.f41255e;
                lkm.m15592s(obj);
                break;
        }
        int length = objArr.length;
        for (int i3 = 0; i3 < length && objArr[i3] == mpi.f41256a; i3++) {
        }
        return oki.f46196a;
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: c */
    public final ols mo562c(Object obj, ols olsVar) {
        mph mphVar = new mph(this.f41252b, this.f41253c, this.f41254d, olsVar);
        mphVar.f41255e = obj;
        return mphVar;
    }
}
