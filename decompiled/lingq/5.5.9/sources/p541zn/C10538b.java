package p541zn;

import ao.C1269a;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kn.InterfaceC6733c;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import p260m8.C7499b;
import p372rm.InterfaceC8863u;
import p373rn.AbstractC8875g;
import p517yn.C10419a;
import p543do.AbstractC5257t;
import sm.InterfaceC9075c;
import tl.C9325m;

/* JADX INFO: renamed from: zn.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C10538b implements InterfaceC10537a<InterfaceC9075c, AbstractC8875g<?>> {

    /* JADX INFO: renamed from: a */
    public final C10419a f52568a;

    /* JADX INFO: renamed from: b */
    public final C10539c f52569b;

    /* JADX INFO: renamed from: zn.b$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f52570a;

        static {
            int[] iArr = new int[AnnotatedCallableKind.values().length];
            iArr[AnnotatedCallableKind.PROPERTY.ordinal()] = 1;
            iArr[AnnotatedCallableKind.PROPERTY_GETTER.ordinal()] = 2;
            iArr[AnnotatedCallableKind.PROPERTY_SETTER.ordinal()] = 3;
            f52570a = iArr;
        }
    }

    public C10538b(InterfaceC8863u interfaceC8863u, NotFoundClasses notFoundClasses, C1269a c1269a) {
        C5207g.m11111f(interfaceC8863u, "module");
        C5207g.m11111f(c1269a, "protocol");
        this.f52568a = c1269a;
        this.f52569b = new C10539c(interfaceC8863u, notFoundClasses);
    }

    @Override // p541zn.InterfaceC10540d
    /* JADX INFO: renamed from: a */
    public final ArrayList mo13753a(ProtoBuf$Type protoBuf$Type, InterfaceC6733c interfaceC6733c) {
        C5207g.m11111f(protoBuf$Type, "proto");
        C5207g.m11111f(interfaceC6733c, "nameResolver");
        Iterable iterable = (List) protoBuf$Type.m13921r(this.f52568a.f52231k);
        if (iterable == null) {
            iterable = EmptyList.f38032a;
        }
        ArrayList arrayList = new ArrayList(C9325m.m17681z(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f52569b.m19510a((ProtoBuf$Annotation) it.next(), interfaceC6733c));
        }
        return arrayList;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // p541zn.InterfaceC10540d
    /* JADX INFO: renamed from: b */
    public final List<InterfaceC9075c> mo13754b(AbstractC10554r abstractC10554r, InterfaceC6997h interfaceC6997h, AnnotatedCallableKind annotatedCallableKind) {
        List list;
        C5207g.m11111f(interfaceC6997h, "proto");
        C5207g.m11111f(annotatedCallableKind, "kind");
        boolean z10 = interfaceC6997h instanceof ProtoBuf$Constructor;
        C10419a c10419a = this.f52568a;
        if (z10) {
            list = (List) ((ProtoBuf$Constructor) interfaceC6997h).m13921r(c10419a.f52222b);
        } else if (interfaceC6997h instanceof ProtoBuf$Function) {
            list = (List) ((ProtoBuf$Function) interfaceC6997h).m13921r(c10419a.f52224d);
        } else {
            if (!(interfaceC6997h instanceof ProtoBuf$Property)) {
                throw new IllegalStateException(("Unknown message: " + interfaceC6997h).toString());
            }
            int i10 = a.f52570a[annotatedCallableKind.ordinal()];
            if (i10 == 1) {
                list = (List) ((ProtoBuf$Property) interfaceC6997h).m13921r(c10419a.f52225e);
            } else if (i10 == 2) {
                list = (List) ((ProtoBuf$Property) interfaceC6997h).m13921r(c10419a.f52226f);
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("Unsupported callable kind with property proto".toString());
                }
                list = (List) ((ProtoBuf$Property) interfaceC6997h).m13921r(c10419a.f52227g);
            }
        }
        if (list == null) {
            list = EmptyList.f38032a;
        }
        ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f52569b.m19510a((ProtoBuf$Annotation) it.next(), abstractC10554r.f52612a));
        }
        return arrayList;
    }

    @Override // p541zn.InterfaceC10540d
    /* JADX INFO: renamed from: c */
    public final List<InterfaceC9075c> mo13755c(AbstractC10554r abstractC10554r, InterfaceC6997h interfaceC6997h, AnnotatedCallableKind annotatedCallableKind, int i10, ProtoBuf$ValueParameter protoBuf$ValueParameter) {
        C5207g.m11111f(abstractC10554r, "container");
        C5207g.m11111f(interfaceC6997h, "callableProto");
        C5207g.m11111f(annotatedCallableKind, "kind");
        C5207g.m11111f(protoBuf$ValueParameter, "proto");
        Iterable iterable = (List) protoBuf$ValueParameter.m13921r(this.f52568a.f52230j);
        if (iterable == null) {
            iterable = EmptyList.f38032a;
        }
        ArrayList arrayList = new ArrayList(C9325m.m17681z(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f52569b.m19510a((ProtoBuf$Annotation) it.next(), abstractC10554r.f52612a));
        }
        return arrayList;
    }

    @Override // p541zn.InterfaceC10540d
    /* JADX INFO: renamed from: d */
    public final ArrayList mo13756d(ProtoBuf$TypeParameter protoBuf$TypeParameter, InterfaceC6733c interfaceC6733c) {
        C5207g.m11111f(protoBuf$TypeParameter, "proto");
        C5207g.m11111f(interfaceC6733c, "nameResolver");
        Iterable iterable = (List) protoBuf$TypeParameter.m13921r(this.f52568a.f52232l);
        if (iterable == null) {
            iterable = EmptyList.f38032a;
        }
        ArrayList arrayList = new ArrayList(C9325m.m17681z(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f52569b.m19510a((ProtoBuf$Annotation) it.next(), interfaceC6733c));
        }
        return arrayList;
    }

    @Override // p541zn.InterfaceC10540d
    /* JADX INFO: renamed from: e */
    public final ArrayList mo13757e(AbstractC10554r.a aVar) {
        C5207g.m11111f(aVar, "container");
        Iterable iterable = (List) aVar.f52615d.m13921r(this.f52568a.f52223c);
        if (iterable == null) {
            iterable = EmptyList.f38032a;
        }
        ArrayList arrayList = new ArrayList(C9325m.m17681z(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f52569b.m19510a((ProtoBuf$Annotation) it.next(), aVar.f52612a));
        }
        return arrayList;
    }

    @Override // p541zn.InterfaceC10540d
    /* JADX INFO: renamed from: f */
    public final List<InterfaceC9075c> mo13758f(AbstractC10554r abstractC10554r, ProtoBuf$Property protoBuf$Property) {
        C5207g.m11111f(protoBuf$Property, "proto");
        return EmptyList.f38032a;
    }

    @Override // p541zn.InterfaceC10537a
    /* JADX INFO: renamed from: g */
    public final AbstractC8875g<?> mo13746g(AbstractC10554r abstractC10554r, ProtoBuf$Property protoBuf$Property, AbstractC5257t abstractC5257t) {
        C5207g.m11111f(protoBuf$Property, "proto");
        ProtoBuf$Annotation.Argument.Value value = (ProtoBuf$Annotation.Argument.Value) C7499b.m14902F(protoBuf$Property, this.f52568a.f52229i);
        if (value == null) {
            return null;
        }
        return this.f52569b.m19512c(abstractC5257t, value, abstractC10554r.f52612a);
    }

    @Override // p541zn.InterfaceC10540d
    /* JADX INFO: renamed from: h */
    public final List mo13759h(AbstractC10554r.a aVar, ProtoBuf$EnumEntry protoBuf$EnumEntry) {
        C5207g.m11111f(aVar, "container");
        C5207g.m11111f(protoBuf$EnumEntry, "proto");
        Iterable iterable = (List) protoBuf$EnumEntry.m13921r(this.f52568a.f52228h);
        if (iterable == null) {
            iterable = EmptyList.f38032a;
        }
        ArrayList arrayList = new ArrayList(C9325m.m17681z(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f52569b.m19510a((ProtoBuf$Annotation) it.next(), aVar.f52612a));
        }
        return arrayList;
    }

    @Override // p541zn.InterfaceC10540d
    /* JADX INFO: renamed from: i */
    public final List<InterfaceC9075c> mo13760i(AbstractC10554r abstractC10554r, ProtoBuf$Property protoBuf$Property) {
        C5207g.m11111f(protoBuf$Property, "proto");
        return EmptyList.f38032a;
    }

    @Override // p541zn.InterfaceC10540d
    /* JADX INFO: renamed from: j */
    public final List<InterfaceC9075c> mo13761j(AbstractC10554r abstractC10554r, InterfaceC6997h interfaceC6997h, AnnotatedCallableKind annotatedCallableKind) {
        C5207g.m11111f(interfaceC6997h, "proto");
        C5207g.m11111f(annotatedCallableKind, "kind");
        return EmptyList.f38032a;
    }

    @Override // p541zn.InterfaceC10537a
    /* JADX INFO: renamed from: k */
    public final AbstractC8875g<?> mo13747k(AbstractC10554r abstractC10554r, ProtoBuf$Property protoBuf$Property, AbstractC5257t abstractC5257t) {
        C5207g.m11111f(protoBuf$Property, "proto");
        return null;
    }
}
