package in;

import bo.InterfaceC1626d;
import dm.C5207g;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import kotlin.text.C7076b;
import mn.C7645b;
import mn.C7646c;
import mn.C7648e;
import p248ln.C7405f;
import p260m8.C7499b;
import p421un.C9595b;

/* JADX INFO: renamed from: in.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C6363g implements InterfaceC1626d {

    /* JADX INFO: renamed from: b */
    public final C9595b f36740b;

    /* JADX INFO: renamed from: c */
    public final C9595b f36741c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC6367k f36742d;

    public C6363g() {
        throw null;
    }

    public C6363g(InterfaceC6367k interfaceC6367k, ProtoBuf$Package protoBuf$Package, C7405f c7405f, DeserializedContainerAbiStability deserializedContainerAbiStability) {
        C5207g.m11111f(interfaceC6367k, "kotlinClass");
        C5207g.m11111f(protoBuf$Package, "packageProto");
        C5207g.m11111f(c7405f, "nameResolver");
        C5207g.m11111f(deserializedContainerAbiStability, "abiStability");
        C9595b c9595bM18064b = C9595b.m18064b(interfaceC6367k.mo13002j());
        KotlinClassHeader kotlinClassHeaderMo12999a = interfaceC6367k.mo12999a();
        boolean z10 = true;
        C9595b c9595bM18066d = null;
        String str = kotlinClassHeaderMo12999a.f38908a == KotlinClassHeader.Kind.MULTIFILE_CLASS_PART ? kotlinClassHeaderMo12999a.f38913f : null;
        if (str != null) {
            if (str.length() <= 0 ? false : z10) {
                c9595bM18066d = C9595b.m18066d(str);
            }
        }
        this.f36740b = c9595bM18064b;
        this.f36741c = c9595bM18066d;
        this.f36742d = interfaceC6367k;
        GeneratedMessageLite.C6985e<ProtoBuf$Package, Integer> c6985e = JvmProtoBuf.f39410m;
        C5207g.m11110e(c6985e, "packageModuleName");
        Integer num = (Integer) C7499b.m14902F(protoBuf$Package, c6985e);
        if (num != null) {
            c7405f.mo13351a(num.intValue());
        }
    }

    @Override // p372rm.InterfaceC8837f0
    /* JADX INFO: renamed from: a */
    public final void mo12989a() {
    }

    @Override // bo.InterfaceC1626d
    /* JADX INFO: renamed from: c */
    public final String mo5302c() {
        return "Class '" + m12990d().m15204b().m15214b() + '\'';
    }

    /* JADX INFO: renamed from: d */
    public final C7645b m12990d() {
        C7646c c7646c;
        C9595b c9595b = this.f36740b;
        String str = c9595b.f49262a;
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            c7646c = C7646c.f42076c;
            if (c7646c == null) {
                C9595b.m18063a(7);
                throw null;
            }
        } else {
            c7646c = new C7646c(str.substring(0, iLastIndexOf).replace('/', '.'));
        }
        String strM18067e = c9595b.m18067e();
        C5207g.m11110e(strM18067e, "className.internalName");
        return new C7645b(c7646c, C7648e.m15232l(C7076b.m14304x3(strM18067e, '/', strM18067e)));
    }

    public final String toString() {
        return C6363g.class.getSimpleName() + ": " + this.f36740b;
    }
}
