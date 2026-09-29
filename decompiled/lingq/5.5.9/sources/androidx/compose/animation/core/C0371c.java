package androidx.compose.animation.core;

import dm.C5207g;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.sync.MutexImpl;
import no.InterfaceC7875v0;

/* JADX INFO: renamed from: androidx.compose.animation.core.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0371c {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<a> f1665a = new AtomicReference<>(null);

    /* JADX INFO: renamed from: b */
    public final MutexImpl f1666b = new MutexImpl(false);

    /* JADX INFO: renamed from: androidx.compose.animation.core.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final MutatePriority f1667a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC7875v0 f1668b;

        public a(MutatePriority mutatePriority, InterfaceC7875v0 interfaceC7875v0) {
            C5207g.m11111f(mutatePriority, "priority");
            this.f1667a = mutatePriority;
            this.f1668b = interfaceC7875v0;
        }
    }
}
