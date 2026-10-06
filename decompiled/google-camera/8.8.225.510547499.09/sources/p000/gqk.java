package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gqk implements kao {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ gqm f26066a;

    public gqk(gqm gqmVar) {
        this.f26066a = gqmVar;
    }

    @Override // p000.kao
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo3483a(Object obj) {
        gqs gqsVar = (gqs) obj;
        gqm gqmVar = this.f26066a;
        synchronized (gqmVar.f26070d) {
            gqmVar.f26071e = false;
            jwf jwfVar = gqmVar.f26067a;
            jwfVar.mo3415bf(Long.valueOf(((Long) jwfVar.f34942d).longValue() - gqmVar.f26068b));
            gqmVar.m9648c();
        }
        gqsVar.mo7367e(this);
    }
}
