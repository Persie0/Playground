package p000;

import java.io.DataInput;
import java.util.Arrays;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.p022tz.AbstractC3433a;

/* JADX INFO: loaded from: classes.dex */
public final class v22 {

    /* JADX INFO: renamed from: a */
    public final u22 f64720a;

    /* JADX INFO: renamed from: b */
    public final String f64721b;

    /* JADX INFO: renamed from: c */
    public final int f64722c;

    public v22(u22 u22Var, String str, int i) {
        this.f64720a = u22Var;
        this.f64721b = str;
        this.f64722c = i;
    }

    /* JADX INFO: renamed from: c */
    public static v22 m23050c(DataInput dataInput) {
        return new v22(new u22((char) dataInput.readUnsignedByte(), dataInput.readUnsignedByte(), dataInput.readByte(), dataInput.readUnsignedByte(), dataInput.readBoolean(), (int) AbstractC3433a.m18457b(dataInput)), dataInput.readUTF(), (int) AbstractC3433a.m18457b(dataInput));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    public final long m23051a(long j, int i, int i2) {
        u22 u22Var = this.f64720a;
        int i3 = u22Var.f63269f;
        int i4 = u22Var.f63265b;
        char c = u22Var.f63264a;
        if (c == 'w') {
            i += i2;
        } else if (c != 's') {
            i = 0;
        }
        long j2 = i;
        long j3 = j + j2;
        ISOChronology iSOChronology = ISOChronology.f54908e0;
        long jM22393b = u22Var.m22393b(iSOChronology.f54850I.mo11031a(Math.min(i3, 86399999), iSOChronology.f54850I.mo3733B(0, iSOChronology.f54866Y.mo3733B(i4, j3))), iSOChronology);
        if (u22Var.f63267d != 0) {
            jM22393b = u22Var.m22395d(jM22393b, iSOChronology);
            if (jM22393b <= j3) {
                jM22393b = u22Var.m22395d(u22Var.m22393b(iSOChronology.f54866Y.mo3733B(i4, iSOChronology.f54867Z.mo11031a(1, jM22393b)), iSOChronology), iSOChronology);
            }
        } else if (jM22393b <= j3) {
            jM22393b = u22Var.m22393b(iSOChronology.f54867Z.mo11031a(1, jM22393b), iSOChronology);
        }
        return iSOChronology.f54850I.mo11031a(i3, iSOChronology.f54850I.mo3733B(0, jM22393b)) - j2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: b */
    public final long m23052b(long j, int i, int i2) {
        u22 u22Var = this.f64720a;
        int i3 = u22Var.f63269f;
        int i4 = u22Var.f63265b;
        char c = u22Var.f63264a;
        if (c == 'w') {
            i += i2;
        } else if (c != 's') {
            i = 0;
        }
        long j2 = i;
        long j3 = j + j2;
        ISOChronology iSOChronology = ISOChronology.f54908e0;
        long jM22394c = u22Var.m22394c(iSOChronology.f54850I.mo11031a(i3, iSOChronology.f54850I.mo3733B(0, iSOChronology.f54866Y.mo3733B(i4, j3))), iSOChronology);
        if (u22Var.f63267d != 0) {
            jM22394c = u22Var.m22395d(jM22394c, iSOChronology);
            if (jM22394c >= j3) {
                jM22394c = u22Var.m22395d(u22Var.m22394c(iSOChronology.f54866Y.mo3733B(i4, iSOChronology.f54867Z.mo11031a(-1, jM22394c)), iSOChronology), iSOChronology);
            }
        } else if (jM22394c >= j3) {
            jM22394c = u22Var.m22394c(iSOChronology.f54867Z.mo11031a(-1, jM22394c), iSOChronology);
        }
        return iSOChronology.f54850I.mo11031a(i3, iSOChronology.f54850I.mo3733B(0, jM22394c)) - j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v22)) {
            return false;
        }
        v22 v22Var = (v22) obj;
        return this.f64722c == v22Var.f64722c && this.f64721b.equals(v22Var.f64721b) && this.f64720a.equals(v22Var.f64720a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f64722c), this.f64721b, this.f64720a});
    }

    public final String toString() {
        return this.f64720a + " named " + this.f64721b + " at " + this.f64722c;
    }
}
