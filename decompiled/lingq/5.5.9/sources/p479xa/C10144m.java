package p479xa;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p150h9.RunnableC5914g0;

/* JADX INFO: renamed from: xa.m */
/* JADX INFO: loaded from: classes.dex */
public final class C10144m<T> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC10133c f51384a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC10142k f51385b;

    /* JADX INFO: renamed from: c */
    public final b<T> f51386c;

    /* JADX INFO: renamed from: d */
    public final CopyOnWriteArraySet<c<T>> f51387d;

    /* JADX INFO: renamed from: e */
    public final ArrayDeque<Runnable> f51388e;

    /* JADX INFO: renamed from: f */
    public final ArrayDeque<Runnable> f51389f;

    /* JADX INFO: renamed from: g */
    public final Object f51390g;

    /* JADX INFO: renamed from: h */
    public boolean f51391h;

    /* JADX INFO: renamed from: i */
    public final boolean f51392i;

    /* JADX INFO: renamed from: xa.m$a */
    public interface a<T> {
        /* JADX INFO: renamed from: n */
        void mo780n(T t10);
    }

    /* JADX INFO: renamed from: xa.m$b */
    public interface b<T> {
        /* JADX INFO: renamed from: b */
        void mo12344b(T t10, C10141j c10141j);
    }

    /* JADX INFO: renamed from: xa.m$c */
    public static final class c<T> {

        /* JADX INFO: renamed from: a */
        public final T f51393a;

        /* JADX INFO: renamed from: b */
        public C10141j.a f51394b = new C10141j.a();

        /* JADX INFO: renamed from: c */
        public boolean f51395c;

        /* JADX INFO: renamed from: d */
        public boolean f51396d;

        public c(T t10) {
            this.f51393a = t10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f51393a.equals(((c) obj).f51393a);
        }

        public final int hashCode() {
            return this.f51393a.hashCode();
        }
    }

    public C10144m(Looper looper, InterfaceC10133c interfaceC10133c, b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, interfaceC10133c, bVar);
    }

    public C10144m(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, InterfaceC10133c interfaceC10133c, b<T> bVar) {
        this.f51384a = interfaceC10133c;
        this.f51387d = copyOnWriteArraySet;
        this.f51386c = bVar;
        this.f51390g = new Object();
        this.f51388e = new ArrayDeque<>();
        this.f51389f = new ArrayDeque<>();
        this.f51385b = interfaceC10133c.mo19013b(looper, new Handler.Callback() { // from class: xa.l
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
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                C10144m c10144m = this.f51383a;
                Iterator it = c10144m.f51387d.iterator();
                while (it.hasNext()) {
                    C10144m.c cVar = (C10144m.c) it.next();
                    if (!cVar.f51396d && cVar.f51395c) {
                        C10141j c10141jM19074b = cVar.f51394b.m19074b();
                        cVar.f51394b = new C10141j.a();
                        cVar.f51395c = false;
                        c10144m.f51386c.mo12344b(cVar.f51393a, c10141jM19074b);
                    }
                    if (c10144m.f51385b.mo19075a()) {
                        break;
                    }
                }
                return true;
            }
        });
        this.f51392i = true;
    }

    /* JADX INFO: renamed from: a */
    public final void m19087a() {
        m19092f();
        ArrayDeque<Runnable> arrayDeque = this.f51389f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        InterfaceC10142k interfaceC10142k = this.f51385b;
        if (!interfaceC10142k.mo19075a()) {
            interfaceC10142k.mo19077c(interfaceC10142k.mo19080f(0));
        }
        ArrayDeque<Runnable> arrayDeque2 = this.f51388e;
        boolean z10 = !arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (z10) {
            return;
        }
        while (!arrayDeque2.isEmpty()) {
            arrayDeque2.peekFirst().run();
            arrayDeque2.removeFirst();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m19088b(int i10, a<T> aVar) {
        m19092f();
        this.f51389f.add(new RunnableC5914g0(new CopyOnWriteArraySet(this.f51387d), i10, aVar));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public final void m19089c() {
        m19092f();
        synchronized (this.f51390g) {
            try {
                this.f51391h = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator<c<T>> it = this.f51387d.iterator();
        while (true) {
            while (true) {
                if (!it.hasNext()) {
                    this.f51387d.clear();
                    return;
                }
                c<T> next = it.next();
                b<T> bVar = this.f51386c;
                next.f51396d = true;
                if (next.f51395c) {
                    next.f51395c = false;
                    bVar.mo12344b(next.f51393a, next.f51394b.m19074b());
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m19090d(T t10) {
        m19092f();
        CopyOnWriteArraySet<c<T>> copyOnWriteArraySet = this.f51387d;
        for (c<T> cVar : copyOnWriteArraySet) {
            if (cVar.f51393a.equals(t10)) {
                cVar.f51396d = true;
                if (cVar.f51395c) {
                    cVar.f51395c = false;
                    C10141j c10141jM19074b = cVar.f51394b.m19074b();
                    this.f51386c.mo12344b(cVar.f51393a, c10141jM19074b);
                }
                copyOnWriteArraySet.remove(cVar);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m19091e(int i10, a<T> aVar) {
        m19088b(i10, aVar);
        m19087a();
    }

    /* JADX INFO: renamed from: f */
    public final void m19092f() {
        if (this.f51392i) {
            C10129a.m18992d(Thread.currentThread() == this.f51385b.mo19086l().getThread());
        }
    }
}
