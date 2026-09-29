package p000;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final class rk5 implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final rk5 f59434a = new rk5();

    /* JADX INFO: renamed from: b */
    public static final gk7 f59435b = new gk7("kotlin.Long", ak7.f770E);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return Long.valueOf(decoder.mo4093u());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f59435b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.mo15619o(((Number) obj).longValue());
    }
}
