package p279nj;

import android.graphics.RectF;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.method.Touch;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import com.lingq.p055ui.lesson.page.LessonPageFragment$onViewCreated$2$4;
import dm.C5207g;

/* JADX INFO: renamed from: nj.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C7798a extends LinkMovementMethod {

    /* JADX INFO: renamed from: a */
    public final boolean f42874a;

    /* JADX INFO: renamed from: b */
    public final a f42875b;

    /* JADX INFO: renamed from: c */
    public final RectF f42876c = new RectF();

    /* JADX INFO: renamed from: nj.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo10195a(MotionEvent motionEvent);
    }

    public C7798a(boolean z10, LessonPageFragment$onViewCreated$2$4.C43631.a aVar) {
        this.f42874a = z10;
        this.f42875b = aVar;
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean canSelectArbitrarily() {
        return true;
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final void initialize(TextView textView, Spannable spannable) {
        C5207g.m11111f(textView, "widget");
        C5207g.m11111f(spannable, "text");
        Selection.setSelection(spannable, spannable.length());
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final void onTakeFocus(TextView textView, Spannable spannable, int i10) {
        C5207g.m11111f(textView, "view");
        C5207g.m11111f(spannable, "text");
        if ((i10 & 130) == 0) {
            Selection.setSelection(spannable, spannable.length());
        } else if (textView.getLayout() == null) {
            Selection.setSelection(spannable, spannable.length());
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d6  */
    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        ClickableSpan clickableSpan;
        C5207g.m11111f(textView, "widget");
        C5207g.m11111f(spannable, "buffer");
        C5207g.m11111f(motionEvent, "event");
        int action = motionEvent.getAction();
        if (action == 0 || action == 1) {
            a aVar = this.f42875b;
            if (action != 1) {
                aVar.mo10195a(motionEvent);
                Touch.onTouchEvent(textView, spannable, motionEvent);
                return false;
            }
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int totalPaddingLeft = x10 - (textView.getTotalPaddingLeft() + ((int) (textView.getTextSize() / (this.f42874a ? 4 : 2))));
            int totalPaddingTop = y10 - (textView.getTotalPaddingTop() - textView.getTotalPaddingBottom());
            int scrollX = textView.getScrollX() + totalPaddingLeft;
            int scrollY = textView.getScrollY() + totalPaddingTop;
            Layout layout = textView.getLayout();
            C5207g.m11110e(layout, "textView.layout");
            int lineForVertical = layout.getLineForVertical(scrollY);
            float f3 = scrollX;
            int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f3);
            RectF rectF = this.f42876c;
            rectF.left = layout.getLineLeft(lineForVertical);
            rectF.top = layout.getLineTop(lineForVertical);
            rectF.right = layout.getLineWidth(lineForVertical) + rectF.left;
            rectF.bottom = (layout.getLineBaseline(lineForVertical) - rectF.top) + layout.getLineBaseline(lineForVertical);
            if (rectF.contains(f3, scrollY)) {
                Object[] spans = spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                C5207g.m11110e(spans, "text.getSpans(\n         …:class.java\n            )");
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spans;
                if (!(clickableSpanArr.length == 0)) {
                    clickableSpan = clickableSpanArr[clickableSpanArr.length - 1];
                }
                if (clickableSpan != null) {
                    clickableSpan.onClick(textView);
                    return true;
                }
                aVar.mo10195a(motionEvent);
                Selection.removeSelection(spannable);
            }
            clickableSpan = null;
            if (clickableSpan != null) {
                clickableSpan.onClick(textView);
                return true;
            }
            aVar.mo10195a(motionEvent);
            Selection.removeSelection(spannable);
        }
        return Touch.onTouchEvent(textView, spannable, motionEvent);
    }
}
