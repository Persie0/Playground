package p060d1;

import android.view.MotionEvent;
import dm.C5207g;
import p260m8.C7499b;

/* JADX INFO: renamed from: d1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C5021h {

    /* JADX INFO: renamed from: a */
    public static final C5021h f32822a = new C5021h();

    /* JADX INFO: renamed from: a */
    public final long m10704a(MotionEvent motionEvent, int i10) {
        C5207g.m11111f(motionEvent, "motionEvent");
        return C7499b.m14932c(motionEvent.getRawX(i10), motionEvent.getRawY(i10));
    }
}
