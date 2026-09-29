package p000;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class e12 implements KSerializer {

    /* JADX INFO: renamed from: b */
    public static final e12 f36564b = new e12();

    /* JADX INFO: renamed from: c */
    public static final gk7 f36565c = pb1.m19035e("kotlinx.datetime.DatePeriod");

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ d12 f36566a = d12.f34825a;

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return this.f36566a.deserialize(decoder);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f36565c;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        c12 c12Var = (c12) obj;
        c12Var.getClass();
        this.f36566a.getClass();
        encoder.mo15620p(c12Var.toString());
    }
}
