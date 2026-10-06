package p000;

import com.google.android.apps.camera.p014ui.captureframe.Tjcw.gBCSQzBeB;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gnk {

    /* JADX INFO: renamed from: a */
    private static final nbh f25746a = nbh.m17259h("com/google/android/apps/camera/pixelcamerakit/payloadprocessor/HdrPlusPayloadUtils");

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, key] */
    /* JADX INFO: renamed from: a */
    public static kpp m9556a(gmc gmcVar, boolean z) {
        String str;
        kpp kppVarMo7042c = gmcVar.f25581a.mo7042c();
        if (kppVarMo7042c == null) {
            ((nbe) ((nbe) f25746a.m17252c()).mo17276G((char) 3040)).mo17290o(gBCSQzBeB.ywDDoXFW);
            return null;
        }
        if (!gmcVar.m9499h()) {
            return kppVarMo7042c;
        }
        if (z) {
            str = gmcVar.m9492a().mo14193c().f36540a;
        } else {
            kgg kggVarM9493b = gmcVar.m9493b();
            if (kggVarM9493b == null) {
                return null;
            }
            str = kggVarM9493b.mo14193c().f36540a;
        }
        return m9557b(kppVarMo7042c, str);
    }

    /* JADX INFO: renamed from: b */
    public static kpp m9557b(kpp kppVar, String str) {
        Map mapMo9520g = kppVar.mo9520g();
        if (mapMo9520g.isEmpty()) {
            return kppVar;
        }
        kpl kplVar = (kpl) mapMo9520g.get(str);
        if (kplVar != null) {
            return new kpo(kplVar);
        }
        ((nbe) ((nbe) f25746a.m17252c()).mo17276G((char) 3041)).mo17293r("Physical metadata is null for images from camera %s", str);
        return kppVar;
    }
}
