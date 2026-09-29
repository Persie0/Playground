package p000;

import android.graphics.Point;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle$State;
import com.lingq.core.designsystem.R$attr;
import com.lingq.core.designsystem.R$dimen;
import com.lingq.core.domain.model.status.CardStatus;
import com.lingq.core.domain.model.token.TextTokenType;
import com.lingq.core.domain.model.token.TokenTransliteration;
import com.lingq.feature.reader.R$string;
import com.lingq.feature.reader.old.ReaderPageFragment;
import com.lingq.feature.reader.old.tutorial.LessonFirstLingQCongratsFragment;
import com.lingq.feature.reader.pagination.p015ui.LessonTextView;
import com.lingq.feature.review.views.unscrambler.SentenceBuilderView;
import com.lingq.feature.review.views.unscrambler.SentenceView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class m25 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50457a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f50458b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f50459c;

    public /* synthetic */ m25(int i, View view, Object obj) {
        this.f50457a = i;
        this.f50458b = view;
        this.f50459c = obj;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0128  */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Point point;
        int measuredHeight;
        int i = this.f50457a;
        boolean z = true;
        boolean z2 = false;
        View view = this.f50458b;
        Object obj = this.f50459c;
        switch (i) {
            case 0:
                TextView textView = (TextView) view;
                if (textView.getMeasuredWidth() <= 0 || textView.getMeasuredHeight() <= 0) {
                    return;
                }
                textView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                LessonFirstLingQCongratsFragment lessonFirstLingQCongratsFragment = (LessonFirstLingQCongratsFragment) obj;
                bh4[] bh4VarArr = LessonFirstLingQCongratsFragment.f29549U0;
                try {
                    String strM2111m = lessonFirstLingQCongratsFragment.m2111m(R$string.tooltips_first_lingq_blue);
                    strM2111m.getClass();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cl9.m4839V(strM2111m, "*", ""));
                    TextView textView2 = lessonFirstLingQCongratsFragment.m9349A0().f63836d;
                    TextView.BufferType bufferType = TextView.BufferType.SPANNABLE;
                    textView2.setText(spannableStringBuilder, bufferType);
                    lessonFirstLingQCongratsFragment.m9349A0().f63836d.invalidate();
                    int iM23389l0 = vk9.m23389l0(strM2111m, "**", 0, false, 6) - 2;
                    int iM23394q0 = vk9.m23394q0(strM2111m, 6, "**") - 4;
                    int i2 = iM23389l0 < 0 ? 0 : iM23389l0;
                    int i3 = iM23394q0 < 0 ? 0 : iM23394q0;
                    int iM23389l1 = vk9.m23389l0(strM2111m, "*", 0, false, 6);
                    int iM23394q1 = vk9.m23394q0(cl9.m4839V(strM2111m, "**", ""), 6, "*") - 1;
                    String strSubstring = cl9.m4839V(strM2111m, "*", "").substring(i2, i3);
                    if (iM23389l1 < 0) {
                        iM23389l1 = 0;
                    }
                    if (iM23394q1 < 0) {
                        iM23394q1 = 0;
                    }
                    spannableStringBuilder.setSpan(new k25(lessonFirstLingQCongratsFragment.m2090R(), lessonFirstLingQCongratsFragment.m9349A0().f63836d.getLayout(), ((o25) lessonFirstLingQCongratsFragment.f29551T0.getValue()).f53651c.mo4589b2(), vz1.m23605K(new je9(jfa.m14431n(lessonFirstLingQCongratsFragment.m2090R(), R$attr.blueStrongColor), jfa.m14431n(lessonFirstLingQCongratsFragment.m2090R(), R$attr.blueStrongColor), jfa.m14431n(lessonFirstLingQCongratsFragment.m2090R(), R$attr.blueStrongColor), null, new xz7(iM23389l1, iM23394q1, 0, 0, cl9.m4839V(strM2111m, "*", "").substring(iM23389l1, iM23394q1), 0, 0, 0, (String) null, (TokenTransliteration) null, (TextTokenType) null, 0, (Map) null, (String) null, (String) null, (String) null, 262124), 0, false, false, 1896), new je9(jfa.m14431n(lessonFirstLingQCongratsFragment.m2090R(), R$attr.yellowTint), jfa.m14431n(lessonFirstLingQCongratsFragment.m2090R(), R$attr.yellowTint), jfa.m14431n(lessonFirstLingQCongratsFragment.m2090R(), R$attr.yellowTint), null, new xz7(i2, i3, 0, 0, strSubstring, 0, 0, 0, (String) null, (TokenTransliteration) null, (TextTokenType) null, 0, (Map) null, (String) null, (String) null, (String) null, 262124), CardStatus.Recognized.getValue(), false, false, 1640))), 0, spannableStringBuilder.length(), 33);
                    lessonFirstLingQCongratsFragment.m9349A0().f63836d.setText(spannableStringBuilder, bufferType);
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            case 1:
                ReaderPageFragment readerPageFragment = (ReaderPageFragment) obj;
                if (view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) {
                    return;
                }
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                if (readerPageFragment.f5709m0.f66586d.isAtLeast(Lifecycle$State.STARTED)) {
                    LessonTextView lessonTextView = readerPageFragment.f28444F0;
                    if (lessonTextView == null) {
                        fa4.m11636J("tvContent");
                        throw null;
                    }
                    if (lessonTextView.getLayoutDirection() == 1) {
                        TextView textView3 = readerPageFragment.m9297V0().f69712c;
                        ViewGroup.LayoutParams layoutParams = textView3.getLayoutParams();
                        if (layoutParams == null) {
                            C3386nv.m17635v("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                            return;
                        }
                        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                        layoutParams2.removeRule(20);
                        layoutParams2.addRule(21);
                        textView3.setLayoutParams(layoutParams2);
                    }
                    LessonTextView lessonTextView2 = readerPageFragment.f28444F0;
                    if (lessonTextView2 == null) {
                        fa4.m11636J("tvContent");
                        throw null;
                    }
                    int length = lessonTextView2.getText().length();
                    if (lessonTextView2.getLayout() == null) {
                        point = null;
                    } else {
                        int lineForOffset = lessonTextView2.getLayout().getLineForOffset(length);
                        int primaryHorizontal = (int) lessonTextView2.getLayout().getPrimaryHorizontal(length);
                        Rect rect = new Rect();
                        LessonTextView lessonTextView3 = readerPageFragment.f28444F0;
                        if (lessonTextView3 == null) {
                            fa4.m11636J("tvContent");
                            throw null;
                        }
                        lessonTextView3.getLayout().getLineBounds(lineForOffset, rect);
                        point = new Point(primaryHorizontal, rect.top);
                    }
                    if (point != null) {
                        int dimensionPixelSize = readerPageFragment.m2090R().getResources().getDimensionPixelSize(R$dimen.spacing_standard);
                        LessonTextView lessonTextView4 = readerPageFragment.f28444F0;
                        if (lessonTextView4 == null) {
                            fa4.m11636J("tvContent");
                            throw null;
                        }
                        int layoutDirection = lessonTextView4.getLayoutDirection();
                        int i4 = point.x;
                        int measuredWidth = layoutDirection == 1 ? i4 - (dimensionPixelSize * 2) : i4 + (dimensionPixelSize * 2);
                        LessonTextView lessonTextView5 = readerPageFragment.f28444F0;
                        if (lessonTextView5 == null) {
                            fa4.m11636J("tvContent");
                            throw null;
                        }
                        if (lessonTextView5.getLayoutDirection() != 1) {
                            int measuredWidth2 = readerPageFragment.m9297V0().f69712c.getMeasuredWidth() + measuredWidth;
                            LessonTextView lessonTextView6 = readerPageFragment.f28444F0;
                            if (lessonTextView6 == null) {
                                fa4.m11636J("tvContent");
                                throw null;
                            }
                            if (measuredWidth2 > lessonTextView6.getMeasuredWidth() - dimensionPixelSize) {
                                z2 = true;
                            }
                        } else if (measuredWidth - readerPageFragment.m9297V0().f69712c.getMeasuredWidth() < dimensionPixelSize) {
                            z2 = true;
                        }
                        TextView textView4 = readerPageFragment.m9297V0().f69712c;
                        ViewGroup.LayoutParams layoutParams3 = textView4.getLayoutParams();
                        if (layoutParams3 == null) {
                            C3386nv.m17635v("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                            return;
                        }
                        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
                        LessonTextView lessonTextView7 = readerPageFragment.f28444F0;
                        if (lessonTextView7 == null) {
                            fa4.m11636J("tvContent");
                            throw null;
                        }
                        if (lessonTextView7.getLayoutDirection() == 1) {
                            if (z2) {
                                measuredWidth = dimensionPixelSize * 2;
                            }
                            layoutParams4.setMarginEnd(measuredWidth);
                        } else {
                            if (z2) {
                                LessonTextView lessonTextView8 = readerPageFragment.f28444F0;
                                if (lessonTextView8 == null) {
                                    fa4.m11636J("tvContent");
                                    throw null;
                                }
                                measuredWidth = (lessonTextView8.getMeasuredWidth() - readerPageFragment.m9297V0().f69712c.getMeasuredWidth()) - (dimensionPixelSize * 2);
                            }
                            layoutParams4.setMarginStart(measuredWidth);
                        }
                        int i5 = point.y;
                        if (z2) {
                            measuredHeight = (dimensionPixelSize * 2) + readerPageFragment.m9297V0().f69712c.getMeasuredHeight() + i5;
                        } else {
                            measuredHeight = dimensionPixelSize + i5;
                        }
                        layoutParams4.topMargin = measuredHeight;
                        textView4.setLayoutParams(layoutParams4);
                        return;
                    }
                    return;
                }
                return;
            default:
                SentenceBuilderView sentenceBuilderView = (SentenceBuilderView) obj;
                ViewGroup viewGroup = (ViewGroup) view;
                if (viewGroup.getMeasuredWidth() <= 0 || viewGroup.getMeasuredHeight() <= 0) {
                    return;
                }
                viewGroup.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                HashMap map = ((SentenceView) viewGroup).f65009e;
                int size = map.size() - 1;
                int i6 = 0;
                while (true) {
                    if (i6 < size) {
                        i6++;
                        List list = (List) map.get(Integer.valueOf(i6));
                        if (list == null || list.size() != 1) {
                        }
                    } else {
                        z = false;
                    }
                }
                sentenceBuilderView.f32810i = z;
                if (z) {
                    sentenceBuilderView.f32804c.removeAllViews();
                }
                sentenceBuilderView.f32803b.setOutlineDisabled(sentenceBuilderView.f32810i);
                sentenceBuilderView.f32802a.setOutlineDisabled(sentenceBuilderView.f32810i);
                return;
        }
    }
}
