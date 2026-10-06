package p000;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.clockwork.common.wearable.wearmaterial.button.WearChipButton;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class iwp extends aei {

    /* JADX INFO: renamed from: a */
    private final WearChipButton f32496a;

    public iwp(WearChipButton wearChipButton) {
        this.f32496a = wearChipButton;
    }

    /* JADX INFO: renamed from: k */
    private final void m11829k(AccessibilityEvent accessibilityEvent) {
        iwo iwoVarMo11828j = mo11828j();
        accessibilityEvent.setClassName(iwoVarMo11828j.f32493a);
        if (iwoVarMo11828j.f32494b.length() > 0) {
            accessibilityEvent.getText().add(iwoVarMo11828j.f32494b);
        }
        if (iwoVarMo11828j.f32495c.length() > 0) {
            accessibilityEvent.getText().add(iwoVarMo11828j.f32495c);
        }
        accessibilityEvent.setChecked(this.f32496a.f32476g);
    }

    @Override // p000.aei
    /* JADX INFO: renamed from: a */
    public final void mo325a(View view, AccessibilityEvent accessibilityEvent) {
        super.mo325a(view, accessibilityEvent);
        m11829k(accessibilityEvent);
    }

    @Override // p000.aei
    /* JADX INFO: renamed from: b */
    public final void mo326b(View view, agt agtVar) {
        CharSequence charSequence;
        super.mo326b(view, agtVar);
        iwo iwoVarMo11828j = mo11828j();
        agtVar.m631i(iwoVarMo11828j.f32493a);
        if (iwoVarMo11828j.f32494b.length() == 0) {
            charSequence = null;
        } else if (iwoVarMo11828j.f32495c.length() == 0) {
            charSequence = iwoVarMo11828j.f32494b;
        } else {
            charSequence = iwoVarMo11828j.f32494b.toString() + ", " + iwoVarMo11828j.f32495c.toString();
        }
        agtVar.f355a.setText(charSequence);
        agtVar.m629g(this.f32496a.f32477h);
        agtVar.m630h(this.f32496a.f32476g);
    }

    @Override // p000.aei
    /* JADX INFO: renamed from: c */
    public final void mo327c(View view, AccessibilityEvent accessibilityEvent) {
        super.mo327c(view, accessibilityEvent);
        m11829k(accessibilityEvent);
    }

    /* JADX INFO: renamed from: j */
    public abstract iwo mo11828j();
}
