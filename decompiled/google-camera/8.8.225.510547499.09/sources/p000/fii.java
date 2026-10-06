package p000;

import android.support.wearable.complications.rendering.p002EM.voNZjxiJou;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fii implements lfi {

    /* JADX INFO: renamed from: a */
    public final kyt f22114a;

    /* JADX INFO: renamed from: c */
    private final AtomicBoolean f22116c = new AtomicBoolean();

    /* JADX INFO: renamed from: b */
    public final nqf f22115b = nqf.m17621g();

    public fii(kyt kytVar) {
        this.f22114a = kytVar;
    }

    @Override // p000.lfi
    /* JADX INFO: renamed from: a */
    public final nps mo8460a() {
        return this.f22115b;
    }

    @Override // p000.lfi
    /* JADX INFO: renamed from: b */
    public final void mo8461b() {
        if (!this.f22116c.get()) {
            throw new IllegalStateException(voNZjxiJou.cUoHlsHSthWCWwR);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, nps] */
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
    @Override // p000.lfi
    /* JADX INFO: renamed from: c */
    public final lfk mo8462c(lhz lhzVar) {
        if (this.f22116c.getAndSet(true)) {
            throw new IllegalStateException("Added more than one track");
        }
        this.f22114a.mo8408a(lhzVar.f38277a);
        return new fih(this);
    }
}
