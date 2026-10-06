package p000;

import android.os.SystemClock;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bte implements bsb, bsa {

    /* JADX INFO: renamed from: a */
    public final bsc f4420a;

    /* JADX INFO: renamed from: b */
    public final bsa f4421b;

    /* JADX INFO: renamed from: c */
    public volatile Object f4422c;

    /* JADX INFO: renamed from: d */
    public volatile brz f4423d;

    /* JADX INFO: renamed from: e */
    private volatile int f4424e;

    /* JADX INFO: renamed from: f */
    private volatile bry f4425f;

    /* JADX INFO: renamed from: g */
    private volatile C1058va f4426g;

    public bte(bsc bscVar, bsa bsaVar) {
        this.f4420a = bscVar;
        this.f4421b = bsaVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bra, java.lang.Object] */
    @Override // p000.bsb
    /* JADX INFO: renamed from: a */
    public final void mo2966a() {
        C1058va c1058va = this.f4426g;
        if (c1058va != null) {
            c1058va.f47802a.mo2937aY();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bra, java.lang.Object] */
    @Override // p000.bsa
    /* JADX INFO: renamed from: b */
    public final void mo2968b(bqn bqnVar, Exception exc, bra braVar, int i) {
        this.f4421b.mo2968b(bqnVar, exc, braVar, this.f4426g.f47802a.mo2942g());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [bra, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [bra, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [bra, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [bra, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [bra, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [bra, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [bqn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [bqn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [bra, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [bqn, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.bsb
    /* JADX INFO: renamed from: c */
    public final boolean mo2967c() throws Throwable {
        boolean z;
        boolean z2 = false;
        if (this.f4422c != null) {
            Object obj = this.f4422c;
            this.f4422c = null;
            try {
                SystemClock.elapsedRealtimeNanos();
                try {
                    brc brcVarM2833a = this.f4420a.f4278c.m2831a().m2833a(obj);
                    Object objMo2949a = brcVarM2833a.mo2949a();
                    bqf bqfVarM2617k = this.f4420a.f4278c.m2831a().f4058d.m2617k(objMo2949a.getClass());
                    if (bqfVarM2617k == null) {
                        throw new bpj(objMo2949a.getClass());
                    }
                    C1058va c1058va = new C1058va(bqfVarM2617k, objMo2949a, this.f4420a.f4283h);
                    ?? r5 = this.f4426g.f47803b;
                    bsc bscVar = this.f4420a;
                    brz brzVar = new brz(r5, bscVar.f4288m);
                    btx btxVarM2973d = bscVar.m2973d();
                    btxVarM2973d.mo3069b(brzVar, c1058va);
                    if (btxVarM2973d.mo3068a(brzVar) == null) {
                        try {
                            this.f4421b.mo2969d(this.f4426g.f47803b, brcVarM2833a.mo2949a(), this.f4426g.f47802a, this.f4426g.f47802a.mo2942g(), this.f4426g.f47803b);
                            return true;
                        } catch (Throwable th) {
                            th = th;
                            z = true;
                            if (!z) {
                                this.f4426g.f47802a.mo2939d();
                            }
                            throw th;
                        }
                    }
                    this.f4423d = brzVar;
                    this.f4425f = new bry(Collections.singletonList(this.f4426g.f47803b), this.f4420a, this);
                    this.f4426g.f47802a.mo2939d();
                } catch (Throwable th2) {
                    th = th2;
                    z = false;
                }
            } catch (IOException e) {
            }
        }
        if (this.f4425f != null && this.f4425f.mo2967c()) {
            return true;
        }
        this.f4425f = null;
        this.f4426g = null;
        while (!z2 && this.f4424e < this.f4420a.m2975f().size()) {
            List listM2975f = this.f4420a.m2975f();
            int i = this.f4424e;
            this.f4424e = i + 1;
            this.f4426g = (C1058va) listM2975f.get(i);
            if (this.f4426g != null && (this.f4420a.f4290o.mo2996c(this.f4426g.f47802a.mo2942g()) || this.f4420a.m2977h(this.f4426g.f47802a.mo2934a()))) {
                this.f4426g.f47802a.mo2941f(this.f4420a.f4289n, new btd(this, this.f4426g, null, null, null));
                z2 = true;
            }
        }
        return z2;
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [bra, java.lang.Object] */
    @Override // p000.bsa
    /* JADX INFO: renamed from: d */
    public final void mo2969d(bqn bqnVar, Object obj, bra braVar, int i, bqn bqnVar2) {
        this.f4421b.mo2969d(bqnVar, obj, braVar, this.f4426g.f47802a.mo2942g(), bqnVar);
    }

    /* JADX INFO: renamed from: e */
    final boolean m3030e(C1058va c1058va) {
        C1058va c1058va2 = this.f4426g;
        return c1058va2 != null && c1058va2 == c1058va;
    }
}
