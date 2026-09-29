package p000;

import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes2.dex */
public final class pm6 {

    /* JADX INFO: renamed from: a */
    public final Bundle f56473a;

    /* JADX INFO: renamed from: b */
    public IconCompat f56474b;

    /* JADX INFO: renamed from: c */
    public final j58[] f56475c;

    /* JADX INFO: renamed from: d */
    public final boolean f56476d;

    /* JADX INFO: renamed from: e */
    public final boolean f56477e;

    /* JADX INFO: renamed from: f */
    public final int f56478f;

    /* JADX INFO: renamed from: g */
    public final CharSequence f56479g;

    /* JADX INFO: renamed from: h */
    public final PendingIntent f56480h;

    public pm6(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, j58[] j58VarArr) {
        this.f56477e = true;
        this.f56474b = iconCompat;
        if (iconCompat != null) {
            int i = iconCompat.f5504a;
            if ((i == -1 ? ((Icon) iconCompat.f5505b).getType() : i) == 2) {
                this.f56478f = iconCompat.m1995b();
            }
        }
        this.f56479g = vm6.m23410d(charSequence);
        this.f56480h = pendingIntent;
        this.f56473a = bundle;
        this.f56475c = j58VarArr;
        this.f56476d = true;
        this.f56477e = true;
    }

    public pm6(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this(i == 0 ? null : IconCompat.m1994a(i), charSequence, pendingIntent, new Bundle(), null);
    }
}
