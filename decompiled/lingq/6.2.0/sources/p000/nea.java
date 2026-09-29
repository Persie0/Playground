package p000;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final class nea implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final nea f52657a = new nea();

    /* JADX INFO: renamed from: b */
    public static final e54 f52658b = r46.m20379d("kotlin.UInt", l84.f49294a);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return new jea(decoder.mo4071E(f52658b).mo4089n());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f52658b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.mo15616l(f52658b).mo15615k(((jea) obj).f45490a);
    }
}
