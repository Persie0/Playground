package va;

import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.exoplayer2.p051ui.C2517d;
import com.lingq.p055ui.lesson.page.LessonPageFragment;
import dm.C5207g;
import p278nh.InterfaceC7774a;
import tj.C9294d;

/* JADX INFO: renamed from: va.g */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC9693g implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49619a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f49620b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f49621c;

    public /* synthetic */ ViewOnClickListenerC9693g(int i10, int i11, Object obj) {
        this.f49619a = i11;
        this.f49621c = obj;
        this.f49620b = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f49619a;
        int i11 = this.f49620b;
        Object obj = this.f49621c;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C2517d.d dVar = (C2517d.d) obj;
                int i12 = dVar.f13647f;
                C2517d c2517d = C2517d.this;
                if (i11 != i12) {
                    c2517d.setPlaybackSpeed(dVar.f13646e[i11]);
                }
                c2517d.f13625k.dismiss();
                break;
            case 1:
                LessonPageFragment lessonPageFragment = (LessonPageFragment) obj;
                LessonPageFragment.C4337a c4337a = LessonPageFragment.f28335M0;
                C5207g.m11111f(lessonPageFragment, "this$0");
                lessonPageFragment.m10192s0().m10136C2(i11, ((Number) lessonPageFragment.m10193t0().f28551e0.getValue()).floatValue());
                break;
            default:
                C9294d c9294d = (C9294d) obj;
                C5207g.m11111f(c9294d, "this$0");
                InterfaceC7774a<C9294d.a> interfaceC7774a = c9294d.f48010e;
                if (interfaceC7774a != null) {
                    Object obj2 = c9294d.m15495p(i11).f42820b;
                    C5207g.m11109d(obj2, "null cannot be cast to non-null type com.lingq.ui.onboarding.adapters.ChooseLevelAdapter.LevelItem");
                    interfaceC7774a.mo9795a((C9294d.a) obj2);
                }
                break;
        }
    }
}
