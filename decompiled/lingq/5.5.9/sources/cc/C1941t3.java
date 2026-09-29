package cc;

import android.content.SharedPreferences;
import p176ib.C6272i;

/* JADX INFO: renamed from: cc.t3 */
/* JADX INFO: loaded from: classes.dex */
public final class C1941t3 {

    /* JADX INFO: renamed from: a */
    public final String f10204a;

    /* JADX INFO: renamed from: b */
    public final boolean f10205b;

    /* JADX INFO: renamed from: c */
    public boolean f10206c;

    /* JADX INFO: renamed from: d */
    public boolean f10207d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1986y3 f10208e;

    public C1941t3(C1986y3 c1986y3, String str, boolean z10) {
        this.f10208e = c1986y3;
        C6272i.m12912f(str);
        this.f10204a = str;
        this.f10205b = z10;
    }

    /* JADX INFO: renamed from: a */
    public final void m5889a(boolean z10) {
        SharedPreferences.Editor editorEdit = this.f10208e.m5917l().edit();
        editorEdit.putBoolean(this.f10204a, z10);
        editorEdit.apply();
        this.f10207d = z10;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5890b() {
        if (!this.f10206c) {
            this.f10206c = true;
            this.f10207d = this.f10208e.m5917l().getBoolean(this.f10204a, this.f10205b);
        }
        return this.f10207d;
    }
}
