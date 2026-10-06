package p000;

import android.preference.PreferenceManager;
import com.google.android.apps.camera.legacy.lightcycle.storage.LocalSessionStorage;
import com.google.android.apps.lightcycle.panorama.LightCycleNative;
import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eym extends Thread {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ LocalSessionStorage f20986a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ fya f20987b;

    public eym(LocalSessionStorage localSessionStorage, fya fyaVar, byte[] bArr) {
        this.f20986a = localSessionStorage;
        this.f20987b = fyaVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (!new File(this.f20986a.f6804e).exists()) {
            ((nbe) ((nbe) eyn.f20988a.m17251b()).mo17276G((char) 2054)).mo17290o("The storage directory does not exist.");
        }
        fya fyaVar = this.f20987b;
        foc focVar = (foc) fyaVar.f23857a;
        if (!focVar.f22828G) {
            eyb eybVar = new eyb((LocalSessionStorage) fyaVar.f23858b, focVar.f22890u, focVar.f22824C, focVar.f22839R);
            eybVar.mo7365c(new fnv(fyaVar, ((foc) fyaVar.f23857a).f22882m.f6804e, eybVar, null));
            ((foc) fyaVar.f23857a).f22872c.mo9647b(eybVar);
            return;
        }
        String str = ((LocalSessionStorage) fyaVar.f23858b).f6804e;
        Object obj = exh.f20734a;
        float fCalibrateFieldOfViewDeg = LightCycleNative.CalibrateFieldOfViewDeg(str);
        if (fCalibrateFieldOfViewDeg > 0.0f) {
            PreferenceManager.getDefaultSharedPreferences(((foc) fyaVar.f23857a).f22888s.mo3705s()).edit().putFloat("photoSphereCalibratedFieldOfView", fCalibrateFieldOfViewDeg).apply();
        }
    }
}
