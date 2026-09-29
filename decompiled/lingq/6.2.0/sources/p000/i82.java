package p000;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.R$animator;
import androidx.fragment.R$id;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import androidx.fragment.app.SpecialEffectsController$Operation$State;

/* JADX INFO: loaded from: classes.dex */
public final class i82 extends AbstractC3572sf {

    /* JADX INFO: renamed from: b */
    public final boolean f43677b;

    /* JADX INFO: renamed from: c */
    public boolean f43678c;

    /* JADX INFO: renamed from: d */
    public bl2 f43679d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i82(ze9 ze9Var, boolean z) {
        super(ze9Var);
        ze9Var.getClass();
        this.f43677b = z;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0028  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e1 A[Catch: RuntimeException -> 0x00f3, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x00f3, blocks: (B:78:0x00db, B:80:0x00e1), top: B:91:0x00db }] */
    /* JADX INFO: renamed from: E */
    public final bl2 m13717E(Context context) {
        int i;
        bl2 bl2Var;
        Animator animatorLoadAnimator;
        int iM21982O;
        if (this.f43678c) {
            return this.f43679d;
        }
        ze9 ze9Var = (ze9) this.f60774a;
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = ze9Var.f71466c;
        boolean z = ze9Var.f71464a == SpecialEffectsController$Operation$State.VISIBLE;
        ed3 ed3Var = abstractComponentCallbacksC0635c.f5698g0;
        int i2 = ed3Var == null ? 0 : ed3Var.f37046f;
        if (this.f43677b) {
            if (z) {
                if (ed3Var == null) {
                    i = 0;
                } else {
                    i = ed3Var.f37044d;
                }
            } else if (ed3Var == null) {
                i = 0;
            } else {
                i = ed3Var.f37045e;
            }
        } else if (z) {
            if (ed3Var == null) {
                i = 0;
            } else {
                i = ed3Var.f37042b;
            }
        } else if (ed3Var == null) {
            i = 0;
        } else {
            i = ed3Var.f37043c;
        }
        abstractComponentCallbacksC0635c.m2094V(0, 0, 0, 0);
        ViewGroup viewGroup = abstractComponentCallbacksC0635c.f5690c0;
        bl2 bl2Var2 = null;
        if (viewGroup != null && viewGroup.getTag(R$id.visible_removing_fragment_view_tag) != null) {
            abstractComponentCallbacksC0635c.f5690c0.setTag(R$id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = abstractComponentCallbacksC0635c.f5690c0;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            if (i == 0 && i2 != 0) {
                if (i2 == 4097) {
                    iM21982O = z ? R$animator.fragment_open_enter : R$animator.fragment_open_exit;
                } else if (i2 == 8194) {
                    iM21982O = z ? R$animator.fragment_close_enter : R$animator.fragment_close_exit;
                } else if (i2 == 8197) {
                    iM21982O = z ? te1.m21982O(context, R.attr.activityCloseEnterAnimation) : te1.m21982O(context, R.attr.activityCloseExitAnimation);
                } else if (i2 == 4099) {
                    iM21982O = z ? R$animator.fragment_fade_enter : R$animator.fragment_fade_exit;
                } else if (i2 != 4100) {
                    iM21982O = -1;
                } else {
                    iM21982O = z ? te1.m21982O(context, R.attr.activityOpenEnterAnimation) : te1.m21982O(context, R.attr.activityOpenExitAnimation);
                }
                i = iM21982O;
            }
            if (i != 0) {
                boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(i));
                if (zEquals) {
                    try {
                        Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, i);
                        if (animationLoadAnimation != null) {
                            bl2Var = new bl2(animationLoadAnimation);
                            bl2Var2 = bl2Var;
                        }
                    } catch (Resources.NotFoundException e) {
                        throw e;
                    } catch (RuntimeException unused) {
                        try {
                            animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
                            if (animatorLoadAnimator != null) {
                                bl2Var = new bl2();
                                bl2Var.f8655a = null;
                                AnimatorSet animatorSet = new AnimatorSet();
                                bl2Var.f8656b = animatorSet;
                                animatorSet.play(animatorLoadAnimator);
                                bl2Var2 = bl2Var;
                            }
                        } catch (RuntimeException e2) {
                            if (zEquals) {
                                throw e2;
                            }
                            Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, i);
                            if (animationLoadAnimation2 != null) {
                                bl2Var2 = new bl2(animationLoadAnimation2);
                            }
                        }
                    }
                } else {
                    animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
                    if (animatorLoadAnimator != null) {
                        bl2Var = new bl2();
                        bl2Var.f8655a = null;
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        bl2Var.f8656b = animatorSet2;
                        animatorSet2.play(animatorLoadAnimator);
                        bl2Var2 = bl2Var;
                    }
                }
            }
        }
        this.f43679d = bl2Var2;
        this.f43678c = true;
        return bl2Var2;
    }
}
