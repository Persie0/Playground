package p000;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class n98 implements InvocationHandler {

    /* JADX INFO: renamed from: a */
    public final Object[] f52513a = new Object[0];

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Class f52514b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ o98 f52515c;

    public n98(o98 o98Var, Class cls) {
        this.f52515c = o98Var;
        this.f52514b = cls;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x006a A[SYNTHETIC] */
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        bx3 bx3VarM4219b;
        Object obj2;
        Class cls = this.f52514b;
        if (method.getDeclaringClass() == Object.class) {
            return method.invoke(this, objArr);
        }
        if (objArr == null) {
            objArr = this.f52513a;
        }
        Object[] objArr2 = objArr;
        p58 p58Var = v87.f65023b;
        if (p58Var.mo18909o(method)) {
            return p58Var.mo18908n(cls, obj, method, objArr2);
        }
        o98 o98Var = this.f52515c;
        while (true) {
            Object objPutIfAbsent = o98Var.f54085a.get(method);
            if (!(objPutIfAbsent instanceof bx3)) {
                if (objPutIfAbsent != null) {
                    synchronized (objPutIfAbsent) {
                        obj2 = o98Var.f54085a.get(method);
                        if (obj2 == null) {
                            bx3VarM4219b = (bx3) obj2;
                            break;
                        }
                    }
                } else {
                    Object obj3 = new Object();
                    synchronized (obj3) {
                        try {
                            objPutIfAbsent = o98Var.f54085a.putIfAbsent(method, obj3);
                            if (objPutIfAbsent != null) {
                                synchronized (objPutIfAbsent) {
                                    try {
                                        obj2 = o98Var.f54085a.get(method);
                                        if (obj2 == null) {
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                bx3VarM4219b = (bx3) obj2;
                                break;
                            }
                            try {
                                bx3VarM4219b = bx3.m4219b(o98Var, cls, method);
                                o98Var.f54085a.put(method, bx3VarM4219b);
                                break;
                            } catch (Throwable th2) {
                                o98Var.f54085a.remove(method);
                                throw th2;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            } else {
                bx3VarM4219b = (bx3) objPutIfAbsent;
                break;
            }
        }
        return bx3VarM4219b.mo3111a(new br6(bx3VarM4219b.f9129a, obj, objArr2, bx3VarM4219b.f9130b, bx3VarM4219b.f9131c), objArr2);
    }
}
