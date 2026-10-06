package p000;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dpd implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f12200a;

    /* JADX INFO: renamed from: b */
    private final oju f12201b;

    /* JADX INFO: renamed from: c */
    private final oju f12202c;

    /* JADX INFO: renamed from: d */
    private final oju f12203d;

    /* JADX INFO: renamed from: e */
    private final /* synthetic */ int f12204e;

    public dpd(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i) {
        this.f12204e = i;
        this.f12200a = ojuVar;
        this.f12201b = ojuVar2;
        this.f12202c = ojuVar3;
        this.f12203d = ojuVar4;
    }

    public dpd(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, byte[] bArr) {
        this.f12204e = i;
        this.f12202c = ojuVar;
        this.f12203d = ojuVar2;
        this.f12201b = ojuVar3;
        this.f12200a = ojuVar4;
    }

    public dpd(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, byte[] bArr, byte[] bArr2) {
        this.f12204e = i;
        this.f12201b = ojuVar;
        this.f12202c = ojuVar2;
        this.f12203d = ojuVar3;
        this.f12200a = ojuVar4;
    }

    public dpd(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, char[] cArr) {
        this.f12204e = i;
        this.f12203d = ojuVar;
        this.f12202c = ojuVar2;
        this.f12201b = ojuVar3;
        this.f12200a = ojuVar4;
    }

    public dpd(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, char[] cArr, byte[] bArr) {
        this.f12204e = i;
        this.f12203d = ojuVar;
        this.f12202c = ojuVar2;
        this.f12201b = ojuVar3;
        this.f12200a = ojuVar4;
    }

    public dpd(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, float[] fArr) {
        this.f12204e = i;
        this.f12201b = ojuVar;
        this.f12203d = ojuVar2;
        this.f12202c = ojuVar3;
        this.f12200a = ojuVar4;
    }

    public dpd(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, int[] iArr) {
        this.f12204e = i;
        this.f12203d = ojuVar;
        this.f12202c = ojuVar2;
        this.f12201b = ojuVar3;
        this.f12200a = ojuVar4;
    }

    public dpd(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, short[] sArr) {
        this.f12204e = i;
        this.f12200a = ojuVar;
        this.f12201b = ojuVar2;
        this.f12203d = ojuVar3;
        this.f12202c = ojuVar4;
    }

    public dpd(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, boolean[] zArr) {
        this.f12204e = i;
        this.f12201b = ojuVar;
        this.f12202c = ojuVar2;
        this.f12203d = ojuVar3;
        this.f12200a = ojuVar4;
    }

    public dpd(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, byte[][] bArr) {
        this.f12204e = i;
        this.f12201b = ojuVar;
        this.f12200a = ojuVar2;
        this.f12203d = ojuVar3;
        this.f12202c = ojuVar4;
    }

    public dpd(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, char[][] cArr) {
        this.f12204e = i;
        this.f12200a = ojuVar;
        this.f12203d = ojuVar2;
        this.f12201b = ojuVar3;
        this.f12202c = ojuVar4;
    }

    public dpd(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, float[][] fArr) {
        this.f12204e = i;
        this.f12203d = ojuVar;
        this.f12200a = ojuVar2;
        this.f12202c = ojuVar3;
        this.f12201b = ojuVar4;
    }

    public dpd(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, int[][] iArr) {
        this.f12204e = i;
        this.f12202c = ojuVar;
        this.f12201b = ojuVar2;
        this.f12203d = ojuVar3;
        this.f12200a = ojuVar4;
    }

    public dpd(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, short[][] sArr) {
        this.f12204e = i;
        this.f12202c = ojuVar;
        this.f12201b = ojuVar2;
        this.f12200a = ojuVar3;
        this.f12203d = ojuVar4;
    }

    public dpd(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, boolean[][] zArr) {
        this.f12204e = i;
        this.f12200a = ojuVar;
        this.f12202c = ojuVar2;
        this.f12203d = ojuVar3;
        this.f12201b = ojuVar4;
    }

    public dpd(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, byte[][][] bArr) {
        this.f12204e = i;
        this.f12203d = ojuVar;
        this.f12200a = ojuVar2;
        this.f12202c = ojuVar3;
        this.f12201b = ojuVar4;
    }

    public dpd(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, char[][][] cArr) {
        this.f12204e = i;
        this.f12203d = ojuVar;
        this.f12202c = ojuVar2;
        this.f12201b = ojuVar3;
        this.f12200a = ojuVar4;
    }

    public dpd(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, float[][][] fArr) {
        this.f12204e = i;
        this.f12203d = ojuVar;
        this.f12202c = ojuVar2;
        this.f12201b = ojuVar3;
        this.f12200a = ojuVar4;
    }

    public dpd(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, int[][][] iArr) {
        this.f12204e = i;
        this.f12201b = ojuVar;
        this.f12200a = ojuVar2;
        this.f12202c = ojuVar3;
        this.f12203d = ojuVar4;
    }

    public dpd(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, short[][][] sArr) {
        this.f12204e = i;
        this.f12203d = ojuVar;
        this.f12201b = ojuVar2;
        this.f12200a = ojuVar3;
        this.f12202c = ojuVar4;
    }

    public dpd(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, boolean[][][] zArr) {
        this.f12204e = i;
        this.f12202c = ojuVar;
        this.f12201b = ojuVar2;
        this.f12200a = ojuVar3;
        this.f12203d = ojuVar4;
    }

    /* JADX INFO: renamed from: a */
    public static dpd m6534a(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new dpd(ojuVar, ojuVar2, ojuVar3, ojuVar4, 7, (byte[][]) null);
    }

    /* JADX INFO: renamed from: b */
    public static dpd m6535b(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new dpd(ojuVar, ojuVar2, ojuVar3, ojuVar4, 8, (char[][]) null);
    }

    /* JADX INFO: renamed from: c */
    public static dpd m6536c(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new dpd(ojuVar, ojuVar2, ojuVar3, ojuVar4, 11, (boolean[][]) null);
    }

    /* JADX INFO: renamed from: d */
    public static dpd m6537d(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new dpd(ojuVar, ojuVar2, ojuVar3, ojuVar4, 12, (float[][]) null);
    }

    /* JADX INFO: renamed from: e */
    public static dpd m6538e(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new dpd(ojuVar, ojuVar2, ojuVar3, ojuVar4, 13, (byte[][][]) null);
    }

    /* JADX INFO: renamed from: f */
    public static dpd m6539f(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new dpd(ojuVar, ojuVar2, ojuVar3, ojuVar4, 14, (char[][][]) null);
    }

    /* JADX INFO: renamed from: g */
    public static dpd m6540g(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new dpd(ojuVar, ojuVar2, ojuVar3, ojuVar4, 16, (int[][][]) null);
    }

    /* JADX INFO: renamed from: h */
    public static dpd m6541h(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new dpd(ojuVar, ojuVar2, ojuVar3, ojuVar4, 17, (boolean[][][]) null);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        Object objM17136H;
        Object objM17136H2;
        Object objM17136H3;
        switch (this.f12204e) {
            case 0:
                cdu cduVar = ((err) this.f12200a).get();
                kbz kbzVar = (kbz) this.f12201b.get();
                Context contextM6830a = ((dws) this.f12202c).m6830a();
                jww jwwVar = (jww) this.f12203d.get();
                jvb jvbVarM3529i = cduVar.m3529i();
                dpc dpcVar = new dpc(contextM6830a, kbzVar, jwwVar);
                jvbVarM3529i.m13537d(dpcVar);
                return dpcVar;
            case 1:
                return new dnc((bko) this.f12202c.get(), (ScheduledExecutorService) this.f12203d.get(), (kbz) this.f12201b.get(), (dhv) this.f12200a.get(), null, null, null, null);
            case 2:
                return new dqk(((dws) this.f12203d).m6830a(), (hst) this.f12202c.get(), (jvd) this.f12201b.get(), (jww) this.f12200a.get());
            case 3:
                Object objM17136H4 = (((Boolean) this.f12200a.get()).booleanValue() && ((Boolean) this.f12201b.get()).booleanValue()) ? mxk.m17136H(ipn.m11594a((ipm) this.f12202c.get(), (jwn) this.f12203d.get(), ipl.FACE_BEAUTIFICATION)) : mzx.f41874a;
                objM17136H4.getClass();
                return objM17136H4;
            case 4:
                jwn jwnVarM7271b = ((efm) this.f12203d).m7271b();
                boolean zBooleanValue = ((Boolean) this.f12202c.get()).booleanValue();
                boolean zBooleanValue2 = ((Boolean) this.f12201b.get()).booleanValue();
                dqv dqvVar = new dqv((Executor) this.f12200a.get());
                dqvVar.m6610g(jwr.m13640j(jwnVarM7271b, new dqx(zBooleanValue, zBooleanValue2, 2)));
                return dqvVar;
            case 5:
                jww jwwVar2 = (jww) this.f12201b.get();
                boolean zBooleanValue3 = ((Boolean) this.f12202c.get()).booleanValue();
                boolean zBooleanValue4 = ((Boolean) this.f12203d.get()).booleanValue();
                dqv dqvVar2 = new dqv((Executor) this.f12200a.get());
                dqvVar2.m6610g(jwr.m13640j(jwwVar2, new dqx(zBooleanValue3, zBooleanValue4, 1)));
                return dqvVar2;
            case 6:
                return new apv(((err) this.f12200a).get(), (jww) this.f12201b.get(), (cvy) this.f12203d.get(), (dbr) this.f12202c.get(), 6, null);
            case 7:
                dhv dhvVar = (dhv) this.f12201b.get();
                oju ojuVar = this.f12200a;
                oju ojuVar2 = this.f12203d;
                oju ojuVar3 = this.f12202c;
                mxk mxkVar = dsw.f12520a;
                if (dhvVar.mo6184l(dib.f11263aW)) {
                    ikw ikwVar = (ikw) ((AtomicReference) ((cvy) ojuVar.get()).f9846c).get();
                    objM17136H = ((ikwVar == ikw.PHOTO || dhvVar.mo6184l(dib.f11264aX)) && dsw.f12520a.contains(ikwVar)) ? mxk.m17136H(dez.m6036f(new bmj(ojuVar, ojuVar2, ojuVar3, 14), "fastzoom")) : mzx.f41874a;
                } else {
                    objM17136H = mzx.f41874a;
                }
                objM17136H.getClass();
                return objM17136H;
            case 8:
                return new dtc((Executor) this.f12200a.get(), (mrm) this.f12203d.get(), (mrm) this.f12201b.get(), ((ohm) this.f12202c).get(), dqf.m6589a(), null);
            case 9:
                Context contextM6830a2 = ((dws) this.f12202c).m6830a();
                Resources resourcesM6836a = ((dww) this.f12201b).m6836a();
                glk glkVar = (glk) this.f12200a.get();
                dwl dwlVar = ((dwx) this.f12203d).get();
                ValueAnimator valueAnimator = (ValueAnimator) AnimatorInflater.loadAnimator(contextM6830a2, C0100R.animator.long_press_focus_lock_opacity_fade_in);
                valueAnimator.addUpdateListener(glkVar.m9429f());
                ValueAnimator valueAnimator2 = (ValueAnimator) AnimatorInflater.loadAnimator(contextM6830a2, C0100R.animator.long_press_focus_lock_size_scale_up);
                valueAnimator2.addUpdateListener(glkVar.m9428e());
                ValueAnimator valueAnimator3 = (ValueAnimator) AnimatorInflater.loadAnimator(contextM6830a2, C0100R.animator.long_press_focus_lock_size_scale_down);
                valueAnimator3.addUpdateListener(glkVar.m9428e());
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(valueAnimator, valueAnimator2, valueAnimator3);
                animatorSet.addListener(new dxg(dwlVar, contextM6830a2, resourcesM6836a));
                animatorSet.addListener(new ilq());
                return inr.m11538j(animatorSet);
            case 10:
                Context contextM6830a3 = ((dws) this.f12202c).m6830a();
                FocusIndicatorView focusIndicatorView = ((dwv) this.f12201b).get();
                dwl dwlVar2 = ((dwx) this.f12203d).get();
                glk glkVar2 = (glk) this.f12200a.get();
                ValueAnimator valueAnimator4 = (ValueAnimator) AnimatorInflater.loadAnimator(contextM6830a3, C0100R.animator.long_press_focus_lock_opacity_fade_out);
                valueAnimator4.addUpdateListener(glkVar2.m9429f());
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.play(valueAnimator4);
                animatorSet2.addListener(new dxf(dwlVar2, focusIndicatorView));
                animatorSet2.addListener(new ilq());
                return inr.m11538j(animatorSet2);
            case 11:
                mrm mrmVar = (mrm) this.f12200a.get();
                oju ojuVar4 = this.f12202c;
                oju ojuVar5 = this.f12203d;
                oju ojuVar6 = this.f12201b;
                if (mrmVar.mo16813g()) {
                    try {
                        jvb jvbVar = (jvb) ojuVar5.get();
                        dyc dycVar = new dyc((lek) ojuVar4.get(), (dxi) mrmVar.mo16809c(), TimeUnit.MICROSECONDS.convert(33333L, TimeUnit.MICROSECONDS), (ScheduledExecutorService) ojuVar6.get());
                        jvbVar.m13537d(dycVar);
                        return mrm.m16829i(dycVar);
                    } catch (RuntimeException e) {
                        ((nbe) ((nbe) ((nbe) dxl.f12837a.m17251b()).mo17283h(e)).mo17276G((char) 1170)).mo17290o("Error trying to initialize audio");
                    }
                }
                return mqu.f41450a;
            case 12:
                Integer num = (Integer) this.f12203d.get();
                Boolean bool = ((dxz) this.f12200a).get();
                oju ojuVar7 = this.f12202c;
                kbz kbzVar2 = (kbz) this.f12201b.get();
                if (!bool.booleanValue() || num.intValue() >= 0) {
                    objM17136H2 = mzx.f41874a;
                } else {
                    try {
                        kbzVar2.mo13961e("FRAMESTORE_MetadataModule#provideRequestTransformer");
                        objM17136H2 = mxk.m17136H((kfv) ojuVar7.get());
                        kbzVar2.mo13962f();
                    } catch (Throwable th) {
                        kbzVar2.mo13962f();
                        throw th;
                    }
                }
                objM17136H2.getClass();
                return objM17136H2;
            case 13:
                Integer num2 = (Integer) this.f12203d.get();
                Boolean bool2 = ((dxz) this.f12200a).get();
                oju ojuVar8 = this.f12202c;
                kbz kbzVar3 = (kbz) this.f12201b.get();
                if (!bool2.booleanValue() || num2.intValue() < 0) {
                    objM17136H3 = mzx.f41874a;
                } else {
                    try {
                        kbzVar3.mo13961e("FRAMESTORE_MetadataModule#provideRequestListener");
                        objM17136H3 = mxk.m17136H((kfv) ojuVar8.get());
                        kbzVar3.mo13962f();
                    } catch (Throwable th2) {
                        kbzVar3.mo13962f();
                        throw th2;
                    }
                }
                objM17136H3.getClass();
                return objM17136H3;
            case 14:
                return new dyf((dxx) this.f12203d.get(), ((cen) this.f12202c).get(), (imu) this.f12201b.get(), (Executor) this.f12200a.get());
            case 15:
                hlp hlpVar = (hlp) this.f12203d.get();
                dzr dzrVar = (dzr) this.f12201b.get();
                return new dza(hlpVar, dzrVar, (dyy) this.f12202c.get());
            case 16:
                return new ear((Integer) this.f12201b.get(), (Executor) this.f12200a.get(), ((ohm) this.f12202c).get(), (Set) this.f12203d.get());
            case 17:
                return new ecj((ebv) this.f12202c.get(), ((crv) this.f12201b).m5442a(), ((ikv) this.f12200a).m11415a(), (eby) this.f12203d.get());
            case 18:
                return new eia(((dww) this.f12203d).m6836a(), (fly) this.f12202c.get(), (jfs) this.f12201b.get(), (ScheduledExecutorService) this.f12200a.get(), null, null, null);
            case 19:
                return new ejt((ejd) this.f12201b.get(), (eim) this.f12202c.get(), (eiw) this.f12203d.get(), ((dws) this.f12200a).m6830a());
            default:
                return new ejw(((dww) this.f12203d).m6836a(), (fly) this.f12202c.get(), (jfs) this.f12201b.get(), ((cmx) this.f12200a).get(), null, null, null);
        }
    }
}
