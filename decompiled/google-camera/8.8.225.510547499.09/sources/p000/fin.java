package p000;

import android.hardware.HardwareBuffer;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import com.google.android.libraries.oliveoil.p018gl.EGLImage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fin implements fid {

    /* JADX INFO: renamed from: b */
    public lea f22130b;

    /* JADX INFO: renamed from: d */
    private final MediaFormat f22131d;

    /* JADX INFO: renamed from: e */
    private lby f22132e;

    /* JADX INFO: renamed from: f */
    private eah f22133f;

    /* JADX INFO: renamed from: g */
    private lex f22134g;

    /* JADX INFO: renamed from: h */
    private Surface f22135h;

    /* JADX INFO: renamed from: i */
    private lew f22136i;

    /* JADX INFO: renamed from: j */
    private ldx f22137j;

    /* JADX INFO: renamed from: c */
    private static final float[] f22129c = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: a */
    public static final float[] f22128a = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f};

    public fin(MediaFormat mediaFormat) {
        MediaFormat mediaFormat2 = new MediaFormat(mediaFormat);
        this.f22131d = mediaFormat2;
        mediaFormat2.setInteger("color-format", 2130708361);
    }

    /* JADX INFO: renamed from: h */
    private final synchronized void m8464h() {
        lea leaVar = this.f22130b;
        if (leaVar != null) {
            leaVar.close();
        }
        ldx ldxVar = this.f22137j;
        if (ldxVar != null) {
            ldxVar.close();
        }
    }

    @Override // p000.fid
    /* JADX INFO: renamed from: a */
    public final int mo8436a() {
        return 1;
    }

    @Override // p000.fid
    /* JADX INFO: renamed from: b */
    public final synchronized nps mo8437b() {
        lex lexVar;
        m8464h();
        lexVar = this.f22134g;
        return lexVar != null ? lexVar.mo15275a() : npp.f44031a;
    }

    @Override // p000.fid
    /* JADX INFO: renamed from: c */
    public final synchronized void mo8438c(kyt kytVar, lby lbyVar, lfg lfgVar, Handler handler) {
        eah eahVar;
        this.f22132e = lbyVar;
        synchronized (eah.class) {
            if (eah.f13051b == null) {
                eah.f13051b = jzn.m13824l("gl-guard");
            }
            eahVar = new eah(lbyVar, eah.f13051b);
        }
        this.f22133f = eahVar;
        lex lexVarM14879r = kua.m14879r(new fii(kytVar));
        lfc lfcVarM15277c = ((lfa) lexVarM14879r).m15277c(this.f22131d);
        lfcVarM15277c.f38113c = handler;
        lfcVarM15277c.f38114d = true;
        lfcVarM15277c.f38115e = null;
        lfcVarM15277c.m15279b(lfgVar);
        lew lewVarM15278a = lfcVarM15277c.m15278a();
        Surface surfaceMo15270a = lewVarM15278a.mo15270a();
        surfaceMo15270a.getClass();
        this.f22135h = surfaceMo15270a;
        this.f22137j = ldx.m15221k(lbyVar, kua.m14875n(surfaceMo15270a), kzh.m15087d(this.f22131d.getInteger("width"), this.f22131d.getInteger("height")));
        lexVarM14879r.mo15276b();
        this.f22130b = lea.m15230a(lbyVar);
        this.f22136i = lewVarM15278a;
        this.f22134g = lexVarM14879r;
    }

    @Override // p000.fid
    /* JADX INFO: renamed from: d */
    public final synchronized boolean mo8439d() {
        return this.f22136i != null;
    }

    @Override // p000.fid
    /* JADX INFO: renamed from: e */
    public final float[] mo8440e() {
        return f22129c;
    }

    @Override // p000.fid
    /* JADX INFO: renamed from: f */
    public final synchronized void mo8441f(kpw kpwVar) {
        mo8442g(kpwVar, new fis(this, 1));
    }

    @Override // p000.fid
    /* JADX INFO: renamed from: g */
    public final synchronized void mo8442g(kpw kpwVar, fic ficVar) {
        ldx ldxVar = this.f22137j;
        ldxVar.getClass();
        eah eahVar = this.f22133f;
        eahVar.getClass();
        lby lbyVar = this.f22132e;
        lbyVar.getClass();
        eag eagVarM6997a = eahVar.m6997a(kpwVar.mo7250f());
        try {
            if (eagVarM6997a.f13048a != null) {
                eag eagVarM6997a2 = eahVar.m6997a(new EGLImage((HardwareBuffer) eagVarM6997a.m6996a()));
                try {
                    lcy lcyVarM15192b = lcy.m15192b(lbyVar, (EGLImage) eagVarM6997a2.m6996a());
                    try {
                        ldxVar.m15166e(fse.f23451f, new fsf(kpwVar.mo7248d(), 3)).mo15109h(kzj.f37771a);
                        ficVar.mo8456a(lcyVarM15192b, ldxVar);
                        lcyVarM15192b.close();
                        eagVarM6997a2.close();
                    } catch (Throwable th) {
                        try {
                            lcyVarM15192b.close();
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        eagVarM6997a2.close();
                    } catch (Throwable th4) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                    }
                    throw th3;
                }
            }
            eagVarM6997a.close();
        } catch (Throwable th5) {
            try {
                eagVarM6997a.close();
            } catch (Throwable th6) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th5, th6);
            }
            throw th5;
        }
    }
}
