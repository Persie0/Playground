package p036c0;

import androidx.compose.animation.core.C0369a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p374s.C8904e0;
import p374s.C8917l;
import p374s.C8927q;
import p423v.C9604b;
import p423v.C9606d;
import p423v.C9608f;
import p423v.C9615m;
import p423v.InterfaceC9610h;
import p464wl.InterfaceC9968c;
import p470x1.C10017e;
import sl.C9072e;

/* JADX INFO: renamed from: c0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1651g {

    /* JADX INFO: renamed from: a */
    public static final C8904e0<C10017e> f9246a;

    /* JADX INFO: renamed from: b */
    public static final C8904e0<C10017e> f9247b;

    /* JADX INFO: renamed from: c */
    public static final C8904e0<C10017e> f9248c;

    static {
        C8917l c8917l = new C8917l(0.4f, 0.6f);
        f9246a = new C8904e0<>(120, C8927q.f46847a, 2);
        f9247b = new C8904e0<>(150, c8917l, 2);
        f9248c = new C8904e0<>(120, c8917l, 2);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0046  */
    /* JADX INFO: renamed from: a */
    public static final Object m5369a(C0369a<C10017e, ?> c0369a, float f3, InterfaceC9610h interfaceC9610h, InterfaceC9610h interfaceC9610h2, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        C8904e0<C10017e> c8904e0;
        if (interfaceC9610h2 != null) {
            if ((interfaceC9610h2 instanceof C9615m) || (interfaceC9610h2 instanceof C9604b) || (interfaceC9610h2 instanceof C9608f) || (interfaceC9610h2 instanceof C9606d)) {
                c8904e0 = f9246a;
            } else {
                c8904e0 = null;
            }
        } else if (interfaceC9610h == null) {
            c8904e0 = null;
        } else {
            if (!(interfaceC9610h instanceof C9615m) && !(interfaceC9610h instanceof C9604b)) {
                if (interfaceC9610h instanceof C9608f) {
                    c8904e0 = f9248c;
                } else if (!(interfaceC9610h instanceof C9606d)) {
                    c8904e0 = null;
                }
            }
            c8904e0 = f9247b;
        }
        if (c8904e0 != null) {
            Object objM1382b = C0369a.m1382b(c0369a, new C10017e(f3), c8904e0, interfaceC9968c);
            return objM1382b == CoroutineSingletons.COROUTINE_SUSPENDED ? objM1382b : C9072e.f47360a;
        }
        Object objM1384d = c0369a.m1384d(new C10017e(f3), interfaceC9968c);
        return objM1384d == CoroutineSingletons.COROUTINE_SUSPENDED ? objM1384d : C9072e.f47360a;
    }
}
