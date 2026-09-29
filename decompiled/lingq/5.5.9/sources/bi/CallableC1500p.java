package bi;

import androidx.room.RoomDatabase;
import java.util.concurrent.Callable;
import p288o4.InterfaceC7920f;
import sl.C9072e;

/* JADX INFO: renamed from: bi.p */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1500p implements Callable<C9072e> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8718a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f8719b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f8720c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1493o f8721d;

    public CallableC1500p(C1493o c1493o, int i10, String str, String str2) {
        this.f8721d = c1493o;
        this.f8718a = i10;
        this.f8719b = str;
        this.f8720c = str2;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.concurrent.Callable
    public final C9072e call() throws Exception {
        C1493o c1493o = this.f8721d;
        C1493o.q qVar = c1493o.f8683e;
        InterfaceC7920f interfaceC7920fM4574a = qVar.m4574a();
        interfaceC7920fM4574a.mo13194W(1, this.f8718a);
        String str = this.f8719b;
        if (str == null) {
            interfaceC7920fM4574a.mo13193J0(2);
        } else {
            interfaceC7920fM4574a.mo13197h0(str, 2);
        }
        String str2 = this.f8720c;
        if (str2 == null) {
            interfaceC7920fM4574a.mo13193J0(3);
        } else {
            interfaceC7920fM4574a.mo13197h0(str2, 3);
        }
        RoomDatabase roomDatabase = c1493o.f8679a;
        roomDatabase.m4552c();
        try {
            interfaceC7920fM4574a.mo15736A();
            roomDatabase.m4568s();
            C9072e c9072e = C9072e.f47360a;
            roomDatabase.m4563n();
            qVar.m4576c(interfaceC7920fM4574a);
            return c9072e;
        } catch (Throwable th2) {
            roomDatabase.m4563n();
            qVar.m4576c(interfaceC7920fM4574a);
            throw th2;
        }
    }
}
