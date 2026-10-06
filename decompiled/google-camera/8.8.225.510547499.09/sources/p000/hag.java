package p000;

import android.app.backup.BackupManager;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class hag extends had {

    /* JADX INFO: renamed from: a */
    private static final nbh f27094a = nbh.m17259h("com/google/android/apps/camera/settings/SettingsManagerConcrete");

    /* JADX INFO: renamed from: c */
    private final Context f27096c;

    /* JADX INFO: renamed from: d */
    private final String f27097d;

    /* JADX INFO: renamed from: e */
    private final SharedPreferences f27098e;

    /* JADX INFO: renamed from: f */
    private final List f27099f = new ArrayList();

    /* JADX INFO: renamed from: g */
    private final List f27100g = new ArrayList();

    /* JADX INFO: renamed from: b */
    private final Object f27095b = new Object();

    public hag(final Context context, SharedPreferences sharedPreferences) {
        this.f27096c = context;
        this.f27097d = context.getPackageName();
        this.f27098e = sharedPreferences;
        mo10039f(new gzj() { // from class: haf
            @Override // p000.gzj
            /* JADX INFO: renamed from: a */
            public final void mo10012a(String str) {
                BackupManager.dataChanged(context.getPackageName());
            }
        });
    }

    @Override // p000.had
    /* JADX INFO: renamed from: a */
    public final int mo10034a(String str) {
        int iMo10035b;
        synchronized (this.f27095b) {
            iMo10035b = mo10035b(str, 0);
        }
        return iMo10035b;
    }

    @Override // p000.had
    /* JADX INFO: renamed from: b */
    public final int mo10035b(String str, Integer num) {
        synchronized (this.f27095b) {
            String strM10050q = m10050q(str, Integer.toString(num.intValue()));
            if (strM10050q == null) {
                return num.intValue();
            }
            return Integer.parseInt(strM10050q);
        }
    }

    @Override // p000.had
    /* JADX INFO: renamed from: c */
    public final long mo10036c(String str) {
        long j;
        synchronized (this.f27095b) {
            j = 0;
            Long l = 0L;
            synchronized (this.f27095b) {
                l.longValue();
                String strM10050q = m10050q(str, Long.toString(0L));
                if (strM10050q == null) {
                    l.longValue();
                } else {
                    j = Long.parseLong(strM10050q);
                }
            }
        }
        return j;
    }

    @Override // p000.had
    /* JADX INFO: renamed from: d */
    public final SharedPreferences mo10037d() {
        SharedPreferences sharedPreferences;
        synchronized (this.f27095b) {
            sharedPreferences = this.f27098e;
        }
        return sharedPreferences;
    }

    @Override // p000.had
    /* JADX INFO: renamed from: e */
    public final String mo10038e(String str) {
        String string;
        synchronized (this.f27095b) {
            try {
                try {
                    string = this.f27098e.getString(str, null);
                } catch (ClassCastException e) {
                    ((nbe) ((nbe) ((nbe) f27094a.m17252c()).mo17283h(e)).mo17276G(3397)).mo17290o("existing preference with invalid type, removing and returning default");
                    this.f27098e.edit().remove(str).apply();
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    @Override // p000.had
    /* JADX INFO: renamed from: f */
    public final void mo10039f(final gzj gzjVar) {
        lku.m15662p(this.f27095b);
        lku.m15662p(this.f27100g);
        lku.m15662p(this.f27098e);
        synchronized (this.f27095b) {
            try {
                if (gzjVar == null) {
                    throw new IllegalArgumentException("OnSettingChangedListener cannot be null.");
                }
                if (this.f27099f.contains(gzjVar)) {
                    return;
                }
                this.f27099f.add(gzjVar);
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: hae
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                        gzjVar.mo10012a(str);
                    }
                };
                this.f27100g.add(onSharedPreferenceChangeListener);
                this.f27098e.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.had
    /* JADX INFO: renamed from: g */
    public final void mo10040g(String str) {
        synchronized (this.f27095b) {
            this.f27098e.edit().remove(str).apply();
        }
    }

    @Override // p000.had
    /* JADX INFO: renamed from: h */
    public final void mo10041h(gzj gzjVar) {
        lku.m15662p(this.f27095b);
        lku.m15662p(this.f27100g);
        lku.m15662p(this.f27098e);
        synchronized (this.f27095b) {
            if (this.f27099f.contains(gzjVar)) {
                int iIndexOf = this.f27099f.indexOf(gzjVar);
                this.f27099f.remove(gzjVar);
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = (SharedPreferences.OnSharedPreferenceChangeListener) this.f27100g.get(iIndexOf);
                this.f27100g.remove(iIndexOf);
                this.f27098e.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
            }
        }
    }

    @Override // p000.had
    /* JADX INFO: renamed from: i */
    public final void mo10042i(String str, int i) {
        synchronized (this.f27095b) {
            mo10044k(str, Integer.toString(i));
        }
    }

    @Override // p000.had
    /* JADX INFO: renamed from: j */
    public final void mo10043j(String str, long j) {
        synchronized (this.f27095b) {
            mo10044k(str, Long.toString(j));
        }
    }

    @Override // p000.had
    /* JADX INFO: renamed from: k */
    public final void mo10044k(String str, String str2) {
        synchronized (this.f27095b) {
            this.f27098e.edit().putString(str, str2).apply();
        }
    }

    @Override // p000.had
    /* JADX INFO: renamed from: l */
    public final void mo10045l(String str, boolean z) {
        synchronized (this.f27095b) {
            mo10044k(str, true != z ? "0" : "1");
        }
    }

    @Override // p000.had
    /* JADX INFO: renamed from: m */
    public final boolean mo10046m(String str) {
        boolean zMo10048o;
        synchronized (this.f27095b) {
            zMo10048o = mo10048o(str);
        }
        return zMo10048o;
    }

    @Override // p000.had
    /* JADX INFO: renamed from: n */
    public final boolean mo10047n(String str) {
        boolean zContains;
        synchronized (this.f27095b) {
            zContains = this.f27098e.contains(str);
        }
        return zContains;
    }

    @Override // p000.had
    /* JADX INFO: renamed from: o */
    public final boolean mo10048o(String str) {
        synchronized (this.f27095b) {
            String strM10050q = m10050q(str, "0");
            if (strM10050q == null) {
                return false;
            }
            return Integer.parseInt(strM10050q) != 0;
        }
    }

    @Override // p000.had
    /* JADX INFO: renamed from: p */
    public final SharedPreferences mo10049p() {
        SharedPreferences sharedPreferences;
        synchronized (this.f27095b) {
            sharedPreferences = this.f27096c.getSharedPreferences(this.f27097d + "_preferences_camera", 0);
            Iterator it = this.f27100g.iterator();
            while (it.hasNext()) {
                sharedPreferences.registerOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener) it.next());
            }
        }
        return sharedPreferences;
    }

    /* JADX INFO: renamed from: q */
    public final String m10050q(String str, String str2) {
        String string;
        synchronized (this.f27095b) {
            try {
                try {
                    string = this.f27098e.getString(str, str2);
                } catch (ClassCastException e) {
                    ((nbe) ((nbe) ((nbe) f27094a.m17252c()).mo17283h(e)).mo17276G(3398)).mo17290o("existing preference with invalid type, removing and returning default");
                    this.f27098e.edit().remove(str).apply();
                    return str2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }
}
