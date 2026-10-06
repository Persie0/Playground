package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fzn {
    public fzn() {
        new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public static final fzo m8978a(String str, List list) {
        return new fzo(str, list);
    }

    /* JADX INFO: renamed from: b */
    public static final void m8979b(String str, boolean z, List list) {
        if (z) {
            return;
        }
        list.add(str);
    }

    /* JADX INFO: renamed from: e */
    public static goy m8981e() {
        return new goy();
    }

    /* JADX INFO: renamed from: c */
    public final synchronized flf m8982c() {
        throw new IllegalStateException("Requesting mash trimmer but no start point yet");
    }
}
