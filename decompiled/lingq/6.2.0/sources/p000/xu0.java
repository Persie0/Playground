package p000;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final class xu0 implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final xu0 f68782a = new xu0();

    /* JADX INFO: renamed from: b */
    public static final gk7 f68783b = new gk7("kotlin.Char", ak7.f766A);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return Character.valueOf(decoder.mo4083f());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f68783b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.mo15613i(((Character) obj).charValue());
    }
}
