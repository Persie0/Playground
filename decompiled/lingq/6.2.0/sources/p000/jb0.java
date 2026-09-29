package p000;

import androidx.compose.foundation.text.C0180h;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jb0 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45368a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0180h f45369b;

    public /* synthetic */ jb0(C0180h c0180h, int i) {
        this.f45368a = i;
        this.f45369b = c0180h;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        qw9 qw9Var;
        int i = this.f45368a;
        int i2 = 2;
        C0180h c0180h = this.f45369b;
        switch (i) {
            case 0:
                return Boolean.valueOf(c0180h != null ? ((Boolean) new jb0(c0180h, i2).mo0a()).booleanValue() : false);
            case 1:
                return Boolean.valueOf(c0180h != null ? ((Boolean) new jb0(c0180h, i2).mo0a()).booleanValue() : false);
            default:
                C3419on c3419on = c0180h.f2908b;
                rw9 rw9Var = (rw9) ((xc9) c0180h.f2907a).getValue();
                return Boolean.valueOf(fa4.m11650l(c3419on, (rw9Var == null || (qw9Var = rw9Var.f59975a) == null) ? null : qw9Var.f58295a));
        }
    }
}
