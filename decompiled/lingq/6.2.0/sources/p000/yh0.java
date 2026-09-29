package p000;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class yh0 implements wh0, gr6 {

    /* JADX INFO: renamed from: a */
    public int f69834a;

    /* JADX INFO: renamed from: b */
    public int f69835b;

    /* JADX INFO: renamed from: c */
    public int f69836c;

    /* JADX INFO: renamed from: d */
    public int f69837d;

    /* JADX INFO: renamed from: e */
    public Object f69838e;

    @Override // p000.wh0
    /* JADX INFO: renamed from: a */
    public int mo10553a() {
        return -1;
    }

    @Override // p000.wh0
    /* JADX INFO: renamed from: b */
    public int mo10554b() {
        return this.f69834a;
    }

    @Override // p000.wh0
    /* JADX INFO: renamed from: c */
    public int mo10555c() {
        k47 k47Var = (k47) this.f69838e;
        int i = this.f69835b;
        if (i == 8) {
            return k47Var.m14842z();
        }
        if (i == 16) {
            return k47Var.m14812G();
        }
        int i2 = this.f69836c;
        this.f69836c = i2 + 1;
        if (i2 % 2 != 0) {
            return this.f69837d & 15;
        }
        int iM14842z = k47Var.m14842z();
        this.f69837d = iM14842z;
        return (iM14842z & 240) >> 4;
    }

    /* JADX INFO: renamed from: d */
    public long m25142d() {
        int i = this.f69836c;
        if (i == 0) {
            uk9.m22784s();
            return 0L;
        }
        long[] jArr = (long[]) this.f69838e;
        int i2 = this.f69834a;
        long j = jArr[i2];
        this.f69834a = this.f69837d & (i2 + 1);
        this.f69836c = i - 1;
        return j;
    }

    @Override // p000.gr6
    /* JADX INFO: renamed from: s */
    public f6b mo1889s(View view, f6b f6bVar) {
        View view2 = (View) this.f69838e;
        l64 l64VarMo136i = f6bVar.f38536a.mo136i(519);
        int i = this.f69834a;
        if (i >= 0) {
            view2.getLayoutParams().height = i + l64VarMo136i.f49117b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(this.f69835b + l64VarMo136i.f49116a, this.f69836c + l64VarMo136i.f49117b, this.f69837d + l64VarMo136i.f49118c, view2.getPaddingBottom());
        return f6bVar;
    }
}
