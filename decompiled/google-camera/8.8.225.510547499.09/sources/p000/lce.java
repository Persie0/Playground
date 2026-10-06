package p000;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lce implements Callable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ kyz f37911a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ lde f37912b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ lcf f37913c;

    public lce(lcf lcfVar, kyz kyzVar, lde ldeVar) {
        this.f37913c = lcfVar;
        this.f37911a = kyzVar;
        this.f37912b = ldeVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Exception {
        try {
            return this.f37911a.mo8768a(this.f37913c.mo15164c());
        } catch (Exception e) {
            throw e;
        } catch (Throwable th) {
            throw new Error(th);
        }
    }

    public final String toString() {
        return "withRawGLObject(" + this.f37913c.toString() + ", fn=" + this.f37912b.mo8767a() + ")";
    }
}
