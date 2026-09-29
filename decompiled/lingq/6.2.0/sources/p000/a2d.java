package p000;

/* JADX INFO: loaded from: classes.dex */
public final class a2d extends ynb {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f145e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ v4d f146f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a2d(v4d v4dVar, kjc kjcVar, int i) {
        super(kjcVar);
        this.f145e = i;
        this.f146f = v4dVar;
    }

    @Override // p000.ynb
    /* JADX INFO: renamed from: a */
    public final void mo55a() {
        int i = this.f145e;
        v4d v4dVar = this.f146f;
        switch (i) {
            case 0:
                v4dVar.mo12359D();
                if (v4dVar.m23120U()) {
                    xcc xccVar = ((kjc) v4dVar.f60774a).f47438f;
                    kjc.m15280l(xccVar);
                    xccVar.f68076I.m17923a("Inactivity, disconnecting from the service");
                    v4dVar.m23111L();
                    break;
                }
                break;
            default:
                xcc xccVar2 = ((kjc) v4dVar.f60774a).f47438f;
                kjc.m15280l(xccVar2);
                xccVar2.f68083i.m17923a("Tasks have been queued for a long time");
                break;
        }
    }
}
