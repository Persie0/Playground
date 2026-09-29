package p000;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: renamed from: yu */
/* JADX INFO: loaded from: classes3.dex */
public final class C3809yu extends sf5 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f70462b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3809yu(SerialDescriptor serialDescriptor, int i) {
        super(serialDescriptor);
        this.f70462b = i;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: a */
    public final String mo3694a() {
        switch (this.f70462b) {
            case 0:
                return "kotlin.Array";
            default:
                return "kotlin.collections.LinkedHashSet";
        }
    }
}
