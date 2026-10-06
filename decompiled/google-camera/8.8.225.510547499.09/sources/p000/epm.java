package p000;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.apps.camera.jni.microvideotonemap.MicrovideoToneMapNative;
import com.google.android.apps.camera.p014ui.views.ViewfinderCover;
import com.google.android.libraries.lens.lenslite.api.LinkChipResult;
import com.google.android.material.behavior.iWN.zuAgeeF;
import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.YuvWriteView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p021j$.util.Collection$EL;
import p021j$.util.stream.Stream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class epm implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f14995a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f14996b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f14997c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f14998d;

    public /* synthetic */ epm(cwx cwxVar, Runnable runnable, Runnable runnable2, int i, byte[] bArr) {
        this.f14998d = i;
        this.f14995a = cwxVar;
        this.f14997c = runnable;
        this.f14996b = runnable2;
    }

    public /* synthetic */ epm(eem eemVar, List list, ept eptVar, int i) {
        this.f14998d = i;
        this.f14995a = eemVar;
        this.f14996b = list;
        this.f14997c = eptVar;
    }

    public /* synthetic */ epm(epr eprVar, jwf jwfVar, epy epyVar, int i) {
        this.f14998d = i;
        this.f14995a = eprVar;
        this.f14996b = jwfVar;
        this.f14997c = epyVar;
    }

    public /* synthetic */ epm(epr eprVar, kpw kpwVar, FrameMetadata frameMetadata, int i) {
        this.f14998d = i;
        this.f14995a = eprVar;
        this.f14997c = kpwVar;
        this.f14996b = frameMetadata;
    }

    public /* synthetic */ epm(evg evgVar, Uri uri, byte[] bArr, int i) {
        this.f14998d = i;
        this.f14997c = evgVar;
        this.f14995a = uri;
        this.f14996b = bArr;
    }

    public /* synthetic */ epm(ezi eziVar, LinkChipResult linkChipResult, kwe kweVar, int i) {
        this.f14998d = i;
        this.f14995a = eziVar;
        this.f14997c = linkChipResult;
        this.f14996b = kweVar;
    }

    public /* synthetic */ epm(fgh fghVar, fgg fggVar, drj drjVar, int i, byte[] bArr, byte[] bArr2) {
        this.f14998d = i;
        this.f14996b = fghVar;
        this.f14997c = fggVar;
        this.f14995a = drjVar;
    }

    public /* synthetic */ epm(fkr fkrVar, nps npsVar, nps npsVar2, int i) {
        this.f14998d = i;
        this.f14995a = fkrVar;
        this.f14997c = npsVar;
        this.f14996b = npsVar2;
    }

    public /* synthetic */ epm(fpa fpaVar, ViewfinderCover viewfinderCover, ikw ikwVar, int i) {
        this.f14998d = i;
        this.f14995a = fpaVar;
        this.f14997c = viewfinderCover;
        this.f14996b = ikwVar;
    }

    public /* synthetic */ epm(frr frrVar, frv frvVar, kpw kpwVar, int i) {
        this.f14998d = i;
        this.f14995a = frrVar;
        this.f14997c = frvVar;
        this.f14996b = kpwVar;
    }

    public /* synthetic */ epm(frx frxVar, ftf ftfVar, glk glkVar, int i, byte[] bArr, byte[] bArr2) {
        this.f14998d = i;
        this.f14995a = frxVar;
        this.f14997c = ftfVar;
        this.f14996b = glkVar;
    }

    public /* synthetic */ epm(gdf gdfVar, kfd kfdVar, key keyVar, int i) {
        this.f14998d = i;
        this.f14995a = gdfVar;
        this.f14996b = kfdVar;
        this.f14997c = keyVar;
    }

    public epm(ggk ggkVar, Executor executor, kbg kbgVar, int i) {
        this.f14998d = i;
        this.f14995a = ggkVar;
        this.f14996b = executor;
        this.f14997c = kbgVar;
    }

    public /* synthetic */ epm(jvb jvbVar, grz grzVar, nps npsVar, int i, byte[] bArr) {
        this.f14998d = i;
        this.f14997c = jvbVar;
        this.f14995a = grzVar;
        this.f14996b = npsVar;
    }

    public /* synthetic */ epm(mrm mrmVar, jvb jvbVar, kfk kfkVar, int i) {
        this.f14998d = i;
        this.f14996b = mrmVar;
        this.f14995a = jvbVar;
        this.f14997c = kfkVar;
    }

    public /* synthetic */ epm(oju ojuVar, oju ojuVar2, Executor executor, int i) {
        this.f14998d = i;
        this.f14997c = ojuVar;
        this.f14996b = ojuVar2;
        this.f14995a = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r2v18, types: [com.google.android.libraries.lens.lenslite.api.LinkChipResult, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v19, types: [com.google.android.libraries.lens.lenslite.api.LinkChipResult, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kpw] */
    /* JADX WARN: Type inference failed for: r2v33, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r2v34, types: [ftf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v35, types: [ftf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v52, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v35, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r3v40, types: [java.lang.Object, kpw] */
    /* JADX WARN: Type inference failed for: r3v45, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v46, types: [java.lang.Object, nps] */
    /* JADX WARN: Type inference failed for: r3v47, types: [java.lang.Object, key] */
    /* JADX WARN: Type inference failed for: r5v30, types: [java.lang.Object, kfk] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.concurrent.Future] */
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
        kpw kpwVarM14585k;
        int i = 19;
        int i2 = 0;
        int i3 = 2;
        switch (this.f14998d) {
            case 0:
                Object obj = this.f14995a;
                Object obj2 = this.f14996b;
                Object obj3 = this.f14997c;
                synchronized (((epr) obj).f15013b) {
                    ((jwf) obj2).mo3415bf(false);
                    ((epy) obj3).m7660b();
                    break;
                }
                return;
            case 1:
                Object obj4 = this.f14995a;
                ?? r2 = this.f14997c;
                Object obj5 = this.f14996b;
                epr eprVar = (epr) obj4;
                eprVar.f15021j.mo13961e("MotionBlurVf#wrapYuv");
                YuvWriteView yuvWriteViewM17650c = eprVar.f15026o.m17650c(r2);
                eprVar.f15021j.mo13962f();
                ekr ekrVar = new ekr((kpw) r2, eprVar.f15021j.mo13957a("MotionBlurVf#addVfFrameToRelease"), 11);
                epy epyVar = eprVar.f15014c;
                synchronized (epyVar.f15065b) {
                    long j = epyVar.f15067d;
                    if (j != 0) {
                        epyVar.f15066c.addViewfinderFrame(j, YuvWriteView.m5150c(yuvWriteViewM17650c), FrameMetadata.m4951b((FrameMetadata) obj5), ekrVar);
                        return;
                    } else {
                        ekrVar.run();
                        return;
                    }
                }
            case 2:
                Object obj6 = this.f14995a;
                ?? r3 = this.f14997c;
                ?? r4 = this.f14996b;
                if (((eqb) ((cwx) obj6).f9907c).f15097f) {
                    r4.run();
                    return;
                } else {
                    r3.run();
                    return;
                }
            case 3:
                Object obj7 = this.f14995a;
                ?? r5 = this.f14996b;
                Object obj8 = this.f14997c;
                ((eem) obj7).m7218a();
                for (ntv ntvVar : r5) {
                    ntvVar.f44591b.m4953c();
                    ntvVar.f44593d.run();
                }
                ((ept) obj8).m7645d();
                return;
            case 4:
                Object obj9 = this.f14997c;
                Object obj10 = this.f14995a;
                Object obj11 = this.f14996b;
                Activity activity = (Activity) ((evg) obj9).f20389b.get();
                activity.getClass();
                try {
                    try {
                        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(lro.m15916a(activity, (Uri) obj10, "w").getParcelFileDescriptor());
                        try {
                            System.identityHashCode(obj11);
                            autoCloseOutputStream.write((byte[]) obj11);
                            autoCloseOutputStream.close();
                            return;
                        } catch (Throwable th) {
                            try {
                                autoCloseOutputStream.close();
                                throw th;
                            } catch (Throwable th2) {
                                try {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                    throw th;
                                } catch (Exception e) {
                                    throw th;
                                }
                            }
                        }
                    } catch (IOException e2) {
                        throw new IllegalStateException(e2);
                    }
                } catch (FileNotFoundException e3) {
                    throw new IllegalArgumentException(lku.m15665s("Could not open output uri %s for writing. Called from %s ", obj10, activity.getReferrer()), e3);
                }
            case 5:
                Object obj12 = this.f14995a;
                ?? r6 = this.f14997c;
                Object obj13 = this.f14996b;
                Runnable onCloseButtonClickListener = r6.getOnCloseButtonClickListener();
                onCloseButtonClickListener.getClass();
                onCloseButtonClickListener.run();
                ezi eziVar = (ezi) obj12;
                eziVar.f21042B.m9748m(r6, (kwe) obj13, 4, eziVar.f21065u);
                return;
            case 6:
                Object obj14 = this.f14995a;
                ?? r7 = this.f14997c;
                Object obj15 = this.f14996b;
                ezi eziVar2 = (ezi) obj14;
                if (!eziVar2.f21067w.mo16813g()) {
                    mrm mrmVar = eziVar2.f21066v;
                    if (mrmVar.mo16813g() && ((LinkChipResult) mrmVar.mo16809c()).getId() == r7.getId() && r7.getCenterpoint() != null) {
                        r7.getId();
                        eziVar2.f21042B.m9748m(r7, (kwe) obj15, 5, eziVar2.f21065u);
                    } else {
                        r7.getId();
                        eziVar2.f21042B.m9748m(r7, (kwe) obj15, 2, eziVar2.f21065u);
                    }
                } else if (((LinkChipResult) eziVar2.f21067w.mo16809c()).getId() != r7.getId()) {
                    r7.getId();
                    eziVar2.f21042B.m9748m(r7, (kwe) obj15, 2, eziVar2.f21065u);
                }
                eziVar2.f21067w = mrm.m16829i(r7);
                return;
            case 7:
                Object obj16 = this.f14996b;
                Object obj17 = this.f14997c;
                Object obj18 = this.f14995a;
                fgg fggVar = (fgg) obj17;
                if (fggVar.f21831k.getAndSet(true)) {
                    return;
                }
                fgh fghVar = (fgh) obj16;
                dhv dhvVar = fghVar.f21859k;
                dhx dhxVar = dii.f11525a;
                dhvVar.mo6178f();
                ((nbe) ((nbe) fgh.f21843a.m17251b()).mo17276G(2214)).mo17293r("Microvideo with uri %s timed out; saving fallback.", fggVar.f21821a);
                fghVar.f21858j.mo8423b();
                fggVar.f21834n.mo8412c();
                drj drjVar = (drj) obj18;
                fgh.m8377i(fggVar, drjVar);
                ((hjz) drjVar.f12399e).f28086l = fgh.m8376g(fggVar);
                return;
            case 8:
                Object obj19 = this.f14995a;
                ?? r8 = this.f14997c;
                ?? r9 = this.f14996b;
                kpw kpwVar = (kpw) kxk.m14974T(r8);
                Bitmap bitmap = (Bitmap) kxk.m14974T(r9);
                if (bitmap == null || kpwVar == null) {
                    ((nbe) ((nbe) fkr.f22404a.m17252c()).mo17276G((char) 2354)).mo17290o("Skip tone mapping extraction, either shutter frame or postview bitmap is null.");
                    return;
                }
                nxl nxlVarM18137O = obp.f45346c.m18137O();
                System.currentTimeMillis();
                int iMo7247c = kpwVar.mo7247c();
                int iMo7246b = kpwVar.mo7246b();
                kpv kpvVar = (kpv) kpwVar.mo7251g().get(0);
                kpv kpvVar2 = (kpv) kpwVar.mo7251g().get(1);
                kpv kpvVar3 = (kpv) kpwVar.mo7251g().get(2);
                ByteBuffer byteBufferM7547c = enc.m7547c(iMo7247c, iMo7246b, kpvVar);
                int i4 = iMo7247c / 2;
                int i5 = iMo7246b / 2;
                ByteBuffer byteBufferM7547c2 = enc.m7547c(i4, i5, kpvVar2);
                ByteBuffer byteBufferM7547c3 = enc.m7547c(i4, i5, kpvVar3);
                System.currentTimeMillis();
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int i6 = width * height;
                int i7 = i6 / 4;
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i6);
                ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(i7);
                ByteBuffer byteBufferAllocateDirect3 = ByteBuffer.allocateDirect(i7);
                if (MicrovideoToneMapNative.argbToYuv(bitmap, byteBufferAllocateDirect, byteBufferAllocateDirect2, byteBufferAllocateDirect3) != 0) {
                    throw new IllegalStateException("MicrovideoToneMapNative.argbToYuv failed.");
                }
                System.currentTimeMillis();
                byte[] bArrExtractMeanVarianceMappingNative = MicrovideoToneMapNative.extractMeanVarianceMappingNative(iMo7247c, iMo7246b, byteBufferM7547c, byteBufferM7547c2, byteBufferM7547c3, width, height, byteBufferAllocateDirect, byteBufferAllocateDirect2, byteBufferAllocateDirect3, 3, 4);
                nxl nxlVarM18137O2 = obk.f45310e.m18137O();
                if (!nxlVarM18137O2.f44974b.m18142ac()) {
                    nxlVarM18137O2.mo18106p();
                }
                nxq nxqVar = nxlVarM18137O2.f44974b;
                obk obkVar = (obk) nxqVar;
                obkVar.f45312a |= 1;
                obkVar.f45313b = 3;
                if (!nxqVar.m18142ac()) {
                    nxlVarM18137O2.mo18106p();
                }
                obk obkVar2 = (obk) nxlVarM18137O2.f44974b;
                obkVar2.f45312a = 2 | obkVar2.f45312a;
                obkVar2.f45314c = 4;
                nwr nwrVarM17799u = nwr.m17799u(bArrExtractMeanVarianceMappingNative);
                if (!nxlVarM18137O2.f44974b.m18142ac()) {
                    nxlVarM18137O2.mo18106p();
                }
                obk obkVar3 = (obk) nxlVarM18137O2.f44974b;
                obkVar3.f45312a |= 4;
                obkVar3.f45315d = nwrVarM17799u;
                obk obkVar4 = (obk) nxlVarM18137O2.mo18103l();
                System.currentTimeMillis();
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                obp obpVar = (obp) nxlVarM18137O.f44974b;
                obkVar4.getClass();
                obpVar.f45349b = obkVar4;
                obpVar.f45348a |= 1;
                ((fkr) obj19).f22405b.mo14894e((obp) nxlVarM18137O.mo18103l());
                kpwVar.close();
                return;
            case 9:
                Object obj20 = this.f14995a;
                Object obj21 = this.f14997c;
                Object obj22 = this.f14996b;
                fpa fpaVar = (fpa) obj20;
                fpaVar.f23005g.mo10763n();
                fpaVar.f23011m = true;
                ikw ikwVar = (ikw) obj22;
                ((ViewfinderCover) obj21).m4501m(ikwVar, new ewo(fpaVar, ikwVar, 18));
                return;
            case 10:
                Object obj23 = this.f14995a;
                Object obj24 = this.f14997c;
                Object obj25 = this.f14996b;
                fpa fpaVar2 = (fpa) obj23;
                fpaVar2.f23005g.mo10765p();
                fpaVar2.f23011m = true;
                ikw ikwVar2 = (ikw) obj25;
                ((ViewfinderCover) obj24).m4501m(ikwVar2, new ewo(fpaVar2, ikwVar2, i));
                return;
            case 11:
                Object obj26 = this.f14995a;
                Object obj27 = this.f14997c;
                Object obj28 = this.f14996b;
                fpa fpaVar3 = (fpa) obj26;
                fpaVar3.f23005g.mo10764o();
                fpaVar3.f23011m = true;
                ikw ikwVar3 = (ikw) obj28;
                ((ViewfinderCover) obj27).m4501m(ikwVar3, new ewo(fpaVar3, ikwVar3, 17));
                return;
            case 12:
                ((fgy) this.f14997c.get()).mo8332g(new fjk((oju) this.f14996b, i3), this.f14995a);
                return;
            case 13:
                ((frx) this.f14995a).m8748r(this.f14997c, (glk) this.f14996b);
                return;
            case 14:
                ((frx) this.f14995a).m8746p(this.f14997c, (glk) this.f14996b);
                return;
            case 15:
                Object obj29 = this.f14995a;
                Object obj30 = this.f14997c;
                ?? r10 = this.f14996b;
                synchronized (((frr) obj29).f23346b) {
                    ((frv) obj30).f23347a = false;
                    ((frv) obj30).f23348b = mrm.m16829i(new kmv(r10));
                    ((frv) obj30).f23360e = mrm.m16829i(Long.valueOf(System.currentTimeMillis()));
                    ((frr) obj29).f23346b.m8741k();
                    break;
                }
                return;
            case 16:
                Object obj31 = this.f14997c;
                Object obj32 = this.f14996b;
                ?? r11 = this.f14995a;
                Stream streamConcat = Stream.CC.concat(Collection$EL.stream((Set) ((ohj) obj31).f46012a), Collection$EL.stream(((ohm) obj32).get()).map(egh.f13946l));
                r11.getClass();
                streamConcat.forEach(new fvi((Executor) r11, i3));
                return;
            case 17:
                Object obj33 = this.f14997c;
                Object obj34 = this.f14995a;
                ?? r12 = this.f14996b;
                kba kbaVarM9694c = ((grz) obj34).m9694c();
                ((jvb) obj33).m13537d(kbaVarM9694c);
                r12.mo2282d(new fzz(kbaVarM9694c, i2), not.INSTANCE);
                return;
            case 18:
                Object obj35 = this.f14995a;
                Object obj36 = this.f14996b;
                ?? r13 = this.f14997c;
                synchronized (((gdf) obj35).f24285a) {
                    if (((gdf) obj35).f24286b) {
                        gdh gdhVar = ((gdf) obj35).f24287c;
                        kpp kppVarMo7042c = r13.mo7042c();
                        if (kppVarMo7042c != null && gdhVar.f24298f.mo7269a(r13)) {
                            gdhVar.f24299g.mo13961e("extractImage");
                            gmc gmcVarM9784a = gdhVar.f24305m.m9784a(r13);
                            kpw kpwVarM9496e = gmcVarM9784a.m9496e();
                            gdhVar.f24299g.mo13962f();
                            if (kpwVarM9496e != null) {
                                synchronized (gdhVar.f24295c) {
                                    kmg kmgVarMo14193c = gmcVarM9784a.m9492a().mo14193c();
                                    nbh.f41935b.mo17277H(TimeUnit.MILLISECONDS);
                                    gdhVar.f24299g.mo13961e("fork");
                                    kmv kmvVar = new kmv(kpwVarM9496e);
                                    kpw kpwVarM14585k2 = kmvVar.m14585k();
                                    if (kpwVarM14585k2 != null) {
                                        gdhVar.f24299g.mo13963g(zuAgeeF.MMP);
                                        gdhVar.f24304l.mo3415bf(new fxn(kpwVarM14585k2, kxk.m14965K(kppVarMo7042c)));
                                    }
                                    gdhVar.f24299g.mo13963g("process");
                                    fxn fxnVar = new fxn(new kmw(kmvVar), kxk.m14965K(kppVarMo7042c));
                                    gde gdeVar = gdhVar.f24303k;
                                    synchronized (gdeVar.f24280d) {
                                        if (gdeVar.f24284h) {
                                            ((nbe) ((nbe) gde.f24277a.m17252c()).mo17276G(2554)).mo17290o("Processor closed, ignoring.");
                                            fxnVar.close();
                                        } else if (fxnVar.m8926m()) {
                                            kmv kmvVar2 = gdeVar.f24282f;
                                            if (kmvVar2 != null) {
                                                kmvVar2.m14586l();
                                            }
                                            kmv kmvVar3 = new kmv(fxnVar);
                                            gdeVar.f24283g = kppVarMo7042c;
                                            gdeVar.f24281e = kmgVarMo14193c;
                                            if (((Boolean) gdeVar.f24279c.mo6051a()).booleanValue() && (kpwVarM14585k = kmvVar3.m14585k()) != null) {
                                                gdeVar.f24278b.mo7149p(kmgVarMo14193c, kpwVarM14585k, kppVarMo7042c);
                                            }
                                            gdeVar.f24282f = kmvVar3;
                                        } else {
                                            ((nbe) ((nbe) gde.f24277a.m17252c()).mo17276G(2555)).mo17290o("No Image Data! Ignoring the metering frames.");
                                            fxnVar.close();
                                        }
                                    }
                                    gdhVar.f24299g.mo13962f();
                                }
                            } else {
                                ((nbe) ((nbe) gdh.f24293a.m17252c()).mo17276G(2571)).mo17292q("Null image for frame %s, ignoring.", ((kfd) obj36).f35812c);
                            }
                        }
                    }
                }
                r13.close();
                return;
            case 19:
                this.f14996b.execute(new fro(this, ((ggk) this.f14995a).f24675a.m14647a(), 12, (byte[]) null));
                return;
            default:
                mrm mrmVar2 = (mrm) this.f14996b;
                boolean zMo16813g = mrmVar2.mo16813g();
                Object obj37 = this.f14995a;
                ?? r14 = this.f14997c;
                if (zMo16813g) {
                    gmh gmhVar = (gmh) mrmVar2.mo16809c();
                    ((jvb) obj37).m13537d(gmhVar.mo9504b().mo3830a(new ecr((kfk) r14, gmhVar, i), not.INSTANCE));
                    return;
                }
                return;
        }
    }
}
