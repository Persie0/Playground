package p454wa;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;
import p174i9.InterfaceC6206a;

/* JADX INFO: renamed from: wa.c */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC9878c {

    /* JADX INFO: renamed from: wa.c$a */
    public interface a {

        /* JADX INFO: renamed from: wa.c$a$a, reason: collision with other inner class name */
        public static final class C10676a {

            /* JADX INFO: renamed from: a */
            public final CopyOnWriteArrayList<C10677a> f50418a = new CopyOnWriteArrayList<>();

            /* JADX INFO: renamed from: wa.c$a$a$a, reason: collision with other inner class name */
            public static final class C10677a {

                /* JADX INFO: renamed from: a */
                public final Handler f50419a;

                /* JADX INFO: renamed from: b */
                public final a f50420b;

                /* JADX INFO: renamed from: c */
                public boolean f50421c;

                public C10677a(Handler handler, InterfaceC6206a interfaceC6206a) {
                    this.f50419a = handler;
                    this.f50420b = interfaceC6206a;
                }
            }

            /* JADX INFO: renamed from: a */
            public final void m18375a(InterfaceC6206a interfaceC6206a) {
                CopyOnWriteArrayList<C10677a> copyOnWriteArrayList = this.f50418a;
                while (true) {
                    for (C10677a c10677a : copyOnWriteArrayList) {
                        if (c10677a.f50420b == interfaceC6206a) {
                            c10677a.f50421c = true;
                            copyOnWriteArrayList.remove(c10677a);
                        }
                    }
                    return;
                }
            }
        }

        /* JADX INFO: renamed from: L */
        void mo12826L(int i10, long j10, long j11);
    }

    /* JADX INFO: renamed from: a */
    void mo18371a(Handler handler, InterfaceC6206a interfaceC6206a);

    /* JADX INFO: renamed from: e */
    void mo18372e(InterfaceC6206a interfaceC6206a);

    /* JADX INFO: renamed from: g */
    C9887l mo18373g();

    /* JADX INFO: renamed from: h */
    long mo18374h();
}
