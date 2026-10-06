package p000;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jzc {

    /* JADX INFO: renamed from: a */
    public final MediaCodec.BufferInfo f35215a;

    /* JADX INFO: renamed from: b */
    public final ByteBuffer f35216b;

    public jzc() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jzc) {
            jzc jzcVar = (jzc) obj;
            if (this.f35215a.equals(jzcVar.f35215a) && this.f35216b.equals(jzcVar.f35216b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f35215a.hashCode() ^ 1000003) * 1000003) ^ this.f35216b.hashCode();
    }

    public final String toString() {
        return "AudioBuffer{bufferInfo=" + this.f35215a.toString() + ", byteBuffer=" + this.f35216b.toString() + "}";
    }

    public jzc(MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer) {
        if (bufferInfo == null) {
            throw new NullPointerException("Null bufferInfo");
        }
        this.f35215a = bufferInfo;
        if (byteBuffer == null) {
            throw new NullPointerException("Null byteBuffer");
        }
        this.f35216b = byteBuffer;
    }
}
