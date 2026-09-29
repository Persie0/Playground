package kotlinx.coroutines.scheduling;

import no.C7814a0;

/* JADX INFO: renamed from: kotlinx.coroutines.scheduling.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C7185i extends AbstractRunnableC7182f {

    /* JADX INFO: renamed from: c */
    public final Runnable f40481c;

    public C7185i(Runnable runnable, long j10, InterfaceC7183g interfaceC7183g) {
        super(j10, interfaceC7183g);
        this.f40481c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f40481c.run();
            InterfaceC7183g interfaceC7183g = this.f40479b;
        } finally {
            this.f40479b.mo14491a();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Task[");
        Runnable runnable = this.f40481c;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(C7814a0.m15551c(runnable));
        sb2.append(", ");
        sb2.append(this.f40478a);
        sb2.append(", ");
        sb2.append(this.f40479b);
        sb2.append(']');
        return sb2.toString();
    }
}
