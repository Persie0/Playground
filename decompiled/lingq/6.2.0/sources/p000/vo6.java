package p000;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final class vo6 implements KSerializer {

    /* JADX INFO: renamed from: a */
    public final KSerializer f65718a;

    /* JADX INFO: renamed from: b */
    public final yx8 f65719b;

    public vo6(KSerializer kSerializer) {
        kSerializer.getClass();
        this.f65718a = kSerializer;
        this.f65719b = new yx8(kSerializer.getDescriptor());
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        if (decoder.mo4098y()) {
            return decoder.mo15604w(this.f65718a);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && vo6.class == obj.getClass() && fa4.m11650l(this.f65718a, ((vo6) obj).f65718a);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.f65719b;
    }

    public final int hashCode() {
        return this.f65718a.hashCode();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        if (obj != null) {
            encoder.mo15617m(this.f65718a, obj);
        } else {
            encoder.mo15607c();
        }
    }
}
