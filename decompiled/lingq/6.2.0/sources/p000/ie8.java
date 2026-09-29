package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ie8 {

    /* JADX INFO: renamed from: a */
    public final int f44025a;

    /* JADX INFO: renamed from: b */
    public final int f44026b;

    public ie8(int i, int i2) {
        this.f44025a = i;
        this.f44026b = i2;
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
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ie8)) {
            return false;
        }
        ie8 ie8Var = (ie8) obj;
        if (this.f44025a != ie8Var.f44025a) {
            return false;
        }
        oa8 oa8Var = oa8.f54103a;
        if (!oa8Var.equals(oa8Var) || this.f44026b != ie8Var.f44026b) {
            return false;
        }
        pa8 pa8Var = pa8.f55894a;
        return pa8Var.equals(pa8Var);
    }

    public final int hashCode() {
        return ((Integer.hashCode(this.f44026b) + (((Integer.hashCode(this.f44025a) * 31) - 1941903292) * 31)) * 31) + 221416922;
    }

    public final String toString() {
        return "ReviewSessionActionState(primaryTextRes=" + this.f44025a + ", primaryAction=" + oa8.f54103a + ", secondaryTextRes=" + this.f44026b + ", secondaryAction=" + pa8.f55894a + ")";
    }
}
