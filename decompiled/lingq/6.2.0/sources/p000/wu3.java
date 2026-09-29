package p000;

import android.view.View;
import com.lingq.p020ui.HomeFragment;

/* JADX INFO: loaded from: classes3.dex */
public final class wu3 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67295a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f67296b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ HomeFragment f67297c;

    public wu3(int i, String str, HomeFragment homeFragment) {
        this.f67295a = i;
        this.f67296b = str;
        this.f67297c = homeFragment;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        j96.Companion.getClass();
        jfa.m14428k(b34.m3244j(this.f67297c), i96.m13736a(this.f67296b, this.f67295a, ""), null);
    }
}
