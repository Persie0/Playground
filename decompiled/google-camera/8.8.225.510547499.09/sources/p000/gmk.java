package p000;

import android.util.StringBuilderPrinter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class gmk implements cid {

    /* JADX INFO: renamed from: a */
    private static final nbh f25593a = nbh.m17259h("com/google/android/apps/camera/pixelcamerakit/onecamera/LoggingUncaughtExceptionListener");

    /* JADX INFO: renamed from: b */
    private final ikw f25594b;

    /* JADX INFO: renamed from: c */
    private final kfk f25595c;

    /* JADX INFO: renamed from: d */
    private final kmd f25596d;

    /* JADX INFO: renamed from: e */
    private final jwn f25597e;

    public gmk(ikw ikwVar, kfk kfkVar, kmd kmdVar, jwn jwnVar) {
        this.f25594b = ikwVar;
        this.f25595c = kfkVar;
        this.f25596d = kmdVar;
        this.f25597e = jwnVar;
    }

    @Override // p000.cid
    /* JADX INFO: renamed from: a */
    public final void mo3797a(Throwable th) {
        nbh nbhVar = f25593a;
        ((nbe) ((nbe) nbhVar.m17251b()).mo17276G(2982)).mo17293r("applicationMode=%s", this.f25594b);
        ((nbe) ((nbe) nbhVar.m17251b()).mo17276G((char) 2983)).mo17293r("facing=%s", this.f25596d.mo14558k());
        ((nbe) ((nbe) nbhVar.m17251b()).mo17276G((char) 2984)).mo17293r("currentZoom=%f", this.f25597e.mo3831be());
        StringBuilder sb = new StringBuilder();
        this.f25595c.mo13885a(new StringBuilderPrinter(sb));
        ((nbe) ((nbe) nbhVar.m17251b()).mo17276G((char) 2985)).mo17293r("%s", sb.toString().trim());
    }
}
