package androidx.recyclerview.widget;

import android.annotation.SuppressLint;

/* JADX INFO: renamed from: androidx.recyclerview.widget.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1148e implements InterfaceC1171v {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1171v f7245a;

    /* JADX INFO: renamed from: b */
    public int f7246b = 0;

    /* JADX INFO: renamed from: c */
    public int f7247c = -1;

    /* JADX INFO: renamed from: d */
    public int f7248d = -1;

    /* JADX INFO: renamed from: e */
    public Object f7249e = null;

    public C1148e(InterfaceC1171v interfaceC1171v) {
        this.f7245a = interfaceC1171v;
    }

    @Override // androidx.recyclerview.widget.InterfaceC1171v
    /* JADX INFO: renamed from: a */
    public final void mo4426a(int i10, int i11) {
        m4449e();
        this.f7245a.mo4426a(i10, i11);
    }

    @Override // androidx.recyclerview.widget.InterfaceC1171v
    /* JADX INFO: renamed from: b */
    public final void mo4427b(int i10, int i11) {
        int i12;
        if (this.f7246b == 1 && i10 >= (i12 = this.f7247c)) {
            int i13 = this.f7248d;
            if (i10 <= i12 + i13) {
                this.f7248d = i13 + i11;
                this.f7247c = Math.min(i10, i12);
                return;
            }
        }
        m4449e();
        this.f7247c = i10;
        this.f7248d = i11;
        this.f7246b = 1;
    }

    @Override // androidx.recyclerview.widget.InterfaceC1171v
    /* JADX INFO: renamed from: c */
    public final void mo4428c(int i10, int i11) {
        int i12;
        if (this.f7246b == 2 && (i12 = this.f7247c) >= i10 && i12 <= i10 + i11) {
            this.f7248d += i11;
            this.f7247c = i10;
        } else {
            m4449e();
            this.f7247c = i10;
            this.f7248d = i11;
            this.f7246b = 2;
        }
    }

    @Override // androidx.recyclerview.widget.InterfaceC1171v
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: d */
    public final void mo4429d(int i10, int i11, Object obj) {
        int i12;
        if (this.f7246b == 3) {
            int i13 = this.f7247c;
            int i14 = this.f7248d;
            if (i10 <= i13 + i14 && (i12 = i10 + i11) >= i13 && this.f7249e == obj) {
                this.f7247c = Math.min(i10, i13);
                this.f7248d = Math.max(i14 + i13, i12) - this.f7247c;
                return;
            }
        }
        m4449e();
        this.f7247c = i10;
        this.f7248d = i11;
        this.f7249e = obj;
        this.f7246b = 3;
    }

    /* JADX INFO: renamed from: e */
    public final void m4449e() {
        int i10 = this.f7246b;
        if (i10 == 0) {
            return;
        }
        InterfaceC1171v interfaceC1171v = this.f7245a;
        if (i10 == 1) {
            interfaceC1171v.mo4427b(this.f7247c, this.f7248d);
        } else if (i10 == 2) {
            interfaceC1171v.mo4428c(this.f7247c, this.f7248d);
        } else if (i10 == 3) {
            interfaceC1171v.mo4429d(this.f7247c, this.f7248d, this.f7249e);
        }
        this.f7249e = null;
        this.f7246b = 0;
    }
}
