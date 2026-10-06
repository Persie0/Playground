package p000;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.google.android.apps.camera.bottombar.RoundedThumbnailView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hth implements htf {

    /* JADX INFO: renamed from: a */
    public static final nbh f29500a = nbh.m17259h("com/google/android/apps/camera/ui/captureindicator/CaptureIndicatorControllerImpl");

    /* JADX INFO: renamed from: b */
    public final List f29501b;

    /* JADX INFO: renamed from: c */
    public Long f29502c;

    /* JADX INFO: renamed from: d */
    public final AtomicInteger f29503d;

    /* JADX INFO: renamed from: e */
    public final AtomicInteger f29504e;

    /* JADX INFO: renamed from: f */
    private final RoundedThumbnailView f29505f;

    /* JADX INFO: renamed from: g */
    private final ohb f29506g;

    /* JADX INFO: renamed from: h */
    private final RoundedThumbnailView.Callback f29507h;

    /* JADX INFO: renamed from: i */
    private boolean f29508i;

    /* JADX INFO: renamed from: j */
    private boolean f29509j;

    /* JADX INFO: renamed from: k */
    private final boolean f29510k;

    /* JADX INFO: renamed from: l */
    private final hlv f29511l;

    /* JADX INFO: renamed from: m */
    private final jvd f29512m;

    /* JADX INFO: renamed from: n */
    private final Executor f29513n;

    /* JADX INFO: renamed from: o */
    private final hah f29514o;

    /* JADX INFO: renamed from: p */
    private nps f29515p;

    /* JADX INFO: renamed from: q */
    private Bitmap f29516q;

    /* JADX INFO: renamed from: r */
    private final bko f29517r;

    public hth(RoundedThumbnailView roundedThumbnailView, boolean z, bko bkoVar, hlv hlvVar, ohb ohbVar, jvd jvdVar, Executor executor, hah hahVar, byte[] bArr, byte[] bArr2) {
        htg htgVar = new htg(this);
        this.f29507h = htgVar;
        this.f29501b = new ArrayList();
        this.f29508i = false;
        this.f29503d = new AtomicInteger(0);
        this.f29504e = new AtomicInteger(0);
        this.f29505f = roundedThumbnailView;
        this.f29506g = ohbVar;
        roundedThumbnailView.setCallback(htgVar);
        this.f29510k = z;
        this.f29517r = bkoVar;
        this.f29511l = hlvVar;
        this.f29512m = jvdVar;
        this.f29509j = z;
        this.f29513n = executor;
        this.f29514o = hahVar;
    }

    @Override // p000.htf
    /* JADX INFO: renamed from: a */
    public final kba mo10733a(hte hteVar) {
        this.f29501b.add(hteVar);
        return new gto(this, hteVar, 16);
    }

    @Override // p000.htf
    /* JADX INFO: renamed from: b */
    public final mrm mo10734b() {
        Bitmap bitmap = this.f29516q;
        return bitmap == null ? mqu.f41450a : mrm.m16829i(bitmap);
    }

    @Override // p000.htf
    /* JADX INFO: renamed from: c */
    public final nps mo10735c() {
        nps npsVar = this.f29515p;
        if (npsVar != null) {
            return npsVar;
        }
        if (this.f29510k) {
            mo10740h();
            nps npsVarM14965K = kxk.m14965K(true);
            this.f29515p = npsVarM14965K;
            return npsVarM14965K;
        }
        if (cds.m3517p(this.f29517r)) {
            nps npsVarM14965K2 = kxk.m14965K(true);
            this.f29515p = npsVarM14965K2;
            return npsVarM14965K2;
        }
        nps npsVarM10451a = this.f29511l.m10451a();
        nps npsVarM17553i = nod.m17553i(npsVarM10451a, new hgv(this, 5), npsVarM10451a.isDone() ? not.INSTANCE : this.f29512m);
        this.f29515p = npsVarM17553i;
        return npsVarM17553i;
    }

    @Override // p000.htf
    /* JADX INFO: renamed from: d */
    public final Long mo10736d() {
        return this.f29502c;
    }

    @Override // p000.htf
    /* JADX INFO: renamed from: e */
    public final void mo10737e(boolean z) {
        if (this.f29509j) {
            if (z) {
                ((gvo) this.f29506g.get()).mo9798f();
            }
        } else {
            Iterator it = this.f29501b.iterator();
            while (it.hasNext()) {
                ((hte) it.next()).mo3803b();
            }
        }
    }

    @Override // p000.htf
    /* JADX INFO: renamed from: f */
    public final void mo10738f(boolean z) {
        this.f29508i = z;
    }

    @Override // p000.htf
    /* JADX INFO: renamed from: g */
    public final void mo10739g(ilj iljVar) {
        this.f29505f.setThumbnail(this.f29505f.getDefaultThumbnail(iljVar), 0, false);
        this.f29516q = null;
        if (iljVar != ilj.SECURE) {
            hlv hlvVar = this.f29511l;
            synchronized (hlvVar.f28286f) {
                hlvVar.f28285e = null;
            }
            nod.m17553i(hlvVar.f28282b, new hlt(hlvVar), hlvVar.f28284d);
        }
    }

    @Override // p000.htf
    /* JADX INFO: renamed from: h */
    public final void mo10740h() {
        ilj iljVar;
        if (((Boolean) this.f29514o.mo10031c(gzy.f27036at)).booleanValue()) {
            iljVar = ilj.MARS_PLACEHOLDER;
        } else {
            iljVar = this.f29510k ? ilj.SECURE : ilj.PLACEHOLDER;
        }
        mo10739g(iljVar);
        this.f29509j = this.f29510k;
    }

    @Override // p000.htf
    /* JADX INFO: renamed from: i */
    public final void mo10741i(String str) {
        if (this.f29508i || this.f29505f.getVisibility() != 0) {
            return;
        }
        this.f29505f.startRevealThumbnailAnimation(str);
        Iterator it = this.f29501b.iterator();
        while (it.hasNext()) {
            ((hte) it.next()).mo3802a();
        }
    }

    @Override // p000.htf
    /* JADX INFO: renamed from: j */
    public final void mo10742j(Supplier supplier) {
        this.f29503d.incrementAndGet();
        jvh.m13562j(kxk.m14969O(new cpb(this, supplier, 8), this.f29513n), new gjd(this, 11), this.f29512m);
    }

    @Override // p000.htf
    /* JADX INFO: renamed from: k */
    public final void mo10743k(Bitmap bitmap, int i) {
        Bitmap bitmapCreateBitmap;
        this.f29505f.setEnabled(true);
        this.f29505f.setThumbnail(bitmap, i, ((Boolean) this.f29514o.mo10031c(gzy.f27036at)).booleanValue());
        if (i != 0) {
            Matrix matrix = new Matrix();
            matrix.postRotate(i);
            bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        } else {
            bitmapCreateBitmap = bitmap;
        }
        this.f29516q = bitmapCreateBitmap;
        this.f29509j = false;
        hlv hlvVar = this.f29511l;
        nnj.m17523i(nod.m17554j(hlvVar.f28282b, new hlu(hlvVar, new hlr(bitmap, kay.m13889b(i))), hlvVar.f28284d), Throwable.class, hnk.f28491d, not.INSTANCE);
    }
}
