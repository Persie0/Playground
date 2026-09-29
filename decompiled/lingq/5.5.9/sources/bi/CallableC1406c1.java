package bi;

import android.support.v4.media.session.C0166e;
import androidx.room.RoomDatabase;
import dm.C5206f;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p288o4.InterfaceC7920f;
import sl.C9072e;

/* JADX INFO: renamed from: bi.c1 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1406c1 implements Callable<C9072e> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f8357a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1543v0 f8358b;

    public CallableC1406c1(C1543v0 c1543v0, ArrayList arrayList) {
        this.f8358b = c1543v0;
        this.f8357a = arrayList;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.concurrent.Callable
    public final C9072e call() throws Exception {
        StringBuilder sbM771r = C0166e.m771r("DELETE FROM LanguageContext WHERE code NOT IN (");
        List<String> list = this.f8357a;
        C5206f.m11021s0(list.size(), sbM771r);
        sbM771r.append(")");
        String string = sbM771r.toString();
        C1543v0 c1543v0 = this.f8358b;
        InterfaceC7920f interfaceC7920fM4555f = c1543v0.f8879a.m4555f(string);
        int i10 = 1;
        for (String str : list) {
            if (str == null) {
                interfaceC7920fM4555f.mo13193J0(i10);
            } else {
                interfaceC7920fM4555f.mo13197h0(str, i10);
            }
            i10++;
        }
        RoomDatabase roomDatabase = c1543v0.f8879a;
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
