package p000;

import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes2.dex */
public final class e05 implements w65 {

    /* JADX INFO: renamed from: a */
    public final String f36528a;

    /* JADX INFO: renamed from: b */
    public final List f36529b;

    /* JADX INFO: renamed from: c */
    public final String f36530c;

    /* JADX INFO: renamed from: d */
    public final String f36531d;

    /* JADX INFO: renamed from: e */
    public final String f36532e;

    /* JADX INFO: renamed from: f */
    public final List f36533f;

    public e05(String str, List list, List list2, List list3, String str2, String str3, String str4, List list4) {
        str.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        str3.getClass();
        str4.getClass();
        this.f36528a = str;
        this.f36529b = list;
        this.f36530c = str2;
        this.f36531d = str3;
        this.f36532e = str4;
        this.f36533f = list4;
    }

    @Override // p000.w65
    /* JADX INFO: renamed from: a */
    public final List mo8034a() {
        return this.f36529b;
    }

    @Override // p000.w65
    /* JADX INFO: renamed from: b */
    public final String mo8035b() {
        return this.f36530c;
    }

    @Override // p000.w65
    /* JADX INFO: renamed from: c */
    public final List mo8036c() {
        return EmptyList.f47638a;
    }

    @Override // p000.w65
    /* JADX INFO: renamed from: d */
    public final String mo8037d() {
        return this.f36528a;
    }

    @Override // p000.w65
    /* JADX INFO: renamed from: e */
    public final int mo8038e() {
        return 0;
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
        if (!(obj instanceof e05)) {
            return false;
        }
        e05 e05Var = (e05) obj;
        if (!fa4.m11650l(this.f36528a, e05Var.f36528a) || !fa4.m11650l(this.f36529b, e05Var.f36529b)) {
            return false;
        }
        EmptyList emptyList = EmptyList.f47638a;
        return emptyList.equals(emptyList) && emptyList.equals(emptyList) && this.f36530c.equals(e05Var.f36530c) && fa4.m11650l(this.f36531d, e05Var.f36531d) && fa4.m11650l(this.f36532e, e05Var.f36532e) && this.f36533f.equals(e05Var.f36533f);
    }

    @Override // p000.w65
    /* JADX INFO: renamed from: f */
    public final List mo8039f() {
        return EmptyList.f47638a;
    }

    public final int hashCode() {
        return this.f36533f.hashCode() + ux5.m22980c(ux5.m22980c(ux5.m22980c(wq1.m24106b(0, g9a.m12428e((((((this.f36529b.hashCode() + (this.f36528a.hashCode() * 31)) * 31) + 1) * 31) + 1) * 31, 31, true), 31), this.f36530c, 31), this.f36531d, 31), this.f36532e, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LessonCreatedPhrase(term=");
        sb.append(this.f36528a);
        sb.append(", meanings=");
        sb.append(this.f36529b);
        sb.append(", tags=");
        EmptyList emptyList = EmptyList.f47638a;
        sb.append(emptyList);
        sb.append(", gTags=");
        sb.append(emptyList);
        sb.append(", isPhrase=true, importance=0, termWithLanguage=");
        AbstractC3393o1.m17725C(sb, this.f36530c, ", fragment=", this.f36531d, ", status=");
        sb.append(this.f36532e);
        sb.append(", words=");
        sb.append(this.f36533f);
        sb.append(")");
        return sb.toString();
    }
}
