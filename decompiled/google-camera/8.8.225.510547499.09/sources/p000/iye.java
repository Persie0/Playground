package p000;

import android.view.MotionEvent;
import com.google.android.clockwork.common.wearable.wearmaterial.picker.WearPickerColumn;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iye implements InterfaceC0816mb {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ WearPickerColumn f32637a;

    /* JADX INFO: renamed from: b */
    private boolean f32638b;

    public iye(WearPickerColumn wearPickerColumn) {
        this.f32637a = wearPickerColumn;
    }

    @Override // p000.InterfaceC0816mb
    /* JADX INFO: renamed from: A */
    public final void mo11897A(MotionEvent motionEvent) {
    }

    @Override // p000.InterfaceC0816mb
    /* JADX INFO: renamed from: y */
    public final boolean mo11898y(MotionEvent motionEvent) {
        if (this.f32637a.isActivated() || this.f32637a.f7503b.m13099e()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f32638b = true;
            action = 0;
        }
        if (this.f32638b && this.f32637a.f7502a.onTouchEvent(motionEvent)) {
            this.f32638b = false;
            this.f32637a.callOnClick();
        }
        if (action == 1 || action == 3) {
            this.f32638b = false;
        }
        return false;
    }

    @Override // p000.InterfaceC0816mb
    /* JADX INFO: renamed from: z */
    public final void mo11899z() {
    }
}
