package p000;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final class dj2 implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final dj2 f35711a = new dj2();

    /* JADX INFO: renamed from: b */
    public static final gk7 f35712b = new gk7("kotlin.Double", ak7.f767B);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return Double.valueOf(decoder.mo4078M());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f35712b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.mo15608d(((Number) obj).doubleValue());
    }
}
