package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.PointF;
import java.util.ConcurrentModificationException;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nax {

    /* JADX INFO: renamed from: a */
    public Object f41919a;

    public nax() {
    }

    public nax(jel jelVar) {
        this.f41919a = jelVar;
    }

    public nax(lfg lfgVar) {
        this.f41919a = lfgVar;
    }

    public nax(byte[] bArr) {
        this.f41919a = null;
    }

    public nax(byte[] bArr, byte[] bArr2) {
    }

    public nax(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f41919a = new PointF(-1.0f, -1.0f);
    }

    public nax(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
    }

    public nax(byte[] bArr, char[] cArr, byte[] bArr2) {
        this.f41919a = mqu.f41450a;
    }

    public nax(char[] cArr) {
        this.f41919a = null;
    }

    /* JADX INFO: renamed from: b */
    public static String m17230b(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    /* JADX INFO: renamed from: d */
    public static ThreadFactory m17231d(nax naxVar) {
        Object obj = naxVar.f41919a;
        return new nqg(Executors.defaultThreadFactory(), (String) obj, obj != null ? new AtomicLong(0L) : null, 0);
    }

    /* JADX INFO: renamed from: e */
    public static nax m17232e() {
        return new nax(null, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m17233a(Object obj, Object obj2) {
        if (this.f41919a != obj) {
            throw new ConcurrentModificationException();
        }
        this.f41919a = obj2;
    }

    /* JADX INFO: renamed from: c */
    public final void m17234c(String str) {
        m17230b(str, 0);
        this.f41919a = str;
    }

    /* JADX INFO: renamed from: f */
    public final int m17235f(Context context) {
        if (this.f41919a == null) {
            try {
                this.f41919a = Integer.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException e) {
                this.f41919a = -1;
            }
        }
        return ((Integer) this.f41919a).intValue();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m17236g() {
        jql jqlVar = (jql) this.f41919a;
        jib.m13205j(jqlVar.f34597a);
        return jqlVar.f34597a.f34591a == 1;
    }

    /* JADX INFO: renamed from: h */
    public final void m17237h() {
        this.f41919a = new PointF(-1.0f, -1.0f);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m17238i(PointF pointF) {
        if (pointF.x < 0.0f || pointF.y < 0.0f) {
            return false;
        }
        if (Math.abs(pointF.x - ((PointF) this.f41919a).x) <= 0.005f && Math.abs(pointF.y - ((PointF) this.f41919a).y) <= 0.005f) {
            return false;
        }
        this.f41919a = pointF;
        return true;
    }
}
