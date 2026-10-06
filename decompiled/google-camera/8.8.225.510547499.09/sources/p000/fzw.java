package p000;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;
import p021j$.util.Collection$EL;
import p021j$.util.stream.Collectors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class fzw {

    /* JADX INFO: renamed from: a */
    public static final nbh f23998a = nbh.m17259h("com/google/android/apps/camera/one/lifecycle/CameraAsyncTaskRunner");

    /* JADX INFO: renamed from: b */
    public final Set f23999b;

    /* JADX INFO: renamed from: c */
    public final kbz f24000c;

    /* JADX INFO: renamed from: d */
    public final nqf f24001d;

    /* JADX INFO: renamed from: e */
    private final Executor f24002e;

    public fzw(Set set, nqf nqfVar, Executor executor, kbz kbzVar) {
        this.f23999b = set;
        this.f24000c = kbzVar;
        this.f24001d = nqfVar;
        this.f24002e = new kcf(executor, kbzVar, "CameraStarter");
    }

    /* JADX INFO: renamed from: a */
    public final nps m8986a() {
        this.f23999b.size();
        Collection$EL.stream(this.f23999b).map(egh.f13944j).collect(Collectors.joining(","));
        ArrayList arrayList = new ArrayList();
        this.f24000c.mo13961e("CameraStarter.start");
        for (ciw ciwVar : this.f23999b) {
            try {
                arrayList.add(nod.m17553i(ciwVar.mo3538bd(), new etx(ciwVar, 7), not.INSTANCE));
            } catch (Throwable th) {
                ((nbe) ((nbe) ((nbe) f23998a.m17251b()).mo17283h(th)).mo17276G((char) 2537)).mo17290o("Failed to run task");
                arrayList.add(kxk.m14964J(th));
            }
        }
        this.f24000c.mo13962f();
        long jCount = Collection$EL.stream(arrayList).map(egh.f13945k).filter(fjv.f22310d).count();
        nps npsVarM17553i = nod.m17553i(kxk.m14961G(arrayList), new etx(this.f24000c.mo13957a("CameraStarter.startAsync:" + jCount), 8), not.INSTANCE);
        jvh.m13562j(npsVarM17553i, new gjd(this, 1), this.f24002e);
        return npsVarM17553i;
    }
}
