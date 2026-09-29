package bi;

import android.support.v4.media.session.C0166e;
import androidx.room.RoomDatabase;
import dm.C5206f;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p288o4.InterfaceC7920f;
import sl.C9072e;

/* JADX INFO: renamed from: bi.w4 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1554w4 implements Callable<C9072e> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f8922a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f8923b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1560x3 f8924c;

    public CallableC1554w4(C1560x3 c1560x3, ArrayList arrayList, String str) {
        this.f8924c = c1560x3;
        this.f8922a = arrayList;
        this.f8923b = str;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.concurrent.Callable
    public final C9072e call() throws Exception {
        StringBuilder sbM771r = C0166e.m771r("DELETE FROM PlaylistAndLessonsJoin WHERE nameWithLanguage = ? AND contentId in (");
        List<Integer> list = this.f8922a;
        C5206f.m11021s0(list.size(), sbM771r);
        sbM771r.append(")");
        String string = sbM771r.toString();
        C1560x3 c1560x3 = this.f8924c;
        InterfaceC7920f interfaceC7920fM4555f = c1560x3.f8940a.m4555f(string);
        String str = this.f8923b;
        if (str == null) {
            interfaceC7920fM4555f.mo13193J0(1);
        } else {
            interfaceC7920fM4555f.mo13197h0(str, 1);
        }
        int i10 = 2;
        for (Integer num : list) {
            if (num == null) {
                interfaceC7920fM4555f.mo13193J0(i10);
            } else {
                interfaceC7920fM4555f.mo13194W(i10, num.intValue());
            }
            i10++;
        }
        RoomDatabase roomDatabase = c1560x3.f8940a;
        roomDatabase.m4552c();
        try {
            interfaceC7920fM4555f.mo15736A();
            roomDatabase.m4568s();
            return C9072e.f47360a;
        } finally {
            roomDatabase.m4563n();
        }
    }
}
