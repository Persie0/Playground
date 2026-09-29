package p000;

import androidx.room.util.AbstractC0758a;
import androidx.work.WorkInfo$State;
import androidx.work.impl.C0778d;
import java.io.ByteArrayInputStream;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c9b implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9773a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f9774b;

    public /* synthetic */ c9b(Object obj, int i) {
        this.f9773a = i;
        this.f9774b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f9773a;
        Object obj = this.f9774b;
        switch (i) {
            case 0:
                C0778d c0778d = (C0778d) obj;
                p8b p8bVar = c0778d.f7240a;
                WorkInfo$State workInfo$State = p8bVar.f55773b;
                String str = p8bVar.f55774c;
                WorkInfo$State workInfo$State2 = WorkInfo$State.ENQUEUED;
                if (workInfo$State != workInfo$State2) {
                    String str2 = h9b.f42060a;
                    oj5.m18040f().m18042a(str2, str + " is not in ENQUEUED state. Nothing more to do");
                    return Boolean.TRUE;
                }
                if (p8bVar.m18988k() || (p8bVar.f55773b == workInfo$State2 && p8bVar.f55782k > 0)) {
                    c0778d.f7245f.getClass();
                    if (System.currentTimeMillis() < p8bVar.m18979a()) {
                        oj5.m18040f().m18042a(h9b.f42060a, "Delaying execution for " + str + " because it is being executed before schedule.");
                        return Boolean.TRUE;
                    }
                }
                return Boolean.FALSE;
            case 1:
                C0778d c0778d2 = (C0778d) obj;
                u8b u8bVar = c0778d2.f7248i;
                String str3 = c0778d2.f7242c;
                boolean z = false;
                if (u8bVar.m22568d(str3) == WorkInfo$State.ENQUEUED) {
                    u8bVar.m22574j(WorkInfo$State.RUNNING, str3);
                    ((Number) AbstractC0758a.m2859b(u8bVar.f63598a, false, true, new xca(str3, 15))).intValue();
                    u8bVar.m22575k(-256, str3);
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                return ll5.m16352e(r46.m20369L((ByteArrayInputStream) obj), null);
        }
    }
}
