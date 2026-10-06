package p000;

import android.content.Context;
import androidx.lifecycle.SavedStateHandleController;
import java.io.File;
import p000.ako;
import p000.akq;
import p000.akv;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class abv {
    /* JADX INFO: renamed from: a */
    public static Context m163a(Context context) {
        return context.createDeviceProtectedStorageContext();
    }

    /* JADX INFO: renamed from: b */
    public static File m164b(Context context) {
        return context.getDataDir();
    }

    /* JADX INFO: renamed from: c */
    static boolean m165c(Context context) {
        return context.isDeviceProtectedStorage();
    }

    /* JADX INFO: renamed from: d */
    public static void m166d(alr alrVar, aqm aqmVar, aks aksVar) {
        Object obj;
        synchronized (alrVar.f661h) {
            obj = alrVar.f661h.get("androidx.lifecycle.savedstate.vm.tag");
        }
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
        if (savedStateHandleController == null || savedStateHandleController.f1524a) {
            return;
        }
        savedStateHandleController.m1463b(aqmVar, aksVar);
        m167e(aqmVar, aksVar);
    }

    /* JADX INFO: renamed from: e */
    public static void m167e(final aqm aqmVar, final aks aksVar) {
        akr akrVar = aksVar.f598a;
        if (akrVar == akr.f593b || akrVar.m872a(akr.f595d)) {
            aqmVar.m1860c(ako.class);
        } else {
            aksVar.m879a(new akt() { // from class: androidx.lifecycle.LegacySavedStateHandleController$1
                @Override // p000.akt
                /* JADX INFO: renamed from: a */
                public final void mo883a(akv akvVar, akq akqVar) {
                    if (akqVar == akq.ON_START) {
                        aksVar.m881c(this);
                        aqmVar.m1860c(ako.class);
                    }
                }
            });
        }
    }
}
