package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bsp {

    /* JADX INFO: renamed from: a */
    final cac f4344a;

    /* JADX INFO: renamed from: b */
    final Executor f4345b;

    public bsp(cac cacVar, Executor executor) {
        this.f4344a = cacVar;
        this.f4345b = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bsp) {
            return this.f4344a.equals(((bsp) obj).f4344a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4344a.hashCode();
    }
}
