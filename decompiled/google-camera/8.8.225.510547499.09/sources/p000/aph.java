package p000;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1", m18657c = "CoroutinesRoom.kt", m18658d = "invokeSuspend", m18659e = {138})
final class aph extends oml implements onm {

    /* JADX INFO: renamed from: a */
    int f1997a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ apt f1998b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ ous f1999c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ String[] f2000d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ Callable f2001e;

    /* JADX INFO: renamed from: f */
    private /* synthetic */ Object f2002f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aph(apt aptVar, ous ousVar, String[] strArr, Callable callable, ols olsVar) {
        super(2, olsVar);
        this.f1998b = aptVar;
        this.f1999c = ousVar;
        this.f2000d = strArr;
        this.f2001e = callable;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((aph) mo562c((oqs) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (this.f1997a) {
            case 0:
                lkm.m15592s(obj);
                oqs oqsVar = (oqs) this.f2002f;
                otq otqVarM18752r = ooc.m18752r(-1, 0, 6);
                app appVar = new app(this.f2000d, otqVarM18752r);
                otqVarM18752r.mo19057s(oki.f46196a);
                aqb aqbVar = (aqb) oqsVar.mo18859cS().get(aqb.f2106c);
                oly olyVarM315d = aqbVar != null ? aqbVar.f2107a : ady.m315d(this.f1998b);
                otq otqVarM18752r2 = ooc.m18752r(0, 0, 7);
                ooc.m18746l(oqsVar, olyVarM315d, new apg(this.f1998b, appVar, otqVarM18752r, this.f2001e, otqVarM18752r2, null), 2);
                ous ousVar = this.f1999c;
                this.f1997a = 1;
                if (ook.m18780R(ousVar, otqVarM18752r2, this) == omaVar) {
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
        aph aphVar = new aph(this.f1998b, this.f1999c, this.f2000d, this.f2001e, olsVar);
        aphVar.f2002f = obj;
        return aphVar;
    }
}
