package p232l2;

import android.os.Bundle;

/* JADX INFO: renamed from: l2.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7237p {

    /* JADX INFO: renamed from: a */
    public C7236o f40666a;

    /* JADX INFO: renamed from: b */
    public CharSequence f40667b;

    /* JADX INFO: renamed from: c */
    public boolean f40668c = false;

    /* JADX INFO: renamed from: a */
    public void mo14575a(Bundle bundle) {
        if (this.f40668c) {
            bundle.putCharSequence("android.summaryText", this.f40667b);
        }
        String strMo14568c = mo14568c();
        if (strMo14568c != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strMo14568c);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo60b(C7238q c7238q);

    /* JADX INFO: renamed from: c */
    public String mo14568c() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void mo61d() {
    }

    /* JADX INFO: renamed from: e */
    public void mo62e() {
    }

    /* JADX INFO: renamed from: f */
    public final void m14584f(C7236o c7236o) {
        if (this.f40666a != c7236o) {
            this.f40666a = c7236o;
            if (c7236o != null) {
                c7236o.m14583h(this);
            }
        }
    }
}
