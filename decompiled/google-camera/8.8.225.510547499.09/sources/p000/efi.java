package p000;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class efi implements Runnable {

    /* JADX INFO: renamed from: a */
    public final kfk f13825a;

    /* JADX INFO: renamed from: b */
    public final kgg f13826b;

    /* JADX INFO: renamed from: c */
    private final jwn f13827c;

    /* JADX INFO: renamed from: d */
    private final jwn f13828d;

    /* JADX INFO: renamed from: e */
    private final jvb f13829e;

    /* JADX INFO: renamed from: f */
    private final Executor f13830f;

    public efi(kfk kfkVar, Map map, jwn jwnVar, jwn jwnVar2, jvb jvbVar, Executor executor) {
        this.f13825a = kfkVar;
        kgg kggVar = (kgg) map.get(gnf.RAW_ULTRAWIDE);
        kggVar.getClass();
        this.f13826b = kggVar;
        this.f13827c = jwnVar;
        this.f13828d = jwnVar2;
        this.f13829e = jvbVar;
        this.f13830f = executor;
    }

    /* JADX INFO: renamed from: a */
    private final void m7268a(jwn jwnVar, final boolean z, String str) {
        this.f13829e.m13537d(jwnVar.mo3830a(new kbg() { // from class: efh
            @Override // p000.kbg
            /* JADX INFO: renamed from: bf */
            public final void mo3415bf(Object obj) {
                efi efiVar = this.f13823a;
                if (((Boolean) obj).booleanValue() == z) {
                    nbz nbzVar = nch.f41987a;
                    efiVar.f13825a.mo14119f(efiVar.f13826b, false);
                }
            }
        }, this.f13830f));
    }

    @Override // java.lang.Runnable
    public final void run() {
        m7268a(this.f13827c, true, "standby");
        m7268a(this.f13828d, false, "delayed");
    }
}
