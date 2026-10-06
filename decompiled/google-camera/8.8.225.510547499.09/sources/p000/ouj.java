package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@omh(m18656b = "kotlinx.coroutines.flow.AbstractFlow", m18657c = "Flow.kt", m18658d = "collect", m18659e = {230})
final class ouj extends omf {

    /* JADX INFO: renamed from: a */
    /* synthetic */ Object f46574a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ouk f46575b;

    /* JADX INFO: renamed from: c */
    int f46576c;

    /* JADX INFO: renamed from: d */
    own f46577d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ouj(ouk oukVar, ols olsVar) {
        super(olsVar);
        this.f46575b = oukVar;
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        this.f46574a = obj;
        this.f46576c |= Integer.MIN_VALUE;
        return this.f46575b.mo16104da(null, this);
    }
}
