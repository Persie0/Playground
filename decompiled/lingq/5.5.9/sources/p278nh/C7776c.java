package p278nh;

import android.graphics.RectF;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.method.Touch;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import dm.C5207g;

/* JADX INFO: renamed from: nh.c */
/* JADX INFO: loaded from: classes.dex */
public final class C7776c extends LinkMovementMethod {

    /* JADX INFO: renamed from: a */
    public static final C7776c f42711a = new C7776c();

    /* JADX INFO: renamed from: b */
    public static final RectF f42712b = new RectF();

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

    /* JADX WARN: Code duplicated, block: B:13:0x00a7  */
    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        ClickableSpan clickableSpan;
        C5207g.m11111f(textView, "widget");
        C5207g.m11111f(spannable, "buffer");
        C5207g.m11111f(motionEvent, "event");
        int action = motionEvent.getAction();
        if (action != 0 && action != 1) {
            return Touch.onTouchEvent(textView, spannable, motionEvent);
        }
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int totalPaddingLeft = x10 - textView.getTotalPaddingLeft();
        int totalPaddingTop = y10 - textView.getTotalPaddingTop();
        int scrollX = textView.getScrollX() + totalPaddingLeft;
        int scrollY = textView.getScrollY() + totalPaddingTop;
        Layout layout = textView.getLayout();
        C5207g.m11110e(layout, "textView.layout");
        int lineForVertical = layout.getLineForVertical(scrollY);
        float f3 = scrollX;
        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f3);
        RectF rectF = f42712b;
        rectF.left = layout.getLineLeft(lineForVertical);
        rectF.top = layout.getLineTop(lineForVertical);
        rectF.right = layout.getLineWidth(lineForVertical) + rectF.left;
        rectF.bottom = layout.getLineBottom(lineForVertical);
        if (rectF.contains(f3, scrollY)) {
            Object[] spans = spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            C5207g.m11110e(spans, "text.getSpans(\n         …:class.java\n            )");
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spans;
            if (clickableSpanArr.length > 0) {
                clickableSpan = clickableSpanArr[0];
            } else {
                clickableSpan = null;
            }
        } else {
            clickableSpan = null;
        }
        if (clickableSpan == null) {
            Selection.removeSelection(spannable);
            Touch.onTouchEvent(textView, spannable, motionEvent);
            return false;
        }
        if (action == 0) {
            Selection.setSelection(spannable, spannable.getSpanStart(clickableSpan), spannable.getSpanEnd(clickableSpan));
        } else if (action == 1) {
            clickableSpan.onClick(textView);
        }
        return true;
    }
}
