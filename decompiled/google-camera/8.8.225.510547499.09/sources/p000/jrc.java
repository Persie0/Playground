package p000;

import android.os.Binder;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jrc extends jtb {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ jrd f34631a;

    /* JADX INFO: renamed from: b */
    private volatile int f34632b = -1;

    public jrc(jrd jrdVar) {
        this.f34631a = jrdVar;
    }

    /* JADX INFO: renamed from: m */
    private final boolean m13480m(Runnable runnable) {
        int callingUid = Binder.getCallingUid();
        if (callingUid != this.f34632b) {
            if ((!juh.m13505a(this.f34631a).m13509b() || !jiy.m13276c(this.f34631a, callingUid, "com.google.android.wearable.app.cn")) && !jiy.m13275b(this.f34631a, callingUid)) {
                Log.e("WearableLS", "Caller is not GooglePlayServices; caller UID: " + callingUid);
                return false;
            }
            this.f34632b = callingUid;
        }
        synchronized (this.f34631a.f34635c) {
            jrd jrdVar = this.f34631a;
            if (jrdVar.f34636d) {
                return false;
            }
            jrdVar.f34633a.post(runnable);
            return true;
        }
    }

    @Override // p000.jtc
    /* JADX INFO: renamed from: b */
    public final void mo13481b(jrs jrsVar) {
        m13480m(new jpm(this, jrsVar, 4));
    }

    @Override // p000.jtc
    /* JADX INFO: renamed from: c */
    public final void mo13482c(DataHolder dataHolder) {
        ith ithVar = new ith(dataHolder, 20);
        try {
            String.valueOf(dataHolder);
            int i = dataHolder.f7633h;
            if (m13480m(ithVar)) {
                return;
            }
            dataHolder.close();
        } catch (Throwable th) {
            dataHolder.close();
            throw th;
        }
    }

    @Override // p000.jtc
    /* JADX INFO: renamed from: d */
    public final void mo13483d(jtk jtkVar) {
        m13480m(new jpm(this, jtkVar, 3));
    }

    @Override // p000.jtc
    /* JADX INFO: renamed from: e */
    public final void mo13484e(jtm jtmVar) {
        ith ithVar = new ith(jtmVar, 19);
        int i = jtmVar.f34782b.f7633h;
        if (m13480m(ithVar)) {
            return;
        }
        jtmVar.f34782b.close();
    }

    @Override // p000.jtc
    /* JADX INFO: renamed from: f */
    public final void mo13485f(jtk jtkVar, jsx jsxVar) {
        m13480m(new jpm(jtkVar, jsxVar, 2));
    }

    @Override // p000.jtc
    /* JADX INFO: renamed from: g */
    public final void mo13486g() {
        m13480m(new hde(18));
    }

    @Override // p000.jtc
    /* JADX INFO: renamed from: h */
    public final void mo13487h() {
        m13480m(new hde(17));
    }

    @Override // p000.jtc
    /* JADX INFO: renamed from: i */
    public final void mo13488i() {
        m13480m(new hde(20));
    }

    @Override // p000.jtc
    /* JADX INFO: renamed from: j */
    public final void mo13489j() {
        m13480m(new hde(19));
    }

    @Override // p000.jtc
    /* JADX INFO: renamed from: k */
    public final void mo13490k() {
        m13480m(new hde(15));
    }

    @Override // p000.jtc
    /* JADX INFO: renamed from: l */
    public final void mo13491l() {
        m13480m(new hde(16));
    }
}
