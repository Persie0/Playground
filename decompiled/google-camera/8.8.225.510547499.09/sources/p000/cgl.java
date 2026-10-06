package p000;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Process;
import android.os.Trace;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.async.p005tt.CpuSets;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.p014ui.widget.ReviewImageView;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cgl implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f5619a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5620b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f5621c;

    public /* synthetic */ cgl(AmbientMode.AmbientController ambientController, khb khbVar, int i, byte[] bArr, byte[] bArr2) {
        this.f5621c = i;
        this.f5620b = ambientController;
        this.f5619a = khbVar;
    }

    public /* synthetic */ cgl(bnm bnmVar, kmg kmgVar, int i) {
        this.f5621c = i;
        this.f5620b = bnmVar;
        this.f5619a = kmgVar;
    }

    public /* synthetic */ cgl(cgj cgjVar, key keyVar, int i) {
        this.f5621c = i;
        this.f5620b = cgjVar;
        this.f5619a = keyVar;
    }

    public /* synthetic */ cgl(cgm cgmVar, RectF rectF, int i) {
        this.f5621c = i;
        this.f5619a = cgmVar;
        this.f5620b = rectF;
    }

    public /* synthetic */ cgl(cgm cgmVar, cgz cgzVar, int i) {
        this.f5621c = i;
        this.f5620b = cgmVar;
        this.f5619a = cgzVar;
    }

    public /* synthetic */ cgl(cgn cgnVar, AnimationSet animationSet, int i) {
        this.f5621c = i;
        this.f5619a = cgnVar;
        this.f5620b = animationSet;
    }

    public /* synthetic */ cgl(cgn cgnVar, Runnable runnable, int i) {
        this.f5621c = i;
        this.f5620b = cgnVar;
        this.f5619a = runnable;
    }

    public /* synthetic */ cgl(cia ciaVar, Throwable th, int i) {
        this.f5621c = i;
        this.f5620b = ciaVar;
        this.f5619a = th;
    }

    public cgl(cjd cjdVar, Runnable runnable, int i) {
        this.f5621c = i;
        this.f5620b = cjdVar;
        this.f5619a = runnable;
    }

    public /* synthetic */ cgl(ckp ckpVar, Runnable runnable, int i) {
        this.f5621c = i;
        this.f5620b = ckpVar;
        this.f5619a = runnable;
    }

    public /* synthetic */ cgl(cpw cpwVar, jzf jzfVar, int i) {
        this.f5621c = i;
        this.f5620b = cpwVar;
        this.f5619a = jzfVar;
    }

    public /* synthetic */ cgl(cqi cqiVar, Bitmap bitmap, int i) {
        this.f5621c = i;
        this.f5619a = cqiVar;
        this.f5620b = bitmap;
    }

    public /* synthetic */ cgl(cqi cqiVar, iid iidVar, int i) {
        this.f5621c = i;
        this.f5620b = cqiVar;
        this.f5619a = iidVar;
    }

    public /* synthetic */ cgl(cra craVar, bko bkoVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f5621c = i;
        this.f5619a = craVar;
        this.f5620b = bkoVar;
    }

    public /* synthetic */ cgl(cru cruVar, khb khbVar, int i, byte[] bArr) {
        this.f5621c = i;
        this.f5620b = cruVar;
        this.f5619a = khbVar;
    }

    public /* synthetic */ cgl(cta ctaVar, fan fanVar, int i) {
        this.f5621c = i;
        this.f5620b = ctaVar;
        this.f5619a = fanVar;
    }

    public /* synthetic */ cgl(ctl ctlVar, gyj gyjVar, int i) {
        this.f5621c = i;
        this.f5620b = ctlVar;
        this.f5619a = gyjVar;
    }

    public /* synthetic */ cgl(cur curVar, idl idlVar, int i) {
        this.f5621c = i;
        this.f5620b = curVar;
        this.f5619a = idlVar;
    }

    public /* synthetic */ cgl(Set set, ikw ikwVar, int i) {
        this.f5621c = i;
        this.f5619a = set;
        this.f5620b = ikwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [android.view.ViewPropertyAnimator] */
    /* JADX WARN: Type inference failed for: r0v33, types: [bnm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v80, types: [fbp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, kgg] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, kgg] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v55, types: [fba] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, key] */
    /* JADX WARN: Type inference failed for: r7v8, types: [gva] */
    /* JADX WARN: Type inference failed for: r7v9, types: [gmc] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v15, types: [kgg] */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, key] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r8;
        Object obj;
        boolean zEquals;
        Float[] fArr;
        Object obj2;
        AutoCloseable eonVar;
        switch (this.f5621c) {
            case 0:
                Object obj3 = this.f5619a;
                Object obj4 = this.f5620b;
                cgm cgmVar = (cgm) obj3;
                cgz cgzVar = cgmVar.f5629d;
                if (cgzVar != null) {
                    if (cgzVar.f5710a.getVisibility() != 0) {
                        cgzVar.f5710a.setVisibility(0);
                    }
                    if (cgzVar.f5711b.getVisibility() != 0) {
                        cgzVar.f5711b.setVisibility(0);
                    }
                    if (!cgmVar.f5627b || obj4 == null) {
                        return;
                    }
                    RectF rectF = (RectF) obj4;
                    cgmVar.f5629d.f5711b.m4033a(new PointF(rectF.left, rectF.top), new PointF(rectF.right, rectF.top), new PointF(rectF.right, rectF.bottom), new PointF(rectF.left, rectF.bottom));
                    return;
                }
                return;
            case 1:
                Object obj5 = this.f5620b;
                ?? r6 = this.f5619a;
                try {
                    ?? M9784a = ((cgj) obj5).f5612e.m9784a(r6);
                    mxk mxkVar = M9784a.f25581a.mo7049j().f36067c;
                    RectF rectF2 = null;
                    if (mxkVar.contains(((gva) M9784a.f25582b).f26477h)) {
                        obj2 = ((gva) M9784a.f25582b).f26477h;
                    } else if (mxkVar.contains(((gva) M9784a.f25582b).f26474e)) {
                        obj = ((gva) M9784a.f25582b).f26474e;
                    } else {
                        r8 = 0;
                    }
                    if (r8 != 0) {
                        r8 = obj;
                        r8 = obj2;
                        zEquals = ((cgj) obj5).f5611d.equals(r8.mo14193c().f36540a);
                    } else {
                        r8 = obj;
                        r8 = obj2;
                        zEquals = false;
                    }
                    kpw kpwVarM9494c = M9784a.m9494c(((gva) M9784a.f25582b).f26477h);
                    if (kpwVarM9494c == null) {
                        kpwVarM9494c = M9784a.m9494c(((gva) M9784a.f25582b).f26474e);
                    }
                    try {
                        if (kpwVarM9494c != null) {
                            try {
                                kpp kppVarMo7042c = r6.mo7042c();
                                if (kppVarMo7042c != null && (fArr = (Float[]) kppVarMo7042c.mo9517d(fvv.f23721e)) != null && fArr.length >= 4) {
                                    float fFloatValue = fArr[0].floatValue();
                                    float fFloatValue2 = fArr[1].floatValue();
                                    float fFloatValue3 = fArr[2].floatValue();
                                    float fFloatValue4 = fArr[3].floatValue();
                                    float f = fFloatValue - (fFloatValue3 * 0.5f);
                                    float f2 = fFloatValue2 - (0.5f * fFloatValue4);
                                    rectF2 = new RectF(f, f2, fFloatValue3 + f, fFloatValue4 + f2);
                                }
                            } catch (IllegalArgumentException e) {
                                ((nbe) ((nbe) cgj.f5608a.m17252c().mo17282g(nch.f41987a, "BobaBufferListener")).mo17276G(78)).mo17293r("Error retrieving track region: %s.", e.getMessage());
                            }
                            ((cgj) obj5).f5609b.mo3645h(kpwVarM9494c, rectF2, zEquals);
                        } else {
                            ((nbe) ((nbe) cgj.f5608a.m17252c().mo17282g(nch.f41987a, "BobaBufferListener")).mo17276G(77)).mo17301z("Missing image for frame %s from camera %s.", r6.mo7041b(), r8 != 0 ? r8.mo14193c() : "");
                        }
                        if (kpwVarM9494c != null) {
                            kpwVarM9494c.close();
                        }
                        r6.close();
                        return;
                    } catch (Throwable th) {
                        if (kpwVarM9494c != null) {
                            try {
                                kpwVarM9494c.close();
                                break;
                            } catch (Throwable th2) {
                                try {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                    break;
                                } catch (Exception e2) {
                                }
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    r6.close();
                    throw th3;
                }
            case 2:
                ((cgm) this.f5620b).f5628c.addView((View) this.f5619a, 0);
                return;
            case 3:
                Object obj6 = this.f5620b;
                ?? r1 = this.f5619a;
                cgn cgnVar = (cgn) obj6;
                cgz cgzVar2 = cgnVar.f5643b;
                cgzVar2.f5711b.setVisibility(4);
                cgzVar2.setVisibility(4);
                cgnVar.f5643b.setAlpha(1.0f);
                cgnVar.f5643b.f5711b.m4033a(cgn.f5642a);
                r1.run();
                return;
            case 4:
                ((cgn) this.f5620b).f5643b.animate().setDuration(167L).alpha(0.0f).withEndAction(this.f5619a).start();
                return;
            case 5:
                Object obj7 = this.f5619a;
                Object obj8 = this.f5620b;
                cgn cgnVar2 = (cgn) obj7;
                cgnVar2.f5643b.setVisibility(0);
                cgnVar2.f5643b.startAnimation((Animation) obj8);
                return;
            case 6:
                this.f5620b.mo2769a(((kmg) this.f5619a).m14576a());
                return;
            case 7:
                Object obj9 = this.f5620b;
                Object obj10 = this.f5619a;
                for (cid cidVar : ((cia) obj9).f5778b) {
                    try {
                        cidVar.mo3797a((Throwable) obj10);
                    } catch (Throwable th4) {
                        ((nbe) ((nbe) ((nbe) cia.f5777a.m17251b()).mo17283h(th4)).mo17276G(182)).mo17301z("%s failed to handle %s", cidVar, obj10);
                    }
                }
                return;
            case 8:
                ((cjd) this.f5620b).f5918a.execute(this.f5619a);
                return;
            case 9:
                Object obj11 = this.f5620b;
                ?? r2 = this.f5619a;
                if (((ckp) obj11).m3843c()) {
                    int iMyTid = Process.myTid();
                    jay jayVarM4035a = CpuSets.m4035a(iMyTid);
                    if (jayVarM4035a == null) {
                        ((nbe) ((nbe) ckp.f5993a.m17252c()).mo17276G((char) 208)).mo17293r("Failed to cpuset-limit thread %s.", Thread.currentThread().getName());
                        eonVar = cgw.f5694g;
                    } else {
                        Trace.beginSection("LimitCpuSet");
                        eonVar = new eon(iMyTid, jayVarM4035a, 1, null, null, null);
                    }
                } else {
                    eonVar = cgw.f5693f;
                }
                try {
                    r2.run();
                    return;
                } finally {
                    eonVar.close();
                }
            case 10:
                ?? r0 = this.f5619a;
                Object obj12 = this.f5620b;
                Iterator it = r0.iterator();
                while (it.hasNext()) {
                    ((cna) it.next()).mo3953f((ikw) obj12);
                }
                return;
            case 11:
                ((cpw) this.f5620b).f8688d.mo5259a((jzf) this.f5619a);
                return;
            case 12:
                Object obj13 = this.f5620b;
                iid iidVar = (iid) this.f5619a;
                ((ViewStub) iidVar.f31066c.findViewById(C0100R.id.camera_intent_layout_stub)).inflate();
                ReviewImageView reviewImageView = (ReviewImageView) iidVar.f31066c.findViewById(C0100R.id.intent_review_imageview);
                reviewImageView.getClass();
                ((cqi) obj13).f8904a = reviewImageView;
                return;
            case 13:
                cqi cqiVar = (cqi) this.f5619a;
                cqiVar.f8904a.m4504b((Bitmap) this.f5620b);
                ReviewImageView reviewImageView2 = cqiVar.f8904a;
                reviewImageView2.announceForAccessibility(reviewImageView2.getContext().getString(C0100R.string.video_accessibility_peek));
                return;
            case 14:
                Object obj14 = this.f5619a;
                bko bkoVar = (bko) this.f5620b;
                cra craVar = (cra) obj14;
                craVar.m5394f((PointF) bkoVar.f3652a, false);
                craVar.m5394f((PointF) bkoVar.f3652a, true);
                return;
            case 15:
                Object obj15 = this.f5620b;
                Object obj16 = this.f5619a;
                synchronized (((cru) obj15).f9181d) {
                    try {
                        crp crpVar = ((cru) obj15).f9187j;
                        if (!((khb) obj16).m14238c().hasArray()) {
                            throw new UnsupportedOperationException("Provided bytebuffer unsupported.");
                        }
                        try {
                            crr crrVar = crpVar.f9158c;
                            if (crrVar.f9161a == null) {
                                throw new IOException("Pipe not connected");
                            }
                            if (!((khb) obj16).m14238c().hasArray()) {
                                throw new UnsupportedOperationException("Provided byte buffer unsupported.");
                            }
                            crrVar.f9161a.m5425b((khb) obj16);
                            crpVar.m5423a();
                        } catch (IOException e3) {
                            throw new IOException("Failed to write audio packet into audio piped output stream.", e3);
                        }
                    } catch (IOException e4) {
                        ((nbe) ((nbe) ((nbe) cru.f9175a.m17251b()).mo17283h(e4)).mo17276G(553)).mo17290o("Failed to write to piped audio buffer.");
                    }
                }
                return;
            case 16:
                ((cru) ((AmbientMode.AmbientController) this.f5620b).f1697a).m5434b(((khb) this.f5619a).m14236a());
                return;
            case 17:
                ((fba) this.f5619a).m8097e(this.f5620b);
                return;
            case 18:
                Object obj17 = this.f5620b;
                try {
                    ((ctl) obj17).f9481c = ((gyj) this.f5619a).f26832a.mo14685e();
                    ((ctl) obj17).f9482d.mo14894e(((ctl) obj17).f9481c.getFD());
                    return;
                } catch (IOException e5) {
                    ((nbe) ((nbe) ((nbe) ctl.f9479a.m17251b()).mo17283h(e5)).mo17276G((char) 610)).mo17290o("Can't open MediaFile.");
                    return;
                }
            case 19:
                Object obj18 = this.f5620b;
                Object obj19 = this.f5619a;
                ((cur) obj18).m5537b(false);
                ((idl) obj19).m11116a(idk.FLASH_DISABLED);
                return;
            default:
                Object obj20 = this.f5620b;
                Object obj21 = this.f5619a;
                if (((cur) obj20).m5540e()) {
                    ((idl) obj21).m11119d(idk.RECORDING_EARLY_STOPPED);
                    return;
                }
                return;
        }
    }
}
