package p000;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class s38 extends i81 {

    /* JADX INFO: renamed from: b */
    public final z21 f60241b;

    /* JADX INFO: renamed from: c */
    public final C3809yu f60242c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s38(z21 z21Var, KSerializer kSerializer) {
        super(kSerializer);
        kSerializer.getClass();
        this.f60241b = z21Var;
        SerialDescriptor descriptor = kSerializer.getDescriptor();
        descriptor.getClass();
        this.f60242c = new C3809yu(descriptor, 0);
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
    /* JADX INFO: renamed from: c */
    public final Iterator mo14415c(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return new C3705w0(objArr);
    }

    @Override // p000.AbstractC3815z
    /* JADX INFO: renamed from: d */
    public final int mo12404d(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return objArr.length;
    }

    @Override // p000.AbstractC3815z
    /* JADX INFO: renamed from: g */
    public final Object mo11358g(Object obj) {
        throw null;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.f60242c;
    }

    @Override // p000.AbstractC3815z
    /* JADX INFO: renamed from: h */
    public final Object mo11359h(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        Class cls = this.f60241b.f70781a;
        cls.getClass();
        Object objNewInstance = Array.newInstance((Class<?>) cls, arrayList.size());
        objNewInstance.getClass();
        Object[] array = arrayList.toArray((Object[]) objNewInstance);
        array.getClass();
        return array;
    }

    @Override // p000.i81
    /* JADX INFO: renamed from: i */
    public final void mo11360i(int i, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        arrayList.add(i, obj2);
    }
}
