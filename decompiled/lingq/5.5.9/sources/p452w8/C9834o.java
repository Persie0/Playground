package p452w8;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import p503y8.InterfaceC10306b;

/* JADX INFO: renamed from: w8.o */
/* JADX INFO: loaded from: classes.dex */
public final class C9834o implements InterfaceC10306b<Executor> {

    /* JADX INFO: renamed from: w8.o$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final C9834o f50040a = new C9834o();
    }

    @Override // p371rl.InterfaceC8825a
    public final Object get() {
        return new ExecutorC9836q(Executors.newSingleThreadExecutor());
    }
}
