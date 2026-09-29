package p000;

import android.content.Context;
import android.content.SharedPreferences;
import com.kochava.core.storage.queue.internal.StorageQueueChangedAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o67 {

    /* JADX INFO: renamed from: a */
    public final sg3 f53897a;

    /* JADX INFO: renamed from: b */
    public final List f53898b = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: c */
    public boolean f53899c = false;

    public o67(Context context, ny8 ny8Var, String str) {
        this.f53897a = new sg3(context, ny8Var, str, Math.max(1, 100));
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m17821a(l67 l67Var) {
        sg3 sg3Var = this.f53897a;
        String string = l67Var.m15905h().toString();
        synchronized (sg3Var) {
            if (!sg3Var.m21356h()) {
                sg3Var.m21351c(string);
                sg3Var.m21350b(StorageQueueChangedAction.Add);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m17822b(p67 p67Var) {
        this.f53898b.remove(p67Var);
        this.f53898b.add(p67Var);
        if (!this.f53899c) {
            List list = (List) this.f53897a.f60819e;
            list.remove(this);
            list.add(this);
            this.f53899c = true;
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized long m17823c() {
        long j;
        sg3 sg3Var = this.f53897a;
        synchronized (sg3Var) {
            j = ((SharedPreferences) sg3Var.f60817c).getLong("last_remove_time_millis", 0L);
        }
        return j;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized int m17824d() {
        return this.f53897a.m21357i();
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m17825e() {
        sg3 sg3Var = this.f53897a;
        synchronized (sg3Var) {
            sg3Var.m21352d();
            sg3Var.m21350b(StorageQueueChangedAction.Remove);
        }
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m17826f() {
        sg3 sg3Var = this.f53897a;
        synchronized (sg3Var) {
            while (sg3Var.m21357i() > 0 && sg3Var.m21352d()) {
                try {
                } catch (Throwable th) {
                    throw th;
                }
            }
            sg3Var.m21350b(StorageQueueChangedAction.RemoveAll);
        }
    }
}
