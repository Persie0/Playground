package p179ig;

import android.content.Context;
import android.content.SharedPreferences;
import com.kochava.core.storage.queue.internal.StorageQueueChangedAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p243lg.C7360b;
import p243lg.InterfaceC7361c;
import p349qo.C8656b;

/* JADX INFO: renamed from: ig.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6326a {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f36555a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC7361c f36556b;

    /* JADX INFO: renamed from: c */
    public final int f36557c;

    /* JADX INFO: renamed from: d */
    public final List<InterfaceC6327b> f36558d = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: ig.a$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f36559a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ StorageQueueChangedAction f36560b;

        public a(C6326a c6326a, ArrayList arrayList, StorageQueueChangedAction storageQueueChangedAction) {
            this.f36559a = arrayList;
            this.f36560b = storageQueueChangedAction;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator it = this.f36559a.iterator();
            while (it.hasNext()) {
                ((InterfaceC6327b) it.next()).mo10961a(this.f36560b);
            }
        }
    }

    /* JADX INFO: renamed from: ig.a$b */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f36561a;

        static {
            int[] iArr = new int[StorageQueueChangedAction.values().length];
            f36561a = iArr;
            try {
                iArr[StorageQueueChangedAction.Add.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36561a[StorageQueueChangedAction.Update.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36561a[StorageQueueChangedAction.UpdateAll.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36561a[StorageQueueChangedAction.Remove.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36561a[StorageQueueChangedAction.RemoveAll.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public C6326a(Context context, InterfaceC7361c interfaceC7361c, String str, int i10) {
        this.f36555a = context.getSharedPreferences(str, 0);
        this.f36556b = interfaceC7361c;
        this.f36557c = i10;
        m12950b();
    }

    /* JADX INFO: renamed from: a */
    public final void m12949a(StorageQueueChangedAction storageQueueChangedAction) {
        int i10 = b.f36561a[storageQueueChangedAction.ordinal()];
        SharedPreferences sharedPreferences = this.f36555a;
        if (i10 == 1) {
            sharedPreferences.edit().putLong("last_add_time_millis", System.currentTimeMillis()).apply();
        } else if (i10 == 2 || i10 == 3) {
            sharedPreferences.edit().putLong("last_update_time_millis", System.currentTimeMillis()).apply();
        } else if (i10 == 4 || i10 == 5) {
            sharedPreferences.edit().putLong("last_remove_time_millis", System.currentTimeMillis()).apply();
        }
        ArrayList arrayListM16896W = C8656b.m16896W(this.f36558d);
        if (arrayListM16896W.isEmpty()) {
            return;
        }
        ((C7360b) this.f36556b).m14769f(new a(this, arrayListM16896W, storageQueueChangedAction));
    }

    /* JADX INFO: renamed from: b */
    public final void m12950b() {
        int iM12953e = m12953e();
        SharedPreferences sharedPreferences = this.f36555a;
        if (iM12953e <= 0) {
            sharedPreferences.edit().remove("write_index").remove("read_index").apply();
        }
        if (sharedPreferences.getLong("write_index", -1L) == -1) {
            sharedPreferences.edit().putLong("write_index", 0L).apply();
        }
        if (sharedPreferences.getLong("read_index", -1L) == -1) {
            sharedPreferences.edit().putLong("read_index", 0L).apply();
        }
        if (sharedPreferences.getLong("last_add_time_millis", -1L) == -1) {
            sharedPreferences.edit().putLong("last_add_time_millis", 0L).apply();
        }
        if (sharedPreferences.getLong("last_update_time_millis", -1L) == -1) {
            sharedPreferences.edit().putLong("last_update_time_millis", 0L).apply();
        }
        if (sharedPreferences.getLong("last_remove_time_millis", -1L) == -1) {
            sharedPreferences.edit().putLong("last_remove_time_millis", 0L).apply();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public final synchronized boolean m12951c(String str) {
        boolean z10;
        synchronized (this) {
            try {
                if (this.f36557c <= 0) {
                    z10 = false;
                } else {
                    z10 = m12953e() >= this.f36557c;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            return false;
        }
        SharedPreferences sharedPreferences = this.f36555a;
        long j10 = sharedPreferences.getLong("write_index", 0L);
        sharedPreferences.edit().putString(Long.toString(j10), str).putLong("write_index", j10 + 1).apply();
        m12949a(StorageQueueChangedAction.Add);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m12952d() {
        if (m12953e() <= 0) {
            return false;
        }
        SharedPreferences sharedPreferences = this.f36555a;
        long j10 = sharedPreferences.getLong("read_index", 0L);
        if (!sharedPreferences.contains(Long.toString(j10))) {
            return false;
        }
        sharedPreferences.edit().remove(Long.toString(j10)).putLong("read_index", j10 + 1).apply();
        if (m12953e() > 0) {
            return true;
        }
        m12950b();
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public final synchronized int m12953e() {
        return Math.max(0, this.f36555a.getAll().size() - 5);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public final synchronized void m12954f(String str) {
        try {
            if (m12953e() <= 0) {
                return;
            }
            long j10 = this.f36555a.getLong("read_index", 0L);
            if (this.f36555a.contains(Long.toString(j10))) {
                this.f36555a.edit().putString(Long.toString(j10), str).apply();
                m12949a(StorageQueueChangedAction.Update);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
