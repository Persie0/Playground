package p000;

import com.lingq.feature.review.activities.ReviewActivityUnscrambleFragment;
import com.lingq.feature.review.data.ReviewActivityShow;

/* JADX INFO: loaded from: classes3.dex */
public final class ac8 implements kw8 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f488a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f489b;

    public /* synthetic */ ac8(Object obj, int i) {
        this.f488a = i;
        this.f489b = obj;
    }

    @Override // p000.kw8
    /* JADX INFO: renamed from: b */
    public final void mo257b(String str) {
        int i = this.f488a;
        Object obj = this.f489b;
        str.getClass();
        switch (i) {
            case 0:
                jc8 jc8Var = vk9.m23391n0(str) ? new jc8(ReviewActivityShow.SubmitSkipDisabled) : new jc8(ReviewActivityShow.SubmitSkip);
                bh4[] bh4VarArr = ReviewActivityUnscrambleFragment.f32209F0;
                ((ReviewActivityUnscrambleFragment) obj).m9553T0().m9606Z2(jc8Var);
                break;
            default:
                ((vi3) obj).invoke(new ya8(str));
                break;
        }
    }

    @Override // p000.kw8
    /* JADX INFO: renamed from: d */
    public final void mo258d(sx8 sx8Var) {
        int i = this.f488a;
        Object obj = this.f489b;
        sx8Var.getClass();
        switch (i) {
            case 0:
                bh4[] bh4VarArr = ReviewActivityUnscrambleFragment.f32209F0;
                sca.m21224J0(((ReviewActivityUnscrambleFragment) obj).m9554U0(), sx8Var.f61555a, false, 12);
                break;
            default:
                ((vi3) obj).invoke(new bb8(sx8Var.f61555a));
                break;
        }
    }

    @Override // p000.kw8
    public final void onSuccess() {
        int i = this.f488a;
        Object obj = this.f489b;
        switch (i) {
            case 0:
                ReviewActivityUnscrambleFragment.m9551R0((ReviewActivityUnscrambleFragment) obj);
                break;
            default:
                ((vi3) obj).invoke(za8.f71290a);
                break;
        }
    }
}
