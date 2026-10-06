package p000;

import android.content.Context;
import com.google.common.p019io.ByteStreams;
import com.google.googlex.gcam.BufferUtils;
import com.google.googlex.gcam.creativecamera.portraitmode.PortraitSegmenterInterface;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class gpp implements gpx {

    /* JADX INFO: renamed from: a */
    private static final nbh f25994a = nbh.m17259h("com/google/android/apps/camera/portrait/PortraitSegmenterManagerImpl");

    /* JADX INFO: renamed from: b */
    private final Object f25995b = new Object();

    /* JADX INFO: renamed from: c */
    private final PortraitSegmenterInterface f25996c = new PortraitSegmenterInterface();

    /* JADX INFO: renamed from: d */
    private boolean f25997d;

    /* JADX INFO: renamed from: e */
    private final kbz f25998e;

    /* JADX INFO: renamed from: f */
    private final Context f25999f;

    /* JADX INFO: renamed from: g */
    private final boolean f26000g;

    /* JADX INFO: renamed from: h */
    private final boolean f26001h;

    /* JADX INFO: renamed from: i */
    private final boolean f26002i;

    /* JADX INFO: renamed from: j */
    private final boolean f26003j;

    /* JADX INFO: renamed from: k */
    private final oju f26004k;

    /* JADX INFO: renamed from: l */
    private final oju f26005l;

    /* JADX INFO: renamed from: m */
    private boolean f26006m;

    public gpp(kbz kbzVar, Context context, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, oju ojuVar, oju ojuVar2) {
        this.f25998e = kbzVar;
        this.f25999f = context;
        this.f26000g = z;
        this.f26001h = z2;
        this.f26002i = z3;
        this.f26006m = z4;
        this.f26003j = z5;
        this.f26004k = ojuVar;
        this.f26005l = ojuVar2;
    }

    /* JADX INFO: renamed from: c */
    private final void m9616c(int i) {
        nxl nxlVarM18137O = nli.f43518i.m18137O();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        nli nliVar = (nli) nxqVar;
        nliVar.f43521b = i - 1;
        nliVar.f43520a |= 1;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar2 = nxlVarM18137O.f44974b;
        nli nliVar2 = (nli) nxqVar2;
        nliVar2.f43520a |= 2;
        nliVar2.f43522c = "tflite_vakunov_multi-subject_2018-06-09.fb.enc";
        boolean z = this.f26000g;
        if (!nxqVar2.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar3 = nxlVarM18137O.f44974b;
        nli nliVar3 = (nli) nxqVar3;
        nliVar3.f43520a |= 4;
        nliVar3.f43523d = z;
        boolean z2 = this.f26001h;
        if (!nxqVar3.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar4 = nxlVarM18137O.f44974b;
        nli nliVar4 = (nli) nxqVar4;
        nliVar4.f43520a |= 8;
        nliVar4.f43524e = z2;
        boolean z3 = this.f26002i;
        if (!nxqVar4.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar5 = nxlVarM18137O.f44974b;
        nli nliVar5 = (nli) nxqVar5;
        nliVar5.f43520a |= 16;
        nliVar5.f43525f = z3;
        boolean z4 = this.f26006m;
        if (!nxqVar5.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar6 = nxlVarM18137O.f44974b;
        nli nliVar6 = (nli) nxqVar6;
        nliVar6.f43520a |= 32;
        nliVar6.f43526g = z4;
        boolean z5 = this.f26003j;
        if (!nxqVar6.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nli nliVar7 = (nli) nxlVarM18137O.f44974b;
        nliVar7.f43520a |= 64;
        nliVar7.f43527h = z5;
        ((fcp) this.f26005l.get()).mo8132G((nli) nxlVarM18137O.mo18103l());
    }

    @Override // p000.gpx
    /* JADX INFO: renamed from: a */
    public final long mo9617a() {
        long segmenterHandle;
        synchronized (this.f25995b) {
            segmenterHandle = this.f25996c.getSegmenterHandle();
        }
        return segmenterHandle;
    }

    @Override // p000.gpx
    /* JADX INFO: renamed from: b */
    public final void mo9618b() throws BadPaddingException, IllegalBlockSizeException {
        byte[] bArrDoFinal;
        synchronized (this.f25995b) {
            if (!this.f25997d) {
                Context context = this.f25999f;
                this.f25998e.mo13961e("PortraitSegmenterManager#loadModelAsset");
                byte[] bArr = new byte[0];
                try {
                    InputStream inputStreamOpen = context.getAssets().open("tflite_vakunov_multi-subject_2018-06-09.fb.enc");
                    int iAvailable = inputStreamOpen.available();
                    byte[] bArr2 = new byte[iAvailable];
                    int i = ByteStreams.read(inputStreamOpen, bArr2, 0, iAvailable);
                    if (inputStreamOpen.available() != 0) {
                        ((nbe) ((nbe) f25994a.m17251b()).mo17276G((char) 3175)).mo17290o("There is more data. This is problematic");
                    }
                    inputStreamOpen.close();
                    if (i != iAvailable) {
                        ((nbe) ((nbe) f25994a.m17251b()).mo17276G((char) 3174)).mo17290o("Didn't finish reading the asset...");
                    }
                    bArr = bArr2;
                } catch (IOException e) {
                    ((nbe) ((nbe) f25994a.m17251b()).mo17276G((char) 3173)).mo17293r("Unable to load the asset: %s", e);
                    m9616c(2);
                }
                this.f25998e.mo13962f();
                PortraitSegmenterInterface portraitSegmenterInterface = this.f25996c;
                this.f25998e.mo13961e("PortraitSegmenterManager#decrypt");
                byte[] bArr3 = new byte[0];
                try {
                    byte[] bArrM17455g = nfp.f42200e.m17455g("6B63910ECDC9F72F9B907AC6E8E6A53519A194834FB5417CFEB12AD4174286CC");
                    IvParameterSpec ivParameterSpec = new IvParameterSpec(nfp.f42200e.m17455g("EE0F689D8C7579BC1A11DEE1D035717E"));
                    SecretKeySpec secretKeySpec = new SecretKeySpec(bArrM17455g, "AES");
                    Cipher cipher = Cipher.getInstance("AES_256/CBC/PKCS5Padding");
                    cipher.init(2, secretKeySpec, ivParameterSpec);
                    bArrDoFinal = cipher.doFinal(bArr);
                } catch (Exception e2) {
                    ((nbe) ((nbe) f25994a.m17251b()).mo17276G((char) 3172)).mo17293r("Unable to decrypt bytes: %s", e2);
                    m9616c(3);
                    bArrDoFinal = bArr3;
                }
                this.f25998e.mo13962f();
                this.f25998e.mo13961e("PortraitSegmenterManager#md5");
                try {
                    byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(bArrDoFinal);
                    if (!MessageDigest.isEqual(bArrDigest, nfp.f42200e.m17455g("2F01B88911B7897DD738B9CF658A28A6"))) {
                        ((nbe) ((nbe) f25994a.m17252c()).mo17276G(3168)).mo17301z("Checksum is %s, expecting %s", nfp.f42200e.m17454f(bArrDigest), "2F01B88911B7897DD738B9CF658A28A6");
                    }
                } catch (Exception e3) {
                    ((nbe) ((nbe) f25994a.m17251b()).mo17276G((char) 3169)).mo17293r("Failed to compute MD5 hash: %s", e3);
                    m9616c(3);
                }
                this.f25998e.mo13962f();
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bArrDoFinal.length);
                byteBufferAllocateDirect.put(bArrDoFinal);
                long jM4902a = BufferUtils.m4902a(byteBufferAllocateDirect);
                long jCapacity = byteBufferAllocateDirect.capacity();
                this.f25998e.mo13961e("PortraitSegmenterManager#nativeInitialization");
                mrm mrmVarM8495b = ((fjp) this.f26004k).m8495b();
                String absolutePath = mrmVarM8495b.mo16813g() ? new File((File) mrmVarM8495b.mo16809c(), "tflite_vakunov_multi-subject_2018-06-09.fb.enc.cache").getAbsolutePath() : "";
                boolean zInitSegmenter = portraitSegmenterInterface.initSegmenter(jM4902a, jCapacity, "tflite_vakunov_multi-subject_2018-06-09.fb.enc", absolutePath, this.f26000g, this.f26001h, this.f26002i, this.f26006m, this.f26003j);
                if (zInitSegmenter && !this.f26000g && this.f26006m && !(zInitSegmenter = portraitSegmenterInterface.dummyImageProducesReasonableMask())) {
                    ((nbe) ((nbe) f25994a.m17251b()).mo17276G((char) 3171)).mo17290o("OpenCL segmenter failed to produce a reasonable mask, falling back to OpenGL.");
                    portraitSegmenterInterface.release();
                    m9616c(5);
                    byteBufferAllocateDirect.clear();
                    byteBufferAllocateDirect.put(bArrDoFinal);
                    this.f26006m = false;
                    zInitSegmenter = portraitSegmenterInterface.initSegmenter(jM4902a, jCapacity, "tflite_vakunov_multi-subject_2018-06-09.fb.enc", absolutePath, this.f26000g, this.f26001h, this.f26002i, false, false);
                }
                this.f25998e.mo13962f();
                if (!zInitSegmenter) {
                    m9616c(4);
                }
                this.f25997d = zInitSegmenter;
            }
        }
    }
}
