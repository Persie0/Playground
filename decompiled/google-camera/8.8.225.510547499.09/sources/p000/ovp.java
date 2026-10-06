package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@omh(m18656b = "kotlinx.coroutines.flow.SharedFlowImpl", m18657c = "SharedFlow.kt", m18658d = "collect$suspendImpl", m18659e = {373, 380, 383})
final class ovp extends omf {

    /* JADX INFO: renamed from: a */
    /* synthetic */ Object f46668a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ovq f46669b;

    /* JADX INFO: renamed from: c */
    int f46670c;

    /* JADX INFO: renamed from: d */
    ovq f46671d;

    /* JADX INFO: renamed from: e */
    ous f46672e;

    /* JADX INFO: renamed from: f */
    ovs f46673f;

    /* JADX INFO: renamed from: g */
    ory f46674g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovp(ovq ovqVar, ols olsVar) {
        super(olsVar);
        this.f46669b = ovqVar;
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        this.f46668a = obj;
        this.f46670c |= Integer.MIN_VALUE;
        return ovq.m19089d(this.f46669b, null, this);
    }
}
