package p000;

import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes2.dex */
public final class a98 implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final a98 f384a = new a98();

    /* JADX INFO: renamed from: b */
    public static final je5 f385b;

    /* JADX INFO: renamed from: c */
    public static final SerialDescriptor f386c;

    static {
        sk9 sk9Var = sk9.f60959a;
        je5 je5VarM22043b = thb.m22043b(thb.m22059r(sk9Var), thb.m22059r(sk9Var));
        f385b = je5VarM22043b;
        f386c = je5VarM22043b.f45470c;
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Map map = (Map) decoder.mo15604w(f385b);
        return new z88((String) u91.m22590H0(map.keySet()), (String) u91.m22590H0(map.values()));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f386c;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        z88 z88Var = (z88) obj;
        z88Var.getClass();
        encoder.mo15617m(f385b, AbstractC3194a.m15364Q(new Pair(z88Var.f71092a, z88Var.f71093b)));
    }
}
