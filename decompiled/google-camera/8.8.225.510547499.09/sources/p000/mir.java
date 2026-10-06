package p000;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mir extends aei {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ CheckableImageButton f40638a;

    public mir(CheckableImageButton checkableImageButton) {
        this.f40638a = checkableImageButton;
    }

    @Override // p000.aei
    /* JADX INFO: renamed from: a */
    public final void mo325a(View view, AccessibilityEvent accessibilityEvent) {
        super.mo325a(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.f40638a.f8166a);
    }

    @Override // p000.aei
    /* JADX INFO: renamed from: b */
    public final void mo326b(View view, agt agtVar) {
        super.mo326b(view, agtVar);
        agtVar.m629g(this.f40638a.f8167b);
        agtVar.m630h(this.f40638a.f8166a);
    }
}
