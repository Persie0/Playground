package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0856m0<T> implements InterfaceC0876w0<T> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0848i0 f5909a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0829b1<?, ?> f5910b;

    /* JADX INFO: renamed from: c */
    public final boolean f5911c;

    /* JADX INFO: renamed from: d */
    public final AbstractC0857n<?> f5912d;

    public C0856m0(AbstractC0829b1<?, ?> abstractC0829b1, AbstractC0857n<?> abstractC0857n, InterfaceC0848i0 interfaceC0848i0) {
        this.f5910b = abstractC0829b1;
        this.f5911c = abstractC0857n.mo3412e(interfaceC0848i0);
        this.f5912d = abstractC0857n;
        this.f5909a = interfaceC0848i0;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0876w0
    /* JADX INFO: renamed from: a */
    public final void mo3385a(T t10, T t11) {
        Class<?> cls = C0878x0.f5946a;
        AbstractC0829b1<?, ?> abstractC0829b1 = this.f5910b;
        abstractC0829b1.mo3187o(t10, abstractC0829b1.mo3183k(abstractC0829b1.mo3179g(t10), abstractC0829b1.mo3179g(t11)));
        if (this.f5911c) {
            C0878x0.m3448B(this.f5912d, t10, t11);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0876w0
    /* JADX INFO: renamed from: b */
    public final void mo3386b(T t10, InterfaceC0874v0 interfaceC0874v0, C0855m c0855m) throws IOException {
        AbstractC0829b1<?, ?> abstractC0829b1 = this.f5910b;
        C0832c1 c0832c1Mo3178f = abstractC0829b1.mo3178f(t10);
        AbstractC0857n<?> abstractC0857n = this.f5912d;
        C0863q c0863qMo3411d = abstractC0857n.mo3411d(t10);
        while (interfaceC0874v0.mo3342y() != Integer.MAX_VALUE && m3407j(interfaceC0874v0, c0855m, abstractC0857n, c0863qMo3411d, abstractC0829b1, c0832c1Mo3178f)) {
            try {
            } catch (Throwable th2) {
                abstractC0829b1.mo3186n(t10, c0832c1Mo3178f);
                throw th2;
            }
        }
        abstractC0829b1.mo3186n(t10, c0832c1Mo3178f);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0876w0
    /* JADX INFO: renamed from: c */
    public final void mo3387c(T t10) {
        this.f5910b.mo3182j(t10);
        this.f5912d.mo3413f(t10);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0876w0
    /* JADX INFO: renamed from: d */
    public final boolean mo3388d(T t10) {
        return this.f5912d.mo3410c(t10).m3430i();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0876w0
    /* JADX INFO: renamed from: e */
    public final void mo3389e(Object obj, C0849j c0849j) throws IOException {
        Iterator itM3431k = this.f5912d.mo3410c(obj).m3431k();
        while (itM3431k.hasNext()) {
            Map.Entry entry = (Map.Entry) itM3431k.next();
            C0863q.b bVar = (C0863q.b) entry.getKey();
            if (bVar.mo3141j() != WireFormat$JavaType.MESSAGE) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            bVar.mo3139e();
            bVar.isPacked();
            if (entry instanceof C0873v.a) {
                bVar.getNumber();
                c0849j.m3355l(0, ((C0873v.a) entry).f5941a.getValue().m3446b());
            } else {
                bVar.getNumber();
                c0849j.m3355l(0, entry.getValue());
            }
        }
        AbstractC0829b1<?, ?> abstractC0829b1 = this.f5910b;
        abstractC0829b1.mo3190r(abstractC0829b1.mo3179g(obj), c0849j);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0876w0
    /* JADX INFO: renamed from: f */
    public final boolean mo3390f(T t10, T t11) {
        AbstractC0829b1<?, ?> abstractC0829b1 = this.f5910b;
        if (!abstractC0829b1.mo3179g(t10).equals(abstractC0829b1.mo3179g(t11))) {
            return false;
        }
        if (!this.f5911c) {
            return true;
        }
        AbstractC0857n<?> abstractC0857n = this.f5912d;
        return abstractC0857n.mo3410c(t10).equals(abstractC0857n.mo3410c(t11));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0876w0
    /* JADX INFO: renamed from: g */
    public final int mo3391g(T t10) {
        C0882z0<T, Object> c0882z0;
        AbstractC0829b1<?, ?> abstractC0829b1 = this.f5910b;
        int i10 = 0;
        int iMo3181i = abstractC0829b1.mo3181i(abstractC0829b1.mo3179g(t10)) + 0;
        if (!this.f5911c) {
            return iMo3181i;
        }
        C0863q<T> c0863qMo3410c = this.f5912d.mo3410c(t10);
        int iM3422f = 0;
        while (true) {
            c0882z0 = c0863qMo3410c.f5919a;
            if (i10 >= c0882z0.m3503d()) {
                break;
            }
            iM3422f += C0863q.m3422f(c0882z0.m3502c(i10));
            i10++;
        }
        Iterator<T> it = c0882z0.m3504e().iterator();
        while (it.hasNext()) {
            iM3422f += C0863q.m3422f((Map.Entry) it.next());
        }
        return iMo3181i + iM3422f;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0876w0
    /* JADX INFO: renamed from: h */
    public final T mo3392h() {
        return (T) this.f5909a.mo3131e().m3137j();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0876w0
    /* JADX INFO: renamed from: i */
    public final int mo3393i(T t10) {
        int iHashCode = this.f5910b.mo3179g(t10).hashCode();
        return this.f5911c ? (iHashCode * 53) + this.f5912d.mo3410c(t10).hashCode() : iHashCode;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: j */
    public final <UT, UB, ET extends C0863q.b<ET>> boolean m3407j(InterfaceC0874v0 interfaceC0874v0, C0855m c0855m, AbstractC0857n<ET> abstractC0857n, C0863q<ET> c0863q, AbstractC0829b1<UT, UB> abstractC0829b1, UB ub2) throws IOException {
        int iMo3324g = interfaceC0874v0.mo3324g();
        InterfaceC0848i0 interfaceC0848i0 = this.f5909a;
        if (iMo3324g != 11) {
            if ((iMo3324g & 7) != 2) {
                return interfaceC0874v0.mo3301F();
            }
            GeneratedMessageLite.C0815e c0815eMo3409b = abstractC0857n.mo3409b(c0855m, interfaceC0848i0, iMo3324g >>> 3);
            if (c0815eMo3409b == null) {
                return abstractC0829b1.m3184l(ub2, interfaceC0874v0);
            }
            abstractC0857n.mo3415h(c0815eMo3409b);
            return true;
        }
        GeneratedMessageLite.C0815e c0815eMo3409b2 = null;
        int iMo3330m = 0;
        ByteString byteStringMo3297B = null;
        loop0: do {
            while (true) {
                if (interfaceC0874v0.mo3342y() == Integer.MAX_VALUE) {
                    break loop0;
                }
                int iMo3324g2 = interfaceC0874v0.mo3324g();
                if (iMo3324g2 == 16) {
                    iMo3330m = interfaceC0874v0.mo3330m();
                    c0815eMo3409b2 = abstractC0857n.mo3409b(c0855m, interfaceC0848i0, iMo3330m);
                } else if (iMo3324g2 == 26) {
                    if (c0815eMo3409b2 != null) {
                        abstractC0857n.mo3415h(c0815eMo3409b2);
                    } else {
                        byteStringMo3297B = interfaceC0874v0.mo3297B();
                    }
                }
            }
        } while (interfaceC0874v0.mo3301F());
        if (interfaceC0874v0.mo3324g() != 12) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        if (byteStringMo3297B != null) {
            if (c0815eMo3409b2 != null) {
                abstractC0857n.mo3416i(c0815eMo3409b2);
            } else {
                abstractC0829b1.mo3176d(ub2, iMo3330m, byteStringMo3297B);
            }
        }
        return true;
    }
}
