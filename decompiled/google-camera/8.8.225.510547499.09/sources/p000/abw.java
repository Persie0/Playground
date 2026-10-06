package p000;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class abw {
    /* JADX INFO: renamed from: a */
    public static Executor m168a(Context context) {
        return context.getMainExecutor();
    }

    /* JADX INFO: renamed from: b */
    public static final akr m169b(akr akrVar, akr akrVar2) {
        akrVar.getClass();
        return (akrVar2 == null || akrVar2.compareTo(akrVar) >= 0) ? akrVar : akrVar2;
    }
}
