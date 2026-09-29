package p457wd;

import java.util.concurrent.Executor;
import p289o5.RunnableC7934n;

/* JADX INFO: renamed from: wd.f */
/* JADX INFO: loaded from: classes.dex */
public final class C9905f implements InterfaceC9906g {

    /* JADX INFO: renamed from: a */
    public final Executor f50538a;

    /* JADX INFO: renamed from: b */
    public final Object f50539b = new Object();

    /* JADX INFO: renamed from: c */
    public final InterfaceC9900a f50540c;

    public C9905f(Executor executor, InterfaceC9900a interfaceC9900a) {
        this.f50538a = executor;
        this.f50540c = interfaceC9900a;
    }

    @Override // p457wd.InterfaceC9906g
    /* JADX INFO: renamed from: a */
    public final void mo18406a(C9910k c9910k) {
        if (c9910k.m18408a()) {
            return;
        }
        synchronized (this.f50539b) {
            try {
                if (this.f50540c == null) {
                    return;
                }
                this.f50538a.execute(new RunnableC7934n(this, c9910k));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
