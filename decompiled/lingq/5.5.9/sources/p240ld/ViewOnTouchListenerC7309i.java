package p240ld;

import android.view.MotionEvent;
import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.lesson.page.LessonPageFragment;
import dm.C5207g;

/* JADX INFO: renamed from: ld.i */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnTouchListenerC7309i implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40933a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f40934b;

    public /* synthetic */ ViewOnTouchListenerC7309i(int i10, Object obj) {
        this.f40933a = i10;
        this.f40934b = obj;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.f40933a;
        Object obj = this.f40934b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C7312l c7312l = (C7312l) obj;
                c7312l.getClass();
                if (motionEvent.getAction() == 1) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - c7312l.f40947o;
                    if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
                        c7312l.f40945m = false;
                    }
                    c7312l.m14713u();
                    c7312l.f40945m = true;
                    c7312l.f40947o = System.currentTimeMillis();
                }
                break;
            default:
                LessonPageFragment lessonPageFragment = (LessonPageFragment) obj;
                LessonPageFragment.C4337a c4337a = LessonPageFragment.f28335M0;
                C5207g.m11111f(lessonPageFragment, "this$0");
                C5207g.m11110e(motionEvent, "event");
                lessonPageFragment.m10194u0(motionEvent);
                lessonPageFragment.m10190q0();
                break;
        }
        return false;
    }
}
