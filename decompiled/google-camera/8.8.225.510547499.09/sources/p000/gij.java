package p000;

import com.google.android.apps.camera.jni.tracking.yRU.CswIK;
import com.google.android.apps.camera.smarts.ScBZ.IuyLAqNmW;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gij implements gib {

    /* JADX INFO: renamed from: a */
    private static final nbh f24891a = nbh.m17259h(CswIK.qeUHwIvXckDvB);

    /* JADX INFO: renamed from: c */
    public static final void m9291c(kfo kfoVar, boolean z) {
        try {
            kew kewVarMo14152a = kfoVar.mo14152a();
            ((kir) kewVarMo14152a).f36197c = 1;
            ((kir) kewVarMo14152a).f36199e = Integer.valueOf(true != z ? 0 : 2);
            kfoVar.mo14155d(((kir) kewVarMo14152a).m14365d()).get();
        } catch (InterruptedException | CancellationException | ExecutionException | kec e) {
            ((nbe) ((nbe) ((nbe) f24891a.m17251b()).mo17283h(e)).mo17276G((char) 2675)).mo17290o(IuyLAqNmW.THhggyhUI);
        }
    }

    @Override // p000.gib
    /* JADX INFO: renamed from: a */
    public final gia mo9273a(kfo kfoVar) {
        m9291c(kfoVar, true);
        return new gii(kfoVar);
    }

    @Override // p000.gib
    /* JADX INFO: renamed from: b */
    public final void mo9274b() {
    }
}
