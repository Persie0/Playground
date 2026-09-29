package androidx.room;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.sp6;
import p000.u91;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class InvalidationTracker$implementation$1 extends FunctionReferenceImpl implements vi3 {
    @Override // p000.vi3
    public final Object invoke(Object obj) {
        Set set = (Set) obj;
        set.getClass();
        C0736a c0736a = (C0736a) this.f47704b;
        ReentrantLock reentrantLock = c0736a.f6820d;
        reentrantLock.lock();
        try {
            List listM22622n1 = u91.m22622n1(c0736a.f6819c.values());
            reentrantLock.unlock();
            Iterator it = listM22622n1.iterator();
            while (it.hasNext()) {
                ((sp6) it.next()).m21531a(set);
            }
            return xfa.f68157a;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
