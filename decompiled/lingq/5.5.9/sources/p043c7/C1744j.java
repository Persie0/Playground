package p043c7;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: c7.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1744j<TResult> extends AbstractC1737c<TResult> {

    /* JADX INFO: renamed from: b */
    public final InterfaceC1742h<TResult> f9599b;

    /* JADX INFO: renamed from: c7.j$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f9600a;

        public a(Object obj) {
            this.f9600a = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1744j.this.f9599b.mo5478a((TResult) this.f9600a);
        }
    }

    public C1744j(Executor executor, InterfaceC1742h interfaceC1742h) {
        super(executor);
        this.f9599b = interfaceC1742h;
    }

    @Override // p043c7.AbstractC1737c
    /* JADX INFO: renamed from: a */
    public final void mo5477a(TResult tresult) {
        this.f9586a.execute(new a(tresult));
    }
}
