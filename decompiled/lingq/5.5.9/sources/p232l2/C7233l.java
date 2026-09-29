package p232l2;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: renamed from: l2.l */
/* JADX INFO: loaded from: classes.dex */
public final class C7233l {

    /* JADX INFO: renamed from: a */
    public final Bundle f40626a;

    /* JADX INFO: renamed from: b */
    public IconCompat f40627b;

    /* JADX INFO: renamed from: c */
    public final C7244w[] f40628c;

    /* JADX INFO: renamed from: d */
    public final boolean f40629d;

    /* JADX INFO: renamed from: e */
    public final boolean f40630e;

    /* JADX INFO: renamed from: f */
    public final int f40631f;

    /* JADX INFO: renamed from: g */
    public final boolean f40632g;

    /* JADX INFO: renamed from: h */
    @Deprecated
    public final int f40633h;

    /* JADX INFO: renamed from: i */
    public final CharSequence f40634i;

    /* JADX INFO: renamed from: j */
    public final PendingIntent f40635j;

    /* JADX INFO: renamed from: k */
    public final boolean f40636k;

    public C7233l(int i10, String str, PendingIntent pendingIntent) {
        IconCompat iconCompatM2962a = i10 == 0 ? null : IconCompat.m2962a(null, "", i10);
        Bundle bundle = new Bundle();
        this.f40630e = true;
        this.f40627b = iconCompatM2962a;
        if (iconCompatM2962a != null) {
            int i11 = iconCompatM2962a.f5582a;
            if ((i11 == -1 ? IconCompat.C0778a.m2968c(iconCompatM2962a.f5583b) : i11) == 2) {
                this.f40633h = iconCompatM2962a.m2963b();
            }
        }
        this.f40634i = C7236o.m14576c(str);
        this.f40635j = pendingIntent;
        this.f40626a = bundle;
        this.f40628c = null;
        this.f40629d = true;
        this.f40631f = 0;
        this.f40630e = true;
        this.f40632g = false;
        this.f40636k = false;
    }
}
