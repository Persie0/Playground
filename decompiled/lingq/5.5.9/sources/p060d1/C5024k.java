package p060d1;

import android.view.MotionEvent;
import dm.C5207g;
import java.util.List;
import p338qd.C8573r0;

/* JADX INFO: renamed from: d1.k */
/* JADX INFO: loaded from: classes.dex */
public final class C5024k {

    /* JADX INFO: renamed from: a */
    public final List<C5028o> f32832a;

    /* JADX INFO: renamed from: b */
    public int f32833b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5024k(List<C5028o> list) {
        this(list, null);
        C5207g.m11111f(list, "changes");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0068  */
    public C5024k(List<C5028o> list, C5019f c5019f) {
        C5207g.m11111f(list, "changes");
        this.f32832a = list;
        MotionEvent motionEvent = null;
        MotionEvent motionEvent2 = c5019f != null ? ((C5030q) c5019f.f32815d).f32852b : null;
        int i10 = 0;
        if (motionEvent2 != null) {
            motionEvent2.getButtonState();
        }
        MotionEvent motionEvent3 = c5019f != null ? ((C5030q) c5019f.f32815d).f32852b : null;
        if (motionEvent3 != null) {
            motionEvent3.getMetaState();
        }
        motionEvent = c5019f != null ? ((C5030q) c5019f.f32815d).f32852b : motionEvent;
        int i11 = 1;
        if (motionEvent != null) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                i10 = 1;
            } else {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 5:
                                i10 = 1;
                                break;
                            case 8:
                                i10 = 6;
                                break;
                            case 9:
                                i10 = 4;
                                break;
                            case 10:
                                i10 = 5;
                                break;
                        }
                    }
                    i10 = 3;
                }
                i10 = 2;
            }
            i11 = i10;
        } else {
            int size = list.size();
            while (i10 < size) {
                C5028o c5028o = list.get(i10);
                if (C8573r0.m16677I(c5028o)) {
                    i11 = 2;
                } else if (!C8573r0.m16675H(c5028o)) {
                    i10++;
                }
            }
            i11 = 3;
        }
        this.f32833b = i11;
    }
}
