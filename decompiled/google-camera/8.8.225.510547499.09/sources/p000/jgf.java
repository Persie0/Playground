package p000;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import p021j$.util.DesugarCollections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jgf extends ComponentCallbacksC0077bw implements jft {

    /* JADX INFO: renamed from: a */
    public static final WeakHashMap f33952a = new WeakHashMap();

    /* JADX INFO: renamed from: c */
    public Bundle f33954c;

    /* JADX INFO: renamed from: d */
    private final Map f33955d = DesugarCollections.synchronizedMap(new C1109wy());

    /* JADX INFO: renamed from: b */
    public int f33953b = 0;

    @Override // p000.jft
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Activity mo13117a() {
        return getActivity();
    }

    @Override // p000.jft
    /* JADX INFO: renamed from: b */
    public final void mo13118b(LifecycleCallback lifecycleCallback) {
        if (this.f33955d.containsKey("ConnectionlessLifecycleHelper")) {
            throw new IllegalArgumentException("LifecycleCallback with tag ConnectionlessLifecycleHelper already added to this fragment.");
        }
        this.f33955d.put("ConnectionlessLifecycleHelper", lifecycleCallback);
        if (this.f33953b > 0) {
            new jmx(Looper.getMainLooper()).post(new gxn(this, lifecycleCallback, 20));
        }
    }

    @Override // p000.jft
    /* JADX INFO: renamed from: c */
    public final LifecycleCallback mo13119c(Class cls) {
        return (LifecycleCallback) cls.cast(this.f33955d.get("ConnectionlessLifecycleHelper"));
    }

    @Override // p000.ComponentCallbacksC0077bw
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.f33955d.values()) {
        }
    }

    @Override // p000.ComponentCallbacksC0077bw
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator it = this.f33955d.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo4653c(i, i2, intent);
        }
    }

    @Override // p000.ComponentCallbacksC0077bw
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f33953b = 1;
        this.f33954c = bundle;
        for (Map.Entry entry : this.f33955d.entrySet()) {
            ((LifecycleCallback) entry.getValue()).mo4654d(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // p000.ComponentCallbacksC0077bw
    public final void onDestroy() {
        super.onDestroy();
        this.f33953b = 5;
        for (LifecycleCallback lifecycleCallback : this.f33955d.values()) {
        }
    }

    @Override // p000.ComponentCallbacksC0077bw
    public final void onResume() {
        super.onResume();
        this.f33953b = 3;
        Iterator it = this.f33955d.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo4656h();
        }
    }

    @Override // p000.ComponentCallbacksC0077bw
    public final void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f33955d.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).mo4655g(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // p000.ComponentCallbacksC0077bw
    public final void onStart() {
        super.onStart();
        this.f33953b = 2;
        Iterator it = this.f33955d.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo4657i();
        }
    }

    @Override // p000.ComponentCallbacksC0077bw
    public final void onStop() {
        super.onStop();
        this.f33953b = 4;
        Iterator it = this.f33955d.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo4658j();
        }
    }
}
