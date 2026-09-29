package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: renamed from: androidx.fragment.app.r0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0975r0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6395a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f6396b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ArrayList f6397c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ArrayList f6398d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ArrayList f6399e;

    public RunnableC0975r0(int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f6395a = i10;
        this.f6396b = arrayList;
        this.f6397c = arrayList2;
        this.f6398d = arrayList3;
        this.f6399e = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i10 = 0; i10 < this.f6395a; i10++) {
            View view = (View) this.f6396b.get(i10);
            String str = (String) this.f6397c.get(i10);
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            C10029b0.i.m18728v(view, str);
            C10029b0.i.m18728v((View) this.f6398d.get(i10), (String) this.f6399e.get(i10));
        }
    }
}
