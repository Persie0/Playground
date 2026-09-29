package p000;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class c36 {

    /* JADX INFO: renamed from: a */
    public static final c36 f9413a = new c36();

    /* JADX INFO: renamed from: a */
    public final boolean m4298a(MotionEvent motionEvent, int i) {
        return (Float.floatToRawIntBits(motionEvent.getRawX(i)) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY(i)) & Integer.MAX_VALUE) < 2139095040;
    }
}
