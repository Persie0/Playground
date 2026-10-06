package androidx.work;

import java.util.Collection;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.Executor;
import p000.C1058va;
import p000.axt;
import p000.ayl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class WorkerParameters {

    /* JADX INFO: renamed from: a */
    public final UUID f1796a;

    /* JADX INFO: renamed from: b */
    public final axt f1797b;

    /* JADX INFO: renamed from: c */
    public final int f1798c;

    /* JADX INFO: renamed from: d */
    public final Executor f1799d;

    /* JADX INFO: renamed from: e */
    public final ayl f1800e;

    /* JADX INFO: renamed from: f */
    public final C1058va f1801f;

    public WorkerParameters(UUID uuid, axt axtVar, Collection collection, int i, Executor executor, C1058va c1058va, ayl aylVar, byte[] bArr) {
        this.f1796a = uuid;
        this.f1797b = axtVar;
        new HashSet(collection);
        this.f1798c = i;
        this.f1799d = executor;
        this.f1801f = c1058va;
        this.f1800e = aylVar;
    }
}
