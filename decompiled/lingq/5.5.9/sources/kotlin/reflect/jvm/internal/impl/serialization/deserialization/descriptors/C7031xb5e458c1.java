package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import cm.InterfaceC2041a;
import java.io.ByteArrayInputStream;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6991b;
import p282nn.InterfaceC7809g;
import p541zn.C10544h;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7031xb5e458c1 extends Lambda implements InterfaceC2041a {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC7809g f39810b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ByteArrayInputStream f39811c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ DeserializedMemberScope f39812d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7031xb5e458c1(AbstractC6991b abstractC6991b, ByteArrayInputStream byteArrayInputStream, DeserializedMemberScope deserializedMemberScope) {
        super(0);
        this.f39810b = abstractC6991b;
        this.f39811c = byteArrayInputStream;
        this.f39812d = deserializedMemberScope;
    }

    @Override // cm.InterfaceC2041a
    /* JADX INFO: renamed from: E */
    public final Object mo807E() {
        return ((AbstractC6991b) this.f39810b).m13938c(this.f39811c, ((C10544h) this.f39812d.f39796b.f45999a).f52594p);
    }
}
