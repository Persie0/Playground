package p541zn;

import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.LinkedHashMap;
import java.util.List;
import kn.AbstractC6731a;
import kn.C6734d;
import kn.InterfaceC6733c;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment;
import mn.C7645b;
import p260m8.C7499b;
import p372rm.InterfaceC8837f0;
import tl.C9325m;

/* JADX INFO: renamed from: zn.q */
/* JADX INFO: loaded from: classes2.dex */
public final class C10553q implements InterfaceC10542f {

    /* JADX INFO: renamed from: a */
    public final InterfaceC6733c f52608a;

    /* JADX INFO: renamed from: b */
    public final AbstractC6731a f52609b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2052l<C7645b, InterfaceC8837f0> f52610c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f52611d;

    public C10553q(ProtoBuf$PackageFragment protoBuf$PackageFragment, C6734d c6734d, AbstractC6731a abstractC6731a, InterfaceC2052l interfaceC2052l) {
        this.f52608a = c6734d;
        this.f52609b = abstractC6731a;
        this.f52610c = interfaceC2052l;
        List<ProtoBuf$Class> list = protoBuf$PackageFragment.f39173g;
        C5207g.m11110e(list, "proto.class_List");
        int iM14941g0 = C7499b.m14941g0(C9325m.m17681z(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM14941g0 < 16 ? 16 : iM14941g0);
        for (Object obj : list) {
            linkedHashMap.put(C7499b.m14896C(this.f52608a, ((ProtoBuf$Class) obj).f39014e), obj);
        }
        this.f52611d = linkedHashMap;
    }

    @Override // p541zn.InterfaceC10542f
    /* JADX INFO: renamed from: a */
    public final C10541e mo12988a(C7645b c7645b) {
        C5207g.m11111f(c7645b, "classId");
        ProtoBuf$Class protoBuf$Class = (ProtoBuf$Class) this.f52611d.get(c7645b);
        if (protoBuf$Class == null) {
            return null;
        }
        return new C10541e(this.f52608a, protoBuf$Class, this.f52609b, this.f52610c.mo528n(c7645b));
    }
}
