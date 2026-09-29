package p000;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public interface st5 {
    /* JADX INFO: renamed from: A */
    ByteBuffer mo10711A(int i);

    /* JADX INFO: renamed from: B */
    void mo10712B(ArrayList arrayList);

    /* JADX INFO: renamed from: D */
    void mo10713D(eu5 eu5Var, Handler handler);

    /* JADX INFO: renamed from: F */
    void mo10714F(ArrayList arrayList);

    /* JADX INFO: renamed from: a */
    void mo10715a();

    /* JADX INFO: renamed from: d */
    void mo10717d(Bundle bundle);

    /* JADX INFO: renamed from: e */
    void mo10718e(int i, xr1 xr1Var, long j, int i2);

    /* JADX INFO: renamed from: f */
    void mo10719f(int i, int i2, int i3, long j);

    void flush();

    /* JADX INFO: renamed from: h */
    void mo10720h(int i);

    /* JADX INFO: renamed from: j */
    MediaFormat mo10722j();

    /* JADX INFO: renamed from: k */
    default boolean mo10723k(hi8 hi8Var) {
        return false;
    }

    /* JADX INFO: renamed from: l */
    void mo10724l();

    /* JADX INFO: renamed from: m */
    default void mo10725m(RunnableC0806bd runnableC0806bd) {
        runnableC0806bd.run();
    }

    /* JADX INFO: renamed from: o */
    void mo10727o(int i, long j);

    /* JADX INFO: renamed from: q */
    int mo10728q();

    /* JADX INFO: renamed from: t */
    int mo10729t(MediaCodec.BufferInfo bufferInfo);

    /* JADX INFO: renamed from: v */
    void mo10730v(int i);

    /* JADX INFO: renamed from: w */
    ByteBuffer mo10731w(int i);

    /* JADX INFO: renamed from: y */
    void mo10732y(Surface surface);
}
