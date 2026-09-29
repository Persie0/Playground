package p000;

import android.content.SharedPreferences;
import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class qg9 implements qt5 {

    /* JADX INFO: renamed from: a */
    public long f57766a;

    /* JADX INFO: renamed from: b */
    public boolean f57767b;

    /* JADX INFO: renamed from: c */
    public long f57768c;

    /* JADX INFO: renamed from: d */
    public final Object f57769d;

    /* JADX INFO: renamed from: e */
    public Object f57770e;

    public qg9(qfc qfcVar, String str, long j) {
        Objects.requireNonNull(qfcVar);
        this.f57770e = qfcVar;
        lda.m16127m(str);
        this.f57769d = str;
        this.f57766a = j;
    }

    @Override // p000.qt5
    /* JADX INFO: renamed from: a */
    public void mo14311a(n97 n97Var) {
        if (this.f57767b) {
            m19950d(mo14312b());
        }
        this.f57770e = n97Var;
    }

    @Override // p000.qt5
    /* JADX INFO: renamed from: b */
    public long mo14312b() {
        long j = this.f57766a;
        if (!this.f57767b) {
            return j;
        }
        ((mp9) this.f57769d).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f57768c;
        n97 n97Var = (n97) this.f57770e;
        return (n97Var.f52510a == 1.0f ? uma.m22797B(jElapsedRealtime) : jElapsedRealtime * ((long) n97Var.f52512c)) + j;
    }

    /* JADX INFO: renamed from: d */
    public void m19950d(long j) {
        this.f57766a = j;
        if (this.f57767b) {
            ((mp9) this.f57769d).getClass();
            this.f57768c = SystemClock.elapsedRealtime();
        }
    }

    @Override // p000.qt5
    /* JADX INFO: renamed from: e */
    public n97 mo14315e() {
        return (n97) this.f57770e;
    }

    /* JADX INFO: renamed from: f */
    public void m19951f() {
        if (this.f57767b) {
            return;
        }
        ((mp9) this.f57769d).getClass();
        this.f57768c = SystemClock.elapsedRealtime();
        this.f57767b = true;
    }

    /* JADX INFO: renamed from: g */
    public long m19952g() {
        if (!this.f57767b) {
            this.f57767b = true;
            qfc qfcVar = (qfc) this.f57770e;
            this.f57768c = qfcVar.m19930H().getLong((String) this.f57769d, this.f57766a);
        }
        return this.f57768c;
    }

    /* JADX INFO: renamed from: h */
    public void m19953h(long j) {
        SharedPreferences.Editor editorEdit = ((qfc) this.f57770e).m19930H().edit();
        editorEdit.putLong((String) this.f57769d, j);
        editorEdit.apply();
        this.f57768c = j;
    }

    public qg9(mp9 mp9Var) {
        this.f57769d = mp9Var;
        this.f57770e = n97.f52509d;
    }
}
