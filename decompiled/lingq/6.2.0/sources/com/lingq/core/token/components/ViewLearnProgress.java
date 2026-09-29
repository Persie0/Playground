package com.lingq.core.token.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.lingq.core.designsystem.R$attr;
import com.lingq.core.domain.model.status.CardExtendedStatus;
import com.lingq.core.domain.model.status.CardStatus;
import com.lingq.core.token.components.ViewLearnProgress;
import com.lingq.feature.token.R$id;
import com.lingq.feature.token.R$layout;
import p000.C3386nv;
import p000.abd;
import p000.jfa;
import p000.lfa;
import p000.ppc;
import p000.qsa;
import p000.uta;
import p000.vs3;
import p000.y52;
import p000.yd5;

/* JADX INFO: loaded from: classes3.dex */
public final class ViewLearnProgress extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public final qsa f23733a;

    /* JADX INFO: renamed from: b */
    public uta f23734b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewLearnProgress(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        final int i2 = 0;
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.view_card_learn_progress, (ViewGroup) this, false);
        addView(viewInflate);
        int i3 = R$id.btnProgressFamiliar;
        TextView textView = (TextView) lfa.m16159c(viewInflate, i3);
        if (textView != null) {
            i3 = R$id.btnProgressIgnore;
            ImageButton imageButton = (ImageButton) lfa.m16159c(viewInflate, i3);
            if (imageButton != null) {
                i3 = R$id.btnProgressKnown;
                ImageButton imageButton2 = (ImageButton) lfa.m16159c(viewInflate, i3);
                if (imageButton2 != null) {
                    i3 = R$id.btnProgressLearned;
                    TextView textView2 = (TextView) lfa.m16159c(viewInflate, i3);
                    if (textView2 != null) {
                        i3 = R$id.btnProgressNew;
                        TextView textView3 = (TextView) lfa.m16159c(viewInflate, i3);
                        if (textView3 != null) {
                            i3 = R$id.btnProgressRecognized;
                            TextView textView4 = (TextView) lfa.m16159c(viewInflate, i3);
                            if (textView4 != null) {
                                this.f23733a = new qsa(textView, imageButton, imageButton2, textView2, textView3, textView4);
                                textView3.setOnClickListener(new View.OnClickListener(this) { // from class: tta

                                    /* JADX INFO: renamed from: b */
                                    public final /* synthetic */ ViewLearnProgress f62871b;

                                    {
                                        this.f62871b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i4 = i2;
                                        ViewLearnProgress viewLearnProgress = this.f62871b;
                                        switch (i4) {
                                            case 0:
                                                uta utaVar = viewLearnProgress.f23734b;
                                                if (utaVar != null) {
                                                    utaVar.mo9556c(CardStatus.New.getValue());
                                                }
                                                break;
                                            case 1:
                                                uta utaVar2 = viewLearnProgress.f23734b;
                                                if (utaVar2 != null) {
                                                    utaVar2.mo9556c(CardStatus.Recognized.getValue());
                                                }
                                                break;
                                            case 2:
                                                uta utaVar3 = viewLearnProgress.f23734b;
                                                if (utaVar3 != null) {
                                                    utaVar3.mo9556c(CardStatus.Familiar.getValue());
                                                }
                                                break;
                                            case 3:
                                                uta utaVar4 = viewLearnProgress.f23734b;
                                                if (utaVar4 != null) {
                                                    utaVar4.mo9556c(CardStatus.Learned.getValue());
                                                }
                                                break;
                                            case 4:
                                                uta utaVar5 = viewLearnProgress.f23734b;
                                                if (utaVar5 != null) {
                                                    utaVar5.mo9556c(CardStatus.Known.getValue());
                                                }
                                                break;
                                            default:
                                                uta utaVar6 = viewLearnProgress.f23734b;
                                                if (utaVar6 != null) {
                                                    utaVar6.mo9556c(CardStatus.Ignored.getValue());
                                                }
                                                break;
                                        }
                                    }
                                });
                                final int i4 = 1;
                                textView4.setOnClickListener(new View.OnClickListener(this) { // from class: tta

                                    /* JADX INFO: renamed from: b */
                                    public final /* synthetic */ ViewLearnProgress f62871b;

                                    {
                                        this.f62871b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i5 = i4;
                                        ViewLearnProgress viewLearnProgress = this.f62871b;
                                        switch (i5) {
                                            case 0:
                                                uta utaVar = viewLearnProgress.f23734b;
                                                if (utaVar != null) {
                                                    utaVar.mo9556c(CardStatus.New.getValue());
                                                }
                                                break;
                                            case 1:
                                                uta utaVar2 = viewLearnProgress.f23734b;
                                                if (utaVar2 != null) {
                                                    utaVar2.mo9556c(CardStatus.Recognized.getValue());
                                                }
                                                break;
                                            case 2:
                                                uta utaVar3 = viewLearnProgress.f23734b;
                                                if (utaVar3 != null) {
                                                    utaVar3.mo9556c(CardStatus.Familiar.getValue());
                                                }
                                                break;
                                            case 3:
                                                uta utaVar4 = viewLearnProgress.f23734b;
                                                if (utaVar4 != null) {
                                                    utaVar4.mo9556c(CardStatus.Learned.getValue());
                                                }
                                                break;
                                            case 4:
                                                uta utaVar5 = viewLearnProgress.f23734b;
                                                if (utaVar5 != null) {
                                                    utaVar5.mo9556c(CardStatus.Known.getValue());
                                                }
                                                break;
                                            default:
                                                uta utaVar6 = viewLearnProgress.f23734b;
                                                if (utaVar6 != null) {
                                                    utaVar6.mo9556c(CardStatus.Ignored.getValue());
                                                }
                                                break;
                                        }
                                    }
                                });
                                final int i5 = 2;
                                textView.setOnClickListener(new View.OnClickListener(this) { // from class: tta

                                    /* JADX INFO: renamed from: b */
                                    public final /* synthetic */ ViewLearnProgress f62871b;

                                    {
                                        this.f62871b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i6 = i5;
                                        ViewLearnProgress viewLearnProgress = this.f62871b;
                                        switch (i6) {
                                            case 0:
                                                uta utaVar = viewLearnProgress.f23734b;
                                                if (utaVar != null) {
                                                    utaVar.mo9556c(CardStatus.New.getValue());
                                                }
                                                break;
                                            case 1:
                                                uta utaVar2 = viewLearnProgress.f23734b;
                                                if (utaVar2 != null) {
                                                    utaVar2.mo9556c(CardStatus.Recognized.getValue());
                                                }
                                                break;
                                            case 2:
                                                uta utaVar3 = viewLearnProgress.f23734b;
                                                if (utaVar3 != null) {
                                                    utaVar3.mo9556c(CardStatus.Familiar.getValue());
                                                }
                                                break;
                                            case 3:
                                                uta utaVar4 = viewLearnProgress.f23734b;
                                                if (utaVar4 != null) {
                                                    utaVar4.mo9556c(CardStatus.Learned.getValue());
                                                }
                                                break;
                                            case 4:
                                                uta utaVar5 = viewLearnProgress.f23734b;
                                                if (utaVar5 != null) {
                                                    utaVar5.mo9556c(CardStatus.Known.getValue());
                                                }
                                                break;
                                            default:
                                                uta utaVar6 = viewLearnProgress.f23734b;
                                                if (utaVar6 != null) {
                                                    utaVar6.mo9556c(CardStatus.Ignored.getValue());
                                                }
                                                break;
                                        }
                                    }
                                });
                                final int i6 = 3;
                                textView2.setOnClickListener(new View.OnClickListener(this) { // from class: tta

                                    /* JADX INFO: renamed from: b */
                                    public final /* synthetic */ ViewLearnProgress f62871b;

                                    {
                                        this.f62871b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i7 = i6;
                                        ViewLearnProgress viewLearnProgress = this.f62871b;
                                        switch (i7) {
                                            case 0:
                                                uta utaVar = viewLearnProgress.f23734b;
                                                if (utaVar != null) {
                                                    utaVar.mo9556c(CardStatus.New.getValue());
                                                }
                                                break;
                                            case 1:
                                                uta utaVar2 = viewLearnProgress.f23734b;
                                                if (utaVar2 != null) {
                                                    utaVar2.mo9556c(CardStatus.Recognized.getValue());
                                                }
                                                break;
                                            case 2:
                                                uta utaVar3 = viewLearnProgress.f23734b;
                                                if (utaVar3 != null) {
                                                    utaVar3.mo9556c(CardStatus.Familiar.getValue());
                                                }
                                                break;
                                            case 3:
                                                uta utaVar4 = viewLearnProgress.f23734b;
                                                if (utaVar4 != null) {
                                                    utaVar4.mo9556c(CardStatus.Learned.getValue());
                                                }
                                                break;
                                            case 4:
                                                uta utaVar5 = viewLearnProgress.f23734b;
                                                if (utaVar5 != null) {
                                                    utaVar5.mo9556c(CardStatus.Known.getValue());
                                                }
                                                break;
                                            default:
                                                uta utaVar6 = viewLearnProgress.f23734b;
                                                if (utaVar6 != null) {
                                                    utaVar6.mo9556c(CardStatus.Ignored.getValue());
                                                }
                                                break;
                                        }
                                    }
                                });
                                final int i7 = 4;
                                imageButton2.setOnClickListener(new View.OnClickListener(this) { // from class: tta

                                    /* JADX INFO: renamed from: b */
                                    public final /* synthetic */ ViewLearnProgress f62871b;

                                    {
                                        this.f62871b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i8 = i7;
                                        ViewLearnProgress viewLearnProgress = this.f62871b;
                                        switch (i8) {
                                            case 0:
                                                uta utaVar = viewLearnProgress.f23734b;
                                                if (utaVar != null) {
                                                    utaVar.mo9556c(CardStatus.New.getValue());
                                                }
                                                break;
                                            case 1:
                                                uta utaVar2 = viewLearnProgress.f23734b;
                                                if (utaVar2 != null) {
                                                    utaVar2.mo9556c(CardStatus.Recognized.getValue());
                                                }
                                                break;
                                            case 2:
                                                uta utaVar3 = viewLearnProgress.f23734b;
                                                if (utaVar3 != null) {
                                                    utaVar3.mo9556c(CardStatus.Familiar.getValue());
                                                }
                                                break;
                                            case 3:
                                                uta utaVar4 = viewLearnProgress.f23734b;
                                                if (utaVar4 != null) {
                                                    utaVar4.mo9556c(CardStatus.Learned.getValue());
                                                }
                                                break;
                                            case 4:
                                                uta utaVar5 = viewLearnProgress.f23734b;
                                                if (utaVar5 != null) {
                                                    utaVar5.mo9556c(CardStatus.Known.getValue());
                                                }
                                                break;
                                            default:
                                                uta utaVar6 = viewLearnProgress.f23734b;
                                                if (utaVar6 != null) {
                                                    utaVar6.mo9556c(CardStatus.Ignored.getValue());
                                                }
                                                break;
                                        }
                                    }
                                });
                                final int i8 = 5;
                                imageButton.setOnClickListener(new View.OnClickListener(this) { // from class: tta

                                    /* JADX INFO: renamed from: b */
                                    public final /* synthetic */ ViewLearnProgress f62871b;

                                    {
                                        this.f62871b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i9 = i8;
                                        ViewLearnProgress viewLearnProgress = this.f62871b;
                                        switch (i9) {
                                            case 0:
                                                uta utaVar = viewLearnProgress.f23734b;
                                                if (utaVar != null) {
                                                    utaVar.mo9556c(CardStatus.New.getValue());
                                                }
                                                break;
                                            case 1:
                                                uta utaVar2 = viewLearnProgress.f23734b;
                                                if (utaVar2 != null) {
                                                    utaVar2.mo9556c(CardStatus.Recognized.getValue());
                                                }
                                                break;
                                            case 2:
                                                uta utaVar3 = viewLearnProgress.f23734b;
                                                if (utaVar3 != null) {
                                                    utaVar3.mo9556c(CardStatus.Familiar.getValue());
                                                }
                                                break;
                                            case 3:
                                                uta utaVar4 = viewLearnProgress.f23734b;
                                                if (utaVar4 != null) {
                                                    utaVar4.mo9556c(CardStatus.Learned.getValue());
                                                }
                                                break;
                                            case 4:
                                                uta utaVar5 = viewLearnProgress.f23734b;
                                                if (utaVar5 != null) {
                                                    utaVar5.mo9556c(CardStatus.Known.getValue());
                                                }
                                                break;
                                            default:
                                                uta utaVar6 = viewLearnProgress.f23734b;
                                                if (utaVar6 != null) {
                                                    utaVar6.mo9556c(CardStatus.Ignored.getValue());
                                                }
                                                break;
                                        }
                                    }
                                });
                                m8707a();
                                return;
                            }
                        }
                    }
                }
            }
        }
        C3386nv.m17635v("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final void m8707a() {
        measure(0, 0);
        qsa qsaVar = this.f23733a;
        int measuredWidth = qsaVar.f58167e.getMeasuredWidth();
        TextView textView = qsaVar.f58167e;
        int measuredHeight = textView.getMeasuredHeight();
        if (measuredWidth < measuredHeight) {
            measuredWidth = measuredHeight;
        }
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            C3386nv.m17635v("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        layoutParams.width = measuredWidth;
        layoutParams.height = measuredWidth;
        textView.setLayoutParams(layoutParams);
        TextView textView2 = qsaVar.f58168f;
        ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
        if (layoutParams2 == null) {
            C3386nv.m17635v("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        layoutParams2.width = measuredWidth;
        layoutParams2.height = measuredWidth;
        textView2.setLayoutParams(layoutParams2);
        TextView textView3 = qsaVar.f58163a;
        ViewGroup.LayoutParams layoutParams3 = textView3.getLayoutParams();
        if (layoutParams3 == null) {
            C3386nv.m17635v("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        layoutParams3.width = measuredWidth;
        layoutParams3.height = measuredWidth;
        textView3.setLayoutParams(layoutParams3);
        TextView textView4 = qsaVar.f58166d;
        ViewGroup.LayoutParams layoutParams4 = textView4.getLayoutParams();
        if (layoutParams4 == null) {
            C3386nv.m17635v("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        layoutParams4.width = measuredWidth;
        layoutParams4.height = measuredWidth;
        textView4.setLayoutParams(layoutParams4);
        ImageButton imageButton = qsaVar.f58165c;
        ViewGroup.LayoutParams layoutParams5 = imageButton.getLayoutParams();
        if (layoutParams5 == null) {
            C3386nv.m17635v("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        layoutParams5.width = measuredWidth;
        layoutParams5.height = measuredWidth;
        imageButton.setLayoutParams(layoutParams5);
        ImageButton imageButton2 = qsaVar.f58164b;
        ViewGroup.LayoutParams layoutParams6 = imageButton2.getLayoutParams();
        if (layoutParams6 == null) {
            C3386nv.m17635v("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        layoutParams6.width = measuredWidth;
        layoutParams6.height = measuredWidth;
        imageButton2.setLayoutParams(layoutParams6);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:22:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:23:0x0109  */
    /* JADX WARN: Code duplicated, block: B:25:0x0111  */
    /* JADX INFO: renamed from: b */
    public final void m8708b(vs3 vs3Var, int i, Integer num) {
        vs3Var.getClass();
        yd5 yd5Var = vs3Var.f65847c;
        if (i == CardStatus.Known.getValue()) {
            i = CardStatus.Learned.getValue();
        }
        qsa qsaVar = this.f23733a;
        TextView textView = qsaVar.f58167e;
        ppc.m19445d(textView, abd.m253i(yd5Var.f69687a.f67242a));
        TextView textView2 = qsaVar.f58168f;
        ppc.m19445d(textView2, abd.m253i(yd5Var.f69688b.f67242a));
        TextView textView3 = qsaVar.f58163a;
        ppc.m19445d(textView3, abd.m253i(yd5Var.f69689c.f67242a));
        TextView textView4 = qsaVar.f58166d;
        Context context = getContext();
        context.getClass();
        ppc.m19445d(textView4, jfa.m14431n(context, R$attr.loadingColor));
        ImageButton imageButton = qsaVar.f58164b;
        Context context2 = getContext();
        context2.getClass();
        ppc.m19445d(imageButton, jfa.m14431n(context2, R$attr.loadingColor));
        ImageButton imageButton2 = qsaVar.f58165c;
        Context context3 = getContext();
        context3.getClass();
        ppc.m19445d(imageButton2, jfa.m14431n(context3, R$attr.loadingColor));
        if (i == CardStatus.New.getValue()) {
            textView.setActivated(true);
            textView2.setActivated(false);
            textView3.setActivated(false);
            textView4.setActivated(false);
            imageButton2.setActivated(false);
            imageButton.setActivated(false);
        } else if (i == CardStatus.Recognized.getValue()) {
            textView2.setActivated(true);
            textView.setActivated(false);
            textView3.setActivated(false);
            textView4.setActivated(false);
            imageButton2.setActivated(false);
            imageButton.setActivated(false);
        } else if (i == CardStatus.Familiar.getValue()) {
            textView3.setActivated(true);
            textView2.setActivated(false);
            textView.setActivated(false);
            textView4.setActivated(false);
            imageButton2.setActivated(false);
            imageButton.setActivated(false);
        } else {
            CardStatus cardStatus = CardStatus.Learned;
            if (i == cardStatus.getValue() && num != null) {
                if (num.intValue() == CardExtendedStatus.Known.getValue()) {
                    imageButton2.setActivated(true);
                    textView2.setActivated(false);
                    textView3.setActivated(false);
                    textView.setActivated(false);
                    textView4.setActivated(false);
                    imageButton.setActivated(false);
                } else if (i == cardStatus.getValue()) {
                    textView4.setActivated(true);
                    textView2.setActivated(false);
                    textView3.setActivated(false);
                    textView.setActivated(false);
                    imageButton2.setActivated(false);
                    imageButton.setActivated(false);
                } else if (i == CardStatus.Ignored.getValue()) {
                    imageButton.setActivated(true);
                    textView2.setActivated(false);
                    textView3.setActivated(false);
                    textView.setActivated(false);
                    textView4.setActivated(false);
                    imageButton2.setActivated(false);
                }
            } else if (i == cardStatus.getValue()) {
                textView4.setActivated(true);
                textView2.setActivated(false);
                textView3.setActivated(false);
                textView.setActivated(false);
                imageButton2.setActivated(false);
                imageButton.setActivated(false);
            } else if (i == CardStatus.Ignored.getValue()) {
                imageButton.setActivated(true);
                textView2.setActivated(false);
                textView3.setActivated(false);
                textView.setActivated(false);
                textView4.setActivated(false);
                imageButton2.setActivated(false);
            }
        }
        m8707a();
    }

    public final qsa getBinding() {
        return this.f23733a;
    }

    public final void setOnChangeStatusListener(uta utaVar) {
        utaVar.getClass();
        this.f23734b = utaVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewLearnProgress(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewLearnProgress(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ ViewLearnProgress(Context context, AttributeSet attributeSet, int i, int i2, y52 y52Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
