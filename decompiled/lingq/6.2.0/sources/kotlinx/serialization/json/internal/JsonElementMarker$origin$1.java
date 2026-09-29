package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class JsonElementMarker$origin$1 extends FunctionReferenceImpl implements zi3 {
    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
        int iIntValue = ((Number) obj2).intValue();
        serialDescriptor.getClass();
        C3265a c3265a = (C3265a) this.f47704b;
        c3265a.getClass();
        boolean z = !serialDescriptor.mo3701j(iIntValue) && serialDescriptor.mo3700i(iIntValue).mo11826c();
        c3265a.f48255b = z;
        return Boolean.valueOf(z);
    }
}
