package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.common.util.concurrent.AbstractC1118h;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class dvc extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicBoolean f36278a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f36279b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ f09 f36280c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ jh9 f36281d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Executor f36282e;

    public dvc(AtomicBoolean atomicBoolean, Context context, f09 f09Var, jh9 jh9Var, Executor executor) {
        this.f36278a = atomicBoolean;
        this.f36279b = context;
        this.f36280c = f09Var;
        this.f36281d = jh9Var;
        this.f36282e = executor;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f36278a.compareAndSet(false, true)) {
            try {
                this.f36279b.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                Log.w("DirectBootUtils", "Failed to unregister receiver", e);
            }
            this.f36280c.m6387o(AbstractC1118h.m6401e(this.f36281d, this.f36282e));
        }
    }
}
