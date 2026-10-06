package p000;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ggr implements hjk, fbp, faq {

    /* JADX INFO: renamed from: a */
    public final Context f24696a;

    /* JADX INFO: renamed from: b */
    public final fao f24697b;

    /* JADX INFO: renamed from: c */
    public final cie f24698c;

    /* JADX INFO: renamed from: d */
    public final jvd f24699d;

    /* JADX INFO: renamed from: e */
    private final Executor f24700e;

    /* JADX INFO: renamed from: f */
    private final kbz f24701f;

    public ggr(Context context, Executor executor, kbz kbzVar, fao faoVar, cie cieVar, jvd jvdVar) {
        this.f24696a = context;
        this.f24700e = executor;
        this.f24701f = kbzVar;
        this.f24697b = faoVar;
        this.f24698c = cieVar;
        this.f24699d = jvdVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m9225a() {
        this.f24700e.execute(this.f24701f.mo13959c("PhenotypeHelper#commitFlags", new fzz(this, 18)));
    }

    @Override // p000.faq
    /* JADX INFO: renamed from: b */
    public final void mo5928b() {
        m9225a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f24700e.execute(this.f24701f.mo13959c("PhenotypeHelper#retrieveFlags", new fzz(this, 17)));
    }
}
