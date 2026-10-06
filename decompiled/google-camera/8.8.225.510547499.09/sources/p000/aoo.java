package p000;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aoo {

    /* JADX INFO: renamed from: a */
    public boolean f1902a;

    /* JADX INFO: renamed from: b */
    public PreferenceScreen f1903b;

    /* JADX INFO: renamed from: c */
    public aon f1904c;

    /* JADX INFO: renamed from: d */
    public aol f1905d;

    /* JADX INFO: renamed from: e */
    public aom f1906e;

    /* JADX INFO: renamed from: f */
    private final Context f1907f;

    /* JADX INFO: renamed from: g */
    private long f1908g = 0;

    /* JADX INFO: renamed from: h */
    private SharedPreferences f1909h = null;

    /* JADX INFO: renamed from: i */
    private SharedPreferences.Editor f1910i;

    /* JADX INFO: renamed from: j */
    private final String f1911j;

    public aoo(Context context) {
        this.f1907f = context;
        this.f1911j = m1774g(context);
    }

    /* JADX INFO: renamed from: c */
    public static SharedPreferences m1773c(Context context) {
        return context.getSharedPreferences(m1774g(context), 0);
    }

    /* JADX INFO: renamed from: g */
    private static String m1774g(Context context) {
        return String.valueOf(context.getPackageName()).concat("_preferences");
    }

    /* JADX INFO: renamed from: a */
    public final long m1775a() {
        long j;
        synchronized (this) {
            j = this.f1908g;
            this.f1908g = 1 + j;
        }
        return j;
    }

    /* JADX INFO: renamed from: b */
    public final SharedPreferences.Editor m1776b() {
        if (!this.f1902a) {
            return m1777d().edit();
        }
        if (this.f1910i == null) {
            this.f1910i = m1777d().edit();
        }
        return this.f1910i;
    }

    /* JADX INFO: renamed from: d */
    public final SharedPreferences m1777d() {
        if (this.f1909h == null) {
            this.f1909h = this.f1907f.getSharedPreferences(this.f1911j, 0);
        }
        return this.f1909h;
    }

    /* JADX INFO: renamed from: e */
    public final Preference m1778e(CharSequence charSequence) {
        PreferenceScreen preferenceScreen = this.f1903b;
        if (preferenceScreen == null) {
            return null;
        }
        return preferenceScreen.m1533l(charSequence);
    }

    /* JADX INFO: renamed from: f */
    public final void m1779f(boolean z) {
        SharedPreferences.Editor editor;
        if (!z && (editor = this.f1910i) != null) {
            editor.apply();
        }
        this.f1902a = z;
    }
}
