package p000;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final class i69 implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final i69 f43606a = new i69();

    /* JADX INFO: renamed from: b */
    public static final gk7 f43607b = new gk7("kotlin.Short", ak7.f771F);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return Short.valueOf(decoder.mo4075I());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f43607b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.mo15609e(((Number) obj).shortValue());
    }
}
