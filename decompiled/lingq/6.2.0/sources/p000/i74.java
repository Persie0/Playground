package p000;

import kotlin.time.Instant;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final class i74 implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final i74 f43619a = new i74();

    /* JADX INFO: renamed from: b */
    public static final gk7 f43620b = new gk7("kotlin.time.Instant", ak7.f772G);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Instant instant = Instant.f47731c;
        String strMo4092s = decoder.mo4092s();
        strMo4092s.getClass();
        return kuc.m15696b(strMo4092s).toInstant();
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f43620b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Instant instant = (Instant) obj;
        instant.getClass();
        encoder.mo15620p(kuc.m15695a(instant));
    }
}
