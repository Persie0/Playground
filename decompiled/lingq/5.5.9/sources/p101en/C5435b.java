package p101en;

import dm.C5207g;
import dm.C5212l;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import mn.C7646c;
import p260m8.C7499b;
import p372rm.InterfaceC8847k0;
import p420um.AbstractC9571i;
import p543do.AbstractC5248o0;
import p543do.C5250p0;

/* JADX INFO: renamed from: en.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C5435b {

    /* JADX INFO: renamed from: a */
    public static final C7646c f33979a = new C7646c("java.lang.Class");

    /* JADX INFO: renamed from: a */
    public static final AbstractC5248o0 m11585a(InterfaceC8847k0 interfaceC8847k0, C5434a c5434a) {
        C5207g.m11111f(interfaceC8847k0, "typeParameter");
        C5207g.m11111f(c5434a, "attr");
        return c5434a.f33974a == TypeUsage.SUPERTYPE ? new C5250p0(C5212l.m11164k0(interfaceC8847k0)) : new StarProjectionImpl(interfaceC8847k0);
    }

    /* JADX INFO: renamed from: b */
    public static C5434a m11586b(TypeUsage typeUsage, boolean z10, AbstractC9571i abstractC9571i, int i10) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            abstractC9571i = null;
        }
        C5207g.m11111f(typeUsage, "<this>");
        return new C5434a(typeUsage, z10, abstractC9571i != null ? C7499b.m14972w0(abstractC9571i) : null, 18);
    }
}
