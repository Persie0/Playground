package kotlin.reflect.jvm.internal.impl.load.java;

import cm.InterfaceC2052l;
import dm.C5207g;
import dm.C5209i;
import km.InterfaceC6721d;
import kotlin.jvm.internal.FunctionReference;
import mn.C7646c;
import sl.C9069b;
import zm.C10530o;
import zm.C10531p;
import zm.InterfaceC10536u;

/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class JavaTypeEnhancementState$Companion$DEFAULT$1 extends FunctionReference implements InterfaceC2052l<C7646c, ReportLevel> {

    /* JADX INFO: renamed from: j */
    public static final JavaTypeEnhancementState$Companion$DEFAULT$1 f38607j = new JavaTypeEnhancementState$Companion$DEFAULT$1();

    public JavaTypeEnhancementState$Companion$DEFAULT$1() {
        super(1);
    }

    @Override // kotlin.jvm.internal.CallableReference, km.InterfaceC6718a
    /* JADX INFO: renamed from: a */
    public final String mo13336a() {
        return "getDefaultReportLevelForAnnotation";
    }

    @Override // kotlin.jvm.internal.CallableReference
    /* JADX INFO: renamed from: d */
    public final InterfaceC6721d mo13479d() {
        return C5209i.f33277a.mo11123c(C10530o.class, "compiler.common.jvm");
    }

    @Override // kotlin.jvm.internal.CallableReference
    /* JADX INFO: renamed from: e */
    public final String mo13480e() {
        return "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;";
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final ReportLevel mo528n(C7646c c7646c) {
        C7646c c7646c2 = c7646c;
        C5207g.m11111f(c7646c2, "p0");
        C7646c c7646c3 = C10530o.f52524a;
        InterfaceC10536u.f52565a.getClass();
        NullabilityAnnotationStatesImpl nullabilityAnnotationStatesImpl = InterfaceC10536u.a.f52567b;
        C9069b c9069b = new C9069b(7, 0);
        C5207g.m11111f(nullabilityAnnotationStatesImpl, "configuredReportLevels");
        ReportLevel reportLevel = (ReportLevel) nullabilityAnnotationStatesImpl.f38610c.mo528n(c7646c2);
        if (reportLevel != null) {
            return reportLevel;
        }
        NullabilityAnnotationStatesImpl nullabilityAnnotationStatesImpl2 = C10530o.f52525b;
        nullabilityAnnotationStatesImpl2.getClass();
        C10531p c10531p = (C10531p) nullabilityAnnotationStatesImpl2.f38610c.mo528n(c7646c2);
        if (c10531p == null) {
            return ReportLevel.IGNORE;
        }
        C9069b c9069b2 = c10531p.f52529b;
        return (c9069b2 == null || c9069b2.f47358d - c9069b.f47358d > 0) ? c10531p.f52528a : c10531p.f52530c;
    }
}
