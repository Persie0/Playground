package p000;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cj9 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f10176a;

    /* JADX INFO: renamed from: b */
    public final ny8 f10177b;

    /* JADX INFO: renamed from: c */
    public final List f10178c = Collections.synchronizedList(new ArrayList());

    public cj9(SharedPreferences sharedPreferences, ny8 ny8Var) {
        this.f10176a = sharedPreferences;
        this.f10177b = ny8Var;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized Boolean m4773a(String str, Boolean bool) {
        return b34.m3209D(this.f10176a.getAll().get(str), bool);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized Integer m4774b(String str) {
        Integer num;
        synchronized (this) {
            Integer numM3211F = b34.m3211F(this.f10176a.getAll().get(str));
            num = numM3211F != null ? numM3211F : 0;
        }
        return num;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized eg4 m4775c(String str, boolean z) {
        String strM3217L;
        strM3217L = b34.m3217L(this.f10176a.getAll().get(str));
        if (strM3217L == null) {
            strM3217L = null;
        }
        return b34.m3215J(strM3217L, z);
    }

    /* JADX INFO: renamed from: d */
    public final synchronized Long m4776d(String str, Long l) {
        return b34.m3216K(this.f10176a.getAll().get(str), l);
    }

    /* JADX INFO: renamed from: e */
    public final synchronized String m4777e(String str, String str2) {
        String strM3217L = b34.m3217L(this.f10176a.getAll().get(str));
        if (strM3217L != null) {
            str2 = strM3217L;
        }
        return str2;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m4778f(String str) {
        this.f10176a.edit().remove(str).apply();
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m4779g(String str, boolean z) {
        this.f10176a.edit().putBoolean(str, z).apply();
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m4780h(int i, String str) {
        this.f10176a.edit().putInt(str, i).apply();
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m4781i(String str, dg4 dg4Var) {
        this.f10176a.edit().putString(str, dg4Var.toString()).apply();
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m4782j(String str, long j) {
        this.f10176a.edit().putLong(str, j).apply();
    }

    /* JADX INFO: renamed from: k */
    public final synchronized void m4783k(String str, String str2) {
        this.f10176a.edit().putString(str, str2).apply();
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final synchronized void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        ArrayList arrayListM3224U = b34.m3224U(this.f10178c);
        if (arrayListM3224U.isEmpty()) {
            return;
        }
        this.f10177b.m17684L(new mt6(this, arrayListM3224U, str));
    }
}
