package p000;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class bg3 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8496a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f8497b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ArrayList f8498c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ArrayList f8499d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ArrayList f8500e;

    public bg3(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f8496a = i;
        this.f8497b = arrayList;
        this.f8498c = arrayList2;
        this.f8499d = arrayList3;
        this.f8500e = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i = 0; i < this.f8496a; i++) {
            View view = (View) this.f8497b.get(i);
            String str = (String) this.f8498c.get(i);
            WeakHashMap weakHashMap = dta.f36217a;
            view.setTransitionName(str);
            ((View) this.f8499d.get(i)).setTransitionName((String) this.f8500e.get(i));
        }
    }
}
