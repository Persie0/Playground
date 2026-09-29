package kotlin.reflect.jvm.internal.impl.load.java;

import cm.InterfaceC2052l;
import dm.C5207g;
import mn.C7646c;
import sl.C9069b;
import zm.C10530o;
import zm.C10531p;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaTypeEnhancementState {

    /* JADX INFO: renamed from: d */
    public static final JavaTypeEnhancementState f38603d;

    /* JADX INFO: renamed from: a */
    public final C6842c f38604a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2052l<C7646c, ReportLevel> f38605b;

    /* JADX INFO: renamed from: c */
    public final boolean f38606c;

    static {
        C7646c c7646c = C10530o.f52524a;
        C9069b c9069b = C9069b.f47354e;
        C5207g.m11111f(c9069b, "configuredKotlinVersion");
        C10531p c10531p = C10530o.f52526c;
        C9069b c9069b2 = c10531p.f52529b;
        ReportLevel reportLevel = (c9069b2 == null || c9069b2.f47358d - c9069b.f47358d > 0) ? c10531p.f52528a : c10531p.f52530c;
        C5207g.m11111f(reportLevel, "globalReportLevel");
        f38603d = new JavaTypeEnhancementState(new C6842c(reportLevel, reportLevel == ReportLevel.WARN ? null : reportLevel), JavaTypeEnhancementState$Companion$DEFAULT$1.f38607j);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0025  */
    /* JADX WARN: Multi-variable type inference failed */
    public JavaTypeEnhancementState(C6842c c6842c, InterfaceC2052l<? super C7646c, ? extends ReportLevel> interfaceC2052l) {
        boolean z10;
        C5207g.m11111f(interfaceC2052l, "getReportLevelForAnnotation");
        this.f38604a = c6842c;
        this.f38605b = interfaceC2052l;
        if (c6842c.f38635d) {
            z10 = true;
        } else {
            if (((JavaTypeEnhancementState$Companion$DEFAULT$1) interfaceC2052l).mo528n(C10530o.f52524a) == ReportLevel.IGNORE) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        this.f38606c = z10;
    }

    public final String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.f38604a + ", getReportLevelForAnnotation=" + this.f38605b + ')';
    }
}
