package p000;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dg1 implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35585a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f35586b;

    public /* synthetic */ dg1(String str, int i) {
        this.f35585a = i;
        this.f35586b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.f35585a;
        String str = this.f35586b;
        switch (i) {
            case 0:
                Thread thread = new Thread(runnable, str);
                thread.setPriority(10);
                return thread;
            default:
                return new Thread(runnable, str);
        }
    }
}
