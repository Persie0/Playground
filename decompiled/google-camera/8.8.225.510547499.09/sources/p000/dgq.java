package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.widget.Toast;
import com.google.android.libraries.oliveoil.p018gl.EGLImage;
import com.google.googlex.gcam.BuildPayloadBurstSpecOptions;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.YuvImage;
import com.google.googlex.gcam.YuvReadView;
import com.google.googlex.gcam.YuvWriteView;
import com.google.googlex.gcam.image.YuvUtils;
import com.google.googlex.gcam.imageproc.Resample;
import com.google.mediapipe.framework.GraphTextureFrame;
import com.google.mediapipe.framework.TextureFrame;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dgq implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f10955a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f10956b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f10957c;

    public /* synthetic */ dgq(Context context, String str, int i) {
        this.f10957c = i;
        this.f10955a = context;
        this.f10956b = str;
    }

    public /* synthetic */ dgq(dfh dfhVar, String str, int i) {
        this.f10957c = i;
        this.f10955a = dfhVar;
        this.f10956b = str;
    }

    public /* synthetic */ dgq(dha dhaVar, njg njgVar, int i) {
        this.f10957c = i;
        this.f10955a = dhaVar;
        this.f10956b = njgVar;
    }

    public /* synthetic */ dgq(dlg dlgVar, dlf dlfVar, int i) {
        this.f10957c = i;
        this.f10956b = dlgVar;
        this.f10955a = dlfVar;
    }

    public /* synthetic */ dgq(dse dseVar, TextureFrame textureFrame, int i) {
        this.f10957c = i;
        this.f10955a = dseVar;
        this.f10956b = textureFrame;
    }

    public /* synthetic */ dgq(dtc dtcVar, key keyVar, int i) {
        this.f10957c = i;
        this.f10955a = dtcVar;
        this.f10956b = keyVar;
    }

    public /* synthetic */ dgq(dzn dznVar, dzp dzpVar, int i) {
        this.f10957c = i;
        this.f10955a = dznVar;
        this.f10956b = dzpVar;
    }

    public dgq(eaj eajVar, SurfaceTexture surfaceTexture, int i) {
        this.f10957c = i;
        this.f10956b = eajVar;
        this.f10955a = surfaceTexture;
    }

    public /* synthetic */ dgq(eba ebaVar, BuildPayloadBurstSpecOptions buildPayloadBurstSpecOptions, int i) {
        this.f10957c = i;
        this.f10955a = ebaVar;
        this.f10956b = buildPayloadBurstSpecOptions;
    }

    public /* synthetic */ dgq(ebz ebzVar, key keyVar, int i) {
        this.f10957c = i;
        this.f10955a = ebzVar;
        this.f10956b = keyVar;
    }

    public /* synthetic */ dgq(ehi ehiVar, fan fanVar, int i) {
        this.f10957c = i;
        this.f10955a = ehiVar;
        this.f10956b = fanVar;
    }

    public /* synthetic */ dgq(ehi ehiVar, idg idgVar, int i) {
        this.f10957c = i;
        this.f10955a = ehiVar;
        this.f10956b = idgVar;
    }

    public /* synthetic */ dgq(ehw ehwVar, kpw kpwVar, int i) {
        this.f10957c = i;
        this.f10955a = ehwVar;
        this.f10956b = kpwVar;
    }

    public /* synthetic */ dgq(hew hewVar, Runnable runnable, int i) {
        this.f10957c = i;
        this.f10955a = hewVar;
        this.f10956b = runnable;
    }

    public dgq(Runnable runnable, AtomicBoolean atomicBoolean, int i) {
        this.f10957c = i;
        this.f10955a = runnable;
        this.f10956b = atomicBoolean;
    }

    public /* synthetic */ dgq(Map.Entry entry, dya dyaVar, int i) {
        this.f10957c = i;
        this.f10956b = entry;
        this.f10955a = dyaVar;
    }

    public /* synthetic */ dgq(Map.Entry entry, gsr gsrVar, int i) {
        this.f10957c = i;
        this.f10956b = entry;
        this.f10955a = gsrVar;
    }

    public /* synthetic */ dgq(Map.Entry entry, jzk jzkVar, int i, byte[] bArr) {
        this.f10957c = i;
        this.f10956b = entry;
        this.f10955a = jzkVar;
    }

    public /* synthetic */ dgq(kbz kbzVar, oju ojuVar, int i) {
        this.f10957c = i;
        this.f10955a = kbzVar;
        this.f10956b = ojuVar;
    }

    public /* synthetic */ dgq(oju ojuVar, mrm mrmVar, int i) {
        this.f10957c = i;
        this.f10956b = ojuVar;
        this.f10955a = mrmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [hew, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v105, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r0v115, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r0v116, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r0v119, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, java.util.Map$Entry] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, java.util.Map$Entry] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, java.util.Map$Entry] */
    /* JADX WARN: Type inference failed for: r0v88, types: [java.lang.Object, key] */
    /* JADX WARN: Type inference failed for: r0v92, types: [fbp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v93, types: [java.lang.Object, kpw] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v11, types: [com.google.mediapipe.framework.TextureFrame, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, key] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v40, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Object, kbz] */
    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap = null;
        int i = 0;
        boolean z = true;
        switch (this.f10957c) {
            case 0:
                ?? r0 = this.f10955a;
                ?? r2 = this.f10956b;
                r0.mo10130a();
                r2.run();
                return;
            case 1:
                ((dfh) this.f10955a).m6053b((String) this.f10956b);
                return;
            case 2:
                ((dha) this.f10955a).f11018a.mo8137L((njg) this.f10956b);
                return;
            case 3:
                Object obj = this.f10956b;
                Object obj2 = this.f10955a;
                synchronized (obj) {
                    if (((dlg) obj).f11935b.remove(obj2)) {
                        ((dlg) obj).f11936c.add(((dlf) obj2).m6334a());
                    }
                    break;
                }
                return;
            case 4:
                Object obj3 = this.f10956b;
                Object obj4 = this.f10955a;
                synchronized (obj3) {
                    if (((dlg) obj3).f11935b.remove(obj4)) {
                        ((dlg) obj3).f11936c.add(((dlf) obj4).m6334a());
                    }
                    break;
                }
                return;
            case 5:
                Toast.makeText((Context) this.f10955a, (CharSequence) this.f10956b, 1).show();
                return;
            case 6:
                ?? r1 = this.f10956b;
                Object obj5 = this.f10955a;
                ((dre) ((mrm) obj5).mo16809c()).m6619a();
                return;
            case 7:
                Object obj6 = this.f10955a;
                ?? r3 = this.f10956b;
                dse dseVar = (dse) obj6;
                synchronized (dseVar.f12479d) {
                    EGLImage eGLImage = new EGLImage(((dse) obj6).f12480e);
                    ldx ldxVarM15220j = ldx.m15220j(((dse) obj6).f12481f.f12483a, eGLImage);
                    ldz ldzVarM15228h = ldz.m15228h(((dse) obj6).f12481f.f12483a, new lbm(kzi.m15087d(((GraphTextureFrame) r3).f8424a, ((GraphTextureFrame) r3).f8425b)), r3.getTextureName(), 3553);
                    lea leaVar = ((dse) obj6).f12481f.f12485c;
                    float[] fArr = lea.f38012a;
                    leaVar.m15232b(ldzVarM15228h.f37915b);
                    leaVar.m15232b(ldxVarM15220j.f37915b);
                    lku.m15670x(ldzVarM15228h.m15229b().f37879c == ((ldi) ldxVarM15220j.m15167f()).mo15191n().f37879c, "Data type of texture and canvas must match!");
                    lqq lqqVarM15169i = lct.m15169i(ldg.m15200a(ldxVarM15220j.f37915b));
                    leb lebVarMo15153e = leaVar.f38013b.mo15153e();
                    ldzVarM15228h.m15229b();
                    lct lctVarM15890c = lqqVarM15169i.m15890c(leaVar.m15234d(lebVarMo15153e, false));
                    lctVarM15890c.m15173c("uImgTex", ldzVarM15228h);
                    lctVarM15890c.m15177g(fArr);
                    lctVarM15890c.m15171a("aPosition", 0);
                    lctVarM15890c.m15171a("aTexCoord", 1);
                    lctVarM15890c.m15179k(ldxVarM15220j);
                    ldzVarM15228h.close();
                    ldxVarM15220j.close();
                    eGLImage.close();
                    r3.release();
                    break;
                }
                dseVar.f12477b.mo14894e(true);
                return;
            case 8:
                Object obj7 = this.f10955a;
                ?? r4 = this.f10956b;
                dtc dtcVar = (dtc) obj7;
                for (dug dugVar : dtcVar.f12544b) {
                    if (dugVar.mo6726e()) {
                        dugVar.mo4009b(r4, (kgg) dtcVar.f12545c.mo16809c());
                    }
                }
                r4.close();
                return;
            case 9:
                ?? r5 = this.f10955a;
                Object obj8 = this.f10956b;
                r5.mo13961e("MICRO_ImageReaderModule_runningStartupTasks");
                for (Runnable runnable : ((ohm) obj8).get()) {
                    r5.mo13961e("MICRO_ImageReaderModule_runSingleTask");
                    runnable.run();
                    r5.mo13962f();
                }
                r5.mo13962f();
                return;
            case 10:
                ((dxy) this.f10956b.getKey()).mo6891bP((gsr) this.f10955a);
                return;
            case 11:
                ((dxr) this.f10956b.getKey()).m6863a((dya) this.f10955a);
                return;
            case 12:
                ((dyn) this.f10956b.getKey()).mo6936b((jzk) this.f10955a);
                return;
            case 13:
                dzn dznVar = (dzn) this.f10955a;
                dzp dzpVar = (dzp) this.f10956b;
                dznVar.f12995b.mo14894e(dzpVar.getReadableDatabase());
                dznVar.f12996c.mo14894e(dzpVar.getWritableDatabase());
                return;
            case 14:
                ((eaj) this.f10956b).f13059f = (EGL10) EGLContext.getEGL();
                eaj eajVar = (eaj) this.f10956b;
                eajVar.f13056c = eajVar.f13059f.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
                if (((eaj) this.f10956b).f13056c == EGL10.EGL_NO_DISPLAY) {
                    throw new RuntimeException("eglGetDisplay failed");
                }
                eaj eajVar2 = (eaj) this.f10956b;
                if (!eajVar2.f13059f.eglInitialize(eajVar2.f13056c, new int[2])) {
                    throw new RuntimeException("eglInitialize failed");
                }
                int[] iArr = {12440, 2, 12344};
                eaj eajVar3 = (eaj) this.f10956b;
                EGL10 egl10 = eajVar3.f13059f;
                EGLDisplay eGLDisplay = eajVar3.f13056c;
                int[] iArr2 = new int[1];
                if (!egl10.eglChooseConfig(eGLDisplay, eaj.f13054a, null, 0, iArr2)) {
                    throw new IllegalArgumentException("eglChooseConfig failed");
                }
                int i2 = iArr2[0];
                if (i2 <= 0) {
                    throw new IllegalArgumentException("No configs match configSpec");
                }
                EGLConfig[] eGLConfigArr = new EGLConfig[i2];
                if (!egl10.eglChooseConfig(eGLDisplay, eaj.f13054a, eGLConfigArr, i2, iArr2)) {
                    throw new IllegalArgumentException("eglChooseConfig#2 failed");
                }
                eajVar3.f13055b = eGLConfigArr[0];
                eaj eajVar4 = (eaj) this.f10956b;
                eajVar4.f13057d = eajVar4.f13059f.eglCreateContext(eajVar4.f13056c, eajVar4.f13055b, EGL10.EGL_NO_CONTEXT, iArr);
                EGLContext eGLContext = ((eaj) this.f10956b).f13057d;
                if (eGLContext == null || eGLContext == EGL10.EGL_NO_CONTEXT) {
                    throw new RuntimeException("failed to createContext");
                }
                eaj eajVar5 = (eaj) this.f10956b;
                eajVar5.f13058e = eajVar5.f13059f.eglCreateWindowSurface(eajVar5.f13056c, eajVar5.f13055b, this.f10955a, null);
                EGLSurface eGLSurface = ((eaj) this.f10956b).f13058e;
                if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                    throw new RuntimeException("failed to createWindowSurface");
                }
                eaj eajVar6 = (eaj) this.f10956b;
                EGL10 egl11 = eajVar6.f13059f;
                EGLDisplay eGLDisplay2 = eajVar6.f13056c;
                EGLSurface eGLSurface2 = eajVar6.f13058e;
                if (!egl11.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, eajVar6.f13057d)) {
                    throw new RuntimeException("failed to eglMakeCurrent");
                }
                eaj eajVar7 = (eaj) this.f10956b;
                eajVar7.f13060g = (GL10) eajVar7.f13057d.getGL();
                return;
            case 15:
                Object obj9 = this.f10955a;
                Object obj10 = this.f10956b;
                eba ebaVar = (eba) obj9;
                if (ebaVar.f13189d && ebaVar.f13190e) {
                    ((BuildPayloadBurstSpecOptions) obj10).m4907b(1000.0f);
                    return;
                }
                return;
            case 16:
                Object obj11 = this.f10955a;
                ?? r6 = this.f10956b;
                synchronized (obj11) {
                    if (!r6.mo7044e()) {
                        r6.close();
                    }
                    break;
                }
                return;
            case 17:
                Object obj12 = this.f10955a;
                ((idg) this.f10956b).m11114b();
                ((ehi) obj12).m7323a(true);
                return;
            case 18:
                ((fba) this.f10956b).m8097e(this.f10955a);
                return;
            case 19:
                Object obj13 = this.f10955a;
                ?? r7 = this.f10956b;
                try {
                    C1058va c1058va = ((ehw) obj13).f14109d;
                    boolean z2 = r7.mo7245a() == 35;
                    lku.m15670x(z2, "Expected image format YUV but found: " + r7.mo7245a());
                    c1058va.f47804c.mo13961e("Downsample YUV");
                    YuvWriteView yuvWriteViewM17650c = ((nsz) c1058va.f47802a).m17650c(r7);
                    int iM5152b = yuvWriteViewM17650c.m5152b() & (-8);
                    int iM5151a = yuvWriteViewM17650c.m5151a() & (-8);
                    if (iM5152b != yuvWriteViewM17650c.m5152b() || iM5151a != yuvWriteViewM17650c.m5151a()) {
                        GcamModuleJNI.YuvWriteView_FastCrop(yuvWriteViewM17650c.f8393b, yuvWriteViewM17650c, 0, 0, iM5152b, iM5151a);
                    }
                    int i3 = iM5152b / 4;
                    int i4 = iM5151a / 4;
                    YuvImage yuvImage = new YuvImage(i3, i4, nsh.f44395c);
                    YuvReadView yuvReadViewM17719e = ntw.m17719e(yuvWriteViewM17650c);
                    YuvWriteView yuvWriteViewM17720f = ntw.m17720f(yuvImage);
                    long j = yuvReadViewM17719e.f8391a;
                    long jM5150c = YuvWriteView.m5150c(yuvWriteViewM17720f);
                    lku.m15670x(j != 0, "src is null");
                    if (jM5150c == 0) {
                        z = false;
                    }
                    lku.m15670x(z, "dst is null");
                    Resample.downsampleImpl(j, 2, jM5150c);
                    c1058va.f47804c.mo13963g("Rotate YUV");
                    int iIntValue = ((Integer) ((cem) c1058va.f47803b).m3565c().mo3831be()).intValue();
                    nrn nrnVarM17722h = ntw.m17722h(iIntValue);
                    if (nrnVarM17722h != nrn.f44252d && nrnVarM17722h != nrn.f44250b) {
                        if (nrnVarM17722h != nrn.f44257i && nrnVarM17722h != nrn.f44255g) {
                            throw new IllegalStateException("Invalid imageRotation=" + String.valueOf(nrnVarM17722h) + "; rotationObservable=" + iIntValue);
                        }
                        i4 = i3;
                        i3 = i4;
                    }
                    YuvImage yuvImage2 = new YuvImage(i3, i4, nsh.f44395c);
                    Resample.m5158b(ntw.m17718d(yuvImage), nrnVarM17722h, ntw.m17720f(yuvImage2));
                    c1058va.f47804c.mo13963g("YUV to bitmap");
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
                    nrs nrsVarM17633a = nrs.m17633a(bitmapCreateBitmap);
                    boolean zM5155a = YuvUtils.m5155a(ntw.m17718d(yuvImage2), nrsVarM17633a.f44286a);
                    nrsVarM17633a.close();
                    if (zM5155a) {
                        c1058va.f47804c.mo13962f();
                        bitmap = bitmapCreateBitmap;
                    } else {
                        c1058va.f47804c.mo13962f();
                    }
                } catch (Exception e) {
                    ((nbe) ((nbe) ((nbe) ehw.f14106a.m17251b()).mo17283h(e)).mo17276G((char) 1485)).mo17290o("Could not map YUV to Bitmap");
                }
                if (bitmap != null) {
                    ((ehw) obj13).f14107b.m9969d(new gyc(bitmap, i));
                    return;
                } else {
                    ((nbe) ((nbe) ehw.f14106a.m17251b()).mo17276G((char) 1484)).mo17290o("Could not map YUV to Bitmap.");
                    return;
                }
            default:
                this.f10955a.run();
                synchronized (this.f10956b) {
                    ((AtomicBoolean) this.f10956b).set(true);
                    this.f10956b.notify();
                    break;
                }
                return;
        }
    }
}
