package p000;

import android.os.Parcel;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class gp0 implements ar2, a58 {

    /* JADX INFO: renamed from: c */
    public static final gp0 f41118c;

    /* JADX INFO: renamed from: d */
    public static final gp0 f41119d;

    /* JADX INFO: renamed from: e */
    public static final gp0 f41120e;

    /* JADX INFO: renamed from: f */
    public static final gp0 f41121f;

    /* JADX INFO: renamed from: g */
    public static final gp0 f41122g;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41123a;

    /* JADX INFO: renamed from: b */
    public String f41124b;

    static {
        int i = 0;
        f41118c = new gp0("TINK", i);
        f41119d = new gp0("CRUNCHY", i);
        f41120e = new gp0("NO_PREFIX", i);
        int i2 = 1;
        f41121f = new gp0("FOLD", i2);
        f41122g = new gp0("HINGE", i2);
    }

    public gp0(String str) {
        this.f41123a = 5;
        this.f41124b = ux5.m22987j(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat(str);
    }

    /* JADX INFO: renamed from: a */
    public static C3404oc m12784a() {
        return new C3404oc();
    }

    /* JADX INFO: renamed from: d */
    public static String m12785d(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return AbstractC3393o1.m17735j(str, " : ", str2);
    }

    @Override // p000.a58
    public void accept(Object obj, Object obj2) {
        int i = ltc.f50124l;
        lrc lrcVar = new lrc((wr9) obj2);
        suc sucVar = (suc) ((yuc) obj).m11611l();
        String str = this.f41124b;
        Parcel parcelM16773J = sucVar.m16773J();
        bqb.m4107d(parcelM16773J, lrcVar);
        parcelM16773J.writeString(str);
        parcelM16773J.writeString("");
        parcelM16773J.writeString(null);
        sucVar.m16776M(parcelM16773J, 11);
    }

    /* JADX INFO: renamed from: b */
    public void m12786b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", m12785d(this.f41124b, str, objArr));
        }
    }

    /* JADX INFO: renamed from: c */
    public void m12787c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", m12785d(this.f41124b, str, objArr));
        }
    }

    @Override // p000.ar2
    /* JADX INFO: renamed from: e */
    public Object mo2998e() {
        return this;
    }

    @Override // p000.ar2
    /* JADX INFO: renamed from: h */
    public boolean mo2999h(CharSequence charSequence, int i, int i2, rda rdaVar) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.f41124b)) {
            return true;
        }
        rdaVar.f59141c = (rdaVar.f59141c & 3) | 4;
        return false;
    }

    public String toString() {
        switch (this.f41123a) {
            case 0:
                return this.f41124b;
            case 1:
                return this.f41124b;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ gp0(String str, int i) {
        this.f41123a = i;
        this.f41124b = str;
    }

    public /* synthetic */ gp0(int i) {
        this.f41123a = i;
    }
}
