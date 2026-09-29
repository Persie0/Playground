package p000;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final class rk0 implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final rk0 f59420a = new rk0();

    /* JADX INFO: renamed from: b */
    public static final gk7 f59421b = new gk7("kotlin.Byte", ak7.f774z);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return Byte.valueOf(decoder.mo4074H());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f59421b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.mo15610f(((Number) obj).byteValue());
    }
}
