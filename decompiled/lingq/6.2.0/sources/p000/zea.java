package p000;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final class zea implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final zea f71476a = new zea();

    /* JADX INFO: renamed from: b */
    public static final e54 f71477b = r46.m20379d("kotlin.UShort", i69.f43606a);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return new vea(decoder.mo4071E(f71477b).mo4075I());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f71477b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.mo15616l(f71477b).mo15609e(((vea) obj).f65284a);
    }
}
