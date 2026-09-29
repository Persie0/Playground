package bi;

import androidx.room.RoomDatabase;
import java.util.concurrent.Callable;
import p288o4.InterfaceC7920f;
import sl.C9072e;

/* JADX INFO: renamed from: bi.y3 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1567y3 implements Callable<C9072e> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8999a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f9000b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1560x3 f9001c;

    public CallableC1567y3(int i10, C1560x3 c1560x3, String str) {
        this.f9001c = c1560x3;
        this.f8999a = i10;
        this.f9000b = str;
    }

    @Override // java.util.concurrent.Callable
    public final C9072e call() throws Exception {
        C1560x3 c1560x3 = this.f9001c;
        C1560x3.h0 h0Var = c1560x3.f8946g;
        InterfaceC7920f interfaceC7920fM4574a = h0Var.m4574a();
        interfaceC7920fM4574a.mo13194W(1, this.f8999a);
        String str = this.f9000b;
        if (str == null) {
            interfaceC7920fM4574a.mo13193J0(2);
        } else {
            interfaceC7920fM4574a.mo13197h0(str, 2);
        }
        RoomDatabase roomDatabase = c1560x3.f8940a;
        roomDatabase.m4552c();
        try {
            interfaceC7920fM4574a.mo15736A();
            roomDatabase.m4568s();
            return C9072e.f47360a;
        } finally {
            roomDatabase.m4563n();
            h0Var.m4576c(interfaceC7920fM4574a);
        }
    }
}
