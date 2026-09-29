package p000;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class vj7 extends sf5 {

    /* JADX INFO: renamed from: b */
    public final String f65507b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj7(SerialDescriptor serialDescriptor) {
        super(serialDescriptor);
        serialDescriptor.getClass();
        this.f65507b = serialDescriptor.mo3694a() + "Array";
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: a */
    public final String mo3694a() {
        return this.f65507b;
    }
}
