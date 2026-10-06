package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class cmk implements ciw {

    /* JADX INFO: renamed from: a */
    private final Executor f6224a;

    /* JADX INFO: renamed from: b */
    private final AtomicBoolean f6225b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h */
    public volatile nqf f6226h = nqf.m17621g();

    protected cmk(Executor executor) {
        this.f6224a = executor;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo3531a();

    @Override // p000.ciw
    /* JADX INFO: renamed from: bd */
    public final nps mo3538bd() {
        if (!this.f6225b.compareAndSet(false, true)) {
            return this.f6226h;
        }
        this.f6224a.execute(new cmd(this, 4));
        return this.f6226h;
    }

    @Override // p000.ciw
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String mo3539c() {
        return dez.m6039i(this);
    }
}
