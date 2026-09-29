package p000;

import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fg7 {

    /* JADX INFO: renamed from: a */
    public final List f39071a;

    /* JADX INFO: renamed from: b */
    public final x44 f39072b;

    /* JADX INFO: renamed from: c */
    public final int f39073c;

    /* JADX INFO: renamed from: d */
    public final int f39074d;

    /* JADX INFO: renamed from: e */
    public final int f39075e;

    /* JADX INFO: renamed from: f */
    public int f39076f;

    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    public fg7(List list, x44 x44Var) {
        this.f39071a = list;
        this.f39072b = x44Var;
        MotionEvent motionEventM11827a = m11827a();
        int i = 0;
        this.f39073c = motionEventM11827a != null ? motionEventM11827a.getClassification() : 0;
        MotionEvent motionEventM11827a2 = m11827a();
        this.f39074d = motionEventM11827a2 != null ? motionEventM11827a2.getButtonState() : 0;
        MotionEvent motionEventM11827a3 = m11827a();
        this.f39075e = motionEventM11827a3 != null ? motionEventM11827a3.getMetaState() : 0;
        MotionEvent motionEventM11827a4 = m11827a();
        if (motionEventM11827a4 != null) {
            boolean z = motionEventM11827a4.getClassification() == 3;
            boolean z2 = motionEventM11827a4.getClassification() == 5;
            int actionMasked = motionEventM11827a4.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 5:
                                if (z) {
                                    i = 10;
                                } else if (!z2) {
                                    i = 1;
                                } else {
                                    i = 8;
                                }
                                break;
                            case 6:
                                if (z) {
                                    i = 12;
                                } else if (!z2) {
                                    i = 2;
                                } else {
                                    i = 8;
                                }
                                break;
                            case 7:
                                if (z) {
                                    i = 11;
                                } else if (!z2) {
                                    i = 3;
                                } else {
                                    i = 8;
                                }
                                break;
                            case 8:
                                i = 6;
                                break;
                            case 9:
                                i = 4;
                                break;
                            case 10:
                                i = 5;
                                break;
                        }
                    } else if (z) {
                        i = 11;
                    } else if (!z2) {
                        i = 8;
                    } else {
                        i = 3;
                    }
                } else if (z) {
                    i = 12;
                } else if (z2) {
                    i = 9;
                } else {
                    i = 2;
                }
            } else if (z) {
                i = 10;
            } else if (z2) {
                i = 7;
            } else {
                i = 1;
            }
        } else {
            int size = list.size();
            while (true) {
                if (i < size) {
                    kg7 kg7Var = (kg7) list.get(i);
                    if (ci8.m4725j(kg7Var)) {
                        i = 2;
                    } else if (ci8.m4723h(kg7Var)) {
                        i = 1;
                    } else {
                        i++;
                    }
                } else {
                    i = 3;
                }
            }
        }
        this.f39076f = i;
    }

    /* JADX INFO: renamed from: a */
    public final MotionEvent m11827a() {
        x44 x44Var = this.f39072b;
        if (x44Var != null) {
            return (MotionEvent) ((fs6) x44Var.f67753d).f39591c;
        }
        return null;
    }
}
