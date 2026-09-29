package p000;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final class sea implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final sea f60769a = new sea();

    /* JADX INFO: renamed from: b */
    public static final e54 f60770b = r46.m20379d("kotlin.ULong", rk5.f59434a);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return new oea(decoder.mo4071E(f60770b).mo4093u());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f60770b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.mo15616l(f60770b).mo15619o(((oea) obj).f54251a);
    }
}
