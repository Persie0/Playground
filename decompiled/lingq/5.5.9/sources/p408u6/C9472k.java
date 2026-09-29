package p408u6;

import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0955h0;
import androidx.fragment.app.AbstractC0963l0;
import androidx.fragment.app.C0940a;
import androidx.fragment.app.C0949e0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.view.Lifecycle;
import java.util.ArrayList;

/* JADX INFO: renamed from: u6.k */
/* JADX INFO: loaded from: classes.dex */
public final class C9472k extends AbstractC0955h0 {

    /* JADX INFO: renamed from: h */
    public final Fragment[] f48562h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f48563i;

    public C9472k(C0949e0 c0949e0, int i10) {
        super(c0949e0);
        this.f48563i = new ArrayList();
        this.f48562h = new Fragment[i10];
    }

    @Override // p499y4.AbstractC10290a
    /* JADX INFO: renamed from: c */
    public final int mo17877c() {
        return this.f48562h.length;
    }

    @Override // p499y4.AbstractC10290a
    /* JADX INFO: renamed from: d */
    public final CharSequence mo17890d(int i10) {
        return (CharSequence) this.f48563i.get(i10);
    }

    @Override // p499y4.AbstractC10290a
    /* JADX INFO: renamed from: e */
    public final Object mo17878e(ViewGroup viewGroup, int i10) {
        C0940a c0940a = this.f6302e;
        FragmentManager fragmentManager = this.f6300c;
        if (c0940a == null) {
            fragmentManager.getClass();
            this.f6302e = new C0940a(fragmentManager);
        }
        long j10 = i10;
        Fragment fragmentM3616D = fragmentManager.m3616D("android:switcher:" + viewGroup.getId() + ":" + j10);
        Fragment[] fragmentArr = this.f48562h;
        if (fragmentM3616D != null) {
            C0940a c0940a2 = this.f6302e;
            c0940a2.getClass();
            c0940a2.m3774c(new AbstractC0963l0.a(7, fragmentM3616D));
        } else {
            fragmentM3616D = fragmentArr[i10];
            this.f6302e.mo3695f(viewGroup.getId(), fragmentM3616D, "android:switcher:" + viewGroup.getId() + ":" + j10, 1);
        }
        if (fragmentM3616D != this.f6303f) {
            if (fragmentM3616D.f6088Z) {
                fragmentM3616D.f6088Z = false;
            }
            if (this.f6301d == 1) {
                this.f6302e.m3701m(fragmentM3616D, Lifecycle.State.STARTED);
            } else {
                fragmentM3616D.m3593k0(false);
            }
        }
        fragmentArr[i10] = fragmentM3616D;
        return fragmentM3616D;
    }
}
