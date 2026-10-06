package p000;

import android.media.Image;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class klr implements kpv {

    /* JADX INFO: renamed from: a */
    private final int f36487a;

    /* JADX INFO: renamed from: b */
    private final int f36488b;

    /* JADX INFO: renamed from: c */
    private final ByteBuffer f36489c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f36490d;

    public klr(Image.Plane plane, int i) {
        this.f36490d = i;
        this.f36487a = plane.getPixelStride();
        this.f36488b = plane.getRowStride();
        this.f36489c = plane.getBuffer();
    }

    public klr(ByteBuffer byteBuffer, int i, int i2, int i3) {
        this.f36490d = i3;
        this.f36489c = byteBuffer;
        this.f36488b = i;
        this.f36487a = i2;
    }

    @Override // p000.kpv
    public final ByteBuffer getBuffer() {
        switch (this.f36490d) {
            case 0:
                break;
        }
        return this.f36489c;
    }

    @Override // p000.kpv
    public final int getPixelStride() {
        switch (this.f36490d) {
            case 0:
                break;
        }
        return this.f36487a;
    }

    @Override // p000.kpv
    public final int getRowStride() {
        switch (this.f36490d) {
            case 0:
                break;
        }
        return this.f36488b;
    }
}
