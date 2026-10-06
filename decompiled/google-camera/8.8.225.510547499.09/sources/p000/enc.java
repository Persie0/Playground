package p000;

import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class enc {
    /* JADX INFO: renamed from: a */
    public static Object m7545a(oju ojuVar) {
        m7546b();
        return ojuVar.get();
    }

    /* JADX INFO: renamed from: b */
    public static synchronized void m7546b() {
        kbi.m13938a(enc.class);
    }

    /* JADX INFO: renamed from: c */
    public static final ByteBuffer m7547c(int i, int i2, kpv kpvVar) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i * i2);
        lfv.f38164a.copyBytes2D(kpvVar.getBuffer(), byteBufferAllocateDirect, i, i2, 0, 0, kpvVar.getPixelStride(), 1, kpvVar.getRowStride(), i);
        return byteBufferAllocateDirect;
    }

    /* JADX INFO: renamed from: e */
    public static final gpv m7549e(mrm mrmVar, mrm mrmVar2, mrm mrmVar3) {
        return new gpv(mrmVar, mrmVar2, mrmVar3);
    }

    /* JADX INFO: renamed from: f */
    public static int m7550f(int i) {
        return i - 1;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m7551g(dhv dhvVar) {
        return dhvVar.mo6184l(dio.f11667i);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Map.Entry m7552h(Object obj, Object obj2) {
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }
}
