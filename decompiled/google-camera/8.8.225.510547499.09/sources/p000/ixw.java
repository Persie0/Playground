package p000;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.clockwork.common.wearable.wearmaterial.picker.CenteredRecyclerView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ixw extends C0831mq {

    /* JADX INFO: renamed from: d */
    public final CenteredRecyclerView f32612d;

    /* JADX INFO: renamed from: e */
    public final Runnable f32613e;

    /* JADX INFO: renamed from: f */
    public final Runnable f32614f;

    /* JADX INFO: renamed from: g */
    public boolean f32615g;

    /* JADX INFO: renamed from: h */
    public final int f32616h;

    /* JADX INFO: renamed from: i */
    public int f32617i;

    /* JADX INFO: renamed from: j */
    public final CharSequence f32618j;

    /* JADX INFO: renamed from: k */
    private aei f32619k;

    public ixw(CenteredRecyclerView centeredRecyclerView) {
        CharSequence charSequence;
        super(centeredRecyclerView);
        this.f32613e = new ith(this, 5);
        this.f32614f = new ith(this, 6);
        this.f32616h = -1;
        this.f32617i = 0;
        this.f32612d = centeredRecyclerView;
        Resources.Theme theme = centeredRecyclerView.getContext().getTheme();
        if (theme == null) {
            charSequence = null;
        } else {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(C0100R.attr.accessibilityActionForItemSelection, typedValue, true);
            charSequence = typedValue.string;
        }
        this.f32618j = charSequence == null ? centeredRecyclerView.getResources().getString(C0100R.string.wear_picker_a11y_action_select_item) : charSequence;
        kbd kbdVar = new kbd();
        centeredRecyclerView.m4611aD();
        centeredRecyclerView.f7484W.add(kbdVar);
        centeredRecyclerView.m1247aw(new ixu(this));
    }

    /* JADX INFO: renamed from: m */
    private final void m11877m() {
        this.f32612d.m4611aD();
    }

    @Override // p000.C0831mq, p000.aei
    /* JADX INFO: renamed from: b */
    public final void mo326b(View view, agt agtVar) {
        super.mo326b(view, agtVar);
        AbstractC0812ly abstractC0812ly = this.f32612d.f1124n;
        if (abstractC0812ly instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) abstractC0812ly;
            int i = linearLayoutManager.f1048i;
            int iM16165al = linearLayoutManager.m16165al();
            int i2 = 1 != i ? 1 : iM16165al;
            if (1 == i) {
                iM16165al = 1;
            }
            agtVar.m633k(bkn.m2549A(i2, iM16165al, 1));
            this.f32612d.m4611aD();
            agtVar.m642t(agr.f338n);
            agtVar.m642t(agr.f337m);
        }
    }

    @Override // p000.aei
    /* JADX INFO: renamed from: g */
    public final boolean mo331g(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        int iM1251c = this.f32612d.m1251c(view);
        this.f32612d.m4611aD();
        switch (accessibilityEvent.getEventType()) {
            case 128:
                return iM1251c == -1;
            case 32768:
                this.f32612d.removeCallbacks(this.f32614f);
                int i = this.f32617i;
                this.f32615g = true;
                return i != 0;
            case 65536:
                this.f32612d.removeCallbacks(this.f32614f);
                this.f32612d.post(this.f32614f);
                return true;
            default:
                return true;
        }
    }

    @Override // p000.C0831mq
    /* JADX INFO: renamed from: j */
    public final aei mo1780j() {
        if (this.f32619k == null) {
            this.f32619k = new ixv(this);
        }
        return this.f32619k;
    }

    @Override // p000.C0831mq, p000.aei
    /* JADX INFO: renamed from: h */
    public final boolean mo332h(View view, int i, Bundle bundle) {
        switch (i) {
            case 4096:
                m11877m();
                return false;
            case 8192:
                m11877m();
                return false;
            default:
                return super.mo332h(view, i, bundle);
        }
    }
}
