package androidx.view;

import androidx.fragment.app.C0980t0;
import cm.InterfaceC2056p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class RepeatOnLifecycleKt {
    /* JADX INFO: renamed from: a */
    public static final Object m3905a(C0980t0 c0980t0, Lifecycle.State state, InterfaceC2056p interfaceC2056p, InterfaceC9968c interfaceC9968c) {
        c0980t0.m3813c();
        Object objM3906b = m3906b(c0980t0.f6415d, state, interfaceC2056p, interfaceC9968c);
        return objM3906b == CoroutineSingletons.COROUTINE_SUSPENDED ? objM3906b : C9072e.f47360a;
    }

    /* JADX INFO: renamed from: b */
    public static final Object m3906b(Lifecycle lifecycle, Lifecycle.State state, InterfaceC2056p<? super InterfaceC7882z, ? super InterfaceC9968c<? super C9072e>, ? extends Object> interfaceC2056p, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM14963s;
        if (state != Lifecycle.State.INITIALIZED) {
            return (lifecycle.mo3884b() != Lifecycle.State.DESTROYED && (objM14963s = C7499b.m14963s(new RepeatOnLifecycleKt$repeatOnLifecycle$3(lifecycle, state, interfaceC2056p, null), interfaceC9968c)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? objM14963s : C9072e.f47360a;
        }
        throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.".toString());
    }
}
