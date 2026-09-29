package p000;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.AbstractC3262b;
import kotlinx.serialization.json.AbstractC3264d;
import kotlinx.serialization.json.C3261a;
import kotlinx.serialization.json.C3263c;

/* JADX INFO: loaded from: classes.dex */
public final class vf4 implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final vf4 f65313a = new vf4();

    /* JADX INFO: renamed from: b */
    public static final zx8 f65314b = pb1.m19041k("kotlinx.serialization.json.JsonElement", ug7.f63891y, new SerialDescriptor[0], new tf4(0));

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return x74.m24350g(decoder).mo15628l();
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f65314b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        AbstractC3262b abstractC3262b = (AbstractC3262b) obj;
        abstractC3262b.getClass();
        x74.m24346c(encoder);
        if (abstractC3262b instanceof AbstractC3264d) {
            encoder.mo15617m(jg4.f45517a, abstractC3262b);
            return;
        }
        if (abstractC3262b instanceof C3263c) {
            encoder.mo15617m(gg4.f40769a, abstractC3262b);
        } else if (abstractC3262b instanceof C3261a) {
            encoder.mo15617m(hf4.f42300a, abstractC3262b);
        } else {
            gm5.m12750e();
        }
    }
}
