package p000;

import android.text.TextUtils;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mmb {

    /* JADX INFO: renamed from: a */
    public Object f41010a;

    /* JADX INFO: renamed from: b */
    public CharSequence f41011b;

    /* JADX INFO: renamed from: c */
    public CharSequence f41012c;

    /* JADX INFO: renamed from: e */
    public View f41014e;

    /* JADX INFO: renamed from: g */
    public TabLayout f41016g;

    /* JADX INFO: renamed from: h */
    public mmd f41017h;

    /* JADX INFO: renamed from: d */
    public int f41013d = -1;

    /* JADX INFO: renamed from: f */
    public final int f41015f = 1;

    /* JADX INFO: renamed from: i */
    public int f41018i = -1;

    /* JADX INFO: renamed from: a */
    public final void m16616a() {
        TabLayout tabLayout = this.f41016g;
        if (tabLayout == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        tabLayout.m4863h(this);
    }

    /* JADX INFO: renamed from: b */
    public final void m16617b() {
        mmd mmdVar = this.f41017h;
        if (mmdVar != null) {
            mmdVar.m16621b();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m16618c(CharSequence charSequence) {
        if (TextUtils.isEmpty(this.f41012c) && !TextUtils.isEmpty(charSequence)) {
            this.f41017h.setContentDescription(charSequence);
        }
        this.f41011b = charSequence;
        m16617b();
    }
}
