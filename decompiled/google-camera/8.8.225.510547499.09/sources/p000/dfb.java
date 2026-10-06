package p000;

import android.graphics.RectF;
import com.pairip.VMRunner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p021j$.util.Collection$EL;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dfb implements hrv, dfl {

    /* JADX INFO: renamed from: a */
    public dfa f10758a;

    /* JADX INFO: renamed from: b */
    private final AtomicBoolean f10759b;

    /* JADX INFO: renamed from: c */
    private final AtomicBoolean f10760c;

    /* JADX INFO: renamed from: d */
    private final List f10761d;

    public dfb(dhv dhvVar) {
        new jwf(new RectF());
        this.f10759b = new AtomicBoolean(true);
        this.f10760c = new AtomicBoolean(false);
        this.f10761d = new ArrayList();
        String[] strArr = dig.f11487a;
        dhvVar.mo6177e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public final dfa m6046e() {
        dfa dfaVar = this.f10758a;
        dfaVar.getClass();
        return dfaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final synchronized void m6047f(List list) {
        this.f10761d.clear();
        this.f10761d.addAll((Collection) Collection$EL.stream(list).filter(cdy.f5379h).collect(muc.f41626a));
    }

    /* JADX INFO: renamed from: a */
    public void m6048a(List list) {
        VMRunner.invoke("z2pv937GkpF28Fcr", new Object[]{this, list});
    }

    @Override // p000.hrv
    /* JADX INFO: renamed from: b */
    public final void mo3448b() {
        this.f10759b.set(true);
    }

    @Override // p000.hrv
    /* JADX INFO: renamed from: c */
    public final void mo3449c(hrw hrwVar) {
        this.f10759b.set(false);
        this.f10760c.set(false);
        synchronized (this) {
        }
    }

    @Override // p000.dfl
    /* JADX INFO: renamed from: d */
    public final void mo6049d() {
        jvd.m13538a();
    }
}
