package p000;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import com.google.common.base.AbstractC1083c;

/* JADX INFO: renamed from: jy */
/* JADX INFO: loaded from: classes.dex */
public final class C3164jy {

    /* JADX INFO: renamed from: a */
    public final on9 f46371a;

    /* JADX INFO: renamed from: b */
    public final Handler f46372b;

    /* JADX INFO: renamed from: c */
    public rw2 f46373c;

    /* JADX INFO: renamed from: d */
    public C3476px f46374d;

    /* JADX INFO: renamed from: f */
    public int f46376f;

    /* JADX INFO: renamed from: h */
    public C3315ly f46378h;

    /* JADX INFO: renamed from: g */
    public float f46377g = 1.0f;

    /* JADX INFO: renamed from: e */
    public int f46375e = 0;

    public C3164jy(Context context, Looper looper, rw2 rw2Var) {
        this.f46371a = AbstractC1083c.m6269a(new C3127iy(context, 0));
        this.f46373c = rw2Var;
        this.f46372b = new Handler(looper);
    }

    /* JADX INFO: renamed from: a */
    public final void m14741a() {
        int i = this.f46375e;
        if (i == 1 || i == 0 || this.f46378h == null) {
            return;
        }
        ((AudioManager) this.f46371a.get()).abandonAudioFocusRequest(this.f46378h.m16570b());
    }

    /* JADX INFO: renamed from: b */
    public final void m14742b(int i) {
        rw2 rw2Var = this.f46373c;
        if (rw2Var != null) {
            qp9 qp9Var = rw2Var.f59932h;
            qp9Var.getClass();
            pp9 pp9VarM20096b = qp9.m20096b();
            pp9VarM20096b.f56637a = qp9Var.f58033a.obtainMessage(33, i, 0);
            pp9VarM20096b.m19440b();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m14743c(int i) {
        if (this.f46375e == i) {
            return;
        }
        this.f46375e = i;
        float f = i == 4 ? 0.2f : 1.0f;
        if (this.f46377g == f) {
            return;
        }
        this.f46377g = f;
        rw2 rw2Var = this.f46373c;
        if (rw2Var != null) {
            rw2Var.f59932h.m20100e(34);
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m14744d(int i, boolean z) {
        int i2;
        int i3 = 0;
        if (i == 1 || (i2 = this.f46376f) != 1) {
            m14741a();
            m14743c(0);
            return 1;
        }
        int i4 = this.f46375e;
        if (z) {
            if (i4 != 2) {
                C3315ly c3315ly = this.f46378h;
                if (c3315ly == null) {
                    C3278ky c3278ky = c3315ly == null ? new C3278ky(i2) : c3315ly.m16569a();
                    C3476px c3476px = this.f46374d;
                    boolean z2 = c3476px != null && c3476px.f56935a == 1;
                    c3476px.getClass();
                    c3278ky.m15724c(c3476px);
                    c3278ky.m15726e(z2);
                    c3278ky.m15723b();
                    c3278ky.m15725d(new C3092hy(this, i3), this.f46372b);
                    this.f46378h = c3278ky.m15722a();
                }
                int iRequestAudioFocus = ((AudioManager) this.f46371a.get()).requestAudioFocus(this.f46378h.m16570b());
                if (iRequestAudioFocus == 1 || iRequestAudioFocus == 2) {
                    m14743c(2);
                    return 1;
                }
                m14743c(1);
                return -1;
            }
        } else {
            if (i4 == 1) {
                return -1;
            }
            if (i4 == 3) {
                return 0;
            }
        }
        return 1;
    }
}
