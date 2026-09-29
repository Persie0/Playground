package fk;

import ae.C0062b;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.token.TokenControllerType;
import com.lingq.p055ui.token.TokenStatusMenuItem;
import com.lingq.shared.uimodel.CardExtendedStatus;
import com.lingq.shared.uimodel.CardStatus;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import java.util.List;
import ni.C7793a;
import p199jd.ViewOnClickListenerC6464i;
import p225kk.C6716m;
import p408u6.ViewOnClickListenerC9466e;
import sl.C9072e;

/* JADX INFO: renamed from: fk.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C5574p {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2052l<TokenStatusMenuItem, C9072e> f34377a;

    /* JADX WARN: Code duplicated, block: B:53:0x024e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0254  */
    /* JADX WARN: Code duplicated, block: B:56:0x0267  */
    /* JADX WARN: Code duplicated, block: B:58:0x026d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0314 A[PHI: r13
      0x0314: PHI (r13v13 int) = (r13v12 int), (r13v14 int) binds: [B:27:0x00c4, B:29:0x00cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public C5574p(View view, int i10, Integer num, TokenControllerType tokenControllerType, InterfaceC2052l<? super TokenStatusMenuItem, C9072e> interfaceC2052l) {
        int i11;
        C5207g.m11111f(view, "anchor");
        C5207g.m11111f(tokenControllerType, "from");
        this.f34377a = interfaceC2052l;
        Object systemService = view.getContext().getSystemService("layout_inflater");
        C5207g.m11109d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.menu_card_progress, (ViewGroup) null, false);
        int i12 = R.id.btnProgressFamiliar;
        TextView textView = (TextView) C0062b.m298P0(viewInflate, R.id.btnProgressFamiliar);
        if (textView != null) {
            i12 = R.id.btnProgressIgnore;
            ImageButton imageButton = (ImageButton) C0062b.m298P0(viewInflate, R.id.btnProgressIgnore);
            if (imageButton != null) {
                i12 = R.id.btnProgressKnown;
                ImageButton imageButton2 = (ImageButton) C0062b.m298P0(viewInflate, R.id.btnProgressKnown);
                if (imageButton2 != null) {
                    i12 = R.id.btnProgressLearned;
                    TextView textView2 = (TextView) C0062b.m298P0(viewInflate, R.id.btnProgressLearned);
                    if (textView2 != null) {
                        i12 = R.id.btnProgressNew;
                        TextView textView3 = (TextView) C0062b.m298P0(viewInflate, R.id.btnProgressNew);
                        if (textView3 != null) {
                            i12 = R.id.btnProgressRecognized;
                            TextView textView4 = (TextView) C0062b.m298P0(viewInflate, R.id.btnProgressRecognized);
                            if (textView4 != null) {
                                i12 = R.id.tvProgressFamiliar;
                                if (((TextView) C0062b.m298P0(viewInflate, R.id.tvProgressFamiliar)) != null) {
                                    i12 = R.id.tvProgressIgnore;
                                    if (((TextView) C0062b.m298P0(viewInflate, R.id.tvProgressIgnore)) != null) {
                                        i12 = R.id.tvProgressKnown;
                                        if (((TextView) C0062b.m298P0(viewInflate, R.id.tvProgressKnown)) != null) {
                                            i12 = R.id.tvProgressLearned;
                                            if (((TextView) C0062b.m298P0(viewInflate, R.id.tvProgressLearned)) != null) {
                                                i12 = R.id.tvProgressNew;
                                                if (((TextView) C0062b.m298P0(viewInflate, R.id.tvProgressNew)) != null) {
                                                    i12 = R.id.tvProgressRecognized;
                                                    if (((TextView) C0062b.m298P0(viewInflate, R.id.tvProgressRecognized)) != null) {
                                                        CardView cardView = (CardView) viewInflate;
                                                        int i13 = R.id.viewProgressFamiliar;
                                                        LinearLayout linearLayout = (LinearLayout) C0062b.m298P0(viewInflate, R.id.viewProgressFamiliar);
                                                        if (linearLayout != null) {
                                                            i13 = R.id.viewProgressIgnore;
                                                            LinearLayout linearLayout2 = (LinearLayout) C0062b.m298P0(viewInflate, R.id.viewProgressIgnore);
                                                            if (linearLayout2 != null) {
                                                                LinearLayout linearLayout3 = (LinearLayout) C0062b.m298P0(viewInflate, R.id.viewProgressKnown);
                                                                if (linearLayout3 != null) {
                                                                    LinearLayout linearLayout4 = (LinearLayout) C0062b.m298P0(viewInflate, R.id.viewProgressLearned);
                                                                    if (linearLayout4 != null) {
                                                                        LinearLayout linearLayout5 = (LinearLayout) C0062b.m298P0(viewInflate, R.id.viewProgressNew);
                                                                        if (linearLayout5 != null) {
                                                                            LinearLayout linearLayout6 = (LinearLayout) C0062b.m298P0(viewInflate, R.id.viewProgressRecognized);
                                                                            if (linearLayout6 != null) {
                                                                                final int i14 = 1;
                                                                                final PopupWindow popupWindow = new PopupWindow((View) cardView, -2, -2, true);
                                                                                final int i15 = 0;
                                                                                linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: fk.n
                                                                                    @Override // android.view.View.OnClickListener
                                                                                    public final void onClick(View view2) {
                                                                                        int i16 = i15;
                                                                                        C5574p c5574p = this;
                                                                                        PopupWindow popupWindow2 = popupWindow;
                                                                                        switch (i16) {
                                                                                            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                                                                                C5207g.m11111f(popupWindow2, "$popupWindow");
                                                                                                C5207g.m11111f(c5574p, "this$0");
                                                                                                popupWindow2.dismiss();
                                                                                                c5574p.f34377a.mo528n(TokenStatusMenuItem.Ignore);
                                                                                                break;
                                                                                            default:
                                                                                                C5207g.m11111f(popupWindow2, "$popupWindow");
                                                                                                C5207g.m11111f(c5574p, "this$0");
                                                                                                popupWindow2.dismiss();
                                                                                                c5574p.f34377a.mo528n(TokenStatusMenuItem.Familiar);
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                });
                                                                                linearLayout3.setOnClickListener(new View.OnClickListener() { // from class: fk.o
                                                                                    @Override // android.view.View.OnClickListener
                                                                                    public final void onClick(View view2) {
                                                                                        int i16 = i15;
                                                                                        C5574p c5574p = this;
                                                                                        PopupWindow popupWindow2 = popupWindow;
                                                                                        switch (i16) {
                                                                                            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                                                                                C5207g.m11111f(popupWindow2, "$popupWindow");
                                                                                                C5207g.m11111f(c5574p, "this$0");
                                                                                                popupWindow2.dismiss();
                                                                                                c5574p.f34377a.mo528n(TokenStatusMenuItem.Known);
                                                                                                break;
                                                                                            default:
                                                                                                C5207g.m11111f(popupWindow2, "$popupWindow");
                                                                                                C5207g.m11111f(c5574p, "this$0");
                                                                                                popupWindow2.dismiss();
                                                                                                c5574p.f34377a.mo528n(TokenStatusMenuItem.Learned);
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                });
                                                                                linearLayout5.setOnClickListener(new ViewOnClickListenerC6464i(popupWindow, 22, this));
                                                                                linearLayout6.setOnClickListener(new ViewOnClickListenerC9466e(popupWindow, 21, this));
                                                                                linearLayout.setOnClickListener(new View.OnClickListener() { // from class: fk.n
                                                                                    @Override // android.view.View.OnClickListener
                                                                                    public final void onClick(View view2) {
                                                                                        int i16 = i14;
                                                                                        C5574p c5574p = this;
                                                                                        PopupWindow popupWindow2 = popupWindow;
                                                                                        switch (i16) {
                                                                                            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                                                                                C5207g.m11111f(popupWindow2, "$popupWindow");
                                                                                                C5207g.m11111f(c5574p, "this$0");
                                                                                                popupWindow2.dismiss();
                                                                                                c5574p.f34377a.mo528n(TokenStatusMenuItem.Ignore);
                                                                                                break;
                                                                                            default:
                                                                                                C5207g.m11111f(popupWindow2, "$popupWindow");
                                                                                                C5207g.m11111f(c5574p, "this$0");
                                                                                                popupWindow2.dismiss();
                                                                                                c5574p.f34377a.mo528n(TokenStatusMenuItem.Familiar);
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                });
                                                                                linearLayout4.setOnClickListener(new View.OnClickListener() { // from class: fk.o
                                                                                    @Override // android.view.View.OnClickListener
                                                                                    public final void onClick(View view2) {
                                                                                        int i16 = i14;
                                                                                        C5574p c5574p = this;
                                                                                        PopupWindow popupWindow2 = popupWindow;
                                                                                        switch (i16) {
                                                                                            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                                                                                C5207g.m11111f(popupWindow2, "$popupWindow");
                                                                                                C5207g.m11111f(c5574p, "this$0");
                                                                                                popupWindow2.dismiss();
                                                                                                c5574p.f34377a.mo528n(TokenStatusMenuItem.Known);
                                                                                                break;
                                                                                            default:
                                                                                                C5207g.m11111f(popupWindow2, "$popupWindow");
                                                                                                C5207g.m11111f(c5574p, "this$0");
                                                                                                popupWindow2.dismiss();
                                                                                                c5574p.f34377a.mo528n(TokenStatusMenuItem.Learned);
                                                                                                break;
                                                                                        }
                                                                                    }
                                                                                });
                                                                                List<Integer> list = C6716m.f37937a;
                                                                                Context context = view.getContext();
                                                                                C5207g.m11110e(context, "anchor.context");
                                                                                CardStatus cardStatus = CardStatus.Ignored;
                                                                                C6716m.m13323h(context, cardStatus.getValue(), imageButton);
                                                                                Context context2 = view.getContext();
                                                                                C5207g.m11110e(context2, "anchor.context");
                                                                                C6716m.m13323h(context2, CardStatus.Known.getValue(), imageButton2);
                                                                                Context context3 = view.getContext();
                                                                                C5207g.m11110e(context3, "anchor.context");
                                                                                C4924a.m10455d0(textView3, C6716m.m13333r(R.attr.yellowWordColor, context3));
                                                                                Context context4 = view.getContext();
                                                                                C5207g.m11110e(context4, "anchor.context");
                                                                                C4924a.m10455d0(textView4, C6716m.m13333r(R.attr.yellowWordStatus2Color, context4));
                                                                                Context context5 = view.getContext();
                                                                                C5207g.m11110e(context5, "anchor.context");
                                                                                C4924a.m10455d0(textView, C6716m.m13333r(R.attr.yellowWordStatus3Color, context5));
                                                                                Context context6 = view.getContext();
                                                                                C5207g.m11110e(context6, "anchor.context");
                                                                                C4924a.m10455d0(textView2, C6716m.m13333r(R.attr.loadingColor, context6));
                                                                                Context context7 = view.getContext();
                                                                                C5207g.m11110e(context7, "anchor.context");
                                                                                C4924a.m10455d0(imageButton, C6716m.m13333r(R.attr.loadingColor, context7));
                                                                                Context context8 = view.getContext();
                                                                                C5207g.m11110e(context8, "anchor.context");
                                                                                C4924a.m10455d0(imageButton2, C6716m.m13333r(R.attr.loadingColor, context8));
                                                                                if (i10 == CardStatus.New.getValue()) {
                                                                                    textView3.setActivated(true);
                                                                                    textView4.setActivated(false);
                                                                                    textView.setActivated(false);
                                                                                    textView2.setActivated(false);
                                                                                    imageButton2.setActivated(false);
                                                                                    imageButton.setActivated(false);
                                                                                } else if (i10 == CardStatus.Recognized.getValue()) {
                                                                                    textView4.setActivated(true);
                                                                                    textView3.setActivated(false);
                                                                                    textView.setActivated(false);
                                                                                    textView2.setActivated(false);
                                                                                    imageButton2.setActivated(false);
                                                                                    imageButton.setActivated(false);
                                                                                } else if (i10 == CardStatus.Familiar.getValue()) {
                                                                                    textView.setActivated(true);
                                                                                    textView4.setActivated(false);
                                                                                    textView3.setActivated(false);
                                                                                    textView2.setActivated(false);
                                                                                    imageButton2.setActivated(false);
                                                                                    imageButton.setActivated(false);
                                                                                } else {
                                                                                    CardStatus cardStatus2 = CardStatus.Learned;
                                                                                    if (i10 == cardStatus2.getValue() && num != null) {
                                                                                        if (num.intValue() == CardExtendedStatus.Known.getValue()) {
                                                                                            imageButton2.setActivated(true);
                                                                                            textView4.setActivated(false);
                                                                                            textView.setActivated(false);
                                                                                            textView3.setActivated(false);
                                                                                            textView2.setActivated(false);
                                                                                            imageButton.setActivated(false);
                                                                                        } else if (i10 == cardStatus2.getValue()) {
                                                                                            textView2.setActivated(true);
                                                                                            textView4.setActivated(false);
                                                                                            textView.setActivated(false);
                                                                                            textView3.setActivated(false);
                                                                                            imageButton2.setActivated(false);
                                                                                            imageButton.setActivated(false);
                                                                                        } else if (i10 == cardStatus.getValue()) {
                                                                                            imageButton.setActivated(true);
                                                                                            textView4.setActivated(false);
                                                                                            textView.setActivated(false);
                                                                                            textView3.setActivated(false);
                                                                                            textView2.setActivated(false);
                                                                                            imageButton2.setActivated(false);
                                                                                        }
                                                                                    } else if (i10 == cardStatus2.getValue()) {
                                                                                        textView2.setActivated(true);
                                                                                        textView4.setActivated(false);
                                                                                        textView.setActivated(false);
                                                                                        textView3.setActivated(false);
                                                                                        imageButton2.setActivated(false);
                                                                                        imageButton.setActivated(false);
                                                                                    } else if (i10 == cardStatus.getValue()) {
                                                                                        imageButton.setActivated(true);
                                                                                        textView4.setActivated(false);
                                                                                        textView.setActivated(false);
                                                                                        textView3.setActivated(false);
                                                                                        textView2.setActivated(false);
                                                                                        imageButton2.setActivated(false);
                                                                                    }
                                                                                }
                                                                                int[] iArr = new int[2];
                                                                                view.getLocationInWindow(iArr);
                                                                                int i16 = iArr[1];
                                                                                int i17 = view.getContext().getResources().getDisplayMetrics().heightPixels;
                                                                                C7793a.m15503g(popupWindow);
                                                                                int height = popupWindow.getHeight() / 2;
                                                                                int i18 = i16 + height;
                                                                                int i19 = i17 - i18;
                                                                                int i20 = i16 - height;
                                                                                if (tokenControllerType == TokenControllerType.Lesson) {
                                                                                    if (i18 <= i17) {
                                                                                        popupWindow.showAsDropDown(view, -(view.getMeasuredHeight() / 2), -height);
                                                                                        return;
                                                                                    } else {
                                                                                        if (i20 >= 0) {
                                                                                            popupWindow.showAsDropDown(view, -(view.getMeasuredHeight() / 2), (-i18) + i19);
                                                                                            return;
                                                                                        }
                                                                                        popupWindow.showAsDropDown(view, -(view.getMeasuredHeight() / 2), Math.abs(i20) + (-i18));
                                                                                        return;
                                                                                    }
                                                                                }
                                                                                if (tokenControllerType == TokenControllerType.Vocabulary || tokenControllerType == TokenControllerType.Review) {
                                                                                    if (i18 <= i17) {
                                                                                        popupWindow.showAsDropDown(view, view.getMeasuredWidth(), 0);
                                                                                        return;
                                                                                    } else if (i20 < 0) {
                                                                                        popupWindow.showAsDropDown(view, view.getMeasuredWidth(), -i18);
                                                                                        return;
                                                                                    } else {
                                                                                        popupWindow.showAsDropDown(view, view.getMeasuredWidth(), -(view.getMeasuredHeight() + height));
                                                                                        return;
                                                                                    }
                                                                                }
                                                                                return;
                                                                            }
                                                                            i11 = R.id.viewProgressRecognized;
                                                                        } else {
                                                                            i11 = R.id.viewProgressNew;
                                                                        }
                                                                        i12 = i11;
                                                                    } else {
                                                                        i12 = R.id.viewProgressLearned;
                                                                    }
                                                                } else {
                                                                    i12 = R.id.viewProgressKnown;
                                                                }
                                                            } else {
                                                                i12 = i13;
                                                            }
                                                        } else {
                                                            i12 = i13;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i12)));
    }
}
