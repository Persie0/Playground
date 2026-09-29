package p157hg;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p243lg.C7360b;
import p243lg.InterfaceC7361c;
import p349qo.C8656b;
import p534zf.InterfaceC10488f;

/* JADX INFO: renamed from: hg.a */
/* JADX INFO: loaded from: classes.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC6043a implements InterfaceC6044b, SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f35691a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC7361c f35692b;

    /* JADX INFO: renamed from: c */
    public final List<InterfaceC6045c> f35693c = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: hg.a$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f35694a;

        public a(ArrayList arrayList, String str) {
            this.f35694a = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SharedPreferencesOnSharedPreferenceChangeListenerC6043a.this.getClass();
            Iterator it = this.f35694a.iterator();
            while (it.hasNext()) {
                ((InterfaceC6045c) it.next()).m12489a();
            }
        }
    }

    public SharedPreferencesOnSharedPreferenceChangeListenerC6043a(SharedPreferences sharedPreferences, InterfaceC7361c interfaceC7361c) {
        this.f35691a = sharedPreferences;
        this.f35692b = interfaceC7361c;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final synchronized Boolean m12478a(String str, Boolean bool) {
        return C8656b.m16881H(this.f35691a.getAll().get(str), bool);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final synchronized Integer m12479b(Integer num, String str) {
        Integer numM16883J = C8656b.m16883J(this.f35691a.getAll().get(str));
        if (numM16883J != null) {
            num = numM16883J;
        }
        return num;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized InterfaceC10488f m12480c(String str, boolean z10) {
        return C8656b.m16887N(C8656b.m16889P(this.f35691a.getAll().get(str), null), z10);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public final synchronized Long m12481d(String str, Long l10) {
        return C8656b.m16888O(this.f35691a.getAll().get(str), l10);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public final synchronized String m12482e(String str, String str2) {
        return C8656b.m16889P(this.f35691a.getAll().get(str), str2);
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m12483f(String str) {
        try {
            this.f35691a.edit().remove(str).apply();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: g */
    public final synchronized void m12484g(String str, boolean z10) {
        try {
            this.f35691a.edit().putBoolean(str, z10).apply();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: h */
    public final synchronized void m12485h(String str, int i10) {
        this.f35691a.edit().putInt(str, i10).apply();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: i */
    public final synchronized void m12486i(InterfaceC10488f interfaceC10488f, String str) {
        this.f35691a.edit().putString(str, interfaceC10488f.toString()).apply();
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m12487j(String str, long j10) {
        try {
            this.f35691a.edit().putLong(str, j10).apply();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: k */
    public final synchronized void m12488k(String str, String str2) {
        try {
            this.f35691a.edit().putString(str, str2).apply();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final synchronized void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        ArrayList arrayListM16896W = C8656b.m16896W(this.f35693c);
        if (arrayListM16896W.isEmpty()) {
            return;
        }
        ((C7360b) this.f35692b).m14769f(new a(arrayListM16896W, str));
    }
}
