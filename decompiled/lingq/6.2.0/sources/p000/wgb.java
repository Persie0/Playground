package p000;

import com.google.android.gms.internal.measurement.zzabz;
import com.google.android.gms.internal.measurement.zzin;

/* JADX INFO: loaded from: classes2.dex */
public final class wgb implements zhb {

    /* JADX INFO: renamed from: b */
    public static final wgb f66802b = new wgb(0);

    /* JADX INFO: renamed from: c */
    public static final wgb f66803c = new wgb(1);

    /* JADX INFO: renamed from: d */
    public static final wgb f66804d = new wgb(2);

    /* JADX INFO: renamed from: e */
    public static final wgb f66805e = new wgb(3);

    /* JADX INFO: renamed from: f */
    public static final wgb f66806f = new wgb(4);

    /* JADX INFO: renamed from: g */
    public static final wgb f66807g = new wgb(5);

    /* JADX INFO: renamed from: h */
    public static final wgb f66808h = new wgb(6);

    /* JADX INFO: renamed from: i */
    public static final wgb f66809i = new wgb(7);

    /* JADX INFO: renamed from: j */
    public static final wgb f66810j = new wgb(8);

    /* JADX INFO: renamed from: k */
    public static final wgb f66811k = new wgb(9);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66812a;

    public /* synthetic */ wgb(int i) {
        this.f66812a = i;
    }

    @Override // p000.zhb
    /* JADX INFO: renamed from: a */
    public final boolean mo22576a(int i) {
        switch (this.f66812a) {
            case 0:
                return zzabz.zzb(i) != null;
            case 1:
                return i == 0 || i == 1 || i == 2 || i == 3 || i == 4;
            case 2:
                switch (i) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return true;
                    default:
                        return false;
                }
            case 3:
                return i == 0 || i == 1 || i == 2 || i == 3 || i == 4;
            case 4:
                return i == 0 || i == 1 || i == 2;
            case 5:
                return i == 1 || i == 2;
            case 6:
                return zzin.zzb(i) != null;
            case 7:
                return ced.m4604b(i) != 0;
            case 8:
                return ded.m10317c(i) != 0;
            default:
                return i == 0 || i == 1 || i == 2 || i == 3 || i == 4;
        }
    }
}
