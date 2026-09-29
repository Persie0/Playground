package p152hb;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.media.C0141b;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import p326q.C8446b;
import p455wb.HandlerC9898d;

/* JADX INFO: renamed from: hb.b2 */
/* JADX INFO: loaded from: classes.dex */
public final class FragmentC5956b2 extends Fragment implements InterfaceC5968f {

    /* JADX INFO: renamed from: d */
    public static final WeakHashMap f35423d = new WeakHashMap();

    /* JADX INFO: renamed from: a */
    public final Map f35424a = Collections.synchronizedMap(new C8446b());

    /* JADX INFO: renamed from: b */
    public int f35425b = 0;

    /* JADX INFO: renamed from: c */
    public Bundle f35426c;

    @Override // p152hb.InterfaceC5968f
    /* JADX INFO: renamed from: a */
    public final void mo12394a(String str, LifecycleCallback lifecycleCallback) {
        Map map = this.f35424a;
        if (map.containsKey(str)) {
            throw new IllegalArgumentException(C0141b.m611g("LifecycleCallback with tag ", str, " already added to this fragment."));
        }
        map.put(str, lifecycleCallback);
        if (this.f35425b > 0) {
            new HandlerC9898d(Looper.getMainLooper()).post(new RunnableC5952a2(0, this, lifecycleCallback, str));
        }
    }

    @Override // p152hb.InterfaceC5968f
    /* JADX INFO: renamed from: c */
    public final LifecycleCallback mo12395c(Class cls, String str) {
        return (LifecycleCallback) cls.cast(this.f35424a.get(str));
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f35424a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo7572a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // p152hb.InterfaceC5968f
    /* JADX INFO: renamed from: e */
    public final Activity mo12396e() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        Iterator it = this.f35424a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo7574d(i10, i11, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f35425b = 1;
        this.f35426c = bundle;
        for (Map.Entry entry : this.f35424a.entrySet()) {
            ((LifecycleCallback) entry.getValue()).mo7575e(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f35425b = 5;
        Iterator it = this.f35424a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f35425b = 3;
        Iterator it = this.f35424a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo7576f();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f35424a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).mo7577g(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f35425b = 2;
        Iterator it = this.f35424a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo7578h();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f35425b = 4;
        Iterator it = this.f35424a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo7579i();
        }
    }
}
