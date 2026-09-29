package cc;

import android.content.SharedPreferences;
import p176ib.C6272i;

/* JADX INFO: renamed from: cc.x3 */
/* JADX INFO: loaded from: classes.dex */
public final class C1977x3 {

    /* JADX INFO: renamed from: a */
    public final String f10297a;

    /* JADX INFO: renamed from: b */
    public boolean f10298b;

    /* JADX INFO: renamed from: c */
    public String f10299c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1986y3 f10300d;

    public C1977x3(C1986y3 c1986y3, String str) {
        this.f10300d = c1986y3;
        C6272i.m12912f(str);
        this.f10297a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m5913a() {
        if (!this.f10298b) {
            this.f10298b = true;
            this.f10299c = this.f10300d.m5917l().getString(this.f10297a, null);
        }
        return this.f10299c;
    }

    /* JADX INFO: renamed from: b */
    public final void m5914b(String str) {
        SharedPreferences.Editor editorEdit = this.f10300d.m5917l().edit();
        editorEdit.putString(this.f10297a, str);
        editorEdit.apply();
        this.f10299c = str;
    }
}
