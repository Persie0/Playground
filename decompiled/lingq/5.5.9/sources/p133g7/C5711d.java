package p133g7;

import com.downloader.Priority;
import java.util.concurrent.FutureTask;
import p216k7.RunnableC6628c;

/* JADX INFO: renamed from: g7.d */
/* JADX INFO: loaded from: classes.dex */
public final class C5711d extends FutureTask<RunnableC6628c> implements Comparable<C5711d> {

    /* JADX INFO: renamed from: a */
    public final RunnableC6628c f34722a;

    public C5711d(RunnableC6628c runnableC6628c) {
        super(runnableC6628c, null);
        this.f34722a = runnableC6628c;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C5711d c5711d) {
        RunnableC6628c runnableC6628c = this.f34722a;
        Priority priority = runnableC6628c.f37575a;
        RunnableC6628c runnableC6628c2 = c5711d.f34722a;
        Priority priority2 = runnableC6628c2.f37575a;
        return priority == priority2 ? runnableC6628c.f37576b - runnableC6628c2.f37576b : priority2.ordinal() - priority.ordinal();
    }
}
