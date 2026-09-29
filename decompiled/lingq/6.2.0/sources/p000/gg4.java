package p000;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.C3263c;

/* JADX INFO: loaded from: classes3.dex */
public final class gg4 implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final gg4 f40769a = new gg4();

    /* JADX INFO: renamed from: b */
    public static final fg4 f40770b = fg4.f39035b;

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        x74.m24350g(decoder);
        return new C3263c((Map) thb.m22043b(sk9.f60959a, vf4.f65313a).deserialize(decoder));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f40770b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C3263c c3263c = (C3263c) obj;
        c3263c.getClass();
        x74.m24346c(encoder);
        thb.m22043b(sk9.f60959a, vf4.f65313a).serialize(encoder, c3263c);
    }
}
