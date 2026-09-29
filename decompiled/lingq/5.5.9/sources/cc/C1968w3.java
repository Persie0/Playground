package cc;

import android.content.SharedPreferences;
import p176ib.C6272i;

/* JADX INFO: renamed from: cc.w3 */
/* JADX INFO: loaded from: classes.dex */
public final class C1968w3 {

    /* JADX INFO: renamed from: a */
    public final String f10269a;

    /* JADX INFO: renamed from: b */
    public final String f10270b;

    /* JADX INFO: renamed from: c */
    public final String f10271c;

    /* JADX INFO: renamed from: d */
    public final long f10272d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1986y3 f10273e;

    public /* synthetic */ C1968w3(C1986y3 c1986y3, long j10) {
        this.f10273e = c1986y3;
        C6272i.m12912f("health_monitor");
        C6272i.m12908b(j10 > 0);
        this.f10269a = "health_monitor:start";
        this.f10270b = "health_monitor:count";
        this.f10271c = "health_monitor:value";
        this.f10272d = j10;
    }

    /* JADX INFO: renamed from: a */
    public final void m5907a() {
        C1986y3 c1986y3 = this.f10273e;
        c1986y3.mo5748g();
        ((C1897o4) c1986y3.f10430a).f10058I.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = c1986y3.m5917l().edit();
        editorEdit.remove(this.f10270b);
        editorEdit.remove(this.f10271c);
        editorEdit.putLong(this.f10269a, jCurrentTimeMillis);
        editorEdit.apply();
    }
}
