package p000;

import com.lingq.core.network.api.result.ResultSentence;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes2.dex */
public final class e98 implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final e98 f36886a = new e98();

    /* JADX INFO: renamed from: b */
    public static final C2978ev f36887b;

    /* JADX INFO: renamed from: c */
    public static final SerialDescriptor f36888c;

    static {
        KSerializer kSerializerSerializer = ResultSentence.Companion.serializer();
        kSerializerSerializer.getClass();
        C2978ev c2978ev = new C2978ev(kSerializerSerializer);
        f36887b = c2978ev;
        f36888c = c2978ev.f37921b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return new d98((List) decoder.mo15604w(f36887b));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f36888c;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        d98 d98Var = (d98) obj;
        d98Var.getClass();
        encoder.mo15617m(f36887b, d98Var.f35220a);
    }
}
