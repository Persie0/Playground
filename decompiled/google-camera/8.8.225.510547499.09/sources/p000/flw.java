package p000;

import java.lang.ref.WeakReference;
import java.util.EnumSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class flw implements fly, fma {

    /* JADX INFO: renamed from: a */
    private static final nbh f22525a = nbh.m17259h("com/google/android/apps/camera/modemanager/ModeManagerImpl");

    /* JADX INFO: renamed from: b */
    private static final EnumSet f22526b = EnumSet.of(ikw.IMAX, ikw.LENS, ikw.LONG_EXPOSURE, ikw.PORTRAIT, ikw.REWIND, ikw.MOTION_BLUR, ikw.SLOW_MOTION, ikw.TIME_LAPSE, ikw.VIDEO, ikw.AMBER);

    /* JADX INFO: renamed from: c */
    private WeakReference f22527c = new WeakReference(null);

    @Override // p000.fma
    /* JADX INFO: renamed from: a */
    public final void mo8563a(icf icfVar) {
        synchronized (this) {
            this.f22527c = new WeakReference(icfVar);
        }
    }

    @Override // p000.fly
    /* JADX INFO: renamed from: b */
    public final boolean mo8564b(ikw ikwVar) {
        icf icfVar;
        lku.m15670x(f22526b.contains(ikwVar), "switchToMode %s is not supported; see JavaDoc comments");
        synchronized (this) {
            icfVar = (icf) this.f22527c.get();
        }
        if (icfVar != null) {
            return icfVar.mo11021t(ikwVar);
        }
        ((nbe) ((nbe) f22525a.m17252c()).mo17276G((char) 2369)).mo17293r("switchToMode has no ModeSwitchController, so NOT switching to %s", ikwVar);
        return false;
    }
}
