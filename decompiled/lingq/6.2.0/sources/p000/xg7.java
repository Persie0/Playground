package p000;

import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class xg7 extends AbstractC3168k1 {

    /* JADX INFO: renamed from: a */
    public final z21 f68183a;

    /* JADX INFO: renamed from: b */
    public final cs4 f68184b = AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new hz4(this, 16));

    public xg7(z21 z21Var) {
        this.f68183a = z21Var;
    }

    @Override // p000.AbstractC3168k1
    /* JADX INFO: renamed from: c */
    public final z21 mo14765c() {
        return this.f68183a;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f68184b.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.f68183a + ')';
    }
}
