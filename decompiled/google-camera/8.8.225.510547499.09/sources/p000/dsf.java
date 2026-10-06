package p000;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CaptureResult;
import com.google.android.apps.camera.faceobfuscation.api.FaceToObfuscate;
import com.google.mediapipe.framework.AndroidAssetUtil;
import com.google.mediapipe.framework.AndroidPacketCreator;
import com.google.mediapipe.framework.Graph;
import com.google.mediapipe.framework.GraphTextureFrame;
import com.google.mediapipe.framework.Packet;
import com.google.mediapipe.framework.ProtoUtil$SerializedMessage;
import com.google.mediapipe.framework.TextureFrame;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p021j$.time.Instant;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dsf implements dsl {

    /* JADX INFO: renamed from: g */
    private static final nbh f12482g = nbh.m17259h("com/google/android/apps/camera/faceobfuscation/GpuFaceObfuscationController");

    /* JADX INFO: renamed from: a */
    public final lby f12483a;

    /* JADX INFO: renamed from: b */
    protected final Executor f12484b;

    /* JADX INFO: renamed from: c */
    public final lea f12485c;

    /* JADX INFO: renamed from: d */
    public final long f12486d;

    /* JADX INFO: renamed from: e */
    public volatile dse f12487e;

    /* JADX INFO: renamed from: f */
    protected volatile ldz f12488f;

    /* JADX INFO: renamed from: h */
    private final nvq f12489h;

    /* JADX INFO: renamed from: i */
    private final mrm f12490i;

    /* JADX INFO: renamed from: j */
    private final dsr f12491j;

    /* JADX INFO: renamed from: k */
    private final fxs f12492k;

    public dsf(String str, mrm mrmVar, long j, fxs fxsVar, bko bkoVar, Executor executor, Context context, dsr dsrVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        AndroidAssetUtil.m5173a(context);
        this.f12492k = fxsVar;
        this.f12484b = executor;
        lby lbyVarM2626t = bkoVar.m2626t("faceobfuscation");
        this.f12483a = lbyVarM2626t;
        this.f12485c = lea.m15230a(lbyVarM2626t);
        this.f12486d = j;
        this.f12490i = mrmVar;
        this.f12491j = dsrVar;
        final nqf nqfVarM17621g = nqf.m17621g();
        lbyVarM2626t.execute(new Runnable() { // from class: dsa
            @Override // java.lang.Runnable
            public final void run() {
                nqfVarM17621g.mo14894e(Long.valueOf(((ldi) this.f12466a.f12483a.mo15157i().mo15164c()).mo15182e().getNativeHandle()));
            }
        });
        try {
            nvq nvqVar = new nvq(context, ((Long) nqfVarM17621g.get(1000L, TimeUnit.MILLISECONDS)).longValue(), str);
            this.f12489h = nvqVar;
            nvr nvrVar = new nvr() { // from class: dsb
                @Override // p000.nvr
                /* JADX INFO: renamed from: a */
                public final void mo6646a(TextureFrame textureFrame) {
                    this.f12468a.m6650d(textureFrame);
                }
            };
            synchronized (nvqVar) {
                nvqVar.f44769a = Arrays.asList(nvrVar);
            }
            if (nvqVar.f44772d.getAndSet(true)) {
                return;
            }
            nvqVar.m17747b();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            throw new AssertionError("Unhandled exception", e);
        }
    }

    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: a */
    public final nps m6647a(dsj dsjVar, Instant instant, mrm mrmVar) throws Throwable {
        nxl nxlVar;
        dsf dsfVar = this;
        if (dsfVar.f12488f == null || dsfVar.f12487e == null) {
            return kxk.m14964J(new IllegalStateException("immediateTexture or result not initialized"));
        }
        try {
            final ldz ldzVar = dsfVar.f12488f;
            final nqf nqfVarM17621g = nqf.m17621g();
            dsfVar.f12483a.execute(new Runnable() { // from class: drz
                @Override // java.lang.Runnable
                public final void run() {
                    nqfVarM17621g.mo14894e(Integer.valueOf(((ldv) ldzVar.mo15164c()).f37998b));
                }
            });
            dsd dsdVar = new dsd(((Integer) nqfVarM17621g.get(dsfVar.f12486d, TimeUnit.MILLISECONDS)).intValue(), ldzVar, instant);
            nvq nvqVar = dsfVar.f12489h;
            nvqVar.getClass();
            nvqVar.mo6646a(dsdVar);
            if (mrmVar.mo16813g() && dsfVar.f12490i.mo16813g()) {
                kpp kppVar = (kpp) mrmVar.mo16809c();
                dsr dsrVar = dsfVar.f12491j;
                nxl nxlVarM18137O = obr.f45357b.m18137O();
                Rect rect = (Rect) kppVar.mo9517d(CaptureResult.SCALER_CROP_REGION);
                if (rect == null) {
                    nxlVar = nxlVarM18137O;
                } else {
                    int iMin = Math.min(rect.left, rect.right);
                    int iMin2 = Math.min(rect.bottom, rect.top);
                    float fWidth = rect.width();
                    float fHeight = rect.height();
                    Iterator it = ebr.m7079e(kppVar, dsrVar, instant).iterator();
                    while (it.hasNext()) {
                        FaceToObfuscate faceToObfuscate = (FaceToObfuscate) it.next();
                        RectF rectFBounds = faceToObfuscate.bounds();
                        float fMo4119a = faceToObfuscate.mo4119a();
                        int iMo4120b = faceToObfuscate.mo4120b();
                        float f = iMin;
                        float fMin = (Math.min(rectFBounds.left, rectFBounds.right) - f) / fWidth;
                        float f2 = iMin2;
                        float fMin2 = (Math.min(rectFBounds.bottom, rectFBounds.top) - f2) / fHeight;
                        float fAbs = Math.abs(rectFBounds.width()) / fWidth;
                        float fAbs2 = Math.abs(rectFBounds.height()) / fHeight;
                        it = it;
                        PointF pointFLeftEye = faceToObfuscate.leftEye();
                        PointF pointFRightEye = faceToObfuscate.rightEye();
                        if (pointFLeftEye != null && pointFRightEye != null) {
                            int i = iMin;
                            float f3 = (pointFLeftEye.x - f) / fWidth;
                            float f4 = (pointFLeftEye.y - f2) / fHeight;
                            int i2 = iMin2;
                            float f5 = (pointFRightEye.x - f) / fWidth;
                            float f6 = (pointFRightEye.y - f2) / fHeight;
                            nxl nxlVarM18137O2 = obq.f45350e.m18137O();
                            nxl nxlVarM18137O3 = obu.f45373e.m18137O();
                            float f7 = fHeight;
                            if (!nxlVarM18137O3.f44974b.m18142ac()) {
                                nxlVarM18137O3.mo18106p();
                            }
                            obu obuVar = (obu) nxlVarM18137O3.f44974b;
                            float f8 = fWidth;
                            obuVar.f45376b = 2;
                            obuVar.f45375a |= 1;
                            nxl nxlVarM18137O4 = obs.f45361f.m18137O();
                            if (!nxlVarM18137O4.f44974b.m18142ac()) {
                                nxlVarM18137O4.mo18106p();
                            }
                            nxq nxqVar = nxlVarM18137O4.f44974b;
                            obs obsVar = (obs) nxqVar;
                            nxl nxlVar2 = nxlVarM18137O;
                            obsVar.f45363a |= 1;
                            obsVar.f45364b = fMin;
                            if (!nxqVar.m18142ac()) {
                                nxlVarM18137O4.mo18106p();
                            }
                            nxq nxqVar2 = nxlVarM18137O4.f44974b;
                            obs obsVar2 = (obs) nxqVar2;
                            obsVar2.f45363a |= 2;
                            obsVar2.f45365c = fMin2;
                            if (!nxqVar2.m18142ac()) {
                                nxlVarM18137O4.mo18106p();
                            }
                            nxq nxqVar3 = nxlVarM18137O4.f44974b;
                            obs obsVar3 = (obs) nxqVar3;
                            obsVar3.f45363a |= 4;
                            obsVar3.f45366d = fAbs;
                            if (!nxqVar3.m18142ac()) {
                                nxlVarM18137O4.mo18106p();
                            }
                            obs obsVar4 = (obs) nxlVarM18137O4.f44974b;
                            obsVar4.f45363a |= 8;
                            obsVar4.f45367e = fAbs2;
                            if (!nxlVarM18137O3.f44974b.m18142ac()) {
                                nxlVarM18137O3.mo18106p();
                            }
                            obu obuVar2 = (obu) nxlVarM18137O3.f44974b;
                            obs obsVar5 = (obs) nxlVarM18137O4.mo18103l();
                            obsVar5.getClass();
                            obuVar2.f45377c = obsVar5;
                            obuVar2.f45375a |= 4;
                            nxl nxlVarM18137O5 = obt.f45368d.m18137O();
                            if (!nxlVarM18137O5.f44974b.m18142ac()) {
                                nxlVarM18137O5.mo18106p();
                            }
                            nxq nxqVar4 = nxlVarM18137O5.f44974b;
                            obt obtVar = (obt) nxqVar4;
                            obtVar.f45370a |= 1;
                            obtVar.f45371b = f3;
                            if (!nxqVar4.m18142ac()) {
                                nxlVarM18137O5.mo18106p();
                            }
                            obt obtVar2 = (obt) nxlVarM18137O5.f44974b;
                            obtVar2.f45370a |= 2;
                            obtVar2.f45372c = f4;
                            nxlVarM18137O3.m18070aG(nxlVarM18137O5);
                            nxl nxlVarM18137O6 = obt.f45368d.m18137O();
                            if (!nxlVarM18137O6.f44974b.m18142ac()) {
                                nxlVarM18137O6.mo18106p();
                            }
                            nxq nxqVar5 = nxlVarM18137O6.f44974b;
                            obt obtVar3 = (obt) nxqVar5;
                            obtVar3.f45370a |= 1;
                            obtVar3.f45371b = f5;
                            if (!nxqVar5.m18142ac()) {
                                nxlVarM18137O6.mo18106p();
                            }
                            obt obtVar4 = (obt) nxlVarM18137O6.f44974b;
                            obtVar4.f45370a |= 2;
                            obtVar4.f45372c = f6;
                            nxlVarM18137O3.m18070aG(nxlVarM18137O6);
                            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                nxlVarM18137O2.mo18106p();
                            }
                            obq obqVar = (obq) nxlVarM18137O2.f44974b;
                            obu obuVar3 = (obu) nxlVarM18137O3.mo18103l();
                            obuVar3.getClass();
                            obqVar.f45355d = obuVar3;
                            obqVar.f45352a |= 1;
                            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                nxlVarM18137O2.mo18106p();
                            }
                            obq obqVar2 = (obq) nxlVarM18137O2.f44974b;
                            nxw nxwVar = obqVar2.f45353b;
                            if (!nxwVar.mo17770c()) {
                                obqVar2.f45353b = nxq.m18125S(nxwVar);
                            }
                            obqVar2.f45353b.mo18148g(iMo4120b);
                            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                nxlVarM18137O2.mo18106p();
                            }
                            obq obqVar3 = (obq) nxlVarM18137O2.f44974b;
                            nxv nxvVar = obqVar3.f45354c;
                            if (!nxvVar.mo17770c()) {
                                obqVar3.f45354c = nxq.m18124R(nxvVar);
                            }
                            obqVar3.f45354c.mo18034g(fMo4119a);
                            if (!nxlVar2.f44974b.m18142ac()) {
                                nxlVar2.mo18106p();
                            }
                            obr obrVar = (obr) nxlVar2.f44974b;
                            obq obqVar4 = (obq) nxlVarM18137O2.mo18103l();
                            obqVar4.getClass();
                            nxy nxyVar = obrVar.f45359a;
                            if (!nxyVar.mo17770c()) {
                                obrVar.f45359a = nxq.m18127U(nxyVar);
                            }
                            obrVar.f45359a.add(obqVar4);
                            nxlVarM18137O = nxlVar2;
                            iMin = i;
                            iMin2 = i2;
                            fHeight = f7;
                            fWidth = f8;
                        }
                    }
                    nxlVar = nxlVarM18137O;
                }
                obr obrVar2 = (obr) nxlVar.mo18103l();
                dsfVar = this;
                nvq nvqVar2 = dsfVar.f12489h;
                nvqVar2.getClass();
                Graph graph = nvqVar2.f44770b;
                String str = (String) dsfVar.f12490i.mo16809c();
                AndroidPacketCreator androidPacketCreator = dsfVar.f12489h.f44771c;
                ProtoUtil$SerializedMessage protoUtil$SerializedMessage = new ProtoUtil$SerializedMessage();
                protoUtil$SerializedMessage.typeName = (String) nvu.f44803a.f39742a.get(obrVar2.getClass());
                if (protoUtil$SerializedMessage.typeName == null) {
                    throw new NoSuchElementException("Cannot determine the protobuf type name for class: " + String.valueOf(obrVar2.getClass()) + ". Have you called ProtoUtil.registerTypeName?");
                }
                protoUtil$SerializedMessage.value = obrVar2.mo17760J();
                graph.m5176b(str, Packet.create(androidPacketCreator.nativeCreateProto(androidPacketCreator.f8432a.m5175a(), protoUtil$SerializedMessage)), instant.toEpochMilli());
            }
            npt nptVarM17615a = npt.m17615a(new cpb(dsfVar, dsjVar, 6));
            dsfVar.f12484b.execute(nptVarM17615a);
            return nptVarM17615a;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ((nbe) ((nbe) f12482g.m17252c()).mo17276G((char) 1121)).mo17290o("couldn't create input texture frame");
            return kxk.m14964J(e);
        }
    }

    @Override // p000.dsl
    /* JADX INFO: renamed from: b */
    public final nps mo6648b(dsj dsjVar, mrm mrmVar) {
        nnf nnfVar = nnf.INSTANCE;
        return this.f12492k.m8939a(new dsc(this, dsjVar, Instant.now(), mrmVar));
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m6649c() {
        this.f12485c.close();
        if (this.f12488f != null) {
            this.f12488f.close();
        }
        this.f12483a.close();
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        this.f12484b.execute(new drs(this, 4));
    }

    /* JADX INFO: renamed from: d */
    final /* synthetic */ void m6650d(TextureFrame textureFrame) {
        if (this.f12488f != null) {
            this.f12488f.close();
        }
        try {
            if (this.f12487e != null) {
                dse dseVar = this.f12487e;
                if (((Boolean) dseVar.f12478c.get(dseVar.f12481f.f12486d, TimeUnit.MILLISECONDS)).booleanValue()) {
                    dse dseVar2 = this.f12487e;
                    if (((GraphTextureFrame) textureFrame).f8426c == dseVar2.f12476a.toEpochMilli() && dseVar2.f12478c.isDone()) {
                        dseVar2.f12481f.f12483a.execute(new dgq(dseVar2, textureFrame, 7));
                        return;
                    } else {
                        ((nbe) ((nbe) f12482g.m17252c()).mo17276G((char) 1124)).mo17290o("couldn't set result frame");
                        textureFrame.release();
                        return;
                    }
                }
            }
            textureFrame.release();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ((nbe) ((nbe) f12482g.m17252c()).mo17276G((char) 1123)).mo17290o("couldn't wait for initialization of result texture");
            textureFrame.release();
        }
    }
}
