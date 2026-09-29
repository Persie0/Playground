package p000;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonDecodingException;
import kotlinx.serialization.json.JsonNull;

/* JADX INFO: loaded from: classes.dex */
public final class cg4 implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final cg4 f10013a = new cg4();

    /* JADX INFO: renamed from: b */
    public static final zx8 f10014b = pb1.m19042l("kotlinx.serialization.json.JsonNull", dy8.f36425y, new SerialDescriptor[0]);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        x74.m24350g(decoder);
        if (decoder.mo4098y()) {
            throw new JsonDecodingException(fa4.m11656r(-1, "Expected 'null' literal", null, null, null), "Expected 'null' literal");
        }
        return JsonNull.INSTANCE;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f10014b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ((JsonNull) obj).getClass();
        x74.m24346c(encoder);
        encoder.mo15607c();
    }
}
