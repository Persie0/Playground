package p000;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.AbstractC3262b;
import kotlinx.serialization.json.AbstractC3264d;
import kotlinx.serialization.json.JsonDecodingException;
import kotlinx.serialization.json.JsonNull;

/* JADX INFO: loaded from: classes.dex */
public final class jg4 implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final jg4 f45517a = new jg4();

    /* JADX INFO: renamed from: b */
    public static final zx8 f45518b = pb1.m19042l("kotlinx.serialization.json.JsonPrimitive", ak7.f772G, new SerialDescriptor[0]);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        pf4 pf4VarM24350g = x74.m24350g(decoder);
        AbstractC3262b abstractC3262bMo15628l = pf4VarM24350g.mo15628l();
        if (abstractC3262bMo15628l instanceof AbstractC3264d) {
            return (AbstractC3264d) abstractC3262bMo15628l;
        }
        String str = "Unexpected JSON element, expected JsonPrimitive, had " + y38.m24933a(abstractC3262bMo15628l.getClass());
        throw new JsonDecodingException(fa4.m11656r(-1, str, null, null, pf4VarM24350g.mo15627C().f35560a.f47133i ? fa4.m11627A(abstractC3262bMo15628l.toString(), -1).toString() : null), str);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f45518b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        AbstractC3264d abstractC3264d = (AbstractC3264d) obj;
        abstractC3264d.getClass();
        x74.m24346c(encoder);
        if (abstractC3264d instanceof JsonNull) {
            encoder.mo15617m(cg4.f10013a, JsonNull.INSTANCE);
        } else {
            encoder.mo15617m(ag4.f600a, (zf4) abstractC3264d);
        }
    }
}
