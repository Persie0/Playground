package p000;

import android.media.AudioRecord;
import android.os.Process;
import android.os.SystemClock;
import android.widget.TextView;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.apps.camera.app.silentfeedback.p004ip.TVkaNXnfP;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.legacy.lightcycle.p012ui.PhotoSphereMessageOverlay;
import com.google.android.libraries.vision.opengl.Texture;
import java.io.IOException;
import java.util.HashSet;
import p021j$.time.Instant;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bbt implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f2926a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Object f2927b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f2928c;

    public /* synthetic */ bbt(int i, Runnable runnable, int i2) {
        this.f2928c = i2;
        this.f2926a = i;
        this.f2927b = runnable;
    }

    public bbt(SystemForegroundService systemForegroundService, int i, int i2) {
        this.f2928c = i2;
        this.f2927b = systemForegroundService;
        this.f2926a = i;
    }

    public bbt(bnn bnnVar, int i, int i2) {
        this.f2928c = i2;
        this.f2927b = bnnVar;
        this.f2926a = i;
    }

    public bbt(bnq bnqVar, int i, int i2) {
        this.f2928c = i2;
        this.f2927b = bnqVar;
        this.f2926a = i;
    }

    public bbt(boh bohVar, int i, int i2) {
        this.f2928c = i2;
        this.f2927b = bohVar;
        this.f2926a = i;
    }

    public /* synthetic */ bbt(chg chgVar, int i, int i2) {
        this.f2928c = i2;
        this.f2927b = chgVar;
        this.f2926a = i;
    }

    public bbt(PhotoSphereMessageOverlay photoSphereMessageOverlay, int i, int i2) {
        this.f2928c = i2;
        this.f2927b = photoSphereMessageOverlay;
        this.f2926a = i;
    }

    public /* synthetic */ bbt(csv csvVar, int i, int i2) {
        this.f2928c = i2;
        this.f2927b = csvVar;
        this.f2926a = i;
    }

    public /* synthetic */ bbt(dah dahVar, int i, int i2) {
        this.f2928c = i2;
        this.f2927b = dahVar;
        this.f2926a = i;
    }

    public /* synthetic */ bbt(dlp dlpVar, int i, int i2) {
        this.f2928c = i2;
        this.f2927b = dlpVar;
        this.f2926a = i;
    }

    public bbt(dnm dnmVar, int i, int i2) {
        this.f2928c = i2;
        this.f2927b = dnmVar;
        this.f2926a = i;
    }

    public /* synthetic */ bbt(eja ejaVar, int i, int i2) {
        this.f2928c = i2;
        this.f2927b = ejaVar;
        this.f2926a = i;
    }

    public /* synthetic */ bbt(elv elvVar, int i, int i2) {
        this.f2928c = i2;
        this.f2927b = elvVar;
        this.f2926a = i;
    }

    public /* synthetic */ bbt(epr eprVar, int i, int i2) {
        this.f2928c = i2;
        this.f2927b = eprVar;
        this.f2926a = i;
    }

    public /* synthetic */ bbt(eqc eqcVar, int i, int i2) {
        this.f2928c = i2;
        this.f2927b = eqcVar;
        this.f2926a = i;
    }

    public /* synthetic */ bbt(ezi eziVar, int i, int i2) {
        this.f2928c = i2;
        this.f2927b = eziVar;
        this.f2926a = i;
    }

    public /* synthetic */ bbt(fpf fpfVar, int i, int i2) {
        this.f2928c = i2;
        this.f2927b = fpfVar;
        this.f2926a = i;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        nqf nqfVar;
        epr eprVar;
        switch (this.f2928c) {
            case 0:
                ((SystemForegroundService) this.f2927b).f1820c.cancel(this.f2926a);
                return;
            case 1:
                int i = this.f2926a;
                ?? r1 = this.f2927b;
                Process.setThreadPriority(i);
                r1.run();
                return;
            case 2:
                ((bnn) this.f2927b).f3888b.mo2769a(this.f2926a);
                return;
            case 3:
                ((bnq) this.f2927b).mo2718c().obtainMessage(502, this.f2926a, 0).sendToTarget();
                return;
            case 4:
                ((boh) this.f2927b).f3984a.mo2789a(this.f2926a);
                return;
            case 5:
                ((chg) this.f2927b).mo2771c(this.f2926a, "Acquiring semaphore");
                Thread.currentThread().interrupt();
                return;
            case 6:
                Object obj = this.f2927b;
                int i2 = this.f2926a;
                try {
                    ((chg) obj).m3676h();
                    return;
                } catch (InterruptedException e) {
                    chg chgVar = (chg) obj;
                    chgVar.f5730b.post(new bbt(chgVar, i2, 5));
                    return;
                }
            case 7:
                csv csvVar = (csv) this.f2927b;
                csvVar.m5479c(csvVar.f9391a.m5473a(this.f2926a));
                return;
            case 8:
                csv csvVar2 = (csv) this.f2927b;
                csvVar2.m5479c(csvVar2.f9391a.m5473a(this.f2926a));
                return;
            case 9:
                ((dah) this.f2927b).f10248a.set(this.f2926a, true);
                return;
            case 10:
                Object obj2 = this.f2927b;
                int i3 = this.f2926a;
                synchronized (obj2) {
                    z = !((dlp) obj2).f11975i.isEmpty();
                    break;
                }
                if (!z) {
                    dlp dlpVar = (dlp) obj2;
                    dlpVar.f11970d.mo13940b(TVkaNXnfP.EISQayNLNIxCVim + i3 + "): no shots in flight; stop watching.");
                    dlpVar.f11969c.set(false);
                    return;
                }
                dlp dlpVar2 = (dlp) obj2;
                dlpVar2.f11970d.mo13940b("watchdog (iteration " + i3 + "): checking for stuck shots.");
                Instant instant = dlpVar2.f11972f.instant();
                Instant instantMinus = instant.minus(dlpVar2.f11973g);
                HashSet<dln> hashSet = new HashSet();
                synchronized (obj2) {
                    for (dln dlnVar : ((dlp) obj2).f11975i.values()) {
                        if (!dlnVar.f11955b && dlnVar.f11956c.isBefore(instantMinus)) {
                            hashSet.add(dlnVar);
                        }
                    }
                    break;
                }
                for (dln dlnVar2 : hashSet) {
                    dlpVar2.f11970d.mo13940b(kfv.m14168E("marking shot %d as newly stuck", Long.valueOf(dlnVar2.f11954a)));
                    dlnVar2.mo6349h(instant);
                }
                int size = hashSet.size();
                if (size > 0) {
                    dlpVar2.f11970d.mo13947i(kfv.m14168E("Detected %d newly stuck shots", Integer.valueOf(size)));
                    dlpVar2.m6364l();
                }
                dlpVar2.m6363k(i3 + 1);
                return;
            case 11:
                dnl dnlVarM6435a = ((dnm) this.f2927b).m6435a(this.f2926a);
                synchronized (((dnm) this.f2927b).f12104a) {
                    Object obj3 = this.f2927b;
                    nqfVar = ((dnm) obj3).f12105b;
                    ((dnm) obj3).f12105b = null;
                    break;
                }
                nqfVar.getClass();
                nqfVar.mo14894e(dnlVarM6435a);
                return;
            case 12:
                Object obj4 = this.f2927b;
                final int i4 = this.f2926a;
                final eja ejaVar = (eja) obj4;
                ejaVar.f14253g.execute(new Runnable() { // from class: eix
                    /* JADX WARN: Code duplicated, block: B:39:0x00f4  */
                    /* JADX WARN: Code duplicated, block: B:41:0x00f8  */
                    /* JADX WARN: Code duplicated, block: B:43:0x0101  */
                    /* JADX WARN: Code duplicated, block: B:45:0x0107  */
                    /* JADX WARN: Code duplicated, block: B:46:0x010d  */
                    /* JADX WARN: Code duplicated, block: B:52:0x011e  */
                    @Override // java.lang.Runnable
                    public final void run() {
                        ekk ekkVar;
                        eli eliVar;
                        elf elfVar;
                        ell ellVar;
                        ekm ekmVar;
                        AudioRecord audioRecord;
                        eja ejaVar2 = ejaVar;
                        int i5 = i4;
                        if (ejaVar2.f14264r.compareAndSet(1, 2)) {
                            ejaVar2.f14232I.m7358b();
                            ejaVar2.f14256j.mo13961e("record#prepareToRecord");
                            eks eksVar = ejaVar2.f14248b;
                            boolean zBooleanValue = ((Boolean) ejaVar2.f14254h.mo3831be()).booleanValue();
                            String strM7358b = ejaVar2.f14232I.m7358b();
                            eksVar.f14503l.m7354b(new efd(eksVar, 18));
                            if (eksVar.f14496e == null) {
                                ((nbe) ((nbe) eks.f14492a.m17251b().mo17282g(nch.f41987a, "ImaxCaptureModule")).mo17276G((char) 1550)).mo17290o("No devicePoseManger");
                            } else {
                                ekq ekqVar = eksVar.f14494c;
                                if (zBooleanValue) {
                                    try {
                                        ekkVar = new ekk();
                                    } catch (IOException e2) {
                                        ((nbe) ((nbe) ((nbe) ekq.f14480a.m17251b()).mo17283h(e2)).mo17276G((char) 1549)).mo17293r("%s", e2.getMessage());
                                        ekkVar = null;
                                    }
                                } else {
                                    ekkVar = null;
                                }
                                elg elgVar = new elg(strM7358b, ekkVar != null ? 2 : 1);
                                ekqVar.f14484e = false;
                                if (ekkVar != null) {
                                    elf elfVar2 = new elf(ekkVar, elgVar);
                                    if (elfVar2.f14553b != ekkVar) {
                                        throw new IllegalArgumentException("The drainer does not use the same encoder as the recorder");
                                    }
                                    int minBufferSize = AudioRecord.getMinBufferSize(44100, 16, 2);
                                    try {
                                        audioRecord = new AudioRecord(5, 44100, 16, 2, minBufferSize + minBufferSize);
                                    } catch (IllegalArgumentException e3) {
                                        ((nbe) ((nbe) ((nbe) ekm.f14466a.m17251b()).mo17283h(e3)).mo17276G((char) 1543)).mo17293r("%s", e3.getMessage());
                                        audioRecord = null;
                                    }
                                    if (audioRecord == null || audioRecord.getState() != 1) {
                                        ((nbe) ((nbe) ekm.f14466a.m17251b()).mo17276G((char) 1542)).mo17290o("Audio recorder could not be initialized");
                                        audioRecord = null;
                                    }
                                    ekqVar.f14483d = !elfVar2.m7447b() ? null : new ekm(elfVar2, new ekn(ekkVar, audioRecord));
                                    if (ekqVar.f14483d != null) {
                                        eliVar = ekqVar.f14482c;
                                        if (eliVar != null) {
                                            elfVar = new elf(eliVar, elgVar);
                                            if (elfVar.f14553b == eliVar) {
                                                throw new IllegalArgumentException("The drainer does not use the same encoder as the recorder");
                                            }
                                            if (elfVar.m7447b()) {
                                                ellVar = new ell(eliVar, elfVar);
                                            } else {
                                                ellVar = null;
                                            }
                                            ekqVar.f14481b = ellVar;
                                            if (ekqVar.f14481b == null && (ekmVar = ekqVar.f14483d) != null) {
                                                ekmVar.m7415a();
                                                ekqVar.f14483d = null;
                                            }
                                        }
                                    }
                                } else {
                                    eliVar = ekqVar.f14482c;
                                    if (eliVar != null) {
                                        elfVar = new elf(eliVar, elgVar);
                                        if (elfVar.f14553b == eliVar) {
                                            throw new IllegalArgumentException("The drainer does not use the same encoder as the recorder");
                                        }
                                        if (elfVar.m7447b()) {
                                            ellVar = new ell(eliVar, elfVar);
                                        } else {
                                            ellVar = null;
                                        }
                                        ekqVar.f14481b = ellVar;
                                        if (ekqVar.f14481b == null) {
                                            ekmVar.m7415a();
                                            ekqVar.f14483d = null;
                                        }
                                    }
                                }
                            }
                            eju ejuVar = ejaVar2.f14261o;
                            Texture previewAsTexture = ejaVar2.f14248b.f14495d.getPreviewAsTexture();
                            ejh ejhVar = ejuVar.f14400k;
                            int i6 = ejuVar.f14392c;
                            int i7 = ejuVar.f14391b;
                            dhv dhvVar = ejhVar.f14326a;
                            dhw dhwVar = die.f11473a;
                            dhvVar.mo6175c();
                            ejl ejlVar = ejuVar.f14399j;
                            elt eltVar = ejlVar.f14339a;
                            if (eltVar != null) {
                                eltVar.m7473a();
                                ejlVar.f14339a = null;
                            }
                            ejlVar.f14339a = new elt();
                            elt eltVar2 = ejlVar.f14339a;
                            ejd ejdVar = ejlVar.f14340b;
                            int i8 = ejdVar.f14314j;
                            int i9 = ejdVar.f14315k;
                            float[] fArr = ejk.f14338a;
                            eltVar2.f14651b = previewAsTexture;
                            eltVar2.f14652c = 10497;
                            eltVar2.getClass();
                            eltVar2.m7475c(i8, i9);
                            eltVar2.f14650a = lle.m15690j(ejk.f14338a);
                            ejuVar.f14398i.f14319o = previewAsTexture;
                            ejaVar2.f14256j.mo13963g("record#startCapture");
                            eks eksVar2 = ejaVar2.f14248b;
                            eksVar2.f14493b.m7426b();
                            ekq ekqVar2 = eksVar2.f14494c;
                            ekm ekmVar2 = ekqVar2.f14483d;
                            if (ekmVar2 != null) {
                                ekn eknVar = ekmVar2.f14467b;
                                eknVar.f14470b = true;
                                eknVar.start();
                            }
                            ell ellVar2 = ekqVar2.f14481b;
                            if (ellVar2 != null) {
                                ellVar2.f14605f = true;
                            }
                            ekf ekfVar = eksVar2.f14495d;
                            eko ekoVar = eksVar2.f14499h;
                            float f = ekoVar.f14478d;
                            int i10 = ekoVar.f14477c;
                            boolean z2 = ekoVar.f14479e;
                            ekfVar.setMetaData(f, i10, false, i5, false);
                            eksVar2.f14495d.startCapture();
                            synchronized (eksVar2) {
                                eksVar2.f14497f = true;
                                eksVar2.f14502k = 0;
                                eksVar2.f14501j = 3.4028234663852886E38d;
                            }
                            ejaVar2.f14256j.mo13962f();
                            ejaVar2.f14265s.open();
                            if (ejaVar2.f14263q.get()) {
                                return;
                            }
                            eiw eiwVar = ejaVar2.f14252f;
                            eiwVar.f14208s = ejaVar2;
                            ehz ehzVar = eiwVar.f14191b;
                            ehzVar.f14118c = false;
                            ehzVar.f14117b = Double.NaN;
                            ehzVar.f14116a = Double.NaN;
                            eiwVar.f14198i = true;
                            eiwVar.m7374i(false);
                            eiwVar.f14193d = 0.0f;
                            ksa ksaVar = eiwVar.f14199j;
                            eiwVar.f14202m = SystemClock.elapsedRealtime();
                            eiwVar.f14200k = eiwVar.f14192c;
                            eiwVar.f14201l.m11499b();
                            eiwVar.f14194e.set(true);
                            ejaVar2.f14257k.mo11203K();
                            ejaVar2.f14264r.set(3);
                        }
                    }
                });
                return;
            case 13:
                ((eja) this.f2927b).m7389h(true, this.f2926a);
                return;
            case 14:
                Object obj5 = this.f2927b;
                int i5 = this.f2926a;
                synchronized (elv.f14672a) {
                    elw elwVar = ((elv) obj5).f14683l;
                    if (elwVar != null) {
                        elwVar.mo7508q(i5, ((elv) obj5).f14679h, ((elv) obj5).f14680i, ((elv) obj5).f14681j, ((elv) obj5).f14682k);
                    }
                    break;
                }
                return;
            case 15:
                Object obj6 = this.f2927b;
                int i6 = this.f2926a;
                epr eprVar2 = (epr) obj6;
                eprVar2.f15016e.mo3415bf(false);
                try {
                    ((epr) obj6).f15021j.mo13961e("MotionBlur#analyzeShot");
                    epy epyVar = ((epr) obj6).f15014c;
                    eqz eqzVar = ((epr) obj6).f15028q;
                    synchronized (epyVar.f15065b) {
                        long j = epyVar.f15067d;
                        if (j != 0) {
                            epyVar.f15066c.analyzeShot(j, i6, eqzVar.ordinal());
                            if (!((epr) obj6).f15024m.m7678c(i6, new bbt((epr) obj6, i6, 16))) {
                                eprVar = (epr) obj6;
                            }
                            eprVar2.f15021j.mo13962f();
                            eprVar2.f15016e.mo3415bf(true);
                            return;
                        }
                        ((nbe) ((nbe) epy.f15064a.m17252c()).mo17276G(1760)).mo17290o("analyzeShot(): processor hasn't been initialized.");
                        eprVar = (epr) obj6;
                    }
                    eprVar.m7637f(i6);
                    eprVar2.f15021j.mo13962f();
                    eprVar2.f15016e.mo3415bf(true);
                    return;
                } catch (Throwable th) {
                    eprVar2.f15021j.mo13962f();
                    eprVar2.f15016e.mo3415bf(true);
                    throw th;
                }
            case 16:
                Object obj7 = this.f2927b;
                int i7 = this.f2926a;
                epr eprVar3 = (epr) obj7;
                eprVar3.f15021j.mo13961e("MotionBlur#beginShot");
                if (!eprVar3.f15014c.m7664f(i7)) {
                    eprVar3.m7637f(i7);
                }
                eprVar3.f15021j.mo13962f();
                return;
            case 17:
                ((eqc) this.f2927b).f15101c.remove(Integer.valueOf(this.f2926a));
                return;
            case 18:
                TextView textView = (TextView) ((PhotoSphereMessageOverlay) this.f2927b).findViewById(C0100R.id.short_info_message);
                textView.setText(this.f2926a);
                textView.setVisibility(0);
                textView.announceForAccessibility(((PhotoSphereMessageOverlay) this.f2927b).getResources().getString(this.f2926a));
                return;
            case 19:
                ezi eziVar = (ezi) this.f2927b;
                if (this.f2926a == 1) {
                    eziVar.f21062r = true;
                    return;
                } else {
                    eziVar.f21062r = false;
                    return;
                }
            default:
                ((fpf) this.f2927b).f23038j.m5246r(this.f2926a);
                return;
        }
    }
}
