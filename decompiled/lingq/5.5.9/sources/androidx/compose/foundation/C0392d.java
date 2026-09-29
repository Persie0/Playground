package androidx.compose.foundation;

import androidx.compose.foundation.gestures.DefaultScrollableState;
import cm.InterfaceC2056p;
import dm.C5207g;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.sync.MutexImpl;
import no.InterfaceC7875v0;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;

/* JADX INFO: renamed from: androidx.compose.foundation.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0392d {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<a> f1946a = new AtomicReference<>(null);

    /* JADX INFO: renamed from: b */
    public final MutexImpl f1947b = new MutexImpl(false);

    /* JADX INFO: renamed from: androidx.compose.foundation.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final MutatePriority f1948a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC7875v0 f1949b;

        public a(MutatePriority mutatePriority, InterfaceC7875v0 interfaceC7875v0) {
            C5207g.m11111f(mutatePriority, "priority");
            this.f1948a = mutatePriority;
            this.f1949b = interfaceC7875v0;
        }
    }

    /* JADX INFO: renamed from: a */
    public final Object m1430a(DefaultScrollableState.C0398a c0398a, MutatePriority mutatePriority, InterfaceC2056p interfaceC2056p, InterfaceC9968c interfaceC9968c) {
        return C7499b.m14963s(new MutatorMutex$mutateWith$2(mutatePriority, this, interfaceC2056p, c0398a, null), interfaceC9968c);
    }
}
