package p000;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class wvb implements rbd, js6, yr6, sr6 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67396a;

    /* JADX INFO: renamed from: b */
    public final Executor f67397b;

    /* JADX INFO: renamed from: c */
    public final bm1 f67398c;

    /* JADX INFO: renamed from: d */
    public final tld f67399d;

    public /* synthetic */ wvb(Executor executor, bm1 bm1Var, tld tldVar, int i) {
        this.f67396a = i;
        this.f67397b = executor;
        this.f67398c = bm1Var;
        this.f67399d = tldVar;
    }

    @Override // p000.rbd
    /* JADX INFO: renamed from: a */
    public final void mo318a(Task task) {
        switch (this.f67396a) {
            case 0:
                this.f67397b.execute(new u62(4, this, task));
                break;
            default:
                this.f67397b.execute(new u62(5, this, task));
                break;
        }
    }

    @Override // p000.sr6
    /* JADX INFO: renamed from: b */
    public void mo319b() {
        this.f67399d.m22204s();
    }

    @Override // p000.js6
    /* JADX INFO: renamed from: g */
    public void mo320g(Object obj) {
        this.f67399d.m22201p(obj);
    }

    @Override // p000.yr6
    /* JADX INFO: renamed from: m */
    public void mo321m(Exception exc) {
        this.f67399d.m22203r(exc);
    }
}
