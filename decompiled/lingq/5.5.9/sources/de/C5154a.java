package de;

import android.support.v4.media.session.C0166e;
import com.google.android.gms.internal.measurement.C2672g5;
import com.google.android.gms.internal.measurement.C2686h5;
import com.google.android.gms.internal.measurement.zzja;
import com.google.android.gms.internal.measurement.zzjb;
import p338qd.C8573r0;

/* JADX INFO: renamed from: de.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5154a {

    /* JADX INFO: renamed from: a */
    public static final zzjb f33147a;

    /* JADX INFO: renamed from: b */
    public static final zzja f33148b;

    /* JADX INFO: renamed from: c */
    public static final zzja f33149c;

    /* JADX INFO: renamed from: d */
    public static final zzja f33150d;

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    static {
        int i10 = zzjb.f14548c;
        Object[] objArr = new Object[15];
        objArr[0] = "_in";
        objArr[1] = "_xa";
        objArr[2] = "_xu";
        objArr[3] = "_aq";
        objArr[4] = "_aa";
        objArr[5] = "_ai";
        System.arraycopy(new String[]{"_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}, 0, objArr, 6, 9);
        f33147a = zzjb.m8485C(15, objArr);
        C2686h5 c2686h5 = zzja.f14547b;
        Object[] objArr2 = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        for (int i11 = 0; i11 < 7; i11++) {
            if (objArr2[i11] == null) {
                throw new NullPointerException(C0166e.m761g("at index ", i11));
            }
        }
        f33148b = zzja.m8483y(7, objArr2);
        Object[] objArr3 = {"auto", "app", "am"};
        for (int i12 = 0; i12 < 3; i12++) {
            if (objArr3[i12] == null) {
                throw new NullPointerException(C0166e.m761g("at index ", i12));
            }
        }
        f33149c = zzja.m8483y(3, objArr3);
        Object[] objArr4 = {"_r", "_dbg"};
        for (int i13 = 0; i13 < 2; i13++) {
            if (objArr4[i13] == null) {
                throw new NullPointerException(C0166e.m761g("at index ", i13));
            }
        }
        f33150d = zzja.m8483y(2, objArr4);
        C2672g5 c2672g5 = new C2672g5();
        c2672g5.m7846a(C8573r0.f45967d);
        c2672g5.m7846a(C8573r0.f45968e);
        c2672g5.f14193c = true;
        zzja.m8483y(c2672g5.f14192b, c2672g5.f14191a);
        Object[] objArr5 = {"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"};
        for (int i14 = 0; i14 < 2; i14++) {
            if (objArr5[i14] == null) {
                throw new NullPointerException(C0166e.m761g("at index ", i14));
            }
        }
        zzja.m8483y(2, objArr5);
    }
}
