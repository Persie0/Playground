package p000;

import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fsw implements fth {

    /* JADX INFO: renamed from: a */
    public static final nbh f23527a = nbh.m17259h("com/google/android/apps/camera/moments/TimeLimitedMomentsHdrPlusLauncher");

    /* JADX INFO: renamed from: b */
    public final Handler f23528b;

    /* JADX INFO: renamed from: c */
    private final fth f23529c;

    public fsw(fth fthVar, Handler handler) {
        this.f23529c = fthVar;
        this.f23528b = handler;
    }

    @Override // p000.fth
    /* JADX INFO: renamed from: a */
    public final int mo8694a() {
        this.f23529c.mo8694a();
        return 1;
    }

    @Override // p000.fth
    /* JADX INFO: renamed from: b */
    public final boolean mo8695b(key keyVar, gva gvaVar) {
        return true;
    }

    @Override // p000.fth
    /* JADX INFO: renamed from: c */
    public final void mo8696c(key keyVar, fua fuaVar, npk npkVar, ftg ftgVar) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Object obj = new Object();
        this.f23528b.postDelayed(new fro(atomicBoolean, ftgVar, 6), obj, 10000L);
        this.f23529c.mo8696c(keyVar, fuaVar, npkVar, new fsv(this, obj, atomicBoolean, ftgVar));
    }
}
