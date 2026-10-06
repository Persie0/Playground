package p000;

import android.accounts.Account;
import androidx.wear.ambient.AmbientMode;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jgy {

    /* JADX INFO: renamed from: a */
    public Object f34009a;

    /* JADX INFO: renamed from: b */
    public Object f34010b;

    /* JADX INFO: renamed from: c */
    public Object f34011c;

    /* JADX INFO: renamed from: d */
    public Object f34012d;

    /* JADX INFO: renamed from: e */
    public final Object f34013e;

    public jgy() {
        this.f34013e = jov.f34494a;
    }

    public jgy(AmbientMode.AmbientController ambientController, byte[] bArr) {
        this.f34013e = ambientController;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Set] */
    /* JADX INFO: renamed from: a */
    public final jgz m13175a() {
        Object obj = this.f34009a;
        ?? r2 = this.f34010b;
        Object obj2 = this.f34011c;
        Object obj3 = this.f34012d;
        String str = (String) obj3;
        return new jgz((Account) obj, r2, (String) obj2, str, (jov) this.f34013e);
    }
}
