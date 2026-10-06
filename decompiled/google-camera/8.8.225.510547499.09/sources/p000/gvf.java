package p000;

import com.google.android.libraries.camera.jni.jpeg.JpegUtilNative;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gvf implements gve {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f26490a;

    public gvf(int i) {
        this.f26490a = i;
    }

    @Override // p000.gve
    /* JADX INFO: renamed from: a */
    public final kay mo9788a(grm grmVar) {
        switch (this.f26490a) {
            case 0:
                return grmVar.f26153b;
            default:
                return kay.CLOCKWISE_0;
        }
    }

    public final String toString() {
        switch (this.f26490a) {
            case 0:
                return "exifRotatingCompressor";
            default:
                return "byteRotatingCompressor";
        }
    }

    @Override // p000.gve
    /* JADX INFO: renamed from: b */
    public final int mo9789b(grm grmVar, ByteBuffer byteBuffer) {
        switch (this.f26490a) {
            case 0:
                return JpegUtilNative.m4696a(grmVar.f26152a, byteBuffer.duplicate(), grmVar.f26156e, kay.CLOCKWISE_0);
            default:
                return JpegUtilNative.m4696a(grmVar.f26152a, byteBuffer.duplicate(), grmVar.f26156e, grmVar.f26153b);
        }
    }
}
