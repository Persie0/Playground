package bi;

import androidx.room.RoomDatabase;
import java.util.concurrent.Callable;
import p288o4.InterfaceC7920f;
import sl.C9072e;

/* JADX INFO: renamed from: bi.g1 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1438g1 implements Callable<C9072e> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8469a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f8470b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f8471c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1422e1 f8472d;

    public CallableC1438g1(C1422e1 c1422e1, int i10, String str, String str2) {
        this.f8472d = c1422e1;
        this.f8469a = i10;
        this.f8470b = str;
        this.f8471c = str2;
    }

    @Override // java.util.concurrent.Callable
    public final C9072e call() throws Exception {
        C1422e1 c1422e1 = this.f8472d;
        C1422e1.p pVar = c1422e1.f8405d;
        InterfaceC7920f interfaceC7920fM4574a = pVar.m4574a();
        interfaceC7920fM4574a.mo13194W(1, this.f8469a);
        String str = this.f8470b;
        if (str == null) {
            interfaceC7920fM4574a.mo13193J0(2);
        } else {
            interfaceC7920fM4574a.mo13197h0(str, 2);
        }
        String str2 = this.f8471c;
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
            return C9072e.f47360a;
        } finally {
            roomDatabase.m4563n();
            pVar.m4576c(interfaceC7920fM4574a);
        }
    }
}
