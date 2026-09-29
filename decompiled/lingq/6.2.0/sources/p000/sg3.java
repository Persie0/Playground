package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import com.kochava.core.storage.queue.internal.StorageQueueChangedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.sequences.AbstractC3204c;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class sg3 {

    /* JADX INFO: renamed from: f */
    public static HandlerThread f60813f;

    /* JADX INFO: renamed from: g */
    public static Handler f60814g;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60815a;

    /* JADX INFO: renamed from: b */
    public int f60816b;

    /* JADX INFO: renamed from: c */
    public Object f60817c;

    /* JADX INFO: renamed from: d */
    public Object f60818d;

    /* JADX INFO: renamed from: e */
    public Object f60819e;

    public sg3(Bundle bundle) {
        this.f60815a = 2;
        bundle.getClass();
        String string = bundle.getString("nav-entry-state:id");
        if (string == null) {
            syc.m21782a("nav-entry-state:id");
            throw null;
        }
        this.f60817c = string;
        this.f60816b = te1.m22007u("nav-entry-state:destination-id", bundle);
        Bundle bundle2 = bundle.getBundle("nav-entry-state:args");
        if (bundle2 == null) {
            syc.m21782a("nav-entry-state:args");
            throw null;
        }
        this.f60818d = bundle2;
        Bundle bundle3 = bundle.getBundle("nav-entry-state:saved-state");
        if (bundle3 != null) {
            this.f60819e = bundle3;
        } else {
            syc.m21782a("nav-entry-state:saved-state");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m21349a() {
        SharedPreferences sharedPreferences = (SharedPreferences) this.f60817c;
        if (m21357i() <= 0) {
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

    /* JADX INFO: renamed from: b */
    public void m21350b(StorageQueueChangedAction storageQueueChangedAction) {
        SharedPreferences sharedPreferences = (SharedPreferences) this.f60817c;
        int i = ej9.f37365a[storageQueueChangedAction.ordinal()];
        if (i == 1) {
            sharedPreferences.edit().putLong("last_add_time_millis", System.currentTimeMillis()).apply();
        } else if (i == 2 || i == 3) {
            sharedPreferences.edit().putLong("last_update_time_millis", System.currentTimeMillis()).apply();
        } else if (i == 4 || i == 5) {
            sharedPreferences.edit().putLong("last_remove_time_millis", System.currentTimeMillis()).apply();
        }
        ArrayList arrayListM3224U = b34.m3224U((List) this.f60819e);
        if (arrayListM3224U.isEmpty()) {
            return;
        }
        ((ny8) this.f60818d).m17684L(new mv5(this, arrayListM3224U, storageQueueChangedAction));
    }

    /* JADX INFO: renamed from: c */
    public void m21351c(String str) {
        SharedPreferences sharedPreferences = (SharedPreferences) this.f60817c;
        long j = sharedPreferences.getLong("write_index", 0L);
        sharedPreferences.edit().putString(Long.toString(j), str).putLong("write_index", j + 1).apply();
    }

    /* JADX INFO: renamed from: d */
    public boolean m21352d() {
        SharedPreferences sharedPreferences = (SharedPreferences) this.f60817c;
        if (m21357i() <= 0) {
            return false;
        }
        long j = sharedPreferences.getLong("read_index", 0L);
        if (!sharedPreferences.contains(Long.toString(j))) {
            return false;
        }
        sharedPreferences.edit().remove(Long.toString(j)).putLong("read_index", j + 1).apply();
        if (m21357i() > 0) {
            return true;
        }
        m21349a();
        return true;
    }

    /* JADX INFO: renamed from: e */
    public r86 m21353e(int i, r86 r86Var, r86 r86Var2, boolean z) {
        u86 u86Var = (u86) this.f60817c;
        pe9 pe9Var = (pe9) this.f60818d;
        r86 r86VarM21353e = (r86) pe9Var.m19078b(i);
        if (r86Var2 != null) {
            if (fa4.m11650l(r86VarM21353e, r86Var2) && fa4.m11650l(r86VarM21353e.f58882c, r86Var2.f58882c)) {
                return r86VarM21353e;
            }
            r86VarM21353e = null;
        } else if (r86VarM21353e != null) {
            return r86VarM21353e;
        }
        if (z) {
            Iterator it = ((aj1) AbstractC3204c.m15413i0(new C3705w0(pe9Var, 3))).iterator();
            do {
                if (!it.hasNext()) {
                    r86VarM21353e = null;
                    break;
                }
                r86 r86Var3 = (r86) it.next();
                r86VarM21353e = (!(r86Var3 instanceof u86) || r86Var3.equals(r86Var)) ? null : ((u86) r86Var3).f63589g.m21353e(i, u86Var, r86Var2, true);
            } while (r86VarM21353e == null);
        }
        if (r86VarM21353e != null) {
            return r86VarM21353e;
        }
        u86 u86Var2 = u86Var.f58882c;
        if (u86Var2 == null || u86Var2.equals(r86Var)) {
            return null;
        }
        u86 u86Var3 = u86Var.f58882c;
        u86Var3.getClass();
        return u86Var3.f63589g.m21353e(i, u86Var, r86Var2, z);
    }

    /* JADX INFO: renamed from: f */
    public synchronized String m21354f() {
        if (m21357i() <= 0) {
            return null;
        }
        return ((SharedPreferences) this.f60817c).getString(Long.toString(((SharedPreferences) this.f60817c).getLong("read_index", 0L)), null);
    }

    /* JADX INFO: renamed from: g */
    public String m21355g() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.f60816b + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((Object[]) this.f60818d)[i2];
            if (obj instanceof SerialDescriptor) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                boolean zM11650l = fa4.m11650l(serialDescriptor.getKind(), hl9.f42586z);
                int[] iArr = (int[]) this.f60819e;
                if (!zM11650l) {
                    int i3 = iArr[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(serialDescriptor.mo3698f(i3));
                    }
                } else if (iArr[i2] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.f60819e)[i2]);
                    sb.append("]");
                }
            } else if (obj == p84.f55745g) {
                sb.append("[<debug info disabled>]");
            } else if (obj != ho5.f42704h) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: h */
    public synchronized boolean m21356h() {
        if (this.f60816b <= 0) {
            return false;
        }
        return m21357i() >= this.f60816b;
    }

    /* JADX INFO: renamed from: i */
    public synchronized int m21357i() {
        return Math.max(0, ((SharedPreferences) this.f60817c).getAll().size() - 5);
    }

    /* JADX INFO: renamed from: j */
    public q86 m21358j(q86 q86Var, sq5 sq5Var, boolean z, r86 r86Var) {
        q86 q86VarM22539n;
        u86 u86Var = (u86) this.f60817c;
        ArrayList arrayList = new ArrayList();
        Iterator it = u86Var.iterator();
        while (true) {
            xa6 xa6Var = (xa6) it;
            q86VarM22539n = null;
            if (!xa6Var.hasNext()) {
                break;
            }
            r86 r86Var2 = (r86) xa6Var.next();
            q86VarM22539n = fa4.m11650l(r86Var2, r86Var) ? null : r86Var2.mo20444j(sq5Var);
            if (q86VarM22539n != null) {
                arrayList.add(q86VarM22539n);
            }
        }
        q86 q86Var2 = (q86) u91.m22599Q0(arrayList);
        u86 u86Var2 = u86Var.f58882c;
        if (u86Var2 != null && z && !u86Var2.equals(r86Var)) {
            q86VarM22539n = u86Var2.m22539n(sq5Var, u86Var);
        }
        return (q86) u91.m22599Q0(AbstractC3550rv.m20837e0(new q86[]{q86Var, q86Var2, q86VarM22539n}));
    }

    /* JADX INFO: renamed from: k */
    public void m21359k() {
        HandlerThread handlerThread;
        synchronized (this.f60817c) {
            try {
                bna.m3987z(this.f60816b > 0);
                int i = this.f60816b - 1;
                this.f60816b = i;
                if (i == 0 && (handlerThread = (HandlerThread) this.f60819e) != null) {
                    handlerThread.quit();
                    this.f60819e = null;
                    this.f60818d = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m21360l() {
        int i = this.f60816b * 2;
        this.f60818d = Arrays.copyOf((Object[]) this.f60818d, i);
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = -1;
        }
        AbstractC3550rv.m20829W(0, 0, 14, (int[]) this.f60819e, iArr);
        this.f60819e = iArr;
    }

    /* JADX INFO: renamed from: m */
    public void m21361m(int i) {
        u86 u86Var = (u86) this.f60817c;
        if (i == u86Var.f58881b.f57368b) {
            v63.m23129g(i, " cannot use the same id as the graph ", u86Var, "Start destination ");
        } else {
            this.f60816b = i;
            this.f60819e = null;
        }
    }

    /* JADX INFO: renamed from: n */
    public synchronized void m21362n(String str) {
        if (m21357i() <= 0) {
            return;
        }
        long j = ((SharedPreferences) this.f60817c).getLong("read_index", 0L);
        if (((SharedPreferences) this.f60817c).contains(Long.toString(j))) {
            ((SharedPreferences) this.f60817c).edit().putString(Long.toString(j), str).apply();
            m21350b(StorageQueueChangedAction.Update);
        }
    }

    /* JADX INFO: renamed from: o */
    public synchronized void m21363o(dw6 dw6Var) {
        try {
            if (m21357i() <= 0) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            while (m21357i() > 0) {
                arrayList.add(m21354f());
                if (!m21352d()) {
                    break;
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String strM10701c = dw6Var.m10701c((String) it.next());
                if (strM10701c != null) {
                    arrayList2.add(strM10701c);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                m21351c((String) it2.next());
            }
            m21350b(StorageQueueChangedAction.UpdateAll);
        } catch (Throwable th) {
            throw th;
        }
    }

    public String toString() {
        switch (this.f60815a) {
            case 1:
                return m21355g();
            default:
                return super.toString();
        }
    }

    public sg3(kf4 kf4Var) {
        this.f60815a = 1;
        this.f60817c = kf4Var;
        this.f60818d = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        this.f60819e = iArr;
        this.f60816b = -1;
    }

    public sg3(y76 y76Var, int i) {
        this.f60815a = 2;
        this.f60817c = y76Var.f69413f;
        this.f60816b = i;
        a86 a86Var = y76Var.f69415h;
        this.f60818d = a86Var.m170a();
        Bundle bundleM18160p = omd.m18160p((Pair[]) Arrays.copyOf(new Pair[0], 0));
        this.f60819e = bundleM18160p;
        a86Var.f345h.m12092G(bundleM18160p);
    }

    public sg3(u86 u86Var) {
        this.f60815a = 3;
        this.f60817c = u86Var;
        this.f60818d = new pe9(0);
    }

    public sg3(Context context, ny8 ny8Var, String str, int i) {
        this.f60815a = 5;
        this.f60819e = Collections.synchronizedList(new ArrayList());
        this.f60817c = context.getSharedPreferences(str, 0);
        this.f60818d = ny8Var;
        this.f60816b = i;
        m21349a();
    }

    public sg3(int i) {
        this.f60815a = i;
        switch (i) {
            case 4:
                this.f60817c = new Object();
                this.f60818d = null;
                this.f60819e = null;
                this.f60816b = 0;
                break;
            default:
                this.f60817c = new SparseIntArray[9];
                this.f60818d = new ArrayList();
                this.f60819e = new rg3(this);
                this.f60816b = 1;
                break;
        }
    }
}
