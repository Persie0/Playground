package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oqb extends osa {

    /* JADX INFO: renamed from: a */
    public final opy f46414a;

    public oqb(opy opyVar) {
        this.f46414a = opyVar;
    }

    @Override // p000.oni
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo1803a(Object obj) {
        mo18901b((Throwable) obj);
        return oki.f46196a;
    }

    @Override // p000.oqi
    /* JADX INFO: renamed from: b */
    public final void mo18901b(Throwable th) {
        opy opyVar = this.f46414a;
        osg osgVarM18982e = m18982e();
        osgVarM18982e.getClass();
        CancellationException cancellationExceptionMo18975o = osgVarM18982e.mo18975o();
        if (opyVar.m18899y()) {
            oxf oxfVar = (oxf) opyVar.f46406a;
            opn opnVar = oxfVar.f46769e;
            while (true) {
                Object obj = opnVar.f46397a;
                if (ooc.m18737c(obj, oxg.f46771b)) {
                    if (oxfVar.f46769e.m18856d(oxg.f46771b, cancellationExceptionMo18975o)) {
                        return;
                    }
                } else if (obj instanceof Throwable) {
                    return;
                } else {
                    if (oxfVar.f46769e.m18856d(obj, null)) {
                    }
                }
            }
        }
        opyVar.mo18876k(cancellationExceptionMo18975o);
        opyVar.m18897w();
    }
}
