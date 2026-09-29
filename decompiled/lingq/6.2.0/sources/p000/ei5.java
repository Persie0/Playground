package p000;

import kotlinx.datetime.LocalDateTime;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class ei5 implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final ei5 f37285a = new ei5();

    /* JADX INFO: renamed from: b */
    public static final gk7 f37286b = pb1.m19035e("kotlinx.datetime.LocalDateTime");

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return zh5.m25656a(LocalDateTime.Companion, decoder.mo4092s());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f37286b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        LocalDateTime localDateTime = (LocalDateTime) obj;
        localDateTime.getClass();
        encoder.mo15620p(localDateTime.toString());
    }
}
