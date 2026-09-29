package p000;

import android.graphics.RectF;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.method.Touch;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import com.lingq.feature.reader.old.ReaderPageFragment;

/* JADX INFO: loaded from: classes3.dex */
public final class b55 extends LinkMovementMethod {

    /* JADX INFO: renamed from: a */
    public final boolean f7962a;

    /* JADX INFO: renamed from: b */
    public final hi8 f7963b;

    /* JADX INFO: renamed from: c */
    public final RectF f7964c = new RectF();

    public b55(boolean z, hi8 hi8Var) {
        this.f7962a = z;
        this.f7963b = hi8Var;
    }

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

    /* JADX WARN: Code duplicated, block: B:18:0x00a9  */
    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        ClickableSpan clickableSpan;
        textView.getClass();
        spannable.getClass();
        motionEvent.getClass();
        int action = motionEvent.getAction();
        if (action == 0 || action == 1) {
            hi8 hi8Var = this.f7963b;
            if (action != 1) {
                ReaderPageFragment readerPageFragment = (ReaderPageFragment) hi8Var.f42410b;
                boolean zM23653w = vz1.m23653w(readerPageFragment);
                vx7 vx7Var = ReaderPageFragment.Companion;
                readerPageFragment.m9300Y0(zM23653w, motionEvent);
                Touch.onTouchEvent(textView, spannable, motionEvent);
                return false;
            }
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int totalPaddingLeft = textView.getTotalPaddingLeft();
            float textSize = textView.getTextSize();
            boolean z = this.f7962a;
            int i = x - (totalPaddingLeft + ((int) (textSize / (z ? 4 : 2))));
            int totalPaddingTop = y - (textView.getTotalPaddingTop() - textView.getTotalPaddingBottom());
            int scrollX = textView.getScrollX() + i;
            int scrollY = textView.getScrollY() + totalPaddingTop;
            Layout layout = textView.getLayout();
            layout.getClass();
            int lineForVertical = layout.getLineForVertical(scrollY);
            float f = scrollX;
            int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f);
            float lineLeft = layout.getLineLeft(lineForVertical);
            RectF rectF = this.f7964c;
            rectF.left = lineLeft;
            rectF.top = layout.getLineTop(lineForVertical);
            rectF.right = layout.getLineWidth(lineForVertical) + rectF.left;
            rectF.bottom = (layout.getLineBaseline(lineForVertical) - rectF.top) + layout.getLineBaseline(lineForVertical);
            ImageSpan imageSpan = null;
            if (rectF.contains(f, scrollY)) {
                Object[] spans = spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                spans.getClass();
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spans;
                if (clickableSpanArr.length == 0) {
                    clickableSpan = null;
                } else {
                    clickableSpan = clickableSpanArr[clickableSpanArr.length - 1];
                }
            } else {
                clickableSpan = null;
            }
            if (clickableSpan != null) {
                clickableSpan.onClick(textView);
                return true;
            }
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            int totalPaddingLeft2 = x2 - (textView.getTotalPaddingLeft() + ((int) (textView.getTextSize() / (z ? 4 : 2))));
            int totalPaddingTop2 = y2 - (textView.getTotalPaddingTop() - textView.getTotalPaddingBottom());
            int scrollX2 = textView.getScrollX() + totalPaddingLeft2;
            int scrollY2 = textView.getScrollY() + totalPaddingTop2;
            Layout layout2 = textView.getLayout();
            layout2.getClass();
            int lineForVertical2 = layout2.getLineForVertical(scrollY2);
            float f2 = scrollX2;
            int offsetForHorizontal2 = layout2.getOffsetForHorizontal(lineForVertical2, f2);
            rectF.left = layout2.getLineLeft(lineForVertical2);
            rectF.top = layout2.getLineTop(lineForVertical2);
            rectF.right = layout2.getLineWidth(lineForVertical2) + rectF.left;
            rectF.bottom = (layout2.getLineBaseline(lineForVertical2) - rectF.top) + layout2.getLineBaseline(lineForVertical2);
            if (rectF.contains(f2, scrollY2)) {
                Object[] spans2 = spannable.getSpans(offsetForHorizontal2, offsetForHorizontal2, ImageSpan.class);
                spans2.getClass();
                ImageSpan[] imageSpanArr = (ImageSpan[]) spans2;
                if (imageSpanArr.length != 0) {
                    imageSpan = imageSpanArr[imageSpanArr.length - 1];
                }
            }
            if (imageSpan != null) {
                Selection.selectAll(spannable);
                Selection.removeSelection(spannable);
                return false;
            }
            ReaderPageFragment readerPageFragment2 = (ReaderPageFragment) hi8Var.f42410b;
            boolean zM23653w2 = vz1.m23653w(readerPageFragment2);
            vx7 vx7Var2 = ReaderPageFragment.Companion;
            readerPageFragment2.m9300Y0(zM23653w2, motionEvent);
            Selection.removeSelection(spannable);
        }
        return Touch.onTouchEvent(textView, spannable, motionEvent);
    }
}
