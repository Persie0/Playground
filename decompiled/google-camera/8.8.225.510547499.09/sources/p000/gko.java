package p000;

import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gko extends gku {

    /* JADX INFO: renamed from: a */
    private static final nbh f25330a = nbh.m17259h("com/google/android/apps/camera/pixelcamerakit/commands/PckZslBurstImageCaptureCommand");

    /* JADX INFO: renamed from: b */
    private final gjf f25331b;

    /* JADX INFO: renamed from: c */
    private final fzu f25332c;

    /* JADX INFO: renamed from: d */
    private final int f25333d;

    public gko(gjf gjfVar, gbi gbiVar, Set set, fzu fzuVar, int i, kbz kbzVar, gir girVar) {
        super(gjfVar, gbiVar, set, kbzVar, girVar);
        this.f25331b = gjfVar;
        this.f25332c = fzuVar;
        this.f25333d = i;
    }

    @Override // p000.gku
    /* JADX INFO: renamed from: d */
    protected final boolean mo9370d(List list, gbh gbhVar, glk glkVar) {
        try {
            fzt fztVarMo3604b = this.f25332c.mo3604b(glkVar);
            try {
                if (fztVarMo3604b == null) {
                    ((nbe) ((nbe) f25330a.m17251b()).mo17276G(2863)).mo17290o("Cannot acquire image saver session.");
                } else {
                    gbhVar.close();
                    int i = ((mzr) list).f41859c;
                    nba it = ((mws) list).iterator();
                    boolean z = false;
                    while (it.hasNext()) {
                        key keyVar = (key) it.next();
                        try {
                            Set<kgg> setMo16885b = this.f25331b.f24958b.mo16885b(Integer.valueOf(this.f25333d));
                            mwn mwnVarM17090e = mws.m17090e();
                            if (!setMo16885b.isEmpty()) {
                                try {
                                    kfv.m14171t(keyVar);
                                    for (kgg kggVar : setMo16885b) {
                                        kpw kpwVarMo7043d = keyVar.mo7043d(kggVar);
                                        if (kpwVarMo7043d != null) {
                                            kggVar.mo14193c();
                                            mwnVarM17090e.m17082g(new kpt(kpwVarMo7043d));
                                        }
                                    }
                                } catch (InterruptedException e) {
                                    ((nbe) ((nbe) gjf.f24957a.m17251b()).mo17276G((char) 2709)).mo17293r("Error retrieving the images from Frame %s", keyVar.mo7041b());
                                }
                            }
                            mws mwsVarM17081f = mwnVarM17090e.m17081f();
                            kpp kppVarMo7042c = keyVar.mo7042c();
                            if (!mwsVarM17081f.isEmpty() && kppVarMo7042c != null) {
                                fztVarMo3604b.mo3602a((kpw) mwsVarM17081f.get(0), kxk.m14965K(kppVarMo7042c));
                                z = true;
                            }
                            keyVar.close();
                        } catch (Throwable th) {
                            keyVar.close();
                            throw th;
                        }
                    }
                    if (z) {
                        fztVarMo3604b.close();
                        gbhVar.close();
                        m9387e(list);
                        return true;
                    }
                    ((nbe) ((nbe) f25330a.m17251b()).mo17276G(2862)).mo17290o("No images found.");
                    fztVarMo3604b.close();
                }
                gbhVar.close();
                m9387e(list);
                return false;
            } catch (Throwable th2) {
                if (fztVarMo3604b != null) {
                    try {
                        fztVarMo3604b.close();
                    } catch (Throwable th3) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                        } catch (Exception e2) {
                        }
                    }
                }
                throw th2;
            }
        } catch (Throwable th4) {
            gbhVar.close();
            m9387e(list);
            throw th4;
        }
    }
}
