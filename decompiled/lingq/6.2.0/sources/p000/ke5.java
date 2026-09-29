package p000;

import java.util.LinkedHashSet;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class ke5 extends k91 {

    /* JADX INFO: renamed from: b */
    public final C3809yu f47094b;

    public ke5(KSerializer kSerializer) {
        super(kSerializer);
        SerialDescriptor descriptor = kSerializer.getDescriptor();
        descriptor.getClass();
        this.f47094b = new C3809yu(descriptor, 1);
    }

    @Override // p000.AbstractC3815z
    /* JADX INFO: renamed from: a */
    public final Object mo11356a() {
        return new LinkedHashSet();
    }

    @Override // p000.AbstractC3815z
    /* JADX INFO: renamed from: b */
    public final int mo11357b(Object obj) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
        linkedHashSet.getClass();
        return linkedHashSet.size();
    }

    @Override // p000.AbstractC3815z
    /* JADX INFO: renamed from: g */
    public final Object mo11358g(Object obj) {
        throw null;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.f47094b;
    }

    @Override // p000.AbstractC3815z
    /* JADX INFO: renamed from: h */
    public final Object mo11359h(Object obj) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
        linkedHashSet.getClass();
        return linkedHashSet;
    }

    @Override // p000.i81
    /* JADX INFO: renamed from: i */
    public final void mo11360i(int i, Object obj, Object obj2) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
        linkedHashSet.getClass();
        linkedHashSet.add(obj2);
    }
}
