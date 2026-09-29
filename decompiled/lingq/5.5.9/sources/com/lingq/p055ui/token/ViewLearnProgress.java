package com.lingq.p055ui.token;

import ae.C0062b;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.token.ViewLearnProgress;
import com.lingq.shared.uimodel.CardExtendedStatus;
import com.lingq.shared.uimodel.CardStatus;
import com.lingq.shared.uimodel.WordStatus;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import p015ak.ViewOnClickListenerC0111h;
import p225kk.C6716m;
import ph.C8284f4;
import sj.ViewOnClickListenerC9058q;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m13365d2 = {"Lcom/lingq/ui/token/ViewLearnProgress;", "Landroid/widget/LinearLayout;", "Lcom/lingq/ui/token/ViewLearnProgress$a;", "onChangeStatusListener", "Lsl/e;", "setOnChangeStatusListener", "Lph/f4;", "a", "Lph/f4;", "getBinding", "()Lph/f4;", "binding", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ViewLearnProgress extends LinearLayout {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f31718c = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final C8284f4 binding;

    /* JADX INFO: renamed from: b */
    public InterfaceC4863a f31720b;

    /* JADX INFO: renamed from: com.lingq.ui.token.ViewLearnProgress$a */
    public interface InterfaceC4863a {
        /* JADX INFO: renamed from: a */
        void mo10269a(int i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewLearnProgress(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C5207g.m11111f(context, "context");
        final int i10 = 0;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.view_card_learn_progress, (ViewGroup) this, false);
        addView(viewInflate);
        int i11 = R.id.btnProgressFamiliar;
        TextView textView = (TextView) C0062b.m298P0(viewInflate, R.id.btnProgressFamiliar);
        if (textView != null) {
            i11 = R.id.btnProgressIgnore;
            ImageButton imageButton = (ImageButton) C0062b.m298P0(viewInflate, R.id.btnProgressIgnore);
            if (imageButton != null) {
                i11 = R.id.btnProgressKnown;
                ImageButton imageButton2 = (ImageButton) C0062b.m298P0(viewInflate, R.id.btnProgressKnown);
                if (imageButton2 != null) {
                    i11 = R.id.btnProgressLearned;
                    TextView textView2 = (TextView) C0062b.m298P0(viewInflate, R.id.btnProgressLearned);
                    if (textView2 != null) {
                        i11 = R.id.btnProgressNew;
                        TextView textView3 = (TextView) C0062b.m298P0(viewInflate, R.id.btnProgressNew);
                        if (textView3 != null) {
                            i11 = R.id.btnProgressRecognized;
                            TextView textView4 = (TextView) C0062b.m298P0(viewInflate, R.id.btnProgressRecognized);
                            if (textView4 != null) {
                                this.binding = new C8284f4(textView, imageButton, imageButton2, textView2, textView3, textView4);
                                textView3.setOnClickListener(new View.OnClickListener(this) { // from class: fk.r

                                    /* JADX INFO: renamed from: b */
                                    public final /* synthetic */ ViewLearnProgress f34383b;

                                    {
                                        this.f34383b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i12 = i10;
                                        ViewLearnProgress viewLearnProgress = this.f34383b;
                                        switch (i12) {
                                            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                                int i13 = ViewLearnProgress.f31718c;
                                                C5207g.m11111f(viewLearnProgress, "this$0");
                                                ViewLearnProgress.InterfaceC4863a interfaceC4863a = viewLearnProgress.f31720b;
                                                if (interfaceC4863a != null) {
                                                    interfaceC4863a.mo10269a(CardStatus.New.getValue());
                                                }
                                                break;
                                            default:
                                                int i14 = ViewLearnProgress.f31718c;
                                                C5207g.m11111f(viewLearnProgress, "this$0");
                                                ViewLearnProgress.InterfaceC4863a interfaceC4863a2 = viewLearnProgress.f31720b;
                                                if (interfaceC4863a2 != null) {
                                                    interfaceC4863a2.mo10269a(CardStatus.Known.getValue());
                                                }
                                                break;
                                        }
                                    }
                                });
                                textView4.setOnClickListener(new View.OnClickListener(this) { // from class: fk.s

                                    /* JADX INFO: renamed from: b */
                                    public final /* synthetic */ ViewLearnProgress f34385b;

                                    {
                                        this.f34385b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i12 = i10;
                                        ViewLearnProgress viewLearnProgress = this.f34385b;
                                        switch (i12) {
                                            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                                int i13 = ViewLearnProgress.f31718c;
                                                C5207g.m11111f(viewLearnProgress, "this$0");
                                                ViewLearnProgress.InterfaceC4863a interfaceC4863a = viewLearnProgress.f31720b;
                                                if (interfaceC4863a != null) {
                                                    interfaceC4863a.mo10269a(CardStatus.Recognized.getValue());
                                                }
                                                break;
                                            default:
                                                int i14 = ViewLearnProgress.f31718c;
                                                C5207g.m11111f(viewLearnProgress, "this$0");
                                                ViewLearnProgress.InterfaceC4863a interfaceC4863a2 = viewLearnProgress.f31720b;
                                                if (interfaceC4863a2 != null) {
                                                    interfaceC4863a2.mo10269a(CardStatus.Ignored.getValue());
                                                }
                                                break;
                                        }
                                    }
                                });
                                textView.setOnClickListener(new ViewOnClickListenerC9058q(5, this));
                                textView2.setOnClickListener(new ViewOnClickListenerC0111h(2, this));
                                final int i12 = 1;
                                imageButton2.setOnClickListener(new View.OnClickListener(this) { // from class: fk.r

                                    /* JADX INFO: renamed from: b */
                                    public final /* synthetic */ ViewLearnProgress f34383b;

                                    {
                                        this.f34383b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i13 = i12;
                                        ViewLearnProgress viewLearnProgress = this.f34383b;
                                        switch (i13) {
                                            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                                int i14 = ViewLearnProgress.f31718c;
                                                C5207g.m11111f(viewLearnProgress, "this$0");
                                                ViewLearnProgress.InterfaceC4863a interfaceC4863a = viewLearnProgress.f31720b;
                                                if (interfaceC4863a != null) {
                                                    interfaceC4863a.mo10269a(CardStatus.New.getValue());
                                                }
                                                break;
                                            default:
                                                int i15 = ViewLearnProgress.f31718c;
                                                C5207g.m11111f(viewLearnProgress, "this$0");
                                                ViewLearnProgress.InterfaceC4863a interfaceC4863a2 = viewLearnProgress.f31720b;
                                                if (interfaceC4863a2 != null) {
                                                    interfaceC4863a2.mo10269a(CardStatus.Known.getValue());
                                                }
                                                break;
                                        }
                                    }
                                });
                                imageButton.setOnClickListener(new View.OnClickListener(this) { // from class: fk.s

                                    /* JADX INFO: renamed from: b */
                                    public final /* synthetic */ ViewLearnProgress f34385b;

                                    {
                                        this.f34385b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i13 = i12;
                                        ViewLearnProgress viewLearnProgress = this.f34385b;
                                        switch (i13) {
                                            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                                int i14 = ViewLearnProgress.f31718c;
                                                C5207g.m11111f(viewLearnProgress, "this$0");
                                                ViewLearnProgress.InterfaceC4863a interfaceC4863a = viewLearnProgress.f31720b;
                                                if (interfaceC4863a != null) {
                                                    interfaceC4863a.mo10269a(CardStatus.Recognized.getValue());
                                                }
                                                break;
                                            default:
                                                int i15 = ViewLearnProgress.f31718c;
                                                C5207g.m11111f(viewLearnProgress, "this$0");
                                                ViewLearnProgress.InterfaceC4863a interfaceC4863a2 = viewLearnProgress.f31720b;
                                                if (interfaceC4863a2 != null) {
                                                    interfaceC4863a2.mo10269a(CardStatus.Ignored.getValue());
                                                }
                                                break;
                                        }
                                    }
                                });
                                m10385a();
                                return;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }

    /* JADX WARN: Unreachable blocks removed: 4, instructions: 4 */
    /* JADX INFO: renamed from: a */
    public final void m10385a() {
        measure(0, 0);
        C8284f4 c8284f4 = this.binding;
        int measuredWidth = c8284f4.f44770e.getMeasuredWidth();
        TextView textView = c8284f4.f44770e;
        int measuredHeight = textView.getMeasuredHeight();
        if (measuredWidth < measuredHeight) {
            measuredWidth = measuredHeight;
        }
        C5207g.m11110e(textView, "btnProgressNew");
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = measuredWidth;
        layoutParams.height = measuredWidth;
        textView.setLayoutParams(layoutParams);
        TextView textView2 = c8284f4.f44771f;
        C5207g.m11110e(textView2, "btnProgressRecognized");
        ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams2.width = measuredWidth;
        layoutParams2.height = measuredWidth;
        textView2.setLayoutParams(layoutParams2);
        TextView textView3 = c8284f4.f44766a;
        C5207g.m11110e(textView3, "btnProgressFamiliar");
        ViewGroup.LayoutParams layoutParams3 = textView3.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams3.width = measuredWidth;
        layoutParams3.height = measuredWidth;
        textView3.setLayoutParams(layoutParams3);
        TextView textView4 = c8284f4.f44769d;
        C5207g.m11110e(textView4, "btnProgressLearned");
        ViewGroup.LayoutParams layoutParams4 = textView4.getLayoutParams();
        if (layoutParams4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams4.width = measuredWidth;
        layoutParams4.height = measuredWidth;
        textView4.setLayoutParams(layoutParams4);
        ImageButton imageButton = c8284f4.f44768c;
        C5207g.m11110e(imageButton, "btnProgressKnown");
        ViewGroup.LayoutParams layoutParams5 = imageButton.getLayoutParams();
        if (layoutParams5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams5.width = measuredWidth;
        layoutParams5.height = measuredWidth;
        imageButton.setLayoutParams(layoutParams5);
        ImageButton imageButton2 = c8284f4.f44767b;
        C5207g.m11110e(imageButton2, "btnProgressIgnore");
        ViewGroup.LayoutParams layoutParams6 = imageButton2.getLayoutParams();
        if (layoutParams6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams6.width = measuredWidth;
        layoutParams6.height = measuredWidth;
        imageButton2.setLayoutParams(layoutParams6);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x014c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0152  */
    /* JADX WARN: Code duplicated, block: B:23:0x0168  */
    /* JADX WARN: Code duplicated, block: B:25:0x0172  */
    /* JADX INFO: renamed from: b */
    public final void m10386b(int i10, Integer num) {
        if (i10 == CardStatus.Known.getValue()) {
            i10 = CardStatus.Learned.getValue();
        }
        C8284f4 c8284f4 = this.binding;
        TextView textView = c8284f4.f44770e;
        C5207g.m11110e(textView, "btnProgressNew");
        List<Integer> list = C6716m.f37937a;
        Context context = getContext();
        C5207g.m11110e(context, "context");
        C4924a.m10455d0(textView, C6716m.m13333r(R.attr.yellowWordColor, context));
        TextView textView2 = c8284f4.f44771f;
        C5207g.m11110e(textView2, "btnProgressRecognized");
        Context context2 = getContext();
        C5207g.m11110e(context2, "context");
        C4924a.m10455d0(textView2, C6716m.m13333r(R.attr.yellowWordStatus2Color, context2));
        TextView textView3 = c8284f4.f44766a;
        C5207g.m11110e(textView3, "btnProgressFamiliar");
        Context context3 = getContext();
        C5207g.m11110e(context3, "context");
        C4924a.m10455d0(textView3, C6716m.m13333r(R.attr.yellowWordStatus3Color, context3));
        TextView textView4 = c8284f4.f44769d;
        C5207g.m11110e(textView4, "btnProgressLearned");
        Context context4 = getContext();
        C5207g.m11110e(context4, "context");
        C4924a.m10455d0(textView4, C6716m.m13333r(R.attr.loadingColor, context4));
        ImageButton imageButton = c8284f4.f44767b;
        C5207g.m11110e(imageButton, "btnProgressIgnore");
        Context context5 = getContext();
        C5207g.m11110e(context5, "context");
        C4924a.m10455d0(imageButton, C6716m.m13333r(R.attr.loadingColor, context5));
        ImageButton imageButton2 = c8284f4.f44768c;
        C5207g.m11110e(imageButton2, "btnProgressKnown");
        Context context6 = getContext();
        C5207g.m11110e(context6, "context");
        C4924a.m10455d0(imageButton2, C6716m.m13333r(R.attr.loadingColor, context6));
        int value = CardStatus.New.getValue();
        TextView textView5 = c8284f4.f44770e;
        if (i10 == value) {
            textView5.setActivated(true);
            textView2.setActivated(false);
            textView3.setActivated(false);
            textView4.setActivated(false);
            imageButton2.setActivated(false);
            imageButton.setActivated(false);
        } else if (i10 == CardStatus.Recognized.getValue()) {
            textView2.setActivated(true);
            textView5.setActivated(false);
            textView3.setActivated(false);
            textView4.setActivated(false);
            imageButton2.setActivated(false);
            imageButton.setActivated(false);
        } else if (i10 == CardStatus.Familiar.getValue()) {
            textView3.setActivated(true);
            textView2.setActivated(false);
            textView5.setActivated(false);
            textView4.setActivated(false);
            imageButton2.setActivated(false);
            imageButton.setActivated(false);
        } else {
            CardStatus cardStatus = CardStatus.Learned;
            if (i10 == cardStatus.getValue() && num != null) {
                if (num.intValue() == CardExtendedStatus.Known.getValue()) {
                    imageButton2.setActivated(true);
                    textView2.setActivated(false);
                    textView3.setActivated(false);
                    textView5.setActivated(false);
                    textView4.setActivated(false);
                    imageButton.setActivated(false);
                } else if (i10 == cardStatus.getValue()) {
                    textView4.setActivated(true);
                    textView2.setActivated(false);
                    textView3.setActivated(false);
                    textView5.setActivated(false);
                    imageButton2.setActivated(false);
                    imageButton.setActivated(false);
                } else if (i10 == CardStatus.Ignored.getValue()) {
                    imageButton.setActivated(true);
                    textView2.setActivated(false);
                    textView3.setActivated(false);
                    textView5.setActivated(false);
                    textView4.setActivated(false);
                    imageButton2.setActivated(false);
                }
            } else if (i10 == cardStatus.getValue()) {
                textView4.setActivated(true);
                textView2.setActivated(false);
                textView3.setActivated(false);
                textView5.setActivated(false);
                imageButton2.setActivated(false);
                imageButton.setActivated(false);
            } else if (i10 == CardStatus.Ignored.getValue()) {
                imageButton.setActivated(true);
                textView2.setActivated(false);
                textView3.setActivated(false);
                textView5.setActivated(false);
                textView4.setActivated(false);
                imageButton2.setActivated(false);
            }
        }
        m10385a();
    }

    /* JADX INFO: renamed from: c */
    public final void m10387c(String str) {
        C5207g.m11111f(str, "status");
        C8284f4 c8284f4 = this.binding;
        TextView textView = c8284f4.f44770e;
        C5207g.m11110e(textView, "btnProgressNew");
        List<Integer> list = C6716m.f37937a;
        Context context = getContext();
        C5207g.m11110e(context, "context");
        C4924a.m10455d0(textView, C6716m.m13333r(R.attr.yellowWordColor, context));
        TextView textView2 = c8284f4.f44771f;
        C5207g.m11110e(textView2, "btnProgressRecognized");
        Context context2 = getContext();
        C5207g.m11110e(context2, "context");
        C4924a.m10455d0(textView2, C6716m.m13333r(R.attr.yellowWordStatus2Color, context2));
        TextView textView3 = c8284f4.f44766a;
        C5207g.m11110e(textView3, "btnProgressFamiliar");
        Context context3 = getContext();
        C5207g.m11110e(context3, "context");
        C4924a.m10455d0(textView3, C6716m.m13333r(R.attr.yellowWordStatus3Color, context3));
        TextView textView4 = c8284f4.f44769d;
        C5207g.m11110e(textView4, "btnProgressLearned");
        Context context4 = getContext();
        C5207g.m11110e(context4, "context");
        C4924a.m10455d0(textView4, C6716m.m13333r(R.attr.loadingColor, context4));
        ImageButton imageButton = c8284f4.f44767b;
        C5207g.m11110e(imageButton, "btnProgressIgnore");
        Context context5 = getContext();
        C5207g.m11110e(context5, "context");
        C4924a.m10455d0(imageButton, C6716m.m13333r(R.attr.loadingColor, context5));
        ImageButton imageButton2 = c8284f4.f44768c;
        C5207g.m11110e(imageButton2, "btnProgressKnown");
        Context context6 = getContext();
        C5207g.m11110e(context6, "context");
        C4924a.m10455d0(imageButton2, C6716m.m13333r(R.attr.loadingColor, context6));
        boolean zM11106a = C5207g.m11106a(str, WordStatus.New.getValue());
        TextView textView5 = c8284f4.f44770e;
        if (zM11106a) {
            textView5.setActivated(false);
            textView2.setActivated(false);
            textView3.setActivated(false);
            textView4.setActivated(false);
            imageButton2.setActivated(false);
            imageButton.setActivated(false);
        } else if (C5207g.m11106a(str, WordStatus.Ignored.getValue())) {
            textView2.setActivated(false);
            textView5.setActivated(false);
            textView3.setActivated(false);
            textView4.setActivated(false);
            imageButton2.setActivated(false);
            imageButton.setActivated(true);
        } else if (C5207g.m11106a(str, WordStatus.Known.getValue())) {
            textView3.setActivated(false);
            textView2.setActivated(false);
            textView5.setActivated(false);
            textView4.setActivated(false);
            imageButton2.setActivated(true);
            imageButton.setActivated(false);
        }
        m10385a();
    }

    public final C8284f4 getBinding() {
        return this.binding;
    }

    public final void setOnChangeStatusListener(InterfaceC4863a interfaceC4863a) {
        C5207g.m11111f(interfaceC4863a, "onChangeStatusListener");
        this.f31720b = interfaceC4863a;
    }
}
