package p000;

import android.media.MediaFormat;
import androidx.compose.runtime.internal.C0282a;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fpb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f39442a = new C0282a(732386456, false, new kd1(28));

    /* JADX INFO: renamed from: b */
    public static final C0282a f39443b = new C0282a(987565368, false, new kd1(29));

    /* JADX INFO: renamed from: a */
    public static void m11990a(MediaFormat mediaFormat, ga1 ga1Var) {
        if (ga1Var != null) {
            m11992c(mediaFormat, "color-transfer", ga1Var.f40446c);
            m11992c(mediaFormat, "color-standard", ga1Var.f40444a);
            m11992c(mediaFormat, "color-range", ga1Var.f40445b);
            byte[] bArr = ga1Var.f40447d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m11991b(MediaFormat mediaFormat, float f) {
        if (f != -1.0f) {
            mediaFormat.setFloat("frame-rate", f);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m11992c(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m11993d(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(ux5.m22988k(i, "csd-"), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }
}
