package p000;

import android.os.Handler;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class kkd implements nph {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ jvb f36328a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ kjo f36329b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ List f36330c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ kpj f36331d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ List f36332e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ List f36333f;

    /* JADX INFO: renamed from: g */
    final /* synthetic */ Handler f36334g;

    /* JADX INFO: renamed from: h */
    final /* synthetic */ Executor f36335h;

    /* JADX INFO: renamed from: i */
    final /* synthetic */ kkf f36336i;

    public kkd(kkf kkfVar, jvb jvbVar, kjo kjoVar, List list, kpj kpjVar, List list2, List list3, Handler handler, Executor executor) {
        this.f36336i = kkfVar;
        this.f36328a = jvbVar;
        this.f36329b = kjoVar;
        this.f36330c = list;
        this.f36331d = kpjVar;
        this.f36332e = list2;
        this.f36333f = list3;
        this.f36334g = handler;
        this.f36335h = executor;
    }

    @Override // p000.nph
    /* JADX INFO: renamed from: a */
    public final void mo3810a(Throwable th) {
        this.f36336i.f36343b.mo13948j("Failed to receive required outputs for " + String.valueOf(this.f36329b) + " " + this.f36330c.toString() + ".", th);
        this.f36329b.m14383b();
    }

    @Override // p000.nph
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo3811b(Object obj) {
        List list = (List) obj;
        if (this.f36328a.mo8995b()) {
            this.f36336i.f36343b.mo13944f("Refusing to create " + String.valueOf(this.f36329b) + " using " + String.valueOf(list) + ". Delayed streams were configured, but the session is now closed.");
            return;
        }
        if (list == null || list.isEmpty()) {
            this.f36336i.f36343b.mo13947i("Failed to receive required outputs for " + String.valueOf(this.f36329b) + " " + this.f36330c.toString() + ". The list of outputs was null or empty!");
            this.f36329b.m14383b();
            return;
        }
        this.f36336i.f36343b.mo13944f("Required outputs for " + String.valueOf(this.f36329b) + " " + this.f36330c.toString() + " are available.");
        kkf kkfVar = this.f36336i;
        kpj kpjVar = this.f36331d;
        kjo kjoVar = this.f36329b;
        mwn mwnVarM17090e = mws.m17090e();
        mwnVarM17090e.m17083h(this.f36332e);
        mwnVarM17090e.m17083h(this.f36330c);
        kkfVar.m14416b(kpjVar, kjoVar, mwnVarM17090e.m17081f(), this.f36333f, this.f36328a, this.f36334g, this.f36335h);
    }
}
