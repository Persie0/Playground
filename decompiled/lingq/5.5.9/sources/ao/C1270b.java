package ao;

import co.InterfaceC2076h;
import dm.C5206f;
import dm.C5207g;
import java.io.IOException;
import java.io.InputStream;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6991b;
import kotlin.reflect.jvm.internal.impl.protobuf.C6992c;
import kotlin.reflect.jvm.internal.impl.protobuf.C6993d;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl;
import mn.C7646c;
import om.InterfaceC8084a;
import p207jn.C6527a;
import p207jn.C6528b;
import p372rm.InterfaceC8863u;

/* JADX INFO: renamed from: ao.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C1270b extends DeserializedPackageFragmentImpl implements InterfaceC8084a {

    /* JADX INFO: renamed from: ao.b$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static C1270b m4770a(C7646c c7646c, InterfaceC2076h interfaceC2076h, InterfaceC8863u interfaceC8863u, InputStream inputStream, boolean z10) throws IOException {
            ProtoBuf$PackageFragment protoBuf$PackageFragment;
            C5207g.m11111f(c7646c, "fqName");
            C5207g.m11111f(interfaceC2076h, "storageManager");
            C5207g.m11111f(interfaceC8863u, "module");
            try {
                C6527a c6527a = C6527a.f37171f;
                C6527a c6527aM13107a = C6527a.a.m13107a(inputStream);
                C6527a c6527a2 = C6527a.f37171f;
                if (c6527aM13107a.m13344b(c6527a2)) {
                    C6993d c6993d = new C6993d();
                    C6528b.m13108a(c6993d);
                    ProtoBuf$PackageFragment.C6936a c6936a = ProtoBuf$PackageFragment.f39167k;
                    c6936a.getClass();
                    C6992c c6992c = new C6992c(inputStream);
                    InterfaceC6997h interfaceC6997h = (InterfaceC6997h) c6936a.mo13787a(c6992c, c6993d);
                    try {
                        c6992c.m13939a(0);
                        AbstractC6991b.m13937b(interfaceC6997h);
                        protoBuf$PackageFragment = (ProtoBuf$PackageFragment) interfaceC6997h;
                    } catch (InvalidProtocolBufferException e10) {
                        e10.f39506a = interfaceC6997h;
                        throw e10;
                    }
                } else {
                    protoBuf$PackageFragment = null;
                }
                C5206f.m11032z0(inputStream, null);
                if (protoBuf$PackageFragment != null) {
                    return new C1270b(c7646c, interfaceC2076h, interfaceC8863u, protoBuf$PackageFragment, c6527aM13107a);
                }
                throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + c6527a2 + ", actual " + c6527aM13107a + ". Please update Kotlin");
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    C5206f.m11032z0(inputStream, th2);
                    throw th3;
                }
            }
        }
    }

    public C1270b(C7646c c7646c, InterfaceC2076h interfaceC2076h, InterfaceC8863u interfaceC8863u, ProtoBuf$PackageFragment protoBuf$PackageFragment, C6527a c6527a) {
        super(c7646c, interfaceC2076h, interfaceC8863u, protoBuf$PackageFragment, c6527a);
    }

    @Override // p420um.AbstractC9556a0, p420um.AbstractC9581n
    public final String toString() {
        return "builtins package fragment for " + this.f49131e + " from " + DescriptorUtilsKt.m14113j(this);
    }
}
