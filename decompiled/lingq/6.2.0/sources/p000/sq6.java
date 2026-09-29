package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class sq6 implements i02, InterfaceC3510qt, mq6, xoa {

    /* JADX INFO: renamed from: d */
    public static final byte[] f61251d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: e */
    public static final byte[] f61252e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: a */
    public int f61253a;

    /* JADX INFO: renamed from: b */
    public int f61254b;

    /* JADX INFO: renamed from: c */
    public Object f61255c;

    public sq6(int i) {
        switch (i) {
            case 3:
                this.f61255c = new sq6[256];
                this.f61253a = 0;
                this.f61254b = 0;
                break;
            default:
                this.f61255c = new bl2(14);
                this.f61253a = 8000;
                this.f61254b = 8000;
                break;
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m21584v(ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        byteBuffer.put(k9d.m15027a(i2));
    }

    @Override // p000.InterfaceC3510qt
    /* JADX INFO: renamed from: a */
    public void mo1298a(int i, Object obj) {
        ((InterfaceC3510qt) this.f61255c).mo1298a(i + (this.f61254b == 0 ? this.f61253a : 0), obj);
    }

    @Override // p000.InterfaceC3510qt
    /* JADX INFO: renamed from: c */
    public void mo1300c(Object obj) {
        this.f61254b++;
        ((InterfaceC3510qt) this.f61255c).mo1300c(obj);
    }

    @Override // p000.InterfaceC3510qt
    /* JADX INFO: renamed from: e */
    public void mo1301e() {
        ((InterfaceC3510qt) this.f61255c).mo1301e();
    }

    @Override // p000.InterfaceC3510qt
    /* JADX INFO: renamed from: f */
    public void mo1302f(int i, int i2, int i3) {
        int i4 = this.f61254b == 0 ? this.f61253a : 0;
        ((InterfaceC3510qt) this.f61255c).mo1302f(i + i4, i2 + i4, i3);
    }

    @Override // p000.InterfaceC3510qt
    /* JADX INFO: renamed from: g */
    public void mo1303g(Object obj, zi3 zi3Var) {
        ((InterfaceC3510qt) this.f61255c).mo1303g(obj, zi3Var);
    }

    @Override // p000.InterfaceC3510qt
    /* JADX INFO: renamed from: h */
    public void mo1304h(int i, int i2) {
        ((InterfaceC3510qt) this.f61255c).mo1304h(i + (this.f61254b == 0 ? this.f61253a : 0), i2);
    }

    @Override // p000.voa
    /* JADX INFO: renamed from: i */
    public AbstractC3081hn mo4033i(long j, AbstractC3081hn abstractC3081hn, AbstractC3081hn abstractC3081hn2, AbstractC3081hn abstractC3081hn3) {
        return ((ny8) this.f61255c).mo4033i(j, abstractC3081hn, abstractC3081hn2, abstractC3081hn3);
    }

    @Override // p000.mq6
    /* JADX INFO: renamed from: j */
    public int mo13407j(int i) {
        int iMo13407j = ((mq6) this.f61255c).mo13407j(i);
        if (i >= 0 && i <= this.f61254b) {
            qna.m20083c(iMo13407j, this.f61253a, i);
        }
        return iMo13407j;
    }

    @Override // p000.InterfaceC3510qt
    /* JADX INFO: renamed from: k */
    public void mo1305k() {
        if (this.f61254b <= 0) {
            cf1.m4605a("OffsetApplier up called with no corresponding down");
        }
        this.f61254b--;
        ((InterfaceC3510qt) this.f61255c).mo1305k();
    }

    @Override // p000.InterfaceC3510qt
    /* JADX INFO: renamed from: l */
    public void mo1306l(int i, Object obj) {
        ((InterfaceC3510qt) this.f61255c).mo1306l(i + (this.f61254b == 0 ? this.f61253a : 0), obj);
    }

    @Override // p000.InterfaceC3510qt
    /* JADX INFO: renamed from: n */
    public Object mo1307n() {
        return ((InterfaceC3510qt) this.f61255c).mo1307n();
    }

    @Override // p000.xoa
    /* JADX INFO: renamed from: o */
    public int mo4034o() {
        return this.f61254b;
    }

    @Override // p000.i02
    /* JADX INFO: renamed from: p */
    public j02 mo10703p() {
        return new q62(this.f61253a, this.f61254b, (bl2) this.f61255c);
    }

    @Override // p000.xoa
    /* JADX INFO: renamed from: q */
    public int mo4035q() {
        return this.f61253a;
    }

    @Override // p000.voa
    /* JADX INFO: renamed from: r */
    public AbstractC3081hn mo4036r(long j, AbstractC3081hn abstractC3081hn, AbstractC3081hn abstractC3081hn2, AbstractC3081hn abstractC3081hn3) {
        return ((ny8) this.f61255c).mo4036r(j, abstractC3081hn, abstractC3081hn2, abstractC3081hn3);
    }

    @Override // p000.mq6
    /* JADX INFO: renamed from: t */
    public int mo13411t(int i) {
        int iMo13411t = ((mq6) this.f61255c).mo13411t(i);
        if (i >= 0 && i <= this.f61253a) {
            qna.m20082b(iMo13411t, this.f61254b, i);
        }
        return iMo13411t;
    }

    /* JADX INFO: renamed from: u */
    public qc0 m21585u() {
        qc0 qc0Var = new qc0();
        qc0Var.f57553a = this.f61253a;
        qc0Var.f57554b = this.f61254b;
        qc0Var.f57555c = (String) this.f61255c;
        return qc0Var;
    }

    /* JADX INFO: renamed from: w */
    public synchronized int m21586w() {
        PackageInfo packageInfoM23949b;
        if (this.f61253a == 0) {
            try {
                packageInfoM23949b = m9b.m16702a((Context) this.f61255c).m23949b(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("Metadata", "Failed to find package ".concat(e.toString()));
                packageInfoM23949b = null;
            }
            if (packageInfoM23949b != null) {
                this.f61253a = packageInfoM23949b.versionCode;
            }
        }
        return this.f61253a;
    }

    /* JADX INFO: renamed from: x */
    public synchronized int m21587x() {
        int i = this.f61254b;
        if (i != 0) {
            return i;
        }
        Context context = (Context) this.f61255c;
        PackageManager packageManager = context.getPackageManager();
        if (m9b.m16702a(context).f66813a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
        intent.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers != null && !listQueryBroadcastReceivers.isEmpty()) {
            this.f61254b = 2;
            return 2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        this.f61254b = 2;
        return 2;
    }

    public sq6(mq6 mq6Var, int i, int i2) {
        this.f61255c = mq6Var;
        this.f61253a = i;
        this.f61254b = i2;
    }

    public sq6(int i, int i2, ui3 ui3Var) {
        this.f61253a = i;
        this.f61254b = i2;
        this.f61255c = ui3Var;
    }

    public sq6(int i, int i2, go2 go2Var) {
        this.f61253a = i;
        this.f61254b = i2;
        this.f61255c = new ny8(new n73(i, i2, go2Var));
    }
}
