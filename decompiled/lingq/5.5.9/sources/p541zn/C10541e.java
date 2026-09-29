package p541zn;

import dm.C5207g;
import kn.AbstractC6731a;
import kn.InterfaceC6733c;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import p372rm.InterfaceC8837f0;

/* JADX INFO: renamed from: zn.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C10541e {

    /* JADX INFO: renamed from: a */
    public final InterfaceC6733c f52574a;

    /* JADX INFO: renamed from: b */
    public final ProtoBuf$Class f52575b;

    /* JADX INFO: renamed from: c */
    public final AbstractC6731a f52576c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC8837f0 f52577d;

    public C10541e(InterfaceC6733c interfaceC6733c, ProtoBuf$Class protoBuf$Class, AbstractC6731a abstractC6731a, InterfaceC8837f0 interfaceC8837f0) {
        C5207g.m11111f(interfaceC6733c, "nameResolver");
        C5207g.m11111f(protoBuf$Class, "classProto");
        C5207g.m11111f(abstractC6731a, "metadataVersion");
        C5207g.m11111f(interfaceC8837f0, "sourceElement");
        this.f52574a = interfaceC6733c;
        this.f52575b = protoBuf$Class;
        this.f52576c = abstractC6731a;
        this.f52577d = interfaceC8837f0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10541e)) {
            return false;
        }
        C10541e c10541e = (C10541e) obj;
        if (C5207g.m11106a(this.f52574a, c10541e.f52574a) && C5207g.m11106a(this.f52575b, c10541e.f52575b) && C5207g.m11106a(this.f52576c, c10541e.f52576c) && C5207g.m11106a(this.f52577d, c10541e.f52577d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f52577d.hashCode() + ((this.f52576c.hashCode() + ((this.f52575b.hashCode() + (this.f52574a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClassData(nameResolver=" + this.f52574a + ", classProto=" + this.f52575b + ", metadataVersion=" + this.f52576c + ", sourceElement=" + this.f52577d + ')';
    }
}
