package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageButton;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.domain.model.status.CardStatus;
import com.lingq.core.p012ui.R$drawable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ppc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f56640a = new C0282a(-1429684928, false, new fe1(3));

    /* JADX INFO: renamed from: b */
    public static final C0282a f56641b = new C0282a(-463596174, false, new fe1(4));

    /* JADX INFO: renamed from: c */
    public static final C0282a f56642c = new C0282a(-773954579, false, new fe1(5));

    /* JADX INFO: renamed from: a */
    public static final int m19442a(vs3 vs3Var, int i, Integer num) {
        vs3Var.getClass();
        yd5 yd5Var = vs3Var.f65847c;
        int iM24983b = y7d.m24983b(i, num);
        if (iM24983b == CardStatus.New.getValue()) {
            return abd.m253i(yd5Var.f69687a.f67242a);
        }
        if (iM24983b == CardStatus.Recognized.getValue()) {
            return abd.m253i(yd5Var.f69688b.f67242a);
        }
        if (iM24983b == CardStatus.Familiar.getValue()) {
            return abd.m253i(yd5Var.f69689c.f67242a);
        }
        if (iM24983b == CardStatus.Learned.getValue()) {
            return abd.m253i(yd5Var.f69691e.f67242a);
        }
        return (iM24983b == CardStatus.Known.getValue() || iM24983b == CardStatus.Ignored.getValue()) ? abd.m253i(yd5Var.f69690d.f67242a) : abd.m253i(yd5Var.f69690d.f67242a);
    }

    /* JADX INFO: renamed from: b */
    public static final int m19443b(vs3 vs3Var, int i, Integer num) {
        vs3Var.getClass();
        yd5 yd5Var = vs3Var.f65847c;
        int iM24983b = y7d.m24983b(i, num);
        if (iM24983b == CardStatus.New.getValue()) {
            return abd.m253i(yd5Var.f69687a.f67243b);
        }
        if (iM24983b == CardStatus.Recognized.getValue()) {
            return abd.m253i(yd5Var.f69688b.f67243b);
        }
        if (iM24983b == CardStatus.Familiar.getValue()) {
            return abd.m253i(yd5Var.f69689c.f67243b);
        }
        if (iM24983b == CardStatus.Learned.getValue()) {
            return abd.m253i(yd5Var.f69691e.f67243b);
        }
        return (iM24983b == CardStatus.Known.getValue() || iM24983b == CardStatus.Ignored.getValue()) ? abd.m253i(yd5Var.f69690d.f67243b) : abd.m253i(yd5Var.f69690d.f67243b);
    }

    /* JADX INFO: renamed from: c */
    public static final void m19444c(Context context, int i, ImageButton imageButton) {
        if (i == CardStatus.Ignored.getValue()) {
            imageButton.setImageDrawable(context.getDrawable(R$drawable.ic_trash));
        } else if (i == CardStatus.Known.getValue()) {
            imageButton.setImageDrawable(context.getDrawable(R$drawable.ic_check_thick));
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m19445d(View view, int i) {
        view.getClass();
        DrawableContainer.DrawableContainerState drawableContainerState = (DrawableContainer.DrawableContainerState) view.getBackground().getConstantState();
        if (drawableContainerState != null) {
            Drawable[] children = drawableContainerState.getChildren();
            children.getClass();
            for (Drawable drawable : children) {
                GradientDrawable gradientDrawable = drawable instanceof GradientDrawable ? (GradientDrawable) drawable : null;
                if (gradientDrawable != null) {
                    gradientDrawable.setColor(i);
                }
            }
        }
    }
}
