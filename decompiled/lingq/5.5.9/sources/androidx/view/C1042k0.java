package androidx.view;

import android.app.Application;
import dm.C5207g;
import java.lang.reflect.InvocationTargetException;
import p427v3.AbstractC9634a;
import p427v3.C9636c;

/* JADX INFO: renamed from: androidx.lifecycle.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1042k0 {

    /* JADX INFO: renamed from: a */
    public final C1046m0 f6666a;

    /* JADX INFO: renamed from: b */
    public final b f6667b;

    /* JADX INFO: renamed from: c */
    public final AbstractC9634a f6668c;

    /* JADX INFO: renamed from: androidx.lifecycle.k0$a */
    public static class a extends c {

        /* JADX INFO: renamed from: c */
        public static a f6669c;

        /* JADX INFO: renamed from: b */
        public final Application f6670b;

        public a(Application application) {
            this.f6670b = application;
        }

        @Override // androidx.view.C1042k0.b
        /* JADX INFO: renamed from: a */
        public final AbstractC1036h0 mo3915a(Class cls, C9636c c9636c) {
            if (this.f6670b != null) {
                return mo3730b(cls);
            }
            Application application = (Application) c9636c.f49329a.get(C1040j0.f6663a);
            if (application != null) {
                return m3949c(application, cls);
            }
            if (C1021b.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return super.mo3730b(cls);
        }

        @Override // androidx.view.C1042k0.c, androidx.view.C1042k0.b
        /* JADX INFO: renamed from: b */
        public final <T extends AbstractC1036h0> T mo3730b(Class<T> cls) {
            Application application = this.f6670b;
            if (application != null) {
                return (T) m3949c(application, cls);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        /* JADX INFO: renamed from: c */
        public final AbstractC1036h0 m3949c(Application application, Class cls) {
            if (!C1021b.class.isAssignableFrom(cls)) {
                return super.mo3730b(cls);
            }
            try {
                AbstractC1036h0 abstractC1036h0 = (AbstractC1036h0) cls.getConstructor(Application.class).newInstance(application);
                C5207g.m11110e(abstractC1036h0, "{\n                try {\n…          }\n            }");
                return abstractC1036h0;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Cannot create an instance of " + cls, e13);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.k0$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        default AbstractC1036h0 mo3915a(Class cls, C9636c c9636c) {
            return mo3730b(cls);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: b */
        default <T extends AbstractC1036h0> T mo3730b(Class<T> cls) {
            throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.k0$c */
    public static class c implements b {

        /* JADX INFO: renamed from: a */
        public static c f6671a;

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        @Override // androidx.view.C1042k0.b
        /* JADX INFO: renamed from: b */
        public <T extends AbstractC1036h0> T mo3730b(Class<T> cls) throws InvocationTargetException {
            try {
                T tNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                C5207g.m11110e(tNewInstance, "{\n                modelC…wInstance()\n            }");
                return tNewInstance;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.k0$d */
    public static class d {
        /* JADX INFO: renamed from: c */
        public void mo3916c(AbstractC1036h0 abstractC1036h0) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1042k0(C1046m0 c1046m0, b bVar) {
        this(c1046m0, bVar, 0);
        C5207g.m11111f(c1046m0, "store");
        C5207g.m11111f(bVar, "factory");
    }

    public /* synthetic */ C1042k0(C1046m0 c1046m0, b bVar, int i10) {
        this(c1046m0, bVar, AbstractC9634a.a.f49330b);
    }

    public C1042k0(C1046m0 c1046m0, b bVar, AbstractC9634a abstractC9634a) {
        C5207g.m11111f(c1046m0, "store");
        C5207g.m11111f(bVar, "factory");
        C5207g.m11111f(abstractC9634a, "defaultCreationExtras");
        this.f6666a = c1046m0;
        this.f6667b = bVar;
        this.f6668c = abstractC9634a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1042k0(InterfaceC1048n0 interfaceC1048n0, b bVar) {
        this(interfaceC1048n0.mo796n(), bVar, interfaceC1048n0 instanceof InterfaceC1037i ? ((InterfaceC1037i) interfaceC1048n0).mo792j() : AbstractC9634a.a.f49330b);
        C5207g.m11111f(interfaceC1048n0, "owner");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final <T extends AbstractC1036h0> T m3947a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) m3948b(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
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
    /* JADX INFO: renamed from: b */
    public final AbstractC1036h0 m3948b(Class cls, String str) {
        AbstractC1036h0 abstractC1036h0Mo3730b;
        C5207g.m11111f(str, "key");
        C1046m0 c1046m0 = this.f6666a;
        c1046m0.getClass();
        AbstractC1036h0 abstractC1036h0 = (AbstractC1036h0) c1046m0.f6677a.get(str);
        boolean zIsInstance = cls.isInstance(abstractC1036h0);
        b bVar = this.f6667b;
        if (zIsInstance) {
            d dVar = bVar instanceof d ? (d) bVar : null;
            if (dVar != null) {
                C5207g.m11108c(abstractC1036h0);
                dVar.mo3916c(abstractC1036h0);
            }
            C5207g.m11109d(abstractC1036h0, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return abstractC1036h0;
        }
        C9636c c9636c = new C9636c(this.f6668c);
        c9636c.f49329a.put(C1044l0.f6676a, str);
        try {
            abstractC1036h0Mo3730b = bVar.mo3915a(cls, c9636c);
        } catch (AbstractMethodError unused) {
            abstractC1036h0Mo3730b = bVar.mo3730b(cls);
        }
        C5207g.m11111f(abstractC1036h0Mo3730b, "viewModel");
        AbstractC1036h0 abstractC1036h1 = (AbstractC1036h0) c1046m0.f6677a.put(str, abstractC1036h0Mo3730b);
        if (abstractC1036h1 != null) {
            abstractC1036h1.mo3725j2();
        }
        return abstractC1036h0Mo3730b;
    }
}
