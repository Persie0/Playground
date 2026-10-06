package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gzs implements gzj, kba {

    /* JADX INFO: renamed from: a */
    public final kbg f26969a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ gzt f26970b;

    /* JADX INFO: renamed from: c */
    private final Executor f26971c;

    public gzs(gzt gztVar, kbg kbgVar, Executor executor) {
        this.f26970b = gztVar;
        this.f26969a = kbgVar;
        this.f26971c = executor;
    }

    @Override // p000.gzj
    /* JADX INFO: renamed from: a */
    public final void mo10012a(String str) {
        Object objMo10011c;
        if (!this.f26970b.f26973b.equals(str) || (objMo10011c = this.f26970b.mo10011c()) == null) {
            return;
        }
        this.f26971c.execute(new gqn(this, objMo10011c, 15));
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        this.f26970b.f26972a.mo10041h(this);
    }
}
