package bi;

import androidx.room.RoomDatabase;
import java.util.concurrent.Callable;
import p288o4.InterfaceC7920f;
import sl.C9072e;

/* JADX INFO: renamed from: bi.f1 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1430f1 implements Callable<C9072e> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8451a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f8452b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f8453c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1422e1 f8454d;

    public CallableC1430f1(C1422e1 c1422e1, int i10, String str, String str2) {
        this.f8454d = c1422e1;
        this.f8451a = i10;
        this.f8452b = str;
        this.f8453c = str2;
    }

    @Override // java.util.concurrent.Callable
    public final C9072e call() throws Exception {
        C1422e1 c1422e1 = this.f8454d;
        C1422e1.o oVar = c1422e1.f8404c;
        InterfaceC7920f interfaceC7920fM4574a = oVar.m4574a();
        interfaceC7920fM4574a.mo13194W(1, this.f8451a);
        String str = this.f8452b;
        if (str == null) {
            interfaceC7920fM4574a.mo13193J0(2);
        } else {
            interfaceC7920fM4574a.mo13197h0(str, 2);
        }
        String str2 = this.f8453c;
        if (str2 == null) {
            interfaceC7920fM4574a.mo13193J0(3);
        } else {
            interfaceC7920fM4574a.mo13197h0(str2, 3);
        }
        RoomDatabase roomDatabase = c1422e1.f8402a;
        roomDatabase.m4552c();
        try {
            interfaceC7920fM4574a.mo15736A();
            roomDatabase.m4568s();
            C9072e c9072e = C9072e.f47360a;
            roomDatabase.m4563n();
            oVar.m4576c(interfaceC7920fM4574a);
            return c9072e;
        } catch (Throwable th2) {
            roomDatabase.m4563n();
            oVar.m4576c(interfaceC7920fM4574a);
            throw th2;
        }
    }
}
