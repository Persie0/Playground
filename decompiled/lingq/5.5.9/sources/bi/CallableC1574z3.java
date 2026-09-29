package bi;

import androidx.room.RoomDatabase;
import java.util.concurrent.Callable;
import p288o4.InterfaceC7920f;
import sl.C9072e;

/* JADX INFO: renamed from: bi.z3 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1574z3 implements Callable<C9072e> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9012a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f9013b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1560x3 f9014c;

    public CallableC1574z3(int i10, C1560x3 c1560x3, String str) {
        this.f9014c = c1560x3;
        this.f9012a = i10;
        this.f9013b = str;
    }

    @Override // java.util.concurrent.Callable
    public final C9072e call() throws Exception {
        C1560x3 c1560x3 = this.f9014c;
        C1560x3.i0 i0Var = c1560x3.f8947h;
        InterfaceC7920f interfaceC7920fM4574a = i0Var.m4574a();
        interfaceC7920fM4574a.mo13194W(1, this.f9012a);
        String str = this.f9013b;
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
            C9072e c9072e = C9072e.f47360a;
            roomDatabase.m4563n();
            i0Var.m4576c(interfaceC7920fM4574a);
            return c9072e;
        } catch (Throwable th2) {
            roomDatabase.m4563n();
            i0Var.m4576c(interfaceC7920fM4574a);
            throw th2;
        }
    }
}
