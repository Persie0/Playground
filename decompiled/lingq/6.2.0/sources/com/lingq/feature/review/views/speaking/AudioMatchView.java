package com.lingq.feature.review.views.speaking;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.lingq.core.designsystem.R$attr;
import com.lingq.feature.review.R$id;
import com.lingq.feature.review.R$layout;
import com.lingq.feature.review.R$string;
import com.lingq.feature.review.views.speaking.AudioMatchView;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p000.AbstractC3515qy;
import p000.C3329mb;
import p000.C3386nv;
import p000.C3440oy;
import p000.C3477py;
import p000.gm5;
import p000.if5;
import p000.jfa;
import p000.lfa;
import p000.rz1;
import p000.ve9;
import p000.xe9;
import p000.xz7;
import p000.y52;
import p000.ya1;
import p000.zq5;

/* JADX INFO: loaded from: classes3.dex */
public final class AudioMatchView extends ConstraintLayout {
    private static final C3477py Companion = new C3477py();

    /* JADX INFO: renamed from: N */
    public static final /* synthetic */ int f32785N = 0;

    /* JADX INFO: renamed from: L */
    public final if5 f32786L;

    /* JADX INFO: renamed from: M */
    public ve9 f32787M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioMatchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        final int i = 0;
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.view_activity_audio_speak, (ViewGroup) this, false);
        addView(viewInflate);
        int i2 = R$id.btnSpeak;
        MaterialButton materialButton = (MaterialButton) lfa.m16159c(viewInflate, i2);
        if (materialButton != null) {
            i2 = R$id.btnTts;
            ImageButton imageButton = (ImageButton) lfa.m16159c(viewInflate, i2);
            if (imageButton != null) {
                i2 = R$id.tvDescription;
                if (((TextView) lfa.m16159c(viewInflate, i2)) != null) {
                    i2 = R$id.tvMatch;
                    MatchTextView matchTextView = (MatchTextView) lfa.m16159c(viewInflate, i2);
                    if (matchTextView != null) {
                        i2 = R$id.tvScore;
                        TextView textView = (TextView) lfa.m16159c(viewInflate, i2);
                        if (textView != null) {
                            i2 = R$id.tvSpeech;
                            TextView textView2 = (TextView) lfa.m16159c(viewInflate, i2);
                            if (textView2 != null) {
                                this.f32786L = new if5(materialButton, imageButton, matchTextView, textView, textView2);
                                m9659o(SpeechRecognitionState.IDLE);
                                materialButton.setOnClickListener(new View.OnClickListener(this) { // from class: ny

                                    /* JADX INFO: renamed from: b */
                                    public final /* synthetic */ AudioMatchView f53377b;

                                    {
                                        this.f53377b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        ve9 ve9Var;
                                        int i3 = i;
                                        AudioMatchView audioMatchView = this.f53377b;
                                        switch (i3) {
                                            case 0:
                                                ve9 ve9Var2 = audioMatchView.f32787M;
                                                if (ve9Var2 != null) {
                                                    ve9Var2.mo4448d();
                                                }
                                                break;
                                            default:
                                                if (audioMatchView.f32786L.f44045a.isEnabled() && (ve9Var = audioMatchView.f32787M) != null) {
                                                    ve9Var.mo4449e();
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                final int i3 = 1;
                                imageButton.setOnClickListener(new View.OnClickListener(this) { // from class: ny

                                    /* JADX INFO: renamed from: b */
                                    public final /* synthetic */ AudioMatchView f53377b;

                                    {
                                        this.f53377b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        ve9 ve9Var;
                                        int i4 = i3;
                                        AudioMatchView audioMatchView = this.f53377b;
                                        switch (i4) {
                                            case 0:
                                                ve9 ve9Var2 = audioMatchView.f32787M;
                                                if (ve9Var2 != null) {
                                                    ve9Var2.mo4448d();
                                                }
                                                break;
                                            default:
                                                if (audioMatchView.f32786L.f44045a.isEnabled() && (ve9Var = audioMatchView.f32787M) != null) {
                                                    ve9Var.mo4449e();
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                matchTextView.setInteraction(new C3440oy(this, i));
                                return;
                            }
                        }
                    }
                }
            }
        }
        C3386nv.m17635v("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        throw null;
    }

    private final void setButtonColor(int i) {
        if5 if5Var = this.f32786L;
        ((MaterialButton) if5Var.f44047c).setStrokeColor(ColorStateList.valueOf(i));
        MaterialButton materialButton = (MaterialButton) if5Var.f44047c;
        materialButton.setTextColor(i);
        materialButton.setIconTint(ColorStateList.valueOf(i));
    }

    /* JADX INFO: renamed from: o */
    public final void m9659o(SpeechRecognitionState speechRecognitionState) {
        int i = AbstractC3515qy.f58359a[speechRecognitionState.ordinal()];
        if5 if5Var = this.f32786L;
        if (i == 1) {
            Context context = getContext();
            context.getClass();
            setButtonColor(jfa.m14431n(context, R$attr.blueTint));
            ((MaterialButton) if5Var.f44047c).setText(R$string.review_start_speaking);
            return;
        }
        if (i == 2) {
            ((MaterialButton) if5Var.f44047c).setText(R$string.review_stop_speaking);
            jfa.m14429l(if5Var.f44046b);
            return;
        }
        if (i == 3) {
            Context context2 = getContext();
            context2.getClass();
            setButtonColor(jfa.m14431n(context2, R$attr.blueTint));
            ((MaterialButton) if5Var.f44047c).setText(R$string.review_start_speaking);
            return;
        }
        if (i != 4) {
            gm5.m12750e();
            return;
        }
        Context context3 = getContext();
        context3.getClass();
        setButtonColor(jfa.m14431n(context3, R$attr.redTint));
        ((MaterialButton) if5Var.f44047c).setText(R$string.review_start_speaking);
    }

    /* JADX INFO: renamed from: p */
    public final void m9660p(xe9 xe9Var, boolean z) {
        xe9Var.getClass();
        String str = xe9Var.f68136c;
        SpeechRecognitionState speechRecognitionState = xe9Var.f68138e;
        boolean z2 = speechRecognitionState != SpeechRecognitionState.LISTENING;
        if5 if5Var = this.f32786L;
        ImageButton imageButton = if5Var.f44045a;
        MatchTextView matchTextView = (MatchTextView) if5Var.f44048d;
        imageButton.setEnabled(z2);
        if5Var.f44045a.setAlpha(z2 ? 1.0f : 0.38f);
        matchTextView.setText(str);
        ((TextView) if5Var.f44049e).setText(xe9Var.f68137d);
        C3329mb c3329mb = xe9Var.f68139f;
        List list = xe9Var.f68140g;
        c3329mb.getClass();
        str.getClass();
        list.getClass();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xz7 xz7Var = (xz7) it.next();
            String str2 = xz7Var.f69008e;
            int i = 0;
            int i2 = 0;
            while (i < str2.length()) {
                str2.charAt(i);
                int i3 = i2 + 1;
                if (((HashSet) c3329mb.f50862d).contains(Integer.valueOf(xz7Var.f69006c + i2))) {
                    int currentTextColor = matchTextView.getCurrentTextColor();
                    int i4 = i2 + xz7Var.f69004a;
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(currentTextColor), i4, i4 + 1, 33);
                } else {
                    int iM25016i = ya1.m25016i(matchTextView.getCurrentTextColor(), 127);
                    int i5 = i2 + xz7Var.f69004a;
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(iM25016i), i5, i5 + 1, 33);
                }
                i++;
                i2 = i3;
                it = it;
            }
            spannableStringBuilder.setSpan(new zq5(matchTextView, xz7Var), xz7Var.f69004a, xz7Var.f69005b, 33);
            Context context = matchTextView.getContext();
            context.getClass();
            spannableStringBuilder.setSpan(new rz1(jfa.m14431n(context, com.google.android.material.R$attr.colorOutline), xz7Var.f69004a, xz7Var.f69005b, z), xz7Var.f69004a, xz7Var.f69005b, 33);
            it = it;
        }
        matchTextView.setText(spannableStringBuilder);
        TextView textView = if5Var.f44046b;
        Locale locale = Locale.getDefault();
        String string = getContext().getString(R$string.review_activity_score);
        string.getClass();
        textView.setText(String.format(locale, string, Arrays.copyOf(new Object[]{Integer.valueOf(xe9Var.f68135b)}, 1)));
        m9659o(speechRecognitionState);
    }

    public final void setInteraction(ve9 ve9Var) {
        ve9Var.getClass();
        this.f32787M = ve9Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AudioMatchView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    public /* synthetic */ AudioMatchView(Context context, AttributeSet attributeSet, int i, y52 y52Var) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
