package p000;

import android.app.Activity;
import android.app.Fragment;
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
/* JADX INFO: loaded from: classes.dex */
public final class jfu extends Fragment implements jft {

    /* JADX INFO: renamed from: a */
    public static final WeakHashMap f33915a = new WeakHashMap();

    /* JADX INFO: renamed from: c */
    public Bundle f33917c;

    /* JADX INFO: renamed from: d */
    private final Map f33918d = DesugarCollections.synchronizedMap(new C1109wy());

    /* JADX INFO: renamed from: b */
    public int f33916b = 0;

    @Override // p000.jft
    /* JADX INFO: renamed from: a */
    public final Activity mo13117a() {
        return getActivity();
    }

    @Override // p000.jft
    /* JADX INFO: renamed from: b */
    public final void mo13118b(LifecycleCallback lifecycleCallback) {
        if (this.f33918d.containsKey("ConnectionlessLifecycleHelper")) {
            throw new IllegalArgumentException("LifecycleCallback with tag ConnectionlessLifecycleHelper already added to this fragment.");
        }
        this.f33918d.put("ConnectionlessLifecycleHelper", lifecycleCallback);
        if (this.f33916b > 0) {
            new jmx(Looper.getMainLooper()).post(new gxn(this, lifecycleCallback, 19));
        }
    }

    @Override // p000.jft
    /* JADX INFO: renamed from: c */
    public final LifecycleCallback mo13119c(Class cls) {
        return (LifecycleCallback) cls.cast(this.f33918d.get("ConnectionlessLifecycleHelper"));
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.f33918d.values()) {
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator it = this.f33918d.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo4653c(i, i2, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f33916b = 1;
        this.f33917c = bundle;
        for (Map.Entry entry : this.f33918d.entrySet()) {
            ((LifecycleCallback) entry.getValue()).mo4654d(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f33916b = 5;
        for (LifecycleCallback lifecycleCallback : this.f33918d.values()) {
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f33916b = 3;
        Iterator it = this.f33918d.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo4656h();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f33918d.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).mo4655g(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f33916b = 2;
        Iterator it = this.f33918d.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo4657i();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f33916b = 4;
        Iterator it = this.f33918d.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).mo4658j();
        }
    }
}
