package p000;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "androidx.room.CoroutinesRoom$Companion$createFlow$1", m18657c = "CoroutinesRoom.kt", m18658d = "invokeSuspend", m18659e = {112})
public final class api extends oml implements onm {

    /* JADX INFO: renamed from: a */
    int f2003a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ apt f2004b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ String[] f2005c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ Callable f2006d;

    /* JADX INFO: renamed from: e */
    private /* synthetic */ Object f2007e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public api(apt aptVar, String[] strArr, Callable callable, ols olsVar) {
        super(2, olsVar);
        this.f2004b = aptVar;
        this.f2005c = strArr;
        this.f2006d = callable;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((api) mo562c((ous) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (this.f2003a) {
            case 0:
                lkm.m15592s(obj);
                aph aphVar = new aph(this.f2004b, (ous) this.f2007e, this.f2005c, this.f2006d, null);
                this.f2003a = 1;
                if (oqv.m18924e(aphVar, this) == omaVar) {
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
        api apiVar = new api(this.f2004b, this.f2005c, this.f2006d, olsVar);
        apiVar.f2007e = obj;
        return apiVar;
    }
}
