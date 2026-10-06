package p000;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.hardware.SensorManager;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.BottomBarListener;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.cameravisionkit.olQ.BEeWZPor;
import com.google.android.apps.camera.legacy.lightcycle.p012ui.PhotoSphereMessageOverlay;
import com.google.android.apps.camera.legacy.lightcycle.storage.LocalSessionStorage;
import com.google.android.apps.camera.p014ui.views.MainActivityLayout;
import com.google.android.apps.lightcycle.panorama.LightCycleNative;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p021j$.nio.file.Paths;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class foc extends chw implements eai {

    /* JADX INFO: renamed from: V */
    private static boolean f22820V;

    /* JADX INFO: renamed from: b */
    public static final nbh f22821b = nbh.m17259h("com/google/android/apps/camera/modules/lightcycle/PanoramaModule");

    /* JADX INFO: renamed from: A */
    public final hwu f22822A;

    /* JADX INFO: renamed from: C */
    public final dzr f22824C;

    /* JADX INFO: renamed from: D */
    public final jww f22825D;

    /* JADX INFO: renamed from: E */
    public final Set f22826E;

    /* JADX INFO: renamed from: F */
    public final int f22827F;

    /* JADX INFO: renamed from: H */
    public Handler f22829H;

    /* JADX INFO: renamed from: I */
    public eaj f22830I;

    /* JADX INFO: renamed from: J */
    public DialogInterfaceC0155eg f22831J;

    /* JADX INFO: renamed from: K */
    public DialogInterfaceC0155eg f22832K;

    /* JADX INFO: renamed from: N */
    public int f22835N;

    /* JADX INFO: renamed from: O */
    public long f22836O;

    /* JADX INFO: renamed from: P */
    public int f22837P;

    /* JADX INFO: renamed from: R */
    public final dyy f22839R;

    /* JADX INFO: renamed from: S */
    public eyn f22840S;

    /* JADX INFO: renamed from: T */
    public final jfs f22841T;

    /* JADX INFO: renamed from: U */
    public final cwd f22842U;

    /* JADX INFO: renamed from: W */
    private final eyi f22843W;

    /* JADX INFO: renamed from: X */
    private final igb f22844X;

    /* JADX INFO: renamed from: Y */
    private final BottomBarListener f22845Y;

    /* JADX INFO: renamed from: Z */
    private final chu f22846Z;

    /* JADX INFO: renamed from: aa */
    private final jvd f22847aa;

    /* JADX INFO: renamed from: ab */
    private final Context f22848ab;

    /* JADX INFO: renamed from: ac */
    private final dhv f22849ac;

    /* JADX INFO: renamed from: ad */
    private View f22850ad;

    /* JADX INFO: renamed from: ae */
    private DisplayManager.DisplayListener f22851ae;

    /* JADX INFO: renamed from: af */
    private exv f22852af;

    /* JADX INFO: renamed from: ag */
    private PhotoSphereMessageOverlay f22853ag;

    /* JADX INFO: renamed from: ah */
    private final jwn f22854ah;

    /* JADX INFO: renamed from: ai */
    private final jwn f22855ai;

    /* JADX INFO: renamed from: aj */
    private jvb f22856aj;

    /* JADX INFO: renamed from: ak */
    private final ggl f22857ak;

    /* JADX INFO: renamed from: al */
    private final cpa f22858al;

    /* JADX INFO: renamed from: am */
    private HandlerThread f22859am;

    /* JADX INFO: renamed from: an */
    private final ieq f22860an;

    /* JADX INFO: renamed from: ao */
    private final kbg f22861ao;

    /* JADX INFO: renamed from: ap */
    private final eyp f22862ap;

    /* JADX INFO: renamed from: aq */
    private final eyp f22863aq;

    /* JADX INFO: renamed from: ar */
    private final eyp f22864ar;

    /* JADX INFO: renamed from: as */
    private final hbh f22865as;

    /* JADX INFO: renamed from: at */
    private final eoq f22866at;

    /* JADX INFO: renamed from: au */
    private final eop f22867au;

    /* JADX INFO: renamed from: av */
    private final Runnable f22868av;

    /* JADX INFO: renamed from: aw */
    private final Runnable f22869aw;

    /* JADX INFO: renamed from: ax */
    private final hmr f22870ax;

    /* JADX INFO: renamed from: ay */
    private nax f22871ay;

    /* JADX INFO: renamed from: c */
    public final gqv f22872c;

    /* JADX INFO: renamed from: d */
    public final gqq f22873d;

    /* JADX INFO: renamed from: e */
    public final hht f22874e;

    /* JADX INFO: renamed from: f */
    public final BottomBarController f22875f;

    /* JADX INFO: renamed from: g */
    public final igf f22876g;

    /* JADX INFO: renamed from: h */
    public exf f22877h;

    /* JADX INFO: renamed from: i */
    public ewt f22878i;

    /* JADX INFO: renamed from: j */
    public boolean f22879j;

    /* JADX INFO: renamed from: k */
    public boolean f22880k;

    /* JADX INFO: renamed from: l */
    public boolean f22881l;

    /* JADX INFO: renamed from: m */
    public LocalSessionStorage f22882m;

    /* JADX INFO: renamed from: n */
    public MainActivityLayout f22883n;

    /* JADX INFO: renamed from: q */
    public exp f22886q;

    /* JADX INFO: renamed from: r */
    public exm f22887r;

    /* JADX INFO: renamed from: s */
    public final chk f22888s;

    /* JADX INFO: renamed from: t */
    public final iey f22889t;

    /* JADX INFO: renamed from: u */
    public final fcp f22890u;

    /* JADX INFO: renamed from: v */
    public Thread f22891v;

    /* JADX INFO: renamed from: w */
    public int f22892w;

    /* JADX INFO: renamed from: x */
    public int f22893x;

    /* JADX INFO: renamed from: y */
    public int f22894y;

    /* JADX INFO: renamed from: z */
    public final gxa f22895z;

    /* JADX INFO: renamed from: Q */
    public int f22838Q = 1;

    /* JADX INFO: renamed from: o */
    public boolean f22884o = false;

    /* JADX INFO: renamed from: p */
    public int f22885p = 0;

    /* JADX INFO: renamed from: B */
    public final Handler f22823B = new foa(this);

    /* JADX INFO: renamed from: G */
    public boolean f22828G = false;

    /* JADX INFO: renamed from: L */
    public final DialogInterface.OnClickListener f22833L = new cdo(this, 12);

    /* JADX INFO: renamed from: M */
    public final View.OnTouchListener f22834M = new cln(this, 4);

    public foc(gxa gxaVar, chu chuVar, chk chkVar, iey ieyVar, hht hhtVar, dhv dhvVar, gqv gqvVar, gqq gqqVar, jfs jfsVar, jvb jvbVar, jvd jvdVar, jwn jwnVar, jwn jwnVar2, eoq eoqVar, hwu hwuVar, jfs jfsVar2, BottomBarController bottomBarController, igb igbVar, fcp fcpVar, dzr dzrVar, dyy dyyVar, ihk ihkVar, gyg gygVar, ggl gglVar, jww jwwVar, Set set, hmr hmrVar, kqj kqjVar, kbz kbzVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) throws Exception {
        ier ierVar = new ier(this);
        this.f22860an = ierVar;
        this.f22835N = 0;
        this.f22836O = 0L;
        fnw fnwVar = new fnw(this, 0);
        this.f22861ao = fnwVar;
        this.f22862ap = new fno(this, 4);
        this.f22863aq = new fno(this, 5);
        this.f22864ar = new fno(this, 6);
        this.f22837P = 2;
        fny fnyVar = new fny();
        this.f22865as = fnyVar;
        this.f22867au = new fnz(this, 0);
        this.f22868av = new fit(this, 17);
        this.f22869aw = new fit(this, 18);
        this.f22847aa = jvdVar;
        this.f22870ax = hmrVar;
        chuVar.getClass();
        chkVar.getClass();
        this.f22888s = chkVar;
        this.f22846Z = chuVar;
        this.f22889t = ieyVar;
        hhtVar.getClass();
        this.f22874e = hhtVar;
        dhvVar.getClass();
        this.f22849ac = dhvVar;
        gqvVar.getClass();
        this.f22872c = gqvVar;
        this.f22873d = gqqVar;
        eoqVar.getClass();
        this.f22866at = eoqVar;
        hwuVar.getClass();
        this.f22822A = hwuVar;
        this.f22841T = jfsVar2;
        this.f22855ai = jwnVar2;
        this.f22854ah = jwnVar;
        bottomBarController.getClass();
        this.f22875f = bottomBarController;
        igbVar.getClass();
        this.f22844X = igbVar;
        this.f22890u = fcpVar;
        this.f22824C = dzrVar;
        this.f22839R = dyyVar;
        this.f22857ak = gglVar;
        this.f22825D = jwwVar;
        this.f22826E = set;
        this.f22895z = gxaVar;
        this.f22827F = C0100R.style.Theme_Camera_MaterialAlertDialog;
        this.f22858al = new cpa(kbzVar, set);
        this.f22843W = new eyi(chuVar);
        fnyVar.m10086d(chkVar.mo3697k());
        jvbVar.m13537d(jwnVar.mo3830a(fnwVar, jvdVar));
        this.f22845Y = new fnn(this);
        this.f22876g = new fnp(this, hwuVar);
        cwd cwdVarMo3709w = chkVar.mo3709w();
        this.f22842U = cwdVarMo3709w;
        this.f22848ab = chkVar.mo3692f();
        try {
            exg.f20733a = new eyn(gxaVar, jfsVar, ihkVar, gygVar, chkVar.mo3695i(), kqjVar, null, null, null, null, null);
            this.f22840S = exg.f20733a;
            m8615F(false);
            chuVar.mo3680l();
            chkVar.mo3704r(ierVar, false);
            this.f22894y = ggi.m9211c(cwdVarMo3709w.m5650I());
            this.f22871ay = new nax();
            this.f22894y = ggi.m9211c(cwdVarMo3709w.m5650I());
            this.f22851ae = new fnq(this, 0);
            if (dhvVar.mo6184l(dib.f11305bL)) {
                jvbVar.m13537d(jwnVar2.mo3830a(new euz(this, 20), not.INSTANCE));
            }
        } catch (IOException e) {
            throw new IllegalStateException("Cannot instantiate PanoramaModule.", e);
        }
    }

    /* JADX INFO: renamed from: J */
    private final void m8606J() {
        m8608L(true);
    }

    /* JADX INFO: renamed from: K */
    private final void m8607K() {
        exm exmVar = this.f22887r;
        if (exmVar != null) {
            exmVar.m8008f();
        }
        this.f22843W.m8044d();
        nqf nqfVarM17621g = nqf.m17621g();
        Handler handler = this.f22829H;
        if (handler != null) {
            handler.post(new fnu(this, nqfVarM17621g));
        }
        try {
            nqfVarM17621g.get(500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ((nbe) ((nbe) f22821b.m17251b()).mo17276G((char) 2401)).mo17290o("Fail to wait freeGLMemory to finish");
        }
    }

    /* JADX INFO: renamed from: L */
    private final void m8608L(boolean z) {
        this.f22885p = 0;
        if (z) {
            this.f22869aw.run();
        } else {
            this.f22868av.run();
        }
        this.f22823B.postDelayed(new fit(this, 14), 1400L);
        this.f22881l = false;
        jwn jwnVar = this.f22854ah;
        if (jwnVar != null) {
            m8613D((String) ((jwf) jwnVar).f34942d);
        }
    }

    /* JADX INFO: renamed from: M */
    private final void m8609M() {
        this.f22884o = false;
        gqq gqqVar = this.f22873d;
        synchronized (gqqVar.f26081b) {
            gqqVar.f26080a.mo13940b(BEeWZPor.lkGNnGDJwnqOKfN + gqqVar.f26082c.size());
            if (gqqVar.f26084e) {
                gqqVar.f26084e = false;
                if (!gqqVar.f26082c.isEmpty()) {
                    gqqVar.m9650b();
                }
            }
        }
        exm exmVar = this.f22887r;
        if (exmVar != null) {
            exmVar.m8008f();
        }
        this.f22885p = 0;
        this.f22880k = false;
        m8608L(false);
        this.f22889t.mo11165i();
        if (this.f22888s.mo3693g() != null) {
            m8619w();
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m8610A() {
        this.f22823B.post(new fit(this, 15));
    }

    /* JADX INFO: renamed from: B */
    public final void m8611B() {
        if (this.f22879j) {
            if (this.f22838Q != 5) {
                m8622z();
                return;
            }
            Object obj = exh.f20734a;
            if (LightCycleNative.GetNumCapturedTargets() < LightCycleNative.GetNumTotalTargets()) {
                this.f22823B.post(new fit(this, 16));
            } else {
                m8622z();
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m8612C() {
        this.f22881l = true;
        this.f22822A.mo10784b();
    }

    /* JADX INFO: renamed from: D */
    public final void m8613D(String str) {
        if (!this.f5764a || this.f22881l) {
            return;
        }
        if (str.equals(this.f22848ab.getString(C0100R.string.pano_orientation_horizontal))) {
            if (this.f22838Q != 2) {
                this.f22838Q = 2;
                exm exmVar = this.f22887r;
                if (exmVar != null) {
                    exmVar.m8010h(2);
                }
                exp expVar = this.f22886q;
                if (expVar != null) {
                    expVar.m8022f(this.f22838Q);
                }
            }
        } else if (str.equals(this.f22848ab.getString(C0100R.string.pano_orientation_vertical))) {
            if (this.f22838Q != 3) {
                this.f22838Q = 3;
                exm exmVar2 = this.f22887r;
                if (exmVar2 != null) {
                    exmVar2.m8010h(3);
                }
                exp expVar2 = this.f22886q;
                if (expVar2 != null) {
                    expVar2.m8022f(this.f22838Q);
                }
            }
        } else if (str.equals(this.f22848ab.getString(C0100R.string.pano_orientation_wide))) {
            if (this.f22838Q != 4) {
                this.f22838Q = 4;
                exm exmVar3 = this.f22887r;
                if (exmVar3 != null) {
                    exmVar3.m8010h(4);
                }
                exp expVar3 = this.f22886q;
                if (expVar3 != null) {
                    expVar3.m8022f(this.f22838Q);
                }
            }
        } else if (str.equals(this.f22848ab.getString(C0100R.string.pano_orientation_fisheye))) {
            if (this.f22838Q != 5) {
                this.f22838Q = 5;
                exm exmVar4 = this.f22887r;
                if (exmVar4 != null) {
                    exmVar4.m8010h(5);
                }
                exp expVar4 = this.f22886q;
                if (expVar4 != null) {
                    expVar4.m8022f(this.f22838Q);
                }
            }
        } else if (str.equals(this.f22848ab.getString(C0100R.string.pano_orientation_photosphere)) && this.f22838Q != 1) {
            this.f22838Q = 1;
            exm exmVar5 = this.f22887r;
            if (exmVar5 != null) {
                exmVar5.m8010h(1);
            }
            exp expVar5 = this.f22886q;
            if (expVar5 != null) {
                expVar5.m8022f(this.f22838Q);
            }
        }
        LocalSessionStorage localSessionStorage = this.f22882m;
        if (localSessionStorage != null) {
            localSessionStorage.f6809j = this.f22838Q;
        }
    }

    /* JADX INFO: renamed from: E */
    public final synchronized void m8614E() {
        if (this.f5764a) {
            m8609M();
            m8617H();
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m8615F(boolean z) {
        this.f22888s.mo3693g().mo3720j(z);
        this.f22879j = z;
    }

    /* JADX INFO: renamed from: G */
    public final void m8616G() {
        m8609M();
        this.f22846Z.mo3677i();
        exm exmVar = this.f22887r;
        if (exmVar != null) {
            exmVar.f20784z.quitSafely();
            this.f22887r = null;
        }
        eaj eajVar = this.f22830I;
        if (eajVar != null) {
            eajVar.f13062i.post(new drs(eajVar, 14));
            this.f22830I = null;
        }
        LocalSessionStorage localSessionStorage = this.f22882m;
        if (localSessionStorage == null || localSessionStorage.f6804e == null) {
            return;
        }
        synchronized (this.f22826E) {
            this.f22826E.remove(this.f22882m.f6804e);
        }
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r9v2, types: [gwx, java.lang.Object] */
    /* JADX INFO: renamed from: H */
    public final void m8617H() {
        PackageInfo packageInfo;
        if (this.f22878i == null) {
            ((nbe) ((nbe) f22821b.m17252c()).mo17276G((char) 2404)).mo17290o("startCapture: camera device not open yet.");
            return;
        }
        if (this.f22880k) {
            m8609M();
        }
        this.f22885p = 0;
        this.f22889t.mo11165i();
        this.f22835N = 0;
        try {
            eyn eynVar = this.f22840S;
            long jCurrentTimeMillis = System.currentTimeMillis();
            gyn gynVarM14704f = eynVar.f20994g.m14704f(jCurrentTimeMillis, dzk.PHOTOSPHERE, "PHOTOSPHERE");
            String str = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date(jCurrentTimeMillis));
            File file = new File(eynVar.f20991d, "session_".concat(String.valueOf(str)));
            file.mkdirs();
            try {
                if (file.isDirectory()) {
                    for (String str2 : file.list()) {
                        new File(file, str2).delete();
                    }
                }
            } catch (Exception e) {
                ((nbe) ((nbe) eyn.f20988a.m17251b()).mo17276G((char) 2050)).mo17290o("Could not delete temporary images.");
            }
            LocalSessionStorage localSessionStorage = new LocalSessionStorage();
            localSessionStorage.f6800a = str;
            localSessionStorage.f6802c = eynVar.f20990c.getAbsolutePath();
            localSessionStorage.f6803d = eynVar.f20991d.getAbsolutePath();
            localSessionStorage.f6804e = file.getAbsolutePath();
            localSessionStorage.f6805f = Paths.get("panorama_sessions", "session_".concat(String.valueOf(str))).toString();
            String strM13084T = eynVar.f20996i.m13084T(jCurrentTimeMillis);
            gyr gyrVar = new gyr(eynVar.f20993f, localSessionStorage.f6805f, strM13084T);
            if (!gyrVar.m10001c()) {
                throw new IOException("Cannot create temporary session file.");
            }
            ihk ihkVar = eynVar.f20995h;
            cjr cjrVarMo8116b = eynVar.f20992e.mo8116b();
            ?? r9 = ihkVar.f30966a.get();
            gqq gqqVar = (gqq) ihkVar.f30967b.get();
            gqqVar.getClass();
            localSessionStorage.f6801b = new gxx(r9, gqqVar, gyrVar, strM13084T, cjrVarMo8116b, gynVarM14704f);
            String str3 = strM13084T + "." + krd.JPEG.f37022j;
            if (eynVar.m8050a() == null) {
                ((nbe) ((nbe) eyn.f20988a.m17251b()).mo17276G((char) 2051)).mo17290o("Could not get the thumbnail directory.");
                localSessionStorage.f6806g = "";
            } else {
                localSessionStorage.f6806g = new File(eynVar.m8050a(), str3).getAbsolutePath();
            }
            localSessionStorage.f6808i = new File(file, "orientations.txt").getAbsolutePath();
            localSessionStorage.f6807h = new File(file, "session.meta").getAbsolutePath();
            this.f22882m = localSessionStorage;
            synchronized (this.f22826E) {
                this.f22826E.add(this.f22882m.f6804e);
            }
            this.f22858al.m5218a(this.f22882m.f6803d);
            cpa cpaVar = this.f22858al;
            LocalSessionStorage localSessionStorage2 = this.f22882m;
            cpaVar.m5218a(localSessionStorage2.f6802c + localSessionStorage2.f6803d);
            LocalSessionStorage localSessionStorage3 = this.f22882m;
            String str4 = localSessionStorage3.f6807h;
            String str5 = localSessionStorage3.f6808i;
            String str6 = localSessionStorage3.f6804e;
            String str7 = localSessionStorage3.f6800a;
            String str8 = localSessionStorage3.f6806g;
            localSessionStorage3.f6809j = this.f22838Q;
            this.f22877h = new exf();
            exp expVar = new exp(this.f22848ab, this.f22852af, this.f22853ag, this.f22888s.mo3696j());
            this.f22886q = expVar;
            expVar.m8022f(this.f22838Q);
            eyi eyiVar = this.f22843W;
            Context context = this.f22848ab;
            if (!eyiVar.f20977n) {
                eyiVar.f20977n = true;
                chu chuVar = eyiVar.f20964a;
                eyiVar.f20974k = chuVar.mo3674f(chuVar.mo3673e()).mo2711a();
                eyiVar.f20965b = (SensorManager) context.getSystemService("sensor");
                eyiVar.f20978o = new eyh(eyiVar);
                eyiVar.f20978o.start();
                eyiVar.f20967d = false;
                eyiVar.m8042b();
                eyiVar.f20973j.m7012e();
            }
            exm exmVar = new exm(this.f22848ab, this.f22849ac, this.f22878i, this.f22843W, this.f22882m, this.f22877h, this.f22886q, this.f22888s.mo3695i(), this.f22842U, null, null, null);
            this.f22887r = exmVar;
            exmVar.f20745B = this.f22862ap;
            exmVar.f20778t = this.f22830I;
            exmVar.f20781w = this.f22863aq;
            exmVar.f20782x = this.f22864ar;
            Window windowMo3706t = this.f22888s.mo3706t();
            WindowManager.LayoutParams attributes = windowMo3706t.getAttributes();
            attributes.systemUiVisibility = 1;
            windowMo3706t.setAttributes(attributes);
            bon bonVarM7956a = this.f22878i.m7956a(this.f22842U.m5650I(), this.f22849ac, this.f22887r.f20752I, true);
            this.f22887r.m8009g();
            exm exmVar2 = this.f22887r;
            int iM2811b = bonVarM7956a.m2811b();
            int iM2810a = bonVarM7956a.m2810a();
            exp expVar2 = exmVar2.f20760b;
            expVar2.f20788A = iM2811b;
            expVar2.f20789B = iM2810a;
            exm exmVar3 = this.f22887r;
            int i = this.f22838Q;
            if (exmVar3.f20761c == null) {
                ((nbe) ((nbe) f22821b.m17252c()).mo17276G((char) 2402)).mo17290o("Can't setup LightCycleController for startPreview.");
                return;
            }
            if (exmVar3.m8004b() <= 0.0f) {
                i = 6;
            }
            bob bobVarMo2720e = exmVar3.f20761c.f20688b.mo2720e();
            ((bon) ((i == 1 || i == 6 || i == 5) ? ewu.m7957a(bobVarMo2720e) : ewu.m7957a(bobVarMo2720e)).f26334a).m2811b();
            exmVar3.f20760b.m8022f(i);
            exmVar3.m8010h(i);
            try {
                packageInfo = exmVar3.f20774p.getPackageManager().getPackageInfo(exmVar3.f20774p.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e2) {
                packageInfo = null;
            }
            if (packageInfo != null) {
                String str9 = packageInfo.versionName;
                Object obj = exh.f20734a;
                LightCycleNative.SetAppVersion(str9);
            }
            exmVar3.m8007e();
            this.f22878i.f20688b.m2775r(this.f22823B, new fnr(this, 0));
        } catch (IOException e3) {
            ((nbe) ((nbe) ((nbe) f22821b.m17251b()).mo17283h(e3)).mo17276G((char) 2403)).mo17290o("Cannot start capture, local session storage not ready.");
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m8618I() {
        Handler handler = this.f22829H;
        if (handler != null) {
            handler.sendEmptyMessage(3);
        }
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: bL */
    public final mrm mo3766bL() {
        return mrm.m16829i(new ihy(Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8), 1, mqu.f41450a, false));
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: bS */
    public final void mo3767bS(int i) {
        this.f22837P = i;
        exp expVar = this.f22886q;
        if (expVar == null) {
            return;
        }
        boolean z = i == 2;
        expVar.f20855s = z;
        expVar.f20856t = z || i == 1;
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: bV */
    public final void mo3770bV() {
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: d */
    public final void mo3774d(bnq bnqVar) {
        float fM7977a;
        this.f22878i = new ewt(bnqVar, this.f22823B);
        if (!f22820V) {
            bob bobVarMo2720e = bnqVar.mo2720e();
            new bon(0, 0);
            gtd gtdVarM7957a = ewu.m7957a(bobVarMo2720e);
            bon bonVar = new bon(((bon) gtdVarM7957a.f26335b).m2811b(), ((bon) gtdVarM7957a.f26335b).m2810a());
            if (bnqVar == null) {
                fM7977a = 0.0f;
            } else {
                gtd gtdVarM7957a2 = ewu.m7957a(bnqVar.mo2720e());
                boi boiVarMo2721f = bnqVar.mo2721f();
                boiVarMo2721f.m2798k(new bon(((bon) gtdVarM7957a2.f26334a).m2811b(), ((bon) gtdVarM7957a2.f26334a).m2810a()));
                boiVarMo2721f.m2799l(new bon(((bon) gtdVarM7957a2.f26335b).m2811b(), ((bon) gtdVarM7957a2.f26335b).m2810a()));
                bnqVar.mo2728m(boiVarMo2721f);
                fM7977a = exd.m7977a(bnqVar.mo2720e().f3975u);
            }
            int iM2811b = bonVar.m2811b();
            int iM2810a = bonVar.m2810a();
            synchronized (exh.f20734a) {
                LightCycleNative.Init(iM2811b, iM2810a, fM7977a, exh.f20737d);
                exh.f20735b = false;
            }
            f22820V = true;
        }
        if (this.f22830I != null) {
            m8617H();
            return;
        }
        ciq ciqVar = (ciq) this.f22888s.mo3693g();
        SurfaceTexture surfaceTexture = ciqVar.f5854t;
        if (surfaceTexture != null) {
            bnqVar.mo2729n();
            this.f22860an.onSurfaceTextureAvailable(surfaceTexture, ciqVar.f5855u, ciqVar.f5856v);
        }
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: e */
    public final void mo3775e(Configuration configuration) {
        int iM9211c = ggi.m9211c(this.f22842U.m5650I());
        this.f22894y = iM9211c;
        this.f22853ag.m4202b(iM9211c);
        m8619w();
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: l */
    public final void mo3778l() {
        jvh.m13562j(this.f22870ax.m10468a(), new cis(this, 18), this.f22847aa);
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: n */
    public final void mo3780n() {
        chk chkVar = this.f22888s;
        MainActivityLayout mainActivityLayout = ((ciq) chkVar.mo3693g()).f5840f;
        this.f22883n = mainActivityLayout;
        ViewGroup viewGroup = (ViewGroup) mainActivityLayout.findViewById(C0100R.id.module_layout);
        if (viewGroup.getChildCount() <= 0) {
            LayoutInflater.from(chkVar.mo3705s()).inflate(C0100R.layout.pano_module, viewGroup, true);
            PhotoSphereMessageOverlay photoSphereMessageOverlay = (PhotoSphereMessageOverlay) this.f22883n.findViewById(C0100R.id.photosphere_calibration_overlay);
            this.f22853ag = photoSphereMessageOverlay;
            photoSphereMessageOverlay.m4202b(this.f22894y);
            this.f22850ad = this.f22883n.findViewById(C0100R.id.flash_overlay);
        }
        jvb jvbVar = new jvb();
        this.f22856aj = jvbVar;
        jvbVar.m13537d(this.f22844X.mo11233e(this.f22876g));
        this.f22856aj.m13537d(this.f22822A.f29732d.mo3830a(new fnw(this, 1), not.INSTANCE));
        this.f22875f.addListener(this.f22845Y);
        this.f22888s.mo3704r(this.f22860an, false);
        this.f22846Z.mo3680l();
        m8621y();
        if (this.f22846Z.mo3673e() == -1) {
            m3776j();
            m3782q();
            mhs mhsVar = new mhs(this.f22888s.mo3705s(), this.f22827F);
            mhsVar.m16384l(C0100R.string.photosphere_no_back_camera);
            mhsVar.m16383k(false);
            mhsVar.m16389q(C0100R.string.f6536ok, new cdo(this, 13));
            mhsVar.mo7256b().show();
            return;
        }
        Process.setThreadPriority(-19);
        hlw hlwVarM13218w = jib.m13218w();
        eyn eynVar = this.f22840S;
        eynVar.f20989b = new File(hlwVarM13218w.m10453b());
        if (!eynVar.f20989b.exists() && !eynVar.f20989b.mkdirs()) {
            ((nbe) ((nbe) eyn.f20988a.m17251b()).mo17276G((char) 2055)).mo17290o("Panorama directory not created.");
        }
        ((DisplayManager) this.f22888s.mo3692f().getSystemService("display")).registerDisplayListener(this.f22851ae, null);
        this.f22852af = new exv();
        this.f22866at.m7597a(this.f22867au);
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: p */
    public final void mo3781p() {
        this.f22856aj.close();
        this.f22875f.removeListener(this.f22845Y);
        m8606J();
        ((DisplayManager) this.f22888s.mo3692f().getSystemService("display")).unregisterDisplayListener(this.f22851ae);
        m8616G();
        HandlerThread handlerThread = this.f22859am;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.f22859am = null;
            this.f22829H = null;
        }
        this.f22843W.m8044d();
        exf exfVar = this.f22877h;
        if (exfVar != null && !exfVar.isInterrupted()) {
            this.f22877h.interrupt();
        }
        this.f22823B.post(new fit(this, 20));
        this.f22878i = null;
        this.f22866at.m7598b(this.f22867au);
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: t */
    public final boolean mo3785t() {
        if (this.f22881l) {
            m8610A();
            return true;
        }
        this.f22822A.mo10787cd();
        return false;
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: v */
    public final boolean mo3787v() {
        return false;
    }

    /* JADX INFO: renamed from: w */
    public final void m8619w() {
        int i = this.f22885p;
        this.f22888s.mo3693g().mo3712b();
        if (i != 0) {
            this.f22857ak.mo9213a(foc.class);
        } else {
            this.f22857ak.mo9214b(foc.class);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m8620x() {
        m8615F(false);
        m8607K();
        if (this.f22877h.isInterrupted() || !this.f22877h.isAlive()) {
            this.f22823B.sendEmptyMessage(105);
        } else {
            this.f22877h.m7982a(new fno(this, 2));
        }
        m8606J();
        m8619w();
        synchronized (this.f22826E) {
            this.f22826E.remove(this.f22882m.f6804e);
        }
    }

    /* JADX INFO: renamed from: y */
    public final synchronized void m8621y() {
        if (this.f22859am == null) {
            HandlerThread handlerThread = new HandlerThread("PhotoSphereGLThread");
            this.f22859am = handlerThread;
            handlerThread.start();
            this.f22829H = new fob(this, this.f22859am.getLooper());
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m8622z() {
        exp expVar = this.f22886q;
        if (expVar != null && expVar.f20853q) {
            ((nbe) ((nbe) f22821b.m17252c()).mo17276G((char) 2396)).mo17290o("Not finishing capture since photo taking is in progress.");
            return;
        }
        this.f22874e.mo10316b(C0100R.raw.staged_shot_complete);
        m8619w();
        m8615F(false);
        Object obj = exh.f20734a;
        LightCycleNative.SetOutputResolutionLarge();
        nax naxVar = this.f22871ay;
        View view = this.f22850ad;
        Object obj2 = naxVar.f41919a;
        if (obj2 != null && ((ObjectAnimator) obj2).isRunning()) {
            ((ObjectAnimator) naxVar.f41919a).cancel();
        }
        naxVar.f41919a = ObjectAnimator.ofFloat(view, "alpha", 0.3f, 0.0f);
        ((ObjectAnimator) naxVar.f41919a).setDuration(300L);
        ((ObjectAnimator) naxVar.f41919a).addListener(new irv(naxVar, view, 1, null, null, null));
        ((ObjectAnimator) naxVar.f41919a).start();
        fnt fntVar = new fnt(this);
        this.f22891v = fntVar;
        fntVar.start();
        m8607K();
        this.f22877h.m7982a(new fno(this, 3));
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: c */
    public final String mo3773c() {
        int i;
        int i2 = this.f22838Q;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        switch (i3) {
            case 0:
                i = C0100R.string.photosphere_accessibility_peek;
                break;
            case 1:
                i = C0100R.string.horizontal_panorama_accessibility_peek;
                break;
            case 2:
                i = C0100R.string.vertical_panorama_accessibility_peek;
                break;
            case 3:
                i = C0100R.string.wide_angle_accessibility_peek;
                break;
            case 4:
                i = C0100R.string.fisheye_accessibility_peek;
                break;
            default:
                i = C0100R.string.media_accessibility_peek;
                break;
        }
        return this.f22888s.mo3692f().getResources().getString(i);
    }
}
