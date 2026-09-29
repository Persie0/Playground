package cc;

import android.content.SharedPreferences;
import p176ib.C6272i;

/* JADX INFO: renamed from: cc.v3 */
/* JADX INFO: loaded from: classes.dex */
public final class C1959v3 {

    /* JADX INFO: renamed from: a */
    public final String f10254a;

    /* JADX INFO: renamed from: b */
    public final long f10255b;

    /* JADX INFO: renamed from: c */
    public boolean f10256c;

    /* JADX INFO: renamed from: d */
    public long f10257d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1986y3 f10258e;

    public C1959v3(C1986y3 c1986y3, String str, long j10) {
        this.f10258e = c1986y3;
        C6272i.m12912f(str);
        this.f10254a = str;
        this.f10255b = j10;
    }

    /* JADX INFO: renamed from: a */
    public final long m5897a() {
        if (!this.f10256c) {
            this.f10256c = true;
            this.f10257d = this.f10258e.m5917l().getLong(this.f10254a, this.f10255b);
        }
        return this.f10257d;
    }

    /* JADX INFO: renamed from: b */
    public final void m5898b(long j10) {
        SharedPreferences.Editor editorEdit = this.f10258e.m5917l().edit();
        editorEdit.putLong(this.f10254a, j10);
        editorEdit.apply();
        this.f10257d = j10;
    }
}
