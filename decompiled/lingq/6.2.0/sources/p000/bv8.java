package p000;

import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class bv8 {

    /* JADX INFO: renamed from: a */
    public static final ij6 f9055a = p84.f55748j;

    /* JADX INFO: renamed from: a */
    public static final boolean m4195a(fg7 fg7Var) {
        MotionEvent motionEventM11827a;
        List list = fg7Var.f39071a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((kg7) list.get(i)).f47243i != 2) {
                MotionEvent motionEventM11827a2 = fg7Var.m11827a();
                if ((motionEventM11827a2 == null || !motionEventM11827a2.isFromSource(8194)) && ((motionEventM11827a = fg7Var.m11827a()) == null || !motionEventM11827a.isFromSource(1048584))) {
                    return false;
                }
            }
        }
        return true;
    }
}
