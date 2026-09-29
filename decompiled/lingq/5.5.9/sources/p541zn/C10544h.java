package p541zn;

import bo.InterfaceC1626d;
import co.InterfaceC2076h;
import dm.C5207g;
import java.util.List;
import java.util.Set;
import kn.AbstractC6731a;
import kn.C6735e;
import kn.C6736f;
import kn.InterfaceC6733c;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.protobuf.C6993d;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import mn.C7645b;
import p102eo.C5443h;
import p102eo.InterfaceC5442g;
import p338qd.C8578t;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8863u;
import p372rm.InterfaceC8865w;
import p372rm.InterfaceC8866x;
import p373rn.AbstractC8875g;
import p385sf.C9000b;
import p516ym.InterfaceC10418c;
import p543do.C5235i;
import p543do.InterfaceC5236i0;
import sm.InterfaceC9075c;
import tm.InterfaceC9339a;
import tm.InterfaceC9340b;
import tm.InterfaceC9341c;
import tm.InterfaceC9343e;
import vn.C9764b;

/* JADX INFO: renamed from: zn.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C10544h {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2076h f52579a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8863u f52580b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC10545i f52581c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC10542f f52582d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC10537a<InterfaceC9075c, AbstractC8875g<?>> f52583e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC8866x f52584f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC10552p f52585g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC10548l f52586h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC10418c f52587i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC10549m f52588j;

    /* JADX INFO: renamed from: k */
    public final Iterable<InterfaceC9340b> f52589k;

    /* JADX INFO: renamed from: l */
    public final NotFoundClasses f52590l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC10543g f52591m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC9339a f52592n;

    /* JADX INFO: renamed from: o */
    public final InterfaceC9341c f52593o;

    /* JADX INFO: renamed from: p */
    public final C6993d f52594p;

    /* JADX INFO: renamed from: q */
    public final InterfaceC5442g f52595q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC9343e f52596r;

    /* JADX INFO: renamed from: s */
    public final List<InterfaceC5236i0> f52597s;

    /* JADX INFO: renamed from: t */
    public final ClassDeserializer f52598t;

    public C10544h(InterfaceC2076h interfaceC2076h, InterfaceC8863u interfaceC8863u, InterfaceC10542f interfaceC10542f, InterfaceC10537a interfaceC10537a, InterfaceC8866x interfaceC8866x, InterfaceC10548l interfaceC10548l, InterfaceC10549m interfaceC10549m, Iterable iterable, NotFoundClasses notFoundClasses, InterfaceC9339a interfaceC9339a, InterfaceC9341c interfaceC9341c, C6993d c6993d, C5443h c5443h, C9764b c9764b, List list, int i10) {
        C5443h c5443h2;
        InterfaceC10545i.a aVar = InterfaceC10545i.a.f52599a;
        InterfaceC10552p.a aVar2 = InterfaceC10552p.a.f52607a;
        InterfaceC10418c.a aVar3 = InterfaceC10418c.a.f52220a;
        InterfaceC10543g.a.C10690a c10690a = InterfaceC10543g.a.f52578a;
        InterfaceC9339a interfaceC9339a2 = (i10 & 8192) != 0 ? InterfaceC9339a.a.f48072a : interfaceC9339a;
        InterfaceC9341c interfaceC9341c2 = (i10 & 16384) != 0 ? InterfaceC9341c.a.f48073a : interfaceC9341c;
        if ((65536 & i10) != 0) {
            InterfaceC5442g.f33991b.getClass();
            c5443h2 = InterfaceC5442g.a.f33993b;
        } else {
            c5443h2 = c5443h;
        }
        InterfaceC9343e.a aVar4 = (262144 & i10) != 0 ? InterfaceC9343e.a.f48076a : null;
        List listM17251q = (i10 & 524288) != 0 ? C9000b.m17251q(C5235i.f33326a) : list;
        C5207g.m11111f(interfaceC2076h, "storageManager");
        C5207g.m11111f(interfaceC8863u, "moduleDescriptor");
        C5207g.m11111f(interfaceC8866x, "packageFragmentProvider");
        C5207g.m11111f(iterable, "fictitiousClassDescriptorFactories");
        C5207g.m11111f(interfaceC9339a2, "additionalClassPartsProvider");
        C5207g.m11111f(interfaceC9341c2, "platformDependentDeclarationFilter");
        C5207g.m11111f(c6993d, "extensionRegistryLite");
        C5207g.m11111f(c5443h2, "kotlinTypeChecker");
        C5207g.m11111f(aVar4, "platformDependentTypeTransformer");
        C5207g.m11111f(listM17251q, "typeAttributeTranslators");
        this.f52579a = interfaceC2076h;
        this.f52580b = interfaceC8863u;
        this.f52581c = aVar;
        this.f52582d = interfaceC10542f;
        this.f52583e = interfaceC10537a;
        this.f52584f = interfaceC8866x;
        this.f52585g = aVar2;
        this.f52586h = interfaceC10548l;
        this.f52587i = aVar3;
        this.f52588j = interfaceC10549m;
        this.f52589k = iterable;
        this.f52590l = notFoundClasses;
        this.f52591m = c10690a;
        this.f52592n = interfaceC9339a2;
        this.f52593o = interfaceC9341c2;
        this.f52594p = c6993d;
        this.f52595q = c5443h2;
        this.f52596r = aVar4;
        this.f52597s = listM17251q;
        this.f52598t = new ClassDeserializer(this);
    }

    /* JADX INFO: renamed from: a */
    public final C8578t m19514a(InterfaceC8865w interfaceC8865w, InterfaceC6733c interfaceC6733c, C6735e c6735e, C6736f c6736f, AbstractC6731a abstractC6731a, InterfaceC1626d interfaceC1626d) {
        C5207g.m11111f(interfaceC8865w, "descriptor");
        C5207g.m11111f(interfaceC6733c, "nameResolver");
        C5207g.m11111f(c6736f, "versionRequirementTable");
        C5207g.m11111f(abstractC6731a, "metadataVersion");
        return new C8578t(this, interfaceC6733c, interfaceC8865w, c6735e, c6736f, abstractC6731a, interfaceC1626d, (TypeDeserializer) null, EmptyList.f38032a);
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC8830c m19515b(C7645b c7645b) {
        C5207g.m11111f(c7645b, "classId");
        Set<C7645b> set = ClassDeserializer.f39685c;
        return this.f52598t.m14121a(c7645b, null);
    }
}
