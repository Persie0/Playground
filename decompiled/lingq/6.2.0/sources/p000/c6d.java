package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class c6d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final long f9647a;

    /* JADX INFO: renamed from: b */
    public final long f9648b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qfa f9649c;

    public c6d(qfa qfaVar, long j, long j2) {
        Objects.requireNonNull(qfaVar);
        this.f9649c = qfaVar;
        this.f9647a = j;
        this.f9648b = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tic ticVar = ((kjc) ((s6d) this.f9649c.f57706b).f60774a).f47439g;
        kjc.m15280l(ticVar);
        ticVar.m22076M(new RunnableC3795yg(this, 11));
    }
}
