package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import ae.C0062b;
import cm.InterfaceC2052l;
import co.InterfaceC2072d;
import dm.C5207g;
import java.util.Iterator;
import java.util.Set;
import kn.AbstractC6731a;
import kn.C6735e;
import kn.C6736f;
import kn.InterfaceC6733c;
import kotlin.reflect.jvm.internal.impl.builtins.C6797e;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import mn.C7645b;
import mn.C7646c;
import mn.C7648e;
import p260m8.C7499b;
import p338qd.C8578t;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8837f0;
import p372rm.InterfaceC8865w;
import p541zn.AbstractC10547k;
import p541zn.C10541e;
import p541zn.C10544h;
import tm.InterfaceC9340b;

/* JADX INFO: loaded from: classes2.dex */
public final class ClassDeserializer {

    /* JADX INFO: renamed from: c */
    public static final Set<C7645b> f39685c = C7499b.m14972w0(C7645b.m15203l(C6797e.a.f38379c.m15229h()));

    /* JADX INFO: renamed from: a */
    public final C10544h f39686a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2072d f39687b;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer$a */
    public static final class C7017a {

        /* JADX INFO: renamed from: a */
        public final C7645b f39688a;

        /* JADX INFO: renamed from: b */
        public final C10541e f39689b;

        public C7017a(C7645b c7645b, C10541e c10541e) {
            C5207g.m11111f(c7645b, "classId");
            this.f39688a = c7645b;
            this.f39689b = c10541e;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C7017a) {
                if (C5207g.m11106a(this.f39688a, ((C7017a) obj).f39688a)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f39688a.hashCode();
        }
    }

    public ClassDeserializer(C10544h c10544h) {
        C5207g.m11111f(c10544h, "components");
        this.f39686a = c10544h;
        this.f39687b = c10544h.f52579a.mo6222g(new InterfaceC2052l<C7017a, InterfaceC8830c>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer$classes$1
            {
                super(1);
            }

            /* JADX WARN: Code duplicated, block: B:37:0x00c4  */
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final InterfaceC8830c mo528n(ClassDeserializer.C7017a c7017a) {
                Object next;
                C8578t c8578tM19514a;
                boolean z10;
                InterfaceC8830c interfaceC8830cMo13582b;
                ClassDeserializer.C7017a c7017a2 = c7017a;
                C5207g.m11111f(c7017a2, "key");
                ClassDeserializer classDeserializer = this.f39690b;
                classDeserializer.getClass();
                C10544h c10544h2 = classDeserializer.f39686a;
                Iterator<InterfaceC9340b> it = c10544h2.f52589k.iterator();
                do {
                    boolean zHasNext = it.hasNext();
                    C7645b c7645b = c7017a2.f39688a;
                    if (!zHasNext) {
                        if (ClassDeserializer.f39685c.contains(c7645b)) {
                            return null;
                        }
                        C10541e c10541eMo12988a = c7017a2.f39689b;
                        if (c10541eMo12988a == null && (c10541eMo12988a = c10544h2.f52582d.mo12988a(c7645b)) == null) {
                            return null;
                        }
                        InterfaceC6733c interfaceC6733c = c10541eMo12988a.f52574a;
                        ProtoBuf$Class protoBuf$Class = c10541eMo12988a.f52575b;
                        AbstractC6731a abstractC6731a = c10541eMo12988a.f52576c;
                        InterfaceC8837f0 interfaceC8837f0 = c10541eMo12988a.f52577d;
                        C7645b c7645bM15207g = c7645b.m15207g();
                        if (c7645bM15207g != null) {
                            InterfaceC8830c interfaceC8830cM14121a = classDeserializer.m14121a(c7645bM15207g, null);
                            DeserializedClassDescriptor deserializedClassDescriptor = interfaceC8830cM14121a instanceof DeserializedClassDescriptor ? (DeserializedClassDescriptor) interfaceC8830cM14121a : null;
                            if (deserializedClassDescriptor == null) {
                                return null;
                            }
                            C7648e c7648eM15210j = c7645b.m15210j();
                            C5207g.m11110e(c7648eM15210j, "classId.shortClassName");
                            if (!deserializedClassDescriptor.m14141V0().m14148m().contains(c7648eM15210j)) {
                                return null;
                            }
                            c8578tM19514a = deserializedClassDescriptor.f39769l;
                        } else {
                            C7646c c7646cM15208h = c7645b.m15208h();
                            C5207g.m11110e(c7646cM15208h, "classId.packageFqName");
                            Iterator it2 = C0062b.m281J1(c10544h2.f52584f, c7646cM15208h).iterator();
                            do {
                                if (!it2.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it2.next();
                                InterfaceC8865w interfaceC8865w = (InterfaceC8865w) next;
                                if (interfaceC8865w instanceof AbstractC10547k) {
                                    AbstractC10547k abstractC10547k = (AbstractC10547k) interfaceC8865w;
                                    C7648e c7648eM15210j2 = c7645b.m15210j();
                                    C5207g.m11110e(c7648eM15210j2, "classId.shortClassName");
                                    abstractC10547k.getClass();
                                    if (((DeserializedMemberScope) ((DeserializedPackageFragmentImpl) abstractC10547k).mo13718q()).m14148m().contains(c7648eM15210j2)) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                } else {
                                    z10 = true;
                                }
                            } while (!z10);
                            InterfaceC8865w interfaceC8865w2 = (InterfaceC8865w) next;
                            if (interfaceC8865w2 == null) {
                                return null;
                            }
                            C10544h c10544h3 = classDeserializer.f39686a;
                            ProtoBuf$TypeTable protoBuf$TypeTable = protoBuf$Class.f39006Z;
                            C5207g.m11110e(protoBuf$TypeTable, "classProto.typeTable");
                            C6735e c6735e = new C6735e(protoBuf$TypeTable);
                            C6736f c6736f = C6736f.f37996b;
                            ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable = protoBuf$Class.f39009b0;
                            C5207g.m11110e(protoBuf$VersionRequirementTable, "classProto.versionRequirementTable");
                            c8578tM19514a = c10544h3.m19514a(interfaceC8865w2, interfaceC6733c, c6735e, C6736f.a.m13356a(protoBuf$VersionRequirementTable), abstractC6731a, null);
                        }
                        return new DeserializedClassDescriptor(c8578tM19514a, protoBuf$Class, interfaceC6733c, abstractC6731a, interfaceC8837f0);
                    }
                    interfaceC8830cMo13582b = it.next().mo13582b(c7645b);
                } while (interfaceC8830cMo13582b == null);
                return interfaceC8830cMo13582b;
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC8830c m14121a(C7645b c7645b, C10541e c10541e) {
        C5207g.m11111f(c7645b, "classId");
        return (InterfaceC8830c) this.f39687b.mo528n(new C7017a(c7645b, c10541e));
    }
}
