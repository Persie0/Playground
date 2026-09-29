package com.lingq.p055ui.review.views.speaking;

import ae.C0062b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.button.MaterialButton;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import p067d8.ViewOnClickListenerC5062d0;
import p225kk.C6716m;
import p265mj.C7570d;
import p274n8.ViewOnClickListenerC7718c;
import p513yj.InterfaceC10406h;
import p513yj.InterfaceC10407i;
import ph.C8266c4;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u000f"}, m13365d2 = {"Lcom/lingq/ui/review/views/speaking/AudioMatchView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "color", "Lsl/e;", "setButtonColor", "Lyj/i;", "listener", "setInteraction", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class AudioMatchView extends ConstraintLayout {

    /* JADX INFO: renamed from: N */
    public static final /* synthetic */ int f30453N = 0;

    /* JADX INFO: renamed from: L */
    public final C8266c4 f30454L;

    /* JADX INFO: renamed from: M */
    public InterfaceC10407i f30455M;

    /* JADX INFO: renamed from: com.lingq.ui.review.views.speaking.AudioMatchView$a */
    public static final class C4700a implements InterfaceC10406h {
        public C4700a() {
        }

        @Override // p513yj.InterfaceC10406h
        /* JADX INFO: renamed from: a */
        public final void mo10309a(C7570d c7570d) {
            C5207g.m11111f(c7570d, "it");
            InterfaceC10407i interfaceC10407i = AudioMatchView.this.f30455M;
            if (interfaceC10407i != null) {
                interfaceC10407i.mo10282a(c7570d);
            }
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.review.views.speaking.AudioMatchView$b */
    public /* synthetic */ class C4701b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f30457a;

        static {
            int[] iArr = new int[SpeechRecognitionState.values().length];
            try {
                iArr[SpeechRecognitionState.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SpeechRecognitionState.LISTENING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SpeechRecognitionState.STOPPED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SpeechRecognitionState.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f30457a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioMatchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C5207g.m11111f(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.view_activity_audio_speak, (ViewGroup) this, false);
        addView(viewInflate);
        int i10 = R.id.btnSpeak;
        MaterialButton materialButton = (MaterialButton) C0062b.m298P0(viewInflate, R.id.btnSpeak);
        if (materialButton != null) {
            i10 = R.id.btnTts;
            ImageButton imageButton = (ImageButton) C0062b.m298P0(viewInflate, R.id.btnTts);
            if (imageButton != null) {
                i10 = R.id.tvDescription;
                if (((TextView) C0062b.m298P0(viewInflate, R.id.tvDescription)) != null) {
                    i10 = R.id.tvMatch;
                    MatchTextView matchTextView = (MatchTextView) C0062b.m298P0(viewInflate, R.id.tvMatch);
                    if (matchTextView != null) {
                        i10 = R.id.tvScore;
                        TextView textView = (TextView) C0062b.m298P0(viewInflate, R.id.tvScore);
                        if (textView != null) {
                            i10 = R.id.tvSpeech;
                            TextView textView2 = (TextView) C0062b.m298P0(viewInflate, R.id.tvSpeech);
                            if (textView2 != null) {
                                this.f30454L = new C8266c4((LinearLayout) viewInflate, materialButton, imageButton, matchTextView, textView, textView2);
                                m10308s(SpeechRecognitionState.IDLE);
                                materialButton.setOnClickListener(new ViewOnClickListenerC7718c(28, this));
                                imageButton.setOnClickListener(new ViewOnClickListenerC5062d0(17, this));
                                matchTextView.setInteraction(new C4700a());
                                return;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    private final void setButtonColor(int i10) {
        C8266c4 c8266c4 = this.f30454L;
        ((MaterialButton) c8266c4.f44651c).setStrokeColor(ColorStateList.valueOf(i10));
        ((MaterialButton) c8266c4.f44651c).setTextColor(i10);
        ((MaterialButton) c8266c4.f44651c).setIconTint(ColorStateList.valueOf(i10));
    }

    /* JADX INFO: renamed from: s */
    public final void m10308s(SpeechRecognitionState speechRecognitionState) {
        int i10 = C4701b.f30457a[speechRecognitionState.ordinal()];
        C8266c4 c8266c4 = this.f30454L;
        if (i10 == 1) {
            List<Integer> list = C6716m.f37937a;
            Context context = getContext();
            C5207g.m11110e(context, "context");
            setButtonColor(C6716m.m13333r(R.attr.blueTint, context));
            ((MaterialButton) c8266c4.f44651c).setText(R.string.review_start_speaking);
            return;
        }
        if (i10 == 2) {
            List<Integer> list2 = C6716m.f37937a;
            Context context2 = getContext();
            C5207g.m11110e(context2, "context");
            setButtonColor(C6716m.m13333r(R.attr.primaryTextColor, context2));
            ((MaterialButton) c8266c4.f44651c).setText(R.string.review_stop_speaking);
            TextView textView = c8266c4.f44649a;
            C5207g.m11110e(textView, "binding.tvScore");
            C4924a.m10457e0(textView);
            return;
        }
        if (i10 == 3) {
            List<Integer> list3 = C6716m.f37937a;
            Context context3 = getContext();
            C5207g.m11110e(context3, "context");
            setButtonColor(C6716m.m13333r(R.attr.blueTint, context3));
            ((MaterialButton) c8266c4.f44651c).setText(R.string.review_start_speaking);
            return;
        }
        if (i10 != 4) {
            return;
        }
        List<Integer> list4 = C6716m.f37937a;
        Context context4 = getContext();
        C5207g.m11110e(context4, "context");
        setButtonColor(C6716m.m13333r(R.attr.redTint, context4));
        ((MaterialButton) c8266c4.f44651c).setText(R.string.review_start_speaking);
    }

    public final void setInteraction(InterfaceC10407i interfaceC10407i) {
        C5207g.m11111f(interfaceC10407i, "listener");
        this.f30455M = interfaceC10407i;
    }
}
