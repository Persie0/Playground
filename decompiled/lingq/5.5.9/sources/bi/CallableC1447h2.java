package bi;

import android.support.v4.media.session.C0166e;
import androidx.room.RoomDatabase;
import dm.C5206f;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p288o4.InterfaceC7920f;
import sl.C9072e;

/* JADX INFO: renamed from: bi.h2 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1447h2 implements Callable<C9072e> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f8488a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1502p1 f8489b;

    public CallableC1447h2(C1502p1 c1502p1, ArrayList arrayList) {
        this.f8489b = c1502p1;
        this.f8488a = arrayList;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.concurrent.Callable
    public final C9072e call() throws Exception {
        StringBuilder sbM771r = C0166e.m771r("UPDATE LibraryCounter SET isTaken = 1 WHERE id IN (");
        List<Integer> list = this.f8488a;
        C5206f.m11021s0(list.size(), sbM771r);
        sbM771r.append(")");
        String string = sbM771r.toString();
        C1502p1 c1502p1 = this.f8489b;
        InterfaceC7920f interfaceC7920fM4555f = c1502p1.f8725a.m4555f(string);
        int i10 = 1;
        for (Integer num : list) {
            if (num == null) {
                interfaceC7920fM4555f.mo13193J0(i10);
            } else {
                interfaceC7920fM4555f.mo13194W(i10, num.intValue());
            }
            i10++;
        }
        RoomDatabase roomDatabase = c1502p1.f8725a;
        roomDatabase.m4552c();
        try {
            interfaceC7920fM4555f.mo15736A();
            roomDatabase.m4568s();
            C9072e c9072e = C9072e.f47360a;
            roomDatabase.m4563n();
            return c9072e;
        } catch (Throwable th2) {
            roomDatabase.m4563n();
            throw th2;
        }
    }
}
