package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "androidx.room.RoomDatabaseKt$withTransaction$transactionBlock$1", m18657c = "RoomDatabaseExt.kt", m18658d = "invokeSuspend", m18659e = {62})
public final class apw extends oml implements onm {

    /* JADX INFO: renamed from: a */
    int f2084a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ apt f2085b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ oni f2086c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ Object f2087d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apw(apt aptVar, oni oniVar, ols olsVar) {
        super(2, olsVar);
        this.f2085b = aptVar;
        this.f2086c = oniVar;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((apw) mo562c((oqs) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) throws Throwable {
        aqb aqbVar;
        Object objMo1803a;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (this.f2084a) {
            case 0:
                lkm.m15592s(obj);
                olv olvVar = ((oqs) this.f2087d).mo18859cS().get(aqb.f2106c);
                olvVar.getClass();
                aqbVar = (aqb) olvVar;
                aqbVar.f2108b.incrementAndGet();
                try {
                    this.f2085b.m1825m();
                    try {
                        oni oniVar = this.f2086c;
                        this.f2087d = aqbVar;
                        this.f2084a = 1;
                        objMo1803a = oniVar.mo1803a(this);
                        if (objMo1803a == omaVar) {
                            return omaVar;
                        }
                        try {
                            this.f2085b.m1829q();
                            try {
                                this.f2085b.m1827o();
                                aqbVar.m1856a();
                                return objMo1803a;
                            } catch (Throwable th) {
                                th = th;
                                aqbVar.m1856a();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            this.f2085b.m1827o();
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        this.f2085b.m1827o();
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    aqbVar.m1856a();
                    throw th;
                }
            default:
                aqb aqbVar2 = (aqb) this.f2087d;
                try {
                    lkm.m15592s(obj);
                    objMo1803a = obj;
                    aqbVar = aqbVar2;
                    this.f2085b.m1829q();
                    this.f2085b.m1827o();
                    aqbVar.m1856a();
                    return objMo1803a;
                } catch (Throwable th5) {
                    th = th5;
                    aqbVar = aqbVar2;
                    this.f2085b.m1827o();
                    throw th;
                }
        }
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: c */
    public final ols mo562c(Object obj, ols olsVar) {
        apw apwVar = new apw(this.f2085b, this.f2086c, olsVar);
        apwVar.f2087d = obj;
        return apwVar;
    }
}
