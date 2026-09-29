package kotlinx.serialization.json.internal;

import kotlinx.serialization.descriptors.SerialDescriptor;
import p000.xo2;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3265a {

    /* JADX INFO: renamed from: a */
    public final xo2 f48254a;

    /* JADX INFO: renamed from: b */
    public boolean f48255b;

    public C3265a(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        this.f48254a = new xo2(serialDescriptor, new JsonElementMarker$origin$1(2, this, C3265a.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0));
    }
}
