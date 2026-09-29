package bi;

import androidx.room.RoomDatabase;
import java.util.concurrent.Callable;
import p288o4.InterfaceC7920f;
import sl.C9072e;

/* JADX INFO: renamed from: bi.h1 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1446h1 implements Callable<C9072e> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8485a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f8486b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1422e1 f8487c;

    public CallableC1446h1(int i10, C1422e1 c1422e1, String str) {
        this.f8487c = c1422e1;
        this.f8485a = i10;
        this.f8486b = str;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.concurrent.Callable
    public final C9072e call() throws Exception {
        C1422e1 c1422e1 = this.f8487c;
        C1422e1.s sVar = c1422e1.f8408g;
        InterfaceC7920f interfaceC7920fM4574a = sVar.m4574a();
        interfaceC7920fM4574a.mo13194W(1, this.f8485a);
        String str = this.f8486b;
        if (str == null) {
            interfaceC7920fM4574a.mo13193J0(2);
        } else {
            interfaceC7920fM4574a.mo13197h0(str, 2);
        }
        RoomDatabase roomDatabase = c1422e1.f8402a;
        roomDatabase.m4552c();
        try {
            interfaceC7920fM4574a.mo15736A();
            roomDatabase.m4568s();
            C9072e c9072e = C9072e.f47360a;
            roomDatabase.m4563n();
            sVar.m4576c(interfaceC7920fM4574a);
            return c9072e;
        } catch (Throwable th2) {
            roomDatabase.m4563n();
            sVar.m4576c(interfaceC7920fM4574a);
            throw th2;
        }
    }
}
