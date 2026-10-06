package p000;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class iwh extends aei {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ iwi f32468a;

    public iwh(iwi iwiVar) {
        this.f32468a = iwiVar;
    }

    @Override // p000.aei
    /* JADX INFO: renamed from: a */
    public final void mo325a(View view, AccessibilityEvent accessibilityEvent) {
        super.mo325a(view, accessibilityEvent);
        accessibilityEvent.setClassName(this.f32468a.m11825b());
        accessibilityEvent.setChecked(this.f32468a.f32476g);
    }

    @Override // p000.aei
    /* JADX INFO: renamed from: b */
    public final void mo326b(View view, agt agtVar) {
        super.mo326b(view, agtVar);
        agtVar.m631i(this.f32468a.m11825b());
        agtVar.m629g(this.f32468a.f32477h);
        agtVar.m630h(this.f32468a.f32476g);
    }
}
