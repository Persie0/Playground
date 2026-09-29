package p000;

import android.content.ComponentName;
import android.content.Context;
import androidx.glance.appwidget.C0664l;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class yaa {

    /* JADX INFO: renamed from: a */
    public final Context f69568a;

    /* JADX INFO: renamed from: b */
    public final int f69569b;

    /* JADX INFO: renamed from: c */
    public final boolean f69570c;

    /* JADX INFO: renamed from: d */
    public final C0664l f69571d;

    /* JADX INFO: renamed from: e */
    public final int f69572e;

    /* JADX INFO: renamed from: f */
    public final boolean f69573f;

    /* JADX INFO: renamed from: g */
    public final AtomicInteger f69574g;

    /* JADX INFO: renamed from: h */
    public final j64 f69575h;

    /* JADX INFO: renamed from: i */
    public final AtomicBoolean f69576i;

    /* JADX INFO: renamed from: j */
    public final long f69577j;

    /* JADX INFO: renamed from: k */
    public final int f69578k;

    /* JADX INFO: renamed from: l */
    public final boolean f69579l;

    /* JADX INFO: renamed from: m */
    public final Integer f69580m;

    /* JADX INFO: renamed from: n */
    public final ComponentName f69581n;

    /* JADX INFO: renamed from: o */
    public final C3329mb f69582o;

    public yaa(Context context, int i, boolean z, C0664l c0664l, int i2, boolean z2, AtomicInteger atomicInteger, j64 j64Var, AtomicBoolean atomicBoolean, long j, int i3, boolean z3, Integer num, ComponentName componentName, C3329mb c3329mb) {
        this.f69568a = context;
        this.f69569b = i;
        this.f69570c = z;
        this.f69571d = c0664l;
        this.f69572e = i2;
        this.f69573f = z2;
        this.f69574g = atomicInteger;
        this.f69575h = j64Var;
        this.f69576i = atomicBoolean;
        this.f69577j = j;
        this.f69578k = i3;
        this.f69579l = z3;
        this.f69580m = num;
        this.f69581n = componentName;
        this.f69582o = c3329mb;
    }

    /* JADX INFO: renamed from: a */
    public static yaa m25020a(yaa yaaVar, int i, AtomicInteger atomicInteger, j64 j64Var, AtomicBoolean atomicBoolean, long j, int i2, Integer num, int i3) {
        return new yaa(yaaVar.f69568a, yaaVar.f69569b, yaaVar.f69570c, yaaVar.f69571d, (i3 & 16) != 0 ? yaaVar.f69572e : i, (i3 & 32) != 0 ? yaaVar.f69573f : true, (i3 & 64) != 0 ? yaaVar.f69574g : atomicInteger, (i3 & 128) != 0 ? yaaVar.f69575h : j64Var, (i3 & 256) != 0 ? yaaVar.f69576i : atomicBoolean, (i3 & 512) != 0 ? yaaVar.f69577j : j, (i3 & 1024) != 0 ? yaaVar.f69578k : i2, (i3 & 4096) != 0 ? yaaVar.f69579l : true, (i3 & 8192) != 0 ? yaaVar.f69580m : num, yaaVar.f69581n, yaaVar.f69582o);
    }

    /* JADX INFO: renamed from: b */
    public final yaa m25021b(j64 j64Var, int i) {
        return m25020a(this, i, null, j64Var, null, 0L, 0, null, 65391);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yaa) {
            yaa yaaVar = (yaa) obj;
            return fa4.m11650l(this.f69568a, yaaVar.f69568a) && this.f69569b == yaaVar.f69569b && this.f69570c == yaaVar.f69570c && this.f69571d == yaaVar.f69571d && this.f69572e == yaaVar.f69572e && this.f69573f == yaaVar.f69573f && fa4.m11650l(this.f69574g, yaaVar.f69574g) && fa4.m11650l(this.f69575h, yaaVar.f69575h) && fa4.m11650l(this.f69576i, yaaVar.f69576i) && this.f69577j == yaaVar.f69577j && this.f69578k == yaaVar.f69578k && this.f69579l == yaaVar.f69579l && fa4.m11650l(this.f69580m, yaaVar.f69580m) && fa4.m11650l(this.f69581n, yaaVar.f69581n) && this.f69582o == yaaVar.f69582o;
        }
        return false;
    }

    public final int hashCode() {
        int iM12428e = g9a.m12428e(wq1.m24106b(-1, wq1.m24106b(this.f69578k, ux5.m22981d(this.f69577j, (this.f69576i.hashCode() + ((this.f69575h.hashCode() + ((this.f69574g.hashCode() + g9a.m12428e(wq1.m24106b(this.f69572e, (this.f69571d.hashCode() + g9a.m12428e(wq1.m24106b(this.f69569b, this.f69568a.hashCode() * 31, 31), 31, this.f69570c)) * 31, 31), 31, this.f69573f)) * 31)) * 31)) * 31, 31), 31), 31), 31, this.f69579l);
        Integer num = this.f69580m;
        int iHashCode = (iM12428e + (num == null ? 0 : num.hashCode())) * 31;
        ComponentName componentName = this.f69581n;
        return this.f69582o.hashCode() + ((iHashCode + (componentName != null ? componentName.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "TranslationContext(context=" + this.f69568a + ", appWidgetId=" + this.f69569b + ", isRtl=" + this.f69570c + ", layoutConfiguration=" + this.f69571d + ", itemPosition=" + this.f69572e + ", isLazyCollectionDescendant=" + this.f69573f + ", lastViewId=" + this.f69574g + ", parentContext=" + this.f69575h + ", isBackgroundSpecified=" + this.f69576i + ", layoutSize=" + ((Object) bk2.m3807c(this.f69577j)) + ", layoutCollectionViewId=" + this.f69578k + ", layoutCollectionItemId=-1, canUseSelectableGroup=" + this.f69579l + ", actionTargetId=" + this.f69580m + ", actionBroadcastReceiver=" + this.f69581n + ", glanceComponents=" + this.f69582o + ')';
    }
}
