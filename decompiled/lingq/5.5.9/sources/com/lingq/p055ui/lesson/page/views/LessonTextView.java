package com.lingq.p055ui.lesson.page.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatTextView;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\f"}, m13365d2 = {"Lcom/lingq/ui/lesson/page/views/LessonTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "enabled", "Lsl/e;", "setEnabled", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LessonTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: h */
    public boolean f28717h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C5207g.m11111f(context, "context");
        C5207g.m11111f(attributeSet, "attrs");
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C5207g.m11111f(motionEvent, "event");
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            if (this.f28717h) {
                super.setEnabled(false);
                super.setEnabled(this.f28717h);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i10, int i11) {
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z10) {
        this.f28717h = z10;
        super.setEnabled(z10);
    }
}
