package p160hj;

import android.view.MotionEvent;
import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.lesson.LessonFragment;
import com.lingq.p055ui.settings.C4782a;
import dm.C5207g;
import km.InterfaceC6727j;
import p278nh.AbstractC7789p;
import ph.C8274e0;

/* JADX INFO: renamed from: hj.c */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnTouchListenerC6057c implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35758a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f35759b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f35760c;

    public /* synthetic */ ViewOnTouchListenerC6057c(Object obj, int i10, Object obj2) {
        this.f35758a = i10;
        this.f35759b = obj;
        this.f35760c = obj2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.f35758a;
        Object obj = this.f35760c;
        Object obj2 = this.f35759b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                LessonFragment lessonFragment = (LessonFragment) obj2;
                C8274e0 c8274e0 = (C8274e0) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
                C5207g.m11111f(lessonFragment, "this$0");
                C5207g.m11111f(c8274e0, "$this_with");
                lessonFragment.m10109q0().mo10025A1();
                C5207g.m11110e(motionEvent, "event");
                return c8274e0.f44700k.onTouchEvent(motionEvent);
            default:
                C4782a c4782a = (C4782a) obj2;
                AbstractC7789p.c cVar = (AbstractC7789p.c) obj;
                C5207g.m11111f(c4782a, "this$0");
                C5207g.m11111f(cVar, "$item");
                c4782a.f31150e.mo10355a(cVar);
                return false;
        }
    }
}
