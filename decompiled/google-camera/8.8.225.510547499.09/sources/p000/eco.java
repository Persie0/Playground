package p000;

import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eco {

    /* JADX INFO: renamed from: a */
    public static final long f13390a = TimeUnit.SECONDS.toNanos(1);

    /* JADX INFO: renamed from: b */
    public HashMap f13391b = new HashMap();

    public eco(jwn jwnVar, Executor executor, jvb jvbVar) {
        jvbVar.m13537d(jwnVar.mo3830a(new dsu(this, 3), executor));
    }
}
