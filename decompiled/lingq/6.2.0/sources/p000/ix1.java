package p000;

import android.graphics.RectF;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.method.Touch;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final class ix1 extends LinkMovementMethod {

    /* JADX INFO: renamed from: a */
    public static final ix1 f44725a = new ix1();

    /* JADX INFO: renamed from: b */
    public static final RectF f44726b = new RectF();

    @Override // android.text.method.LinkMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean canSelectArbitrarily() {
        return true;
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final void initialize(TextView textView, Spannable spannable) {
        textView.getClass();
        spannable.getClass();
        Selection.setSelection(spannable, spannable.length());
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final void onTakeFocus(TextView textView, Spannable spannable, int i) {
        textView.getClass();
        spannable.getClass();
        if ((i & 130) == 0) {
            Selection.setSelection(spannable, spannable.length());
        } else if (textView.getLayout() == null) {
            Selection.setSelection(spannable, spannable.length());
        }
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        textView.getClass();
        spannable.getClass();
        motionEvent.getClass();
        int action = motionEvent.getAction();
        if (action != 0 && action != 1) {
            return Touch.onTouchEvent(textView, spannable, motionEvent);
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int totalPaddingLeft = x - textView.getTotalPaddingLeft();
        int totalPaddingTop = y - textView.getTotalPaddingTop();
        int scrollX = textView.getScrollX() + totalPaddingLeft;
        int scrollY = textView.getScrollY() + totalPaddingTop;
        Layout layout = textView.getLayout();
        layout.getClass();
        int lineForVertical = layout.getLineForVertical(scrollY);
        float f = scrollX;
        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f);
        float lineLeft = layout.getLineLeft(lineForVertical);
        RectF rectF = f44726b;
        rectF.left = lineLeft;
        rectF.top = layout.getLineTop(lineForVertical);
        rectF.right = layout.getLineWidth(lineForVertical) + rectF.left;
        rectF.bottom = layout.getLineBottom(lineForVertical);
        boolean zContains = rectF.contains(f, scrollY);
        ClickableSpan clickableSpan = null;
        if (zContains) {
            Object[] spans = spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            spans.getClass();
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spans;
            if (clickableSpanArr.length > 0) {
                clickableSpan = clickableSpanArr[0];
            }
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
