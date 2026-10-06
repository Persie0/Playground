package p000;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Process;
import android.os.Trace;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.BottomBarListener;
import com.google.android.apps.camera.bottombar.C0100R;
import java.io.File;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class evo extends chw implements hxa {

    /* JADX INFO: renamed from: b */
    public static final nbh f20407b = nbh.m17259h("com/google/android/apps/camera/legacy/app/module/pckimageintent/PckImageIntentModule");

    /* JADX INFO: renamed from: A */
    private final fvl f20408A;

    /* JADX INFO: renamed from: B */
    private final fvs f20409B;

    /* JADX INFO: renamed from: C */
    private fmc f20410C;

    /* JADX INFO: renamed from: D */
    private final huy f20411D;

    /* JADX INFO: renamed from: E */
    private final hjy f20412E;

    /* JADX INFO: renamed from: F */
    private final fca f20413F;

    /* JADX INFO: renamed from: G */
    private final dhv f20414G;

    /* JADX INFO: renamed from: H */
    private final gyi f20415H;

    /* JADX INFO: renamed from: I */
    private final C1058va f20416I;

    /* JADX INFO: renamed from: J */
    private final jfs f20417J;

    /* JADX INFO: renamed from: c */
    public final igf f20418c;

    /* JADX INFO: renamed from: d */
    public final iuj f20419d;

    /* JADX INFO: renamed from: e */
    public final jww f20420e;

    /* JADX INFO: renamed from: f */
    public final hht f20421f;

    /* JADX INFO: renamed from: g */
    public final jvd f20422g;

    /* JADX INFO: renamed from: h */
    public final ggm f20423h;

    /* JADX INFO: renamed from: i */
    public final hwo f20424i;

    /* JADX INFO: renamed from: j */
    public final cbz f20425j;

    /* JADX INFO: renamed from: k */
    public final dbr f20426k;

    /* JADX INFO: renamed from: l */
    public final hua f20427l;

    /* JADX INFO: renamed from: m */
    public final idf f20428m;

    /* JADX INFO: renamed from: n */
    public final mrm f20429n;

    /* JADX INFO: renamed from: o */
    public nqf f20430o;

    /* JADX INFO: renamed from: p */
    public final evf f20431p;

    /* JADX INFO: renamed from: q */
    public jvb f20432q;

    /* JADX INFO: renamed from: r */
    public fmd f20433r;

    /* JADX INFO: renamed from: s */
    public final hee f20434s;

    /* JADX INFO: renamed from: t */
    private final BottomBarListener f20435t;

    /* JADX INFO: renamed from: u */
    private final igb f20436u;

    /* JADX INFO: renamed from: v */
    private final eoq f20437v;

    /* JADX INFO: renamed from: w */
    private final eop f20438w;

    /* JADX INFO: renamed from: x */
    private final Context f20439x;

    /* JADX INFO: renamed from: y */
    private final Resources f20440y;

    /* JADX INFO: renamed from: z */
    private final evg f20441z;

    public evo(jvd jvdVar, ggm ggmVar, dbr dbrVar, fvl fvlVar, fvs fvsVar, mrm mrmVar, Resources resources, BottomBarController bottomBarController, igb igbVar, eoq eoqVar, iuj iujVar, hht hhtVar, jww jwwVar, evg evgVar, hua huaVar, hwo hwoVar, huy huyVar, ihk ihkVar, hjy hjyVar, gye gyeVar, oju ojuVar, cbz cbzVar, bko bkoVar, Context context, evf evfVar, idf idfVar, hee heeVar, C1058va c1058va, dhv dhvVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        evj evjVar = new evj(this);
        this.f20435t = evjVar;
        this.f20418c = new evk(this);
        this.f20438w = new eul(this, 3);
        evn evnVar = new evn(this);
        this.f20415H = evnVar;
        this.f20422g = jvdVar;
        this.f20423h = ggmVar;
        this.f20420e = jwwVar;
        this.f20411D = huyVar;
        this.f20421f = hhtVar;
        this.f20439x = context;
        this.f20440y = resources;
        this.f20426k = dbrVar;
        this.f20408A = fvlVar;
        this.f20409B = fvsVar;
        this.f20429n = mrmVar;
        this.f20436u = igbVar;
        this.f20437v = eoqVar;
        this.f20419d = iujVar;
        this.f20441z = evgVar;
        this.f20427l = huaVar;
        this.f20424i = hwoVar;
        this.f20412E = hjyVar;
        this.f20431p = evfVar;
        this.f20425j = cbzVar;
        this.f20428m = idfVar;
        this.f20434s = heeVar;
        this.f20416I = c1058va;
        this.f20414G = dhvVar;
        if (bkoVar.m2611e().getBooleanExtra("include_location_in_exif", false)) {
            this.f20413F = (fca) ojuVar.get();
        } else {
            this.f20413F = new fce();
        }
        nqf nqfVarM17621g = nqf.m17621g();
        this.f20430o = nqfVarM17621g;
        nqfVarM17621g.mo8566a(new IllegalStateException("No image has been captured"));
        this.f20417J = ihkVar.m11335E(new hlw(new File(String.valueOf(context.getExternalCacheDir()) + File.separator + "ImageIntent")));
        bottomBarController.addListener(evjVar);
        gyeVar.m9966a(evnVar);
    }

    @Override // p000.hxa
    /* JADX INFO: renamed from: a */
    public final void mo7904a() {
        this.f20411D.mo10780b();
        mo3783r();
    }

    @Override // p000.hxa
    /* JADX INFO: renamed from: b */
    public final void mo7905b() {
        this.f20421f.mo10317c(C0100R.raw.timer_start);
        this.f20411D.mo10779a();
    }

    @Override // p000.hxa
    /* JADX INFO: renamed from: bK */
    public final void mo7906bK(int i) {
        if (i == 1) {
            this.f20421f.mo10317c(C0100R.raw.timer_final);
        } else if (i == 2 || i == 3) {
            this.f20421f.mo10317c(C0100R.raw.timer_increment);
        }
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: bV */
    protected final void mo3770bV() {
        m7930x();
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: bz */
    public final mrm mo3772bz() {
        return mrm.m16828h(this.f20433r);
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: c */
    public final String mo3773c() {
        return this.f20440y.getString(C0100R.string.photo_accessibility_peek);
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: d */
    public final void mo3774d(bnq bnqVar) {
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: e */
    public final void mo3775e(Configuration configuration) {
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: k */
    public final void mo3777k() {
        fmd fmdVar = this.f20433r;
        if (fmdVar != null) {
            fmdVar.close();
        }
        this.f20433r = null;
        fmc fmcVar = this.f20410C;
        if (fmcVar != null) {
            fmcVar.cancel(true);
            this.f20410C = null;
        }
        this.f20428m.m11110a();
        this.f20410C = this.f20408A.mo8831a(this.f20426k, this.f20409B, ikw.IMAGE_INTENT);
        iuj iujVar = this.f20419d;
        if (((ite) iujVar).f32068S) {
            iujVar.mo11765p();
        }
        if (this.f20414G.mo6184l(dib.f11285as)) {
            this.f20419d.mo11775z();
        }
        fmc fmcVar2 = this.f20410C;
        if (fmcVar2 != null) {
            kxk.m14975U(fmcVar2, new cmo(this, 10), this.f20422g);
        }
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: l */
    protected final void mo3778l() {
        mrm mrmVar = this.f20441z.f20391d;
        if (!mrmVar.mo16813g() || this.f20439x.checkUriPermission((Uri) mrmVar.mo16809c(), Process.myPid(), Process.myUid(), 2) == 0) {
            this.f20434s.m10148g();
            return;
        }
        C1058va c1058va = this.f20416I;
        ((jvd) c1058va.f47804c).m13541c(new baa(c1058va, 18, null));
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: n */
    protected final void mo3780n() {
        this.f20432q = new jvb();
        this.f20431p.m7924a(false);
        this.f20437v.m7597a(this.f20438w);
        this.f20432q.m13537d(this.f20436u.mo11233e(this.f20418c));
        jvb jvbVar = this.f20432q;
        jww jwwVar = this.f20420e;
        igb igbVar = this.f20436u;
        igbVar.getClass();
        jvbVar.m13537d(jwwVar.mo3830a(new euz(igbVar, 2), this.f20422g));
        this.f20432q.m13537d(this.f20426k.mo3830a(new euz(this, 3), not.INSTANCE));
        this.f20410C.getClass();
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: p */
    protected final void mo3781p() {
        fmc fmcVar = this.f20410C;
        if (fmcVar != null) {
            fmcVar.cancel(true);
            this.f20410C = null;
        }
        this.f20428m.m11110a();
        this.f20432q.close();
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: r */
    public final synchronized void mo3783r() {
        ((nbe) ((nbe) f20407b.m17252c()).mo17276G((char) 1984)).mo17290o("takePictureInvoked");
        fmd fmdVar = this.f20433r;
        fmdVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strM13083S = this.f20417J.m13083S(jCurrentTimeMillis);
        this.f20430o = nqf.m17621g();
        gxm gxmVar = new gxm(strM13083S, jCurrentTimeMillis, this.f20413F.mo8116b(), this.f20412E, this.f20430o);
        fvu fvuVar = fmdVar.f22543c;
        jwf jwfVar = new jwf(false);
        ftz ftzVarM8808a = fua.m8808a();
        ftzVarM8808a.m8806g(this.f20423h.mo9215c().m13893a());
        ftzVarM8808a.m8801b(new evl(this));
        ftzVarM8808a.m8804e(-1);
        ftzVarM8808a.m8802c(fvuVar.mo14558k());
        ftzVarM8808a.f23561a = fvuVar.mo14546O();
        ftzVarM8808a.m8807h(jwfVar);
        ftzVarM8808a.m8803d(false);
        ftzVarM8808a.m8805f(false);
        kxk.m14975U(fmdVar.mo8572f(ftzVarM8808a.m8800a(), gxmVar), new evm(this), this.f20422g);
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: t */
    public final boolean mo3785t() {
        if (!this.f20431p.f20387g) {
            return m7930x();
        }
        this.f20435t.onRetakeButtonPressed();
        return true;
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: u */
    public final boolean mo3786u() {
        return true;
    }

    /* JADX INFO: renamed from: w */
    public final synchronized void m7929w() {
        try {
            try {
                byte[] bArr = (byte[]) this.f20430o.get();
                bArr.getClass();
                evg evgVar = this.f20441z;
                mrm mrmVar = evgVar.f20391d;
                if (mrmVar.mo16813g()) {
                    Uri uri = (Uri) mrmVar.mo16809c();
                    kxk.m14975U(kxk.m14968N(new epm(evgVar, uri, bArr, 4), evgVar.f20393f), new eog(evgVar, uri, 5), evgVar.f20390c);
                    return;
                }
                Trace.beginSection("ImageIntent:CompressingImageIntoIntentExtra");
                Bitmap bitmapM11480c = imq.m11480c(bArr);
                bitmapM11480c.getClass();
                Trace.endSection();
                evgVar.f20390c.execute(new ekr(evgVar, new Intent("inline-data").putExtra("data", bitmapM11480c), 19));
            } catch (Throwable th) {
                throw th;
            }
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException("Couldn't get image data from Future", e);
        }
    }

    /* JADX INFO: renamed from: x */
    public final boolean m7930x() {
        if (!this.f20431p.m7926c()) {
            return false;
        }
        evf evfVar = this.f20431p;
        jvd.m13538a();
        evfVar.f20383c.m10788a();
        this.f20411D.mo10780b();
        return true;
    }
}
