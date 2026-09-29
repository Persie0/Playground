package mm;

import dm.C5207g;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.EmptyList;
import p385sf.C9000b;
import tl.C9322j;

/* JADX INFO: renamed from: mm.e */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7642e implements InterfaceC7639b<Method> {

    /* JADX INFO: renamed from: a */
    public final Method f42064a;

    /* JADX INFO: renamed from: b */
    public final List<Type> f42065b;

    /* JADX INFO: renamed from: c */
    public final Class f42066c;

    /* JADX INFO: renamed from: mm.e$a */
    public static final class a extends AbstractC7642e implements InterfaceC7638a {

        /* JADX INFO: renamed from: d */
        public final Object f42067d;

        public a(Object obj, Method method) {
            super(method, EmptyList.f38032a);
            this.f42067d = obj;
        }

        @Override // mm.InterfaceC7639b
        /* JADX INFO: renamed from: b */
        public final Object mo13523b(Object[] objArr) {
            InterfaceC7639b.a.m15196a(this, objArr);
            return this.f42064a.invoke(this.f42067d, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* JADX INFO: renamed from: mm.e$b */
    public static final class b extends AbstractC7642e {
        public b(Method method) {
            super(method, C9000b.m17251q(method.getDeclaringClass()));
        }

        @Override // mm.InterfaceC7639b
        /* JADX INFO: renamed from: b */
        public final Object mo13523b(Object[] objArr) {
            InterfaceC7639b.a.m15196a(this, objArr);
            Object obj = objArr[0];
            Object[] objArrM17677e0 = objArr.length <= 1 ? new Object[0] : C9322j.m17677e0(1, objArr.length, objArr);
            return this.f42064a.invoke(obj, Arrays.copyOf(objArrM17677e0, objArrM17677e0.length));
        }
    }

    public AbstractC7642e(Method method, List list) {
        this.f42064a = method;
        this.f42065b = list;
        Class<?> returnType = method.getReturnType();
        C5207g.m11110e(returnType, "unboxMethod.returnType");
        this.f42066c = returnType;
    }

    @Override // mm.InterfaceC7639b
    /* JADX INFO: renamed from: a */
    public final List<Type> mo13522a() {
        return this.f42065b;
    }

    @Override // mm.InterfaceC7639b
    /* JADX INFO: renamed from: y */
    public final Type mo13524y() {
        return this.f42066c;
    }
}
