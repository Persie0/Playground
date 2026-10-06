package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", m18657c = "Distinct.kt", m18658d = "emit", m18659e = {81})
final class ouo extends omf {

    /* JADX INFO: renamed from: a */
    /* synthetic */ Object f46584a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ oup f46585b;

    /* JADX INFO: renamed from: c */
    int f46586c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ouo(oup oupVar, ols olsVar) {
        super(olsVar);
        this.f46585b = oupVar;
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        this.f46584a = obj;
        this.f46586c |= Integer.MIN_VALUE;
        return this.f46585b.mo16103a(null, this);
    }
}
