package androidx.activity;

import androidx.activity.result.AbstractC0207f;
import androidx.activity.result.InterfaceC0202a;
import p035c.AbstractC1641a;

/* JADX INFO: renamed from: androidx.activity.f */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0187f implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f481a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC1641a.a f482b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ComponentActivity.C0174b f483c;

    public RunnableC0187f(ComponentActivity.C0174b c0174b, int i10, AbstractC1641a.a aVar) {
        this.f483c = c0174b;
        this.f481a = i10;
        this.f482b = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0202a<O> interfaceC0202a;
        T t10 = this.f482b.f9201a;
        ComponentActivity.C0174b c0174b = this.f483c;
        String str = (String) c0174b.f522b.get(Integer.valueOf(this.f481a));
        if (str == null) {
            return;
        }
        AbstractC0207f.a aVar = (AbstractC0207f.a) c0174b.f526f.get(str);
        if (aVar != null && (interfaceC0202a = aVar.f529a) != 0) {
            if (c0174b.f525e.remove(str)) {
                interfaceC0202a.mo843a(t10);
                return;
            }
            return;
        }
        c0174b.f528h.remove(str);
        c0174b.f527g.put(str, t10);
    }
}
