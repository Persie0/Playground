package p512yi;

import android.view.MotionEvent;
import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.lesson.page.LessonPageFragment;
import dm.C5207g;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: renamed from: yi.g */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnTouchListenerC10379g implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52147a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f52148b;

    public /* synthetic */ ViewOnTouchListenerC10379g(int i10, Object obj) {
        this.f52147a = i10;
        this.f52148b = obj;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.f52147a;
        Object obj = this.f52148b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj;
                C5207g.m11111f(ref$BooleanRef, "$isSpinnerTouch");
                ref$BooleanRef.f38122a = true;
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
