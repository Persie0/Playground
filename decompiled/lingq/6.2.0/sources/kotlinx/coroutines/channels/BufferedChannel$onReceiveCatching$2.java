package kotlinx.coroutines.channels;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.aj3;
import p000.fj0;
import p000.hu0;
import p000.ju0;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class BufferedChannel$onReceiveCatching$2 extends FunctionReferenceImpl implements aj3 {

    /* JADX INFO: renamed from: i */
    public static final BufferedChannel$onReceiveCatching$2 f47767i = new BufferedChannel$onReceiveCatching$2(3, C3211a.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C3211a c3211a = (C3211a) obj;
        AtomicLongFieldUpdater atomicLongFieldUpdater = C3211a.f47784b;
        c3211a.getClass();
        if (obj3 == fj0.f39181l) {
            obj3 = new hu0(c3211a.m15478t());
        }
        return new ju0(obj3);
    }
}
