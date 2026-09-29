package kotlinx.coroutines.internal;

import cm.InterfaceC2052l;
import kotlin.coroutines.CoroutineContext;
import p338qd.C8573r0;
import p349qo.C8656b;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
public final class OnUndeliveredElementKt {
    /* JADX INFO: renamed from: a */
    public static final <E> InterfaceC2052l<Throwable, C9072e> m14431a(final InterfaceC2052l<? super E, C9072e> interfaceC2052l, final E e10, final CoroutineContext coroutineContext) {
        return new InterfaceC2052l<Throwable, C9072e>() { // from class: kotlinx.coroutines.internal.OnUndeliveredElementKt$bindCancellationFun$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(Throwable th2) {
                UndeliveredElementException undeliveredElementExceptionM14432b = OnUndeliveredElementKt.m14432b(interfaceC2052l, e10, null);
                if (undeliveredElementExceptionM14432b != null) {
                    C8573r0.m16769x0(coroutineContext, undeliveredElementExceptionM14432b);
                }
                return C9072e.f47360a;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final <E> UndeliveredElementException m14432b(InterfaceC2052l<? super E, C9072e> interfaceC2052l, E e10, UndeliveredElementException undeliveredElementException) {
        try {
            interfaceC2052l.mo528n(e10);
        } catch (Throwable th2) {
            if (undeliveredElementException == null || undeliveredElementException.getCause() == th2) {
                return new UndeliveredElementException("Exception in undelivered element handler for " + e10, th2);
            }
            C8656b.m16899g(undeliveredElementException, th2);
        }
        return undeliveredElementException;
    }
}
