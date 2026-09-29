package p000;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final class uec {

    /* JADX INFO: renamed from: a */
    public final String f63815a;

    /* JADX INFO: renamed from: b */
    public final boolean f63816b;

    /* JADX INFO: renamed from: c */
    public boolean f63817c;

    /* JADX INFO: renamed from: d */
    public boolean f63818d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ qfc f63819e;

    public uec(qfc qfcVar, String str, boolean z) {
        this.f63819e = qfcVar;
        lda.m16127m(str);
        this.f63815a = str;
        this.f63816b = z;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m22719a() {
        if (!this.f63817c) {
            this.f63817c = true;
            this.f63818d = this.f63819e.m19930H().getBoolean(this.f63815a, this.f63816b);
        }
        return this.f63818d;
    }

    /* JADX INFO: renamed from: b */
    public final void m22720b(boolean z) {
        SharedPreferences.Editor editorEdit = this.f63819e.m19930H().edit();
        editorEdit.putBoolean(this.f63815a, z);
        editorEdit.apply();
        this.f63818d = z;
    }
}
