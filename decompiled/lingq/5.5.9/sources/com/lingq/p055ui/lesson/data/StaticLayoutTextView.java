package com.lingq.p055ui.lesson.data;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.util.AttributeSet;
import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, m13365d2 = {"Lcom/lingq/ui/lesson/data/StaticLayoutTextView;", "Landroid/view/View;", "Landroid/text/StaticLayout;", "a", "Landroid/text/StaticLayout;", "getTextContainer", "()Landroid/text/StaticLayout;", "setTextContainer", "(Landroid/text/StaticLayout;)V", "textContainer", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class StaticLayoutTextView extends View {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public StaticLayout textContainer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaticLayoutTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C5207g.m11111f(context, "context");
    }

    public final StaticLayout getTextContainer() {
        return this.textContainer;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        StaticLayout staticLayout = this.textContainer;
        if (staticLayout != null) {
            staticLayout.draw(canvas);
        }
    }

    public final void setTextContainer(StaticLayout staticLayout) {
        this.textContainer = staticLayout;
    }
}
