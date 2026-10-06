package p000;

import android.content.Context;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.gBCSQzBeB;
import com.google.android.apps.camera.zoomui.view.WdNM.xPAWq;
import com.google.android.gms.common.annotation.HJo.JrxsYuVZZqnFC;
import com.google.android.libraries.vision.opengl.MUg.WIxTIdUIdfb;
import com.google.common.p019io.ByteStreams;
import com.google.googlex.gcam.creativecamera.portraitmode.PortraitRelightingProcessorInterface;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class gpo implements gpw, fbp, far, faq {

    /* JADX INFO: renamed from: a */
    public static final nbh f25983a = nbh.m17259h("com/google/android/apps/camera/portrait/PortraitRelightingProcessorManagerImpl");

    /* JADX INFO: renamed from: i */
    private static final mwx f25984i = mwx.m17117l(Arrays.asList(enc.m7552h("face_light_256_256-P21-custom_op.tflite", "A891DF2BC3F5F99941681615A5B730CA"), enc.m7552h("facemesh-full-P21-custom_op.tflite", "3F960EFFF9FC2CDF78E67B6CCC3EBA29"), enc.m7552h("ffv6_holo040820_normals_net_mixed_fp16_256_256-P21-custom_op.tflite", "C9DDF79CBA8F9E7801CF492760C8BB40"), enc.m7552h(JrxsYuVZZqnFC.mwzfmOBHhvts, "411964205B9443CC789BFB38114EBA8E"), enc.m7552h("face_light_256_256-P22-custom_op.tflite", "6E94AF81E6B3A3559AEA3264C08B44C8"), enc.m7552h("facemesh-full-P22-custom_op.tflite", "1C82F3E862DF5445241304BB73CEF678"), enc.m7552h("ffv6_holo040820_normals_net_mixed_fp16_256_256-P22-custom_op.tflite", "AD6B39D065BAA50CBCB7C653475026C9"), enc.m7552h(gBCSQzBeB.bJSOvzkgjpn, "F099417EC82DF3EB41A7587090831E85"), enc.m7552h(xPAWq.oYzHnXPc, "F396FA80313C1E513F60AD010E1F5532"), enc.m7552h("facemesh-full-P23-custom_op.tflite", "927636C05786D1C56F64F2350CD63849"), enc.m7552h("ffv6_holo040820_normals_net_mixed_fp16_256_256-P23-custom_op.tflite", "A67E567502B263D1E6918F323601CB1C"), enc.m7552h("ffv6_holo040820_relighting_net_mixed_fp16_256_256-P23-custom_op.tflite", "71047F4A027EBFAFF158DEC586038D04")));

    /* JADX INFO: renamed from: b */
    public final Context f25985b;

    /* JADX INFO: renamed from: c */
    public final dhv f25986c;

    /* JADX INFO: renamed from: d */
    public final boolean f25987d;

    /* JADX INFO: renamed from: e */
    public final oju f25988e;

    /* JADX INFO: renamed from: j */
    private final kbz f25992j;

    /* JADX INFO: renamed from: k */
    private final Executor f25993k;

    /* JADX INFO: renamed from: g */
    public boolean f25990g = false;

    /* JADX INFO: renamed from: h */
    public final ReentrantLock f25991h = new ReentrantLock();

    /* JADX INFO: renamed from: f */
    public final PortraitRelightingProcessorInterface f25989f = new PortraitRelightingProcessorInterface();

    public gpo(kbz kbzVar, Context context, dhv dhvVar, oju ojuVar, Executor executor, boolean z) {
        this.f25992j = kbzVar;
        this.f25985b = context;
        this.f25986c = dhvVar;
        this.f25987d = z;
        this.f25988e = ojuVar;
        this.f25993k = executor;
    }

    @Override // p000.gpw
    /* JADX INFO: renamed from: a */
    public final long mo9611a() {
        if (!this.f25991h.tryLock()) {
            return 0L;
        }
        try {
            return this.f25989f.getPortraitRelightingProcessorHandle();
        } finally {
            this.f25991h.unlock();
        }
    }

    @Override // p000.faq
    /* JADX INFO: renamed from: b */
    public final void mo5928b() {
        this.f25993k.execute(new gpn(this, 0));
    }

    @Override // p000.far
    /* JADX INFO: renamed from: c */
    public final void mo5929c() {
        this.f25993k.execute(new gpn(this, 1));
    }

    @Override // p000.gpw
    /* JADX INFO: renamed from: d */
    public final void mo9612d() {
        this.f25993k.execute(new gpn(this, 2));
    }

    @Override // p000.gpw
    /* JADX INFO: renamed from: e */
    public final boolean mo9613e(boolean z) {
        return (z ? this.f25986c.mo6184l(dio.f11648E) : this.f25986c.mo6184l(dip.f11687c)) && mo9611a() != 0;
    }

    /* JADX INFO: renamed from: f */
    public final byte[] m9614f(Context context, String str, String str2) {
        this.f25992j.mo13961e("FireflyMgr#loadModelAsset");
        byte[] bArr = new byte[0];
        try {
            InputStream inputStreamOpen = context.getAssets().open(str);
            int iAvailable = inputStreamOpen.available();
            byte[] bArr2 = new byte[iAvailable];
            int i = ByteStreams.read(inputStreamOpen, bArr2, 0, iAvailable);
            if (inputStreamOpen.available() != 0) {
                ((nbe) ((nbe) f25983a.m17251b()).mo17276G((char) 3167)).mo17290o("There is more data. This is problematic");
            }
            inputStreamOpen.close();
            if (i != iAvailable) {
                ((nbe) ((nbe) f25983a.m17251b()).mo17276G((char) 3166)).mo17290o("Didn't finish reading the asset.");
            }
            bArr = bArr2;
        } catch (IOException e) {
            ((nbe) ((nbe) f25983a.m17251b()).mo17276G((char) 3164)).mo17293r("Unable to load the asset: %s", e);
        }
        this.f25992j.mo13961e("FireflyMgr#decrypt");
        byte[] bArrDoFinal = new byte[0];
        try {
            byte[] bArrM17455g = nfp.f42200e.m17455g("6B63910ECDC9F72F9B907AC6E8E6A53519A194834FB5417CFEB12AD4174286CC");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(nfp.f42200e.m17455g("EE0F689D8C7579BC1A11DEE1D035717E"));
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArrM17455g, "AES");
            Cipher cipher = Cipher.getInstance("AES_256/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            bArrDoFinal = cipher.doFinal(bArr);
        } catch (Exception e2) {
            ((nbe) ((nbe) f25983a.m17251b()).mo17276G((char) 3163)).mo17293r("Unable to decrypt bytes: %s", e2);
        }
        this.f25992j.mo13962f();
        this.f25992j.mo13961e("FireflyMgr#md5");
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(bArrDoFinal);
            if (!MessageDigest.isEqual(bArrDigest, nfp.f42200e.m17455g(str2))) {
                ((nbe) ((nbe) f25983a.m17252c()).mo17276G(3154)).mo17301z("Checksum is %s, expecting %s", nfp.f42200e.m17454f(bArrDigest), str2);
            }
        } catch (Exception e3) {
            ((nbe) ((nbe) f25983a.m17251b()).mo17276G((char) 3155)).mo17293r("Failed to compute MD5 hash: %s", e3);
        }
        this.f25992j.mo13962f();
        this.f25992j.mo13962f();
        return bArrDoFinal;
    }

    /* JADX INFO: renamed from: g */
    public final byte[] m9615g(Context context, String str, String str2) {
        String str3 = String.format(WIxTIdUIdfb.vUuzFPctvROqX, str, str2);
        return m9614f(context, str2 + "/" + str3 + ".enc", (String) f25984i.getOrDefault(str3, ""));
    }
}
