package p000;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aay {

    /* JADX INFO: renamed from: a */
    public final Bundle f39a;

    /* JADX INFO: renamed from: b */
    public final boolean f40b;

    /* JADX INFO: renamed from: c */
    public boolean f41c;

    /* JADX INFO: renamed from: d */
    @Deprecated
    public int f42d;

    /* JADX INFO: renamed from: e */
    public final CharSequence f43e;

    /* JADX INFO: renamed from: f */
    public final PendingIntent f44f;

    /* JADX INFO: renamed from: g */
    private IconCompat f45g;

    public aay(CharSequence charSequence, PendingIntent pendingIntent) {
        IconCompat iconCompatM1430b = IconCompat.m1430b(C0100R.drawable.common_full_open_on_phone);
        Bundle bundle = new Bundle();
        this.f41c = true;
        this.f45g = iconCompatM1430b;
        int i = iconCompatM1430b.f1475b;
        if ((i == -1 ? acz.m255b(iconCompatM1430b.f1476c) : i) == 2) {
            this.f42d = iconCompatM1430b.m1431a();
        }
        this.f43e = abb.m77b(charSequence);
        this.f44f = pendingIntent;
        this.f39a = bundle;
        this.f40b = true;
        this.f41c = true;
    }

    /* JADX INFO: renamed from: a */
    public final IconCompat m71a() {
        int i;
        if (this.f45g == null && (i = this.f42d) != 0) {
            this.f45g = IconCompat.m1430b(i);
        }
        return this.f45g;
    }
}
