package p152hb;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.media.C0141b;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import p326q.C8446b;
import p455wb.HandlerC9898d;

/* JADX INFO: renamed from: hb.d2 */
/* JADX INFO: loaded from: classes.dex */
public final class C5964d2 extends Fragment implements InterfaceC5968f {

    /* JADX INFO: renamed from: y0 */
    public static final WeakHashMap f35458y0 = new WeakHashMap();

    /* JADX INFO: renamed from: v0 */
    public final Map f35459v0 = Collections.synchronizedMap(new C8446b());

    /* JADX INFO: renamed from: w0 */
    public int f35460w0 = 0;

    /* JADX INFO: renamed from: x0 */
    public Bundle f35461x0;

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: D */
    public final void mo3559D(int i10, int i11, Intent intent) {
        super.mo3559D(i10, i11, intent);
        Iterator it = this.f35459v0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo7574d(i10, i11, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: H */
    public final void mo3560H(Bundle bundle) {
        super.mo3560H(bundle);
        this.f35460w0 = 1;
        this.f35461x0 = bundle;
        for (Map.Entry entry : this.f35459v0.entrySet()) {
            ((LifecycleCallback) entry.getValue()).mo7575e(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: J */
    public final void mo3562J() {
        this.f6090a0 = true;
        this.f35460w0 = 5;
        Iterator it = this.f35459v0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).getClass();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: Q */
    public final void mo3568Q() {
        this.f6090a0 = true;
        this.f35460w0 = 3;
        Iterator it = this.f35459v0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo7576f();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: R */
    public final void mo3569R(Bundle bundle) {
        for (Map.Entry entry : this.f35459v0.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).mo7577g(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: S */
    public final void mo3570S() {
        this.f6090a0 = true;
        this.f35460w0 = 2;
        Iterator it = this.f35459v0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo7578h();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: T */
    public final void mo3571T() {
        this.f6090a0 = true;
        this.f35460w0 = 4;
        Iterator it = this.f35459v0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo7579i();
        }
    }

    @Override // p152hb.InterfaceC5968f
    /* JADX INFO: renamed from: a */
    public final void mo12394a(String str, LifecycleCallback lifecycleCallback) {
        Map map = this.f35459v0;
        if (map.containsKey(str)) {
            throw new IllegalArgumentException(C0141b.m611g("LifecycleCallback with tag ", str, " already added to this fragment."));
        }
        map.put(str, lifecycleCallback);
        if (this.f35460w0 > 0) {
            new HandlerC9898d(Looper.getMainLooper()).post(new RunnableC5960c2(this, lifecycleCallback, str, 0));
        }
    }

    @Override // p152hb.InterfaceC5968f
    /* JADX INFO: renamed from: c */
    public final LifecycleCallback mo12395c(Class cls, String str) {
        return (LifecycleCallback) cls.cast(this.f35459v0.get(str));
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: g */
    public final void mo3586g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo3586g(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f35459v0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo7572a(str, fileDescriptor, printWriter, strArr);
        }
    }
}
