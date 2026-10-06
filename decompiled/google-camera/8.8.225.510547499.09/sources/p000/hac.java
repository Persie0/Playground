package p000;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p021j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class hac implements hah, hai, kba {

    /* JADX INFO: renamed from: b */
    private final SharedPreferences f27088b;

    /* JADX INFO: renamed from: c */
    private final dhv f27089c;

    /* JADX INFO: renamed from: d */
    private final SharedPreferences.OnSharedPreferenceChangeListener f27090d;

    /* JADX INFO: renamed from: a */
    public final Map f27087a = new HashMap();

    /* JADX INFO: renamed from: e */
    private final List f27091e = new ArrayList();

    public hac(final dhv dhvVar, final SharedPreferences sharedPreferences) {
        this.f27089c = dhvVar;
        this.f27088b = sharedPreferences;
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: haa
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
                hac hacVar = this.f27082a;
                SharedPreferences sharedPreferences3 = sharedPreferences;
                dhv dhvVar2 = dhvVar;
                hab habVar = (hab) hacVar.f27087a.get(str);
                if (habVar == null) {
                    return;
                }
                String string = sharedPreferences3.getString(str, null);
                Object objMo10025b = string != null ? habVar.f27085a.mo10025b(string) : habVar.f27085a.f26978b.mo10022a(dhvVar2);
                if (Objects.equals(((jwf) habVar.f27086b).f34942d, objMo10025b)) {
                    return;
                }
                habVar.f27086b.mo3415bf(objMo10025b);
            }
        };
        this.f27090d = onSharedPreferenceChangeListener;
        sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // p000.hah
    /* JADX INFO: renamed from: a */
    public final jwn mo10029a(gzw gzwVar) {
        return mo10030b(gzwVar);
    }

    @Override // p000.hai
    /* JADX INFO: renamed from: b */
    public final jww mo10030b(gzw gzwVar) {
        synchronized (this.f27087a) {
            if (this.f27087a.get(gzwVar.f26977a) == null) {
                jwf jwfVar = new jwf(mo10031c(gzwVar));
                this.f27091e.add(jwfVar.mo3830a(new gmb(this, gzwVar, 3), not.INSTANCE));
                this.f27087a.put(gzwVar.f26977a, new hab(gzwVar, jwfVar));
            }
        }
        hab habVar = (hab) this.f27087a.get(gzwVar.f26977a);
        habVar.getClass();
        return habVar.f27086b;
    }

    @Override // p000.hah
    /* JADX INFO: renamed from: c */
    public final Object mo10031c(gzw gzwVar) {
        String string;
        synchronized (this) {
            string = this.f27088b.getString(gzwVar.f26977a, null);
        }
        return string != null ? gzwVar.mo10025b(string) : gzwVar.f26978b.mo10022a(this.f27089c);
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.f27088b.unregisterOnSharedPreferenceChangeListener(this.f27090d);
        }
        Iterator it = this.f27091e.iterator();
        while (it.hasNext()) {
            ((kba) it.next()).close();
        }
    }

    @Override // p000.hai
    /* JADX INFO: renamed from: d */
    public final void mo10032d(gzw gzwVar) {
        synchronized (this) {
            this.f27088b.edit().remove(gzwVar.f26977a).apply();
            String str = gzwVar.f26977a;
        }
    }

    @Override // p000.hai
    /* JADX INFO: renamed from: e */
    public final void mo10033e(gzw gzwVar, Object obj) {
        String str = gzwVar.f26977a;
        String strMo10027d = gzwVar.mo10027d(obj);
        synchronized (this) {
            this.f27088b.edit().putString(str, strMo10027d).apply();
        }
    }
}
