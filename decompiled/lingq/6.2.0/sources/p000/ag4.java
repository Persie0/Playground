package p000;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.AbstractC3262b;
import kotlinx.serialization.json.JsonDecodingException;

/* JADX INFO: loaded from: classes3.dex */
public final class ag4 implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final ag4 f600a = new ag4();

    /* JADX INFO: renamed from: b */
    public static final gk7 f601b = pb1.m19035e("kotlinx.serialization.json.JsonLiteral");

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        pf4 pf4VarM24350g = x74.m24350g(decoder);
        AbstractC3262b abstractC3262bMo15628l = pf4VarM24350g.mo15628l();
        if (abstractC3262bMo15628l instanceof zf4) {
            return (zf4) abstractC3262bMo15628l;
        }
        throw new JsonDecodingException(fa4.m11656r(-1, "Unexpected JSON element, expected JsonLiteral, had " + y38.m24933a(abstractC3262bMo15628l.getClass()), null, null, pf4VarM24350g.mo15627C().f35560a.f47133i ? fa4.m11627A(abstractC3262bMo15628l.toString(), -1).toString() : null));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f601b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Boolean bool;
        zf4 zf4Var = (zf4) obj;
        zf4Var.getClass();
        String str = zf4Var.f71490b;
        x74.m24346c(encoder);
        if (zf4Var.f71489a) {
            encoder.mo15620p(str);
            return;
        }
        Long lM4845b0 = cl9.m4845b0(str);
        if (lM4845b0 != null) {
            encoder.mo15619o(lM4845b0.longValue());
            return;
        }
        oea oeaVarM356f = afa.m356f(str);
        if (oeaVarM356f != null) {
            encoder.mo15616l(sea.f60770b).mo15619o(oeaVarM356f.f54251a);
            return;
        }
        Double dM3869O = bl9.m3869O(str);
        if (dM3869O != null) {
            encoder.mo15608d(dM3869O.doubleValue());
            return;
        }
        if (str.equals("true")) {
            bool = Boolean.TRUE;
        } else {
            bool = str.equals("false") ? Boolean.FALSE : null;
        }
        if (bool != null) {
            encoder.mo15611g(bool.booleanValue());
        } else {
            encoder.mo15620p(str);
        }
    }
}
