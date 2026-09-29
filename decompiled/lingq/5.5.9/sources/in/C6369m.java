package in;

import bo.InterfaceC1626d;
import dm.C5207g;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;

/* JADX INFO: renamed from: in.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C6369m implements InterfaceC1626d {

    /* JADX INFO: renamed from: b */
    public final InterfaceC6367k f36758b;

    public C6369m(InterfaceC6367k interfaceC6367k, DeserializedContainerAbiStability deserializedContainerAbiStability) {
        C5207g.m11111f(deserializedContainerAbiStability, "abiStability");
        this.f36758b = interfaceC6367k;
    }

    @Override // p372rm.InterfaceC8837f0
    /* JADX INFO: renamed from: a */
    public final void mo12989a() {
    }

    @Override // bo.InterfaceC1626d
    /* JADX INFO: renamed from: c */
    public final String mo5302c() {
        return "Class '" + this.f36758b.mo13002j().m15204b().m15214b() + '\'';
    }

    public final String toString() {
        return C6369m.class.getSimpleName() + ": " + this.f36758b;
    }
}
