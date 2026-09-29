package androidx.work;

import android.net.Uri;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import p026b5.AbstractC1320m;
import p026b5.InterfaceC1311d;
import p235l5.C7278y;
import p257m5.InterfaceC7479a;

/* JADX INFO: loaded from: classes.dex */
public final class WorkerParameters {

    /* JADX INFO: renamed from: a */
    public final UUID f7801a;

    /* JADX INFO: renamed from: b */
    public final C1244b f7802b;

    /* JADX INFO: renamed from: c */
    public final int f7803c;

    /* JADX INFO: renamed from: d */
    public final Executor f7804d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC7479a f7805e;

    /* JADX INFO: renamed from: f */
    public final AbstractC1320m f7806f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC1311d f7807g;

    /* JADX INFO: renamed from: androidx.work.WorkerParameters$a */
    public static class C1242a {

        /* JADX INFO: renamed from: a */
        public List<String> f7808a = Collections.emptyList();

        /* JADX INFO: renamed from: b */
        public List<Uri> f7809b = Collections.emptyList();
    }

    public WorkerParameters(UUID uuid, C1244b c1244b, List list, int i10, Executor executor, InterfaceC7479a interfaceC7479a, AbstractC1320m abstractC1320m, C7278y c7278y) {
        this.f7801a = uuid;
        this.f7802b = c1244b;
        new HashSet(list);
        this.f7803c = i10;
        this.f7804d = executor;
        this.f7805e = interfaceC7479a;
        this.f7806f = abstractC1320m;
        this.f7807g = c7278y;
    }
}
