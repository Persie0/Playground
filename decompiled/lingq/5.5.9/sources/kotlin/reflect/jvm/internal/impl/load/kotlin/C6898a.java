package kotlin.reflect.jvm.internal.impl.load.kotlin;

import bo.C1628f;
import cm.InterfaceC2041a;
import dm.C5207g;
import in.C6363g;
import in.C6369m;
import in.InterfaceC6367k;
import java.util.Collection;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import mn.C7648e;
import p248ln.C7404e;
import p248ln.C7405f;
import p248ln.C7407h;
import p260m8.C7499b;
import p420um.AbstractC9556a0;
import p541zn.C10541e;
import p541zn.C10544h;
import p541zn.C10550n;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C6898a {

    /* JADX INFO: renamed from: b */
    public static final Set<KotlinClassHeader.Kind> f38903b = C7499b.m14972w0(KotlinClassHeader.Kind.CLASS);

    /* JADX INFO: renamed from: c */
    public static final Set<KotlinClassHeader.Kind> f38904c = C7499b.m14973x0(KotlinClassHeader.Kind.FILE_FACADE, KotlinClassHeader.Kind.MULTIFILE_CLASS_PART);

    /* JADX INFO: renamed from: d */
    public static final C7404e f38905d;

    /* JADX INFO: renamed from: e */
    public static final C7404e f38906e;

    /* JADX INFO: renamed from: a */
    public C10544h f38907a;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    static {
        new C7404e(new int[]{1, 1, 2}, false);
        f38905d = new C7404e(new int[]{1, 1, 11}, false);
        f38906e = new C7404e(new int[]{1, 1, 13}, false);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002f  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final C1628f m13767a(AbstractC9556a0 abstractC9556a0, InterfaceC6367k interfaceC6367k) {
        String[] strArr;
        Pair<C7405f, ProtoBuf$Package> pairM14814h;
        C5207g.m11111f(abstractC9556a0, "descriptor");
        C5207g.m11111f(interfaceC6367k, "kotlinClass");
        KotlinClassHeader kotlinClassHeaderMo12999a = interfaceC6367k.mo12999a();
        String[] strArr2 = kotlinClassHeaderMo12999a.f38910c;
        if (strArr2 == null) {
            strArr2 = kotlinClassHeaderMo12999a.f38911d;
        }
        if (strArr2 == null) {
            strArr2 = null;
        } else if (!f38904c.contains(kotlinClassHeaderMo12999a.f38908a)) {
            strArr2 = null;
        }
        if (strArr2 == null || (strArr = interfaceC6367k.mo12999a().f38912e) == null) {
            return null;
        }
        try {
            try {
                pairM14814h = C7407h.m14814h(strArr2, strArr);
            } catch (InvalidProtocolBufferException e10) {
                throw new IllegalStateException("Could not read data from " + interfaceC6367k.getLocation(), e10);
            }
        } catch (Throwable th2) {
            m13769c().f52581c.mo19519d();
            if (interfaceC6367k.mo12999a().f38909b.m14806c()) {
                throw th2;
            }
            pairM14814h = null;
        }
        if (pairM14814h == null) {
            return null;
        }
        C7405f c7405f = pairM14814h.f38012a;
        ProtoBuf$Package protoBuf$Package = pairM14814h.f38013b;
        m13770d(interfaceC6367k);
        m13771e(interfaceC6367k);
        C6363g c6363g = new C6363g(interfaceC6367k, protoBuf$Package, c7405f, m13768b(interfaceC6367k));
        return new C1628f(abstractC9556a0, protoBuf$Package, c7405f, interfaceC6367k.mo12999a().f38909b, c6363g, m13769c(), "scope for " + c6363g + " in " + abstractC9556a0, new InterfaceC2041a<Collection<? extends C7648e>>() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver$createKotlinPackagePartScope$2
            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Collection<? extends C7648e> mo807E() {
                return EmptyList.f38032a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    /* JADX INFO: renamed from: b */
    public final DeserializedContainerAbiStability m13768b(InterfaceC6367k interfaceC6367k) {
        boolean z10;
        m13769c().f52581c.mo19517b();
        int i10 = interfaceC6367k.mo12999a().f38914g;
        boolean z11 = true;
        if ((i10 & 64) != 0) {
            if ((i10 & 32) != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
        } else {
            z10 = false;
        }
        if (z10) {
            return DeserializedContainerAbiStability.FIR_UNSTABLE;
        }
        int i11 = interfaceC6367k.mo12999a().f38914g;
        if ((i11 & 16) != 0) {
            if ((i11 & 32) != 0) {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        return z11 ? DeserializedContainerAbiStability.IR_UNSTABLE : DeserializedContainerAbiStability.STABLE;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public final C10544h m13769c() {
        C10544h c10544h = this.f38907a;
        if (c10544h != null) {
            return c10544h;
        }
        C5207g.m11117l("components");
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public final C10550n<C7404e> m13770d(InterfaceC6367k interfaceC6367k) {
        m13769c().f52581c.mo19519d();
        if (interfaceC6367k.mo12999a().f38909b.m14806c()) {
            return null;
        }
        return new C10550n<>(interfaceC6367k.mo12999a().f38909b, C7404e.f41222g, interfaceC6367k.getLocation(), interfaceC6367k.mo13002j());
    }

    /* JADX INFO: renamed from: e */
    public final boolean m13771e(InterfaceC6367k interfaceC6367k) {
        m13769c().f52581c.mo19520e();
        m13769c().f52581c.mo19518c();
        return ((interfaceC6367k.mo12999a().f38914g & 2) != 0) && C5207g.m11106a(interfaceC6367k.mo12999a().f38909b, f38905d);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX INFO: renamed from: f */
    public final C10541e m13772f(InterfaceC6367k interfaceC6367k) {
        String[] strArr;
        Pair<C7405f, ProtoBuf$Class> pairM14812f;
        KotlinClassHeader kotlinClassHeaderMo12999a = interfaceC6367k.mo12999a();
        String[] strArr2 = kotlinClassHeaderMo12999a.f38910c;
        if (strArr2 == null) {
            strArr2 = kotlinClassHeaderMo12999a.f38911d;
        }
        if (strArr2 == null) {
            strArr2 = null;
        } else if (!f38903b.contains(kotlinClassHeaderMo12999a.f38908a)) {
            strArr2 = null;
        }
        if (strArr2 != null && (strArr = interfaceC6367k.mo12999a().f38912e) != null) {
            try {
                try {
                    pairM14812f = C7407h.m14812f(strArr2, strArr);
                } catch (InvalidProtocolBufferException e10) {
                    throw new IllegalStateException("Could not read data from " + interfaceC6367k.getLocation(), e10);
                }
            } catch (Throwable th2) {
                m13769c().f52581c.mo19519d();
                if (interfaceC6367k.mo12999a().f38909b.m14806c()) {
                    throw th2;
                }
                pairM14812f = null;
            }
            if (pairM14812f == null) {
                return null;
            }
            C7405f c7405f = pairM14812f.f38012a;
            ProtoBuf$Class protoBuf$Class = pairM14812f.f38013b;
            m13770d(interfaceC6367k);
            m13771e(interfaceC6367k);
            return new C10541e(c7405f, protoBuf$Class, interfaceC6367k.mo12999a().f38909b, new C6369m(interfaceC6367k, m13768b(interfaceC6367k)));
        }
        return null;
    }
}
