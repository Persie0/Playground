package com.lingq.commons.p053ui.views;

import ae.C0062b;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import ph.C8290g4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m13365d2 = {"Lcom/lingq/commons/ui/views/CurrentDayStreakView;", "Landroid/widget/FrameLayout;", "", "title", "Lsl/e;", "setTitle", "Lph/g4;", "a", "Lph/g4;", "getBinding", "()Lph/g4;", "binding", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class CurrentDayStreakView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final C8290g4 binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public CurrentDayStreakView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C5207g.m11111f(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.view_current_streak, (ViewGroup) this, false);
        addView(viewInflate);
        int i10 = R.id.cpStreak;
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) C0062b.m298P0(viewInflate, R.id.cpStreak);
        if (circularProgressIndicator != null) {
            i10 = R.id.ivStreak;
            ImageView imageView = (ImageView) C0062b.m298P0(viewInflate, R.id.ivStreak);
            if (imageView != null) {
                i10 = R.id.tvLabel;
                TextView textView = (TextView) C0062b.m298P0(viewInflate, R.id.tvLabel);
                if (textView != null) {
                    i10 = R.id.tvStreak;
                    TextView textView2 = (TextView) C0062b.m298P0(viewInflate, R.id.tvStreak);
                    if (textView2 != null) {
                        this.binding = new C8290g4(circularProgressIndicator, imageView, textView, textView2);
                        return;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    public final C8290g4 getBinding() {
        return this.binding;
    }

    public final void setTitle(String str) {
        C5207g.m11111f(str, "title");
        this.binding.f44824c.setText(str);
    }
}
