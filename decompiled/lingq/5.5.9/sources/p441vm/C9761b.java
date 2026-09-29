package p441vm;

import dm.C5207g;
import kotlin.collections.builders.MapBuilder;
import p372rm.AbstractC8859q0;
import p372rm.C8857p0;

/* JADX INFO: renamed from: vm.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C9761b extends AbstractC8859q0 {

    /* JADX INFO: renamed from: c */
    public static final C9761b f49826c = new C9761b();

    public C9761b() {
        super("protected_and_package", true);
    }

    @Override // p372rm.AbstractC8859q0
    /* JADX INFO: renamed from: a */
    public final Integer mo17117a(AbstractC8859q0 abstractC8859q0) {
        C5207g.m11111f(abstractC8859q0, "visibility");
        boolean z10 = false;
        if (C5207g.m11106a(this, abstractC8859q0)) {
            return 0;
        }
        if (abstractC8859q0 == C8857p0.b.f46754c) {
            return null;
        }
        MapBuilder mapBuilder = C8857p0.f46752a;
        if (abstractC8859q0 == C8857p0.e.f46757c || abstractC8859q0 == C8857p0.f.f46758c) {
            z10 = true;
        }
        return Integer.valueOf(z10 ? 1 : -1);
    }

    @Override // p372rm.AbstractC8859q0
    /* JADX INFO: renamed from: b */
    public final String mo17116b() {
        return "protected/*protected and package*/";
    }

    @Override // p372rm.AbstractC8859q0
    /* JADX INFO: renamed from: c */
    public final AbstractC8859q0 mo17118c() {
        return C8857p0.g.f46759c;
    }
}
