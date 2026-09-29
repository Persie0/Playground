package bi;

import android.support.v4.media.session.C0166e;
import androidx.room.RoomDatabase;
import dm.C5206f;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p288o4.InterfaceC7920f;
import sl.C9072e;

/* JADX INFO: renamed from: bi.f3 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1432f3 implements Callable<C9072e> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f8457a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1461j2 f8458b;

    public CallableC1432f3(C1461j2 c1461j2, ArrayList arrayList) {
        this.f8458b = c1461j2;
        this.f8457a = arrayList;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.concurrent.Callable
    public final C9072e call() throws Exception {
        StringBuilder sbM771r = C0166e.m771r("DELETE FROM LibraryData WHERE id in (");
        List<Integer> list = this.f8457a;
        C5206f.m11021s0(list.size(), sbM771r);
        sbM771r.append(")");
        String string = sbM771r.toString();
        C1461j2 c1461j2 = this.f8458b;
        InterfaceC7920f interfaceC7920fM4555f = c1461j2.f8514a.m4555f(string);
        int i10 = 1;
        for (Integer num : list) {
            if (num == null) {
                interfaceC7920fM4555f.mo13193J0(i10);
            } else {
                interfaceC7920fM4555f.mo13194W(i10, num.intValue());
            }
            i10++;
        }
        RoomDatabase roomDatabase = c1461j2.f8514a;
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
