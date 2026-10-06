package p000;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bgo implements Callable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Context f3188a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ int f3189b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ Object f3190c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ Object f3191d;

    /* JADX INFO: renamed from: e */
    private final /* synthetic */ int f3192e;

    public bgo(String str, Context context, adt adtVar, int i, int i2) {
        this.f3192e = i2;
        this.f3190c = str;
        this.f3188a = context;
        this.f3191d = adtVar;
        this.f3189b = i;
    }

    public bgo(WeakReference weakReference, Context context, int i, String str, int i2) {
        this.f3192e = i2;
        this.f3190c = weakReference;
        this.f3188a = context;
        this.f3189b = i;
        this.f3191d = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        switch (this.f3192e) {
            case 0:
                Context context = (Context) ((WeakReference) this.f3190c).get();
                if (context == null) {
                    context = this.f3188a;
                }
                return bgp.m2423d(context, this.f3189b, (String) this.f3191d);
            default:
                Object obj = this.f3190c;
                return adw.m311b((String) obj, this.f3188a, (adt) this.f3191d, this.f3189b);
        }
    }
}
