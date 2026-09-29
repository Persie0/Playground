package bi;

import androidx.room.RoomDatabase;
import java.util.concurrent.Callable;
import p288o4.InterfaceC7920f;
import sl.C9072e;

/* JADX INFO: renamed from: bi.b4 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1401b4 implements Callable<C9072e> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f8332a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f8333b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1560x3 f8334c;

    public CallableC1401b4(int i10, C1560x3 c1560x3, String str) {
        this.f8334c = c1560x3;
        this.f8332a = str;
        this.f8333b = i10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.concurrent.Callable
    public final C9072e call() throws Exception {
        C1560x3 c1560x3 = this.f8334c;
        C1560x3.c cVar = c1560x3.f8951l;
        InterfaceC7920f interfaceC7920fM4574a = cVar.m4574a();
        String str = this.f8332a;
        if (str == null) {
            interfaceC7920fM4574a.mo13193J0(1);
        } else {
            interfaceC7920fM4574a.mo13197h0(str, 1);
        }
        interfaceC7920fM4574a.mo13194W(2, this.f8333b);
        RoomDatabase roomDatabase = c1560x3.f8940a;
        roomDatabase.m4552c();
        try {
            interfaceC7920fM4574a.mo15736A();
            roomDatabase.m4568s();
            C9072e c9072e = C9072e.f47360a;
            roomDatabase.m4563n();
            return c9072e;
        } finally {
            roomDatabase.m4563n();
            cVar.m4576c(interfaceC7920fM4574a);
        }
    }
}
