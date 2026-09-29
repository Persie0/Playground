package p000;

import com.amplitude.android.C0879a;
import com.amplitude.android.C0882d;
import com.amplitude.core.diagnostics.C0905a;
import com.amplitude.core.platform.C0907a;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: df */
/* JADX INFO: loaded from: classes.dex */
public final class C2926df extends Thread {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35534a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f35535b;

    public /* synthetic */ C2926df(Object obj, int i) {
        this.f35534a = i;
        this.f35535b = obj;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int i = this.f35534a;
        Object obj = this.f35535b;
        switch (i) {
            case 0:
                C0882d c0882d = ((C0879a) obj).f11022g;
                c0882d.getClass();
                c0882d.f10816d.mo4537a(null);
                break;
            case 1:
                C0905a c0905a = (C0905a) ((WeakReference) obj).get();
                if (c0905a != null) {
                    c0905a.f11068r.mo15331i(null);
                    c0905a.f11060j.f11076g.mo15331i(null);
                }
                break;
            default:
                C0907a c0907a = (C0907a) obj;
                c0907a.f11102h.mo4537a(null);
                c0907a.f11101g.mo4537a(null);
                c0907a.f11103i = false;
                break;
        }
    }
}
