package p000;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final class l84 implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final l84 f49294a = new l84();

    /* JADX INFO: renamed from: b */
    public static final gk7 f49295b = new gk7("kotlin.Int", ak7.f769D);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return Integer.valueOf(decoder.mo4089n());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f49295b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.mo15615k(((Number) obj).intValue());
    }
}
