package cc;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import p003a2.C0009a;
import p262mb.C7531d;

/* JADX INFO: renamed from: cc.h3 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1833h3 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9832a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f9833b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f9834c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f9835d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f9836e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1860k3 f9837f;

    public RunnableC1833h3(C1860k3 c1860k3, int i10, String str, Object obj, Object obj2, Object obj3) {
        this.f9837f = c1860k3;
        this.f9832a = i10;
        this.f9833b = str;
        this.f9834c = obj;
        this.f9835d = obj2;
        this.f9836e = obj3;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.lang.Runnable
    public final void run() {
        C1986y3 c1986y3 = ((C1897o4) this.f9837f.f10430a).f10085h;
        C1897o4.m5774i(c1986y3);
        if (!c1986y3.f9672b) {
            Log.println(6, this.f9837f.m5709u(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        C1860k3 c1860k3 = this.f9837f;
        if (c1860k3.f9939c == 0) {
            C1802e c1802e = ((C1897o4) c1860k3.f10430a).f10084g;
            if (c1802e.f9765d == null) {
                synchronized (c1802e) {
                    if (c1802e.f9765d == null) {
                        ApplicationInfo applicationInfo = ((C1897o4) c1802e.f10430a).f10076a.getApplicationInfo();
                        String strM15043a = C7531d.m15043a();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            c1802e.f9765d = Boolean.valueOf(str != null && str.equals(strM15043a));
                        }
                        if (c1802e.f9765d == null) {
                            c1802e.f9765d = Boolean.TRUE;
                            C1860k3 c1860k4 = ((C1897o4) c1802e.f10430a).f10086i;
                            C1897o4.m5776k(c1860k4);
                            c1860k4.f9942f.m5623a("My process not in the list of running processes");
                        }
                    }
                }
            }
            if (c1802e.f9765d.booleanValue()) {
                C1860k3 c1860k5 = this.f9837f;
                ((C1897o4) c1860k5.f10430a).getClass();
                c1860k5.f9939c = 'C';
            } else {
                C1860k3 c1860k6 = this.f9837f;
                ((C1897o4) c1860k6.f10430a).getClass();
                c1860k6.f9939c = 'c';
            }
        }
        C1860k3 c1860k7 = this.f9837f;
        if (c1860k7.f9940d < 0) {
            ((C1897o4) c1860k7.f10430a).f10084g.m5578m();
            c1860k7.f9940d = 76003L;
        }
        char cCharAt = "01VDIWEA?".charAt(this.f9832a);
        C1860k3 c1860k8 = this.f9837f;
        char c10 = c1860k8.f9939c;
        long j10 = c1860k8.f9940d;
        String strM5701r = C1860k3.m5701r(true, this.f9833b, this.f9834c, this.f9835d, this.f9836e);
        StringBuilder sb2 = new StringBuilder("2");
        sb2.append(cCharAt);
        sb2.append(c10);
        sb2.append(j10);
        String strM23l = C0009a.m23l(sb2, ":", strM5701r);
        if (strM23l.length() > 1024) {
            strM23l = this.f9833b.substring(0, 1024);
        }
        C1968w3 c1968w3 = c1986y3.f10402d;
        if (c1968w3 != null) {
            C1986y3 c1986y4 = c1968w3.f10273e;
            c1986y4.mo5748g();
            if (c1968w3.f10273e.m5917l().getLong(c1968w3.f10269a, 0L) == 0) {
                c1968w3.m5907a();
            }
            if (strM23l == null) {
                strM23l = "";
            }
            SharedPreferences sharedPreferencesM5917l = c1986y4.m5917l();
            String str2 = c1968w3.f10270b;
            long j11 = sharedPreferencesM5917l.getLong(str2, 0L);
            String str3 = c1968w3.f10271c;
            if (j11 <= 0) {
                SharedPreferences.Editor editorEdit = c1986y4.m5917l().edit();
                editorEdit.putString(str3, strM23l);
                editorEdit.putLong(str2, 1L);
                editorEdit.apply();
                return;
            }
            C1900o7 c1900o7 = ((C1897o4) c1986y4.f10430a).f10089l;
            C1897o4.m5774i(c1900o7);
            long jNextLong = c1900o7.m5841q().nextLong() & Long.MAX_VALUE;
            long j12 = j11 + 1;
            long j13 = Long.MAX_VALUE / j12;
            SharedPreferences.Editor editorEdit2 = c1986y4.m5917l().edit();
            if (jNextLong < j13) {
                editorEdit2.putString(str3, strM23l);
            }
            editorEdit2.putLong(str2, j12);
            editorEdit2.apply();
        }
    }
}
