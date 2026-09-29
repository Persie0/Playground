package p000;

import android.view.animation.AnimationUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class y9a extends laa {

    /* JADX INFO: renamed from: b */
    public boolean f69517b;

    /* JADX INFO: renamed from: c */
    public boolean f69518c;

    /* JADX INFO: renamed from: d */
    public yf9 f69519d;

    /* JADX INFO: renamed from: f */
    public RunnableC0806bd f69521f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ raa f69522g;

    /* JADX INFO: renamed from: a */
    public long f69516a = -1;

    /* JADX INFO: renamed from: e */
    public final C3299li f69520e = new C3299li();

    public y9a(raa raaVar) {
        this.f69522g = raaVar;
    }

    @Override // p000.laa, p000.caa
    /* JADX INFO: renamed from: g */
    public final void mo4480g(daa daaVar) {
        this.f69518c = true;
    }

    /* JADX INFO: renamed from: h */
    public final void m24996h() {
        if (this.f69519d != null) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        float f = this.f69516a;
        C3299li c3299li = this.f69520e;
        c3299li.m16223a(f, jCurrentAnimationTimeMillis);
        this.f69519d = new yf9(new o73());
        zf9 zf9Var = new zf9();
        zf9Var.m25593a(1.0f);
        zf9Var.m25594b(200.0f);
        yf9 yf9Var = this.f69519d;
        yf9Var.f69795m = zf9Var;
        yf9Var.f69784b = this.f69516a;
        yf9Var.f69785c = true;
        ArrayList arrayList = yf9Var.f69794l;
        if (yf9Var.f69788f) {
            C3386nv.m17636w("Error: Update listeners must be added beforethe animation.");
            return;
        }
        if (!arrayList.contains(this)) {
            arrayList.add(this);
        }
        this.f69519d.f69783a = c3299li.m16224b();
        yf9 yf9Var2 = this.f69519d;
        yf9Var2.f69789g = this.f69522g.f35326X + 1;
        yf9Var2.f69790h = -1.0f;
        yf9Var2.m25118c(4.0f);
        yf9 yf9Var3 = this.f69519d;
        un2 un2Var = new un2() { // from class: x9a
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
            @Override // p000.un2
            /* JADX INFO: renamed from: a */
            public final void mo22582a(float f2) {
                y9a y9aVar = this.f67982a;
                raa raaVar = y9aVar.f69522g;
                uk9 uk9Var = uk9.f64028c;
                if (f2 >= 1.0f) {
                    raaVar.m10186F(raaVar, uk9Var, false);
                    return;
                }
                long j = raaVar.f35326X;
                daa daaVarM20495X = raaVar.m20495X(0);
                daa daaVar = daaVarM20495X.f35321S;
                daaVarM20495X.f35321S = null;
                raaVar.mo10193N(-1L, y9aVar.f69516a);
                raaVar.mo10193N(j, -1L);
                y9aVar.f69516a = j;
                RunnableC0806bd runnableC0806bd = y9aVar.f69521f;
                if (runnableC0806bd != null) {
                    runnableC0806bd.run();
                }
                raaVar.f35323U.clear();
                if (daaVar != null) {
                    daaVar.m10186F(daaVar, uk9Var, true);
                }
            }
        };
        ArrayList arrayList2 = yf9Var3.f69793k;
        if (arrayList2.contains(un2Var)) {
            return;
        }
        arrayList2.add(un2Var);
    }
}
