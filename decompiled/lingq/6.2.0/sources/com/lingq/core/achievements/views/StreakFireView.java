package com.lingq.core.achievements.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.lingq.core.achievements.R$id;
import com.lingq.core.achievements.R$layout;
import p000.C3386nv;
import p000.iva;
import p000.lfa;
import p000.y52;

/* JADX INFO: loaded from: classes2.dex */
public final class StreakFireView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public final iva f14296a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreakFireView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.view_streak_flame, (ViewGroup) this, false);
        addView(viewInflate);
        int i2 = R$id.ivStreak;
        if (((ImageView) lfa.m16159c(viewInflate, i2)) != null) {
            i2 = R$id.tvStreak;
            if (((TextView) lfa.m16159c(viewInflate, i2)) != null) {
                this.f14296a = new iva();
                return;
            }
        }
        C3386nv.m17635v("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        throw null;
    }

    public final iva getBinding() {
        return this.f14296a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StreakFireView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StreakFireView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ StreakFireView(Context context, AttributeSet attributeSet, int i, int i2, y52 y52Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
