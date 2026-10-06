package p000;

import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.libraries.lens.lenslite.api.arLu.YmzeHXaMYOLk;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p021j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ffo implements hnu {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f21705d = 0;

    /* JADX INFO: renamed from: e */
    private static final nbh f21706e = nbh.m17259h("com/google/android/apps/camera/microvideo/LongShotTorchController");

    /* JADX INFO: renamed from: f */
    private static final Duration f21707f = Duration.ofMillis(500);

    /* JADX INFO: renamed from: a */
    public final hnw f21708a;

    /* JADX INFO: renamed from: b */
    public final jvb f21709b = new jvb();

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f21710c;

    /* JADX INFO: renamed from: g */
    private final Executor f21711g;

    /* JADX INFO: renamed from: h */
    private final kfk f21712h;

    /* JADX INFO: renamed from: i */
    private final kbz f21713i;

    /* JADX INFO: renamed from: j */
    private final hnz f21714j;

    /* JADX INFO: renamed from: k */
    private final jww f21715k;

    /* JADX INFO: renamed from: l */
    private final kmd f21716l;

    /* JADX INFO: renamed from: m */
    private final kpb f21717m;

    /* JADX INFO: renamed from: n */
    private final dhv f21718n;

    /* JADX INFO: renamed from: o */
    private final fvu f21719o;

    /* JADX INFO: renamed from: p */
    private final gtd f21720p;

    public ffo(Executor executor, kfk kfkVar, fvu fvuVar, hnw hnwVar, hnv hnvVar, jww jwwVar, kmd kmdVar, kpb kpbVar, gtd gtdVar, AtomicBoolean atomicBoolean, kbz kbzVar, dhv dhvVar, byte[] bArr, byte[] bArr2) {
        this.f21711g = executor;
        this.f21712h = kfkVar;
        this.f21719o = fvuVar;
        this.f21713i = kbzVar;
        this.f21708a = hnwVar;
        this.f21715k = jwwVar;
        this.f21716l = kmdVar;
        this.f21717m = kpbVar;
        this.f21720p = gtdVar;
        this.f21710c = atomicBoolean;
        this.f21718n = dhvVar;
        hny hnyVarM10529a = hnz.m10529a();
        hnyVarM10529a.m10524c(executor);
        hnyVarM10529a.m10525d(YmzeHXaMYOLk.LSWeZtygvtvY);
        hnyVarM10529a.m10528g(hnvVar);
        hnyVarM10529a.m10526e(new fdo(jwwVar, 12));
        hnyVarM10529a.m10527f(new fdo(jwwVar, 13));
        this.f21714j = hnyVarM10529a.m10522a();
    }

    /* JADX INFO: renamed from: a */
    final ljf m8354a(gyh gyhVar, boolean z) {
        if (gyhVar.mo9903i() != gyw.LONG_SHOT || !z || ((Boolean) this.f21715k.mo3831be()).booleanValue() || this.f21719o.mo14558k() != kmq.BACK) {
            return new ljf(mqu.f41450a, cgw.f5705r, this.f21712h, this.f21720p, this.f21716l, this.f21710c, this.f21718n, (byte[]) null, (byte[]) null);
        }
        this.f21713i.mo13961e("LongShotTorchController#turnOnTorch");
        try {
            if (gtd.m9733e() && this.f21718n.mo6184l(dil.f11624j) && this.f21719o.mo14558k().equals(kmq.BACK)) {
                if (this.f21717m.m14668h()) {
                    this.f21712h.mo14121h(kgq.m14215e(ivv.f32393b, Integer.valueOf(C0100R.styleable.AppCompatTheme_windowMinWidthMinor)));
                } else {
                    this.f21712h.mo14121h(kgq.m14215e(ivv.f32394c, false));
                }
            }
            kfo kfoVarMo14117d = this.f21712h.mo14117d();
            mrm mrmVarM16829i = mqu.f41450a;
            try {
                kew kewVarMo14152a = kfoVarMo14117d.mo14152a();
                ((kir) kewVarMo14152a).f36197c = 1;
                ((kir) kewVarMo14152a).f36199e = 2;
                long j = ((kfd) kfoVarMo14117d.mo14155d(((kir) kewVarMo14152a).m14365d()).get()).f35811b;
                this.f21710c.set(true);
                if (j != -1) {
                    mrmVarM16829i = mrm.m16829i(Long.valueOf(j + f21707f.toNanos()));
                } else {
                    ((nbe) ((nbe) f21706e.m17252c()).mo17276G(2173)).mo17290o("Invalid converged 3A timestamp for Long Shot.");
                }
            } catch (InterruptedException | CancellationException | ExecutionException | kec e) {
                ((nbe) ((nbe) ((nbe) f21706e.m17251b()).mo17283h(e)).mo17276G((char) 2174)).mo17290o("Couldn't set the torch state for Long Shot");
            }
            this.f21713i.mo13962f();
            return new ljf(mrmVarM16829i, new eip(kfoVarMo14117d, this.f21715k.mo3830a(new ecr(this, kfoVarMo14117d, 7), this.f21711g), 9), this.f21712h, this.f21720p, this.f21716l, this.f21710c, this.f21718n, (byte[]) null, (byte[]) null);
        } catch (InterruptedException | kec e2) {
            return new ljf(mqu.f41450a, cgw.f5706s, this.f21712h, this.f21720p, this.f21716l, this.f21710c, this.f21718n, (byte[]) null, (byte[]) null);
        }
    }

    @Override // p000.hnu
    /* JADX INFO: renamed from: by */
    public final void mo5538by(hnv hnvVar) {
        this.f21714j.mo5538by(hnvVar);
    }
}
