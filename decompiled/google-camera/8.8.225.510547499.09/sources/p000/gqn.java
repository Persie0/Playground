package p000;

import android.animation.ValueAnimator;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.os.SystemClock;
import com.google.android.apps.camera.p014ui.views.FrontLensIndicatorOverlay;
import com.google.android.apps.camera.processing.ProcessingService;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gqn implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f26076a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f26077b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f26078c;

    public /* synthetic */ gqn(ProcessingService processingService, fcn fcnVar, int i) {
        this.f26078c = i;
        this.f26076a = processingService;
        this.f26077b = fcnVar;
    }

    public /* synthetic */ gqn(djm djmVar, SensorEventListener sensorEventListener, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f26078c = i;
        this.f26076a = djmVar;
        this.f26077b = sensorEventListener;
    }

    public /* synthetic */ gqn(goh gohVar, key keyVar, int i) {
        this.f26078c = i;
        this.f26077b = gohVar;
        this.f26076a = keyVar;
    }

    public gqn(grc grcVar, grh grhVar, int i) {
        this.f26078c = i;
        this.f26077b = grcVar;
        this.f26076a = grhVar;
    }

    public gqn(grc grcVar, kpw kpwVar, int i) {
        this.f26078c = i;
        this.f26077b = grcVar;
        this.f26076a = kpwVar;
    }

    public /* synthetic */ gqn(gvu gvuVar, ikw ikwVar, int i) {
        this.f26078c = i;
        this.f26077b = gvuVar;
        this.f26076a = ikwVar;
    }

    public /* synthetic */ gqn(gye gyeVar, gyu gyuVar, int i) {
        this.f26078c = i;
        this.f26077b = gyeVar;
        this.f26076a = gyuVar;
    }

    public /* synthetic */ gqn(gye gyeVar, Consumer consumer, int i) {
        this.f26078c = i;
        this.f26077b = gyeVar;
        this.f26076a = consumer;
    }

    public gqn(gzs gzsVar, Object obj, int i) {
        this.f26078c = i;
        this.f26077b = gzsVar;
        this.f26076a = obj;
    }

    public /* synthetic */ gqn(hbs hbsVar, hbr hbrVar, int i) {
        this.f26078c = i;
        this.f26076a = hbsVar;
        this.f26077b = hbrVar;
    }

    public /* synthetic */ gqn(hdk hdkVar, kmd kmdVar, int i) {
        this.f26078c = i;
        this.f26077b = hdkVar;
        this.f26076a = kmdVar;
    }

    public /* synthetic */ gqn(hdk hdkVar, kpp kppVar, int i) {
        this.f26078c = i;
        this.f26077b = hdkVar;
        this.f26076a = kppVar;
    }

    public /* synthetic */ gqn(hdk hdkVar, kpw kpwVar, int i) {
        this.f26078c = i;
        this.f26077b = hdkVar;
        this.f26076a = kpwVar;
    }

    public /* synthetic */ gqn(hdp hdpVar, kpw kpwVar, int i) {
        this.f26078c = i;
        this.f26077b = hdpVar;
        this.f26076a = kpwVar;
    }

    public /* synthetic */ gqn(jww jwwVar, jww jwwVar2, int i) {
        this.f26078c = i;
        this.f26077b = jwwVar;
        this.f26076a = jwwVar2;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x02ae  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [gqt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kpw] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r1v34, types: [android.hardware.SensorEventListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v35, types: [android.hardware.SensorEventListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, key] */
    /* JADX WARN: Type inference failed for: r1v40, types: [java.lang.Object, java.util.function.Consumer] */
    /* JADX WARN: Type inference failed for: r1v50, types: [java.lang.Object, kpp] */
    /* JADX WARN: Type inference failed for: r1v53, types: [java.lang.Object, kpw] */
    /* JADX WARN: Type inference failed for: r2v66, types: [java.lang.Object, kmd] */
    /* JADX WARN: Type inference failed for: r2v67, types: [java.lang.Object, kpw] */
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
        gqs gqsVar;
        kpp kppVarM9557b;
        kmg kmgVar;
        int i;
        int i2 = 7;
        int i3 = 19;
        int i4 = 2;
        int i5 = 3;
        int i6 = 1;
        switch (this.f26078c) {
            case 0:
                ?? r0 = this.f26076a;
                Object obj = this.f26077b;
                while (true) {
                    try {
                        try {
                            gqq gqqVar = ((ProcessingService) r0).f6868k;
                            synchronized (gqqVar.f26081b) {
                                if (gqqVar.f26082c.isEmpty() || gqqVar.f26084e) {
                                    gqqVar.f26080a.mo13940b("Popping null. On hold? " + gqqVar.f26084e);
                                    gqqVar.f26086g = 2;
                                    gqsVar = null;
                                } else {
                                    gqsVar = (gqs) gqqVar.f26082c.remove();
                                    gqqVar.f26080a.mo13940b("Popping a session. Remaining: " + gqqVar.f26082c.size() + " , task " + String.valueOf(gqsVar));
                                }
                            }
                            if (gqsVar == null) {
                                synchronized (((ProcessingService) r0).f6859b) {
                                    ((ProcessingService) r0).f6861d = null;
                                    break;
                                }
                                synchronized (((ProcessingService) r0).f6863f) {
                                    ((ProcessingService) r0).f6864g = false;
                                    ((ProcessingService) r0).f6865h = false;
                                    ((ProcessingService) r0).f6866i = true;
                                    break;
                                }
                                return;
                            }
                            synchronized (((ProcessingService) r0).f6859b) {
                                ((ProcessingService) r0).f6861d = gqsVar;
                                if (((ProcessingService) r0).f6862e) {
                                    ((ProcessingService) r0).f6861d.mo7369g();
                                }
                            }
                            ((fcn) obj).m8125d(gqsVar.mo7364b());
                            ((ProcessingService) r0).f6858a.setContentText("…").setProgress(100, 0, false);
                            ((ProcessingService) r0).m4252c();
                            gqr gqrVarMo7363a = gqsVar.mo7363a();
                            if (gqrVarMo7363a != 0) {
                                gqrVarMo7363a.mo9653c(r0);
                            }
                            System.gc();
                            ((ProcessingService) r0).f6860c.m9654a(gqsVar.mo7364b());
                            gqsVar.mo7366d((Context) r0);
                            ((fcn) obj).m8123b();
                        } catch (Throwable th) {
                            ((ProcessingService) r0).f6872o.execute(new gpn(th, 10));
                            break;
                        }
                        ((ProcessingService) r0).f6872o.execute(new gpn(th, 10));
                        return;
                    } finally {
                        ((fcn) obj).m8122a();
                        ((ProcessingService) r0).stopSelf();
                    }
                }
                break;
            case 1:
                Object obj2 = this.f26077b;
                ?? r1 = this.f26076a;
                kfd kfdVarMo7041b = r1.mo7041b();
                if (kfdVarMo7041b == null) {
                    return;
                }
                gmc gmcVarM9784a = ((goh) obj2).f25866f.m9784a(r1);
                kpw kpwVarM9496e = gmcVarM9784a.m9496e();
                AutoCloseable ezcVar = kpwVarM9496e != null ? new ezc(kpwVarM9496e, i3) : gog.f25848a;
                if (kpwVarM9496e == null) {
                    return;
                }
                kpp kppVarMo7042c = r1.mo7042c();
                if (kppVarMo7042c == null) {
                    kpwVarM9496e.close();
                    return;
                }
                kmg kmgVarMo14193c = gmcVarM9784a.m9492a().mo14193c();
                try {
                    if (!((goh) obj2).f25862b.mo7156w(kppVarMo7042c, kmgVarMo14193c)) {
                        kpwVarM9496e.close();
                        return;
                    }
                    kpw kpwVarM9495d = gmcVarM9784a.m9495d();
                    kpw kpwVarM9497f = gmcVarM9784a.m9497f();
                    jvb jvbVar = new jvb();
                    jvbVar.m13537d(kpwVarM9496e);
                    if (kpwVarM9497f != null) {
                        jvbVar.m13537d(kpwVarM9497f);
                    }
                    if (kpwVarM9495d != null) {
                        jvbVar.m13537d(kpwVarM9495d);
                    }
                    if (kpwVarM9497f != null) {
                        try {
                            kgg kggVarM9493b = gmcVarM9784a.m9493b();
                            if (kggVarM9493b != null) {
                                kmg kmgVarMo14193c2 = kggVarM9493b.mo14193c();
                                kppVarM9557b = gnk.m9557b(kppVarMo7042c, kmgVarMo14193c2.f36540a);
                                kmgVar = kmgVarMo14193c2;
                            } else {
                                kmgVar = null;
                                kppVarM9557b = null;
                            }
                        } catch (RuntimeException e) {
                            e = e;
                            ezcVar = jvbVar;
                            ((nbe) ((nbe) ((nbe) goh.f25861a.m17251b()).mo17283h(e)).mo17276G((char) 3122)).mo17290o("Error binning frame");
                            ezcVar.close();
                            return;
                        }
                    } else {
                        kmgVar = null;
                        kppVarM9557b = null;
                    }
                    ((goh) obj2).f25864d.add(kmgVarMo14193c);
                    if (((goh) obj2).f25862b.mo7126A(kmgVarMo14193c, kppVarMo7042c, kpwVarM9496e, kpwVarM9495d, kmgVar, kppVarM9557b, kpwVarM9497f)) {
                        ((goh) obj2).f25863c.mo9415o(kfdVarMo7041b);
                        return;
                    }
                    return;
                } catch (RuntimeException e2) {
                    e = e2;
                }
                break;
            case 2:
                gri griVar = ((grc) this.f26077b).f26118k;
                Object obj3 = this.f26076a;
                synchronized (griVar.f26136a) {
                    if (griVar.f26136a.contains(obj3)) {
                        griVar.f26136a.remove(obj3);
                        griVar.f26137b.remove(obj3);
                        griVar.f26136a.size();
                    } else {
                        griVar.f26136a.size();
                    }
                    break;
                }
                return;
            case 3:
                this.f26076a.close();
                ((grc) this.f26077b).f26117j++;
                return;
            case 4:
                ?? r2 = this.f26077b;
                ?? r3 = this.f26076a;
                if (ivu.f32376d != null) {
                    r2.mo3415bf(1);
                }
                r3.mo3415bf(true);
                return;
            case 5:
                ?? r4 = this.f26077b;
                ?? r5 = this.f26076a;
                if (ivu.f32376d != null) {
                    r4.mo3415bf(2);
                }
                r5.mo3415bf(false);
                return;
            case 6:
                Object obj4 = this.f26077b;
                Object obj5 = this.f26076a;
                FrontLensIndicatorOverlay frontLensIndicatorOverlay = ((gvu) obj4).f26537j;
                boolean zEquals = ((ikw) obj5).equals(ikw.LONG_EXPOSURE);
                dhl dhlVar = frontLensIndicatorOverlay.f7227c;
                if (dhlVar == null) {
                    ((nbe) ((nbe) FrontLensIndicatorOverlay.f7225a.m17251b()).mo17276G((char) 4269)).mo17290o("Not showing due to cutout info is null.");
                    return;
                }
                if (frontLensIndicatorOverlay.f7232h == 9) {
                    frontLensIndicatorOverlay.f7237m = zEquals ? ill.m11431b(dhlVar.f11135d) : ill.m11431b(dhlVar.f11134c);
                } else {
                    frontLensIndicatorOverlay.f7237m = zEquals ? dhlVar.f11135d : dhlVar.f11134c;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, frontLensIndicatorOverlay.f7234j);
                valueAnimatorOfFloat.setDuration(167L);
                valueAnimatorOfFloat.setInterpolator(frontLensIndicatorOverlay.f7231g);
                valueAnimatorOfFloat.addListener(new iiv(frontLensIndicatorOverlay));
                valueAnimatorOfFloat.addUpdateListener(new ibw(frontLensIndicatorOverlay, 19));
                valueAnimatorOfFloat.start();
                frontLensIndicatorOverlay.invalidate();
                return;
            case 7:
                Object obj6 = this.f26076a;
                ?? r6 = this.f26077b;
                djm djmVar = (djm) obj6;
                Object obj7 = djmVar.f11788b;
                Object obj8 = djmVar.f11787a;
                obj8.getClass();
                ((SensorManager) obj7).unregisterListener((SensorEventListener) r6, (Sensor) obj8);
                return;
            case 8:
                Object obj9 = this.f26076a;
                ?? r7 = this.f26077b;
                djm djmVar2 = (djm) obj9;
                Object obj10 = djmVar2.f11788b;
                Object obj11 = djmVar2.f11787a;
                obj11.getClass();
                ((SensorManager) obj10).registerListener((SensorEventListener) r7, (Sensor) obj11, 3);
                return;
            case 9:
                ((gye) this.f26077b).m9969d(new fvi((gyu) this.f26076a, 20));
                return;
            case 10:
                Object obj12 = this.f26077b;
                gyu gyuVar = (gyu) this.f26076a;
                ((gye) obj12).m9967b(new gyc(gyuVar, i5), gyuVar);
                return;
            case 11:
                Object obj13 = this.f26077b;
                ?? r8 = this.f26076a;
                synchronized (((gye) obj13).f26822b) {
                    ((gye) obj13).m9968c(r8);
                    break;
                }
                return;
            case 12:
                ((gye) this.f26077b).m9969d(new gyc((gyu) this.f26076a, i4));
                return;
            case 13:
                Object obj14 = this.f26077b;
                gyu gyuVar2 = (gyu) this.f26076a;
                ((gye) obj14).m9967b(new fvi(gyuVar2, i3), gyuVar2);
                return;
            case 14:
                Object obj15 = this.f26077b;
                gyu gyuVar3 = (gyu) this.f26076a;
                ((gye) obj15).m9967b(new gyc(gyuVar3, i6), gyuVar3);
                return;
            case 15:
                kbg kbgVar = ((gzs) this.f26077b).f26969a;
                Object obj16 = this.f26076a;
                lku.m15662p(obj16);
                kbgVar.mo3415bf(obj16);
                return;
            case 16:
                ((hbs) this.f26076a).f27165b.unregisterAvailabilityCallback((CameraManager.AvailabilityCallback) this.f26077b);
                return;
            case 17:
                ((hdk) this.f26077b).m10122h(new hdb((kpp) this.f26076a, 5));
                return;
            case 18:
                Object obj17 = this.f26077b;
                ?? r9 = this.f26076a;
                kmq kmqVarMo14558k = r9.mo14558k();
                hdk hdkVar = (hdk) obj17;
                if (!hdkVar.f27340p.equals(kmqVarMo14558k)) {
                    hdkVar.f27340p = kmqVarMo14558k;
                    hdkVar.m10122h(new hdb(hdkVar, i2));
                }
                hdkVar.m10122h(new hdb((kmd) r9, i6));
                hdkVar.f27341q = r9;
                return;
            case 19:
                Object obj18 = this.f26077b;
                ?? r10 = this.f26076a;
                jvd.m13538a();
                final hdk hdkVar2 = (hdk) obj18;
                if (!hdkVar2.f27344t || hdkVar2.f27345u >= 3) {
                    r10.close();
                    return;
                }
                if (r10.mo7247c() != hdkVar2.f27350z || r10.mo7246b() != hdkVar2.f27321A) {
                    hdkVar2.f27350z = r10.mo7247c();
                    hdkVar2.f27321A = r10.mo7246b();
                    hdkVar2.m10124j();
                }
                hdkVar2.f27345u++;
                final kmv kmvVar = new kmv(new hdh(r10, new gxw(hdkVar2, i2)));
                hdkVar2.m10122h(new hdi() { // from class: hdd
                    @Override // p000.hdi
                    /* JADX INFO: renamed from: a */
                    public final void mo10117a(Object obj19) {
                        hdk hdkVar3 = hdkVar2;
                        kpw kpwVarM14585k = kmvVar.m14585k();
                        if (kpwVarM14585k == null) {
                            ((nbe) ((nbe) hdk.f27320a.m17251b()).mo17276G((char) 3479)).mo17290o("Unable to fork ref counted image");
                            return;
                        }
                        int i7 = hdkVar3.f27322B;
                        SystemClock.elapsedRealtime();
                        hdz hdzVar = (hdz) obj19;
                        lku.m15613H(hdzVar.f27413d);
                        if (hdzVar.f27414e) {
                            hes hesVar = hdzVar.f27410a;
                            if (hesVar instanceof hep) {
                                ((hep) hesVar).mo8067h(kpwVarM14585k, i7);
                                return;
                            }
                        }
                        kpwVarM14585k.close();
                    }
                });
                kmvVar.m14586l();
                return;
            default:
                Object obj19 = this.f26077b;
                ?? r11 = this.f26076a;
                hdp hdpVar = (hdp) obj19;
                synchronized (hdpVar.f27368d) {
                    i = ((hdp) obj19).f27369e;
                    break;
                }
                if (i >= 3) {
                    r11.close();
                    return;
                }
                synchronized (hdpVar.f27368d) {
                    ((hdp) obj19).f27369e++;
                    break;
                }
                kmv kmvVar2 = new kmv(new hch(r11, new gxw(hdpVar, 12)));
                kpw kpwVarM14585k = kmvVar2.m14585k();
                if (kpwVarM14585k != null) {
                    hdo hdoVar = hdpVar.f27370f;
                    SystemClock.elapsedRealtime();
                    hdoVar.mo6016l(kpwVarM14585k);
                } else {
                    ((nbe) ((nbe) hdp.f27365a.m17251b()).mo17276G((char) 3482)).mo17290o("Unable to fork ref counted image");
                }
                kmvVar2.m14586l();
                return;
        }
    }
}
