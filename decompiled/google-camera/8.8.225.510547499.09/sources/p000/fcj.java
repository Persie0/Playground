package p000;

import com.google.android.apps.camera.brella.mediastore.p007hP.wUzNh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fcj implements fcq {

    /* JADX INFO: renamed from: a */
    private final nbh f21256a = nbh.m17259h("com/google/android/apps/camera/logging/LogcatCameraEventLogger");

    @Override // p000.fcq
    /* JADX INFO: renamed from: a */
    public final synchronized void mo4205a(nho nhoVar) {
        nbe nbeVar = (nbe) ((nbe) this.f21256a.m17252c()).mo17276G(2118);
        nhn nhnVarM17474b = nhn.m17474b(nhoVar.f42470d);
        if (nhnVarM17474b == null) {
            nhnVarM17474b = nhn.UNKNOWN_TYPE;
        }
        nbeVar.mo17293r("----------------------\nStart event: %s", nhnVarM17474b);
        for (String str : nhoVar.toString().split("\n", -1)) {
            ((nbe) ((nbe) this.f21256a.m17252c()).mo17276G(2120)).mo17293r("%s", str);
        }
        nbe nbeVar2 = (nbe) ((nbe) this.f21256a.m17252c()).mo17276G(2119);
        nhn nhnVarM17474b2 = nhn.m17474b(nhoVar.f42470d);
        if (nhnVarM17474b2 == null) {
            nhnVarM17474b2 = nhn.UNKNOWN_TYPE;
        }
        nbeVar2.mo17293r(wUzNh.iRclQ, nhnVarM17474b2);
    }
}
