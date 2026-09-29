package p000;

import com.lingq.core.domain.model.review.ReviewType;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
public final class ev3 extends fv3 {

    /* JADX INFO: renamed from: a */
    public final String f37933a;

    /* JADX INFO: renamed from: b */
    public final String f37934b;

    /* JADX INFO: renamed from: c */
    public final ReviewType f37935c;

    public ev3(String str, ReviewType reviewType) {
        reviewType.getClass();
        this.f37933a = "";
        this.f37934b = str;
        this.f37935c = reviewType;
    }

    /* JADX INFO: renamed from: a */
    public final String m11362a() {
        return this.f37934b;
    }

    /* JADX INFO: renamed from: b */
    public final String m11363b() {
        return this.f37933a;
    }

    /* JADX INFO: renamed from: c */
    public final ReviewType m11364c() {
        return this.f37935c;
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
        if (!(obj instanceof ev3)) {
            return false;
        }
        ev3 ev3Var = (ev3) obj;
        if (!this.f37933a.equals(ev3Var.f37933a)) {
            return false;
        }
        EmptyList emptyList = EmptyList.f47638a;
        return emptyList.equals(emptyList) && fa4.m11650l(this.f37934b, ev3Var.f37934b) && this.f37935c == ev3Var.f37935c;
    }

    public final int hashCode() {
        int iHashCode = (((this.f37933a.hashCode() + g9a.m12428e(Boolean.hashCode(true) * 31, 31, true)) * 31) + 1) * 31;
        String str = this.f37934b;
        return this.f37935c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "NavigateToReview(isFromVocabulary=true, isDailyLingQs=true, reviewLanguageFromDeeplink=" + this.f37933a + ", terms=" + EmptyList.f47638a + ", lotd=" + this.f37934b + ", reviewType=" + this.f37935c + ")";
    }
}
