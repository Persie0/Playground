package p476x7;

import android.util.Log;
import dm.C5207g;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: renamed from: x7.h */
/* JADX INFO: loaded from: classes.dex */
public final class C10109h implements InvocationHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f51271a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Ref$ObjectRef<String> f51272b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ReentrantLock f51273c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Condition f51274d;

    public C10109h(Object obj, Ref$ObjectRef<String> ref$ObjectRef, ReentrantLock reentrantLock, Condition condition) {
        this.f51271a = obj;
        this.f51272b = ref$ObjectRef;
        this.f51273c = reentrantLock;
        this.f51274d = condition;
    }

    /* JADX WARN: Type inference failed for: r13v11, types: [T, java.lang.String] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        ReentrantLock reentrantLock = this.f51273c;
        C5207g.m11111f(method, "method");
        C5207g.m11111f(objArr, "objects");
        try {
            if (C5207g.m11106a(method.getName(), "onChecksumsReady") && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    for (Object obj3 : (List) obj2) {
                        if (obj3 != null) {
                            Method method2 = obj3.getClass().getMethod("getSplitName", new Class[0]);
                            C5207g.m11110e(method2, "c.javaClass.getMethod(\"getSplitName\")");
                            Method method3 = obj3.getClass().getMethod("getType", new Class[0]);
                            C5207g.m11110e(method3, "c.javaClass.getMethod(\"getType\")");
                            if (method2.invoke(obj3, new Object[0]) == null && C5207g.m11106a(method3.invoke(obj3, new Object[0]), this.f51271a)) {
                                Method method4 = obj3.getClass().getMethod("getValue", new Class[0]);
                                C5207g.m11110e(method4, "c.javaClass.getMethod(\"getValue\")");
                                Object objInvoke = method4.invoke(obj3, new Object[0]);
                                if (objInvoke == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
                                }
                                this.f51272b.f38127a = new BigInteger(1, (byte[]) objInvoke).toString(16);
                                reentrantLock.lock();
                                try {
                                    this.f51274d.signalAll();
                                    reentrantLock.unlock();
                                    return null;
                                } catch (Throwable th2) {
                                    reentrantLock.unlock();
                                    throw th2;
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            Log.d(C10110i.f51276b, "Can't fetch checksum.", th3);
        }
        return null;
    }
}
