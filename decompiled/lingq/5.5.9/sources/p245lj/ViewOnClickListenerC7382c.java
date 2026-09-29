package p245lj;

import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.lesson.page.LessonPageFragment;
import dm.C5207g;
import p278nh.InterfaceC7774a;
import tj.C9293c;

/* JADX INFO: renamed from: lj.c */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC7382c implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41182a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f41183b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f41184c;

    public /* synthetic */ ViewOnClickListenerC7382c(int i10, int i11, Object obj) {
        this.f41182a = i11;
        this.f41184c = obj;
        this.f41183b = i10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f41182a;
        int i11 = this.f41183b;
        Object obj = this.f41184c;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                LessonPageFragment lessonPageFragment = (LessonPageFragment) obj;
                LessonPageFragment.C4337a c4337a = LessonPageFragment.f28335M0;
                C5207g.m11111f(lessonPageFragment, "this$0");
                lessonPageFragment.m10192s0().m10136C2(i11, 1.0f);
                break;
            default:
                C9293c c9293c = (C9293c) obj;
                C5207g.m11111f(c9293c, "this$0");
                InterfaceC7774a<C9293c.a> interfaceC7774a = c9293c.f48004e;
                if (interfaceC7774a != null) {
                    Object obj2 = c9293c.m15495p(i11).f42820b;
                    C5207g.m11109d(obj2, "null cannot be cast to non-null type com.lingq.ui.onboarding.adapters.ChooseLanguageAdapter.LanguageItem");
                    interfaceC7774a.mo9795a((C9293c.a) obj2);
                }
                break;
        }
    }
}
