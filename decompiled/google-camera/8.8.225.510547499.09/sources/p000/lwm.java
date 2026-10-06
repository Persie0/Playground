package p000;

import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "com.google.android.libraries.vision.visionkit.f250.helper.F250Compat$observeResources$job$1", m18657c = "F250Compat.kt", m18658d = "invokeSuspend", m18659e = {112})
public final class lwm extends oml implements onm {

    /* JADX INFO: renamed from: a */
    int f39437a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Set f39438b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ List f39439c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ lwj f39440d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ lwj f39441e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ mbb f39442f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lwm(mbb mbbVar, Set set, List list, lwj lwjVar, lwj lwjVar2, ols olsVar, byte[] bArr) {
        super(2, olsVar);
        this.f39442f = mbbVar;
        this.f39438b = set;
        this.f39439c = list;
        this.f39440d = lwjVar;
        this.f39441e = lwjVar2;
    }

    @Override // p000.onm
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo560a(Object obj, Object obj2) {
        return ((lwm) mo562c((oqs) obj, (ols) obj2)).mo561b(oki.f46196a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, lvg] */
    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (this.f39437a) {
            case 0:
                lkm.m15592s(obj);
                ovd ovdVar = new ovd(this.f39442f.f39761b.mo16092a(this.f39438b, this.f39439c), new lwk(this.f39440d, null), 2);
                lwl lwlVar = new lwl();
                this.f39437a = 1;
                if (ovdVar.mo16104da(lwlVar, this) == omaVar) {
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
        return new lwm(this.f39442f, this.f39438b, this.f39439c, this.f39440d, this.f39441e, olsVar, null);
    }
}
