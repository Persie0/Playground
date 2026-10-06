package p000;

import com.google.android.apps.camera.smarts.ScBZ.IuyLAqNmW;
import com.google.android.apps.camera.util.p015ui.mfv.EArqVBjecl;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import p021j$.nio.channels.DesugarChannels;
import p021j$.util.Collection$EL;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fro implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f23339a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f23340b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f23341c;

    public /* synthetic */ fro(bkn bknVar, gig gigVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f23341c = i;
        this.f23340b = bknVar;
        this.f23339a = gigVar;
    }

    public fro(epm epmVar, kay kayVar, int i, byte[] bArr) {
        this.f23341c = i;
        this.f23339a = epmVar;
        this.f23340b = kayVar;
    }

    public /* synthetic */ fro(frp frpVar, frt frtVar, int i) {
        this.f23341c = i;
        this.f23339a = frpVar;
        this.f23340b = frtVar;
    }

    public /* synthetic */ fro(frr frrVar, frv frvVar, int i) {
        this.f23341c = i;
        this.f23339a = frrVar;
        this.f23340b = frvVar;
    }

    public /* synthetic */ fro(frx frxVar, gyu gyuVar, int i) {
        this.f23341c = i;
        this.f23339a = frxVar;
        this.f23340b = gyuVar;
    }

    public /* synthetic */ fro(fsh fshVar, kpw kpwVar, int i) {
        this.f23341c = i;
        this.f23339a = fshVar;
        this.f23340b = kpwVar;
    }

    public /* synthetic */ fro(ftg ftgVar, kpw kpwVar, int i) {
        this.f23341c = i;
        this.f23339a = ftgVar;
        this.f23340b = kpwVar;
    }

    public /* synthetic */ fro(fyh fyhVar, ByteBuffer byteBuffer, int i) {
        this.f23341c = i;
        this.f23339a = fyhVar;
        this.f23340b = byteBuffer;
    }

    public /* synthetic */ fro(gaf gafVar, String str, int i) {
        this.f23341c = i;
        this.f23339a = gafVar;
        this.f23340b = str;
    }

    public /* synthetic */ fro(gbd gbdVar, gyh gyhVar, int i, byte[] bArr) {
        this.f23341c = i;
        this.f23339a = gbdVar;
        this.f23340b = gyhVar;
    }

    public /* synthetic */ fro(geo geoVar, gev gevVar, int i) {
        this.f23341c = i;
        this.f23339a = geoVar;
        this.f23340b = gevVar;
    }

    public fro(ggj ggjVar, kay kayVar, int i) {
        this.f23341c = i;
        this.f23339a = ggjVar;
        this.f23340b = kayVar;
    }

    public /* synthetic */ fro(gir girVar, gyh gyhVar, int i) {
        this.f23341c = i;
        this.f23339a = girVar;
        this.f23340b = gyhVar;
    }

    public /* synthetic */ fro(gke gkeVar, kbz kbzVar, int i) {
        this.f23341c = i;
        this.f23339a = gkeVar;
        this.f23340b = kbzVar;
    }

    public /* synthetic */ fro(glf glfVar, kiq kiqVar, int i) {
        this.f23341c = i;
        this.f23339a = glfVar;
        this.f23340b = kiqVar;
    }

    public /* synthetic */ fro(glo gloVar, String str, int i) {
        this.f23341c = i;
        this.f23339a = gloVar;
        this.f23340b = str;
    }

    public /* synthetic */ fro(gnm gnmVar, eem eemVar, int i) {
        this.f23341c = i;
        this.f23340b = gnmVar;
        this.f23339a = eemVar;
    }

    public /* synthetic */ fro(AtomicBoolean atomicBoolean, ftg ftgVar, int i) {
        this.f23341c = i;
        this.f23340b = atomicBoolean;
        this.f23339a = ftgVar;
    }

    public /* synthetic */ fro(jwn jwnVar, jwf jwfVar, int i) {
        this.f23341c = i;
        this.f23340b = jwnVar;
        this.f23339a = jwfVar;
    }

    public /* synthetic */ fro(oju ojuVar, ggs ggsVar, int i) {
        this.f23341c = i;
        this.f23340b = ojuVar;
        this.f23339a = ggsVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ftg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, kbg] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kpw] */
    /* JADX WARN: Type inference failed for: r1v55, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r1v65, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kpw] */
    /* JADX WARN: Type inference failed for: r2v23, types: [ftg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v39, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r3v38, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r3v45, types: [gyh, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        gqj gqjVar;
        boolean z;
        kbz kbzVar;
        boolean z2 = true;
        switch (this.f23341c) {
            case 0:
                Object obj = this.f23339a;
                Object obj2 = this.f23340b;
                synchronized (obj) {
                    Iterator it = ((frx) obj).f23381e.iterator();
                    while (it.hasNext()) {
                        frs frsVar = (frs) it.next();
                        if (frsVar.m8723d() && frsVar.m8720a().f23355c.equals(obj2)) {
                            it.remove();
                            ((frx) obj).m8741k();
                        }
                    }
                    ((frx) obj).m8734d();
                    throw new RuntimeException("Failed shot " + String.valueOf(obj2) + " was not present");
                }
                return;
            case 1:
                this.f23339a.mo8684c(this.f23340b);
                return;
            case 2:
                Object obj3 = this.f23339a;
                Object obj4 = this.f23340b;
                synchronized (((frp) obj3).f23343b) {
                    ((frp) obj3).f23343b.f23378b.mo13940b("Microvideo started at <" + (((Long) ((frt) obj4).f23351c.m17180i()).longValue() / 1000) + IuyLAqNmW.WaW);
                    ((frp) obj3).f23343b.m8732b((frt) obj4);
                    ((frp) obj3).f23343b.m8741k();
                    break;
                }
                return;
            case 3:
                Object obj5 = this.f23339a;
                Object obj6 = this.f23340b;
                synchronized (((frr) obj5).f23346b) {
                    ((frv) obj6).f23347a = false;
                    ((frr) obj5).f23346b.m8741k();
                    break;
                }
                return;
            case 4:
                Object obj7 = this.f23339a;
                Object obj8 = this.f23340b;
                synchronized (((frr) obj7).f23346b) {
                    ((frr) obj7).f23346b.f23381e.remove(obj8);
                    ((frr) obj7).f23346b.m8733c(((frv) obj8).f23358c);
                    ((frr) obj7).f23346b.m8741k();
                    break;
                }
                return;
            case 5:
                Object obj9 = this.f23339a;
                ?? r1 = this.f23340b;
                synchronized (((fsh) obj9).f23459a) {
                    ((fsh) obj9).f23459a.f23464e.mo13940b("DBG writing image " + r1.mo7248d());
                    fsi fsiVar = ((fsh) obj9).f23459a;
                    if (!fsiVar.f23466g) {
                        fsiVar.f23465f.addLast(r1);
                        ((fsh) obj9).f23459a.m8778c();
                        return;
                    }
                    fsiVar.f23464e.mo13947i("Image sink closed but still received frame at " + r1.mo7248d());
                    r1.close();
                    return;
                }
            case 6:
                Object obj10 = this.f23340b;
                ?? r2 = this.f23339a;
                if (((AtomicBoolean) obj10).getAndSet(true)) {
                    return;
                }
                r2.mo8683b(new TimeoutException("HDR+ timed out after 10000 ms"));
                return;
            case 7:
                Object obj11 = this.f23339a;
                Object obj12 = this.f23340b;
                try {
                    FileOutputStream fileOutputStreamMo14685e = ((fyh) obj11).f23902b.mo14685e();
                    try {
                        FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileOutputStreamMo14685e.getChannel());
                        try {
                            long jWrite = fileChannelConvertMaybeLegacyFileChannelFromLibrary.write((ByteBuffer) obj12);
                            fileOutputStreamMo14685e.flush();
                            if (fileChannelConvertMaybeLegacyFileChannelFromLibrary != null) {
                                fileChannelConvertMaybeLegacyFileChannelFromLibrary.close();
                            }
                            fileOutputStreamMo14685e.close();
                            if (jWrite > 0) {
                                ((fyh) obj11).f23902b.mo14687g();
                            } else {
                                ((fyh) obj11).f23902b.mo14686f();
                            }
                            gqjVar = ((fyh) obj11).f23901a;
                        } catch (Throwable th) {
                            if (fileChannelConvertMaybeLegacyFileChannelFromLibrary != null) {
                                try {
                                    fileChannelConvertMaybeLegacyFileChannelFromLibrary.close();
                                } catch (Throwable th2) {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                }
                                break;
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            fileOutputStreamMo14685e.close();
                            break;
                        } catch (Throwable th4) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                        }
                        throw th3;
                    }
                } catch (IOException e) {
                    fyh fyhVar = (fyh) obj11;
                    fyhVar.f23902b.mo14686f();
                    gqjVar = fyhVar.f23901a;
                } catch (Throwable th5) {
                    fyh fyhVar2 = (fyh) obj11;
                    fyhVar2.f23902b.mo14686f();
                    fyhVar2.f23901a.mo9642h();
                    throw th5;
                }
                gqjVar.mo9642h();
                return;
            case 8:
                Object obj13 = this.f23339a;
                Object obj14 = this.f23340b;
                gaf gafVar = (gaf) obj13;
                Set<kmg> setMo14533B = gafVar.f24023d.mo14533B();
                if (setMo14533B == null || setMo14533B.isEmpty()) {
                    ((nbe) ((nbe) gaf.f24020a.m17252c()).mo17276G((char) 2542)).mo17290o("physical cameraID list is empty");
                    return;
                }
                kmg kmgVar = null;
                for (kmg kmgVar2 : setMo14533B) {
                    if (true == ((String) obj14).equals(kmgVar2.f36540a)) {
                        kmgVar = kmgVar2;
                    }
                }
                if (kmgVar == null) {
                    ((nbe) ((nbe) gaf.f24020a.m17252c()).mo17276G((char) 2544)).mo17293r("active id(%s) is not in list", obj14);
                    return;
                }
                int iMo14553f = gafVar.f24022c.mo13854a(kmgVar).mo14553f();
                if (iMo14553f != ((Integer) gafVar.f24021b.mo3831be()).intValue()) {
                    gafVar.f24021b.mo3831be();
                    gafVar.f24021b.mo3415bf(Integer.valueOf(iMo14553f));
                    return;
                }
                return;
            case 9:
                Object obj15 = this.f23339a;
                Object obj16 = this.f23340b;
                Object obj17 = ((gbd) obj15).f24086a;
                synchronized (obj17) {
                    boolean zRemove = ((HashSet) ((jwl) obj17).f34955b).remove(obj16);
                    z = zRemove && ((HashSet) ((jwl) obj17).f34955b).isEmpty();
                    if (!zRemove || !((jwl) obj17).m13628d()) {
                        z2 = false;
                    }
                    break;
                }
                if (z) {
                    jwl jwlVar = (jwl) obj17;
                    jwlVar.f34957d.mo13961e("#notifyPipelinePaused");
                    Iterator it2 = jwlVar.m13625a().iterator();
                    while (it2.hasNext()) {
                        ((gyq) it2.next()).mo9547b();
                    }
                    jwlVar.f34957d.mo13962f();
                }
                if (z2) {
                    ((jwl) obj17).m13627c();
                    return;
                }
                return;
            case 10:
                ((geo) this.f23339a).mo9113M();
                return;
            case 11:
                ((ggj) this.f23339a).f24674b.mo3415bf(this.f23340b);
                return;
            case 12:
                ((epm) this.f23339a).f14997c.mo3415bf(this.f23340b);
                return;
            case 13:
                this.f23340b.mo3830a(new gcu((jwf) this.f23339a, 18), not.INSTANCE);
                return;
            case 14:
                ((ggs) ((bkn) this.f23340b).f3651a).m9231o((kfv) this.f23339a);
                return;
            case 15:
                Object obj18 = this.f23339a;
                ?? r3 = this.f23340b;
                gir girVar = (gir) obj18;
                girVar.f24913c.mo13961e("AfDebugFetch#request");
                try {
                    try {
                        kfo kfoVarMo14117d = ((gir) obj18).f24912b.mo14117d();
                        try {
                            gir.m9292c(kfoVarMo14117d, r3);
                            kfoVarMo14117d.close();
                            kbzVar = girVar.f24913c;
                        } catch (Throwable th6) {
                            try {
                                kfoVarMo14117d.close();
                                break;
                            } catch (Throwable th7) {
                                try {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th6, th7);
                                    break;
                                } catch (Exception e2) {
                                }
                            }
                            throw th6;
                        }
                    } catch (Throwable th8) {
                        girVar.f24913c.mo13962f();
                        throw th8;
                    }
                } catch (InterruptedException | kec e3) {
                    ((nbe) ((nbe) ((nbe) gir.f24911a.m17251b()).mo17283h(e3)).mo17276G(2684)).mo17290o("Error submitting 3A debug metadata request.");
                    kbzVar = girVar.f24913c;
                }
                kbzVar.mo13962f();
                return;
            case 16:
                Object obj19 = this.f23339a;
                ?? r4 = this.f23340b;
                r4.mo13961e("Shasta_ringBuffer#getFilteredFrames");
                try {
                    try {
                        ((gke) obj19).f25249c.size();
                        mws mwsVarMo9309g = ((gke) obj19).f25248b.mo9309g(((gke) obj19).f25249c);
                        int i = ((mzr) mwsVarMo9309g).f41859c;
                        synchronized (((gke) obj19).f25247a) {
                            try {
                                if (((gke) obj19).f25247a.isCancelled()) {
                                    ((nbe) ((nbe) gkf.f25251a.m17252c()).mo17276G(2792)).mo17290o("Cancelled shot, closing filtered frames.");
                                    nba it3 = mwsVarMo9309g.iterator();
                                    while (it3.hasNext()) {
                                        ((key) it3.next()).close();
                                    }
                                } else {
                                    ((gke) obj19).f25247a.mo14894e(mwsVarMo9309g);
                                }
                            } catch (Throwable th9) {
                                throw th9;
                            }
                            break;
                        }
                    } catch (InterruptedException e4) {
                        ((nbe) ((nbe) ((nbe) gkf.f25251a.m17251b()).mo17283h(e4)).mo17276G(2793)).mo17290o(EArqVBjecl.cBIWqTzWqKPxo);
                        synchronized (((gke) obj19).f25247a) {
                            ((gke) obj19).f25247a.mo14894e(new ArrayList());
                        }
                    }
                    r4.mo13962f();
                    return;
                } catch (Throwable th10) {
                    r4.mo13962f();
                    throw th10;
                }
            case 17:
                Object obj20 = this.f23339a;
                Object obj21 = this.f23340b;
                synchronized (obj20) {
                    Collection$EL.forEach(mxk.m17134F(((glf) obj20).f25468a), new fvi((kiq) obj21, 17));
                    break;
                }
                return;
            case 18:
                ((glo) this.f23339a).f25518a.mo3415bf(this.f23340b);
                return;
            case 19:
                Object obj22 = this.f23340b;
                Object obj23 = this.f23339a;
                Set set = ((ohm) obj22).get();
                set.size();
                ((ggs) obj23).m9230n(kfi.m14107b(set));
                return;
            default:
                ((eem) this.f23339a).f13675v.f25502c.mo9888T(((gnm) this.f23340b).f25758g);
                return;
        }
    }
}
