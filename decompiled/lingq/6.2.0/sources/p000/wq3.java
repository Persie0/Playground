package p000;

import androidx.datastore.core.MulticastFileObserver;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wq3 implements ci2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67173a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f67174b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f67175c;

    public /* synthetic */ wq3(int i, Object obj, Object obj2) {
        this.f67173a = i;
        this.f67174b = obj;
        this.f67175c = obj2;
    }

    @Override // p000.ci2
    /* JADX INFO: renamed from: a */
    public final void mo125a() {
        int i = this.f67173a;
        Object obj = this.f67175c;
        Object obj2 = this.f67174b;
        switch (i) {
            case 0:
                ((xq3) obj2).f68535c.removeCallbacks((Runnable) obj);
                break;
            default:
                MulticastFileObserver.Companion.observe$lambda$1((String) obj2, (vi3) obj);
                break;
        }
    }
}
