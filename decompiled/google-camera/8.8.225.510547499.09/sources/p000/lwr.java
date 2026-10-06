package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lwr implements ous {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ous f39452a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ oog f39453b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ lwv f39454c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ mau f39455d;

    public lwr(ous ousVar, oog oogVar, lwv lwvVar, mau mauVar) {
        this.f39452a = ousVar;
        this.f39453b = oogVar;
        this.f39454c = lwvVar;
        this.f39455d = mauVar;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000.ous
    /* JADX INFO: renamed from: a */
    public final Object mo16103a(Object obj, ols olsVar) {
        lwq lwqVar;
        ous ousVar;
        if (olsVar instanceof lwq) {
            lwqVar = (lwq) olsVar;
            int i = lwqVar.f39448b;
            if ((i & Integer.MIN_VALUE) != 0) {
                lwqVar.f39448b = i - Integer.MIN_VALUE;
            } else {
                lwqVar = new lwq(this, olsVar);
            }
        } else {
            lwqVar = new lwq(this, olsVar);
        }
        Object obj2 = lwqVar.f39447a;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (lwqVar.f39448b) {
            case 0:
                lkm.m15592s(obj2);
                ousVar = this.f39452a;
                oog oogVar = this.f39453b;
                if (oogVar.f46349a) {
                    oogVar.f46349a = false;
                    mav mavVar = this.f39454c.f39467a;
                    lvo lvoVarM16278d = mau.m16278d(this.f39455d);
                    lwqVar.f39451e = ousVar;
                    lwqVar.f39450d = obj;
                    lwqVar.f39448b = 1;
                    if (mavVar.m16285a(lvoVarM16278d, lwqVar) == omaVar) {
                        return omaVar;
                    }
                }
                lwqVar.f39451e = null;
                lwqVar.f39450d = null;
                lwqVar.f39448b = 2;
                if (ousVar.mo16103a(obj, lwqVar) == omaVar) {
                    return omaVar;
                }
                return oki.f46196a;
            case 1:
                obj = lwqVar.f39450d;
                ousVar = lwqVar.f39451e;
                lkm.m15592s(obj2);
                lwqVar.f39451e = null;
                lwqVar.f39450d = null;
                lwqVar.f39448b = 2;
                if (ousVar.mo16103a(obj, lwqVar) == omaVar) {
                    return omaVar;
                }
                return oki.f46196a;
            case 2:
                lkm.m15592s(obj2);
                return oki.f46196a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
