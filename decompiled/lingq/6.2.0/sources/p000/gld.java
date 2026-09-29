package p000;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.R$dimen;
import androidx.recyclerview.R$id;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.play_billing.AbstractC0985a;
import com.google.android.gms.internal.play_billing.zzjd;
import com.google.common.util.concurrent.AbstractC1118h;
import com.google.common.util.concurrent.AbstractC1120j;
import com.google.common.util.concurrent.ListenableFuture;
import com.lingq.feature.dictionary.C2064h;
import com.lingq.feature.dictionary.C2065i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class gld implements InterfaceC3016fw {

    /* JADX INFO: renamed from: e */
    public static gld f40981e;

    /* JADX INFO: renamed from: f */
    public static final wa4 f40982f = new wa4(0);

    /* JADX INFO: renamed from: g */
    public static final wa4 f40983g = new wa4(1);

    /* JADX INFO: renamed from: a */
    public int f40984a;

    /* JADX INFO: renamed from: b */
    public final Object f40985b;

    /* JADX INFO: renamed from: c */
    public final Object f40986c;

    /* JADX INFO: renamed from: d */
    public Object f40987d;

    public gld(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f40987d = new b9d(this);
        this.f40984a = 1;
        this.f40986c = scheduledExecutorService;
        this.f40985b = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: b */
    public static int m12736b(int i, int i2) {
        int i3;
        int i4 = i & 3158064;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 >> 2;
        } else {
            int i6 = i4 >> 1;
            i5 |= (-3158065) & i6;
            i3 = (i6 & 3158064) >> 2;
        }
        return i5 | i3;
    }

    /* JADX INFO: renamed from: c */
    public static int m12737c(int i, int i2) {
        int i3;
        int i4 = i & 789516;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 << 2;
        } else {
            int i6 = i4 << 1;
            i5 |= (-789517) & i6;
            i3 = (i6 & 789516) << 2;
        }
        return i5 | i3;
    }

    /* JADX INFO: renamed from: f */
    public static void m12738f(RecyclerView recyclerView, o38 o38Var, float f, float f2, boolean z) {
        View view = o38Var.f53781a;
        if (z && view.getTag(R$id.item_touch_helper_previous_elevation) == null) {
            WeakHashMap weakHashMap = dta.f36217a;
            Float fValueOf = Float.valueOf(view.getElevation());
            int childCount = recyclerView.getChildCount();
            float f3 = 0.0f;
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (childAt != view) {
                    WeakHashMap weakHashMap2 = dta.f36217a;
                    float elevation = childAt.getElevation();
                    if (elevation > f3) {
                        f3 = elevation;
                    }
                }
            }
            view.setElevation(f3 + 1.0f);
            view.setTag(R$id.item_touch_helper_previous_elevation, fValueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    /* JADX INFO: renamed from: h */
    public static synchronized gld m12739h(Context context) {
        try {
            if (f40981e == null) {
                f40981e = new gld(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new o76("MessengerIpcClient"))));
            }
        } catch (Throwable th) {
            throw th;
        }
        return f40981e;
    }

    /* JADX INFO: renamed from: a */
    public void m12740a(RecyclerView recyclerView, o38 o38Var) {
        recyclerView.getClass();
        o38Var.getClass();
        View view = o38Var.f53781a;
        Object tag = view.getTag(R$id.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            float fFloatValue = ((Float) tag).floatValue();
            WeakHashMap weakHashMap = dta.f36217a;
            view.setElevation(fFloatValue);
        }
        view.setTag(R$id.item_touch_helper_previous_elevation, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        ((C2065i) this.f40987d).invoke(Integer.valueOf(o38Var.m17783c()));
    }

    @Override // p000.InterfaceC3016fw
    public ListenableFuture call() {
        ubd ubdVar = (ubd) this.f40985b;
        bhb bhbVar = (bhb) this.f40986c;
        int i = this.f40984a;
        ArrayList arrayList = (ArrayList) this.f40987d;
        ListenableFuture listenableFutureM6399c = AbstractC1118h.m6399c(bhbVar);
        for (int i2 = 0; i2 < i; i2++) {
            if (((Boolean) AbstractC1118h.m6398b((Future) arrayList.get(i2))).booleanValue()) {
                if (((List) ubdVar.f63687b).get(i2) != null) {
                    ho2.m13383c();
                    return null;
                }
                akd akdVar = new akd(0);
                int i3 = jmd.f45851a;
                listenableFutureM6399c = AbstractC1118h.m6403g(listenableFutureM6399c, new ubd(3, qld.m20020a(), akdVar), AbstractC1120j.m6404a());
            }
        }
        return listenableFutureM6399c;
    }

    /* JADX INFO: renamed from: d */
    public int m12741d(RecyclerView recyclerView, o38 o38Var) {
        recyclerView.getClass();
        o38Var.getClass();
        return ((HashSet) this.f40986c).contains(Integer.valueOf(o38Var.f53786f)) ? 0 : 3342387;
    }

    /* JADX INFO: renamed from: e */
    public int m12742e(RecyclerView recyclerView, int i, int i2, long j) {
        if (this.f40984a == -1) {
            this.f40984a = recyclerView.getResources().getDimensionPixelSize(R$dimen.item_touch_helper_max_drag_scroll_per_frame);
        }
        int interpolation = (int) (f40982f.getInterpolation(j <= 2000 ? j / 2000.0f : 1.0f) * ((int) (f40983g.getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)) * ((int) Math.signum(i2)) * this.f40984a)));
        if (interpolation == 0) {
            return i2 > 0 ? 1 : -1;
        }
        return interpolation;
    }

    /* JADX INFO: renamed from: g */
    public void m12743g(Throwable th) {
        boolean z = th instanceof TimeoutException;
        hvb hvbVar = (hvb) this.f40987d;
        if (z) {
            hvbVar.m13510H(zzjd.BILLING_OVERRIDE_SERVICE_CALL_TIMEOUT, 28, wwb.f67453r);
            AbstractC0985a.m5509j("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th);
        } else {
            hvbVar.m13510H(zzjd.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION, 28, wwb.f67453r);
            AbstractC0985a.m5509j("BillingClientTesting", "An error occurred while retrieving billing override.", th);
        }
        ((Runnable) this.f40986c).run();
    }

    /* JADX INFO: renamed from: i */
    public tld m12744i(int i, Bundle bundle) {
        int i2;
        synchronized (this) {
            i2 = this.f40984a;
            this.f40984a = i2 + 1;
        }
        return m12746k(new ged(i2, i, bundle, 0));
    }

    /* JADX INFO: renamed from: j */
    public tld m12745j(int i, Bundle bundle) {
        int i2;
        synchronized (this) {
            i2 = this.f40984a;
            this.f40984a = i2 + 1;
        }
        return m12746k(new ged(i2, i, bundle, 1));
    }

    /* JADX INFO: renamed from: k */
    public synchronized tld m12746k(ged gedVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(gedVar.toString()));
            }
            if (!((b9d) this.f40987d).m3496d(gedVar)) {
                b9d b9dVar = new b9d(this);
                this.f40987d = b9dVar;
                b9dVar.m3496d(gedVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return gedVar.f40689b.f67208a;
    }

    public /* synthetic */ gld(ubd ubdVar, bhb bhbVar, int i, ArrayList arrayList) {
        this.f40985b = ubdVar;
        this.f40986c = bhbVar;
        this.f40984a = i;
        this.f40987d = arrayList;
    }

    public gld(hvb hvbVar, int i, lk1 lk1Var, Runnable runnable) {
        this.f40984a = i;
        this.f40985b = lk1Var;
        this.f40986c = runnable;
        this.f40987d = hvbVar;
    }

    public gld(C2064h c2064h, HashSet hashSet, C2065i c2065i) {
        c2064h.getClass();
        this.f40984a = -1;
        this.f40985b = c2064h;
        this.f40986c = hashSet;
        this.f40987d = c2065i;
    }
}
