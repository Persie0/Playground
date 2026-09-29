package bi;

import androidx.room.RoomDatabase;
import java.util.concurrent.Callable;
import p288o4.InterfaceC7920f;
import sl.C9072e;

/* JADX INFO: renamed from: bi.q */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1507q implements Callable<C9072e> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8791a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f8792b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f8793c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1493o f8794d;

    public CallableC1507q(C1493o c1493o, int i10, String str, String str2) {
        this.f8794d = c1493o;
        this.f8791a = i10;
        this.f8792b = str;
        this.f8793c = str2;
    }

    @Override // java.util.concurrent.Callable
    public final C9072e call() throws Exception {
        C1493o c1493o = this.f8794d;
        C1493o.r rVar = c1493o.f8684f;
        InterfaceC7920f interfaceC7920fM4574a = rVar.m4574a();
        interfaceC7920fM4574a.mo13194W(1, this.f8791a);
        String str = this.f8792b;
        if (str == null) {
            interfaceC7920fM4574a.mo13193J0(2);
        } else {
            interfaceC7920fM4574a.mo13197h0(str, 2);
        }
        String str2 = this.f8793c;
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
            rVar.m4576c(interfaceC7920fM4574a);
            return c9072e;
        } catch (Throwable th2) {
            roomDatabase.m4563n();
            rVar.m4576c(interfaceC7920fM4574a);
            throw th2;
        }
    }
}
