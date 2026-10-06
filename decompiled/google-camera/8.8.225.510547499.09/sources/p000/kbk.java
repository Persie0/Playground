package p000;

import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kbk implements kbo, kbn {

    /* JADX INFO: renamed from: a */
    private final String f35531a;

    /* JADX INFO: renamed from: b */
    private final kbj f35532b;

    public kbk(String str, kbj kbjVar) {
        this.f35531a = str;
        this.f35532b = kbjVar;
    }

    @Override // p000.kbo, p000.kbn
    /* JADX INFO: renamed from: a */
    public final kbo mo6314a(String str) {
        kbj kbjVar = this.f35532b;
        String strConcat = kbjVar.f35529a.concat(String.valueOf(str));
        int length = str.length();
        int i = kbjVar.f35530b;
        if (length <= i) {
            return kbjVar.mo6311a(strConcat);
        }
        kbk kbkVarMo6311a = kbjVar.mo6311a(strConcat.substring(0, i + kbjVar.f35529a.length()));
        kbkVarMo6311a.mo13947i("Tag " + str + " is " + (str.length() - kbjVar.f35530b) + " chars longer than limit.");
        return kbkVarMo6311a;
    }

    @Override // p000.kbo
    /* JADX INFO: renamed from: b */
    public final void mo13940b(String str) {
        this.f35532b.mo6312b(this.f35531a, 3);
    }

    @Override // p000.kbo
    /* JADX INFO: renamed from: c */
    public final void mo13941c(String str, Throwable th) {
        this.f35532b.mo6312b(this.f35531a, 3);
    }

    @Override // p000.kbo
    /* JADX INFO: renamed from: d */
    public final void mo13942d(String str) {
        if (this.f35532b.mo6312b(this.f35531a, 6)) {
            Log.e(this.f35531a, str);
        }
    }

    @Override // p000.kbo
    /* JADX INFO: renamed from: e */
    public final void mo13943e(String str, Throwable th) {
        if (this.f35532b.mo6312b(this.f35531a, 6)) {
            Log.e(this.f35531a, str, th);
        }
    }

    @Override // p000.kbo
    /* JADX INFO: renamed from: f */
    public final void mo13944f(String str) {
        this.f35532b.mo6312b(this.f35531a, 4);
    }

    @Override // p000.kbo
    /* JADX INFO: renamed from: g */
    public final void mo13945g(String str, Throwable th) {
        this.f35532b.mo6312b(this.f35531a, 4);
    }

    @Override // p000.kbo
    /* JADX INFO: renamed from: h */
    public final void mo13946h(String str) {
        this.f35532b.mo6312b(this.f35531a, 2);
    }

    @Override // p000.kbo
    /* JADX INFO: renamed from: i */
    public final void mo13947i(String str) {
        if (this.f35532b.mo6312b(this.f35531a, 5)) {
            Log.w(this.f35531a, str);
        }
    }

    @Override // p000.kbo
    /* JADX INFO: renamed from: j */
    public final void mo13948j(String str, Throwable th) {
        if (this.f35532b.mo6312b(this.f35531a, 5)) {
            Log.w(this.f35531a, str, th);
        }
    }
}
