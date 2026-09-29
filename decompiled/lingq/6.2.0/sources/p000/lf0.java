package p000;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final class lf0 implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final lf0 f49579a = new lf0();

    /* JADX INFO: renamed from: b */
    public static final gk7 f49580b = new gk7("kotlin.Boolean", ak7.f773y);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return Boolean.valueOf(decoder.mo4082e());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f49580b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.mo15611g(((Boolean) obj).booleanValue());
    }
}
