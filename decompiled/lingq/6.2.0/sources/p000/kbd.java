package p000;

import android.view.DragEvent;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kbd {

    /* JADX INFO: renamed from: a */
    public static p04 f46990a;

    /* JADX INFO: renamed from: a */
    public static final long m15081a(hi8 hi8Var) {
        DragEvent dragEvent = (DragEvent) hi8Var.f42410b;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
    }
}
