package androidx.room;

import android.os.CancellationSignal;
import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.concurrent.Callable;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C7136q;
import kotlinx.coroutines.scheduling.C7178b;
import no.C7818b1;
import no.C7828f;
import no.C7832g0;
import no.C7843k;
import no.C7848l1;
import p213k4.C6597q;
import p260m8.C7499b;
import p349qo.C8656b;
import p464wl.InterfaceC9968c;
import p464wl.InterfaceC9969d;
import sl.C9072e;

/* JADX INFO: renamed from: androidx.room.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1185b {
    /* JADX INFO: renamed from: a */
    public static final C7136q m4579a(RoomDatabase roomDatabase, boolean z10, String[] strArr, Callable callable) {
        C5207g.m11111f(roomDatabase, "db");
        return new C7136q(new CoroutinesRoom$Companion$createFlow$1(z10, roomDatabase, strArr, callable, null));
    }

    /* JADX INFO: renamed from: b */
    public static final Object m4580b(RoomDatabase roomDatabase, Callable callable, InterfaceC9968c interfaceC9968c) {
        CoroutineContext coroutineContextM14917O;
        if (roomDatabase.m4565p() && roomDatabase.m4562m()) {
            return callable.call();
        }
        C6597q c6597q = (C6597q) interfaceC9968c.mo2029e().mo1474w(C6597q.f37492c);
        if (c6597q == null || (coroutineContextM14917O = c6597q.f37493a) == null) {
            coroutineContextM14917O = C7499b.m14917O(roomDatabase);
        }
        return C7828f.m15574h(interfaceC9968c, coroutineContextM14917O, new CoroutinesRoom$Companion$execute$2(callable, null));
    }

    /* JADX INFO: renamed from: c */
    public static final <R> Object m4581c(RoomDatabase roomDatabase, boolean z10, final CancellationSignal cancellationSignal, Callable<R> callable, InterfaceC9968c<? super R> interfaceC9968c) {
        CoroutineContext coroutineContextM14917O;
        if (roomDatabase.m4565p() && roomDatabase.m4562m()) {
            return callable.call();
        }
        C6597q c6597q = (C6597q) interfaceC9968c.mo2029e().mo1474w(C6597q.f37492c);
        if (c6597q == null || (coroutineContextM14917O = c6597q.f37493a) == null) {
            coroutineContextM14917O = z10 ? C7499b.m14917O(roomDatabase) : C7499b.m14914L(roomDatabase);
        }
        C7843k c7843k = new C7843k(1, C8656b.m16874A(interfaceC9968c));
        c7843k.m15594r();
        CoroutinesRoom$Companion$execute$4$job$1 coroutinesRoom$Companion$execute$4$job$1 = new CoroutinesRoom$Companion$execute$4$job$1(callable, c7843k, null);
        if ((2 & 1) != 0) {
            coroutineContextM14917O = EmptyCoroutineContext.f38093a;
        }
        CoroutineStart coroutineStart = (2 & 2) != 0 ? CoroutineStart.DEFAULT : null;
        CoroutineContext coroutineContextM14307a = CoroutineContextKt.m14307a(EmptyCoroutineContext.f38093a, coroutineContextM14917O, true);
        C7178b c7178b = C7832g0.f42930a;
        if (coroutineContextM14307a != c7178b && coroutineContextM14307a.mo1474w(InterfaceC9969d.a.f50692a) == null) {
            coroutineContextM14307a = coroutineContextM14307a.mo1471C(c7178b);
        }
        final C7848l1 c7818b1 = coroutineStart.isLazy() ? new C7818b1(coroutineContextM14307a, coroutinesRoom$Companion$execute$4$job$1) : new C7848l1(coroutineContextM14307a, true);
        coroutineStart.invoke(coroutinesRoom$Companion$execute$4$job$1, c7818b1, c7818b1);
        c7843k.mo15577R(new InterfaceC2052l<Throwable, C9072e>() { // from class: androidx.room.CoroutinesRoom$Companion$execute$4$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(Throwable th2) {
                CancellationSignal cancellationSignal2 = cancellationSignal;
                C5207g.m11111f(cancellationSignal2, "cancellationSignal");
                cancellationSignal2.cancel();
                c7818b1.mo15618a(null);
                return C9072e.f47360a;
            }
        });
        Object objM15593p = c7843k.m15593p();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM15593p;
    }
}
