package p000;

import androidx.compose.runtime.snapshots.C0285a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kl3 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f47486a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f47487b;

    public /* synthetic */ kl3(vi3 vi3Var, int i) {
        this.f47486a = i;
        this.f47487b = vi3Var;
    }

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
    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f47486a;
        vi3 vi3Var = this.f47487b;
        switch (i) {
            case 0:
                pba pbaVar = (pba) obj;
                if (!(pbaVar instanceof jl3)) {
                    C3386nv.m17633t("Node is not a GestureNode instance");
                    return null;
                }
                il3 il3Var = ((jl3) pbaVar).f45668J;
                il3 il3Var2 = il3Var != null ? il3Var : null;
                return Boolean.valueOf(il3Var2 != null ? ((Boolean) vi3Var.invoke(il3Var2)).booleanValue() : true);
            case 1:
                y64 y64Var = (y64) obj;
                y64Var.f69365a = "absoluteOffset";
                y64Var.f69367c.m25511b(vi3Var, "offset");
                return xfa.f68157a;
            case 2:
                y64 y64Var2 = (y64) obj;
                y64Var2.f69365a = "offset";
                y64Var2.f69367c.m25511b(vi3Var, "offset");
                return xfa.f68157a;
            case 3:
                String str = (String) obj;
                str.getClass();
                vi3Var.invoke(new ug6(str));
                return xfa.f68157a;
            case 4:
                String str2 = (String) obj;
                str2.getClass();
                vi3Var.invoke(new bv6(str2));
                return xfa.f68157a;
            case 5:
                String str3 = (String) obj;
                str3.getClass();
                vi3Var.invoke(new yu6(str3));
                return xfa.f68157a;
            case 6:
                String str4 = (String) obj;
                str4.getClass();
                vi3Var.invoke(new hv6(str4));
                return xfa.f68157a;
            case 7:
                String str5 = (String) obj;
                str5.getClass();
                vi3Var.invoke(new dv6(str5));
                return xfa.f68157a;
            case 8:
                jc9 jc9Var = (jc9) vi3Var.invoke((C0285a) obj);
                synchronized (nc9.f52602c) {
                    nc9.f52603d = nc9.f52603d.m1317i(jc9Var.mo3582g());
                }
                return jc9Var;
            case 9:
                Long l = (Long) obj;
                l.getClass();
                return vi3Var.invoke(l);
            default:
                aq4 aq4Var = (aq4) obj;
                aq4Var.getClass();
                e28 e28VarMo1670Q = bq1.m4054e0(aq4Var).mo1670Q(aq4Var, true);
                if (e28VarMo1670Q.f36622c - e28VarMo1670Q.f36620a > 0.0f && e28VarMo1670Q.f36623d - e28VarMo1670Q.f36621b > 0.0f) {
                    vi3Var.invoke(e28VarMo1670Q);
                }
                return xfa.f68157a;
        }
    }
}
