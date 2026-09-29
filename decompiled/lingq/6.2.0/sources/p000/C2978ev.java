package p000;

import java.util.ArrayList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: renamed from: ev */
/* JADX INFO: loaded from: classes.dex */
public final class C2978ev extends k91 {

    /* JADX INFO: renamed from: b */
    public final C2941dv f37921b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2978ev(KSerializer kSerializer) {
        super(kSerializer);
        kSerializer.getClass();
        SerialDescriptor descriptor = kSerializer.getDescriptor();
        descriptor.getClass();
        this.f37921b = new C2941dv(descriptor);
    }

    @Override // p000.AbstractC3815z
    /* JADX INFO: renamed from: a */
    public final Object mo11356a() {
        return new ArrayList();
    }

    @Override // p000.AbstractC3815z
    /* JADX INFO: renamed from: b */
    public final int mo11357b(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList.size();
    }

    @Override // p000.AbstractC3815z
    /* JADX INFO: renamed from: g */
    public final Object mo11358g(Object obj) {
        throw null;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.f37921b;
    }

    @Override // p000.AbstractC3815z
    /* JADX INFO: renamed from: h */
    public final Object mo11359h(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList;
    }

    @Override // p000.i81
    /* JADX INFO: renamed from: i */
    public final void mo11360i(int i, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        arrayList.add(i, obj2);
    }
}
