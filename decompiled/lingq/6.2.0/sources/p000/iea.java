package p000;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final class iea implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final iea f44031a = new iea();

    /* JADX INFO: renamed from: b */
    public static final e54 f44032b = r46.m20379d("kotlin.UByte", rk0.f59420a);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return new eea(decoder.mo4071E(f44032b).mo4074H());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f44032b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.mo15616l(f44032b).mo15610f(((eea) obj).f37135a);
    }
}
