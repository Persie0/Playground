package td;

import p457wd.C9907h;

/* JADX INFO: renamed from: td.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC9250a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final C9907h f47942a;

    public AbstractRunnableC9250a() {
        this.f47942a = null;
    }

    public AbstractRunnableC9250a(C9907h c9907h) {
        this.f47942a = c9907h;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo16640a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo16640a();
        } catch (Exception e10) {
            C9907h c9907h = this.f47942a;
            if (c9907h != null) {
                c9907h.m18407a(e10);
            }
        }
    }
}
