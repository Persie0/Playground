package p000;

import android.hardware.camera2.CaptureRequest;
import android.media.MediaFormat;
import com.google.android.apps.camera.jni.microvideotonemap.yUpa.qQLA;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.xRFdVyfdeve;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fxo {
    /* JADX INFO: renamed from: a */
    public static fxi m8927a(kfy kfyVar) {
        return new fxi(mxk.m17136H(kfyVar));
    }

    /* JADX INFO: renamed from: b */
    public static fxi m8928b(CaptureRequest.Key key, Object obj) {
        return m8927a(kgq.m14215e(key, obj));
    }

    /* JADX INFO: renamed from: c */
    public static fxi m8929c(List list) {
        return new fxi(mxk.m17134F(list));
    }

    /* JADX INFO: renamed from: d */
    public static fxi m8930d(kfy... kfyVarArr) {
        return m8929c(Arrays.asList(kfyVarArr));
    }

    /* JADX INFO: renamed from: e */
    public static fxi m8931e() {
        return new fxi(mzx.f41874a);
    }

    /* JADX INFO: renamed from: f */
    public static jwn m8932f(CaptureRequest.Key key, jwn jwnVar) {
        return jwr.m13640j(jwr.m13640j(jwnVar, new etx(key, 5)), fod.f22902g);
    }

    /* JADX INFO: renamed from: g */
    public static int m8933g(boolean z, boolean z2) {
        if (z) {
            return z2 ? 64000000 : 38000000;
        }
        return 19000000;
    }

    /* JADX INFO: renamed from: h */
    public static MediaFormat m8934h(kbc kbcVar, int i, float f, String str, boolean z, boolean z2) {
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(str, kbcVar.f35517a, kbcVar.f35518b);
        mediaFormatCreateVideoFormat.setInteger("bitrate", i);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", 30);
        mediaFormatCreateVideoFormat.setInteger(qQLA.InkdtRvTEwWFoDk, 21);
        int i2 = true != z2 ? 2 : 1;
        mediaFormatCreateVideoFormat.setInteger("color-standard", i2);
        mediaFormatCreateVideoFormat.setInteger("color-transfer", 3);
        mediaFormatCreateVideoFormat.setInteger("color-range", i2);
        mediaFormatCreateVideoFormat.setFloat("i-frame-interval", f);
        mediaFormatCreateVideoFormat.setInteger(xRFdVyfdeve.fel, 1);
        if (str.equals("video/hevc")) {
            mediaFormatCreateVideoFormat.setInteger("profile", 1);
            mediaFormatCreateVideoFormat.setInteger("level", 65536);
        } else if (z) {
            mediaFormatCreateVideoFormat.setInteger("profile", 8);
            mediaFormatCreateVideoFormat.setInteger("level", 32768);
        }
        return mediaFormatCreateVideoFormat;
    }

    /* JADX INFO: renamed from: i */
    public static MediaFormat m8935i() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", "application/microvideo-meta-stream");
        mediaFormat.setInteger("oo.muxer.drop_initial_non_keyframes", 1);
        return mediaFormat;
    }

    /* JADX INFO: renamed from: j */
    public static kbc m8936j(boolean z, boolean z2, boolean z3) {
        if (!z) {
            return z2 ? dye.f12884d : dye.f12883c;
        }
        if (z3) {
            return z2 ? dye.f12886f : dye.f12885e;
        }
        return z2 ? dye.f12888h : dye.f12887g;
    }
}
