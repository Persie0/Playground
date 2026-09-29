package p372rm;

import dm.C5207g;
import java.util.List;
import kotlin.Pair;
import mn.C7648e;
import p139go.InterfaceC5853g;
import p385sf.C9000b;

/* JADX INFO: renamed from: rm.q */
/* JADX INFO: loaded from: classes2.dex */
public final class C8858q<Type extends InterfaceC5853g> extends AbstractC8849l0<Type> {

    /* JADX INFO: renamed from: a */
    public final C7648e f46762a;

    /* JADX INFO: renamed from: b */
    public final Type f46763b;

    public C8858q(C7648e c7648e, Type type) {
        C5207g.m11111f(c7648e, "underlyingPropertyName");
        C5207g.m11111f(type, "underlyingType");
        this.f46762a = c7648e;
        this.f46763b = type;
    }

    @Override // p372rm.AbstractC8849l0
    /* JADX INFO: renamed from: a */
    public final List<Pair<C7648e, Type>> mo17097a() {
        return C9000b.m17251q(new Pair(this.f46762a, this.f46763b));
    }
}
