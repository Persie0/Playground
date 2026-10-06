package p000;

import com.google.android.libraries.lens.lenslite.api.ImageProxy;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class eyt implements ImageProxy.Plane {

    /* JADX INFO: renamed from: a */
    private final kpv f21009a;

    public eyt(kpv kpvVar) {
        this.f21009a = kpvVar;
    }

    @Override // com.google.android.libraries.lens.lenslite.api.ImageProxy.Plane
    public final ByteBuffer getBuffer() {
        return this.f21009a.getBuffer();
    }

    @Override // com.google.android.libraries.lens.lenslite.api.ImageProxy.Plane
    public final int getPixelStride() {
        return this.f21009a.getPixelStride();
    }

    @Override // com.google.android.libraries.lens.lenslite.api.ImageProxy.Plane
    public final int getRowStride() {
        return this.f21009a.getRowStride();
    }
}
