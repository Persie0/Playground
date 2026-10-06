package p000;

import android.hardware.camera2.CaptureResult;
import android.util.Pair;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gal extends kfv {

    /* JADX INFO: renamed from: a */
    private final kbg f24030a;

    public gal(kbg kbgVar) {
        this.f24030a = kbgVar;
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bu */
    public final void mo3408bu(kpp kppVar) {
        this.f24030a.mo3415bf(gam.m8996a((Float) kppVar.mo9517d(CaptureResult.LENS_FOCUS_DISTANCE), (Pair) kppVar.mo9517d(CaptureResult.LENS_FOCUS_RANGE)));
    }
}
