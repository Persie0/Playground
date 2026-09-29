package p000;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class g22 implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final g22 f40073a = new g22();

    /* JADX INFO: renamed from: b */
    public static final gk7 f40074b = pb1.m19035e("kotlinx.datetime.DateTimePeriod/ISO");

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        d22 d22Var = e22.Companion;
        String strMo4092s = decoder.mo4092s();
        d22Var.getClass();
        return d22.m9997a(strMo4092s);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f40074b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        e22 e22Var = (e22) obj;
        e22Var.getClass();
        encoder.mo15620p(e22Var.toString());
    }
}
