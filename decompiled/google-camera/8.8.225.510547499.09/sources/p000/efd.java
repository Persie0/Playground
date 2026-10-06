package p000;

import android.app.Activity;
import android.content.res.AssetFileDescriptor;
import android.hardware.camera2.CaptureResult;
import android.os.Build;
import com.google.android.apps.camera.hdrplus.deblurfusion.DeblurFusionControllerImpl;
import com.google.android.apps.camera.hdrplus.fusion.jni.FusionZoomControllerNative;
import com.google.android.apps.camera.imax.cyclops.processing.NativeCaptureImpl;
import com.google.android.libraries.vision.opengl.Texture;
import com.google.android.material.behavior.iWN.zuAgeeF;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class efd implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f13811a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f13812b;

    public /* synthetic */ efd(Activity activity, int i) {
        this.f13812b = i;
        this.f13811a = activity;
    }

    public /* synthetic */ efd(DeblurFusionControllerImpl deblurFusionControllerImpl, int i) {
        this.f13812b = i;
        this.f13811a = deblurFusionControllerImpl;
    }

    public /* synthetic */ efd(ect ectVar, int i) {
        this.f13812b = i;
        this.f13811a = ectVar;
    }

    public /* synthetic */ efd(egt egtVar, int i) {
        this.f13812b = i;
        this.f13811a = egtVar;
    }

    public /* synthetic */ efd(eia eiaVar, int i) {
        this.f13812b = i;
        this.f13811a = eiaVar;
    }

    public /* synthetic */ efd(eja ejaVar, int i) {
        this.f13812b = i;
        this.f13811a = ejaVar;
    }

    public /* synthetic */ efd(ejw ejwVar, int i) {
        this.f13812b = i;
        this.f13811a = ejwVar;
    }

    public /* synthetic */ efd(eka ekaVar, int i) {
        this.f13812b = i;
        this.f13811a = ekaVar;
    }

    public efd(ekq ekqVar, int i) {
        this.f13812b = i;
        this.f13811a = ekqVar;
    }

    public efd(eks eksVar, int i) {
        this.f13812b = i;
        this.f13811a = eksVar;
    }

    public /* synthetic */ efd(elv elvVar, int i) {
        this.f13812b = i;
        this.f13811a = elvVar;
    }

    public /* synthetic */ efd(elw elwVar, int i) {
        this.f13812b = i;
        this.f13811a = elwVar;
    }

    public /* synthetic */ efd(jwf jwfVar, int i) {
        this.f13812b = i;
        this.f13811a = jwfVar;
    }

    public /* synthetic */ efd(jww jwwVar, int i) {
        this.f13812b = i;
        this.f13811a = jwwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r0v69, types: [elw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v70, types: [fbp, java.lang.Object] */
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
        mws mwsVarM17095j;
        String str;
        String strMo6182j;
        boolean z = false;
        switch (this.f13812b) {
            case 0:
                ((jwf) this.f13811a).mo3415bf(true);
                return;
            case 1:
                ect ectVar = (ect) this.f13811a;
                ectVar.f13426d.mo13961e("writeDebugMetadata");
                synchronized (ecb.f13333b) {
                    mwsVarM17095j = mws.m17095j(ecb.f13332a);
                    ecb.f13332a.clear();
                    break;
                }
                int size = mwsVarM17095j.size();
                for (int i = 0; i < size; i++) {
                    eca ecaVar = (eca) mwsVarM17095j.get(i);
                    String str2 = ecaVar.f13328a;
                    nro nroVar = ecaVar.f13329b;
                    int i2 = ecaVar.f13330c;
                    kpl kplVar = ecaVar.f13331d;
                    String str3 = "  Result frame " + i2;
                    if (nroVar == nro.f44263b) {
                        str = "payload_burst_actual_hal3.txt";
                    } else if (nroVar == nro.f44264c) {
                        str = "viewfinder_actual_hal3.txt";
                    } else {
                        str = nroVar == nro.f44262a ? "unknown_actual_hal3.txt" : "";
                    }
                    try {
                        FileWriter fileWriter = new FileWriter(new File(str2, str), true);
                        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                        try {
                            try {
                                List<CaptureResult.Key> listMo9519f = kplVar.mo9519f();
                                bufferedWriter.write(String.valueOf(kfv.m14168E(str3, new Object[0])).concat("\n"));
                                for (CaptureResult.Key key : listMo9519f) {
                                    bufferedWriter.write(kfv.m14168E("    %s\n", key.getName()));
                                    bufferedWriter.write(kfv.m14168E("        %s\n", cek.m3558a(kplVar.mo9517d(key))));
                                }
                                try {
                                    bufferedWriter.close();
                                } catch (IOException e) {
                                    ((nbe) ((nbe) ((nbe) cek.f5448a.m17251b()).mo17283h(e)).mo17276G('8')).mo17290o("dumpMetadata - Failed to close writer.");
                                }
                            } catch (IOException e2) {
                                ((nbe) ((nbe) ((nbe) cek.f5448a.m17251b()).mo17283h(e2)).mo17276G(57)).mo17290o("dumpMetadata - Failed to dump metadata");
                                try {
                                    bufferedWriter.close();
                                } catch (IOException e3) {
                                    ((nbe) ((nbe) ((nbe) cek.f5448a.m17251b()).mo17283h(e3)).mo17276G(':')).mo17290o("dumpMetadata - Failed to close writer.");
                                }
                            }
                            fileWriter.close();
                        } catch (Throwable th) {
                            try {
                                bufferedWriter.close();
                                break;
                            } catch (IOException e4) {
                                ((nbe) ((nbe) ((nbe) cek.f5448a.m17251b()).mo17283h(e4)).mo17276G(';')).mo17290o("dumpMetadata - Failed to close writer.");
                            }
                            throw th;
                        }
                    } catch (IOException e5) {
                        ((nbe) ((nbe) ((nbe) cek.f5448a.m17251b()).mo17283h(e5)).mo17276G('<')).mo17290o("Could not write capture data to file.");
                    }
                    break;
                }
                ectVar.f13426d.mo13962f();
                return;
            case 2:
                ((jwf) this.f13811a).mo3415bf(false);
                return;
            case 3:
                Object obj = this.f13811a;
                synchronized (((DeblurFusionControllerImpl) obj).f6726e) {
                    if (((DeblurFusionControllerImpl) obj).f6727f.get()) {
                        nbz nbzVar = nch.f41987a;
                        return;
                    }
                    if (((DeblurFusionControllerImpl) obj).f6723b.mo9617a() == 0) {
                        ((DeblurFusionControllerImpl) obj).f6724c.mo13961e("PortraitSegmenter#init");
                        ((DeblurFusionControllerImpl) obj).f6723b.mo9618b();
                        ((DeblurFusionControllerImpl) obj).f6724c.mo13962f();
                    }
                    ((DeblurFusionControllerImpl) obj).f6724c.mo13961e("DeblurFusionController#loadModelIntoCache");
                    nbz nbzVar2 = nch.f41987a;
                    try {
                        AssetFileDescriptor assetFileDescriptorOpenFd = ((DeblurFusionControllerImpl) obj).f6730i.getAssets().openFd("deblur_01_25_2023_v0.tflite.uncompressed");
                        try {
                            if (!DeblurFusionControllerImpl.loadModelIntoCache(assetFileDescriptorOpenFd.getParcelFileDescriptor().getFd(), assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getLength())) {
                                throw new IllegalStateException("Unable to load model into FusionProcessor");
                            }
                            if (assetFileDescriptorOpenFd != null) {
                                assetFileDescriptorOpenFd.close();
                            }
                            ((DeblurFusionControllerImpl) obj).f6724c.mo13963g("DeblurFusionController#init");
                            ((DeblurFusionControllerImpl) obj).f6727f.set(DeblurFusionControllerImpl.initialize(Build.DEVICE, ((DeblurFusionControllerImpl) obj).m4169a()));
                            ((DeblurFusionControllerImpl) obj).f6724c.mo13962f();
                            if (((DeblurFusionControllerImpl) obj).f6727f.get()) {
                                ((DeblurFusionControllerImpl) obj).f6728g.mo3415bf(true);
                            } else {
                                ((nbe) ((nbe) DeblurFusionControllerImpl.f6722a.m17252c().mo17282g(nch.f41987a, zuAgeeF.OhSEjjNrY)).mo17276G(1367)).mo17290o("Failed to initialize DeblurFusionController.");
                            }
                            return;
                        } catch (Throwable th2) {
                            if (assetFileDescriptorOpenFd != null) {
                                try {
                                    assetFileDescriptorOpenFd.close();
                                    break;
                                } catch (Throwable th3) {
                                    try {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                                        break;
                                    } catch (Exception e6) {
                                    }
                                }
                            }
                            throw th2;
                        }
                    } catch (IOException e7) {
                        throw new IllegalStateException("Unable to open Fusion Deblur model asset file", e7);
                    } catch (RuntimeException e8) {
                        throw new IllegalStateException("Failed to initialize Fusion Deblur", e8);
                    }
                }
            case 4:
                ((DeblurFusionControllerImpl) this.f13811a).m4174f();
                return;
            case 5:
                ((jwf) this.f13811a).mo3415bf(true);
                return;
            case 6:
                ((jwf) this.f13811a).mo3415bf(false);
                return;
            case 7:
                Object obj2 = this.f13811a;
                synchronized (((egt) obj2).f14004g) {
                    boolean zMo6184l = ((egt) obj2).f14002e.mo6184l(dht.f11187o);
                    if (((egt) obj2).f14006i.get() && ((egt) obj2).f14007j == zMo6184l) {
                        ((nbe) ((nbe) egt.f13998a.m17252c()).mo17276G(1447)).mo17290o("Already initialized.");
                        return;
                    }
                    if (((egt) obj2).f14003f.mo9617a() == 0) {
                        ((egt) obj2).f14001d.mo13961e("PortraitSegmenter#init");
                        ((egt) obj2).f14003f.mo9618b();
                        ((egt) obj2).f14001d.mo13962f();
                    }
                    ((egt) obj2).f14001d.mo13961e("FusionZoomController#loadModelAsset");
                    if (zMo6184l) {
                        strMo6182j = ((egt) obj2).f14002e.mo6182j(dht.f11172E);
                        strMo6182j.getClass();
                    } else {
                        strMo6182j = ((egt) obj2).f14002e.mo6182j(dht.f11171D);
                        strMo6182j.getClass();
                    }
                    try {
                        AssetFileDescriptor assetFileDescriptorOpenFd2 = ((egt) obj2).f14005h.getAssets().openFd(strMo6182j);
                        try {
                            if (!FusionZoomControllerNative.loadModelIntoCache(assetFileDescriptorOpenFd2.getParcelFileDescriptor().getFd(), assetFileDescriptorOpenFd2.getStartOffset(), assetFileDescriptorOpenFd2.getLength())) {
                                throw new IllegalStateException("Unable to load model into SuperResProcessor");
                            }
                            if (assetFileDescriptorOpenFd2 != null) {
                                assetFileDescriptorOpenFd2.close();
                            }
                            ((egt) obj2).f14001d.mo13963g("FusionZoomController#init");
                            ((egt) obj2).f14006i.set(FusionZoomControllerNative.initialize(Build.DEVICE, ((egt) obj2).m7310a()));
                            if (zMo6184l && ((egt) obj2).f14006i.get()) {
                                z = true;
                            }
                            ((egt) obj2).f14007j = z;
                            ((egt) obj2).f14001d.mo13962f();
                            ((egt) obj2).f13999b.mo3415bf(true);
                            return;
                        } catch (Throwable th4) {
                            if (assetFileDescriptorOpenFd2 != null) {
                                try {
                                    assetFileDescriptorOpenFd2.close();
                                    break;
                                } catch (Throwable th5) {
                                    try {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th4, th5);
                                        break;
                                    } catch (Exception e9) {
                                    }
                                }
                            }
                            throw th4;
                        }
                    } catch (IOException e10) {
                        throw new IllegalStateException("Unable to open model asset file", e10);
                    } catch (RuntimeException e11) {
                        throw new IllegalStateException("Failed to initialize Fusion Zoom", e11);
                    }
                }
            case 8:
                this.f13811a.mo3415bf(0);
                return;
            case 9:
                this.f13811a.mo3415bf(1);
                return;
            case 10:
                ((eia) this.f13811a).f14120a.mo8564b(ikw.IMAX);
                return;
            case 11:
                ((Activity) this.f13811a).setRequestedOrientation(4);
                return;
            case 12:
                eja ejaVar = (eja) this.f13811a;
                ejaVar.f14248b.close();
                ejaVar.f14261o.close();
                return;
            case 13:
                ((eja) this.f13811a).m7389h(true, 1);
                return;
            case 14:
                ((ejx) this.f13811a).mo7350a();
                return;
            case 15:
                ((ejw) this.f13811a).f14430c.mo8564b(ikw.IMAX);
                return;
            case 16:
                ((ekq) this.f13811a).m7416f();
                return;
            case 17:
                ((eks) this.f13811a).f14495d.release();
                return;
            case 18:
                eks eksVar = (eks) this.f13811a;
                ekf ekfVar = eksVar.f14495d;
                Texture texture = eksVar.f14500i;
                eko ekoVar = eksVar.f14499h;
                NativeCaptureImpl nativeCaptureImpl = (NativeCaptureImpl) ekfVar;
                nativeCaptureImpl.initialize(texture.getName(), texture.getWidth(), texture.getHeight(), (int) Math.max(Math.round(Math.log((ekoVar.f14475a * ekoVar.f14476b) / 32400) / Math.log(4.0d)), 0.0d), nativeCaptureImpl.f6742a, nativeCaptureImpl.f6743b);
                return;
            case 19:
                this.f13811a.mo7498g();
                return;
            default:
                ?? r0 = this.f13811a;
                ((elv) r0).f14674c.m8097e(r0);
                return;
        }
    }
}
