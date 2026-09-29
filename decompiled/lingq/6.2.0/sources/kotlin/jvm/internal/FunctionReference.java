package kotlin.jvm.internal;

import p000.fa4;
import p000.ij3;
import p000.sg4;
import p000.ux5;
import p000.wq1;
import p000.xi3;
import p000.y38;

/* JADX INFO: loaded from: classes.dex */
public abstract class FunctionReference extends CallableReference implements ij3, sg4, xi3 {

    /* JADX INFO: renamed from: h */
    public final int f47710h;

    public FunctionReference(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.f47710h = i;
    }

    @Override // kotlin.jvm.internal.CallableReference
    /* JADX INFO: renamed from: d */
    public final sg4 mo15405d() {
        y38.f69246a.getClass();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    public final boolean equals(Object obj) {
        ?? r2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionReference) {
            FunctionReference functionReference = (FunctionReference) obj;
            return this.f47706d.equals(functionReference.f47706d) && this.f47707e.equals(functionReference.f47707e) && fa4.m11650l(this.f47704b, functionReference.f47704b) && fa4.m11650l(m15406g(), functionReference.m15406g());
        }
        if (!(obj instanceof FunctionReference)) {
            return false;
        }
        sg4 sg4Var = this.f47703a;
        if (sg4Var == null) {
            mo15405d();
            this.f47703a = this;
            this = this;
        } else {
            r2 = sg4Var;
        }
        return obj.equals(r2);
    }

    @Override // p000.ij3
    public final int getArity() {
        return this.f47710h;
    }

    public final int hashCode() {
        return this.f47707e.hashCode() + ux5.m22980c(m15406g() == null ? 0 : m15406g().hashCode() * 31, this.f47706d, 31);
    }

    public final String toString() {
        sg4 sg4Var = this.f47703a;
        if (sg4Var == null) {
            mo15405d();
            this.f47703a = this;
            sg4Var = this;
        }
        if (sg4Var != this) {
            return sg4Var.toString();
        }
        String str = this.f47706d;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : wq1.m24118n("function ", str, " (Kotlin reflection is not available)");
    }
}
