package p000;

import android.view.View;
import com.google.android.apps.camera.rectiface.jni.cxx.hsSUWRJfoeC;

/* JADX INFO: renamed from: kx */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0784kx {

    /* JADX INFO: renamed from: a */
    public AbstractC0803lp f37590a;

    /* JADX INFO: renamed from: b */
    public int f37591b;

    /* JADX INFO: renamed from: c */
    public int f37592c;

    /* JADX INFO: renamed from: d */
    public boolean f37593d;

    /* JADX INFO: renamed from: e */
    public boolean f37594e;

    public C0784kx() {
        m14953d();
    }

    /* JADX INFO: renamed from: a */
    public final void m14950a() {
        this.f37592c = this.f37593d ? this.f37590a.mo15751f() : this.f37590a.mo15755j();
    }

    /* JADX INFO: renamed from: b */
    public final void m14951b(View view, int i) {
        if (this.f37593d) {
            this.f37592c = this.f37590a.mo15746a(view) + this.f37590a.m15799o();
        } else {
            this.f37592c = this.f37590a.mo15749d(view);
        }
        this.f37591b = i;
    }

    /* JADX INFO: renamed from: c */
    public final void m14952c(View view, int i) {
        int iM15799o = this.f37590a.m15799o();
        if (iM15799o >= 0) {
            m14951b(view, i);
            return;
        }
        this.f37591b = i;
        if (this.f37593d) {
            int iMo15751f = (this.f37590a.mo15751f() - iM15799o) - this.f37590a.mo15746a(view);
            this.f37592c = this.f37590a.mo15751f() - iMo15751f;
            if (iMo15751f > 0) {
                int iMo15747b = this.f37592c - this.f37590a.mo15747b(view);
                int iMo15755j = this.f37590a.mo15755j();
                int iMin = iMo15747b - (iMo15755j + Math.min(this.f37590a.mo15749d(view) - iMo15755j, 0));
                if (iMin < 0) {
                    this.f37592c += Math.min(iMo15751f, -iMin);
                    return;
                }
                return;
            }
            return;
        }
        int iMo15749d = this.f37590a.mo15749d(view);
        int iMo15755j2 = iMo15749d - this.f37590a.mo15755j();
        this.f37592c = iMo15749d;
        if (iMo15755j2 > 0) {
            int iMo15751f2 = (this.f37590a.mo15751f() - Math.min(0, (this.f37590a.mo15751f() - iM15799o) - this.f37590a.mo15746a(view))) - (iMo15749d + this.f37590a.mo15747b(view));
            if (iMo15751f2 < 0) {
                this.f37592c -= Math.min(iMo15755j2, -iMo15751f2);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m14953d() {
        this.f37591b = -1;
        this.f37592c = Integer.MIN_VALUE;
        this.f37593d = false;
        this.f37594e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f37591b + hsSUWRJfoeC.IOeKtdsz + this.f37592c + ", mLayoutFromEnd=" + this.f37593d + ", mValid=" + this.f37594e + '}';
    }
}
