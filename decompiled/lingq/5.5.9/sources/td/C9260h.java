package td;

/* JADX INFO: renamed from: td.h */
/* JADX INFO: loaded from: classes.dex */
public final class C9260h extends AbstractRunnableC9250a {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ServiceConnectionC9261i f47949b;

    public C9260h(ServiceConnectionC9261i serviceConnectionC9261i) {
        this.f47949b = serviceConnectionC9261i;
    }

    @Override // td.AbstractRunnableC9250a
    /* JADX INFO: renamed from: a */
    public final void mo16640a() {
        ServiceConnectionC9261i serviceConnectionC9261i = this.f47949b;
        C9262j c9262j = serviceConnectionC9261i.f47950a;
        c9262j.f47953b.m15814o("unlinkToDeath", new Object[0]);
        c9262j.f47965n.asBinder().unlinkToDeath(c9262j.f47962k, 0);
        C9262j c9262j2 = serviceConnectionC9261i.f47950a;
        c9262j2.f47965n = null;
        c9262j2.f47958g = false;
    }
}
