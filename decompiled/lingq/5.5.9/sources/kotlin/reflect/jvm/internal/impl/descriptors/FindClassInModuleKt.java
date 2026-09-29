package kotlin.reflect.jvm.internal.impl.descriptors;

import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.List;
import kotlin.collections.C6752c;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.sequences.C7073a;
import kotlin.sequences.SequencesKt__SequencesKt;
import mn.C7645b;
import mn.C7646c;
import mn.C7648e;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8863u;
import p372rm.InterfaceC8868z;
import p385sf.C9000b;
import pn.C8424o;
import pn.InterfaceC8423n;

/* JADX INFO: loaded from: classes2.dex */
public final class FindClassInModuleKt {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC8830c m13584a(InterfaceC8863u interfaceC8863u, C7645b c7645b) {
        C5207g.m11111f(interfaceC8863u, "<this>");
        C5207g.m11111f(c7645b, "classId");
        InterfaceC8834e interfaceC8834eM13585b = m13585b(interfaceC8863u, c7645b);
        if (interfaceC8834eM13585b instanceof InterfaceC8830c) {
            return (InterfaceC8830c) interfaceC8834eM13585b;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC8834e m13585b(InterfaceC8863u interfaceC8863u, C7645b c7645b) {
        InterfaceC8834e interfaceC8834eMo5304g;
        C5207g.m11111f(interfaceC8863u, "<this>");
        C5207g.m11111f(c7645b, "classId");
        InterfaceC8423n interfaceC8423n = (InterfaceC8423n) interfaceC8863u.mo11872O(C8424o.f45550a);
        InterfaceC8863u interfaceC8863uM16472a = interfaceC8423n != null ? interfaceC8423n.m16472a() : null;
        if (interfaceC8863uM16472a == null) {
            C7646c c7646cM15208h = c7645b.m15208h();
            C5207g.m11110e(c7646cM15208h, "classId.packageFqName");
            InterfaceC8868z interfaceC8868zMo11873R = interfaceC8863u.mo11873R(c7646cM15208h);
            List<C7648e> listM15227f = c7645b.m15209i().f42077a.m15227f();
            MemberScope memberScopeMo13628q = interfaceC8868zMo11873R.mo13628q();
            Object objM13423Q = C6752c.m13423Q(listM15227f);
            C5207g.m11110e(objM13423Q, "segments.first()");
            interfaceC8834eMo5304g = memberScopeMo13628q.mo5304g((C7648e) objM13423Q, NoLookupLocation.FROM_DESERIALIZATION);
            if (interfaceC8834eMo5304g == null) {
                return null;
            }
            for (C7648e c7648e : listM15227f.subList(1, listM15227f.size())) {
                if (!(interfaceC8834eMo5304g instanceof InterfaceC8830c)) {
                    return null;
                }
                MemberScope memberScopeMo13687H0 = ((InterfaceC8830c) interfaceC8834eMo5304g).mo13687H0();
                C5207g.m11110e(c7648e, "name");
                InterfaceC8834e interfaceC8834eMo5304g2 = memberScopeMo13687H0.mo5304g(c7648e, NoLookupLocation.FROM_DESERIALIZATION);
                interfaceC8834eMo5304g = interfaceC8834eMo5304g2 instanceof InterfaceC8830c ? (InterfaceC8830c) interfaceC8834eMo5304g2 : null;
                if (interfaceC8834eMo5304g == null) {
                    return null;
                }
            }
        } else {
            C7646c c7646cM15208h2 = c7645b.m15208h();
            C5207g.m11110e(c7646cM15208h2, "classId.packageFqName");
            InterfaceC8868z interfaceC8868zMo11873R2 = interfaceC8863uM16472a.mo11873R(c7646cM15208h2);
            List<C7648e> listM15227f2 = c7645b.m15209i().f42077a.m15227f();
            MemberScope memberScopeMo13628q2 = interfaceC8868zMo11873R2.mo13628q();
            Object objM13423Q2 = C6752c.m13423Q(listM15227f2);
            C5207g.m11110e(objM13423Q2, "segments.first()");
            InterfaceC8834e interfaceC8834eMo5304g3 = memberScopeMo13628q2.mo5304g((C7648e) objM13423Q2, NoLookupLocation.FROM_DESERIALIZATION);
            if (interfaceC8834eMo5304g3 == null) {
                interfaceC8834eMo5304g3 = null;
                break;
            }
            for (C7648e c7648e2 : listM15227f2.subList(1, listM15227f2.size())) {
                if (interfaceC8834eMo5304g3 instanceof InterfaceC8830c) {
                    MemberScope memberScopeMo13687H1 = ((InterfaceC8830c) interfaceC8834eMo5304g3).mo13687H0();
                    C5207g.m11110e(c7648e2, "name");
                    InterfaceC8834e interfaceC8834eMo5304g4 = memberScopeMo13687H1.mo5304g(c7648e2, NoLookupLocation.FROM_DESERIALIZATION);
                    interfaceC8834eMo5304g3 = interfaceC8834eMo5304g4 instanceof InterfaceC8830c ? (InterfaceC8830c) interfaceC8834eMo5304g4 : null;
                    if (interfaceC8834eMo5304g3 != null) {
                    }
                }
                interfaceC8834eMo5304g3 = null;
            }
            if (interfaceC8834eMo5304g3 != null) {
                return interfaceC8834eMo5304g3;
            }
            C7646c c7646cM15208h3 = c7645b.m15208h();
            C5207g.m11110e(c7646cM15208h3, "classId.packageFqName");
            InterfaceC8868z interfaceC8868zMo11873R3 = interfaceC8863u.mo11873R(c7646cM15208h3);
            List<C7648e> listM15227f3 = c7645b.m15209i().f42077a.m15227f();
            MemberScope memberScopeMo13628q3 = interfaceC8868zMo11873R3.mo13628q();
            Object objM13423Q3 = C6752c.m13423Q(listM15227f3);
            C5207g.m11110e(objM13423Q3, "segments.first()");
            interfaceC8834eMo5304g = memberScopeMo13628q3.mo5304g((C7648e) objM13423Q3, NoLookupLocation.FROM_DESERIALIZATION);
            if (interfaceC8834eMo5304g == null) {
                return null;
            }
            for (C7648e c7648e3 : listM15227f3.subList(1, listM15227f3.size())) {
                if (!(interfaceC8834eMo5304g instanceof InterfaceC8830c)) {
                    return null;
                }
                MemberScope memberScopeMo13687H2 = ((InterfaceC8830c) interfaceC8834eMo5304g).mo13687H0();
                C5207g.m11110e(c7648e3, "name");
                InterfaceC8834e interfaceC8834eMo5304g5 = memberScopeMo13687H2.mo5304g(c7648e3, NoLookupLocation.FROM_DESERIALIZATION);
                interfaceC8834eMo5304g = interfaceC8834eMo5304g5 instanceof InterfaceC8830c ? (InterfaceC8830c) interfaceC8834eMo5304g5 : null;
                if (interfaceC8834eMo5304g == null) {
                    return null;
                }
            }
        }
        return interfaceC8834eMo5304g;
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC8830c m13586c(InterfaceC8863u interfaceC8863u, C7645b c7645b, NotFoundClasses notFoundClasses) {
        C5207g.m11111f(interfaceC8863u, "<this>");
        C5207g.m11111f(c7645b, "classId");
        C5207g.m11111f(notFoundClasses, "notFoundClasses");
        InterfaceC8830c interfaceC8830cM13584a = m13584a(interfaceC8863u, c7645b);
        return interfaceC8830cM13584a != null ? interfaceC8830cM13584a : notFoundClasses.m13588a(c7645b, C9000b.m17255u(C7073a.m14267b3(C7073a.m14261V2(SequencesKt__SequencesKt.m14252M2(c7645b, C6807x24bfe126.f38447j), new InterfaceC2052l<C7645b, Integer>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$2
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Integer mo528n(C7645b c7645b2) {
                C5207g.m11111f(c7645b2, "it");
                return 0;
            }
        }))));
    }
}
