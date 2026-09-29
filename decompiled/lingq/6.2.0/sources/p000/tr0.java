package p000;

import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.p012ui.R$drawable;
import com.lingq.feature.challenges.ChallengeShareFragment;
import com.lingq.feature.reader.old.tutorial.LessonDealWithWordsFragment;
import com.lingq.feature.review.activities.ReviewActivityMultiAndClozeFragment;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tr0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f62746a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f62747b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f62748c;

    public /* synthetic */ tr0(int i, Object obj, Object obj2) {
        this.f62746a = i;
        this.f62747b = obj;
        this.f62748c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f62746a;
        Object obj = this.f62748c;
        Object obj2 = this.f62747b;
        switch (i) {
            case 0:
                ChallengeShareFragment challengeShareFragment = (ChallengeShareFragment) obj2;
                bh4[] bh4VarArr = ChallengeShareFragment.f24412V0;
                AbstractC3423or.m18241Z(challengeShareFragment.m2090R(), ((ld3) obj).f49496b, null, ((vr0) challengeShareFragment.f24415U0.getValue()).f65822b, new C3741x(challengeShareFragment, 7), 2);
                return;
            case 1:
                LessonDealWithWordsFragment lessonDealWithWordsFragment = (LessonDealWithWordsFragment) obj2;
                wd3 wd3Var = (wd3) obj;
                bh4[] bh4VarArr2 = LessonDealWithWordsFragment.f29486Z0;
                hm5 hm5Var = lessonDealWithWordsFragment.f29492X0;
                if (hm5Var == null) {
                    fa4.m11636J("analytics");
                    throw null;
                }
                ((C1240a) hm5Var).m7025f("Paging prompt disabled", null);
                C3509qs c3509qs = lessonDealWithWordsFragment.f29491W0;
                if (c3509qs == null) {
                    fa4.m11636J("appSettings");
                    throw null;
                }
                SharedPreferences.Editor editorEdit = c3509qs.f58118b.edit();
                editorEdit.getClass();
                editorEdit.putBoolean("pagingDealWithWords", false);
                editorEdit.apply();
                wd3Var.f66641d.setCompoundDrawablesWithIntrinsicBounds(lessonDealWithWordsFragment.m2090R().getDrawable(R$drawable.ic_check_thick), (Drawable) null, (Drawable) null, (Drawable) null);
                return;
            case 2:
                bh4[] bh4VarArr3 = ReviewActivityMultiAndClozeFragment.f32016I0;
                sca.m21224J0(((ReviewActivityMultiAndClozeFragment) obj2).m9543T0(), ((sc8) obj).f60683a, false, 12);
                return;
            default:
                te8 te8Var = (te8) obj;
                int iM17783c = ((dr9) ((fr9) obj2)).m17783c();
                if (iM17783c != -1) {
                    Object objM21308k = te8Var.m21308k(iM17783c);
                    objM21308k.getClass();
                    te8Var.f62198f.mo10699a(((ar9) objM21308k).f7405a);
                    return;
                }
                return;
        }
    }
}
