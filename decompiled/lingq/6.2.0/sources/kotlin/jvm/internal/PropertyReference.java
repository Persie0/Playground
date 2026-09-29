package kotlin.jvm.internal;

import kotlin.jvm.KotlinReflectionNotSupportedError;
import p000.AbstractC3393o1;
import p000.C3386nv;
import p000.bh4;
import p000.fa4;
import p000.sg4;
import p000.ux5;

/* JADX INFO: loaded from: classes.dex */
public abstract class PropertyReference extends CallableReference implements bh4 {

    /* JADX INFO: renamed from: h */
    public final boolean f47712h;

    public PropertyReference(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.f47712h = (i & 2) == 2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PropertyReference) {
            PropertyReference propertyReference = (PropertyReference) obj;
            return m15406g().equals(propertyReference.m15406g()) && this.f47706d.equals(propertyReference.f47706d) && this.f47707e.equals(propertyReference.f47707e) && fa4.m11650l(this.f47704b, propertyReference.f47704b);
        }
        if (obj instanceof bh4) {
            return obj.equals(m15409j());
        }
        return false;
    }

    public final int hashCode() {
        return this.f47707e.hashCode() + ux5.m22980c(m15406g().hashCode() * 31, this.f47706d, 31);
    }

    /* JADX INFO: renamed from: j */
    public final sg4 m15409j() {
        if (this.f47712h) {
            return this;
        }
        sg4 sg4Var = this.f47703a;
        if (sg4Var != null) {
            return sg4Var;
        }
        sg4 sg4VarMo15405d = mo15405d();
        this.f47703a = sg4VarMo15405d;
        return sg4VarMo15405d;
    }

    /* JADX INFO: renamed from: k */
    public final bh4 m15410k() {
        if (this.f47712h) {
            C3386nv.m17636w("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
            return null;
        }
        sg4 sg4VarM15409j = m15409j();
        if (sg4VarM15409j != this) {
            return (bh4) sg4VarM15409j;
        }
        throw new KotlinReflectionNotSupportedError();
    }

    public final String toString() {
        sg4 sg4VarM15409j = m15409j();
        return sg4VarM15409j != this ? sg4VarM15409j.toString() : AbstractC3393o1.m17738m(new StringBuilder("property "), this.f47706d, " (Kotlin reflection is not available)");
    }
}
