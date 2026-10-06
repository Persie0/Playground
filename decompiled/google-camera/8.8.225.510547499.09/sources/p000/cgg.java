package p000;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.hardware.Camera;
import android.os.Handler;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.libraries.lens.lenslite.api.LinkChipResult;
import com.google.googlex.gcam.Gcam;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.JpgEncodeOptions;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.hdrplus.NativeHdrPlusInterface;
import com.google.googlex.gcam.imageio.JpgHelper;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cgg implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f5579a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5580b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f5581c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f5582d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f5583e;

    /* JADX INFO: renamed from: f */
    private final /* synthetic */ int f5584f;

    public cgg(bnb bnbVar, Handler handler, AmbientModeSupport.AmbientController ambientController, bno bnoVar, Camera.PictureCallback pictureCallback, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f5584f = i;
        this.f5579a = bnbVar;
        this.f5581c = handler;
        this.f5582d = ambientController;
        this.f5580b = bnoVar;
        this.f5583e = pictureCallback;
    }

    public /* synthetic */ cgg(chx chxVar, hnw hnwVar, jvd jvdVar, hnv hnvVar, jwf jwfVar, int i) {
        this.f5584f = i;
        this.f5583e = chxVar;
        this.f5579a = hnwVar;
        this.f5580b = jvdVar;
        this.f5581c = hnvVar;
        this.f5582d = jwfVar;
    }

    public /* synthetic */ cgg(chx chxVar, hnw hnwVar, jvd jvdVar, hnv hnvVar, jww jwwVar, int i) {
        this.f5584f = i;
        this.f5583e = chxVar;
        this.f5579a = hnwVar;
        this.f5580b = jvdVar;
        this.f5581c = hnvVar;
        this.f5582d = jwwVar;
    }

    public /* synthetic */ cgg(cur curVar, hah hahVar, Resources resources, gfa gfaVar, idl idlVar, int i) {
        this.f5584f = i;
        this.f5581c = curVar;
        this.f5580b = hahVar;
        this.f5583e = resources;
        this.f5579a = gfaVar;
        this.f5582d = idlVar;
    }

    public /* synthetic */ cgg(dhv dhvVar, fvu fvuVar, mrm mrmVar, cli cliVar, jvb jvbVar, int i) {
        this.f5584f = i;
        this.f5581c = dhvVar;
        this.f5579a = fvuVar;
        this.f5582d = mrmVar;
        this.f5583e = cliVar;
        this.f5580b = jvbVar;
    }

    public /* synthetic */ cgg(dhv dhvVar, oju ojuVar, oju ojuVar2, fgy fgyVar, Executor executor, int i) {
        this.f5584f = i;
        this.f5583e = dhvVar;
        this.f5580b = ojuVar;
        this.f5582d = ojuVar2;
        this.f5581c = fgyVar;
        this.f5579a = executor;
    }

    public /* synthetic */ cgg(dxx dxxVar, dyb dybVar, oju ojuVar, dxr dxrVar, jvb jvbVar, int i) {
        this.f5584f = i;
        this.f5581c = dxxVar;
        this.f5579a = dybVar;
        this.f5582d = ojuVar;
        this.f5583e = dxrVar;
        this.f5580b = jvbVar;
    }

    public /* synthetic */ cgg(efr efrVar, ShotMetadata shotMetadata, InterleavedImageU8 interleavedImageU8, String str, hcu hcuVar, int i, byte[] bArr) {
        this.f5584f = i;
        this.f5583e = efrVar;
        this.f5580b = shotMetadata;
        this.f5579a = interleavedImageU8;
        this.f5582d = str;
        this.f5581c = hcuVar;
    }

    public /* synthetic */ cgg(ezh ezhVar, Bitmap bitmap, LinkChipResult linkChipResult, mrm mrmVar, kwe kweVar, int i) {
        this.f5584f = i;
        this.f5581c = ezhVar;
        this.f5583e = bitmap;
        this.f5579a = linkChipResult;
        this.f5582d = mrmVar;
        this.f5580b = kweVar;
    }

    public /* synthetic */ cgg(ezi eziVar, LinkChipResult linkChipResult, mrm mrmVar, kwe kweVar, LinkChipResult.BitmapProvider bitmapProvider, int i) {
        this.f5584f = i;
        this.f5583e = eziVar;
        this.f5579a = linkChipResult;
        this.f5582d = mrmVar;
        this.f5580b = kweVar;
        this.f5581c = bitmapProvider;
    }

    public /* synthetic */ cgg(jvb jvbVar, jwn jwnVar, eax eaxVar, jww jwwVar, Executor executor, int i) {
        this.f5584f = i;
        this.f5581c = jvbVar;
        this.f5579a = jwnVar;
        this.f5583e = eaxVar;
        this.f5580b = jwwVar;
        this.f5582d = executor;
    }

    public /* synthetic */ cgg(nps npsVar, kbz kbzVar, oju ojuVar, Context context, String str, int i) {
        this.f5584f = i;
        this.f5579a = npsVar;
        this.f5581c = kbzVar;
        this.f5582d = ojuVar;
        this.f5583e = context;
        this.f5580b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, nps] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, nps] */
    /* JADX WARN: Type inference failed for: r0v77, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v45, types: [hah, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v48, types: [dxy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v56, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r2v65, types: [com.google.android.libraries.lens.lenslite.api.LinkChipResult, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v90, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r2v93, types: [hnw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [hnw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r3v3, types: [bno, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v47, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r3v50, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v11, types: [gfa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r4v35, types: [fgy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.hardware.Camera$PictureCallback, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r6v36, types: [com.google.android.libraries.lens.lenslite.api.LinkChipResult$BitmapProvider, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v43, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r9v11, types: [com.google.android.libraries.lens.lenslite.api.LinkChipResult, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int iM17721g;
        nvg nvgVar;
        int i = 22;
        int i2 = 7;
        nuy nuyVar = null;
        int i3 = 0;
        switch (this.f5584f) {
            case 0:
                Object obj = this.f5583e;
                ?? r3 = this.f5579a;
                ?? r4 = this.f5580b;
                Object obj2 = this.f5581c;
                Object obj3 = this.f5582d;
                jvb jvbVar = ((chx) obj).f5767b;
                hny hnyVarM10529a = hnz.m10529a();
                hnyVarM10529a.m10525d("Boba");
                hnyVarM10529a.m10524c(r4);
                hnyVarM10529a.m10528g((hnv) obj2);
                jwf jwfVar = (jwf) obj3;
                hnyVarM10529a.m10527f(new cei(jwfVar, 6));
                hnyVarM10529a.m10526e(new cei(jwfVar, 7));
                jvbVar.m13537d(r3.mo10519f(hnyVarM10529a.m10522a()));
                return;
            case 1:
                if (((bnb) this.f5579a).mo2722g().m2803d()) {
                    return;
                }
                ((bnb) this.f5579a).f3856a.f3880e.m2804e(6);
                bnc bncVar = ((bnb) this.f5579a).f3856a.f3879d;
                Object obj4 = this.f5581c;
                Object obj5 = this.f5582d;
                int i4 = bng.f3872b;
                bng bngVar = (obj4 == null || obj5 == null) ? null : new bng((Handler) obj4, (AmbientModeSupport.AmbientController) obj5, null, null, null, null);
                bncVar.obtainMessage(601, new cvy(bngVar, bne.m2765a((Handler) this.f5581c, this.f5580b), bne.m2765a((Handler) this.f5581c, null), (Camera.PictureCallback) this.f5583e)).sendToTarget();
                return;
            case 2:
                ?? r0 = this.f5581c;
                Object obj6 = this.f5579a;
                Object obj7 = this.f5582d;
                Object obj8 = this.f5583e;
                Object obj9 = this.f5580b;
                if (r0.mo6184l(dhg.f11046a) && ((kmr) obj6).mo14558k() == kmq.f36557a) {
                    mrm mrmVar = (mrm) obj7;
                    if (mrmVar.mo16813g()) {
                        kgg kggVar = (kgg) mrmVar.mo16809c();
                        cli cliVar = (cli) obj8;
                        jwf jwfVar2 = (jwf) cliVar.f6119a.get();
                        jwfVar2.getClass();
                        jww jwwVar = (jww) cliVar.f6120b.get();
                        jwwVar.getClass();
                        cwd cwdVar = (cwd) cliVar.f6121c.get();
                        cwdVar.getClass();
                        clz clzVar = (clz) cliVar.f6122d.get();
                        clzVar.getClass();
                        oju ojuVar = cliVar.f6123e;
                        Executor executor = (Executor) cliVar.f6124f.get();
                        executor.getClass();
                        kfk kfkVar = (kfk) cliVar.f6125g.get();
                        kfkVar.getClass();
                        jwn jwnVar = (jwn) cliVar.f6126h.get();
                        jwnVar.getClass();
                        nta ntaVarM17690a = ((ntb) cliVar.f6127i).get();
                        msa msaVar = (msa) cliVar.f6128j.get();
                        msaVar.getClass();
                        ohb ohbVar = ((ohl) cliVar.f6129k).get();
                        ohbVar.getClass();
                        kbz kbzVar = (kbz) cliVar.f6130l.get();
                        kbzVar.getClass();
                        clh clhVar = new clh(jwfVar2, jwwVar, cwdVar, clzVar, ojuVar, executor, kfkVar, jwnVar, ntaVarM17690a, msaVar, ohbVar, kbzVar, kggVar, null, null, null);
                        ((jvb) obj9).m13537d(clhVar);
                        clhVar.f6106f.execute(new cei(clhVar, 20));
                        return;
                    }
                    return;
                }
                return;
            case 3:
                Object obj10 = this.f5581c;
                ?? r2 = this.f5580b;
                Object obj11 = this.f5583e;
                ?? r5 = this.f5579a;
                Object obj12 = this.f5582d;
                ((cur) obj10).m5537b(true);
                if (((String) r2.mo10031c(gzy.f27063v)).equals(((Resources) obj11).getString(C0100R.string.pref_camera_video_flashmode_torch)) && r5.mo9106E()) {
                    ((idl) obj12).m11119d(idk.FLASH_DISABLED);
                    return;
                }
                return;
            case 4:
                Object obj13 = this.f5581c;
                ?? r6 = this.f5579a;
                ?? r7 = this.f5582d;
                Object obj14 = this.f5583e;
                Object obj15 = this.f5580b;
                ((dxx) obj13).m6887c(r6, (Executor) r7.get());
                ((jvb) obj15).m13537d(((dyb) r6).m6915b((dxr) obj14, (Executor) r7.get()));
                return;
            case 5:
                ?? r1 = this.f5579a;
                final ?? r8 = this.f5581c;
                final ?? r9 = this.f5582d;
                Object obj16 = this.f5583e;
                final String str = (String) this.f5580b;
                final Context context = (Context) obj16;
                final int i5 = 0;
                jvh.m13562j(r1, new kao() { // from class: ecc
                    @Override // p000.kao
                    /* JADX INFO: renamed from: a */
                    public final void mo3483a(Object obj17) {
                        switch (i5) {
                            case 0:
                                kbz kbzVar2 = r8;
                                oju ojuVar2 = r9;
                                Context context2 = context;
                                String str2 = str;
                                kbzVar2.mo13961e("Pecan#initialize");
                                Gcam gcam = (Gcam) ojuVar2.get();
                                nsx nsxVarM7108b = ecd.m7108b();
                                try {
                                    AssetFileDescriptor assetFileDescriptorOpenFd = context2.getAssets().openFd(str2);
                                    try {
                                        ((NativeHdrPlusInterface) nsxVarM7108b).nativeInitializePecanFromOpenFile(assetFileDescriptorOpenFd.getParcelFileDescriptor().getFd(), assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getLength(), Gcam.m4971a(gcam));
                                        if (assetFileDescriptorOpenFd != null) {
                                            assetFileDescriptorOpenFd.close();
                                        }
                                    } catch (Throwable th) {
                                        if (assetFileDescriptorOpenFd == null) {
                                            throw th;
                                        }
                                        try {
                                            assetFileDescriptorOpenFd.close();
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
                                    ((nbe) ((nbe) ((nbe) edt.f13529a.m17251b()).mo17283h(e2)).mo17276G((char) 1325)).mo17290o("Unable to get model asset file");
                                } catch (RuntimeException e3) {
                                    ((nbe) ((nbe) ((nbe) edt.f13529a.m17251b()).mo17283h(e3)).mo17276G((char) 1326)).mo17290o("Failed to initialize Pecan");
                                }
                                kbzVar2.mo13962f();
                                return;
                            default:
                                kbz kbzVar3 = r8;
                                oju ojuVar3 = r9;
                                Context context3 = context;
                                String str3 = str;
                                kbzVar3.mo13961e("Lancet#initialize");
                                Gcam gcam2 = (Gcam) ojuVar3.get();
                                nsx nsxVarM7108b2 = ecd.m7108b();
                                try {
                                    AssetFileDescriptor assetFileDescriptorOpenFd2 = context3.getAssets().openFd(str3);
                                    try {
                                        ((NativeHdrPlusInterface) nsxVarM7108b2).nativeInitializeLancetFromOpenFile(assetFileDescriptorOpenFd2.getParcelFileDescriptor().getFd(), assetFileDescriptorOpenFd2.getStartOffset(), assetFileDescriptorOpenFd2.getLength(), false, Gcam.m4971a(gcam2));
                                        if (assetFileDescriptorOpenFd2 != null) {
                                            assetFileDescriptorOpenFd2.close();
                                        }
                                    } catch (Throwable th3) {
                                        if (assetFileDescriptorOpenFd2 == null) {
                                            throw th3;
                                        }
                                        try {
                                            assetFileDescriptorOpenFd2.close();
                                            throw th3;
                                        } catch (Throwable th4) {
                                            try {
                                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                                                throw th3;
                                            } catch (Exception e4) {
                                                throw th3;
                                            }
                                        }
                                    }
                                } catch (IOException e5) {
                                    ((nbe) ((nbe) ((nbe) edr.f13526a.m17251b()).mo17283h(e5)).mo17276G((char) 1320)).mo17290o("Unable to get model asset file");
                                } catch (RuntimeException e6) {
                                    ((nbe) ((nbe) ((nbe) edr.f13526a.m17251b()).mo17283h(e6)).mo17276G((char) 1321)).mo17293r("Failed to initialize %s", str3);
                                }
                                kbzVar3.mo13962f();
                                return;
                        }
                    }
                }, not.INSTANCE);
                return;
            case 6:
                ?? r10 = this.f5579a;
                final ?? r11 = this.f5581c;
                final ?? r12 = this.f5582d;
                Object obj17 = this.f5583e;
                final String str2 = (String) this.f5580b;
                final Context context2 = (Context) obj17;
                final int i6 = 1;
                jvh.m13562j(r10, new kao() { // from class: ecc
                    @Override // p000.kao
                    /* JADX INFO: renamed from: a */
                    public final void mo3483a(Object obj18) {
                        switch (i6) {
                            case 0:
                                kbz kbzVar2 = r11;
                                oju ojuVar2 = r12;
                                Context context3 = context2;
                                String str3 = str2;
                                kbzVar2.mo13961e("Pecan#initialize");
                                Gcam gcam = (Gcam) ojuVar2.get();
                                nsx nsxVarM7108b = ecd.m7108b();
                                try {
                                    AssetFileDescriptor assetFileDescriptorOpenFd = context3.getAssets().openFd(str3);
                                    try {
                                        ((NativeHdrPlusInterface) nsxVarM7108b).nativeInitializePecanFromOpenFile(assetFileDescriptorOpenFd.getParcelFileDescriptor().getFd(), assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getLength(), Gcam.m4971a(gcam));
                                        if (assetFileDescriptorOpenFd != null) {
                                            assetFileDescriptorOpenFd.close();
                                        }
                                    } catch (Throwable th) {
                                        if (assetFileDescriptorOpenFd == null) {
                                            throw th;
                                        }
                                        try {
                                            assetFileDescriptorOpenFd.close();
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
                                    ((nbe) ((nbe) ((nbe) edt.f13529a.m17251b()).mo17283h(e2)).mo17276G((char) 1325)).mo17290o("Unable to get model asset file");
                                } catch (RuntimeException e3) {
                                    ((nbe) ((nbe) ((nbe) edt.f13529a.m17251b()).mo17283h(e3)).mo17276G((char) 1326)).mo17290o("Failed to initialize Pecan");
                                }
                                kbzVar2.mo13962f();
                                return;
                            default:
                                kbz kbzVar3 = r11;
                                oju ojuVar3 = r12;
                                Context context4 = context2;
                                String str4 = str2;
                                kbzVar3.mo13961e("Lancet#initialize");
                                Gcam gcam2 = (Gcam) ojuVar3.get();
                                nsx nsxVarM7108b2 = ecd.m7108b();
                                try {
                                    AssetFileDescriptor assetFileDescriptorOpenFd2 = context4.getAssets().openFd(str4);
                                    try {
                                        ((NativeHdrPlusInterface) nsxVarM7108b2).nativeInitializeLancetFromOpenFile(assetFileDescriptorOpenFd2.getParcelFileDescriptor().getFd(), assetFileDescriptorOpenFd2.getStartOffset(), assetFileDescriptorOpenFd2.getLength(), false, Gcam.m4971a(gcam2));
                                        if (assetFileDescriptorOpenFd2 != null) {
                                            assetFileDescriptorOpenFd2.close();
                                        }
                                    } catch (Throwable th3) {
                                        if (assetFileDescriptorOpenFd2 == null) {
                                            throw th3;
                                        }
                                        try {
                                            assetFileDescriptorOpenFd2.close();
                                            throw th3;
                                        } catch (Throwable th4) {
                                            try {
                                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                                                throw th3;
                                            } catch (Exception e4) {
                                                throw th3;
                                            }
                                        }
                                    }
                                } catch (IOException e5) {
                                    ((nbe) ((nbe) ((nbe) edr.f13526a.m17251b()).mo17283h(e5)).mo17276G((char) 1320)).mo17290o("Unable to get model asset file");
                                } catch (RuntimeException e6) {
                                    ((nbe) ((nbe) ((nbe) edr.f13526a.m17251b()).mo17283h(e6)).mo17276G((char) 1321)).mo17293r("Failed to initialize %s", str4);
                                }
                                kbzVar3.mo13962f();
                                return;
                        }
                    }
                }, not.INSTANCE);
                return;
            case 7:
                Object obj18 = this.f5581c;
                ?? r13 = this.f5579a;
                Object obj19 = this.f5583e;
                ?? r14 = this.f5580b;
                jvb jvbVar2 = (jvb) obj18;
                jvbVar2.m13537d(r13.mo3830a(new ecr((eax) obj19, (jww) r14, 3), this.f5582d));
                jvbVar2.m13537d(new eds((jww) r14, i3));
                return;
            case 8:
                Object obj20 = this.f5583e;
                Object obj21 = this.f5580b;
                Object obj22 = this.f5579a;
                Object obj23 = this.f5582d;
                Object obj24 = this.f5581c;
                try {
                    ((efr) obj20).f13856b.f13865g.f13881f.mo13961e("fusion#saveDebugImage");
                    if (((efr) obj20).f13856b.f13865g.f13880e.mo6184l(dib.f11297bD)) {
                        iM17721g = ntw.m17721g(((ShotMetadata) obj21).m5099e());
                        ntw.m17725k((ShotMetadata) obj21, 95);
                    } else {
                        iM17721g = 0;
                    }
                    JpgEncodeOptions jpgEncodeOptions = new JpgEncodeOptions();
                    jpgEncodeOptions.m5024b((ShotMetadata) obj21);
                    mrm mrmVarM5156a = JpgHelper.m5156a(((InterleavedImageU8) obj22).m5005e(), jpgEncodeOptions, iM17721g);
                    ((InterleavedImageU8) obj22).m5007g();
                    if (mrmVarM5156a.mo16813g()) {
                        gyj gyjVarM9988h = ((efr) obj20).f13856b.f13860b.mo9901g().m9988h();
                        gyjVarM9988h.f26832a.mo14688h("DEBUG_" + ((String) obj23));
                        try {
                            FileOutputStream fileOutputStreamMo14685e = gyjVarM9988h.f26832a.mo14685e();
                            try {
                                fileOutputStreamMo14685e.write((byte[]) mrmVarM5156a.mo16809c());
                                gyjVarM9988h.m9977b();
                                fileOutputStreamMo14685e.close();
                            } catch (Throwable th) {
                                try {
                                    fileOutputStreamMo14685e.close();
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
                            ((nbe) ((nbe) ((nbe) efu.f13876a.m17252c()).mo17283h(e2)).mo17276G(1383)).mo17293r("[%s] Error writing debug image to disk.", ((efr) obj20).f13856b.f13861c);
                            gyjVarM9988h.m9976a();
                        }
                    } else {
                        ((nbe) ((nbe) efu.f13876a.m17252c()).mo17276G(1382)).mo17293r("[%s] Error encoding debug image.", ((efr) obj20).f13856b.f13861c);
                    }
                    ((efr) obj20).f13856b.f13865g.f13881f.mo13962f();
                    ((hcu) obj24).close();
                    return;
                } catch (Throwable th3) {
                    ((efr) obj20).f13856b.f13865g.f13881f.mo13962f();
                    ((hcu) obj24).close();
                    throw th3;
                }
            case 9:
                Object obj25 = this.f5583e;
                ?? r15 = this.f5579a;
                Object obj26 = this.f5582d;
                Object obj27 = this.f5580b;
                ?? r16 = this.f5581c;
                ezi eziVar = (ezi) obj25;
                ezh ezhVar = new ezh(eziVar, r15, (mrm) obj26, (kwe) obj27);
                if (r15.getResultType() == 22) {
                    ((hdw) eziVar.f21069y.get()).m10129a(ezhVar);
                    return;
                } else {
                    ezhVar.mo5957a(r16.getBitmap());
                    return;
                }
            case 10:
                Object obj28 = this.f5581c;
                Object obj29 = this.f5583e;
                ?? r17 = this.f5579a;
                Object obj30 = this.f5582d;
                Object obj31 = this.f5580b;
                ezh ezhVar2 = (ezh) obj28;
                iad iadVar = ezhVar2.f21040d.f21068x;
                ofk ofkVarM17743c = nvn.m17743c();
                ofkVarM17743c.f45859g = obj29;
                switch (r17.getResultType()) {
                    case 11:
                        i3 = 5;
                        break;
                    case 22:
                        i3 = 7;
                        break;
                    case 26:
                        i3 = 3;
                        break;
                }
                ofkVarM17743c.f45856d = Integer.valueOf(i3);
                mrm mrmVar2 = (mrm) obj30;
                if (mrmVar2.mo16813g()) {
                    nvgVar = (nvg) mrmVar2.mo16809c();
                } else {
                    int resultType = r17.getResultType();
                    kwe kweVar = (kwe) obj31;
                    if ((kweVar.f37498a & 4) != 0) {
                        kwb kwbVar = kweVar.f37501d;
                        if (kwbVar == null) {
                            kwbVar = kwb.f37483b;
                        }
                        for (kwa kwaVar : kwbVar.f37485a) {
                            if (kwaVar.f37479a == 7) {
                                nuyVar = (nuy) kwaVar.f37480b;
                            }
                        }
                    }
                    nxl nxlVarM18137O = nvg.f44740c.m18137O();
                    if (resultType == 22) {
                        if (nuyVar != null) {
                            nxl nxlVarM18137O2 = nva.f44726c.m18137O();
                            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                nxlVarM18137O2.mo18106p();
                            }
                            nva nvaVar = (nva) nxlVarM18137O2.f44974b;
                            nvaVar.f44729b = nuyVar;
                            nvaVar.f44728a |= 1;
                            nva nvaVar2 = (nva) nxlVarM18137O2.mo18103l();
                            if (!nxlVarM18137O.f44974b.m18142ac()) {
                                nxlVarM18137O.mo18106p();
                            }
                            nvg nvgVar2 = (nvg) nxlVarM18137O.f44974b;
                            nvaVar2.getClass();
                            nvgVar2.f44743b = nvaVar2;
                            nvgVar2.f44742a = 1;
                        }
                        nvgVar = (nvg) nxlVarM18137O.mo18103l();
                    } else {
                        i = resultType;
                    }
                    if (i == 11) {
                        nvf nvfVar = nvf.f44738a;
                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        nvg nvgVar3 = (nvg) nxlVarM18137O.f44974b;
                        nvfVar.getClass();
                        nvgVar3.f44743b = nvfVar;
                        nvgVar3.f44742a = 2;
                    } else if (i == 26) {
                        nve nveVar = nve.f44736a;
                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        nvg nvgVar4 = (nvg) nxlVarM18137O.f44974b;
                        nveVar.getClass();
                        nvgVar4.f44743b = nveVar;
                        nvgVar4.f44742a = 3;
                    }
                    nvgVar = (nvg) nxlVarM18137O.mo18103l();
                }
                ofkVarM17743c.f45854b = nvgVar;
                iadVar.f30130h = ofkVarM17743c.m18465b();
                if (ezhVar2.f21040d.f21057m.mo8564b(ikw.LENS)) {
                    return;
                }
                ezhVar2.f21040d.f21068x.m10980f();
                return;
            case 11:
                ?? r18 = this.f5583e;
                ?? r19 = this.f5580b;
                ?? r20 = this.f5582d;
                ?? r21 = this.f5581c;
                ?? r22 = this.f5579a;
                fir firVar = (fir) r19.get();
                mrm mrmVar3 = (mrm) r20.get();
                dhx dhxVar = dib.f11240a;
                r18.mo6178f();
                r21.mo8332g(new fjk(firVar, 1), r22);
                if (mrmVar3.mo16813g()) {
                    ((fhq) mrmVar3.mo16809c()).mo8445a(firVar);
                    r21.mo8332g(new fjm(r21, mrmVar3), r22);
                    return;
                }
                return;
            default:
                Object obj32 = this.f5583e;
                ?? r23 = this.f5579a;
                ?? r24 = this.f5580b;
                Object obj33 = this.f5581c;
                ?? r25 = this.f5582d;
                jvb jvbVar3 = ((chx) obj32).f5767b;
                hny hnyVarM10529a2 = hnz.m10529a();
                hnyVarM10529a2.m10525d("MicroVideo");
                hnyVarM10529a2.m10524c(r24);
                hnyVarM10529a2.m10528g((hnv) obj33);
                hnyVarM10529a2.m10527f(new fit((jww) r25, i2));
                hnyVarM10529a2.m10526e(new fit((jww) r25, 8));
                jvbVar3.m13537d(r23.mo10519f(hnyVarM10529a2.m10522a()));
                return;
        }
    }
}
