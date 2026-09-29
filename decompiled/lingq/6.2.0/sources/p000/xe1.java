package p000;

import android.util.SparseBooleanArray;
import com.google.android.datatransport.Priority;
import com.google.android.gms.internal.play_billing.AbstractC0985a;
import com.google.android.gms.internal.play_billing.C1015z;

/* JADX INFO: loaded from: classes.dex */
public class xe1 {

    /* JADX INFO: renamed from: a */
    public boolean f68116a;

    /* JADX INFO: renamed from: b */
    public Object f68117b;

    public xe1() {
        this.f68117b = new SparseBooleanArray();
    }

    /* JADX INFO: renamed from: a */
    public void m24468a(int i) {
        bna.m3987z(!this.f68116a);
        ((SparseBooleanArray) this.f68117b).append(i, true);
    }

    /* JADX INFO: renamed from: b */
    public t63 m24469b() {
        bna.m3987z(!this.f68116a);
        this.f68116a = true;
        return new t63((SparseBooleanArray) this.f68117b);
    }

    /* JADX INFO: renamed from: c */
    public void m24470c() {
        this.f68116a = false;
    }

    /* JADX INFO: renamed from: d */
    public void mo3678d(byte b) {
        ((C3126ix) this.f68117b).m14178n(String.valueOf(b));
    }

    /* JADX INFO: renamed from: e */
    public void m24471e(char c) {
        C3126ix c3126ix = (C3126ix) this.f68117b;
        c3126ix.m14171g(c3126ix.f44720b, 1);
        char[] cArr = (char[]) c3126ix.f44721c;
        int i = c3126ix.f44720b;
        c3126ix.f44720b = i + 1;
        cArr[i] = c;
    }

    /* JADX INFO: renamed from: f */
    public void mo3679f(int i) {
        ((C3126ix) this.f68117b).m14178n(String.valueOf(i));
    }

    /* JADX INFO: renamed from: g */
    public void mo3680g(long j) {
        ((C3126ix) this.f68117b).m14178n(String.valueOf(j));
    }

    /* JADX INFO: renamed from: h */
    public void m24472h(String str) {
        str.getClass();
        ((C3126ix) this.f68117b).m14178n(str);
    }

    /* JADX INFO: renamed from: i */
    public void mo3681i(short s) {
        ((C3126ix) this.f68117b).m14178n(String.valueOf(s));
    }

    /* JADX INFO: renamed from: j */
    public void mo339j(String str) {
        byte b;
        str.getClass();
        C3126ix c3126ix = (C3126ix) this.f68117b;
        c3126ix.m14171g(c3126ix.f44720b, str.length() + 2);
        char[] cArr = (char[]) c3126ix.f44721c;
        int i = c3126ix.f44720b;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        int i4 = i2;
        while (i4 < i3) {
            char c = cArr[i4];
            byte[] bArr = rk9.f59449b;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i5 = i4 - i2; i5 < length2; i5++) {
                    c3126ix.m14171g(i4, 2);
                    char cCharAt = str.charAt(i5);
                    byte[] bArr2 = rk9.f59449b;
                    if (cCharAt >= bArr2.length || (b = bArr2[cCharAt]) == 0) {
                        int i6 = i4 + 1;
                        ((char[]) c3126ix.f44721c)[i4] = cCharAt;
                        i4 = i6;
                    } else if (b == 1) {
                        String str2 = rk9.f59448a[cCharAt];
                        str2.getClass();
                        c3126ix.m14171g(i4, str2.length());
                        str2.getChars(0, str2.length(), (char[]) c3126ix.f44721c, i4);
                        int length3 = str2.length() + i4;
                        c3126ix.f44720b = length3;
                        i4 = length3;
                    } else {
                        char[] cArr2 = (char[]) c3126ix.f44721c;
                        cArr2[i4] = '\\';
                        cArr2[i4 + 1] = (char) b;
                        i4 += 2;
                        c3126ix.f44720b = i4;
                    }
                }
                c3126ix.m14171g(i4, 1);
                ((char[]) c3126ix.f44721c)[i4] = '\"';
                c3126ix.f44720b = i4 + 1;
                return;
            }
            i4++;
        }
        cArr[i3] = '\"';
        c3126ix.f44720b = i3 + 1;
    }

    /* JADX INFO: renamed from: k */
    public void m24473k() {
    }

    /* JADX INFO: renamed from: l */
    public void m24474l() {
    }

    /* JADX INFO: renamed from: m */
    public void m24475m(C1015z c1015z) {
        if (this.f68116a) {
            AbstractC0985a.m5508i("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((hba) this.f68117b).m13185a(new j40(c1015z, Priority.DEFAULT, null), new uk9(8));
        } catch (Throwable unused) {
            AbstractC0985a.m5508i("BillingLogger", "logging failed.");
        }
    }

    public /* synthetic */ xe1(Object obj) {
        this.f68117b = obj;
        this.f68116a = true;
    }
}
