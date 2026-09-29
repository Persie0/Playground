package p000;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final class l73 implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final l73 f49244a = new l73();

    /* JADX INFO: renamed from: b */
    public static final gk7 f49245b = new gk7("kotlin.Float", ak7.f768C);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return Float.valueOf(decoder.mo4076J());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f49245b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.mo15612h(((Number) obj).floatValue());
    }
}
