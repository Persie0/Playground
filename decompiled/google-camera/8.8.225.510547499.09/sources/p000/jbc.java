package p000;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jbc extends jdz {

    /* JADX INFO: renamed from: b */
    public static final jhz f33645b = new jhz(1);

    /* JADX INFO: renamed from: a */
    static int f33644a = 1;

    public jbc(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, jbb.f33642a, googleSignInOptions, new jeu(), (byte[]) null, (byte[]) null, (byte[]) null);
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
    /* JADX INFO: renamed from: a */
    public final jpp m12828a() {
        jeg jegVar;
        jec jecVar = this.f33826i;
        Context context = this.f33820c;
        int iM12829b = m12829b();
        jbo.f33666a.m15892e("Signing out");
        jbo.m12842a(context);
        if (iM12829b == 3) {
            Status status = Status.f7601a;
            jge jgeVar = new jge(jecVar);
            jgeVar.m4649i(status);
            jegVar = jgeVar;
        } else {
            jbk jbkVar = new jbk(jecVar);
            jecVar.mo12968c(jbkVar);
            jegVar = jbkVar;
        }
        return jib.m13208m(jegVar);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized int m12829b() {
        int i;
        i = f33644a;
        if (i == 1) {
            Context context = this.f33820c;
            jcy jcyVar = jcy.f33766a;
            int iM12902f = jcyVar.m12902f(context, 12451000);
            if (iM12902f == 0) {
                i = 4;
                f33644a = 4;
            } else if (jcyVar.m12903g(context, iM12902f, null) != null || jjn.m13310a(context, "com.google.android.gms.auth.api.fallback") == 0) {
                i = 2;
                f33644a = 2;
            } else {
                i = 3;
                f33644a = 3;
            }
        }
        return i;
    }
}
