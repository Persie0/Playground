package p000;

import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.AbstractC3262b;
import kotlinx.serialization.json.C3261a;

/* JADX INFO: loaded from: classes.dex */
public final class hf4 implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final hf4 f42300a = new hf4();

    /* JADX INFO: renamed from: b */
    public static final gf4 f42301b = gf4.f40703b;

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        x74.m24350g(decoder);
        return new C3261a((List) new C2978ev(vf4.f65313a).m25393e(decoder));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f42301b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C3261a c3261a = (C3261a) obj;
        c3261a.getClass();
        x74.m24346c(encoder);
        vf4 vf4Var = vf4.f65313a;
        SerialDescriptor descriptor = vf4Var.getDescriptor();
        descriptor.getClass();
        C2941dv c2941dv = new C2941dv(descriptor);
        int size = c3261a.size();
        mk9 mk9VarM15618n = encoder.m15618n(c2941dv);
        Iterator<AbstractC3262b> it = c3261a.iterator();
        for (int i = 0; i < size; i++) {
            mk9VarM15618n.m16881y(c2941dv, i, vf4Var, it.next());
        }
        mk9VarM15618n.m16871A(c2941dv);
    }
}
