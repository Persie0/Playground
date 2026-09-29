package p000;

import com.lingq.feature.search.filter.model.ViewKeys;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
public final class v19 extends g29 {

    /* JADX INFO: renamed from: a */
    public final List f64706a;

    /* JADX INFO: renamed from: b */
    public final float f64707b;

    /* JADX INFO: renamed from: c */
    public final float f64708c;

    /* JADX INFO: renamed from: d */
    public final ViewKeys f64709d;

    /* JADX INFO: renamed from: e */
    public final float f64710e;

    public v19(List list, float f, float f2, ViewKeys viewKeys, float f3) {
        viewKeys.getClass();
        this.f64706a = list;
        this.f64707b = f;
        this.f64708c = f2;
        this.f64709d = viewKeys;
        this.f64710e = f3;
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
        if (!(obj instanceof v19)) {
            return false;
        }
        v19 v19Var = (v19) obj;
        EmptyList emptyList = EmptyList.f47638a;
        return emptyList.equals(emptyList) && this.f64706a.equals(v19Var.f64706a) && Float.compare(this.f64707b, v19Var.f64707b) == 0 && Float.compare(this.f64708c, v19Var.f64708c) == 0 && this.f64709d == v19Var.f64709d && Float.compare(this.f64710e, v19Var.f64710e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f64710e) + g9a.m12428e((this.f64709d.hashCode() + wq1.m24105a(wq1.m24105a(ux5.m22979b(31, 31, this.f64706a), this.f64707b, 31), this.f64708c, 31)) * 31, 31, true);
    }

    public final String toString() {
        return "Range(rangeValues=" + EmptyList.f47638a + ", labels=" + this.f64706a + ", min=" + this.f64707b + ", max=" + this.f64708c + ", key=" + this.f64709d + ", detectDragFinished=true, maxValue=" + this.f64710e + ")";
    }
}
