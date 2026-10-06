package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class gzt implements jww {

    /* JADX INFO: renamed from: a */
    protected final had f26972a;

    /* JADX INFO: renamed from: b */
    protected final String f26973b;

    public gzt(had hadVar, String str) {
        this.f26972a = hadVar;
        this.f26973b = str;
    }

    @Override // p000.jwn
    /* JADX INFO: renamed from: a */
    public final kba mo3830a(kbg kbgVar, Executor executor) {
        kbgVar.getClass();
        executor.getClass();
        gzs gzsVar = new gzs(this, kbgVar, executor);
        this.f26972a.mo10039f(gzsVar);
        gzsVar.mo10012a(this.f26973b);
        return gzsVar;
    }

    @Override // p000.jwn
    /* JADX INFO: renamed from: be */
    public final Object mo3831be() {
        Object objMo10011c = mo10011c();
        if (objMo10011c != null) {
            return objMo10011c;
        }
        throw new NullPointerException("Null value for setting: ".concat(this.f26973b));
    }

    /* JADX INFO: renamed from: c */
    protected abstract Object mo10011c();
}
