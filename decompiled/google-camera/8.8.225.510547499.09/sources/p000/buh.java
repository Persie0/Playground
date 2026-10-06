package p000;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class buh implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f4483a;

    public buh(int i) {
        this.f4483a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f4483a) {
            case 0:
                return new bug(runnable);
            default:
                return new Thread(new baa(runnable, 12), "glide-active-resources");
        }
    }
}
