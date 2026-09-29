package p000;

/* JADX INFO: loaded from: classes.dex */
public final class km9 extends i16 {

    /* JADX INFO: renamed from: b */
    public final ck2 f47516b;

    public km9(ck2 ck2Var) {
        this.f47516b = ck2Var;
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
        if (!(obj instanceof km9)) {
            return false;
        }
        km9 km9Var = (km9) obj;
        C3724wj c3724wj = ss5.f61357e;
        return c3724wj.equals(c3724wj) && fa4.m11650l(this.f47516b, km9Var.f47516b);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        return new lm9(ss5.f61357e, this.f47516b);
    }

    public final int hashCode() {
        int iM12428e = g9a.m12428e(1022 * 31, 31, false);
        ck2 ck2Var = this.f47516b;
        return iM12428e + (ck2Var != null ? ck2Var.hashCode() : 0);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "stylusHoverIcon";
        z91 z91Var = y64Var.f69367c;
        z91Var.m25511b(ss5.f61357e, "icon");
        z91Var.m25511b(Boolean.FALSE, "overrideDescendants");
        z91Var.m25511b(this.f47516b, "touchBoundsExpansion");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        lm9 lm9Var = (lm9) d16Var;
        C3724wj c3724wj = ss5.f61357e;
        if (!fa4.m11650l(lm9Var.f4125K, c3724wj)) {
            lm9Var.f4125K = c3724wj;
            if (lm9Var.f4126L) {
                lm9Var.m1459b1();
            }
        }
        lm9Var.f4124J = this.f47516b;
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + ss5.f61357e + ", overrideDescendants=false, touchBoundsExpansion=" + this.f47516b + ')';
    }
}
