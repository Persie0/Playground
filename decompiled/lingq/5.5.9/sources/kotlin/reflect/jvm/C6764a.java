package kotlin.reflect.jvm;

import dm.C5207g;
import java.io.ByteArrayInputStream;
import kn.C6735e;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.C6784a;
import kotlin.reflect.jvm.internal.KFunctionImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6824e;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6991b;
import kotlin.reflect.jvm.internal.impl.protobuf.C6992c;
import kotlin.reflect.jvm.internal.impl.protobuf.C6993d;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p247lm.C7398k;
import p248ln.C7400a;
import p248ln.C7404e;
import p248ln.C7405f;
import p248ln.C7407h;
import sl.InterfaceC9068a;

/* JADX INFO: renamed from: kotlin.reflect.jvm.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C6764a {
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static final KFunctionImpl m13484a(InterfaceC9068a interfaceC9068a) {
        C5207g.m11111f(interfaceC9068a, "<this>");
        Metadata metadata = (Metadata) interfaceC9068a.getClass().getAnnotation(Metadata.class);
        if (metadata == null) {
            return null;
        }
        String[] strArrM13364d1 = metadata.m13364d1();
        boolean z10 = false;
        if (strArrM13364d1.length == 0) {
            strArrM13364d1 = null;
        }
        if (strArrM13364d1 == null) {
            return null;
        }
        String[] strArrM13365d2 = metadata.m13365d2();
        C6993d c6993d = C7407h.f41229a;
        C5207g.m11111f(strArrM13365d2, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(C7400a.m14800b(strArrM13364d1));
        C7405f c7405fM14813g = C7407h.m14813g(byteArrayInputStream, strArrM13365d2);
        ProtoBuf$Function.C6930a c6930a = ProtoBuf$Function.f39114Q;
        C6993d c6993d2 = C7407h.f41229a;
        c6930a.getClass();
        C6992c c6992c = new C6992c(byteArrayInputStream);
        InterfaceC6997h interfaceC6997h = (InterfaceC6997h) c6930a.mo13787a(c6992c, c6993d2);
        try {
            c6992c.m13939a(0);
            AbstractC6991b.m13937b(interfaceC6997h);
            ProtoBuf$Function protoBuf$Function = (ProtoBuf$Function) interfaceC6997h;
            int[] iArrM13367mv = metadata.m13367mv();
            if ((metadata.m13369xi() & 8) != 0) {
                z10 = true;
            }
            C7404e c7404e = new C7404e(iArrM13367mv, z10);
            Class<?> cls = interfaceC9068a.getClass();
            ProtoBuf$TypeTable protoBuf$TypeTable = protoBuf$Function.f39118K;
            C5207g.m11110e(protoBuf$TypeTable, "proto.typeTable");
            return new KFunctionImpl(C6784a.f38294b, (InterfaceC6824e) C7398k.m14793d(cls, protoBuf$Function, c7405fM14813g, new C6735e(protoBuf$TypeTable), c7404e, ReflectLambdaKt$reflect$descriptor$1.f38132j));
        } catch (InvalidProtocolBufferException e10) {
            e10.f39506a = interfaceC6997h;
            throw e10;
        }
    }
}
