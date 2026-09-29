package p000;

import com.lingq.core.network.api.result.ResultChatSentence;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes2.dex */
public final class w88 implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final w88 f66527a = new w88();

    /* JADX INFO: renamed from: b */
    public static final C2978ev f66528b;

    /* JADX INFO: renamed from: c */
    public static final SerialDescriptor f66529c;

    static {
        KSerializer kSerializerSerializer = ResultChatSentence.Companion.serializer();
        kSerializerSerializer.getClass();
        C2978ev c2978ev = new C2978ev(kSerializerSerializer);
        f66528b = c2978ev;
        f66529c = c2978ev.f37921b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return new v88((List) decoder.mo15604w(f66528b));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f66529c;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        v88 v88Var = (v88) obj;
        v88Var.getClass();
        encoder.mo15617m(f66528b, v88Var.f65025a);
    }
}
