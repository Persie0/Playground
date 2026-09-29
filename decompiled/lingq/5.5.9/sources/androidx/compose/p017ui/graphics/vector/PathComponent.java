package androidx.compose.p017ui.graphics.vector;

import android.graphics.PathMeasure;
import cm.InterfaceC2041a;
import java.util.List;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import p338qd.C8573r0;
import p375s0.C8941c;
import p387t0.AbstractC9161o;
import p387t0.C9151j;
import p387t0.C9153k;
import p387t0.InterfaceC9142e0;
import p424v0.C9624h;
import p469x0.AbstractC10003d;
import p469x0.AbstractC10005f;
import p469x0.C10004e;
import p469x0.C10009j;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes.dex */
public final class PathComponent extends AbstractC10005f {

    /* JADX INFO: renamed from: b */
    public AbstractC9161o f3449b;

    /* JADX INFO: renamed from: f */
    public float f3453f;

    /* JADX INFO: renamed from: g */
    public AbstractC9161o f3454g;

    /* JADX INFO: renamed from: k */
    public float f3458k;

    /* JADX INFO: renamed from: m */
    public float f3460m;

    /* JADX INFO: renamed from: q */
    public C9624h f3464q;

    /* JADX INFO: renamed from: c */
    public float f3450c = 1.0f;

    /* JADX INFO: renamed from: d */
    public List<? extends AbstractC10003d> f3451d = C10009j.f50944a;

    /* JADX INFO: renamed from: e */
    public float f3452e = 1.0f;

    /* JADX INFO: renamed from: h */
    public int f3455h = 0;

    /* JADX INFO: renamed from: i */
    public int f3456i = 0;

    /* JADX INFO: renamed from: j */
    public float f3457j = 4.0f;

    /* JADX INFO: renamed from: l */
    public float f3459l = 1.0f;

    /* JADX INFO: renamed from: n */
    public boolean f3461n = true;

    /* JADX INFO: renamed from: o */
    public boolean f3462o = true;

    /* JADX INFO: renamed from: p */
    public boolean f3463p = true;

    /* JADX INFO: renamed from: r */
    public final C9151j f3465r = C8573r0.m16758t();

    /* JADX INFO: renamed from: s */
    public final C9151j f3466s = C8573r0.m16758t();

    /* JADX INFO: renamed from: t */
    public final InterfaceC9070c f3467t = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC9142e0>() { // from class: androidx.compose.ui.graphics.vector.PathComponent$pathMeasure$2
        @Override // cm.InterfaceC2041a
        /* JADX INFO: renamed from: E */
        public final InterfaceC9142e0 mo807E() {
            return new C9153k(new PathMeasure());
        }
    });

    /* JADX INFO: renamed from: u */
    public final C10004e f3468u = new C10004e();

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 ??, still in use, count: 1, list:
          (r1v1 ?? I:v0.h) from 0x0067: IPUT (r1v1 ?? I:v0.h), (r14v0 'this' ?? I:androidx.compose.ui.graphics.vector.PathComponent A[IMMUTABLE_TYPE, THIS]) androidx.compose.ui.graphics.vector.PathComponent.q v0.h
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @Override // p469x0.AbstractC10005f
    /* JADX INFO: renamed from: a */
    public final void mo2002a(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 ??, still in use, count: 1, list:
          (r1v1 ?? I:v0.h) from 0x0067: IPUT (r1v1 ?? I:v0.h), (r14v0 'this' ?? I:androidx.compose.ui.graphics.vector.PathComponent A[IMMUTABLE_TYPE, THIS]) androidx.compose.ui.graphics.vector.PathComponent.q v0.h
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r15v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    /* JADX INFO: renamed from: e */
    public final void m2003e() {
        C9151j c9151j = this.f3466s;
        c9151j.mo17407c();
        boolean z10 = this.f3458k == 0.0f;
        C9151j c9151j2 = this.f3465r;
        if (z10) {
            if (this.f3459l == 1.0f) {
                c9151j.m17470m(c9151j2, C8941c.f46888b);
                return;
            }
        }
        InterfaceC9070c interfaceC9070c = this.f3467t;
        ((InterfaceC9142e0) interfaceC9070c.getValue()).mo17435b(c9151j2);
        float fMo17434a = ((InterfaceC9142e0) interfaceC9070c.getValue()).mo17434a();
        float f3 = this.f3458k;
        float f10 = this.f3460m;
        float f11 = ((f3 + f10) % 1.0f) * fMo17434a;
        float f12 = ((this.f3459l + f10) % 1.0f) * fMo17434a;
        if (f11 <= f12) {
            ((InterfaceC9142e0) interfaceC9070c.getValue()).mo17436c(f11, f12, c9151j);
        } else {
            ((InterfaceC9142e0) interfaceC9070c.getValue()).mo17436c(f11, fMo17434a, c9151j);
            ((InterfaceC9142e0) interfaceC9070c.getValue()).mo17436c(0.0f, f12, c9151j);
        }
    }

    public final String toString() {
        return this.f3465r.toString();
    }
}
